# 03 – Statistika Përshkruese (Det. 4 në provim ≈ 16–20 pikë – DETYRA MË E VLEFSHME!)

> Detyra 4 është GJITHMONË: tabelë me intervale (pesha, gjatësia, pikët) dhe frekuenca f, N = 100 ose 120.
> Kërkohen: histogrami, mesi aritmetik/gjeometrik/harmonik, moda, mediana, devijimi standard,
> mënjanimi interkuartil (IQR), ndonjëherë centili. Është llogaritje e pastër – me tabelë ndihmëse nuk gabon.

---

## 0. Teoria që mund të pyetet
- **Statistika** = shkenca e grumbullimit, organizimit, prezantimit, analizimit dhe interpretimit të të dhënave numerike për marrje vendimesh në kushte pasigurie.
- **Popullimi (tërësia)** = të gjitha njësitë me interes. **Mostra** = pjesë e popullimit përmes së cilës gjykojmë për popullimin (më lirë, më shpejt, ndonjëherë e vetmja mundësi).
- **Njësia statistikore** = elementi individual (banori, studenti). **Variabla** = vetia që matet.
- **Llojet e variablave**: *kualitative* (nominale: gjinia; ordinale: nota) dhe *kuantitative* (diskrete: nr. i fëmijëve; të vazhdueshme: pesha, gjatësia).
- **Statistika deskriptive** (përshkruan: tabela, grafe, mesatare) vs **inferenciale** (vlerëson, teston hipoteza, parashikon nga mostra për popullimin).
- **Histogrami** = shtylla ngjitur, gjerësia = intervali, lartësia = frekuenca f.

---

## 1. Tabela ndihmëse – FILLO GJITHMONË KËTU

Për çdo interval [Lᵢ, Uᵢ) llogarit: **mesin e klasës xᵢ = (Lᵢ+Uᵢ)/2**, **fᵢ·xᵢ**, **frekuencën kumulative Fᵢ**, dhe më vonë fᵢ·(xᵢ − x̄)².
h = gjerësia e intervalit (2 kg, 5 cm, 5 pikë…).

**Shembull provimi (100 nxënës, pesha në kg):**

| Intervali | fᵢ | xᵢ | fᵢ·xᵢ | Fᵢ (kumul.) | fᵢ·(xᵢ−x̄)² |
|---|---|---|---|---|---|
| 60–62 | 10 | 61 | 610 | 10 | 207.94 |
| 62–64 | 14 | 63 | 882 | 24 | 91.75 |
| 64–66 | **35** | 65 | 2275 | 59 | 10.98 |
| 66–68 | 26 | 67 | 1742 | 85 | 53.91 |
| 68–70 | 9 | 69 | 621 | 94 | 106.50 |
| 70–72 | 6 | 71 | 426 | 100 | 177.56 |
| **Σ** | **100** | | **6556** | | **648.64** |

---

## 2. Mesataret (parametrat e pozicionit)

### Mesi aritmetik
> **x̄ = Σ fᵢxᵢ / N** = 6556 / 100 = **65.56 kg**

### Mesi gjeometrik
> **G = (x₁^f₁ · x₂^f₂ · … · xₙ^fₙ)^(1/N)**  ⇔  **log G = Σ fᵢ·log xᵢ / N**

Praktikisht: llogarit Σ fᵢ·ln xᵢ, pjesëto me N, pastaj e^(…).
Σ fᵢ ln xᵢ = 10·ln61 + 14·ln63 + 35·ln65 + 26·ln67 + 9·ln69 + 6·ln71
= 41.109 + 58.004 + 146.104 + 109.322 + 38.107 + 25.576 = 418.222
ln G = 4.18222 → **G = e^4.18222 ≈ 65.51 kg**

### Mesi harmonik
> **H = N / Σ (fᵢ / xᵢ)**

Σ fᵢ/xᵢ = 10/61 + 14/63 + 35/65 + 26/67 + 9/69 + 6/71 = 0.16393 + 0.22222 + 0.53846 + 0.38806 + 0.13043 + 0.08451 = 1.52762
**H = 100 / 1.52762 ≈ 65.46 kg**

> **Kontroll:** gjithmonë **H ≤ G ≤ x̄** (65.46 ≤ 65.51 ≤ 65.56 ✓). Nëse nuk vlen, ke gabuar.

### Moda (Mo) – vlera më e shpeshtë
Klasa modale = klasa me f më të madhe (64–66, f = 35). L = kufiri i poshtëm, f₁ = frekuenca e klasës para, f₂ = e klasës pas.
> **Mo = L + (fₘ − f₁) / [(fₘ − f₁) + (fₘ − f₂)] · h**

Mo = 64 + (35 − 14) / [(35 − 14) + (35 − 26)] · 2 = 64 + 21/30 · 2 = 64 + 1.4 = **65.4 kg**

### Mediana (Me) – vlera e mesit (50% poshtë, 50% lart)
Gjej klasën ku F kumulative arrin N/2 = 50 → klasa 64–66 (F para = 24, f = 35).
> **Me = L + (N/2 − F_para) / fₘ · h**

Me = 64 + (50 − 24)/35 · 2 = 64 + 26/35 · 2 = 64 + 1.486 = **65.49 kg**

---

## 3. Parametrat e dispersionit (shpërndarjes)

### Dispersioni dhe devijimi standard
> **σ² = Σ fᵢ(xᵢ − x̄)² / N**,   **σ = √σ²**
> Formulë ekuivalente më e shpejtë: **σ² = Σ fᵢxᵢ²/N − x̄²**

Σ fᵢ(xᵢ − x̄)² = 648.64 (kolona e fundit e tabelës) → σ² = 6.4864 → **σ ≈ 2.55 kg**
(Me formulën e shpejtë: Σ fᵢxᵢ²/N = 4304.6; 4304.6 − 65.56² = 4304.6 − 4298.11 = 6.49 ✓)

> Shënim: nëse mësimdhënësi përdor **N − 1** në emërues (mostër), σ ≈ 2.56. Shkruaj formulën që përdor.

### Kuartilet dhe mënjanimi interkuartil (IQR)
Njësoj si mediana, por me N/4 dhe 3N/4:
> **Q₁ = L + (N/4 − F_para)/f · h**,  **Q₃ = L + (3N/4 − F_para)/f · h**,  **IQR = Q₃ − Q₁**

N/4 = 25 → klasa 64–66 (F para = 24, f = 35): Q₁ = 64 + (25 − 24)/35 · 2 = 64 + 0.057 = **64.06**
3N/4 = 75 → klasa 66–68 (F para = 59, f = 26): Q₃ = 66 + (75 − 59)/26 · 2 = 66 + 1.231 = **67.23**
**IQR = 67.23 − 64.06 = 3.17 kg**

### Centili (percentili) i një vlere
"Në cilin centil bie nxënësi me 62.5 kg?" → sa % e nxënësve janë nën 62.5.
62.5 është në klasën 62–64 (F para = 10, f = 14, h = 2):
> **% = [F_para + (x − L)/h · f] / N · 100**
= [10 + (0.5/2)·14]/100 · 100 = (10 + 3.5) = **13.5-ti centil** (≈ 13.5 % e nxënësve peshojnë më pak).

(Anasjelltas, centili k: Pₖ = L + (kN/100 − F_para)/f · h – njësoj si mediana me kN/100.)

---

## 4. Histogrami
Boshti x: intervalet (60, 62, 64, …, 72). Boshti y: frekuenca f. Shtyllat **ngjitur** (të dhëna të vazhdueshme), lartësia = f. Shënoje klasën modale (më e larta). Poligoni i frekuencave = bashko mesin e majës së çdo shtylle.

```
 f
35 |          ███
30 |          ███
25 |          ███ ███
20 |          ███ ███
15 |      ███ ███ ███
10 |  ███ ███ ███ ███ ███
 5 |  ███ ███ ███ ███ ███ ███
   +---------------------------
     60  62  64  66  68  70  72  kg
```

---

## 5. Rendi i punës në provim (që të mos humbësh pikë)
1. Ndërto tabelën ndihmëse (x, f·x, F). **Ky hap vlen pikë vetë.**
2. x̄ = Σfx/N.
3. Mo (klasa me f max) dhe Me (klasa ku F ≥ N/2). Shkruaj formulat para se të zëvendësosh.
4. G dhe H (me ln dhe me 1/x) – shkruaj shumat me 3 shifra pas presjes.
5. σ: kolona f(x−x̄)², pjesëto me N, rrënjë.
6. Q₁, Q₃, IQR.
7. Kontrollo: H ≤ G ≤ x̄; Me, Mo afër x̄; Q₁ < Me < Q₃.

---

## 6. Statistika vendimore: testimi i hipotezës për mesataren

Kjo temë është në syllabus edhe pse nuk është shfaqur në katër provimet e ruajtura. Duhet të dish procedurën bazë.

### Hapat që shkruhen në provim

1. Formulo **H₀: μ = μ₀**.
2. Zgjidh alternativën sipas tekstit:
   - **H₁: μ ≠ μ₀** – test dykahësh;
   - **H₁: μ > μ₀** – bishti i djathtë;
   - **H₁: μ < μ₀** – bishti i majtë.
3. Cakto nivelin e rëndësisë **α** (zakonisht 0.05).
4. Llogarit statistikën e testit.
5. Krahaso me vlerën kritike ose p-value dhe jep përfundimin **në kontekst**.

### Cilin test ta përdorësh?

**Devijimi i popullimit σ dihet** (ose mostra është e madhe dhe detyra kërkon Z):
> **z = (x̄ − μ₀) / (σ/√n)**

**σ nuk dihet**, popullimi është normal dhe përdoret devijimi i mostrës s:
> **t = (x̄ − μ₀) / (s/√n)**, me **df = n − 1**

| Alternativa | Refuzo H₀ me testin Z |
|---|---|
| μ ≠ μ₀ | |z| > z₁₋α/₂ |
| μ > μ₀ | z > z₁₋α |
| μ < μ₀ | z < −z₁₋α |

Vlerat më të zakonshme: për **α = 0.05**, z kritik dykahësh = **±1.96**, njëkahësh = **±1.645**; për **α = 0.01**, dykahësh = **±2.576**.

### Shembull i plotë me Z

Një prodhues pohon μ = 50. Merret mostër n = 36, x̄ = 52 dhe dihet σ = 6. Testo me α = 0.05 nëse mesatarja ka ndryshuar.

- H₀: μ = 50; H₁: μ ≠ 50.
- z = (52−50)/(6/√36) = 2/1 = **2.00**.
- Test dykahësh: |2.00| > 1.96 → **refuzohet H₀**.
- Përfundim: në nivelin 5% ka evidencë statistikore se mesatarja ndryshon nga 50.

> Mos shkruaj “H₀ u vërtetua”. Shkruaj **refuzohet H₀** ose **nuk ka evidencë të mjaftueshme për ta refuzuar H₀**. Gabimi i llojit I = refuzojmë H₀ kur është e vërtetë dhe ka probabilitet α.

---

## 8. Shtesë nga shënimet e dorës: masa të tjera për të dhënat

### 8.1 Mesatarja kuadratike

Mesatarja kuadratike (RMS) është

> **\(Q=\sqrt{\dfrac{\sum f_i x_i^2}{N}}\).**

Për të dhëna pozitive vlen renditja **\(H\le G\le \bar{x}\le Q\)**.

### 8.2 Mënjanimi mesatar absolut

Mënjanimi mesatar absolut rreth mesatares është

> **\(\operatorname{MAD}=\dfrac{\sum f_i|x_i-\bar{x}|}{N}\).**

Mos e ngatërro me devijimin standard: te MAD përdoren vlerat absolute; te varianca/devijimi standard përdoren katrorët.

### 8.3 Moda dhe mediana për të dhëna të pagrupuara

- **Moda** është vlera me frekuencën më të madhe; mund të mos ekzistojë ose mund të ketë disa moda.
- Pas renditjes, për \(n\) tek mediana është vlera në pozicionin \((n+1)/2\).
- Për \(n\) çift, mediana është mesatarja e vlerave në pozicionet \(n/2\) dhe \(n/2+1\).

### 8.4 IQR dhe mënjanimi kuartil

> **\(\operatorname{IQR}=Q_3-Q_1\),**
>
> **mënjanimi kuartil \(=\dfrac{Q_3-Q_1}{2}\).**

Pra këto dy madhësi nuk janë e njëjta gjë; e dyta është gjysma e IQR-së.

### 8.5 Shembull i verifikuar: 9, 10, 9, 13, 14, 16

\[
\bar{x}=\frac{71}{6}\approx11.833,\qquad
\sigma^2=\frac{257}{36}\approx7.139,\qquad
\sigma=\frac{\sqrt{257}}{6}\approx2.672.
\]

Me emërues \(n-1\), devijimi standard i mostrës është \(s=\sqrt{257/30}\approx2.927\). Mesatarja kuadratike është \(Q=\sqrt{883/6}\approx12.131\), ndërsa \(\operatorname{MAD}=2.5\).

> Vlera rreth 12.65 që shfaqet në një faqe të shënimeve nuk mund të jetë devijimi standard: ajo është më e madhe se amplituda 7. Rezultati i saktë me emërues \(N\) është **2.672**.

