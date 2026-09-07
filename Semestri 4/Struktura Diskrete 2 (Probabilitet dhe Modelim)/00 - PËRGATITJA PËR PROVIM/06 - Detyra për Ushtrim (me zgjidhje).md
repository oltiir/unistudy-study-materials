# 06 – Detyra për ushtrim: të ngjashme me provimin + më të vështira

> Niveli ★ = si në provim. ★★ = pak më i vështirë (ndryshim i vogël në formulim). ★★★ = më i vështirë (kombinon ide).
> Zgjidhjet janë në fund të çdo seksioni. **Provo vetë së pari!** Të gjitha përgjigjet janë të verifikuara.

---

## A. Teoria e kodeve

**A1 ★** Jepet G = [[1,0,0,1,1],[0,1,0,1,0],[0,0,1,0,1]]. Gjeni të gjitha fjalëkodet, d(C), dhe sa gabime zbulon/korrigjon kodi.

**A2 ★** Kodo mesazhin m = 1011 me kodin Hamming C[7,4] (G sistematike). Pastaj verifiko me H.

**A3 ★** Pranohet r = 1011011 nga kodi Hamming [7,4]. Llogarit sindromën s = H·rᵀ, gjej pozicionin e gabimit, korrigjo dhe nxirr mesazhin.

**A4 ★** Kodo m = 1101 me g(x) = 1 + x + x³ (kod ciklik [7,4]).

**A5 ★** Pranohet r = 1101101 me g(x) = 1 + x + x³. Ka gabim? Nëse po, korrigjoje me tabelën e sindromave dhe gjej mesazhin.

**A6 ★★** G = [[1,0,1],[0,1,1]]. Formo grupin standard a + C për V(3,2). Dekodo r = 111 dhe r = 100. Çfarë vëren për unicitetin?

**A7 ★★** A është g(x) = x³ + x² + 1 gjenerues i vlefshëm për kod ciklik [7,4]? Vërteto me pjesëtim të x⁷ + 1. Ndërto tabelën e sindromave xⁱ mod g(x).

**A8 ★★★** Kodi C = {0000, 1100, 0011, 1111}. (a) Gjej G dhe H. (b) Gjej d(C). (c) Trego me grupin standard pse r = 1000 nuk mund të korrigjohet në mënyrë unike.

**A9 ★★★** Për çfarë vlerë të t vargu 99856–762–3–t është ISBN-10 i vlefshëm? (Σ(11−i)xᵢ ≡ 0 mod 11.)

### Zgjidhjet A

**A1.** k=3, n=5. Fjalëkodet (m = 000…111): 00000, 10011, 01010, 00101, 11001, 10110, 01111, 11100. Peshat jo-zero: 3,2,2,3,3,4,3 → **d(C) = 2** → zbulon 1 gabim, korrigjon 0.

**A2.** c = r₁ + r₃ + r₄ = 1000110 + 0010011 + 0001111 = **1011010**. (p₁ = 1+0+1 = 0, p₂ = 1+1+1 = 1, p₃ = 0+1+1 = 0 ✓). H·cᵀ: rreshti1: 1+0+0+1+0+0+0 = 0 ✓ … = 000 ✓.

**A3.** r = (1,0,1,1,0,1,1). Sindroma s = H·rᵀ, rresht për rresht (mod 2):
- H₁ = (1,1,0,1,1,0,0): 1·1 + 1·0 + 0·1 + 1·1 + 1·0 + 0·1 + 0·1 = 2 → **0**
- H₂ = (1,0,1,1,0,1,0): 1 + 0 + 1 + 1 + 0 + 1 + 0 = 4 → **0**
- H₃ = (0,1,1,1,0,0,1): 0 + 0 + 1 + 1 + 0 + 0 + 1 = 3 → **1**
s = (0,0,1)ᵀ ≠ 0 → gabim. Kolonat e H: c₁=(1,1,0), c₂=(1,0,1), c₃=(0,1,1), c₄=(1,1,1), c₅=(1,0,0), c₆=(0,1,0), c₇=(0,0,1). s = **kolona 7** → gabimi në bitin 7 → **c = 1011010**, mesazhi = 4 bitat e parë **m = 1011** (përputhet me A2 ✓). *Këshillë: sindromën llogarite bit për bit, ngadalë – këtu bëhen gabimet më të shpeshta.*

**A4.** m(x) = 1 + x + x³. c(x) = (1 + x + x³)(1 + x + x³) = 1 + x² + x⁶ (mod 2 kufizat e dyfishta anulohen: (a+b+c)² = a²+b²+c²) → **c = 1010001**.

**A5.** r(x) = 1 + x + x³ + x⁴ + x⁶. Pjesëto me x³ + x + 1: x⁶ → x³·g = x⁶+x⁴+x³; mbetet 1 + x; shkalla < 3 → **s(x) = 1 + x ≠ 0 → gabim**. Tabela: x³ mod g = 1 + x → gabimi në pozicionin 3 → c = r + x³ = 1 + x + x⁴ + x⁶ → **c = 1100101**. m(x) = c(x)/g(x) = 1 + x³ → **m = 1001**. (Kontroll: (1+x³)(1+x+x³) = 1+x+x³+x³+x⁴+x⁶ ✓)

**A6.** C = {000, 101, 011, 110}. Klasa 2: udhëheqës 100 → {100, 001, 111, 010}. r = 111 → gabimi 100 → c = 011, m = 01. r = 100 ∈ klasës 2 → c = 000, m = 00. **Por** klasa 2 ka tre vektorë me peshë 1 (100, 001, 010) – udhëheqësi nuk është unik → korrigjimi nuk është i besueshëm (d(C) = 2).

**A7.** x⁷ + 1 ÷ (x³ + x² + 1): x⁴·g = x⁷+x⁶+x⁴ → x⁶+x⁴+1; x³·g = x⁶+x⁵+x³ → x⁵+x⁴+x³+1; x²·g = x⁵+x⁴+x² → x³+x²+1; 1·g → 0. **Mbetja 0 → vlen.** Herësi x⁴+x³+x²+1 = (x+1)(x³+x+1). Sindromat: 1, x, x², x²+1, x²+x+1, x+1, x²+x (të 7 të ndryshme → korrigjon 1 gabim).

**A8.** (a) G = [[1,1,0,0],[0,0,1,1]] (dy rreshta të pavarur). H: duhet H·cᵀ = 0: H = [[1,1,0,0],[0,0,1,1]] (vetë-dual!). (b) d(C) = 2. (c) Klasa e 1000: {1000, 0100, 1011, 0111} – ka dy vektorë me peshë 1 (1000, 0100) → udhëheqësi jo unik → r = 1000 është njësoj afër 0000 dhe 1100.

**A9.** 10·9 + 9·9 + 8·8 + 7·5 + 6·6 + 5·7 + 4·6 + 3·2 + 2·3 = 90+81+64+35+36+35+24+6+6 = **377**. 377 = 34·11 + 3 → 377 + t ≡ 0 (mod 11) → 3 + t ≡ 0 → **t = 8**. Kontroll: 385 = 35·11 ✓. (Libri shënon t = 3 – gabim shtypi; llogaritja e mësipërme është e saktë.)

---

## B. Probabiliteti

**B1 ★** Kuti: 5 bardhë, 4 kuq, 3 zi. Tërhiqen 3 pa kthim, X = nr. i bardhëve. Tabela, E(X), D(X).

**B2 ★** Kuti: 7 kuq, 5 bardhë. Tërhiqen 2 pa kthim. P(të dy kuq)? P(një kuq një bardhë)? P(të paktën një bardhë)?

**B3 ★** Dy kuti. K1: 3 bardhë, 5 zi. K2: 6 bardhë, 2 zi. Hidhet monedha: N → K1, F → K2, tërhiqet 1 lëmsh. (a) P(bardhë). (b) Doli bardhë – P(që ishte K1)?

**B4 ★★** Tri makina prodhojnë 50%, 30%, 20% të artikujve me defekte 2%, 3%, 5%. Zgjidhet një artikull, është me defekt. Nga cila makinë është më e mundshme?

**B5 ★★** Kuti: 4 bardhë, 6 zi. Tërhiqen 3 **me kthim**. X = nr. i bardhëve. Tabela, E(X), D(X). Krahaso me tërheqjen pa kthim.

**B6 ★★** Hidhen 2 zare. X = shuma. Gjej P(X = 7), P(X ≥ 10), E(X).

**B7 ★★★** Parkingu 1: 5 bardhë, 3 kuqe. Parkingu 2: 2 bardhë, 4 kuqe. Nga P1 kalon **një** veturë në P2, pastaj nga P2 kalon **një** veturë në P1, pastaj nga P1 tërhiqet një. P(e bardhë)?

**B8 ★★★** Ndryshoret e pavarura X = (0,1,2 / 0.2,0.5,0.3), Y = (1,3 / 0.4,0.6). Gjej ligjin e Z = X + Y, E(Z) dhe verifiko E(Z) = E(X) + E(Y). Gjej E(XY).

### Zgjidhjet B

**B1.** N = 12, C(12,3) = 220. P(0) = C(7,3)/220 = 35/220 = **0.1591**; P(1) = 5·21/220 = 105/220 = **0.4773**; P(2) = 10·7/220 = 70/220 = **0.3182**; P(3) = 10/220 = **0.0455**. E(X) = 0.4773 + 0.6364 + 0.1364 = **1.25** (= 3·5/12). E(X²) = 0.4773 + 1.2727 + 0.4091 = 2.1591 → **D(X) = 2.1591 − 1.5625 = 0.5966**.

**B2.** P(KK) = 7/12·6/11 = 42/132 = **7/22**. P(një-një) = 2·(7/12·5/11) = 70/132 = **35/66**. P(≥1 B) = 1 − P(KK) = **15/22**.

**B3.** P(H₁) = P(H₂) = 1/2. P(A|H₁) = 3/8, P(A|H₂) = 6/8. (a) P(A) = 1/2·3/8 + 1/2·6/8 = 9/16 = **0.5625**. (b) P(H₁|A) = (1/2·3/8)/(9/16) = (3/16)/(9/16) = **1/3**.

**B4.** P(A) = 0.5·0.02 + 0.3·0.03 + 0.2·0.05 = 0.010 + 0.009 + 0.010 = 0.029. P(H₁|A) = 0.010/0.029 = **0.345**, P(H₂|A) = 0.009/0.029 = 0.310, P(H₃|A) = 0.010/0.029 = **0.345**. Makina 1 dhe 3 janë njësoj të mundshme (0.345), më pak makina 2. (Vërejtje: makina 3 prodhon vetëm 20% por ka defekt të lartë – Bajesi e "korrigjon".)

**B5.** Me kthim → binomiale n = 3, p = 0.4. P(0) = 0.6³ = **0.216**; P(1) = 3·0.4·0.36 = **0.432**; P(2) = 3·0.16·0.6 = **0.288**; P(3) = 0.4³ = **0.064**. E(X) = np = **1.2**, D(X) = npq = **0.72**. Pa kthim (hipergjeometrike): E(X) = 1.2 (i njëjti!), D = npq·(N−n)/(N−1) = 0.72·7/9 = 0.56 (më i vogël).

**B6.** 36 rezultate. P(X=7) = 6/36 = **1/6**. P(X ≥ 10) = (3+2+1)/36 = **1/6**. E(X) = 2·E(një zar) = 2·3.5 = **7**.

**B7.** Hapi 1: nga P1 (5B,3K) kalon 1: P(B₁) = 5/8, P(K₁) = 3/8. Hapi 2: P2 ka 7 vetura: nëse B₁ → 3B,4K; nëse K₁ → 2B,5K. Kalon një në P1. Hapi 3: P1 ka përsëri 8 vetura. Rastet:
- B₁,B₂ (5/8·3/7): P1 = 5B,3K → 5/8
- B₁,K₂ (5/8·4/7): P1 = 4B,4K → 4/8
- K₁,B₂ (3/8·2/7): P1 = 6B,2K → 6/8
- K₁,K₂ (3/8·5/7): P1 = 5B,3K → 5/8
P = (15·5 + 20·4 + 6·6 + 15·5)/(56·8) = (75+80+36+75)/448 = 266/448 = **19/32 ≈ 0.594**.

**B8.** Z ∈ {1,2,3,4,5}. P(1) = 0.2·0.4 = 0.08; P(2) = 0.5·0.4 = 0.20; P(3) = 0.3·0.4 + 0.2·0.6 = 0.24; P(4) = 0.5·0.6 = 0.30; P(5) = 0.3·0.6 = 0.18. (Σ = 1 ✓) E(Z) = 0.08 + 0.40 + 0.72 + 1.20 + 0.90 = **3.3**. E(X) = 1.1, E(Y) = 2.2 → 1.1 + 2.2 = 3.3 ✓. E(XY) = E(X)E(Y) = **2.42**.

---

## C. Statistika

**C1 ★** 80 studentë, nota (5–6:8, 6–7:16, 7–8:30, 8–9:18, 9–10:8). Gjej x̄, Mo, Me, σ, IQR.

**C2 ★★** Në tabelën e provimit A (pesha, f = 10,14,35,26,9,6) gjej: (a) centilin ku bie nxënësi 67 kg; (b) peshën që ndan 90% të nxënësve më të lehtë (P₉₀); (c) decilin e parë D₁.

**C3 ★★★** Një klasë ka x̄ = 65.56 kg dhe σ = 2.55 kg. Nëse çdo nxënës shton 2 kg, sa bëhet x̄ dhe σ? Nëse pesha matet në gram (·1000)? Shpjego.

**C4 ★★** Një prodhues pohon se mesatarja është μ = 50. Për n = 36 merret x̄ = 52 dhe dihet σ = 6. Me α = 0.05 testo H₀: μ = 50 kundër H₁: μ ≠ 50.

**C5 ★★★** Një mostër nga popullim normal ka n = 25, x̄ = 73, s = 10. Testo H₀: μ = 70 kundër H₁: μ > 70 me α = 0.05. Përdor t kritik = 1.711 për df = 24.

### Zgjidhjet C

**C1.** x = 5.5, 6.5, 7.5, 8.5, 9.5. Σfx = 44 + 104 + 225 + 153 + 76 = 602 → **x̄ = 7.525**. F = 8, 24, 54, 72, 80. Mo = 7 + (30−16)/((30−16)+(30−18))·1 = 7 + 14/26 = **7.54**. Me = 7 + (40 − 24)/30 = **7.53**. Σf(x−x̄)² = 8·4.10 + 16·1.05 + 30·0.0006 + 18·0.95 + 8·3.90 = 32.8 + 16.8 + 0.02 + 17.1 + 31.2 = 97.95 → σ² = 1.224 → **σ = 1.11**. Q₁ = 6 + (20−8)/16 = 6.75; Q₃ = 8 + (60−54)/18 = 8.33; **IQR = 1.58**.

**C2.** (a) 67 në klasën 66–68 (F para = 59, f = 26): 59 + (1/2)·26 = 72 → **centili 72**. (b) P₉₀: 0.9·100 = 90 → klasa 68–70 (F para = 85, f = 9): 68 + (90−85)/9·2 = **69.11 kg**. (c) D₁ = P₁₀: 10 → klasa 60–62 është saktësisht 10 kumulative → D₁ = 60 + (10−0)/10·2 = **62 kg**.

**C3.** Shtimi i konstantës: x̄ → 67.56, **σ nuk ndryshon** (2.55) – devijimet nga mesatarja mbeten të njëjta. Shumëzimi me 1000: x̄ → 65560 g, σ → 2550 g (σ shumëzohet me |c|, varianca me c²).

**C4.** z = (52−50)/(6/√36) = 2.00. Testi është dykahësh dhe z kritik = ±1.96. Meqë |2.00| > 1.96, **refuzohet H₀**; ka evidencë në nivelin 5% se mesatarja ndryshon nga 50.

**C5.** t = (73−70)/(10/√25) = 3/2 = **1.50**, df = 24. Testi është i djathtë dhe 1.50 < 1.711, prandaj **nuk refuzohet H₀**; nuk ka evidencë të mjaftueshme në nivelin 5% se μ > 70.

---

## D. Funksionet gjeneruese dhe rekurencat

**D1 ★** Funksioni gjenerues i: (a) 3,1,3,1,…; (b) 0,0,0,5,3,5,3,…; (c) 2,4,1,1,1,…; (d) 0,0,1,2,3,4,….

**D2 ★** Vargu me funksion gjenerues: (a) 1/(1−x)³; (b) 1/(1+x)³; (c) 1/(1−2x)²; (d) (1−3x)².

**D3 ★** aₙ = 5aₙ₋₁ − 6aₙ₋₂, a₀ = 1, a₁ = 5.

**D4 ★** aₙ = 6aₙ₋₁ − 9aₙ₋₂, a₀ = 1, a₁ = 6.

**D5 ★★** aₙ = 5aₙ₋₁ − 6aₙ₋₂ + 3ⁿ, a₀ = 1, a₁ = 2.

**D6 ★★** aₙ = aₙ₋₁ + 2aₙ₋₂ + 2ⁿ, a₀ = 0, a₁ = 1 (libri 5.6.18).

**D7 ★★** aₙ = 4aₙ₋₁ − 4aₙ₋₂ + n, a₀ = 0, a₁ = 1.

**D8 ★★★** aₙ = 6aₙ₋₁ − 11aₙ₋₂ + 6aₙ₋₃, a₀ = 2, a₁ = 0, a₂ = −2 (rendi 3, libri 5.6.16).

**D9 ★★★** Funksioni gjenerues i vargut 1, 3, 5, 7, 9, … (numrat tek) dhe i vargut 0, 1, 4, 9, 16, … (katrorët).

**D10 ★★★** Zgjidh aₙ = 2aₙ₋₁ + 1, a₀ = 0 me **funksione gjeneruese** (Kullat e Hanoit).

**D11 ★★** Gjej vargun që ka funksion gjenerues eksponencial: (a) e³ˣ; (b) 1 + 2x + 3x²; (c) xeˣ.

**D12 ★★★** A(x) = eˣ dhe B(x) = e²ˣ janë FGE. Gjej vargun e A(x)B(x) në dy mënyra: drejtpërdrejt dhe me konvolucionin binomial.

### Zgjidhjet D

**D1.** (a) 1/(1−x) + 2/(1−x²) = **(3 + x)/(1 − x²)**. (b) **x³(5 + 3x)/(1 − x²)**. (c) (1 + 3x) + 1/(1−x) = **(2 + 2x − 3x²)/(1 − x)** [kontroll: 2,4,1,1: (1+3x)(1−x) + 1 = 1 + 2x − 3x² + 1 = 2 + 2x − 3x² ✓]. (d) **x²/(1 − x)²**.

**D2.** (a) C(k+2,2): **1, 3, 6, 10, 15, …**. (b) (−1)ᵏC(k+2,2): **1, −3, 6, −10, 15, …**. (c) (k+1)2ᵏ: **1, 4, 12, 32, 80, …**. (d) 1 − 6x + 9x²: **1, −6, 9, 0, 0, …**.

**D3.** r² − 5r + 6 = 0 → r = 2, 3. aₙ = α2ⁿ + β3ⁿ. α + β = 1, 2α + 3β = 5 → β = 3, α = −2. **aₙ = 3ⁿ⁺¹ − 2ⁿ⁺¹**. (a₂ = 25 − 6 = 19; formula 27 − 8 = 19 ✓)

**D4.** r² − 6r + 9 = (r−3)² → aₙ = (α + βn)3ⁿ. α = 1; (1 + β)·3 = 6 → β = 1. **aₙ = (n + 1)3ⁿ**.

**D5.** r = 2, 3; b = 3 rrënjë → p(n) = An3ⁿ. /3ⁿ⁻²: 9An = 15A(n−1) − 6A(n−2) + 9 → 9An = 9An − 3A + 9 → A = 3. aₙ = α2ⁿ + β3ⁿ + 3n3ⁿ. α + β = 1; 2α + 3β + 9 = 2 → 2α + 3β = −7 → β = −9, α = 10. **aₙ = 10·2ⁿ − 9·3ⁿ + 3n·3ⁿ**. (a₂ = 10 − 6 + 9 = 13; formula 40 − 81 + 54 = 13 ✓)

**D6.** r² − r − 2 = 0 → r = 2, −1; b = 2 rrënjë → p(n) = An2ⁿ. /2ⁿ⁻²: 4An = 2A(n−1) + 2A(n−2) + 4 → 4An = 4An − 6A + 4 → A = 2/3. aₙ = α2ⁿ + β(−1)ⁿ + (2/3)n2ⁿ. α + β = 0; 2α − β + 4/3 = 1 → 3α = −1/3 → α = −1/9, β = 1/9. **aₙ = −(1/9)2ⁿ + (1/9)(−1)ⁿ + (2/3)n2ⁿ**. (a₂ = 1 + 0 + 4 = 5; formula −4/9 + 1/9 + 16/3 = −3/9 + 48/9 = 5 ✓)

**D7.** r = 2 dyfish; f(n) = n polinom, 1 s'është rrënjë → p(n) = A + Bn. A + Bn = 4A + 4B(n−1) − 4A − 4B(n−2) + n = 4B + n → B = 1, A = 4. aₙ = (α + βn)2ⁿ + n + 4. α = −4; 2(α+β) + 5 = 1 → β = 2. **aₙ = (2n − 4)2ⁿ + n + 4**. (a₂ = 4 − 0 + 2 = 6 ✓)

**D8.** r³ − 6r² + 11r − 6 = (r−1)(r−2)(r−3). aₙ = α + β2ⁿ + γ3ⁿ. α+β+γ = 2; α+2β+3γ = 0; α+4β+9γ = −2. Zbrit: β + 2γ = −2; 2β + 6γ = −2 → β + 3γ = −1 → γ = 1, β = −4, α = 5. **aₙ = 5 − 4·2ⁿ + 3ⁿ**. (a₃ = 6·(−2) − 11·0 + 6·2 = 0; formula 5 − 32 + 27 = 0 ✓)

**D9.** Tek: 1,3,5,… = 2·(0,1,2,…) + (1,1,1,…) → 2x/(1−x)² + 1/(1−x) = **(1 + x)/(1 − x)²**. Katrorët: n² → derivo x/(1−x)² [gjenerues i n]: (x/(1−x)²)' = (1+x)/(1−x)³, shumëzo me x → **x(1 + x)/(1 − x)³**.

**D10.** f(x) = Σaₙxⁿ. Rekurenca ·xⁿ, Σ për n ≥ 1: f(x) − a₀ = 2x·f(x) + x/(1−x) → f(x)(1 − 2x) = x/(1−x) → f(x) = x/((1−x)(1−2x)) = 1/(1−2x) − 1/(1−x) → **aₙ = 2ⁿ − 1**.

**D11.** (a) e³ˣ = Σ3ⁿxⁿ/n! → **aₙ = 3ⁿ**: 1,3,9,27,… (b) a₀=1, a₁=1!·2=2, a₂=2!·3=6 → **1,2,6,0,…**. (c) xeˣ = Σn·xⁿ/n! → **aₙ=n**: 0,1,2,3,…

**D12.** Drejtpërdrejt: eˣe²ˣ=e³ˣ → cₙ=3ⁿ. Me konvolucion: aₖ=1, bₙ₋ₖ=2ⁿ⁻ᵏ, prandaj cₙ=ΣC(n,k)2ⁿ⁻ᵏ=(1+2)ⁿ=**3ⁿ**.
