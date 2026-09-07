# 02 – Probabiliteti Diskret (Det. 3 në provim ≈ 10–17 pikë + 1–2 pyetje teorike)

> Detyra 3 është **gjithmonë** njëra nga këto dy: (a) kutia me lëmshe, tërhiqen 3 pa kthim, X = numri i një ngjyre →
> tabela e ligjit të shpërndarjes + pritja matematike (+ dispersioni); ose (b) probabiliteti i plotë / Bajesi
> (dy kuti/parkingje, kalon diçka nga e para te e dyta). Të dyja janë të zgjidhura më poshtë.

---

## 1. Ngjarjet dhe përkufizimi klasik

- **Eksperiment i rastit**: hedhja e zarit, tërheqja e lëmshit…
- **Ngjarje elementare Eᵢ**: një rezultat i vetëm i eksperimentit. **Ω = {E₁,…,Eₙ}** hapësira e ngjarjeve elementare.
- **Ngjarja e sigurt Ω**, **ngjarja e pamundur ∅**.
- **Ngjarja e kundërt Ā**: ndodh kur A nuk ndodh. A + Ā = Ω.
- **Ngjarje të volitshme** për A: ngjarjet elementare që e realizojnë A. (P.sh. kuti me 7 kuq, 5 bardhë; A = "kuq" → 7 ngjarje të volitshme nga 12.)
- **Ngjarje disjunkte (të papajtueshme)**: nuk mund të ndodhin njëkohësisht, AB = ∅.

**Përkufizimi klasik i probabilitetit:**
> **P(A) = m / n** = (numri i ngjarjeve të volitshme për A) / (numri i të gjitha ngjarjeve elementare, të njëmundshme).

### Vetitë e probabilitetit (pyetje teorike e shpeshtë!)
1. P(A) ≥ 0
2. P(Ω) = 1, P(∅) = 0
3. 0 ≤ P(A) ≤ 1
4. **P(Ā) = 1 − P(A)**
5. Nëse A ⊂ B, atëherë P(A) ≤ P(B)
6. A, B disjunkte → **P(A + B) = P(A) + P(B)**
7. Në përgjithësi: **P(A ∪ B) = P(A) + P(B) − P(AB)**

**Shembull.** Zari: A = "çift" = {2,4,6}, B = "pjesëtueshëm me 3" = {3,6}. AB = {6}.
P(A∪B) = 3/6 + 2/6 − 1/6 = 4/6 = 2/3.

---

## 2. Probabiliteti i kushtëzuar. Ngjarje të varura / të pavarura

- **P(B|A)** = probabiliteti i B **me kusht që** A ka ndodhur. **P(B|A) = P(AB) / P(A)**.
- **Ngjarje të pavarura**: ndodhja e njërës nuk ndikon tjetrën → **P(AB) = P(A)·P(B)**.
  Shembull: dy hedhje zari, tërheqje **me kthim**.
- **Ngjarje të varura**: **P(AB) = P(A)·P(B|A)**.
  Shembull: tërheqje **pa kthim** – pas tërheqjes së parë ndryshon përbërja e kutisë.
- Për tre ngjarje: **P(ABC) = P(A)·P(B|A)·P(C|AB)**.

**Shembull (varura).** Kuti: 8 bardhë, 5 kuq, pa kthim. P(2 bardhë radhazi) = 8/13 · 7/12 = 56/156 = 14/39.
**Shembull (pavarura).** Me kthim: 8/13 · 8/13 = 64/169.

**Shembull (kushtëzuar).** Zari, dihet që ra ≤ 4. P(çift | ≤4) = P(çift dhe ≤4)/P(≤4) = (2/6)/(4/6) = 1/2.

---

## 3. Degëzimet (pema e probabilitetit)

Kur tërheqim disa herë radhazi, vizato pemën: çdo degë ka probabilitetin e saj (që ndryshon pa kthim), **shumëzo** përgjatë rrugës, **mblidh** rrugët që japin rezultatin e kërkuar.

Çantë me 8 bardhë (B) dhe 3 zi (Z), tërhiqen 2 pa kthim, P(një B dhe një Z në çfarëdo renditje):
P(BZ) + P(ZB) = 8/11·3/10 + 3/11·8/10 = 24/110 + 24/110 = 48/110 = 24/55.

---

## 4. Probabiliteti i plotë dhe formula e Bajesit

**Sistem i plotë hipotezash H₁,…,Hₙ**: janë disjunkte dhe H₁ + … + Hₙ = Ω (njëra prej tyre ndodh sigurt).

**Formula e probabilitetit të plotë (total):**
> **P(A) = Σ P(Hₖ)·P(A|Hₖ) = P(H₁)P(A|H₁) + … + P(Hₙ)P(A|Hₙ)**

**Formula e Bajesit** (probabiliteti i "shkakut" pasi dimë pasojën):
> **P(Hᵢ|A) = P(Hᵢ)·P(A|Hᵢ) / P(A)**, ku P(A) llogaritet me formulën e plotë.

Për çka shërben Bajesi? **Për të gjetur probabilitetin e hipotezës (shkakut) kur dimë se ngjarja A ka ndodhur** – "ndryshojmë mendimin" për shkaqet pas vëzhgimit.

**Shembull (libri 9.6.2/9.6.3).** Tri fabrika: P(H₁)=1/2, P(H₂)=P(H₃)=1/4. Defekt: 2%, 2%, 4%.
P(A) = 0.5·0.02 + 0.25·0.02 + 0.25·0.04 = 0.025.
P(H₁|A) = 0.5·0.02/0.025 = **0.4**.

**Shembull (kubi + dy kuti, 9.6.4).** Nëse zari bie 1 ose 6 → kutia 1 (3 zi, 2 bardhë, 1 gjelbër), ndryshe kutia 2 (4 bardhë, 2 gjelbër). A = "bardhë".
P(H₁) = 2/6 = 1/3, P(H₂) = 2/3, P(A|H₁) = 2/6 = 1/3, P(A|H₂) = 4/6 = 2/3.
P(A) = 1/3·1/3 + 2/3·2/3 = 1/9 + 4/9 = **5/9**. P(H₁|A) = (1/9)/(5/9) = **1/5**.

### Detyra tipike e provimit: dy parkingje (Bajes/prob. i plotë)
Parkingu 1: 6 bardhë, 3 zeza, 5 kuqe (14). Parkingu 2: 4 bardhë, 5 zeza, 3 kuqe (12).
Nga P1 kalojnë 2 vetura te P2, pastaj nga P2 tërhiqet 1. P(e bardhë)?

**Hipotezat** = sa vetura të bardha kaluan (0, 1 ose 2). Tërheqja e 2 veturave nga 14: C(14,2) = 91.
- H₀: 0 bardhë: P = C(8,2)/91 = 28/91. Pastaj P2 ka 4 bardhë nga 14 → P(A|H₀) = 4/14
- H₁: 1 bardhë: P = 6·8/91 = 48/91. P2 ka 5 bardhë nga 14 → 5/14
- H₂: 2 bardhë: P = C(6,2)/91 = 15/91. P2 ka 6 bardhë nga 14 → 6/14

P(A) = 28/91·4/14 + 48/91·5/14 + 15/91·6/14 = (112 + 240 + 90)/(91·14) = 442/1274 = **17/49 ≈ 0.347**.

> Trik kontrolli: numri mesatar i bardhëve në P2 pas kalimit = 4 + 2·(6/14) = 34/7; P = (34/7)/14 = 34/98 = 17/49 ✓.

---

## 5. Ndryshorja e rastit diskrete dhe ligji i shpërndarjes

**Ndryshore e rastit X**: funksion që çdo ngjarjeje elementare i shoqëron një numër real. Diskrete = merr vlera të numërueshme x₁, x₂, …

**Ligji i shpërndarjes** = tabela vlerë/probabilitet:

```
X = ( x₁   x₂   …   xₙ )        me  p₁ + p₂ + … + pₙ = 1  (KONTROLLO GJITHMONË!)
    ( p₁   p₂   …   pₙ )
```

**Funksioni i shpërndarjes** F(x) = P(X ≤ x) (shumat kumulative të probabiliteteve).

---

## 6. Karakteristikat numerike

**Pritja matematike (mesatarja):**
> **E(X) = Σ xᵢ·pᵢ = x₁p₁ + x₂p₂ + … + xₙpₙ**

Vetitë: E(c) = c; E(cX) = c·E(X); E(X+Y) = E(X)+E(Y); për X,Y **të pavarura** E(XY) = E(X)E(Y).

**Dispersioni (varianca):**
> **D(X) = E(X²) − [E(X)]²**, ku **E(X²) = Σ xᵢ²·pᵢ**

(Përkufizimi origjinal: D(X) = Σ (xᵢ − E(X))²·pᵢ – jep të njëjtin numër.)
**Devijimi standard σ = √D(X)**. Sa më i vogël D(X), sa më "homogjene"/e parashikueshme ndryshorja.

**Shembull (dy ushtarë, libri 9.8.4/9.8.5):**
X: 8,9,10 me 0.1,0.3,0.6 → E(X) = 0.8+2.7+6 = 9.5; E(X²) = 6.4+24.3+60 = 90.7; D(X) = 90.7 − 90.25 = **0.45**.
Y: 8,9,10 me 0.2,0.1,0.7 → E(Y) = 9.5; E(Y²) = 12.8+8.1+70 = 90.9; D(Y) = **0.65**. Ushtari I është më i saktë (D më i vogël).

---

## 7. DETYRA STANDARDE E PROVIMIT: kutia, 3 tërheqje pa kthim

**Në një kuti ka 9 bardhë, 6 kuq, 6 verdhë. Tërhiqen 3 radhazi pa kthim. X = numri i lëmsheve të bardhë. Ligji i shpërndarjes, E(X).** (gjithsej N = 21, B = 9 bardhë, jo-bardhë = 12)

X ∈ {0, 1, 2, 3}.

**Metoda 1 – pema (si në libër):** shumëzo probabilitetet radhazi; për X=1 ka 3 renditje (B̄B̄B, B̄BB̄, BB̄B̄) me probabilitet të njëjtë.
- P(X=0) = 12/21 · 11/20 · 10/19 = 1320/7980 = **0.1654**
- P(X=1) = 3 · (9/21 · 12/20 · 11/19) = 3·1188/7980 = **0.4466**
- P(X=2) = 3 · (9/21 · 8/20 · 12/19) = 3·864/7980 = **0.3248**
- P(X=3) = 9/21 · 8/20 · 7/19 = 504/7980 = **0.0632**
Shuma = 1.0000 ✓

**Metoda 2 – kombinimet (më e shpejtë, e njëjta përgjigje):**
> **P(X = k) = C(B,k)·C(N−B, 3−k) / C(N,3)**
C(21,3) = 1330. P(0) = C(12,3)/1330 = 220/1330; P(1) = 9·C(12,2)/1330 = 594/1330; P(2) = C(9,2)·12/1330 = 432/1330; P(3) = C(9,3)/1330 = 84/1330. (220+594+432+84 = 1330 ✓)

**Tabela:**
```
X = (   0        1        2        3    )
    ( 0.1654   0.4466   0.3248   0.0632 )
```
**E(X)** = 0·0.1654 + 1·0.4466 + 2·0.3248 + 3·0.0632 = 0.4466 + 0.6496 + 0.1896 = **1.2857** (= 3·9/21 = 9/7 saktësisht ✓)
**E(X²)** = 0.4466 + 4·0.3248 + 9·0.0632 = 0.4466 + 1.2992 + 0.5688 = 2.3146
**D(X)** = 2.3146 − 1.2857² = 2.3146 − 1.6530 = **0.6612**

> **Kontroll i shpejtë:** E(X) = n·(B/N) gjithmonë (3 · 9/21). Nëse nuk të del kjo, ke gabuar në tabelë.

---

## 8. Shpërndarja binomiale (n prova të pavarura, me kthim)

Nëse çdo provë ka sukses me probabilitet p (q = 1 − p) dhe provat janë **të pavarura** (p.sh. tërheqje **me kthim**, hedhje monedhe):
> **P(X = k) = C(n,k) · pᵏ · qⁿ⁻ᵏ**,  k = 0,1,…,n.   X ~ B(n,p)
> **E(X) = n·p**, **D(X) = n·p·q**

**Shembull.** 3 ushtarë me p = 0.6 secili. P(X=2) = C(3,2)·0.6²·0.4 = 3·0.36·0.4 = 0.432.
**Shembull (libri 9.12.29).** p = 0.6, n = 8: P(X=3) = C(8,3)·0.6³·0.4⁵ = 56·0.216·0.01024 = 0.124.

**Shpërndarja e Puasonit** (n i madh, p i vogël, λ = np): P(X=k) = λᵏe^(−λ)/k!. λ=1: P(X=2) = e⁻¹/2 = 0.184.

---

## 9. Gabimet më të shpeshta (shmangi!)
1. Harron të kontrollosh Σpᵢ = 1.
2. Pa kthim: emëruesi **zvogëlohet** (21, 20, 19). Me kthim: mbetet i njëjtë.
3. Për X = 1 ose X = 2 harron t'i shumëzosh me **3** (numri i renditjeve). Në përgjithësi me C(3,k).
4. D(X) = E(X²) − [E(X)]², **jo** E(X²) − E(X).
5. Në Bajes, emëruesi është **P(A) e plotë**, jo vetëm një term.
