# 04 – Funksionet Gjeneruese dhe Rekurencat (Det. 5 + Det. 6 ≈ 25–34 pikë)

<!-- ZERO-START-V1 -->
## Si ta kuptosh këtë kapitull prej zeros

### Çka është vargu?

Vargu është një listë numrash me renditje:

\[
a_0,a_1,a_2,a_3,\ldots
\]

Indeksi nis zakonisht nga 0. Për vargun \(2,5,8,\ldots\):

\[
a_0=2,\qquad a_1=5,\qquad a_2=8
\]

Kjo është shumë e rëndësishme: numri në pozitën \(n\) bëhet koeficienti i \(x^n\).

### Çka bën funksioni gjenerues?

Funksioni gjenerues e paketon krejt vargun në një shprehje:

\[
A(x)=a_0+a_1x+a_2x^2+a_3x^3+\cdots
\]

Shembull:

\[
2,5,8,\ldots \quad\longrightarrow\quad 2+5x+8x^2+\cdots
\]

\(x\) këtu nuk është një numër që duhet ta gjejmë. Ai shërben si etiketë e pozitës. Koeficienti para \(x^3\) është \(a_3\).

### Prej nga del \(\frac1{1-x}\)?

Le të jetë:

\[
S=1+x+x^2+x^3+\cdots
\]

Shumëzoje me \(x\):

\[
xS=x+x^2+x^3+\cdots
\]

Zbritja \(S-xS\) anulon të gjitha termat pasues:

\[
S-xS=1
\]

\[
S(1-x)=1\quad\Rightarrow\quad S=\frac1{1-x}
\]

Prandaj:

\[
1,1,1,1,\ldots \longleftrightarrow \frac1{1-x}
\]

Nëse shfaqen vetëm fuqitë çift \(1+x^2+x^4+\cdots\), zëvendësojmë \(x\) me \(x^2\):

\[
\frac1{1-x^2}
\]

### Pse zerot në fillim japin faktor \(x^k\)?

Vargu \(7,3,7,3,\ldots\) fillon te \(x^0\). Nëse shtojmë katër zero përpara, 7 kalon nga \(x^0\) në \(x^4\). Prandaj krejt funksioni shumëzohet me \(x^4\).

### Dy drejtime të kundërta të detyrave

1. **Vargu \(\rightarrow\) funksioni:** shkruaj termat me \(x^n\), identifiko modelin, përdor serinë gjeometrike dhe zhvendosjen.
2. **Funksioni \(\rightarrow\) vargu:** zgjero funksionin dhe lexo koeficientët.

### Çka është rekurenca?

Rekurenca e përkufizon një anëtar përmes anëtarëve para tij. Shembull:

\[
a_n=2a_{n-1},\qquad a_0=3
\]

Atëherë:

\[
a_1=2\cdot3=6,\quad a_2=2\cdot6=12,\quad a_3=24
\]

Kushti fillestar është i domosdoshëm; pa \(a_0\), formula përshkruan shumë vargje të ndryshme.

Më poshtë mësohen veçmas: modelet bazë, zhvendosja, teorema binomiale dhe zgjidhja e rekurencave.

---


> Det. 5: "Të caktohet funksioni gjenerues i vargut 0,0,0,0,7,3,7,3,…" (translacion + varg periodik).
> Det. 6: ose "Të gjendet vargu që ka funksion gjenerues (1+2x)⁻⁴" (teorema binomiale e zgjeruar),
> ose "Të zgjidhet rekurenca aₙ = 9aₙ₋₁ − 14aₙ₋₂ + 2ⁿ" (rekurencë lineare johomogjene).

---

## 1. Çka është funksioni gjenerues?

Për vargun a₀, a₁, a₂, … funksioni gjenerues është seria fuqi:
> **f(x) = a₀ + a₁x + a₂x² + a₃x³ + … = Σ aₖxᵏ**

Kufizat e vargut janë **koeficientët** e serisë. x është vetëm "mbajtës i vendit" – nuk na intereson vlera e tij.
- Varg i fundëm 1, 3, 3, 1 → f(x) = 1 + 3x + 3x² + x³ = (1+x)³.
- Varg i pafundëm → f(x) shkruhet si thyesë e mbyllur.

### Funksionet gjeneruese bazë (MËSOJI PËRMENDËSH)

| Vargu | f(x) | Pse |
|---|---|---|
| 1, 1, 1, 1, … | **1/(1 − x)** | seria gjeometrike |
| 1, 0, 1, 0, 1, 0, … | **1/(1 − x²)** | zëvendëso x → x² |
| 1, −1, 1, −1, … | 1/(1 + x) | zëvendëso x → −x |
| 1, c, c², c³, … | **1/(1 − cx)** | x → cx |
| 1, 2, 3, 4, 5, … | **1/(1 − x)²** | derivimi ose shumat e pjesshme |
| 0, 1, 2, 3, 4, … | x/(1 − x)² | translacion i të mësipërmit |
| C(n,0), C(n,1), …, C(n,n) | (1 + x)ⁿ | teorema binomiale |
| 1, n, C(n+1,2), C(n+2,3), … | 1/(1 − x)ⁿ | teorema binomiale e zgjeruar |
| 1, 1, 1/2!, 1/3!, … | eˣ | seria Maclaurin |

---

## 2. Veprimet me funksione gjeneruese (rregullat)

Le të jenë f(x) ↔ (aₙ), g(x) ↔ (bₙ).

| Veprimi | Vargu i ri | Funksioni i ri |
|---|---|---|
| **Mbledhja** | aₙ + bₙ | f(x) + g(x) |
| **Shumëzimi me konstantë** | c·aₙ | c·f(x) |
| **Translacioni (zhvendosja) me k vende** | 0,0,…,0 (k zero), a₀, a₁, … | **xᵏ·f(x)** |
| **Ndërrimi i ndryshores** | a₀, c·a₁, c²·a₂, … | f(cx) |
| **Shumëzimi** | cₙ = Σ aₖbₙ₋ₖ (konvolucion) | f(x)·g(x) |
| **Shumat e pjesshme** | a₀, a₀+a₁, a₀+a₁+a₂, … | f(x)/(1 − x) |
| **Derivimi** | a₁, 2a₂, 3a₃, … | f'(x) |
| **Integrimi** | 0, a₀, a₁/2, a₂/3, … | ∫₀ˣ f(t)dt |

---

## 3. DETYRA 5: vargu 0, 0, 0, 0, 7, 3, 7, 3, 7, 3, …

**Hapi 1 – hiq zerot e para:** 4 zero në fillim → translacion → faktor **x⁴**. Mbetet vargu periodik 7, 3, 7, 3, …

**Hapi 2 – ndaje vargun periodik në dy vargje të njohura:**
- 7, 0, 7, 0, … = 7 · (1, 0, 1, 0, …) → **7/(1 − x²)**
- 0, 3, 0, 3, … = 3x · (1, 0, 1, 0, …) → **3x/(1 − x²)**
Shuma: (7 + 3x)/(1 − x²).

**Hapi 3 – shto translacionin:**
> **f(x) = x⁴ · (7 + 3x)/(1 − x²) = (7x⁴ + 3x⁵)/(1 − x²)**

**Kontroll:** zgjero: (7x⁴ + 3x⁵)(1 + x² + x⁴ + …) = 7x⁴ + 3x⁵ + 7x⁶ + 3x⁷ + … ✓

**Mënyra alternative (si në libër):** 7,3,7,3 = 5,5,5,5 + 2,−2,2,−2 → 5/(1−x) + 2/(1+x) = (5+5x+2−2x)/(1−x²) = (7+3x)/(1−x²). E njëjta.

### Shembuj të tjerë të të njëjtit tip
- 3, 1, 3, 1, … = 1,1,1,… + 2,0,2,0,… → 1/(1−x) + 2/(1−x²) = (1 + x + 2)/(1−x²) = **(3 + x)/(1 − x²)**
- 4, 5, 1, 1, 1, … = (3 + 4x) + (1,1,1,…) → 3 + 4x + 1/(1−x) = **(4 + x − 4x²)/(1 − x)**
- 0, 0, 0, 5, 3, 5, 3, … → **x³(5 + 3x)/(1 − x²)**
- 0, 2, 0, 4, 0, 6, … = 2x + 4x³ + 6x⁵ + … = (x² + x⁴ + x⁶ + …)' = (x²/(1−x²))' = **2x/(1 − x²)²**
- 1, 2, 4, 8, 16, … → **1/(1 − 2x)**
- 0, 0, 0, 0, 1, 2, 3, 4, … → **x⁴/(1 − x)²**

---

## 4. Teorema binomiale e zgjeruar → DETYRA 6 (tipi "gjej vargun")

**Koeficienti binomial i përgjithësuar** për çfarëdo n ∈ ℤ:
> C(n, k) = n(n−1)(n−2)…(n−k+1) / k!,   C(n,0) = 1

**Teorema binomiale e zgjeruar:** (1 + x)ⁿ = Σ C(n,k) xᵏ për çdo n të plotë (|x| < 1).

**Formula kyçe për eksponent negativ:**
> **C(−n, k) = (−1)ᵏ · C(n + k − 1, k)**

Rrjedhimisht (këto dy i përdor gjithmonë):
> **(1 − x)⁻ⁿ = Σ C(n + k − 1, k) · xᵏ**   (të gjitha me plus)
> **(1 + x)⁻ⁿ = Σ (−1)ᵏ · C(n + k − 1, k) · xᵏ**   (me shenja të alternuara)

Nëse në vend të x ka **cx**, shto faktorin **cᵏ**.

### Shembull provimi: f(x) = 1/(1 + 2x)⁴ = (1 + 2x)⁻⁴
aₖ = C(−4, k)·(2)ᵏ = (−1)ᵏ · C(k + 3, k) · 2ᵏ = (−1)ᵏ · C(k+3, 3) · 2ᵏ
- k=0: 1
- k=1: −C(4,3)·2 = −4·2 = **−8**
- k=2: C(5,3)·4 = 10·4 = **40**
- k=3: −C(6,3)·8 = −20·8 = **−160**
- k=4: C(7,3)·16 = 35·16 = **560**
**Vargu: 1, −8, 40, −160, 560, …**  Formula: aₖ = (−1)ᵏ · 2ᵏ · C(k+3, 3).

### Shembull provimi: f(x) = 1/(1 − 3x)⁴
aₖ = C(k+3, 3) · 3ᵏ → 1, 4·3 = **12**, 10·9 = **90**, 20·27 = **540**, 35·81 = **2835**, …

### Shembull provimi: f(x) = 1/(1 + 2x)²
aₖ = (−1)ᵏ C(k+1, 1) 2ᵏ = (−1)ᵏ (k+1) 2ᵏ → **1, −4, 12, −32, 80, …**

### Shembull provimi: f(x) = (1 + 2x)² (eksponent pozitiv – thjesht zgjero!)
(1 + 2x)² = 1 + 4x + 4x² → vargu **1, 4, 4, 0, 0, 0, …** (i fundëm!)

### Shembull libri: 1/(1 − 2x)³
aₖ = C(k+2, 2)·2ᵏ → 1, 3·2 = 6, 6·4 = 24, 10·8 = 80, … ✓ (libri: 1, 6, 24, 80)

> **Kujdes me shenjat:** (1 − cx)⁻ⁿ → të gjitha pozitive. (1 + cx)⁻ⁿ → alternojnë +, −, +, −.
> C(k+n−1, k) = C(k+n−1, n−1) – përdor atë që është më lehtë të llogaritet. Për n = 4: C(k+3,3) = (k+3)(k+2)(k+1)/6.

---

## 5. Ekuacionet rekurente lineare homogjene → DETYRA 6 (tipi "zgjidh rekurencën")

Forma: **aₙ = c₁aₙ₋₁ + c₂aₙ₋₂** (rendi 2) me kushte fillestare a₀, a₁.

**Procedura:**
1. Zëvendëso aₙ = rⁿ → **ekuacioni karakteristik r² − c₁r − c₂ = 0**.
2. Gjej rrënjët r₁, r₂:
   - **Të ndryshme (reale):** aₙ = **α·r₁ⁿ + β·r₂ⁿ**
   - **Të barabarta (r₁ = r₂ = r):** aₙ = **(α + β·n)·rⁿ**
   - Komplekse r = ρ(cos θ ± i sin θ): aₙ = ρⁿ(α cos nθ + β sin nθ)
   - Rendi 3 me tri rrënjë të ndryshme: aₙ = αr₁ⁿ + βr₂ⁿ + γr₃ⁿ; rrënjë trefishe: (α + βn + γn²)rⁿ.
3. Nga kushtet fillestare (n=0, n=1) formo sistemin dhe gjej α, β.
4. **Kontrollo** me a₂ nga rekurenca!

**Shembull (libri 5.6.15).** aₙ = 2aₙ₋₁ + 3aₙ₋₂, a₀ = 1, a₁ = 3.
r² − 2r − 3 = 0 → (r − 3)(r + 1) = 0 → r₁ = 3, r₂ = −1. aₙ = α·3ⁿ + β·(−1)ⁿ.
n=0: α + β = 1; n=1: 3α − β = 3 → mbledh: 4α = 4 → α = 1, β = 0. **aₙ = 3ⁿ**.

**Shembull (Fibonacci).** Fₙ = Fₙ₋₁ + Fₙ₋₂, r² − r − 1 = 0 → r = (1 ± √5)/2. Fₙ = α((1+√5)/2)ⁿ + β((1−√5)/2)ⁿ.

**Shembull (rrënjë e dyfishtë).** aₙ = 4aₙ₋₁ − 4aₙ₋₂, a₀ = 1, a₁ = 4. r² − 4r + 4 = (r−2)² → r = 2 (dyfish).
aₙ = (α + βn)·2ⁿ. n=0: α = 1. n=1: (1 + β)·2 = 4 → β = 1. **aₙ = (1 + n)·2ⁿ**.

---

## 6. Ekuacionet rekurente lineare johomogjene

Forma: **aₙ = c₁aₙ₋₁ + c₂aₙ₋₂ + f(n)**.

> **Zgjidhja e përgjithshme = h(n) + p(n)**
> h(n) = zgjidhja e homogjenes (me α, β TË PAPËRCAKTUARA ende), p(n) = një zgjidhje e pjesshme.

**Si zgjidhet p(n) – varësisht nga f(n):**

| f(n) | b nuk është rrënjë karakteristike | b është rrënjë karakteristike (shumëfishitet m) |
|---|---|---|
| **k·bⁿ** | p(n) = **A·bⁿ** | p(n) = **A·nᵐ·bⁿ** |
| polinom i shkallës d (b = 1) | p(n) = A₀ + A₁n + … + A_d·n^d | p(n) = nᵐ(A₀ + A₁n + … + A_d·n^d) |
| P_d(n)·bⁿ | (A₀ + … + A_d n^d)·bⁿ | nᵐ(A₀ + … + A_d n^d)·bⁿ |
| f₁(n) + f₂(n) | p₁(n) + p₂(n) | |

Konstantet A gjenden duke **zëvendësuar p(n) në rekurencë**. **Pastaj** (jo para!) gjenden α, β nga kushtet fillestare duke përdorur aₙ = h(n) + p(n).

### DETYRA E PROVIMIT: aₙ = 9aₙ₋₁ − 14aₙ₋₂ + 2ⁿ, a₀ = 1, a₁ = 1

**Hapi 1 – homogjenja:** r² − 9r + 14 = 0 → (r − 2)(r − 7) = 0 → r₁ = 2, r₂ = 7.
h(n) = α·2ⁿ + β·7ⁿ.

**Hapi 2 – pjesa johomogjene:** f(n) = 2ⁿ, b = 2 **është rrënjë karakteristike** (shumëfishitet 1) → **p(n) = A·n·2ⁿ**.

**Hapi 3 – gjej A** duke zëvendësuar p(n) në rekurencë:
A·n·2ⁿ = 9·A·(n−1)·2ⁿ⁻¹ − 14·A·(n−2)·2ⁿ⁻² + 2ⁿ
Pjesëto gjithçka me 2ⁿ⁻² (2ⁿ = 4·2ⁿ⁻², 2ⁿ⁻¹ = 2·2ⁿ⁻²):
4An = 18A(n − 1) − 14A(n − 2) + 4
4An = 18An − 18A − 14An + 28A + 4
4An = 4An + 10A + 4  →  0 = 10A + 4  →  **A = −2/5**
p(n) = −(2/5)·n·2ⁿ

**Hapi 4 – zgjidhja e përgjithshme:** aₙ = α·2ⁿ + β·7ⁿ − (2/5)·n·2ⁿ

**Hapi 5 – kushtet fillestare:**
n=0: α + β = 1
n=1: 2α + 7β − 4/5 = 1 → 2α + 7β = 9/5
Nga e para α = 1 − β → 2 − 2β + 7β = 9/5 → 5β = −1/5 → **β = −1/25**, **α = 26/25**.

> **aₙ = (26/25)·2ⁿ − (1/25)·7ⁿ − (2/5)·n·2ⁿ**

**Hapi 6 – kontroll:** nga rekurenca a₂ = 9·1 − 14·1 + 4 = −1. Nga formula: (26/25)·4 − 49/25 − (2/5)·2·4 = 104/25 − 49/25 − 80/25 = −25/25 = −1 ✓

### Shembull libri (5.5.2.2): aₙ = 2aₙ₋₁ + 3aₙ₋₂ + 3ⁿ, a₀ = 0, a₁ = 1
r² − 2r − 3 = 0 → r = 3, −1. h(n) = c₁3ⁿ + c₂(−1)ⁿ. b = 3 është rrënjë → p(n) = c₃·n·3ⁿ.
Zëvendësim: c₃n3ⁿ = 2c₃(n−1)3ⁿ⁻¹ + 3c₃(n−2)3ⁿ⁻² + 3ⁿ; /3ⁿ⁻²: 9c₃n = 6c₃(n−1) + 3c₃(n−2) + 9 → 9c₃n = 9c₃n − 12c₃ + 9 → c₃ = 3/4.
a₀: c₁ + c₂ = 0; a₁: 3c₁ − c₂ + 9/4 = 1 → 4c₁ = −5/4 → c₁ = −5/16, c₂ = 5/16.
**aₙ = −(5/16)·3ⁿ + (5/16)·(−1)ⁿ + (3/4)·n·3ⁿ**

### Shembull: aₙ = 4aₙ₋₁ − 4aₙ₋₂ + n, a₀ = 0, a₁ = 1 (f(n) polinom, 1 nuk është rrënjë)
r = 2 (dyfish) → h(n) = (α + βn)2ⁿ. p(n) = A + Bn.
A + Bn = 4(A + B(n−1)) − 4(A + B(n−2)) + n = 4B + n → B = 1, A = 4. p(n) = n + 4.
a₀: α + 4 = 0 → α = −4. a₁: 2(α + β) + 5 = 1 → α + β = −2 → β = 2.
**aₙ = (2n − 4)·2ⁿ + n + 4.** Kontroll a₂ = 4·1 − 0 + 2 = 6; formula: 0·4 + 6 = 6 ✓

---

## 7. Zgjidhja e rekurencave me funksione gjeneruese (metoda alternative, libri 5.5.1)
Shumëzo rekurencën me xⁿ, mblidh për të gjitha n, shpreh gjithçka përmes f(x) = Σaₙxⁿ, zgjidh për f(x), zbërthe në thyesa të pjesshme dhe lexo koeficientët. P.sh. aₙ = 2aₙ₋₁, a₀=1 → f(x) − 1 = 2x·f(x) → f(x) = 1/(1−2x) → aₙ = 2ⁿ.

---

## 8. Gabimet më të shpeshta
1. Harron **xᵏ** për zerot në fillim (translacioni).
2. Te (1 + cx)⁻ⁿ harron shenjën **(−1)ᵏ** ose faktorin **cᵏ**.
3. Te rekurenca johomogjene: kur b **është** rrënjë, harron faktorin **n** te p(n) → sistemi del pa zgjidhje (0 = 4).
4. Gjen α, β **para** se të shtosh p(n) – gabim! Kushtet fillestare zbatohen te aₙ = h(n) + p(n).
5. Nuk kontrollon me a₂. Kontrolli merr 30 sekonda dhe shpëton 17 pikë.

---

## 9. Funksionet gjeneruese eksponenciale (FGE)

Kjo temë është në syllabus. Mos e ngatërro me funksionin gjenerues të zakonshëm.

| Lloji | Për vargun (aₙ) |
|---|---|
| **FG e zakonshme** | A(x) = Σ aₙxⁿ |
| **FG eksponenciale** | E(x) = Σ aₙxⁿ/n! |

Për ta nxjerrë aₙ nga FGE:
> **aₙ = n! · [xⁿ]E(x)**

Shembujt bazë:

| Vargu aₙ | FGE E(x) |
|---|---|
| 1, 1, 1, 1, … | eˣ |
| 1, c, c², c³, … | eᶜˣ |
| 0, 1, 2, 3, … (aₙ=n) | xeˣ |
| 0, 0, 2, 6, 12, … (aₙ=n(n−1)) | x²eˣ |
| 0!, 1!, 2!, 3!, … | 1/(1−x) |

**Shembull 1.** E(x) = e³ˣ = Σ 3ⁿxⁿ/n!, prandaj **aₙ = 3ⁿ** → 1, 3, 9, 27, …

**Shembull 2.** E(x) = 1 + 2x + 3x². Atëherë a₀ = 1, a₁ = 1!·2 = 2, a₂ = 2!·3 = 6 dhe aₙ = 0 për n ≥ 3. Vargu: **1, 2, 6, 0, …**

**Rregulli i prodhimit.** Nëse A(x) dhe B(x) janë FGE të (aₙ) dhe (bₙ), atëherë A(x)B(x) është FGE e
> **cₙ = Σₖ₌₀ⁿ C(n,k)aₖbₙ₋ₖ**.

**Shembulli i fjalëve nga materiali:** nga shkronjat a,a,a,b,c, numri i fjalëve me k shkronja merret nga
> **(1 + x + x²/2! + x³/3!)(1+x)² = 1 + 3x + 7x²/2! + 13x³/3! + 20x⁴/4! + 20x⁵/5!**.

Pra për k = 1,2,3,4,5 numrat janë **3, 7, 13, 20, 20**.
