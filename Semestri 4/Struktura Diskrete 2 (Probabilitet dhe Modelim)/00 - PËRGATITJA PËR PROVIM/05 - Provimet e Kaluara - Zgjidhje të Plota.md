# 05 – Provimet e kaluara: zgjidhje të plota, hap pas hapi

> Katër provime të kaluara (fotot që ke). Të gjitha llogaritjet janë verifikuar me kompjuter.
> **Këshillë:** mos i lexo zgjidhjet direkt. Mbulo, provo vetë 15 min, pastaj krahaso.

Struktura e provimit (e njëjtë çdo herë): **6 detyra + 4 pyetje teorike**, 100 pikë.
Det.1 kodet (10–15) · Det.2 kodet (10–15) · Det.3 probabilitet (10–17) · Det.4 statistikë (16–20) · Det.5 funksion gjenerues (10–17) · Det.6 gjeneruese/rekurencë (15–17) · Teori 12–16.

---

# PROVIMI A

## Det. 1 – Gjenerator matricë për C = {100, 110, 010, 000}, fjalëkodet me gjatësi 4, forma polinomiale

Kodi C ka 4 fjalëkode, prandaj dimensioni është k = log₂4 = 2. Një bazë është {100, 010}. I zgjasim fjalëkodet me një **bit pariteti çift** dhe marrim bazën {1001, 0101}. Matrica gjeneruese e kodit të zgjatur është:

```
G' =  1 0 0 | 1
      0 1 0 | 1
```
Kodimi c' = u·G', ku u janë koeficientët ndaj bazës:
| u | c origjinal | c' = u·G' | polinomi c'(x) = c₀ + c₁x + c₂x² + c₃x³ |
|---|---|---|---|
| 10 | 100 | 100**1** | 1 + x³ |
| 11 | 110 | 110**0** | 1 + x |
| 01 | 010 | 010**1** | x + x³ |
| 00 | 000 | 000**0** | 0 |

Kodi i ri C' = {1001, 1100, 0101, 0000}: çdo fjalëkod ka peshë çift, d(C') = 2 → zbulon 1 gabim.

> Kujdes: matrica [I₃ | 1ᵀ] do të ishte kodues për **të gjitha** 8 mesazhet 3-bitëshe. Ajo nuk është gjeneratori i këtij kodi C me vetëm 4 fjalëkode.

## Det. 2 – Kodi ciklik C[7,4], g(x) = 1 + x³, pranohet f = 1011100

Me konventën e përdorur në material, biti i parë është koeficienti i \(x^0\):

\[
f(x)=1+x^2+x^3+x^4
\]

Pjesëtimi mod 2 me \(g(x)=1+x^3\) jep:

\[
f(x)=(x+1)g(x)+(x^2+x)
\]

Pra:

\[
q(x)=x+1,\qquad s(x)=x^2+x\neq0
\]

**Përfundimi i parë:** është zbuluar gabim, sepse mbetja nuk është zero.

**Kujdes matematikor për këtë detyrë:** \(g(x)=1+x^3\) nuk pjesëton \(x^7+1\), prandaj nuk është gjenerator standard i një kodi ciklik Hamming \([7,4]\). Kodi i shumëfishave të këtij \(g\) ka \(d=2\); vektori i pranuar ka disa fjalëkode njësoj afër dhe korrigjimi nuk është unik. Katër kandidatët në largesë 2 janë:

\[
1001000,\quad1011010,\quad1101100,\quad1111110
\]

Prandaj përgjigjja e sigurt është: **gabimi zbulohet, por fjalëkodi dhe mesazhi nuk caktohen unikisht pa një rregull shtesë dekodimi**. Nëse profesori jep tabelë sindromash ose kërkon një konventë specifike, ndiqet ajo tabelë.


## Det. 3 – 9 bardhë, 6 kuq, 6 verdhë; 3 tërheqje pa kthim; X = nr. i bardhëve

N = 21, bardhë B = 9, jo-bardhë 12. P(X=k) = C(9,k)·C(12,3−k)/C(21,3), C(21,3) = 1330.
- P(X=0) = C(12,3)/1330 = 220/1330 = **0.1654**  (pema: 12/21·11/20·10/19)
- P(X=1) = 9·66/1330 = 594/1330 = **0.4466**  (pema: 3·(9/21·12/20·11/19))
- P(X=2) = 36·12/1330 = 432/1330 = **0.3248**
- P(X=3) = 84/1330 = **0.0632**
Σ = 1 ✓

```
X = (   0        1        2        3    )
    ( 0.1654   0.4466   0.3248   0.0632 )
```
**E(X)** = 0.4466 + 2·0.3248 + 3·0.0632 = **1.2857** (= 9/7)
E(X²) = 0.4466 + 4·0.3248 + 9·0.0632 = 2.3146 → **D(X)** = 2.3146 − 1.6531 = **0.6612**, σ = 0.813.

## Det. 4 – 100 nxënës, pesha (60–62:10, 62–64:14, 64–66:35, 66–68:26, 68–70:9, 70–72:6)

| Int. | f | x | f·x | F | f·ln x | f/x | f(x−x̄)² |
|---|---|---|---|---|---|---|---|
| 60–62 | 10 | 61 | 610 | 10 | 41.109 | 0.16393 | 207.94 |
| 62–64 | 14 | 63 | 882 | 24 | 58.004 | 0.22222 | 91.75 |
| 64–66 | 35 | 65 | 2275 | 59 | 146.104 | 0.53846 | 10.98 |
| 66–68 | 26 | 67 | 1742 | 85 | 109.322 | 0.38806 | 53.91 |
| 68–70 | 9 | 69 | 621 | 94 | 38.107 | 0.13043 | 106.50 |
| 70–72 | 6 | 71 | 426 | 100 | 25.576 | 0.08451 | 177.56 |
| Σ | 100 | | 6556 | | 418.222 | 1.52762 | 648.64 |

a) Histogrami: shtylla ngjitur mbi intervalet, lartësitë 10, 14, 35, 26, 9, 6.
a) **x̄** = 6556/100 = **65.56 kg**; **G** = e^(418.222/100) = e^4.18222 = **65.51 kg**; **H** = 100/1.52762 = **65.46 kg**.
b) **Mo** = 64 + (35−14)/((35−14)+(35−26))·2 = 64 + 21/30·2 = **65.40 kg**.
   **Me** = 64 + (50 − 24)/35·2 = **65.49 kg**.
c) **σ** = √(648.64/100) = √6.4864 = **2.55 kg**.
   Q₁ = 64 + (25−24)/35·2 = 64.06; Q₃ = 66 + (75−59)/26·2 = 67.23; **IQR = 3.17 kg**.

## Det. 5 – Funksioni gjenerues i vargut 0,0,0,0,7,3,7,3,7,3,…
4 zero → x⁴. 7,3,7,3,… = 7·(1,0,1,0,…) + 3x·(1,0,1,0,…) → (7 + 3x)/(1 − x²).
> **f(x) = x⁴(7 + 3x)/(1 − x²) = (7x⁴ + 3x⁵)/(1 − x²)**

## Det. 6 – Vargu me funksion gjenerues (1 + 2x)⁻⁴
(1 + 2x)⁻⁴ = Σ C(−4,k)(2x)ᵏ = Σ (−1)ᵏ C(k+3, 3) 2ᵏ xᵏ.
aₖ = (−1)ᵏ · 2ᵏ · C(k+3,3): **1, −8, 40, −160, 560, −1792, …**
(k=1: −2·4; k=2: 4·10; k=3: −8·20; k=4: 16·35.)

## Teoria
1. **Distanca minimale Hamming d(C)** = largesa më e vogël ndërmjet dy fjalëkodeve të ndryshme të kodit; d(x,y) = numri i pozicioneve ku ndryshojnë. Për kod linear = pesha minimale e fjalëkodit jo-zero. Përcakton: zbulon d−1, korrigjon ⌊(d−1)/2⌋ gabime.
2. **Matrica e kontrollit H** e kodit C: matricë (n−k)×n me H·cᵀ = 0 për çdo c ∈ C (dhe G·Hᵀ = 0). Nëse G = [I|P] → H = [Pᵀ|I]. Shërben për sindromën s = H·rᵀ.
3. **Të varura**: ndodhja e njërës ndikon probabilitetin e tjetrës, P(AB) = P(A)P(B|A) (tërheqje pa kthim). **Të pavarura**: P(AB) = P(A)P(B) (dy hedhje monedhe).
4. **Funksioni gjenerues** i vargut (aₙ): f(x) = Σ aₙxⁿ – seria fuqi ku koeficientët janë kufizat e vargut.

---

# PROVIMI B

## Det. 1 – m = 0110, fjalëkodi i Hamming C[7,4]
G = [I₄ | P] me P-rreshtat 110, 101, 011, 111.
c = m·G = rreshti₂ + rreshti₃ = 0100101 + 0010011 = **0110110**.
Ose: p₁ = m₁+m₂+m₄ = 1, p₂ = m₁+m₃+m₄ = 1, p₃ = m₂+m₃+m₄ = 0 → 0110|110. Kontroll H·cᵀ = 000 ✓.
(Në formën pozicionale p₁p₂d₁p₃d₂d₃d₄: 1100110.)

## Det. 2 – Matrica e kontrollit H dhe gjeneruese G për Hamming [7,4] (n=7, k=4)
H: 3 rreshta, 7 kolona = **të gjithë vektorët jo-zero 3-bitësh**, të renditur që 3 të fundit të formojnë I₃:
```
      1 1 0 1 | 1 0 0
H =   1 0 1 1 | 0 1 0        →  G = [ I₄ | Pᵀ ] =   1 0 0 0 | 1 1 0
      0 1 1 1 | 0 0 1                                0 1 0 0 | 1 0 1
                                                     0 0 1 0 | 0 1 1
                                                     0 0 0 1 | 1 1 1
```
Kolonat 1–4 të H (transponuara) = kolonat 5–7 të G. Verifikim: G·Hᵀ = 0. Kodi ka 16 fjalëkode, d = 3, korrigjon 1 gabim.

## Det. 3 – r = 1110011, g(x) = x³ + x² + x + 1: ka pasur gabim?
r(x) = 1 + x + x² + x⁵ + x⁶. Pjesëtimi (shih file 01, §6): q(x) = x³ + x, **mbetja s(x) = 1 ≠ 0 → PO, ka pasur gabim.**

## Det. 4 – Pikët (5–10:23, 10–15:20, 15–20:27, 20–25:12, 25–30:18), N = 100, h = 5

| Int. | f | x | f·x | F | f·ln x |
|---|---|---|---|---|---|
| 5–10 | 23 | 7.5 | 172.5 | 23 | 46.343 |
| 10–15 | 20 | 12.5 | 250 | 43 | 50.515 |
| 15–20 | 27 | 17.5 | 472.5 | 70 | 77.279 |
| 20–25 | 12 | 22.5 | 270 | 82 | 37.362 |
| 25–30 | 18 | 27.5 | 495 | 100 | 59.655 |
| Σ | 100 | | 1660 | | 271.154 |

a) **x̄ = 16.6 pikë**; **G** = e^(2.71154) = **15.05 pikë**.
b) **Me** = 15 + (50 − 43)/27·5 = 15 + 1.296 = **16.30**; **Mo** = 15 + (27−20)/((27−20)+(27−12))·5 = 15 + 7/22·5 = **16.59**.
(Shtesë: H = 100/7.3974 = 13.52; σ = √48.19 = 6.94; Q₁ = 10 + (25−23)/20·5 = 10.5; Q₃ = 20 + (75−70)/12·5 = 22.08; IQR = 11.58.)

## Det. 5 – Dy parkingjet (P1: 6 bardhë, 3 zeza, 5 kuqe; P2: 4 bardhë, 5 zeza, 3 kuqe)
Hipotezat = numri i bardhëve që kaluan nga P1 (2 vetura nga 14, C(14,2) = 91):
P(H₀) = C(8,2)/91 = 28/91; P(H₁) = 6·8/91 = 48/91; P(H₂) = C(6,2)/91 = 15/91.
P2 pastaj ka 14 vetura me 4, 5 ose 6 bardhë: P(A|H₀) = 4/14, P(A|H₁) = 5/14, P(A|H₂) = 6/14.
**P(A) = (28·4 + 48·5 + 15·6)/(91·14) = 442/1274 = 17/49 ≈ 0.347.**

## Det. 6 – Vargu me f(x) = 1/(1 + 2x)²
aₖ = (−1)ᵏ C(k+1,1) 2ᵏ = (−1)ᵏ (k+1) 2ᵏ → **1, −4, 12, −32, 80, −192, …**

## Teoria
1. **Bajesi**: shërben për të gjetur probabilitetin e hipotezës (shkakut) Hᵢ pasi dimë që A ndodhi: P(Hᵢ|A) = P(Hᵢ)P(A|Hᵢ) / Σₖ P(Hₖ)P(A|Hₖ).
2. **Funksioni gjenerues** i vargut a₀,a₁,…: f(x) = a₀ + a₁x + a₂x² + ….
3. **Vektorë linearisht të varur**: ekziston kombinim linear jo-trivial (jo të gjitha koef. zero) që jep vektorin zero; njëri shprehet përmes të tjerëve. Mod 2: një vektor është shumë e disa të tjerëve.
4. **Fjalëkod**: një vektor (sistem i radhitur simbolesh nga alfabeti GF(q)) që i takon kodit C; te kodi linear c = m·G.

---

# PROVIMI C

## Det. 1 – G = [[1,0,1,1],[0,1,0,0]], grupi standard a + C, korrigjo r = 1110
C = {0000, 1011, 0100, 1111} (m = 00, 10, 01, 11).

| udhëheqësi (gabimi) | a + C |||| 
|---|---|---|---|---|
| 0000 | 0000 | 1011 | 0100 | 1111 |
| 1000 | 1000 | 0011 | 1100 | 0111 |
| 0010 | 0010 | 1001 | 0110 | 1101 |
| 0001 | 0001 | 1010 | 0101 | **1110** |

r = 1110 → rreshti me udhëheqës **e = 0001** (gabim në bitin 4) → **c = 1110 + 0001 = 1111**, mesazhi **m = 11**.

## Det. 2 – m = 1001 me g(x) = x⁴ + x² + x + 1 (nëse g nuk vlen, gjenero tjetër)
m(x) = 1 + x³. **c(x) = m(x)g(x) = (1 + x³)(1 + x + x² + x⁴) = 1 + x + x² + x³ + x⁵ + x⁷** (x⁴ anulohet) → **c = 11110101** (n = 8).
Vlefshmëria: për kod ciklik me n = 8, g | x⁸ + 1 = (x+1)⁸. Por g = (x+1)(x³+x²+1) → **nuk vlen** (mbetja x+1). Gjenerues i vlefshëm: p.sh. **g(x) = 1 + x + x³** (pjesëton x⁷+1, kodi Hamming ciklik [7,4]):
c(x) = (1 + x³)(1 + x + x³) = 1 + x + x³ + x³ + x⁴ + x⁶ = **1 + x + x⁴ + x⁶ → c = 1100101**.

## Det. 3 – 10 bardhë, 4 kuq, 9 verdhë; 3 pa kthim; X = nr. i kuqve
N = 23, C(23,3) = 1771.
P(0) = C(19,3)/1771 = 969/1771 = **0.5471**; P(1) = 4·C(19,2)/1771 = 684/1771 = **0.3862**; P(2) = 6·19/1771 = 114/1771 = **0.0644**; P(3) = 4/1771 = **0.0023**. Σ = 1 ✓
**E(X)** = 0.3862 + 0.1288 + 0.0069 = **0.5217** (= 12/23). E(X²) = 0.3862 + 0.2576 + 0.0203 = 0.6641 → **D(X) = 0.6641 − 0.2722 = 0.392**.

## Det. 4 – 100 nxënës, pesha (60–62:13, 62–64:14, 64–66:34, 66–68:25, 68–70:9, 70–72:5)
Σf·x = 793 + 882 + 2210 + 1675 + 621 + 355 = 6536 → x̄ = 65.36. F = 13, 27, 61, 86, 95, 100.
a) **H** = 100/1.53241 = **65.26**; **G** = e^(417.912/100) = **65.31**.
b) **σ** = √(675.04/100) = **2.60**; Q₁ = 62 + (25−13)/14·2 = 63.71; Q₃ = 66 + (75−61)/25·2 = 67.12; **IQR = 3.41**.
c) **Me** = 64 + (50−27)/34·2 = **65.35**; **Mo** = 64 + (34−14)/((34−14)+(34−25))·2 = 64 + 20/29·2 = **65.38**.
d) Centili i 62.5 kg: [13 + (62.5−62)/2·14]/100 = (13 + 3.5)% → **centili 16.5** (≈ 16.5 % e nxënësve janë nën 62.5 kg).

## Det. 5 – Vargu me f(x) = (1 + 2x)²
(1 + 2x)² = 1 + 4x + 4x² → **1, 4, 4, 0, 0, 0, …**

## Det. 6 – aₙ = 9aₙ₋₁ − 14aₙ₋₂ + 2ⁿ, a₀ = a₁ = 1
r² − 9r + 14 = 0 → r = 2, 7. h(n) = α2ⁿ + β7ⁿ. b = 2 është rrënjë → p(n) = A·n·2ⁿ.
Zëvendësim /2ⁿ⁻²: 4An = 18A(n−1) − 14A(n−2) + 4 → 0 = 10A + 4 → A = −2/5.
aₙ = α2ⁿ + β7ⁿ − (2/5)n2ⁿ. a₀: α + β = 1; a₁: 2α + 7β = 9/5 → β = −1/25, α = 26/25.
> **aₙ = (26/25)·2ⁿ − (1/25)·7ⁿ − (2/5)·n·2ⁿ**   (kontroll: a₂ = −1 ✓, a₃ = −15 ✓)

## Teoria
1. **Ngjarje e volitshme** për A = ngjarja elementare që e realizon A. **Përkufizimi klasik:** P(A) = m/n (të volitshme / të gjitha të njëmundshme).
2. Funksioni gjenerues – si më lart.
3. **Gjenerator matricë G** e kodit linear C[n,k]: matricë k×n rreshtat e së cilës janë k fjalëkode linearisht të pavarura që gjenerojnë C; c = m·G.
4. **Zgjidhja e përgjithshme e rekurencës lineare homogjene** cₒaₙ + … + cₘaₙ₋ₘ = 0: zëvendësohet aₙ = rⁿ → ekuacioni karakteristik; për rrënjë të ndryshme aₙ = α₁r₁ⁿ + … + αₘrₘⁿ; për rrënjë rᵢ me shumëfishitet s: (α₀ + α₁n + … + α_{s−1}n^{s−1})rᵢⁿ. Konstantet nga kushtet fillestare. Zgjidhja e përgjithshme përmban m konstante arbitrare.

---

# PROVIMI D

## Det. 1 – C = {000, 110, 011, 101} → gjatësi 4, forma polinomiale
C ka 4 fjalëkode, prandaj k = 2. Zgjedhim bazën {110, 011}; pas shtimit të bitit të paritetit çift baza bëhet {1100, 0110}. Pra
**G' = [[1,1,0,0],[0,1,1,0]]** dhe gjeneron pikërisht C' = {0000, 1100, 0110, 1010}.
Format polinomiale: 0000 → 0; 1100 → 1+x; 0110 → x+x²; 1010 → 1+x².

## Det. 2 – G = [[1,1,0],[0,1,1]], grupi standard, korrigjo r = 101
C = {000, 110, 011, 101}. V(3,2) ka 8 vektorë → 2 klasa:
| udhëheqësi | a + C |||| 
|---|---|---|---|---|
| 000 | 000 | 110 | 011 | **101** |
| 100 | 100 | 010 | 111 | 001 |

r = 101 ∈ C (rreshti i parë) → **nuk ka gabim të zbuluar**, c = 101 = rreshti₁ + rreshti₂ → **m = 11**.
(Klasa e dytë ka 3 vektorë me peshë 1 → udhëheqësi s'është unik → kodi zbulon 1 gabim por s'e korrigjon; d(C) = 2.)

## Det. 3 – 9 bardhë, 8 kuq, 7 verdhë; 3 pa kthim; X = nr. i kuqve; E(X), D(X)
N = 24, C(24,3) = 2024. P(0) = C(16,3)/2024 = 560/2024 = **0.2767**; P(1) = 8·120/2024 = 960/2024 = **0.4743**; P(2) = 28·16/2024 = 448/2024 = **0.2213**; P(3) = 56/2024 = **0.0277**. Σ = 1 ✓
**E(X)** = 0.4743 + 0.4426 + 0.0831 = **1.000** (= 3·8/24). E(X²) = 0.4743 + 0.8852 + 0.2491 = 1.6087 → **D(X) = 0.6087** (= 14/23).

## Det. 4 – 120 nxënës, gjatësia (150–155:18, 155–160:22, 160–165:40, 165–170:20, 170–175:9, 175–180:11), h = 5
x = 152.5, 157.5, 162.5, 167.5, 172.5, 177.5. Σf·x = 19565. F = 18, 40, 80, 100, 109, 120.
b) **x̄** = 19565/120 = **163.04 cm**; **G** = e^(611.165/120) = e^5.0930 = **162.89**; **H** = 120/0.73742 = **162.73**.
c) **Mo** = 160 + (40−22)/((40−22)+(40−20))·5 = 160 + 18/38·5 = **162.37**; **Me** = 160 + (60 − 40)/40·5 = **162.5**.
d) **σ** = √(6189.79/120) = √51.58 = **7.18 cm**; Q₁ = 155 + (30−18)/22·5 = 157.73; Q₃ = 165 + (90−80)/20·5 = 167.5; **IQR = 9.77 cm**.

## Det. 5 – 0,0,0,0,7,3,7,3,… → **x⁴(7 + 3x)/(1 − x²)** (si Provimi A).

## Det. 6 – Vargu me f(x) = 1/(1 − 3x)⁴
aₖ = C(k+3,3)·3ᵏ → **1, 12, 90, 540, 2835, …**

## Teoria
1. Gjenerator matricë – si më lart. 2. Funksion gjenerues – si më lart. 3. Ngjarje e volitshme / përkufizimi klasik – si më lart.
4. **Vetitë e probabilitetit:** 0 ≤ P(A) ≤ 1; P(Ω) = 1; P(∅) = 0; P(Ā) = 1 − P(A); A ⊂ B ⇒ P(A) ≤ P(B); disjunkte ⇒ P(A+B) = P(A)+P(B); në përgjithësi P(A∪B) = P(A)+P(B)−P(AB); të pavarura ⇒ P(AB) = P(A)P(B).
