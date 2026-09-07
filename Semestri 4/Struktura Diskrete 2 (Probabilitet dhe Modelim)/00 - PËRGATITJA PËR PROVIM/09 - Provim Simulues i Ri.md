# 09 – Provim simulues i ri

**Koha: 90 minuta · Totali: 100 pikë · Pa shënime**

Ky provim përfshin modelin e provimeve të ruajtura dhe dy temat shtesë nga syllabusi. Zgjidhe në letër. Mos shiko zgjidhjet deri sa të mbarojnë 90 minutat.

---

## PJESA A – PYETJET

### Detyra 1 – Kodi linear (12 pikë)

Jepet

```text
G = 1 0 | 1 1
    0 1 | 1 0
```

1. Gjenero të gjitha fjalëkodet.
2. Gjej d(C) dhe sa gabime zbulon/korrigjon kodi.
3. Ndërto matricën e kontrollit H dhe verifiko një fjalëkod jo-zero.

### Detyra 2 – Hamming [7,4] (13 pikë)

Përdor formën sistematike nga skedari `01`. Pranohet **r = 1011110**.

1. Llogarit sindromën s = Hrᵀ.
2. Gjej dhe korrigjo gabimin.
3. Nxirr mesazhin.

### Detyra 3 – Probabiliteti diskret (15 pikë)

Një kuti ka 8 lëmshe të bardha, 5 të kuqe dhe 7 të kaltra. Tërhiqen 3 pa kthim. X është numri i lëmsheve të kuqe.

1. Ndërto ligjin e shpërndarjes së X.
2. Gjej E(X) dhe D(X).

### Detyra 4 – Statistika dhe hipoteza (20 pikë)

| Intervali | 40–50 | 50–60 | 60–70 | 70–80 |
|---|---:|---:|---:|---:|
| Frekuenca | 8 | 12 | 20 | 10 |

1. Gjej x̄, medianën, modën dhe devijimin standard me emërues N.
2. Në një test tjetër jepen n=64, x̄=102, σ=8. Testo H₀:μ=100 kundër H₁:μ>100 me α=0.05.

### Detyra 5 – FG dhe FGE (15 pikë)

1. Gjej funksionin gjenerues të zakonshëm të vargut 0,0,4,1,4,1,4,1,…
2. Gjej vargun që ka funksion gjenerues eksponencial E(x)=e²ˣ.
3. Shpjego me një fjali dallimin mes FG dhe FGE.

### Detyra 6 – Rekurenca (15 pikë)

Zgjidh

> aₙ = 5aₙ₋₁ − 6aₙ₋₂ + 2ⁿ, me a₀=0 dhe a₁=1.

Kontrollo përgjigjen me a₂.

### Teoria – 4 pyetje (10 pikë)

1. Përkufizo probabilitetin e kushtëzuar dhe pavarësinë.
2. Çfarë është udhëheqësi i klasës në grupin standard?
3. Çfarë është gabimi i llojit I në testimin e hipotezave?
4. Jep përkufizimet e FG dhe FGE të vargut (aₙ).

---

## PJESA B – ZGJIDHJET DHE PIKËT

### Zgjidhja 1 (12 pikë)

Fjalëkodet:

- 00 → 0000
- 10 → 1011
- 01 → 0110
- 11 → 1101

Peshat jo-zero janë 3, 2, 3, prandaj **d(C)=2**: zbulon 1 gabim dhe nuk korrigjon gabime në mënyrë të garantuar.

P = [[1,1],[1,0]], prandaj

```text
H = Pᵀ | I₂ = 1 1 | 1 0
              1 0 | 0 1
```

P.sh. H·1011ᵀ = 00ᵀ. Pikët: fjalëkodet 4, d dhe kapaciteti 3, H 3, verifikimi 2.

### Zgjidhja 2 (13 pikë)

Me H nga skedari `01`, s = Hrᵀ = **100ᵀ**, që është kolona 5 e H. Gabimi është në bitin 5.

> r = 1011110 → c = **1011010** → m = **1011**.

Pikët: sindroma 5, pozicioni 3, korrigjimi 3, mesazhi 2.

### Zgjidhja 3 (15 pikë)

N=20, K=5 dhe C(20,3)=1140.

| k | 0 | 1 | 2 | 3 |
|---|---:|---:|---:|---:|
| P(X=k) | 455/1140 | 525/1140 | 150/1140 | 10/1140 |

Shuma e numëruesve është 1140. **E(X)=3·5/20=0.75**.

Me formulën hipergjeometrike:

> **D(X)=np(1−p)(N−n)/(N−1)=3·0.25·0.75·17/19 ≈ 0.5033**.

Pikët: tabela 9, pritja 3, varianca 3.

### Zgjidhja 4 (20 pikë)

Meset e klasave: 45,55,65,75. N=50, Σfx=3070, prandaj **x̄=61.4**.

- F kumulative: 8,20,40,50.
- **Me = 60 + (25−20)/20·10 = 62.5**.
- **Mo = 60 + (20−12)/[(20−12)+(20−10)]·10 ≈ 64.44**.
- Σf(x−x̄)² = 4752, prandaj **σ=√(4752/50)=√95.04≈9.75**.

Testi: H₀:μ=100, H₁:μ>100. **z=(102−100)/(8/√64)=2.00**. Me α=0.05, z kritik=1.645. Meqë 2.00>1.645, **refuzohet H₀**; ka evidencë se μ>100.

Pikët: x̄ 4, Me 3, Mo 3, σ 4, hipotezat 2, z 2, vendimi 2.

### Zgjidhja 5 (15 pikë)

Dy zero japin x² dhe 4,1,4,1,… ka FG (4+x)/(1−x²). Pra

> **F(x)=x²(4+x)/(1−x²)**.

E(x)=e²ˣ=Σ2ⁿxⁿ/n!, prandaj **aₙ=2ⁿ** → 1,2,4,8,16,…

FG = Σaₙxⁿ, kurse FGE = Σaₙxⁿ/n!. Pikët: FG 6, vargu nga FGE 5, dallimi 4.

### Zgjidhja 6 (15 pikë)

Homogjenja: r²−5r+6=(r−2)(r−3), prandaj hₙ=α2ⁿ+β3ⁿ. Meqë 2 është rrënjë, provojmë pₙ=An2ⁿ.

Zëvendësimi jep A=−2. Pra

> aₙ=α2ⁿ+β3ⁿ−2n2ⁿ.

Nga a₀=0 dhe a₁=1: α+β=0 dhe 2α+3β−4=1, prandaj α=−5, β=5.

> **aₙ = −5·2ⁿ + 5·3ⁿ − 2n·2ⁿ**.

Kontroll: a₂=5·1−6·0+4=9; formula jep −20+45−16=9. Pikët: homogjenja 4, forma e pₙ 3, A 3, kushtet 3, kontrolli 2.

### Zgjidhjet e teorisë (10 pikë)

1. P(B|A)=P(AB)/P(A), P(A)>0. A dhe B janë të pavarura kur P(AB)=P(A)P(B), ekuivalent me P(B|A)=P(B).
2. Udhëheqësi është vektori me peshë minimale i klasës a+C dhe merret si gabimi më i mundshëm.
3. Gabimi i llojit I është refuzimi i H₀ kur H₀ është e vërtetë; probabiliteti i tij është α.
4. FG: F(x)=Σaₙxⁿ. FGE: E(x)=Σaₙxⁿ/n!.

Jepen 2.5 pikë për secilën përgjigje të plotë.

---

## Interpretimi i rezultatit

- **85–100:** gati; puno vetëm gabimet dhe shpejtësinë.
- **70–84:** afër gatishmërisë; riparo çdo detyrë ku humbe mbi 30% të pikëve.
- **55–69:** rrezik; përsërit dy temat më të dobëta dhe bëj një provim tjetër.
- **Nën 55:** kthehu te plani nga Dita 1; mos u mbështet vetëm te formulari.
