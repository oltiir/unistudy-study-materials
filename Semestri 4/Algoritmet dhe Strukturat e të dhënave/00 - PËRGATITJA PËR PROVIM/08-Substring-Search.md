# 08 - Substring Search: Brute Force, KMP, Boyer-Moore dhe Rabin-Karp

Video përkatëse: [Ligjërata 9](https://www.youtube.com/watch?v=pJu-I9fCz2g) dhe [Ushtrimi 9](https://www.youtube.com/watch?v=X0wzWf367Cg).

## 1. Problemi

Kemi:

- text `T` me gjatësi `N`;
- pattern `P` me gjatësi `M`.

Duam indeksin e parë ku `P` paraqitet brenda `T`.

```text
Text:    A B A B C A B A B
Index:   0 1 2 3 4 5 6 7 8
Pattern:     A B C
```

Pattern `ABC` fillon në indeksin 2.

Nëse pattern nuk gjendet, metoda mund të kthejë `N`, `-1` ose një vlerë tjetër sipas API-së. Në provim sqaroje konventën që përdor.

## 2. Brute Force - versioni me dy indekse

Provo pattern-in duke filluar në çdo pozitë të mundshme të text-it.

```text
për i = 0 deri N-M:
    për j = 0 deri M-1:
        nëse T[i+j] != P[j]:
            break

    nëse j == M:
        kthe i
```

### Java

```java
static int bruteForce(String text, String pattern) {
    int N = text.length();
    int M = pattern.length();

    for (int i = 0; i <= N - M; i++) {
        int j;

        for (j = 0; j < M; j++) {
            if (text.charAt(i + j) != pattern.charAt(j)) {
                break;
            }
        }

        if (j == M) return i;
    }

    return -1;
}
```

### Kompleksiteti

Në rastin më të keq provohen afërsisht `M` karaktere në secilën nga `N-M+1` pozitat:

```text
O(NM)
```

Shembull i keq: text ka shumë `A`, pattern është `AAAAAB`. Shumë karaktere përputhen para çdo mismatch-i.

## 3. Brute Force pa backup eksplicit të i

Mund të përdoren `i` për text dhe `j` për pattern.

Në mismatch:

```text
i = i - j + 1
j = 0
```

`i-j` është pozita ku filloi tentativa aktuale; `+1` kalon te tentativa tjetër.

Kjo formë tregon qartë problemin që KMP e zgjidh: text-i kthehet prapa dhe krahasimet përsëriten.

## 4. Prefix, suffix dhe proper prefix

Këto duhen për KMP.

Për stringun `ABAB`:

- prefixes: `""`, `A`, `AB`, `ABA`, `ABAB`;
- suffixes: `""`, `B`, `AB`, `BAB`, `ABAB`;
- proper prefix nuk mund të jetë i gjithë stringu.

Prefiksi proper më i gjatë që është edhe suffix është `AB`, me gjatësi 2.

## 5. KMP - Knuth-Morris-Pratt

KMP nuk e kthen indeksin e text-it prapa. Kur ndodh mismatch, përdor strukturën e pattern-it për të ditur sa karaktere të përputhura mund të ruhen.

Ka dy mënyra të zakonshme për ta paraqitur:

- DFA;
- LPS/prefix function.

Në provim mund të përdoret ajo që kërkohet në ligjëratë. Ideja është e njëjtë.

## 6. LPS

`lps[i]` është gjatësia e proper prefix-it më të gjatë të `P[0..i]` që është edhe suffix.

Pattern:

```text
P = ABABCABAB
```

| i | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |
|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| P[i] | A | B | A | B | C | A | B | A | B |
| LPS | 0 | 0 | 1 | 2 | 0 | 1 | 2 | 3 | 4 |

### Si ndërtohet LPS?

Mbajmë:

- `i`: pozita që po llogarisim;
- `len`: gjatësia e prefix-it kandidat.

```text
lps[0] = 0
i = 1
len = 0

derisa i < M:
    nëse P[i] == P[len]:
        len++
        lps[i] = len
        i++
    përndryshe nëse len > 0:
        len = lps[len-1]
    përndryshe:
        lps[i] = 0
        i++
```

Në mismatch me `len>0`, `i` nuk rritet. Provojmë një prefix më të shkurtër kandidat.

## 7. KMP Search me LPS

Mbajmë:

- `i`: indeks në text;
- `j`: indeks në pattern.

### Rregullat

1. Nëse `T[i] == P[j]`, rrit `i` dhe `j`.
2. Nëse `j == M`, pattern u gjet në `i-M`.
3. Në mismatch dhe `j>0`, vendos `j=lps[j-1]`; `i` nuk ndryshon.
4. Në mismatch dhe `j==0`, rrit vetëm `i`.

### Java

```java
static int kmpSearch(String text, String pattern) {
    int[] lps = buildLps(pattern);
    int i = 0;
    int j = 0;

    while (i < text.length()) {
        if (text.charAt(i) == pattern.charAt(j)) {
            i++;
            j++;

            if (j == pattern.length()) {
                return i - j;
            }
        } else if (j > 0) {
            j = lps[j - 1];
        } else {
            i++;
        }
    }

    return -1;
}
```

### Pse nuk humb match?

Pjesa e pattern-it që është edhe suffix i pjesës së përputhur mund të shërbejë si fillimi i tentativës së re. LPS na tregon gjatësinë e saj. Çdo pozicion tjetër që kapërcehet është i pamundur sipas karaktereve që tashmë i kemi parë.

### Kompleksiteti

- ndërtimi i LPS: `O(M)`;
- search: `O(N)`;
- total: `O(N+M)`;
- memoria: `O(M)`.

## 8. KMP me DFA

DFA ka gjendjet `0..M`. Gjendja `j` do të thotë se janë përputhur `j` karaktere të pattern-it.

Transition:

```text
j i ri = dfa[karakteri i text-it][j aktual]
```

Gjendja `M` është accept state.

DFA parapërgatit përgjigjen për çdo kombinim `(karakter, gjendje)`. Search bëhet linear, por tabela mund të kërkojë `O(RM)` memorie.

LPS është mënyrë më kompakte për të njëjtën ide të fallback-ut.

## 9. Boyer-Moore

Boyer-Moore e krahason pattern-in nga djathtas në majtas.

Ai mund të kapërcejë disa pozita kur ka mismatch. Versioni bazë përdor **bad-character rule**.

### right[]

Për çdo karakter ruhet pozita e tij më e djathtë në pattern. Nëse nuk ekziston, vlera është `-1`.

Pattern `NEEDLE`:

```text
N:0, E:5, D:3, L:4
```

E ka vlerë 5 sepse paraqitja më e djathtë është në indeksin 5.

### Skip

Në mismatch në pozitën `j` me karakter text-i `c`:

```text
skip = max(1, j - right[c])
```

Nëse `c` nuk është në pattern, `right[c]=-1` dhe mund të kapërcehet `j+1`.

### Kompleksiteti

Në praktikë shpesh sublinear sepse nuk kontrollon çdo karakter. Versioni i thjeshtë mund të ketë rast të keq `O(NM)`.

## 10. Rabin-Karp

Rabin-Karp nuk krahason menjëherë të gjithë karakteret. Krahason hash-in e pattern-it me hash-in e çdo dritareje të text-it me gjatësi M.

### Hapat

1. Llogarit `patternHash`.
2. Llogarit hash-in e dritares së parë të text-it.
3. Nëse hash-et janë të barabarta, bëj kontroll karakter për karakter.
4. Llogarit rolling hash për dritaren tjetër pa e ndërtuar nga zero.
5. Vazhdo deri në fund.

### Rolling hash

Me radix `R` dhe numër prim `Q`:

```text
RM = R^(M-1) mod Q

hiq karakterin e vjetër:
hash = hash - oldChar * RM

shto karakterin e ri:
hash = hash * R + newChar

çdo hap bëhet mod Q
```

### Pse duhet kontrolli pas hash match?

Dy stringje të ndryshme mund të kenë hash të njëjtë. Kjo quhet collision.

Në Las Vegas Rabin-Karp, bëhet kontrolli i karaktereve dhe përgjigjja është gjithmonë e saktë. Në variantin Monte Carlo mund të pranohet hash match pa kontroll, me probabilitet shumë të vogël gabimi.

### Kompleksiteti

- expected/average: `O(N+M)`;
- worst case me shumë collisions: `O(NM)`;
- memoria: zakonisht `O(1)` përveç pattern-it.

## 11. Krahasimi

| Algoritmi | Parapërgatitja | Search | Ideja |
|---|---:|---:|---|
| Brute force | O(1) | O(NM) worst | Provo çdo pozitë |
| KMP | O(M) ose O(RM) me DFA | O(N) | Mos u kthe prapa në text |
| Boyer-Moore | O(R+M) | Shpesh sublinear; O(NM) worst në variantin bazë | Krahaso nga djathtas dhe kapërce |
| Rabin-Karp | O(M) | O(N+M) expected | Rolling hash |

## 12. Gabimet klasike

1. Të rritet `i` në KMP kur ka mismatch dhe `j>0`. Në atë rast ndryshon vetëm `j`.
2. Të përdoret `lps[j]` në vend të `lps[j-1]` pas mismatch-it.
3. Të thuhet se hash match garanton string të njëjtë.
4. Të rindërtohet i gjithë hash-i për çdo dritare, duke humbur idenë rolling hash.
5. Në brute force, loop-i i jashtëm të shkojë deri `N` në vend të `N-M`.
6. Të ngatërrohet prefix proper me tërë stringun.

## Kontrollo veten

1. Çka kërkon substring search?
2. Cili është worst-case i brute force?
3. Çka ruan LPS?
4. Çka ndodh në KMP mismatch kur `j>0`?
5. Në cilin drejtim krahason Boyer-Moore?
6. Pse Rabin-Karp e verifikon një hash match?

### Përgjigjet

1. Indeksin ku pattern paraqitet në text.
2. O(NM).
3. Gjatësinë e proper prefix-it më të gjatë që është edhe suffix.
4. `j=lps[j-1]`, ndërsa `i` nuk ndryshon.
5. Nga fundi i pattern-it drejt fillimit.
6. Për shkak të collisions.

