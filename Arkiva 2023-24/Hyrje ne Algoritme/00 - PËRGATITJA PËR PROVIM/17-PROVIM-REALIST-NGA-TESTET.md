# 17 - Provim realist sipas testeve të mëparshme

**Koha:** 90 minuta  
**Pikët:** 100  
**Rregulli:** puno pa material. Hapi zgjidhjet vetëm pasi të kesh përfunduar.

## Pjesa I - Saktë/Pasaktë (20 pikë)

Çdo përgjigje e saktë: `+2`; e pasaktë: `-1`; pa përgjigje: `0`.

1. Në një queue, elementi i fundit i futur largohet i pari.
2. Standard mergesort është stable, por zakonisht kërkon `Θ(n)` hapësirë ndihmëse.
3. Në max-heap 1-based, fëmijët e nyjës `k` janë `2k` dhe `2k+1`.
4. Çdo BST ka lartësi `Θ(log n)`.
5. Primary clustering lidhet me linear probing.
6. `contains(key)` në Symbol Table kontrollon nëse ekziston key.
7. Inorder traversal i BST jep keys në rend rritës.
8. Insertion sort në një array tashmë të renditur ka best-case `Θ(n)`.
9. Hash table garanton iterim të keys në rend rritës.
10. Nëse `x.equals(y)` është true, `x.hashCode()` dhe `y.hashCode()` duhet të jenë të njëjta.

## Pjesa II - Alternativa (30 pikë)

Në secilën pyetje mund të ketë më shumë se një përgjigje të saktë. Secila pyetje vlen 6 pikë.

### 1. Cilat pohime për Binary Search Tree janë të sakta?

- A. Çdo node ka maksimumi dy fëmijë.
- B. Pema duhet patjetër të jetë complete tree.
- C. Të gjitha keys në subtree të majtë janë më të vogla se key i node-it.
- D. Inorder mund të përdoret për t'i marrë keys të sortuar.

### 2. Cilat janë operacione tipike të Symbol Table?

- A. `put(key,value)`
- B. `get(key)`
- C. `delete(key)`
- D. `dequeue()`

### 3. Cilat sortime janë in-place në implementimet standarde të kursit?

- A. Selection sort
- B. Insertion sort
- C. Shellsort
- D. Mergesort top-down me auxiliary array

### 4. Cilat pohime për separate chaining janë të sakta?

- A. Çdo bucket mund të mbajë një listë të keys.
- B. Dy keys me të njëjtin hash mund të ruhen të dyja.
- C. Fshirja e një key kërkon zhvendosjen e gjithë array-t.
- D. Load factor mund të jetë më i madh se 1.

### 5. Cilat operacione përdoren në max-heap?

- A. `swim` pas një insertimi në fund.
- B. `sink` pas zëvendësimit të root-it gjatë `delMax`.
- C. `delMax` heq elementin në `q[n]` pa shkëmbim.
- D. Root ndodhet në `q[1]` kur përdoret indeksim 1-based.

## Pjesa III - Detyra (50 pikë)

### 1. Flowchart/pseudokod - 10 pikë

Një bankë jep normën vjetore sipas shumës së kredisë:

- më pak se 1,000 euro: 1%;
- 1,000 deri nën 5,000 euro: 2%;
- 5,000 deri në 10,000 euro: 4%;
- mbi 10,000 euro: 5%.

Shkruaj pseudokodin dhe vizato flowchart-in që lexon shumën, zgjedh normën dhe shtyp interesin `shuma * norma`.

### 2. Kompleksitet - 10 pikë

Gjej formulën kryesore të numrit të ekzekutimeve të `work()` dhe kompleksitetin:

```java
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) {
        work();
    }
}
```

### 3. BST - 10 pikë

Ndërto BST nga:

```text
11, 6, 19, 4, 8, 17, 43, 5, 10, 31, 49
```

Shkruaj inorder, preorder dhe postorder. Pastaj fshi `19` me successor.

### 4. Max-heap - 10 pikë

Nga vargu:

```text
2, 24, 21, 17, 6, 89, 64, 62, 17, 5
```

1. ndërto max-heap me bottom-up construction;
2. bëj `delMax`;
3. inserto `14`.

Shkruaj array-n pas secilës fazë.

### 5. Postfix dhe hashing - 10 pikë

1. Kthe në postfix: `(A-B)+C*(G+H)+D`.
2. Me separate chaining, ndërto tabelën për `M=5`, `h(x)=(x-1) mod 5` dhe keys:

```text
6, 8, 10, 11, 15, 12, 2, 13
```

---

<details>
<summary><strong>Hapi zgjidhjet vetëm pasi ta kryesh provimin</strong></summary>

## Zgjidhjet - Pjesa I

1. **Pasaktë.** Queue është FIFO; i pari i futur del i pari.
2. **Saktë.** Merge standard ruan rendin e barazimeve dhe përdor auxiliary array.
3. **Saktë.** Kjo vlen për indeksim 1-based.
4. **Pasaktë.** BST mund të degjenerojë në listë me lartësi `n-1`.
5. **Saktë.** Linear probing krijon blloqe të njëpasnjëshme.
6. **Saktë.** Kontrollon praninë e key, jo barazinë e një value.
7. **Saktë.** Vetia simetrike e BST jep rendin rritës.
8. **Saktë.** Ka një kalim linear edhe pa swaps.
9. **Pasaktë.** Hash table nuk ruan rend natyral.
10. **Saktë.** Është kërkesë e kontratës `equals/hashCode`.

## Zgjidhjet - Pjesa II

1. **A, C, D.** Complete tree nuk është kërkesë për BST.
2. **A, B, C.** `dequeue` i përket queue.
3. **A, B, C.** Mergesort standard me aux nuk është in-place.
4. **A, B, D.** Në chaining mund të ketë më shumë keys se buckets; fshirja prek vetëm zinxhirin përkatës.
5. **A, B, D.** `delMax` së pari shkëmben root-in me fundin, zvogëlon heap-in, pastaj bën `sink`.

## Zgjidhjet - Pjesa III

### 1. Flowchart/pseudokod

```text
lexo shuma
nëse shuma < 1000
    norma = 0.01
përndryshe nëse shuma < 5000
    norma = 0.02
përndryshe nëse shuma <= 10000
    norma = 0.04
përndryshe
    norma = 0.05
interesi = shuma * norma
shtyp norma, interesi
```

Në flowchart: Start -> Input -> tri rombe me kushtet në të njëjtin rend -> caktimi i normës -> llogaritja -> Output -> End. Kufijtë `1000`, `5000` dhe `10000` duhet të përfshihen vetëm në një degë.

### 2. Kompleksiteti

Për secilin `i`, cikli i brendshëm bën `n-i` ekzekutime:

```text
n + (n-1) + ... + 1 = n(n+1)/2
```

Prandaj `work()` ekzekutohet saktësisht `n(n+1)/2` herë dhe kompleksiteti është `Θ(n²)`.

### 3. BST

- Inorder: `4,5,6,8,10,11,17,19,31,43,49`
- Preorder: `11,6,4,5,8,10,19,17,43,31,49`
- Postorder: `5,4,10,8,6,17,31,49,43,19,11`
- Successor i `19` është `31`, minimumi në subtree të djathtë. `31` zë vendin e `19` dhe hiqet nga pozita e vjetër nën `43`.

### 4. Max-heap

- Pas bottom-up construction: `[89,62,64,24,6,21,2,17,17,5]`
- Pas `delMax`: `[64,62,21,24,6,5,2,17,17]`
- Pas insertimit të `14`: `[64,62,21,24,14,5,2,17,17,6]`

Kontrollo pas çdo faze që secili prind është `>=` të dy fëmijët.

### 5. Postfix dhe hashing

Postfix:

```text
A B - C G H + * + D +
```

Hash table:

| Bucket | Keys sipas inputit |
|---:|---|
| 0 | `6 -> 11` |
| 1 | `12 -> 2` |
| 2 | `8 -> 13` |
| 3 | bosh |
| 4 | `10 -> 15` |

Rreshtat tregojnë **rendin e hyrjes**. Nëse `put()` fut çdo nyjë në krye të listës, shkruaji zinxhirët nga koka në këtë rend: `0: 11 -> 6`, `1: 2 -> 12`, `2: 13 -> 8`, `4: 15 -> 10`. Indekset e bucket-ave nuk ndryshojnë.

</details>

## Vlerësimi

- `80-100`: je në zonën e synimit; ripuno vetëm gabimet.
- `65-79`: shumë afër; bëj edhe një simulim dhe përsërit heap/BST/hash.
- `50-64`: fokusohu në Pjesën III, sepse aty janë gjysma e pikëve.
- `<50`: kthehu te [roadmap-i 80+](15-PLANI-80-PLUS.md) dhe puno prioritetin A.
