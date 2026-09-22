# 01 - Flowcharts

## Burimet e mbuluara

- `00Intro.pdf`
- `1. Flowcharts - Detyrat e shtëpisë.pdf`
- `Flowcharts - Detyra të zgjidhura & detyra për ushtrime.pdf`

## Ideja

Algoritmi është një varg hapash të fundëm dhe të qartë që transformon inputin në output. Flowchart-i e paraqet këtë rrjedhë grafikisht. Në provim vlerësohet logjika: inicializimi, kushti, përditësimi dhe dalja.

## Simbolet

| Simboli | Kuptimi |
|---|---|
| Oval | fillimi/fundi |
| Paralelogram | input/output |
| Drejtkëndësh | proces ose llogaritje |
| Romb | vendim/kusht me Po/Jo |
| Shigjetë | drejtimi i ekzekutimit |

Një romb duhet të ketë dalje të etiketuara qartë. Cikli duhet të ketë shigjetë kthimi te kushti.

## Modeli 1: llogaritje lineare

Shembull BMI:

```text
Fillimi
Lexo w, h
bmi = w / (h * h)
Shfaq bmi
Fundi
```

Kontrollo që njësitë janë kilogramë dhe metra dhe që `h != 0`.

## Modeli 2: shuma me cikël

Shuma e katrorëve nga 4 deri në `n`:

```text
Lexo n
s = 0
i = 4
derisa i <= n:
    s = s + i*i
    i = i + 1
Shfaq s
```

Invariant: para çdo iterimi, `s` përmban shumën për vlerat nga 4 deri në `i-1`.

Për vetëm numra çift, fillo `i = 2` dhe bëj `i = i + 2`. Për numra tek, fillo me vlerën e parë teke dhe shto 2.

## Modeli 3: prodhimi dhe faktorieli

```text
p = 1
i = a
derisa i <= b:
    p = p * i
    i = i + 1
```

Shuma inicializohet me `0`; prodhimi dhe faktorieli me `1`. Ky është gabim shumë i shpeshtë.

Faktorieli `n!`:

```text
f = 1
i = 2
derisa i <= n:
    f = f * i
    i = i + 1
```

## Modeli 4: funksion pjesë-pjesë

Për një funksion me tri raste:

```text
Lexo x
nëse x < a:
    y = formula1
përndryshe nëse x <= b:
    y = formula2
përndryshe:
    y = formula3
Shfaq y
```

Shkruaj kufijtë pa boshllëk dhe pa mbivendosje. Për shembull: `x < a`, `a <= x < b`, `x >= b`.

## Modeli 5: proces real

Në detyrën e blerjes online, identifiko gjendjet dhe vendimet:

1. Shfleto produktet.
2. Shto produkt në shportë?
3. Përdoruesi është i kyçur? Nëse jo, login/regjistrim.
4. Vazhdo në checkout apo kthehu te shfletimi?
5. Zgjidh pagesën dhe valido të dhënat.
6. Pagesa u pranua? Konfirmo; përndryshe provo përsëri/anulo.

Mos e vendos tërë tekstin në një drejtkëndësh. Çdo pyetje Po/Jo është romb më vete.

## Si të përkthesh formulën në flowchart

Për shprehje me shumë/shuma/prodhime:

1. Ndaji termat.
2. Krijo accumulator për secilin: `s=0`, `p=1`, `f=1`.
3. Zgjidh iteratorin dhe kufijtë.
4. Ekzekuto ciklet.
5. Bashko rezultatet në formulën finale.

Shembull për `y = 2 * sum(i+n)` për `i` tek nga 1 deri `3n`, minus `7 * product(k)` nga 7 deri `n+3`:

```text
s = 0
i = 1
while i <= 3*n:
    s = s + i + n
    i = i + 2

p = 1
k = 7
while k <= n+3:
    p = p * k
    k = k + 1

y = 2*s - 7*p
```

## Shembull i zgjidhur hap pas hapi

**Detyra:** Gjej shumën e kubeve të numrave çift nga `2` deri në `n`. Provoje për `n = 8`.

1. Input-i është `n`; output-i është shuma `S`.
2. Shuma nis me `S = 0`.
3. Meqë duhen vetëm numrat çift, nis me `i = 2` dhe rrite me `2`.
4. Për sa kohë `i <= n`, shto `i³` në shumë.

```text
Lexo n
S = 0
i = 2
derisa i <= n:
    S = S + i*i*i
    i = i + 2
Shfaq S
```

Gjurmimi për `n = 8`:

| `i` | `i³` | `S` para | `S` pas |
|---:|---:|---:|---:|
| 2 | 8 | 0 | 8 |
| 4 | 64 | 8 | 72 |
| 6 | 216 | 72 | 288 |
| 8 | 512 | 288 | 800 |

Pas rritjes së fundit `i = 10`, kushti `10 <= 8` është i pavërtetë. Prandaj output-i është `800`. Në flowchart, kontrolli `i <= n?` është romb; dega **Po** shkon te llogaritja, ndërsa **Jo** te output-i.

### Detyrë për ty

Ndërto pseudokodin dhe flowchart-in për shumën e katrorëve të numrave tek nga `3` deri në `n`. Bëje trace-in për `n = 9`. Për vetëkontroll, rezultati final duhet të jetë `3² + 5² + 7² + 9² = 164`.

## Gabimet tipike

- Harron inicializimin.
- Përdor `i++` kur kërkohen vetëm numrat çift/tek.
- Kushti është `i < n` kur detyra kërkon ta përfshijë `n`.
- Nuk përditëson iteratorin dhe krijon cikël të pafund.
- Degët e funksionit pjesë-pjesë nuk mbulojnë çdo vlerë.
- Output-i vendoset brenda ciklit kur kërkohet vetëm rezultati final.

## Kontrolli i njohurive

1. Me çfarë inicializohet shuma dhe me çfarë prodhimi?
2. Si paraqitet `for (i=2; i<=n; i+=2)` si flowchart?
3. Cili simbol përdoret për input dhe cili për kusht?
4. Si sigurohesh që funksioni pjesë-pjesë mbulon çdo vlerë?

## Ushtrime

1. Vizato shumën e kubeve të numrave çift nga 2 deri në `n`.
2. Vizato llogaritjen e `(n+6)! + 2n - 5n!`.
3. Vizato zgjedhjen qytet/mal/plazh sipas buxhetit.
4. Merr një formulë nga PDF-ja dhe, para vizatimit, shkruaje në pseudokod.
