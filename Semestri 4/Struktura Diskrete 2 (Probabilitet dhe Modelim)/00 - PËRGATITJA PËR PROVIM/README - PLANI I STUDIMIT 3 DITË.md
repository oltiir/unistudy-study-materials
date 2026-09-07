# Struktura Diskrete 2 – Plani i studimit për 3 ditë

**Katër provimet e ruajtura kanë 6 detyra + 4 pyetje teorike = 100 pikë.** Përdore këtë si model të fortë, jo si garanci se formati s'mund të ndryshojë:

| Det. | Tema | Pikë | Vështirësia | Skedari |
|---|---|---|---|---|
| 1 | Kodet lineare: G, fjalëkodet, forma polinomiale / Hamming | 10–15 | e ulët (procedurë) | 01 |
| 2 | Grupi standard a+C **ose** kodet ciklike me g(x) **ose** H dhe G Hamming | 10–15 | mesatare | 01 |
| 3 | Kutia me lëmshe (ligji i shpërndarjes, E, D) **ose** Bajes/parkingjet | 10–17 | mesatare | 02 |
| 4 | Statistika: tabela me intervale (x̄, G, H, Mo, Me, σ, IQR, centil) | 16–20 | e ulët por E GJATË | 03 |
| 5 | Funksioni gjenerues i vargut 0,0,0,0,7,3,7,3,… | 10–17 | e ulët | 04 |
| 6 | Vargu nga (1+2x)⁻⁴ **ose** rekurenca johomogjene | 15–17 | mesatare–e lartë | 04 |
| T | 4 pyetje teorike | 12–16 | e ulët (memorizim) | 07 |

**Strategjia:** Det. 4 + Det. 5 + Det. 1 + Teoria = ~55 pikë që merren me **procedura mekanike**. Siguroji këto së pari. Pastaj Det. 3 dhe Det. 6. Det. 2 e fundit.

---

## Përmbajtja e dosjes

| Skedari | Çka është | Kur ta përdorësh |
|---|---|---|
| `01 - Teoria e Kodeve.md` | Shpjegim i thjeshtuar + procedura hap pas hapi | Dita 1 |
| `02 - Probabiliteti.md` | Shpjegim + detyra standarde e zgjidhur | Dita 1 |
| `03 - Statistika.md` | Formulat + tabela ndihmëse + shembull i plotë | Dita 2 |
| `04 - Funksionet Gjeneruese dhe Rekurencat.md` | Shpjegim + tabela e funksioneve bazë + rekurenca e provimit | Dita 2 |
| `05 - Provimet e Kaluara - Zgjidhje të Plota.md` | 4 provimet nga fotot, çdo detyrë e zgjidhur | Dita 2–3 |
| `06 - Detyra për Ushtrim (me zgjidhje).md` | 30+ detyra ★/★★/★★★ me zgjidhje | Dita 2–3 |
| `07 - Pyetjet Teorike (Flashcards).md` | 24 pyetje me përgjigje të gatshme | Çdo mbrëmje 15 min |
| `08 - Formulari (Cheat Sheet).md` | Gjithçka në një faqe | Dita 3 + mëngjesi i provimit |
| `09 - Provim Simulues i Ri.md` | Provim i ri 100-pikësh + zgjidhje dhe rubricë | Matja finale e gatishmërisë |
| `Kuize/index.html` | 5 kuize interaktive HTML (hap në browser) | Pas çdo teme + Dita 3 |
| `../00 - MD/` | Materiali origjinal i konvertuar në Markdown | Referencë kur duash detaje |

---

## DITA 1 – Kodet + Probabiliteti (≈ 6 orë)

**Bllok 1 (2h) – Kodet, pjesa e lehtë**
1. Lexo `01` §1–§5 (fjalori, G, H, Hamming, grupi standard). Mos e lexo pasivisht: **mbylle dhe rishkruaj G dhe H të Hamming nga mendja.**
2. Zgjidh vetë: Provimi B Det.1 dhe Det.2, Provimi C Det.1, Provimi D Det.1–2 (skedari 05, mbulo zgjidhjet).
3. Ushtrime: A1, A2, A3, A6 nga `06`.
4. Kuizi `Kuize/01-kodet.html`.

*Pushim 20 min.*

**Bllok 2 (1.5h) – Kodet polinomiale/ciklike**
1. Lexo `01` §6–§7. Praktiko **pjesëtimin e polinomeve mod 2** 5 herë në letër – kjo është e vetmja pjesë "e vështirë".
2. Zgjidh: Provimi A Det.2, Provimi B Det.3, Provimi C Det.2. Ushtrime A4, A5, A7.

*Pushim 30 min.*

**Bllok 3 (2h) – Probabiliteti**
1. Lexo `02` plotësisht. Fokus te §7 (kutia) dhe §4 (Bajes).
2. Zgjidh vetë Det.3 të të 4 provimeve (janë 3 kuti + 1 parking). Duhet ta bësh një kuti në **≤ 12 min**.
3. Ushtrime B1, B2, B3, B5. Nëse ke kohë: B7.
4. Kuizi `Kuize/02-probabiliteti.html`.

**Mbrëmja (20 min):** Flashcards `07` pyetjet 1–17. Lexo me zë, mbulo, përsërit.

---

## DITA 2 – Statistika + Funksionet gjeneruese + Rekurencat (≈ 6 orë)

**Bllok 1 (2h) – Statistika (detyra më e vlefshme!)**
1. Lexo `03` §0–§5. Ndërto tabelën ndihmëse me dorë për shembullin.
2. Zgjidh **plotësisht** Det.4 të Provimit B (5 klasa, më e shkurtër) dhe Provimit D (120 nxënës). Mat kohën: qëllimi **≤ 20 min** për detyrë të plotë.
3. Ushtrime C1, C2.
4. Lexo `03` §6 (testimi i hipotezës), pastaj zgjidh C4 dhe C5 nga `06`.
5. Kuizi `Kuize/03-statistika.html`.

*Pushim 30 min.*

**Bllok 2 (1.5h) – Funksionet gjeneruese**
1. Lexo `04` §1–§4. **Mëso përmendësh funksionet bazë** nga §1.
2. Zgjidh: Det.5 dhe Det.6 (tipi "gjej vargun") nga të 4 provimet. Ushtrime D1, D2, D9.
3. Lexo `04` §9 (funksionet gjeneruese eksponenciale), pastaj zgjidh D11 dhe D12.

*Pushim 20 min.*

**Bllok 3 (2h) – Rekurencat**
1. Lexo `04` §5–§6. Kopjo tabelën "si zgjidhet p(n)".
2. Zgjidh Provimi C Det.6 vetë, pastaj D3, D4, D5, D6, D7. Për secilën **kontrollo me a₂**.
3. Kuizi `Kuize/04-rekurencat.html`.

**Mbrëmja (25 min):** Flashcards `07` pyetjet 18–24 + përsërit 1–17.

---

## DITA 3 – Simulim provimi + riparim (≈ 5 orë)

**Mëngjes (2.5h) – Provim simulues me kohë (90 min + korrigjim)**
Merr **Provimin A** nga `05`, në letër, pa shënime dhe me orë. Kuizi HTML nuk e zëvendëson zgjidhjen e plotë me dorë. Renditja e rekomanduar në provim:
1. Det.5 (5 min) → 2. Det.4 (20 min) → 3. Teoria (10 min) → 4. Det.1 (10 min) → 5. Det.3 (12 min) → 6. Det.6 (15 min) → 7. Det.2 (12 min) → 6 min kontroll.
Korrigjo me zgjidhjet. Shëno **saktësisht** ku gabove.

**Pasdite (2h) – Riparim i pikave të dobëta**
- Për çdo gabim: rilexo seksionin përkatës dhe bëj 2 ushtrime nga `06` të atij tipi (★★ dhe ★★★).
- Bëj Provimin C Det.6 dhe D5 edhe një herë nga fillimi (rekurenca johomogjene është tipi që ngatërron më shumë).
- Pas riparimit, bëj `Kuize/05-provimi-simulim.html` si kontroll të shpejtë 30-minutësh.

**Matja finale (kur ke edhe 2 orë):** zgjidh `09 - Provim Simulues i Ri.md` në letër. Syno të paktën 70/100; mos i shiko zgjidhjet para përfundimit.

**Mbrëmje (30 min):** Lexo `08 - Formulari` dy herë. Flashcards të gjitha. **Fli herët.**

**Mëngjesi i provimit (20 min):** vetëm `08 - Formulari`. Asgjë të re.

---

## Kontrolli i gatishmërisë

Konsideroje veten gati vetëm kur i plotëson të katër kushtet:

1. Arrin **të paktën 80%** në secilin kuiz tematik pa shënime.
2. Zgjidh **dy provime të plota me shkrim**, secilin brenda 90 minutave, me të paktën 70/100 sipas zgjidhjeve.
3. Mund të rindërtosh nga kujtesa G dhe H të Hamming, tabelën statistikore, format e p(n), testin Z/t dhe dallimin FG/FGE.
4. Çdo gabim nga simulimi e korrigjon dhe pastaj zgjidh dy detyra të tjera të atij tipi pa ndihmë.

---

## Këshilla për vetë provimin
- Shkruaj **formulën para se të zëvendësosh numrat** – merr pikë të pjesshme edhe me gabim aritmetik.
- Te statistika ndërto **tabelën ndihmëse së pari** (x, f·x, F, f·ln x, f/x, f(x−x̄)²) – gjysma e pikëve janë aty.
- Kontrollet 30-sekondëshe: Σpᵢ = 1; E(X) = n·B/N; H ≤ G ≤ x̄; a₂ nga rekurenca = a₂ nga formula.
- Nëse g(x) ose G duket "e çuditshme", thuaje me shkrim (p.sh. "g nuk pjesëton x⁷+1") – tregon kuptim dhe vlerësohet.
- Mos u bllokohet te Det.2 – ajo vlen sa Det.5 që zgjidhet në 5 minuta.
