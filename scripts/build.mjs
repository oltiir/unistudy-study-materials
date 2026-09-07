// Walks the UniStudy tree and writes manifest.json for index.html.
// Titles + week sections come from each subject's README.md (Moodle mirror format):
//   - `relative/path.pdf` — Moodle title (1.2 MB)
//   - Some link (forum) — https://moodle...
// Anything not listed in a README falls back to its filename.
import { promises as fs } from 'node:fs';
import path from 'node:path';

const ROOT = path.resolve(new URL('..', import.meta.url).pathname);
const SKIP_DIRS = new Set(['.git', '.github', '.obsidian', '.stfolder', 'node_modules', 'scripts', 'shk2']);
const SKIP_EXT = new Set(['.mp4', '.mkv', '.mov']);

const FILE_LINE = /^- `([^`]+)` — (.+?) \((\d+(?:\.\d+)? [KMG]?B)\)\s*$/;
const LINK_LINE = /^- (.+?) \((\w+)\) — (https?:\/\/\S+)\s*$/;
const META_LINE = /^- (Semester|Generation|Moodle): (.+)$/;

async function walkFiles(dir) {
  const out = [];
  for (const ent of await fs.readdir(dir, { withFileTypes: true })) {
    if (ent.isDirectory()) {
      if (!SKIP_DIRS.has(ent.name)) out.push(...await walkFiles(path.join(dir, ent.name)));
    } else if (ent.isFile()) {
      if (ent.name === 'README.md' || SKIP_EXT.has(path.extname(ent.name).toLowerCase())) continue;
      out.push(path.join(dir, ent.name));
    }
  }
  return out;
}

async function parseReadme(subjectDir) {
  const meta = {}, byPath = new Map(), links = [], sections = [];
  let section = 'Materiale';
  let text;
  try { text = await fs.readFile(path.join(subjectDir, 'README.md'), 'utf8'); } catch { return { meta, byPath, links, sections }; }
  for (const raw of text.split('\n')) {
    const line = raw.trimEnd();
    if (line.startsWith('## ')) { section = line.slice(3).trim(); if (!sections.includes(section)) sections.push(section); continue; }
    let m;
    if ((m = META_LINE.exec(line))) { meta[m[1].toLowerCase()] = m[2].trim(); continue; }
    if ((m = FILE_LINE.exec(line))) { byPath.set(m[1], { title: m[2].trim(), section }); continue; }
    if ((m = LINK_LINE.exec(line))) { links.push({ title: m[1].trim(), kind: m[2], url: m[3], section }); }
  }
  return { meta, byPath, links, sections };
}

function groupRank(name) {
  const m = /^Semestri (\d+)/i.exec(name);
  if (m) return [0, -Number(m[1])];          // newest semester first
  if (/^Arkiva/i.test(name)) return [1, 0];
  return [2, 0];
}

const groups = [];
let totalFiles = 0, totalBytes = 0;

for (const g of await fs.readdir(ROOT, { withFileTypes: true })) {
  if (!g.isDirectory() || SKIP_DIRS.has(g.name)) continue;
  const gdir = path.join(ROOT, g.name);
  const subjects = [];
  for (const s of await fs.readdir(gdir, { withFileTypes: true })) {
    if (!s.isDirectory()) continue;
    const sdir = path.join(gdir, s.name);
    const { meta, byPath, links, sections } = await parseReadme(sdir);
    const files = [];
    for (const abs of await walkFiles(sdir)) {
      const rel = path.relative(sdir, abs);
      const st = await fs.stat(abs);
      const info = byPath.get(rel) || byPath.get(path.basename(rel));
      // week folders like "07 - Ligjërata 5" are their own section when the README has none
      const dirName = path.dirname(rel);
      const section = info?.section || (dirName === '.' ? 'Materiale' : dirName.replace(/^\d+ - /, ''));
      if (!sections.includes(section)) sections.push(section);
      files.push({
        path: path.relative(ROOT, abs).split(path.sep).join('/'),
        name: path.basename(rel),
        title: info?.title || path.basename(rel, path.extname(rel)),
        ext: path.extname(rel).slice(1).toLowerCase(),
        size: st.size,
        mtime: st.mtimeMs,
        section,
      });
      totalFiles++; totalBytes += st.size;
    }
    if (!files.length && !links.length) continue;
    files.sort((a, b) => sections.indexOf(a.section) - sections.indexOf(b.section) || a.name.localeCompare(b.name, 'sq'));
    subjects.push({
      name: s.name,
      path: path.relative(ROOT, sdir).split(path.sep).join('/'),
      moodle: meta.moodle || null,
      generation: meta.generation || null,
      sections,
      files,
      links,
      bytes: files.reduce((n, f) => n + f.size, 0),
    });
  }
  if (subjects.length) {
    subjects.sort((a, b) => a.name.localeCompare(b.name, 'sq'));
    groups.push({ name: g.name, subjects });
  }
}

groups.sort((a, b) => {
  const [ra, sa] = groupRank(a.name), [rb, sb] = groupRank(b.name);
  return ra - rb || sa - sb || a.name.localeCompare(b.name);
});

const manifest = { generated: new Date().toISOString(), totalFiles, totalBytes, groups };
await fs.writeFile(path.join(ROOT, 'manifest.json'), JSON.stringify(manifest));
console.log(`manifest.json: ${groups.length} groups, ${totalFiles} files, ${(totalBytes / 1048576).toFixed(1)} MB`);
