"use strict";

const TOPICS = [
  {
    id: "flowcharts", title: "Flowcharts", subtitle: "Ktheje një problem në hapa të qartë: input, inicializim, kusht, përditësim dhe output.",
    concepts: ["pseudokod", "cikle", "degëzim", "invariant"], lab: "flowcharts",
    challenges: [
      { id: "f1", title: "Trace i ciklit", prompt: "Sa është shuma e katrorëve të numrave tek nga 3 deri në 9?", answers: ["164"], hint: "Llogarit 3² + 5² + 7² + 9².", solution: "9 + 25 + 49 + 81 = 164." },
      { id: "f2", title: "Inicializimi", prompt: "Shkruaje vetëm inicializimin e accumulator-it për një prodhim.", answers: ["p=1", "product=1", "prodhimi=1"], hint: "Vlera neutrale e shumëzimit nuk është zero.", solution: "p = 1, sepse çdo numër i shumëzuar me 1 mbetet i pandryshuar." }
    ]
  },
  {
    id: "complexity", title: "Analiza e algoritmeve", subtitle: "Numëro punën, gjej termin dominues dhe dallo ciklet lineare, logaritmike e të futura.",
    concepts: ["Big-O", "Theta", "cikle", "term dominues"], lab: "complexity",
    challenges: [
      { id: "c1", title: "Dy cikle të futura", prompt: "Çfarë kompleksiteti ka një loop n × n?", answers: ["theta(n^2)", "o(n^2)", "n^2", "n2"], hint: "Ciklet e futura shumëzohen.", solution: "n · n = n², pra Θ(n²)." },
      { id: "c2", title: "Iterator që trefishohet", prompt: "Kompleksiteti i: for (i=1; i<n; i*=3)?", answers: ["theta(logn)", "o(logn)", "logn", "theta(log3n)", "o(log3n)"], hint: "Pas k hapash, i = 3ᵏ.", solution: "3ᵏ ≥ n ⇒ k ≥ log₃n, pra Θ(log n)." }
    ]
  },
  {
    id: "stacks", title: "Stacks & Queues", subtitle: "Eksperimento me LIFO, FIFO, postfix dhe circular queue pa i humbur pointerët.",
    concepts: ["LIFO", "FIFO", "postfix", "circular queue"], lab: "stacks",
    challenges: [
      { id: "s1", title: "Postfix", prompt: "Vlerëso: 9 2 3 * + 4 /", answers: ["3.75", "15/4"], hint: "Së pari 2·3, pastaj +9, në fund /4.", solution: "2·3=6; 9+6=15; 15/4=3.75." },
      { id: "s2", title: "Circular queue", prompt: "Kapaciteti 4: enq K,O,S; deq; enq O,V; deq; enq A. Shkruaje queue finale.", answers: ["s,o,v,a", "sova", "[s,o,v,a]"], hint: "dequeue heq K, pastaj O-në e parë.", solution: "Queue logjike finale është [S, O, V, A]." }
    ]
  },
  {
    id: "elementary-sorts", title: "Elementary Sorts", subtitle: "Shiko çdo swap të Selection, Insertion dhe Shellsort — jo vetëm rezultatin final.",
    concepts: ["selection", "insertion", "shellsort", "stable"], lab: "sorts",
    challenges: [
      { id: "e1", title: "Selection sort", prompt: "Sorto 9,4,7,2,6 dhe shkruaje array-n finale.", answers: ["2,4,6,7,9", "24679"], hint: "Në secilin iterim sill minimumin në fillim të suffix-it.", solution: "[2, 4, 6, 7, 9]." },
      { id: "e2", title: "Insertion sort", prompt: "Sa swaps bën insertion sort për A,L,G,O?", answers: ["1", "nje", "një"], hint: "Vetëm G duhet të kalojë para L.", solution: "Bëhet 1 swap: A,L,G,O → A,G,L,O." }
    ]
  },
  {
    id: "mergesort", title: "Mergesort", subtitle: "Ndaje problemin, sorto gjysmat dhe bashko gjithmonë dy pjesë tashmë të sortuara.",
    concepts: ["divide-and-conquer", "merge", "rekursion", "stable"], lab: "mergesort",
    challenges: [
      { id: "m1", title: "Merge", prompt: "Bashko [1,6,7,12] dhe [2,3,9,10].", answers: ["1,2,3,6,7,9,10,12", "1236791012"], hint: "Krahaso vetëm elementet në krye të dy pjesëve.", solution: "[1, 2, 3, 6, 7, 9, 10, 12]." },
      { id: "m2", title: "Kompleksiteti", prompt: "Cili është kompleksiteti worst-case i mergesort?", answers: ["theta(nlogn)", "o(nlogn)", "nlogn"], hint: "Ka log n nivele dhe n punë në secilin nivel.", solution: "Θ(n log n)." }
    ]
  },
  {
    id: "quicksort", title: "Quicksort", subtitle: "Lëvizi pointerët rreth pivotit dhe kupto pse 3-way është më i mirë me shumë duplikate.",
    concepts: ["pivot", "2-way", "3-way", "shuffle"], lab: "quicksort",
    challenges: [
      { id: "q1", title: "2-way partition", prompt: "Pas partition të [6,3,7,2,8,5,4], në cilin indeks 0-based përfundon pivot 6?", answers: ["4"], hint: "Gjendja pas partition është [5,3,4,2,6,8,7].", solution: "Pivot 6 përfundon në indeksin 4." },
      { id: "q2", title: "3-way partition", prompt: "Te [4,2,4,5,1,4,3], sa elemente hyjnë në zonën = pivot?", answers: ["3"], hint: "Numëro sa herë shfaqet 4.", solution: "Tre elemente janë të barabarta me pivotin 4." }
    ]
  },
  {
    id: "heap", title: "Priority Queues & Heapsort", subtitle: "Vizualizo complete tree, provo swim/sink dhe ruaj heap-order pas çdo operacioni.",
    concepts: ["max-heap", "swim", "sink", "heapsort"], lab: "heap",
    challenges: [
      { id: "h1", title: "Insert + swim", prompt: "Inserto 10 në [9,7,8,3,2,5,6]. Jep heap-in final.", answers: ["10,9,8,7,2,5,6,3", "109872563"], hint: "10 kalon mbi 3, pastaj 7, pastaj 9.", solution: "[10, 9, 8, 7, 2, 5, 6, 3]." },
      { id: "h2", title: "delMax + sink", prompt: "Bëj delMax në [15,11,13,7,9,4,8,2]. Jep heap-in e mbetur.", answers: ["13,11,8,7,9,4,2", "131187942"], hint: "2 shkon në root; sink zgjedh 13, pastaj 8.", solution: "Hiqet 15; heap-i final është [13,11,8,7,9,4,2]." }
    ]
  },
  {
    id: "symbol-tables", title: "Symbol Tables", subtitle: "Luaj me key-value, update, rank, floor dhe ceiling në një tabelë të renditur.",
    concepts: ["put/get", "rank", "floor", "ceiling"], lab: "symbolTables",
    challenges: [
      { id: "t1", title: "Rank", prompt: "Në [B,D,G,K,N,T], sa është rank(H)?", answers: ["3"], hint: "Numëro keys më të vegjël se H.", solution: "B, D dhe G janë më të vegjël; rank(H)=3." },
      { id: "t2", title: "Update", prompt: "Pas put për S,E,A,R,C,H,E, sa keys unikë ka tabela?", answers: ["6"], hint: "E-ja e dytë bën update.", solution: "Ka 6 keys unikë; E nuk duplikohet." }
    ]
  },
  {
    id: "bst", title: "Binary Search Trees", subtitle: "Ndërto pemën, kërko, gjej floor/ceiling dhe kontrollo traversals vizualisht.",
    concepts: ["insert", "traversals", "floor/ceiling", "delete"], lab: "bst",
    challenges: [
      { id: "b1", title: "Preorder", prompt: "BST nga 12,5,18,2,9,15,19,7,10. Shkruaje preorder.", answers: ["12,5,2,9,7,10,18,15,19", "12529710181519"], hint: "Root, Left, Right.", solution: "12, 5, 2, 9, 7, 10, 18, 15, 19." },
      { id: "b2", title: "Floor & ceiling", prompt: "Në të njëjtën BST, shkruaj floor(8), ceiling(8).", answers: ["7,9", "79"], hint: "7 është më i madhi nën 8; 9 më i vogli mbi 8.", solution: "floor(8)=7 dhe ceiling(8)=9." }
    ]
  },
  {
    id: "balanced", title: "2-3 Trees & Red-Black BST", subtitle: "Shiko si splits në 2-3 tree bëhen rotations dhe color flips në LLRB.",
    concepts: ["2-3 tree", "rotateLeft", "rotateRight", "flipColors"], lab: "balanced",
    challenges: [
      { id: "r1", title: "Split i root-it", prompt: "Pas insertimit 10,20,30 në 2-3 tree, cili key është root?", answers: ["20"], hint: "Key i mesëm ngrihet.", solution: "20 bëhet root; fëmijët janë 10 dhe 30." },
      { id: "r2", title: "LLRB", prompt: "Pas insertimit 15,41,32,10 në LLRB, cili key është root?", answers: ["32"], hint: "Rotacionet e sjellin key e mesëm lart.", solution: "Root është 32; linku i kuq final është nga 15 te 10." }
    ]
  },
  {
    id: "hash", title: "Hash Tables", subtitle: "Simulo collisions me chaining/probing dhe llogarit hash-in e stringjeve hap pas hapi.",
    concepts: ["Horner", "chaining", "probing", "double hashing"], lab: "hash",
    challenges: [
      { id: "x1", title: "Horner", prompt: "Për DOG, bazë 31 dhe M=13, cili është indeksi?", answers: ["8"], hint: "h = 31h + kodi i karakterit.", solution: "(((68)·31+79)·31+71) mod 13 = 8." },
      { id: "x2", title: "Linear probing", prompt: "M=13, f=2x+3. Pas keys 1,8,49,18,24,34, ku vendoset 34?", answers: ["7"], hint: "Hash-i 6 është i zënë nga 8; provo slotin vijues.", solution: "34 provon 6, pastaj vendoset në 7." }
    ]
  },
  {
    id: "applications", title: "Searching Applications", subtitle: "Ndërto inverted index dhe llogarit sparse dot product vetëm mbi elementet jo-zero.",
    concepts: ["Set", "FileIndex", "inverted index", "sparse vector"], lab: "applications",
    challenges: [
      { id: "a1", title: "FileIndex", prompt: "D1: algoritme stack queue; D2: tree algoritme hash; D3: queue hash queue. Në cilat dokumente është queue?", answers: ["d1,d3", "d1d3", "{d1,d3}"], hint: "Set-i nuk e përsërit D3 dy herë.", solution: "queue → {D1, D3}." },
      { id: "a2", title: "Sparse dot product", prompt: "Sparse {0:2,4:-1,7:3}; dense [5,2,0,0,4,1,9,2]. Sa është dot product?", answers: ["12"], hint: "2·5 + (-1)·4 + 3·2.", solution: "10 - 4 + 6 = 12." }
    ]
  }
];

const TOTAL_TASKS = TOPICS.reduce((sum, topic) => sum + topic.challenges.length, 0);
const STORAGE_KEY = "algoritmet-lab-progress-v1";
const $ = (selector, root = document) => root.querySelector(selector);
const $$ = (selector, root = document) => [...root.querySelectorAll(selector)];

const saved = JSON.parse(localStorage.getItem(STORAGE_KEY) || "{}");
const state = {
  topicIndex: Math.max(0, TOPICS.findIndex(t => `#${t.id}` === location.hash)),
  solved: new Set(Array.isArray(saved.solved) ? saved.solved : []),
  xp: Number(saved.xp) || 0
};
if (state.topicIndex < 0) state.topicIndex = 0;

function persist() {
  localStorage.setItem(STORAGE_KEY, JSON.stringify({ solved: [...state.solved], xp: state.xp }));
}

function normalize(value) {
  return String(value)
    .toLowerCase()
    .normalize("NFD").replace(/[\u0300-\u036f]/g, "")
    .replace(/θ/g, "theta")
    .replace(/\*\*/g, "^")
    .replace(/[\s\[\]{}()]/g, "")
    .replace(/;/g, ",");
}

function parseNumbers(value) {
  const numbers = String(value).match(/-?\d+(?:\.\d+)?/g);
  return numbers ? numbers.map(Number) : [];
}

function escapeHTML(value) {
  return String(value).replace(/[&<>'"]/g, ch => ({ "&": "&amp;", "<": "&lt;", ">": "&gt;", "'": "&#39;", '"': "&quot;" }[ch]));
}

function setLabStatus(text, success = false) {
  const el = $("#lab-status");
  el.textContent = text;
  el.style.color = success ? "var(--success)" : "";
  el.style.borderColor = success ? "rgba(74,210,149,.35)" : "";
}

function toast(message) {
  const el = $("#toast");
  el.textContent = message;
  el.classList.add("show");
  clearTimeout(toast.timer);
  toast.timer = setTimeout(() => el.classList.remove("show"), 2200);
}

function celebrate() {
  const layer = $("#confetti-layer");
  const colors = ["#7c6cff", "#55d6be", "#ffc857", "#ff6f91"];
  for (let i = 0; i < 24; i++) {
    const bit = document.createElement("i");
    bit.className = "confetti";
    bit.style.left = `${10 + Math.random() * 80}%`;
    bit.style.background = colors[i % colors.length];
    bit.style.setProperty("--drift", `${-90 + Math.random() * 180}px`);
    bit.style.animationDelay = `${Math.random() * .2}s`;
    layer.appendChild(bit);
    setTimeout(() => bit.remove(), 1800);
  }
}

function updateProgress() {
  const solved = state.solved.size;
  const percent = Math.round((solved / TOTAL_TASKS) * 100);
  $("#xp-value").textContent = state.xp;
  $("#progress-label").textContent = `${solved} nga ${TOTAL_TASKS} detyra`;
  $("#progress-percent").textContent = `${percent}%`;
  $("#progress-fill").style.width = `${percent}%`;
  $("#progress-track").setAttribute("aria-valuenow", percent);
  $$(".topic-nav-button").forEach((button, index) => {
    const done = TOPICS[index].challenges.every(ch => state.solved.has(ch.id));
    button.classList.toggle("done", done);
  });
}

function renderNavigation() {
  const nav = $("#topic-nav");
  nav.innerHTML = TOPICS.map((topic, index) => `
    <button class="topic-nav-button ${index === state.topicIndex ? "active" : ""}" type="button" data-topic-index="${index}">
      <span class="nav-number">${String(index + 1).padStart(2, "0")}</span>
      <span>${topic.title}</span>
      <span class="nav-check" aria-label="Tema e përfunduar">✓</span>
    </button>`).join("");
  $$(".topic-nav-button", nav).forEach(button => button.addEventListener("click", () => goToTopic(Number(button.dataset.topicIndex))));
}

function goToTopic(index, scroll = true) {
  state.topicIndex = (index + TOPICS.length) % TOPICS.length;
  location.hash = TOPICS[state.topicIndex].id;
  renderTopic();
  if (scroll) window.scrollTo({ top: 0, behavior: "smooth" });
}

function renderTopic() {
  const topic = TOPICS[state.topicIndex];
  $("#topic-kicker").textContent = `Tema ${String(state.topicIndex + 1).padStart(2, "0")}`;
  $("#topic-title").textContent = topic.title;
  $("#topic-subtitle").textContent = topic.subtitle;
  $("#concept-list").innerHTML = topic.concepts.map(c => `<span class="concept-chip">${escapeHTML(c)}</span>`).join("");
  $("#lab-title").textContent = LAB_TITLES[topic.lab];
  $("#lab-root").innerHTML = "";
  setLabStatus("Interaktiv");
  LABS[topic.lab]($("#lab-root"));
  renderChallenges(topic);
  renderNavigation();
  updateProgress();
  $("#previous-topic").disabled = state.topicIndex === 0;
  $("#next-topic").textContent = state.topicIndex === TOPICS.length - 1 ? "Kthehu te fillimi ↻" : "Tema tjetër →";
}

function isAnswerCorrect(challenge, value) {
  if (challenge.validate) return challenge.validate(value);
  const candidate = normalize(value);
  return challenge.answers.some(answer => normalize(answer) === candidate);
}

function solveChallenge(challenge, card) {
  if (!state.solved.has(challenge.id)) {
    state.solved.add(challenge.id);
    state.xp += 10;
    persist();
    celebrate();
    toast("Saktë! +10 XP");
  }
  card.classList.add("solved");
  $(".mini-pill", card).textContent = "✓ E zgjidhur";
  updateProgress();
}

function renderChallenges(topic) {
  const list = $("#challenge-list");
  list.innerHTML = topic.challenges.map((ch, index) => {
    const solved = state.solved.has(ch.id);
    return `<article class="challenge-card ${solved ? "solved" : ""}" data-challenge-id="${ch.id}">
      <div class="challenge-top">
        <div class="challenge-number">${index + 1}</div>
        <div class="challenge-copy"><h3>${escapeHTML(ch.title)}</h3><p>${escapeHTML(ch.prompt)}</p></div>
        <span class="mini-pill">${solved ? "✓ E zgjidhur" : "+10 XP"}</span>
      </div>
      <div class="challenge-body">
        <div class="challenge-input-row">
          <input type="text" aria-label="Përgjigjja për ${escapeHTML(ch.title)}" placeholder="Shkruaje përgjigjen..." autocomplete="off">
          <button class="button check-answer" type="button">Kontrollo</button>
        </div>
        <div class="challenge-feedback" aria-live="polite"></div>
        <div class="challenge-tools">
          <button class="text-button show-hint" type="button">💡 Hint</button>
          <button class="text-button show-solution" type="button">👁 Shfaq zgjidhjen</button>
        </div>
        <div class="hint-box" hidden>${escapeHTML(ch.hint)}</div>
        <div class="solution-box" hidden>${escapeHTML(ch.solution)}</div>
      </div>
    </article>`;
  }).join("");

  topic.challenges.forEach(ch => {
    const card = $(`[data-challenge-id="${ch.id}"]`, list);
    const input = $("input", card);
    const feedback = $(".challenge-feedback", card);
    const check = () => {
      if (!input.value.trim()) {
        feedback.textContent = "Shkruaje një përgjigje së pari.";
        feedback.className = "challenge-feedback wrong";
        return;
      }
      if (isAnswerCorrect(ch, input.value)) {
        feedback.textContent = "Saktë — vazhdo kështu!";
        feedback.className = "challenge-feedback correct";
        solveChallenge(ch, card);
      } else {
        feedback.textContent = "Jo ende. Provo përsëri ose hape hint-in.";
        feedback.className = "challenge-feedback wrong";
      }
    };
    $(".check-answer", card).addEventListener("click", check);
    input.addEventListener("keydown", event => { if (event.key === "Enter") check(); });
    input.addEventListener("input", () => {
      if (input.value.trim().length >= 1 && isAnswerCorrect(ch, input.value)) check();
      else if (feedback.textContent) { feedback.textContent = ""; feedback.className = "challenge-feedback"; }
    });
    $(".show-hint", card).addEventListener("click", event => {
      const box = $(".hint-box", card); box.hidden = !box.hidden;
      event.currentTarget.textContent = box.hidden ? "💡 Hint" : "Fshehe hint-in";
    });
    $(".show-solution", card).addEventListener("click", event => {
      const box = $(".solution-box", card); box.hidden = !box.hidden;
      event.currentTarget.textContent = box.hidden ? "👁 Shfaq zgjidhjen" : "Fshehe zgjidhjen";
    });
  });
}

function renderCells(container, values, classes = {}) {
  container.innerHTML = values.map((value, index) => `<span class="cell ${classes[index] || ""}" data-index="${index}">${escapeHTML(value)}</span>`).join("");
}

function renderStepper(root, steps, extraRender) {
  let index = 0;
  const view = $(".array-view", root);
  const message = $(".step-message", root);
  const count = $(".step-count", root);
  const draw = () => {
    const step = steps[index];
    const classes = {};
    (step.active || []).forEach(i => classes[i] = "active");
    (step.primary || []).forEach(i => classes[i] = "primary");
    (step.success || []).forEach(i => classes[i] = "success");
    renderCells(view, step.array, classes);
    message.textContent = step.message;
    count.textContent = `${index + 1}/${steps.length}`;
    $(".step-prev", root).disabled = index === 0;
    $(".step-next", root).disabled = index === steps.length - 1;
    if (extraRender) extraRender(step, index);
    if (index === steps.length - 1) setLabStatus("Trace përfundoi ✓", true);
  };
  $(".step-prev", root).onclick = () => { index = Math.max(0, index - 1); draw(); };
  $(".step-next", root).onclick = () => { index = Math.min(steps.length - 1, index + 1); draw(); };
  $(".step-reset", root).onclick = () => { index = 0; draw(); };
  draw();
}

const LAB_TITLES = {
  flowcharts: "Shkruaj algoritmin dhe merre feedback-un",
  complexity: "Ndrysho n dhe analizo numrin e operacioneve",
  stacks: "Postfix evaluator & circular queue",
  sorts: "Sorting visualizer",
  mergesort: "Mergesort hap pas hapi",
  quicksort: "2-way dhe 3-way partition",
  heap: "Heap playground",
  symbolTables: "Ordered symbol table",
  bst: "BST builder & traversals",
  balanced: "LLRB insertion visualizer",
  hash: "Hash table simulator",
  applications: "FileIndex & sparse vectors"
};

const LABS = {};

LABS.flowcharts = root => {
  root.innerHTML = `<div class="lab-grid">
    <div class="lab-column">
      <div class="subpanel"><div class="subpanel-title">Detyra</div>
        <p>Shkruaj pseudokod që llogarit shumën e kubeve të numrave çift nga 2 deri në <code>n</code>.</p>
        <label for="flow-code">Pseudokodi yt</label>
        <textarea id="flow-code" spellcheck="false" placeholder="Lexo n\nS = ...\ni = ...\nderisa ..."></textarea>
        <div class="button-row"><button class="button ghost" id="flow-hint" type="button">Jep një hint</button><button class="button" id="flow-solution" type="button">Shfaq modelin</button></div>
      </div>
    </div>
    <div class="lab-column">
      <div class="subpanel"><div class="subpanel-title">Kontrolli live</div><p class="muted small">Nuk kërkohet sintaksë fikse; kontrollohen pesë idetë kryesore.</p><ul class="check-list" id="flow-checks"></ul></div>
      <pre id="flow-model" hidden>Lexo n
S = 0
i = 2
derisa i &lt;= n:
    S = S + i*i*i
    i = i + 2
Shfaq S</pre>
    </div>
  </div>`;
  const textarea = $("#flow-code", root);
  const checks = [
    ["Lexon input-in n", code => /lexo\s+n|input\s*\(?n/i.test(code)],
    ["Inicializon shumën me 0", code => /(?:s|shuma)\s*=\s*0/i.test(code)],
    ["Fillon iteratorin me 2", code => /i\s*=\s*2/i.test(code)],
    ["Përdor kushtin i ≤ n", code => /i\s*(?:<=|≤)\s*n/i.test(code)],
    ["Shton kubin dhe rrit i me 2", code => /i\s*\*\s*i\s*\*\s*i|i\s*\^\s*3|i³/i.test(code) && /i\s*=\s*i\s*\+\s*2|i\s*\+=\s*2/i.test(code)]
  ];
  const validate = () => {
    const code = textarea.value;
    let passed = 0;
    $("#flow-checks", root).innerHTML = checks.map(([label, test]) => {
      const ok = test(code); if (ok) passed++;
      return `<li class="${ok ? "pass" : "miss"}">${ok ? "✓" : "○"} ${label}</li>`;
    }).join("");
    setLabStatus(passed === checks.length ? "Algoritmi është gati ✓" : `${passed}/${checks.length} kushte`, passed === checks.length);
  };
  textarea.addEventListener("input", validate);
  $("#flow-hint", root).onclick = () => toast("Shuma nis me 0; iteratori çift nis me 2 dhe rritet me 2.");
  $("#flow-solution", root).onclick = event => {
    const model = $("#flow-model", root); model.hidden = !model.hidden;
    event.currentTarget.textContent = model.hidden ? "Shfaq modelin" : "Fshehe modelin";
  };
  validate();
};

LABS.complexity = root => {
  root.innerHTML = `<div class="lab-grid">
    <div class="subpanel"><pre>for (i = 1; i &lt;= n; i++)
    for (j = 1; j &lt;= i; j++) work();

for (k = 1; k &lt; n; k *= 2) work();</pre>
      <div class="control-row" style="margin-top:1rem"><div class="field"><label for="complexity-n">Vlera n: <strong id="n-value">16</strong></label><input id="complexity-n" type="range" min="2" max="100" value="16"></div></div>
      <label for="complexity-answer">Kompleksiteti total</label><input id="complexity-answer" placeholder="p.sh. Theta(n^2)">
      <div class="result-box" id="complexity-feedback">Ndrysho n dhe shiko si rritet puna.</div>
    </div>
    <div class="subpanel"><div class="subpanel-title">Numërimi real</div>
      <div class="hash-grid">
        <div class="hash-slot"><span class="hash-index">cikli trekëndësh</span><strong class="hash-value" id="tri-work"></strong></div>
        <div class="hash-slot"><span class="hash-index">cikli logaritmik</span><strong class="hash-value" id="log-work"></strong></div>
        <div class="hash-slot"><span class="hash-index">total work()</span><strong class="hash-value" id="total-work"></strong></div>
      </div>
      <div class="result-box" id="growth-explain"></div>
    </div>
  </div>`;
  const update = () => {
    const n = Number($("#complexity-n", root).value);
    const tri = n * (n + 1) / 2;
    const log = Math.ceil(Math.log2(n));
    $("#n-value", root).textContent = n;
    $("#tri-work", root).textContent = tri;
    $("#log-work", root).textContent = log;
    $("#total-work", root).textContent = tri + log;
    $("#growth-explain", root).textContent = `${n}(${n}+1)/2 = ${tri} dominon ndaj ${log}; termi n² fiton për n të madh.`;
  };
  const check = () => {
    const val = normalize($("#complexity-answer", root).value);
    const ok = ["theta(n^2)", "o(n^2)", "n^2", "n2"].map(normalize).includes(val);
    const feedback = $("#complexity-feedback", root);
    feedback.textContent = !val ? "Shkruaje analizën tënde." : ok ? "Saktë: Θ(n²) + Θ(log n) = Θ(n²)." : "Jo ende: analizo dy pjesët veçmas, pastaj mbaj termin dominues.";
    feedback.className = `result-box ${val ? (ok ? "success" : "error") : ""}`;
    if (ok) setLabStatus("Analiza e saktë ✓", true);
  };
  $("#complexity-n", root).addEventListener("input", update);
  $("#complexity-answer", root).addEventListener("input", check);
  update();
};

function postfixSteps(expression) {
  const tokens = expression.trim().split(/\s+/).filter(Boolean);
  const stack = [];
  const steps = [{ token: "—", stack: [], message: "Stack-u nis i zbrazët." }];
  for (const token of tokens) {
    if (/^-?\d+(?:\.\d+)?$/.test(token)) {
      stack.push(Number(token));
      steps.push({ token, stack: [...stack], message: `Operand ${token}: push.` });
    } else if (["+", "-", "*", "/"].includes(token)) {
      if (stack.length < 2) throw new Error(`Operatori ${token} nuk ka dy operandë.`);
      const right = stack.pop(); const left = stack.pop();
      const result = token === "+" ? left + right : token === "-" ? left - right : token === "*" ? left * right : left / right;
      stack.push(result);
      steps.push({ token, stack: [...stack], message: `${left} ${token} ${right} = ${result}; push rezultatin.` });
    } else throw new Error(`Token i panjohur: ${token}`);
  }
  if (stack.length !== 1) throw new Error("Shprehja duhet të lërë saktësisht një rezultat.");
  return steps;
}

LABS.stacks = root => {
  root.innerHTML = `<div class="lab-grid">
    <div class="subpanel"><div class="subpanel-title">Postfix evaluator</div>
      <div class="control-row"><div class="field"><label for="postfix-input">Shprehja</label><input id="postfix-input" value="8 3 + 2 * 6 -"></div><button class="button primary" id="postfix-run" type="button">Ekzekuto</button></div>
      <div class="stack-view" id="postfix-stack"></div><div class="step-message" id="postfix-message"></div>
      <div class="step-controls"><button class="button ghost" id="postfix-prev">←</button><button class="button" id="postfix-next">Hapi tjetër</button><span class="step-count" id="postfix-count"></span></div>
    </div>
    <div class="subpanel"><div class="subpanel-title">Circular queue — kapacitet 4</div>
      <div class="control-row"><div class="field"><label for="queue-value">Vlera</label><input id="queue-value" maxlength="8" value="A"></div><button class="button primary" id="enqueue">enqueue</button><button class="button" id="dequeue">dequeue</button><button class="button ghost" id="queue-reset">Reset</button></div>
      <div class="queue-view" id="queue-view"></div><div class="result-box" id="queue-status"></div>
    </div>
  </div>`;
  let pSteps = [], pIndex = 0;
  const drawPostfix = () => {
    const step = pSteps[pIndex];
    $("#postfix-stack", root).innerHTML = step.stack.map(v => `<span class="cell">${v}</span>`).join("") || `<span class="muted">stack bosh</span>`;
    $("#postfix-message", root).textContent = step.message;
    $("#postfix-count", root).textContent = `${pIndex + 1}/${pSteps.length}`;
    $("#postfix-prev", root).disabled = pIndex === 0;
    $("#postfix-next", root).disabled = pIndex === pSteps.length - 1;
    if (pIndex === pSteps.length - 1) setLabStatus(`Rezultati: ${step.stack[0]} ✓`, true);
  };
  const run = () => {
    try { pSteps = postfixSteps($("#postfix-input", root).value); pIndex = 0; drawPostfix(); }
    catch (error) { $("#postfix-message", root).textContent = error.message; setLabStatus("Gabim në shprehje"); }
  };
  $("#postfix-run", root).onclick = run;
  $("#postfix-prev", root).onclick = () => { pIndex = Math.max(0, pIndex - 1); drawPostfix(); };
  $("#postfix-next", root).onclick = () => { pIndex = Math.min(pSteps.length - 1, pIndex + 1); drawPostfix(); };
  run();

  const queue = { a: Array(4).fill(null), head: 0, tail: 0, size: 0 };
  const drawQueue = message => {
    $("#queue-view", root).innerHTML = queue.a.map((value, index) => `<span class="cell queue-slot ${value !== null ? "filled" : ""} ${index === queue.head && queue.size ? "success" : ""}" data-index="${index}">${value ?? "·"}</span>`).join("");
    const logical = Array.from({length: queue.size}, (_, i) => queue.a[(queue.head + i) % 4]);
    $("#queue-status", root).textContent = `${message} head=${queue.head}, tail=${queue.tail}, size=${queue.size}; queue=[${logical.join(", ")}]`;
  };
  $("#enqueue", root).onclick = () => {
    const value = $("#queue-value", root).value.trim();
    if (!value) return drawQueue("Shkruaj një vlerë.");
    if (queue.size === 4) return drawQueue("Queue është plot.");
    queue.a[queue.tail] = value; queue.tail = (queue.tail + 1) % 4; queue.size++;
    drawQueue(`U shtua ${value}.`);
  };
  $("#dequeue", root).onclick = () => {
    if (!queue.size) return drawQueue("Queue është bosh.");
    const removed = queue.a[queue.head]; queue.a[queue.head] = null; queue.head = (queue.head + 1) % 4; queue.size--;
    drawQueue(`Doli ${removed}.`);
  };
  $("#queue-reset", root).onclick = () => { queue.a.fill(null); queue.head = queue.tail = queue.size = 0; drawQueue("U rivendos."); };
  drawQueue("Nisja.");
};

function selectionSteps(values) {
  const a = [...values]; const steps = [{ array: [...a], message: "Array fillestare." }];
  for (let i = 0; i < a.length - 1; i++) {
    let min = i;
    for (let j = i + 1; j < a.length; j++) if (a[j] < a[min]) min = j;
    [a[i], a[min]] = [a[min], a[i]];
    steps.push({ array: [...a], active: [i, min], success: [...Array(i + 1).keys()], message: `i=${i}: minimumi ${a[i]} kalon në pozitën ${i}.` });
  }
  return steps;
}

function insertionSteps(values) {
  const a = [...values]; const steps = [{ array: [...a], message: "Array fillestare; prefix-i me 1 element është i sortuar." }];
  for (let i = 1; i < a.length; i++) {
    let moved = false;
    for (let j = i; j > 0 && a[j] < a[j - 1]; j--) {
      [a[j], a[j - 1]] = [a[j - 1], a[j]]; moved = true;
      steps.push({ array: [...a], active: [j - 1, j], success: [...Array(i + 1).keys()], message: `Swap ${a[j]} dhe ${a[j - 1]}: elementi lëviz majtas.` });
    }
    if (!moved) steps.push({ array: [...a], success: [...Array(i + 1).keys()], message: `i=${i}: elementi është tashmë në vend.` });
  }
  return steps;
}

function shellSteps(values) {
  const a = [...values]; const steps = [{ array: [...a], message: "Array fillestare." }];
  let h = 1; while (h < a.length / 3) h = 3 * h + 1;
  while (h >= 1) {
    steps.push({ array: [...a], message: `Faza h=${h}: krahasohen elemente ${h} pozita larg.` });
    for (let i = h; i < a.length; i++) {
      for (let j = i; j >= h && a[j] < a[j - h]; j -= h) {
        [a[j], a[j - h]] = [a[j - h], a[j]];
        steps.push({ array: [...a], active: [j, j - h], message: `h=${h}: swap indekset ${j} dhe ${j - h}.` });
      }
    }
    h = Math.floor(h / 3);
  }
  steps.push({ array: [...a], success: a.map((_, i) => i), message: "Array është plotësisht e sortuar." });
  return steps;
}

LABS.sorts = root => {
  root.innerHTML = `<div class="control-row"><div class="field"><label for="sort-values">Numrat</label><input id="sort-values" value="9,4,7,2,6"></div><div class="field compact"><label for="sort-algorithm">Algoritmi</label><select id="sort-algorithm"><option value="selection">Selection</option><option value="insertion">Insertion</option><option value="shell">Shellsort</option></select></div><button class="button primary" id="sort-start">Krijo trace</button></div>
    <div class="subpanel"><div class="array-view"></div><div class="step-message"></div><div class="step-controls"><button class="button ghost step-prev">←</button><button class="button step-reset">Fillimi</button><button class="button primary step-next">Hapi tjetër →</button><span class="step-count"></span></div></div>`;
  const start = () => {
    const values = parseNumbers($("#sort-values", root).value);
    if (values.length < 2) return toast("Shkruaj së paku dy numra.");
    const algorithm = $("#sort-algorithm", root).value;
    const steps = algorithm === "selection" ? selectionSteps(values) : algorithm === "insertion" ? insertionSteps(values) : shellSteps(values);
    renderStepper(root, steps);
    setLabStatus(`${steps.length} hapa`);
  };
  $("#sort-start", root).onclick = start; start();
};

function mergeSortSteps(values) {
  const a = [...values]; const aux = Array(a.length); const steps = [{ array: [...a], message: "Array fillestare." }];
  function sort(lo, hi) {
    if (hi <= lo) return;
    const mid = lo + Math.floor((hi - lo) / 2);
    steps.push({ array: [...a], active: Array.from({length: hi - lo + 1}, (_, i) => lo + i), message: `Ndaje [${lo}..${hi}] në [${lo}..${mid}] dhe [${mid + 1}..${hi}].` });
    sort(lo, mid); sort(mid + 1, hi);
    for (let k = lo; k <= hi; k++) aux[k] = a[k];
    let i = lo, j = mid + 1;
    for (let k = lo; k <= hi; k++) {
      if (i > mid) a[k] = aux[j++];
      else if (j > hi) a[k] = aux[i++];
      else if (aux[j] < aux[i]) a[k] = aux[j++];
      else a[k] = aux[i++];
    }
    steps.push({ array: [...a], success: Array.from({length: hi - lo + 1}, (_, x) => lo + x), message: `Merge [${lo}..${mid}] + [${mid + 1}..${hi}] përfundoi.` });
  }
  sort(0, a.length - 1);
  return steps;
}

LABS.mergesort = root => {
  root.innerHTML = `<div class="control-row"><div class="field"><label for="merge-values">Array</label><input id="merge-values" value="8,3,7,4,9,2"></div><button class="button primary" id="merge-start">Ndaje dhe bashko</button></div>
    <div class="subpanel"><div class="array-view"></div><div class="step-message"></div><div class="step-controls"><button class="button ghost step-prev">←</button><button class="button step-reset">Fillimi</button><button class="button primary step-next">Hapi tjetër →</button><span class="step-count"></span></div></div>`;
  const start = () => {
    const values = parseNumbers($("#merge-values", root).value);
    if (values.length < 2) return toast("Shkruaj së paku dy numra.");
    const steps = mergeSortSteps(values); renderStepper(root, steps); setLabStatus(`${steps.length} hapa`);
  };
  $("#merge-start", root).onclick = start; start();
};

function quick2Steps(values) {
  const a = [...values], v = a[0]; let i = 1, j = a.length - 1;
  const steps = [{ array: [...a], primary: [0], message: `Pivot është ${v}. i nis në 1, j në ${j}.` }];
  while (true) {
    while (i < a.length && a[i] < v) i++;
    while (j > 0 && a[j] > v) j--;
    steps.push({ array: [...a], primary: [0], active: [i, j].filter(x => x >= 0 && x < a.length), message: `Skanimet ndalen: i=${i}, j=${j}.` });
    if (i >= j) break;
    [a[i], a[j]] = [a[j], a[i]];
    steps.push({ array: [...a], primary: [0], active: [i, j], message: `Swap indekset ${i} dhe ${j}.` });
    i++; j--;
  }
  [a[0], a[j]] = [a[j], a[0]];
  steps.push({ array: [...a], success: [j], message: `Pivot ${v} vendoset në indeksin final ${j}.` });
  return steps;
}

function quick3Steps(values) {
  const a = [...values], v = a[0]; let lt = 0, i = 1, gt = a.length - 1;
  const steps = [{ array: [...a], primary: [0], message: `Pivot v=${v}; lt=0, i=1, gt=${gt}.` }];
  while (i <= gt) {
    if (a[i] < v) {
      [a[lt], a[i]] = [a[i], a[lt]]; lt++; i++;
      steps.push({ array: [...a], active: [lt - 1], message: `< pivot: swap, pastaj lt=${lt}, i=${i}.` });
    } else if (a[i] > v) {
      [a[i], a[gt]] = [a[gt], a[i]]; gt--;
      steps.push({ array: [...a], active: [i, gt + 1], message: `> pivot: swap me gt; gt=${gt}, i mbetet ${i}.` });
    } else {
      i++;
      steps.push({ array: [...a], primary: [i - 1], message: `= pivot: vetëm i rritet në ${i}.` });
    }
  }
  steps.push({ array: [...a], success: Array.from({length: gt - lt + 1}, (_, x) => lt + x), message: `Zonat finale: < v | = v [${lt}..${gt}] | > v.` });
  return steps;
}

LABS.quicksort = root => {
  root.innerHTML = `<div class="control-row"><div class="field"><label for="quick-values">Array</label><input id="quick-values" value="6,3,7,2,8,5,4"></div><div class="field compact"><label for="quick-mode">Partition</label><select id="quick-mode"><option value="2">2-way</option><option value="3">3-way</option></select></div><button class="button primary" id="quick-start">Partition</button></div>
    <div class="subpanel"><div class="array-view"></div><div class="step-message"></div><div class="step-controls"><button class="button ghost step-prev">←</button><button class="button step-reset">Fillimi</button><button class="button primary step-next">Hapi tjetër →</button><span class="step-count"></span></div></div>`;
  const start = () => {
    const values = parseNumbers($("#quick-values", root).value);
    if (values.length < 2) return toast("Shkruaj së paku dy numra.");
    const steps = $("#quick-mode", root).value === "2" ? quick2Steps(values) : quick3Steps(values);
    renderStepper(root, steps); setLabStatus(`${steps.length} hapa`);
  };
  $("#quick-start", root).onclick = start;
  $("#quick-mode", root).onchange = () => {
    if ($("#quick-mode", root).value === "3") $("#quick-values", root).value = "4,2,4,5,1,4,3";
    else $("#quick-values", root).value = "6,3,7,2,8,5,4";
    start();
  };
  start();
};

function heapTreeMarkup(values) {
  if (!values.length) return `<p class="muted">Heap bosh.</p>`;
  const width = 760;
  const levels = Math.floor(Math.log2(values.length)) + 1;
  const height = Math.max(220, levels * 82);
  const points = values.map((value, index) => {
    const level = Math.floor(Math.log2(index + 1));
    const first = 2 ** level - 1;
    const position = index - first;
    const slots = 2 ** level;
    return { value, x: (position + .5) * width / slots, y: 38 + level * 76 };
  });
  const lines = points.slice(1).map((point, index) => {
    const childIndex = index + 1;
    const parent = points[Math.floor((childIndex - 1) / 2)];
    return `<line x1="${parent.x}" y1="${parent.y}" x2="${point.x}" y2="${point.y}"></line>`;
  }).join("");
  const nodes = points.map(point => `<g><circle cx="${point.x}" cy="${point.y}" r="23"></circle><text x="${point.x}" y="${point.y}">${point.value}</text></g>`).join("");
  return `<svg class="tree-svg" viewBox="0 0 ${width} ${height}" style="height:${height}px" role="img" aria-label="Paraqitja e heap-it si pemë">${lines}${nodes}</svg>`;
}

function heapInsertSteps(values, value) {
  const a = [...values, value]; let k = a.length - 1;
  const steps = [{ array: [...a], active: [k], message: `${value} shtohet në fund, indeksi ${k + 1} në 1-based.` }];
  while (k > 0) {
    const parent = Math.floor((k - 1) / 2);
    if (a[parent] >= a[k]) break;
    [a[parent], a[k]] = [a[k], a[parent]];
    steps.push({ array: [...a], active: [parent, k], message: `${a[parent]} > prindi ${a[k]}: swap dhe vazhdo swim.` });
    k = parent;
  }
  steps.push({ array: [...a], success: a.map((_, i) => i), message: "Heap-order është rikthyer." });
  return steps;
}

function heapDeleteSteps(values) {
  const a = [...values];
  if (!a.length) return [{ array: [], message: "Heap bosh." }];
  const max = a[0];
  a[0] = a[a.length - 1]; a.pop();
  const steps = [{ array: [...a], active: a.length ? [0] : [], message: `Hiqet max=${max}; elementi i fundit kalon në root.` }];
  let k = 0;
  while (2 * k + 1 < a.length) {
    let child = 2 * k + 1;
    if (child + 1 < a.length && a[child + 1] > a[child]) child++;
    if (a[k] >= a[child]) break;
    [a[k], a[child]] = [a[child], a[k]];
    steps.push({ array: [...a], active: [k, child], message: `Zgjidhet fëmija më i madh ${a[k]}; bëhet swap dhe sink.` });
    k = child;
  }
  steps.push({ array: [...a], success: a.map((_, i) => i), message: `delMax ktheu ${max}; heap-order është rikthyer.` });
  return steps;
}

LABS.heap = root => {
  root.innerHTML = `<div class="control-row"><div class="field"><label for="heap-values">Max-heap</label><input id="heap-values" value="9,7,8,3,2,5,6"></div><div class="field compact"><label for="heap-operation">Operacioni</label><select id="heap-operation"><option value="insert">insert</option><option value="delete">delMax</option></select></div><div class="field compact" id="heap-new-field"><label for="heap-new">Vlera e re</label><input id="heap-new" type="number" value="10"></div><button class="button primary" id="heap-start">Ekzekuto</button></div>
    <div class="lab-grid"><div class="subpanel"><div class="array-view"></div><div class="step-message"></div><div class="step-controls"><button class="button ghost step-prev">←</button><button class="button step-reset">Fillimi</button><button class="button primary step-next">Hapi tjetër →</button><span class="step-count"></span></div></div><div class="subpanel tree-wrap" id="heap-tree"></div></div>`;
  const start = () => {
    const values = parseNumbers($("#heap-values", root).value);
    if (!values.length) return toast("Shkruaj një heap.");
    const insert = $("#heap-operation", root).value === "insert";
    const steps = insert ? heapInsertSteps(values, Number($("#heap-new", root).value)) : heapDeleteSteps(values);
    renderStepper(root, steps, step => { $("#heap-tree", root).innerHTML = heapTreeMarkup(step.array); });
    setLabStatus(`${steps.length} hapa`);
  };
  $("#heap-start", root).onclick = start;
  $("#heap-operation", root).onchange = () => { $("#heap-new-field", root).hidden = $("#heap-operation", root).value === "delete"; start(); };
  start();
};

LABS.symbolTables = root => {
  root.innerHTML = `<div class="lab-grid"><div class="subpanel"><div class="subpanel-title">Ndërto tabelën</div>
    <div class="control-row"><div class="field"><label for="st-key">Key</label><input id="st-key" maxlength="12" value="S"></div><div class="field"><label for="st-value">Value</label><input id="st-value" value="0"></div><button class="button primary" id="st-put">put</button><button class="button" id="st-delete">delete</button><button class="button ghost" id="st-example">Shembulli</button></div>
    <div class="table-wrap"><table class="trace-table"><thead><tr><th>Rank</th><th>Key</th><th>Value</th></tr></thead><tbody id="st-table"></tbody></table></div></div>
    <div class="subpanel"><div class="subpanel-title">Ordered operations</div><label for="st-query">Query key</label><input id="st-query" value="Q"><div class="hash-grid"><div class="hash-slot"><span class="hash-index">get</span><strong class="hash-value" id="st-get">—</strong></div><div class="hash-slot"><span class="hash-index">rank</span><strong class="hash-value" id="st-rank">0</strong></div><div class="hash-slot"><span class="hash-index">floor</span><strong class="hash-value" id="st-floor">—</strong></div><div class="hash-slot"><span class="hash-index">ceiling</span><strong class="hash-value" id="st-ceiling">—</strong></div></div><div class="result-box" id="st-message">put ekzistues e ndryshon value; nuk krijon key të dytë.</div></div></div>`;
  const table = new Map();
  const sorted = () => [...table.keys()].sort((a, b) => a.localeCompare(b));
  const render = message => {
    const keys = sorted();
    $("#st-table", root).innerHTML = keys.map((key, rank) => `<tr><td>${rank}</td><td><code>${escapeHTML(key)}</code></td><td>${escapeHTML(table.get(key))}</td></tr>`).join("") || `<tr><td colspan="3" class="muted">Tabela është bosh.</td></tr>`;
    const query = $("#st-query", root).value.trim();
    let rank = 0; while (rank < keys.length && keys[rank].localeCompare(query) < 0) rank++;
    $("#st-get", root).textContent = table.has(query) ? table.get(query) : "null";
    $("#st-rank", root).textContent = rank;
    $("#st-floor", root).textContent = table.has(query) ? query : (keys[rank - 1] ?? "null");
    $("#st-ceiling", root).textContent = keys[rank] ?? "null";
    if (message) $("#st-message", root).textContent = message;
    setLabStatus(`${keys.length} keys`);
  };
  $("#st-put", root).onclick = () => {
    const key = $("#st-key", root).value.trim(); const value = $("#st-value", root).value;
    if (!key) return toast("Key nuk mund të jetë bosh.");
    const update = table.has(key); table.set(key, value); render(update ? `${key} u përditësua; size nuk ndryshoi.` : `${key} u shtua.`);
  };
  $("#st-delete", root).onclick = () => { const key = $("#st-key", root).value.trim(); table.delete(key); render(`${key} u fshi nëse ekzistonte.`); };
  $("#st-query", root).oninput = () => render();
  $("#st-example", root).onclick = () => {
    table.clear(); ["S","E","A","R","C","H","E"].forEach((key, index) => table.set(key, String(index)));
    render("E u has dy herë: value finale është 6, size është 6.");
  };
  $("#st-example", root).click();
};

class TreeNode {
  constructor(key, color = false) { this.key = key; this.left = null; this.right = null; this.color = color; }
}

function bstInsert(node, key) {
  if (!node) return new TreeNode(key);
  if (key < node.key) node.left = bstInsert(node.left, key);
  else if (key > node.key) node.right = bstInsert(node.right, key);
  return node;
}

function traversal(node, mode, output = []) {
  if (!node) return output;
  if (mode === "pre") output.push(node.key);
  traversal(node.left, mode, output);
  if (mode === "in") output.push(node.key);
  traversal(node.right, mode, output);
  if (mode === "post") output.push(node.key);
  return output;
}

function treePositions(root) {
  const nodes = []; let order = 0; let maxDepth = 0;
  function visit(node, depth, parent = null) {
    if (!node) return;
    visit(node.left, depth + 1, node);
    nodes.push({ node, depth, order: order++, parent }); maxDepth = Math.max(maxDepth, depth);
    visit(node.right, depth + 1, node);
  }
  visit(root, 0);
  const width = 820;
  const byNode = new Map(nodes.map(item => [item.node, { x: (item.order + 1) * width / (nodes.length + 1), y: 42 + item.depth * 78 }]));
  return { nodes, byNode, width, height: Math.max(230, (maxDepth + 1) * 84) };
}

function treeMarkup(root, colors = false) {
  if (!root) return `<p class="muted">Pema është bosh.</p>`;
  const { nodes, byNode, width, height } = treePositions(root);
  const lines = nodes.filter(item => item.parent).map(item => {
    const point = byNode.get(item.node), parent = byNode.get(item.parent);
    const klass = colors && item.node.color ? "red-link" : "";
    return `<line class="${klass}" x1="${parent.x}" y1="${parent.y}" x2="${point.x}" y2="${point.y}"></line>`;
  }).join("");
  const circles = nodes.map(item => {
    const point = byNode.get(item.node);
    const klass = colors ? (item.node.color ? "red-node" : "black-node") : "";
    return `<g><circle class="${klass}" cx="${point.x}" cy="${point.y}" r="23"></circle><text x="${point.x}" y="${point.y}">${item.node.key}</text></g>`;
  }).join("");
  return `<svg class="tree-svg" viewBox="0 0 ${width} ${height}" style="height:${height}px" role="img" aria-label="Pema binare">${lines}${circles}</svg>`;
}

function bstFloorCeiling(root, query) {
  let floor = null, ceiling = null, node = root;
  while (node) {
    if (query === node.key) return [node.key, node.key];
    if (query < node.key) { ceiling = node.key; node = node.left; }
    else { floor = node.key; node = node.right; }
  }
  return [floor, ceiling];
}

LABS.bst = root => {
  root.innerHTML = `<div class="control-row"><div class="field"><label for="bst-values">Rendi i insertimit</label><input id="bst-values" value="8,3,10,1,6,14,4,7,13"></div><button class="button primary" id="bst-build">Ndërto BST</button><div class="field compact"><label for="bst-query">Query</label><input id="bst-query" type="number" value="5"></div></div>
    <div class="subpanel tree-wrap" id="bst-tree"></div>
    <div class="hash-grid"><div class="hash-slot"><span class="hash-index">inorder</span><strong class="hash-value" id="bst-in"></strong></div><div class="hash-slot"><span class="hash-index">preorder</span><strong class="hash-value" id="bst-pre"></strong></div><div class="hash-slot"><span class="hash-index">postorder</span><strong class="hash-value" id="bst-post"></strong></div><div class="hash-slot"><span class="hash-index">floor / ceiling</span><strong class="hash-value" id="bst-fc"></strong></div></div>`;
  let tree = null;
  const build = () => {
    tree = null; const values = parseNumbers($("#bst-values", root).value);
    values.forEach(key => tree = bstInsert(tree, key));
    $("#bst-tree", root).innerHTML = treeMarkup(tree);
    $("#bst-in", root).textContent = traversal(tree, "in", []).join(", ");
    $("#bst-pre", root).textContent = traversal(tree, "pre", []).join(", ");
    $("#bst-post", root).textContent = traversal(tree, "post", []).join(", ");
    query(); setLabStatus(`${values.length} nyje`, true);
  };
  const query = () => {
    const value = Number($("#bst-query", root).value); const [floor, ceiling] = bstFloorCeiling(tree, value);
    $("#bst-fc", root).textContent = `${floor ?? "null"} / ${ceiling ?? "null"}`;
  };
  $("#bst-build", root).onclick = build; $("#bst-query", root).oninput = query; build();
};

const RED = true, BLACK = false;
const isRed = node => Boolean(node && node.color === RED);
function rotateLeft(h, log) {
  const x = h.right; h.right = x.left; x.left = h; x.color = h.color; h.color = RED; log.push(`rotateLeft(${h.key})`); return x;
}
function rotateRight(h, log) {
  const x = h.left; h.left = x.right; x.right = h; x.color = h.color; h.color = RED; log.push(`rotateRight(${h.key})`); return x;
}
function flipColors(h, log) {
  h.color = !h.color; h.left.color = !h.left.color; h.right.color = !h.right.color; log.push(`flipColors(${h.key})`);
}
function llrbInsert(h, key, log) {
  if (!h) { log.push(`insert ${key} si node e kuqe`); return new TreeNode(key, RED); }
  if (key < h.key) h.left = llrbInsert(h.left, key, log);
  else if (key > h.key) h.right = llrbInsert(h.right, key, log);
  else return h;
  if (isRed(h.right) && !isRed(h.left)) h = rotateLeft(h, log);
  if (isRed(h.left) && isRed(h.left.left)) h = rotateRight(h, log);
  if (isRed(h.left) && isRed(h.right)) flipColors(h, log);
  return h;
}

LABS.balanced = root => {
  root.innerHTML = `<div class="control-row"><div class="field compact"><label for="rb-key">Key i ri</label><input id="rb-key" type="number" value="15"></div><button class="button primary" id="rb-insert">Inserto</button><button class="button" id="rb-example">Luaj 15,41,32,10</button><button class="button ghost" id="rb-reset">Reset</button></div>
    <div class="lab-grid"><div class="subpanel tree-wrap" id="rb-tree"></div><div class="subpanel"><div class="subpanel-title">Operacionet e insertimit të fundit</div><ol class="check-list" id="rb-log"></ol><div class="result-box">Vija e kuqe bashkon dy keys të së njëjtës 3-node. Root gjithmonë përfundon i zi.</div></div></div>`;
  let tree = null;
  const insert = key => {
    const log = []; tree = llrbInsert(tree, key, log); tree.color = BLACK;
    $("#rb-tree", root).innerHTML = treeMarkup(tree, true);
    $("#rb-log", root).innerHTML = log.map(item => `<li>${escapeHTML(item)}</li>`).join("") || `<li>Key ekziston; nuk u shtua node e re.</li>`;
    setLabStatus(`Root: ${tree.key}`, true);
  };
  $("#rb-insert", root).onclick = () => insert(Number($("#rb-key", root).value));
  $("#rb-reset", root).onclick = () => { tree = null; $("#rb-tree", root).innerHTML = treeMarkup(tree, true); $("#rb-log", root).innerHTML = ""; setLabStatus("Interaktiv"); };
  $("#rb-example", root).onclick = () => {
    tree = null; const keys = [15,41,32,10]; let index = 0;
    const timer = setInterval(() => { insert(keys[index++]); if (index === keys.length) clearInterval(timer); }, 450);
  };
  $("#rb-tree", root).innerHTML = treeMarkup(tree, true);
};

function simulateHash(keys, M, a, b, method) {
  const f = x => a * x + b;
  const trace = [];
  if (method === "chain") {
    const slots = Array.from({length: M}, () => []);
    keys.forEach(key => { const index = ((f(key) % M) + M) % M; slots[index].push(key); trace.push({ key, attempts: String(index), final: index }); });
    return { slots, trace, chain: true };
  }
  const slots = Array(M).fill(null);
  keys.forEach(key => {
    const base = ((f(key) % M) + M) % M;
    let i = 0, index = base; const attempts = [];
    while (i < M) {
      index = method === "linear" ? (base + i) % M : method === "quadratic" ? (base + i + i * i) % M : (base + i * (base === 0 ? 1 : M - base)) % M;
      attempts.push(index);
      if (slots[index] === null || slots[index] === key) break;
      i++;
    }
    if (i < M) slots[index] = key;
    trace.push({ key, attempts: attempts.join(" → "), final: i < M ? index : "plot" });
  });
  return { slots, trace, chain: false };
}

LABS.hash = root => {
  root.innerHTML = `<div class="lab-grid"><div class="subpanel"><div class="subpanel-title">Collision simulator</div>
    <div class="control-row"><div class="field"><label for="hash-keys">Keys</label><input id="hash-keys" value="1,8,49,18,24,34,48,5"></div><div class="field compact"><label for="hash-m">M</label><input id="hash-m" type="number" min="2" value="13"></div><div class="field compact"><label for="hash-a">a te ax+b</label><input id="hash-a" type="number" value="2"></div><div class="field compact"><label for="hash-b">b</label><input id="hash-b" type="number" value="3"></div></div>
    <div class="control-row"><div class="field"><label for="hash-method">Metoda</label><select id="hash-method"><option value="linear">Linear probing</option><option value="quadratic">Quadratic probing</option><option value="double">Double hashing</option><option value="chain">Separate chaining</option></select></div><button class="button primary" id="hash-run">Simulo</button></div>
    <div class="hash-grid" id="hash-grid"></div><div class="table-wrap"><table class="trace-table"><thead><tr><th>Key</th><th>Tentimet</th><th>Final</th></tr></thead><tbody id="hash-trace"></tbody></table></div></div>
    <div class="subpanel"><div class="subpanel-title">Horner për String</div><div class="control-row"><div class="field"><label for="horner-string">String</label><input id="horner-string" value="DOG"></div><div class="field compact"><label for="horner-m">M</label><input id="horner-m" type="number" value="13"></div></div><div class="code-box" id="horner-steps"></div><div class="result-box" id="horner-result"></div></div></div>`;
  const run = () => {
    const keys = parseNumbers($("#hash-keys", root).value), M = Math.max(2, Number($("#hash-m", root).value));
    const result = simulateHash(keys, M, Number($("#hash-a", root).value), Number($("#hash-b", root).value), $("#hash-method", root).value);
    $("#hash-grid", root).innerHTML = result.slots.map((value, index) => `<div class="hash-slot"><span class="hash-index">${index}</span><span class="hash-value">${result.chain ? (value.join(" → ") || "·") : (value ?? "·")}</span></div>`).join("");
    $("#hash-trace", root).innerHTML = result.trace.map(row => `<tr><td>${row.key}</td><td>${row.attempts}</td><td>${row.final}</td></tr>`).join("");
    setLabStatus(`${keys.length} keys`, true);
  };
  const horner = () => {
    const text = $("#horner-string", root).value.toUpperCase(); const M = Math.max(2, Number($("#horner-m", root).value));
    let h = 0; const steps = [];
    for (const char of text) { const before = h; h = 31 * h + char.charCodeAt(0); steps.push(`${char}: 31·${before} + ${char.charCodeAt(0)} = ${h}`); }
    $("#horner-steps", root).textContent = steps.join("\n") || "Shkruaj një string.";
    $("#horner-result", root).textContent = text ? `${h} mod ${M} = ${((h % M) + M) % M}` : "—";
  };
  $("#hash-run", root).onclick = run; $("#horner-string", root).oninput = horner; $("#horner-m", root).oninput = horner; run(); horner();
};

function parseSparse(value) {
  const map = new Map();
  String(value).split(",").forEach(pair => {
    const [index, number] = pair.split(":").map(Number);
    if (Number.isFinite(index) && Number.isFinite(number) && number !== 0) map.set(index, number);
  });
  return map;
}

LABS.applications = root => {
  root.innerHTML = `<div class="lab-grid"><div class="subpanel"><div class="subpanel-title">FileIndex builder</div>
    <label for="doc-1">D1</label><input id="doc-1" value="algoritme stack queue"><label for="doc-2" style="margin-top:.5rem">D2</label><input id="doc-2" value="tree algoritme hash"><label for="doc-3" style="margin-top:.5rem">D3</label><input id="doc-3" value="queue hash queue">
    <label for="file-query" style="margin-top:.75rem">Kërko fjalën</label><input id="file-query" value="queue"><div class="result-box" id="file-result"></div><div class="table-wrap"><table class="trace-table"><thead><tr><th>Fjala</th><th>Dokumentet</th></tr></thead><tbody id="file-index"></tbody></table></div></div>
    <div class="subpanel"><div class="subpanel-title">Sparse dot product</div><label for="sparse-input">Sparse: indeks:vlerë</label><input id="sparse-input" value="0:2,4:-1,7:3"><label for="dense-input" style="margin-top:.5rem">Dense vector</label><input id="dense-input" value="5,2,0,0,4,1,9,2"><div class="code-box" id="dot-steps" style="margin-top:.75rem"></div><div class="result-box success" id="dot-result"></div></div></div>`;
  const buildIndex = () => {
    const index = new Map();
    [1,2,3].forEach(number => {
      const words = $("#doc-" + number, root).value.toLowerCase().match(/[\p{L}\p{N}_-]+/gu) || [];
      new Set(words).forEach(word => { if (!index.has(word)) index.set(word, new Set()); index.get(word).add(`D${number}`); });
    });
    const entries = [...index.entries()].sort(([a], [b]) => a.localeCompare(b));
    $("#file-index", root).innerHTML = entries.map(([word, docs]) => `<tr><td><code>${escapeHTML(word)}</code></td><td>${[...docs].join(", ")}</td></tr>`).join("");
    const query = $("#file-query", root).value.toLowerCase().trim();
    $("#file-result", root).textContent = query ? `${query} → {${[...(index.get(query) || [])].join(", ") || "∅"}}` : "Shkruaj një query.";
  };
  const dot = () => {
    const sparse = parseSparse($("#sparse-input", root).value); const dense = parseNumbers($("#dense-input", root).value);
    let sum = 0; const steps = [];
    sparse.forEach((value, index) => { const term = value * (dense[index] || 0); sum += term; steps.push(`${value} · dense[${index}] (${dense[index] || 0}) = ${term}`); });
    $("#dot-steps", root).textContent = steps.join("\n") || "Nuk ka elemente jo-zero.";
    $("#dot-result", root).textContent = `dot product = ${sum}; u vizituan vetëm ${sparse.size} indekse.`;
  };
  [1,2,3].forEach(number => $("#doc-" + number, root).oninput = buildIndex);
  $("#file-query", root).oninput = buildIndex; $("#sparse-input", root).oninput = dot; $("#dense-input", root).oninput = dot;
  buildIndex(); dot(); setLabStatus("Dy aplikime live", true);
};

$("#previous-topic").addEventListener("click", () => goToTopic(state.topicIndex - 1));
$("#next-topic").addEventListener("click", () => goToTopic(state.topicIndex + 1));
$("#random-task").addEventListener("click", () => {
  const unsolved = TOPICS.flatMap((topic, topicIndex) => topic.challenges.filter(ch => !state.solved.has(ch.id)).map(ch => ({ ch, topicIndex })));
  const pool = unsolved.length ? unsolved : TOPICS.flatMap((topic, topicIndex) => topic.challenges.map(ch => ({ ch, topicIndex })));
  const picked = pool[Math.floor(Math.random() * pool.length)];
  goToTopic(picked.topicIndex, false);
  setTimeout(() => {
    const card = $(`[data-challenge-id="${picked.ch.id}"]`); card?.scrollIntoView({ behavior: "smooth", block: "center" }); $("input", card)?.focus();
  }, 60);
});
$("#reset-progress").addEventListener("click", () => {
  if (!confirm("A dëshiron ta fshish krejt progresin dhe XP?")) return;
  state.solved.clear(); state.xp = 0; persist(); updateProgress(); renderChallenges(TOPICS[state.topicIndex]); toast("Progresi u rivendos.");
});

window.addEventListener("hashchange", () => {
  const index = TOPICS.findIndex(topic => `#${topic.id}` === location.hash);
  if (index >= 0 && index !== state.topicIndex) { state.topicIndex = index; renderTopic(); }
});

renderTopic();
