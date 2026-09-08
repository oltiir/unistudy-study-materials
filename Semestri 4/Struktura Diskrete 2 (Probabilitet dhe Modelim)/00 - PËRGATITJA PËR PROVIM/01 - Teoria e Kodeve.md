# 01 – Teoria Algjebrike e Kodeve (Det. 1 dhe Det. 2 në provim ≈ 25 pikë)

> Në provim, dy detyrat e para janë GJITHMONË nga kodet: (1) matrica gjeneruese / kodet lineare,
> (2) kodi Hamming C[7,4] **ose** kodet polinomiale/ciklike me g(x). Kjo pjesë vlen ~25 pikë,
> dhe është më "mekanike" – nëse mëson procedurat, i merr pikët.

---

## 1. Fjalori bazë (kjo pyetet edhe si teori)

| Term | Kuptimi i thjeshtë |
|---|---|
| **Alfabeti GF(2) = {0,1}** | Punojmë vetëm me 0 dhe 1. Mbledhja bëhet **mod 2**: 1+1 = 0, 1+0 = 1, 0+0 = 0. (Është XOR.) |
| **Fjalëkod (codeword)** | Një varg i radhitur bitash (vektor) që i takon kodit C. P.sh. 1011. |
| **Kod C** | Një bashkësi fjalëkodesh. |
| **Bllok-kod** | Kod ku të gjitha fjalëkodet kanë gjatësi të njëjtë n. |
| **V(n,2)** | Hapësira e të gjithë vektorëve binarë me gjatësi n. Ka 2ⁿ vektorë. |
| **Pesha e Hammingut w(c)** | Numri i njësheve në fjalëkod. w(11011) = 4. |
| **Largesa e Hammingut d(x,y)** | Numri i pozicioneve ku x dhe y ndryshojnë. d(1101, 1011) = 2. Për kode binare: **d(x,y) = w(x+y)**. |
| **Largesa minimale d(C)** | Largesa më e vogël ndërmjet dy fjalëkodeve **të ndryshme** të C. |
| **Tipi i kodit (n, M, d)** | n = gjatësia, M = numri i fjalëkodeve, d = largesa minimale. |
| **Kodi linear C[n,k]** | n = gjatësia e fjalëkodit, k = gjatësia e mesazhit (bitat e informacionit). Ka 2ᵏ fjalëkode. n − k = bita kontrolli (redundancë). |
| **Shkalla e kodit** | k/n. Kodi Hamming [7,4] ka shkallë 4/7. |

**Vetitë e largesës së Hammingut (metrikë):**
1. d(x,y) ≥ 0 dhe d(x,x) = 0
2. d(x,y) = d(y,x)
3. d(x,y) ≤ d(x,z) + d(z,y)  (mosbarazimi i trekëndëshit)

**Pse ka rëndësi d(C)?**
- Kodi **zbulon** deri në **d − 1** gabime.
- Kodi **korrigjon** deri në **⌊(d − 1)/2⌋** gabime.
- Për Hamming [7,4]: d = 3 → zbulon 2, korrigjon 1 gabim.

---

## 2. Kodet lineare dhe matrica gjeneruese G

### Çka është kod linear?
C është **linear** nëse shuma (mod 2) e çdo dy fjalëkodeve është përsëri fjalëkod. Rrjedhimi: **000...0 është gjithmonë në C**.

Shembull: C = {000, 110, 011, 101}. 110 + 011 = 101 ∈ C ✓, 110 + 101 = 011 ∈ C ✓ → linear.

### Matrica gjeneruese G (k × n)
Rreshtat e G janë k fjalëkode **linearisht të pavarura** që gjenerojnë tërë kodin.
**Kodimi:** mesazhi m (1 × k) → fjalëkodi c = m · G (1 × n), gjithçka mod 2.

> Me fjalë: **c = shuma e rreshtave të G për të cilat m ka 1.**

Forma standarde (sistematike): **G = [ I_k | P ]** – në fillim matrica njësi, pastaj bitat e kontrollit.
Atëherë fjalëkodi = [mesazhi | bitat e paritetit].

**Shembull i zgjidhur.** G = [[1,0,1,1],[0,1,0,0]] (k=2, n=4).
- m = 00 → 0000
- m = 10 → rreshti 1 = 1011
- m = 01 → rreshti 2 = 0100
- m = 11 → 1011 + 0100 = 1111
C = {0000, 0100, 1011, 1111}. d(C) = pesha minimale jo-zero = w(0100) = 1. (Kod i dobët – s'korrigjon asgjë.)

> **Për kode lineare: d(C) = pesha më e vogël e një fjalëkodi ≠ 0.** (Nuk ka nevojë t'i krahasosh të gjitha çiftet!)

### Detyra tipike e provimit: "Gjeni G që fjalëkodet e C të shkruhen me gjatësi 4"
Së pari gjej **dimensionin e kodit të dhënë**, jo gjatësinë e fjalëkodeve. P.sh.
**C = {000, 100, 010, 110}** ka vetëm 4 fjalëkode, prandaj k = log₂4 = 2. Një bazë është {100, 010}.

Shtojmë bitin e paritetit çift dhe marrim bazën e zgjatur {1001, 0101}. Gjeneratori i saktë i kodit me katër fjalëkode është:

```
G' =  1 0 0 | 1
      0 1 0 | 1
```

G' gjeneron pikërisht C' = {0000, 1001, 0101, 1100}. Mos përdor një matricë 3×4 me rang 3 për këtë C: ajo do të gjeneronte 2³ = 8 fjalëkode, jo 4.

Vetëm nëse domeni i mesazheve është **i gjithë V(3,2)**, koduesi i paritetit është [I₃ | 1ᵀ] dhe prodhon kodin e plotë të paritetit me 8 fjalëkode. Dallo gjithmonë "koduesin e të gjitha mesazheve 3-bitëshe" nga "gjeneratori i kodit C të listuar".

### Forma polinomiale e një fjalëkodi
Fjalëkodi c = c₀c₁c₂…c_{n−1} ↔ **c(x) = c₀ + c₁x + c₂x² + … + c_{n−1}x^{n−1}**
(biti i parë majtas = koeficienti i x⁰).
- 1001 → 1 + x³
- 1100 → 1 + x
- 0101 → x + x³
- 0000 → 0

---

## 3. Matrica e kontrollit H dhe sindroma

**Matrica e kontrollit (parity-check) H** është matricë (n−k) × n e tillë që:
> **c ∈ C  ⇔  H · cᵀ = 0**  (dhe rrjedhimisht **G · Hᵀ = 0**).

Nëse G = [ I_k | P ] atëherë **H = [ Pᵀ | I_{n−k} ]**. (Këtë formulë mësoje përmendësh.)

**Sindroma** e vektorit të pranuar r: **s = H · rᵀ**.
- s = 0 → r është fjalëkod, pranohet (asnjë gabim i zbuluar).
- s ≠ 0 → ka gabim. Nëse s është e barabartë me **kolonën j të H**, gabimi është në pozicionin j → ndrysho bitin j.

---

## 4. Kodi Hamming C[7,4] (shumë i pyetur!)

- n = 7, k = 4, 3 bita kontrolli, 2⁴ = 16 fjalëkode, d = 3, korrigjon **deri në 1 gabim**.
- **H** (3 × 7): kolonat janë **të gjithë vektorët binarë jo-zero me gjatësi 3** (7 copë). Renditja e kolonave përcakton G.

Forma sistematike që rekomandoj (mësoje këtë):

```
      1 0 0 0 | 1 1 0             1 1 0 1 | 1 0 0
G =   0 1 0 0 | 1 0 1       H =   1 0 1 1 | 0 1 0
      0 0 1 0 | 0 1 1             0 1 1 1 | 0 0 1
      0 0 0 1 | 1 1 1
```
Kontroll: pjesa P e G (kolonat 5-7) e transponuar = pjesa e majtë e H. ✓

**Kodimi i m = m₁m₂m₃m₄:** c = m₁ m₂ m₃ m₄ p₁ p₂ p₃ ku
- p₁ = m₁ + m₂ + m₄
- p₂ = m₁ + m₃ + m₄
- p₃ = m₂ + m₃ + m₄

**Shembull (provim): m = 0110**
p₁ = 0+1+0 = 1, p₂ = 0+1+0 = 1, p₃ = 1+1+0 = 0 → **c = 0110 110**.
Kontroll me rreshta: c = rreshti₂ + rreshti₃ = 0100101 + 0010011 = 0110110 ✓

**Dekodimi (korrigjimi) me sindromë:** s = H·rᵀ. Nëse s ≠ 0, s përputhet me një kolonë të H → ai pozicion është gabim.

> Shënim: Ekziston edhe forma "klasike" me pozicionet p₁p₂d₁p₃d₂d₃d₄ (bitat e kontrollit në pozicionet 1,2,4). Aty m=0110 → 1100110. Të dyja janë të sakta – thuaj cilën konventë përdor.

---

## 5. Grupi standard (standard array) përmes klasave a + C

Kjo është metoda e dekodimit për **çdo** kod linear të vogël. Përdoret kur detyra thotë *"formo grupin standard nëpërmjet klasave a+C, detekto gabimin dhe korrigjo vektorin r"*.

**Procedura:**
1. Shkruaj të gjitha fjalëkodet e C (rreshti i parë, fillon me 0…0).
2. Zgjidh një vektor **a ∉ përdorur ende**, me **peshë më të vogël** (udhëheqësi i klasës / coset leader). Shkruaj rreshtin a + C (a mbledhur me çdo fjalëkod).
3. Përsërit derisa të përdoren të gjithë 2ⁿ vektorët e V(n,2). Do të kesh 2ⁿ⁻ᵏ rreshta.
4. **Dekodimi:** gjej r në tabelë. **Udhëheqësi i rreshtit = vektori i gabimit e.** Fjalëkodi i korrigjuar = **fjalëkodi në krye të kolonës** (= r + e).

**Shembull i zgjidhur (provim):** G = [[1,0,1,1],[0,1,0,0]], r = 1110.
C = {0000, 1011, 0100, 1111}.

| udhëheqësi | a + C |||| 
|---|---|---|---|---|
| **0000** | 0000 | 1011 | 0100 | 1111 |
| **1000** | 1000 | 0011 | 1100 | 0111 |
| **0010** | 0010 | 1001 | 0110 | 1101 |
| **0001** | 0001 | 1010 | 0101 | **1110** |

r = 1110 është në rreshtin me udhëheqës **0001** → gabimi është në bitin e 4-t.
Fjalëkodi i korrigjuar: c = 1110 + 0001 = **1111** (kreu i kolonës). Mesazhi: 1111 = rreshti₁ + rreshti₂ e G → **m = 11**.

> Kujdes: nëse në një klasë ka dy vektorë me peshë minimale të njëjtë, kodi nuk e korrigjon atë gabim në mënyrë unike. Zgjedh njërin dhe shëno që nuk është unik.

---

## 6. Kodet polinomiale dhe ciklike me g(x)

### Aritmetika e polinomeve mod 2
- Koeficientët janë 0/1, **x + x = 0**, **−x = +x**.
- (1 + x)(1 + x) = 1 + x + x + x² = **1 + x²**.
- Pjesëtimi bëhet si pjesëtim normal i polinomeve, por zbritja = mbledhja (XOR).

### Kodimi
Polinomi gjenerues g(x) ka shkallë **n − k**. Mesazhi m = m₀m₁…m_{k−1} → m(x). 
> **c(x) = m(x) · g(x)** → fjalëkodi ka shkallë ≤ n − 1 → gjatësi n.

**Shembull (provim): m = 1001, g(x) = x⁴ + x² + x + 1.**
m(x) = 1 + x³ (k=4, deg g = 4 → n = 8).
c(x) = (1 + x³)(1 + x + x² + x⁴) = 1 + x + x² + x⁴ + x³ + x⁴ + x⁵ + x⁷ = **1 + x + x² + x³ + x⁵ + x⁷** (x⁴ + x⁴ = 0)
→ **c = 11110101**.

### Dekodimi / zbulimi i gabimit
Pranohet r(x). **Pjesëto r(x) me g(x):** r(x) = q(x)·g(x) + s(x).
- **s(x) = 0** → nuk ka gabim (të zbuluar). Mesazhi = **q(x)** (herësi).
- **s(x) ≠ 0** → ka gabim. s(x) është **sindroma**.

**Shembull (provim): r = 1110011, g(x) = x³ + x² + x + 1.**
r(x) = 1 + x + x² + x⁵ + x⁶. Pjesëtojmë me g(x) (nga shkalla më e lartë):

```
x⁶ + x⁵ + x² + x + 1  :  x³ + x² + x + 1
x⁶ + x⁵ + x⁴ + x³              ← x³·g(x)
------------------
        x⁴ + x³ + x² + x + 1
        x⁴ + x³ + x² + x       ← x·g(x)
        ------------------
                          1     ← mbetja
```
q(x) = x³ + x, **s(x) = 1 ≠ 0 → ka pasur gabim gjatë transmetimit.**

### Korrigjimi i një gabimi te kodet ciklike (tabela e sindromave)
Nëse gabimi është në pozicionin i, atëherë r(x) = c(x) + xⁱ dhe **s(x) = xⁱ mod g(x)**.
Ndërto tabelën: për i = 0..n−1 llogarit xⁱ mod g(x). Krahaso me s(x) → gjen i → ndrysho bitin i.

Për g(x) = 1 + x + x³ (Hamming ciklik [7,4]):

| i | xⁱ mod g(x) |
|---|---|
| 0 | 1 |
| 1 | x |
| 2 | x² |
| 3 | 1 + x |
| 4 | x + x² |
| 5 | 1 + x + x² |
| 6 | 1 + x² |

Të 7 sindromat janë **të ndryshme** → çdo gabim i vetëm korrigjohet. Kjo është arsyeja pse g duhet të jetë "i vlefshëm".

### Kur "vlen" g(x) për një kod ciklik C[n,k]?
1. deg g(x) = n − k.
2. **g(x) pjesëton x^n + 1** (mod 2). Kjo garanton që zhvendosja ciklike e një fjalëkodi mbetet fjalëkod.

Faktorizimi që duhet ta dish: **x⁷ + 1 = (x + 1)(x³ + x + 1)(x³ + x² + 1)**.
→ Për C[7,4] të vlefshëm janë **vetëm** g(x) = x³ + x + 1 ose g(x) = x³ + x² + 1.
→ g(x) = 1 + x³ **nuk** pjesëton x⁷+1 (mbetja x + 1) → nuk është kod ciklik i vërtetë; d = 2 → vetëm zbulon, s'korrigjon.
→ x⁸ + 1 = (x + 1)⁸, prandaj g = x⁴ + x² + x + 1 = (x+1)(x³+x²+1) **nuk** vlen për n = 8. Nëse provimi thotë "nëse g nuk vlen, gjenero një tjetër", zgjidh p.sh. **g(x) = x³ + x + 1** (n=7) dhe kodo përsëri: (1 + x³)(1 + x + x³) = 1 + x + x⁴ + x⁶ → **1100101**.

---

## 7. Procedura "hap pas hapi" për çdo tip detyre (për t'i mbajtur mend)

**A. "Gjeni G / gjeneroni kodin nga G":**
1. Numëro k = rreshtat, n = kolonat. 2. Bëj të gjitha 2ᵏ kombinimet e rreshtave (mod 2). 3. Shkruaj C. 4. d(C) = pesha min jo-zero.

**B. "Kodo mesazhin me Hamming [7,4]":**
1. Shkruaj G sistematike. 2. c = m·G ose me formulat p₁,p₂,p₃. 3. Kontrollo: H·cᵀ = 0.

**C. "Ndërto H dhe G për Hamming":**
1. H = 7 kolona = të gjithë vektorët jo-zero 3-bitësh, renditi që 3 të fundit të jenë I₃. 2. G = [I₄ | Pᵀ-pjesa].

**D. "Grupi standard a + C, korrigjo r":**
1. Rreshti 1 = C. 2. Rreshtat tjerë = udhëheqës me peshë min + C. 3. Gjej r → udhëheqësi = gabimi → c = r + e. 4. Mesazhi nga c.

**E. "Kodo m me g(x)":** c(x) = m(x)·g(x), zgjero, hiq çiftet (x^i + x^i = 0), shkruaj vektorin.

**F. "A ka gabim r me g(x)?":** pjesëto r(x) : g(x). Mbetja 0 → jo; ≠ 0 → po. Herësi = mesazhi (nëse s'ka gabim).

**G. "Fjalëkodi i pranueshëm + mesazhi" (kod ciklik):** pjesëto, gjej s(x); gjej i me xⁱ mod g = s(x); c = r + xⁱ; m(x) = c(x)/g(x).

---

## 9. Shtesë nga shënimet e dorës: ISBN, UPC dhe pariteti dydimensional

### 9.1 Kodet kontrolluese të shifrave

Këto kode zakonisht **zbulojnë** gabime në shkrimin/skanimin e numrave; nuk janë kode që korrigjojnë vetë një bit si Hamming.

#### ISBN-10

Për shifrat \(d_1d_2\ldots d_{10}\) duhet të vlejë

> **\(10d_1+9d_2+\cdots+2d_9+d_{10}\equiv0\pmod{11}\).**

Shifra e fundit mund të jetë **X**, që përfaqëson 10. Për ta gjetur, llogarit shumën e nëntë shifrave të para dhe zgjidh \(d_{10}\equiv-S\pmod{11}\).

Shembull verifikimi: 0-306-40615-2 jep shumën 132, e cila pjesëtohet me 11, prandaj kodi është i vlefshëm.

#### ISBN-13

Për 12 shifrat e para përdoren peshat alternuese 1,3,1,3,…:

> **\(S=d_1+3d_2+d_3+3d_4+\cdots+3d_{12}\),**
>
> **\(d_{13}=(10-(S\bmod10))\bmod10\).**

Shembull: për 978-1-4028-9462-?, \(S=104\), prandaj shifra kontrolluese është **6**.

#### UPC-A

UPC-A ka 11 shifra të dhënash dhe një shifër kontrolluese. Pozicionet tek të 11 shifrave të para shumëzohen me 3, pozicionet çift me 1:

> **\(S=3(d_1+d_3+d_5+d_7+d_9+d_{11})+(d_2+d_4+d_6+d_8+d_{10})\),**
>
> **\(d_{12}=(10-(S\bmod10))\bmod10\).**

Shembull: 03600029145-? jep \(S=58\), prandaj shifra kontrolluese është **2**.

> **Kujdes:** ISBN-13 fillon me peshën 1; UPC-A fillon me peshën 3.

### 9.2 Kodi me paritet dydimensional (2D parity)

Bitat e të dhënave vendosen në një matricë. Shtohet nga një bit pariteti për çdo rresht dhe çdo kolonë (zakonisht paritet çift), si dhe biti i këndit.

~~~text
Të dhënat        Pariteti i rreshtit
1 0 1 1 | 1
0 1 0 1 | 0
1 1 0 0 | 0
---------+--
0 0 1 0 | 1
Paritetet e kolonave
~~~

Nëse ndryshon **një bit**, saktësisht një rresht dhe një kolonë dështojnë kontrollin; prerja e tyre jep pozicionin e gabimit, kështu që gabimi korrigjohet.

- Korrigjon me siguri një gabim bit.
- Zbulon shumë gabime të shumëfishta.
- Nuk zbulon çdo model: katër gabime në cepat e një drejtkëndëshi ruajnë paritetin e çdo rreshti dhe kolone.

### 9.3 Kontroll i shpejtë në provim

1. Shkruaj peshat mbi shifrat/bitat.
2. Llogarit shumën pa e reduktuar herët.
3. Apliko mod 11 për ISBN-10 ose mod 10 për ISBN-13/UPC.
4. Verifiko duke futur edhe shifrën e gjetur: kongruenca duhet të japë 0.

