# 06 - Key-Indexed Counting, LSD, MSD dhe 3-Way String Quicksort

Materialet përkatëse janë te Ligjëratat/Ushtrimet 6-8. [Ligjërata 8](https://www.youtube.com/watch?v=4s7zaiAy_nA) dhe [Ushtrimi 8](https://www.youtube.com/watch?v=WqF0ExfKM-w) lidhen drejtpërdrejt me fletën `Java 8 - String Sorts (LSD, MSD) and Tries`.

## 1. Pse string sorting trajtohet veçmas?

Sortimet klasike krahasojnë dy elemente të plota. String sorting mund ta shfrytëzojë faktin se stringu përbëhet nga karaktere të një alfabeti të kufizuar.

Termat:

- `N`: numri i stringjeve;
- `W`: gjatësia e stringut kur të gjitha kanë gjatësi fikse;
- `R`: numri i karaktereve në alfabet, radix;
- `d`: pozita e karakterit që po shqyrtohet.

Për extended ASCII zakonisht merret `R=256`.

## 2. Stable sort

Sortimi është **stable** nëse elementet me key të barabartë e ruajnë rendin relativ.

Input:

```text
(Ana, 2), (Beni, 1), (Drita, 2)
```

Sortim stable sipas numrit:

```text
(Beni, 1), (Ana, 2), (Drita, 2)
```

Ana mbetet para Dritës. LSD kërkon që sortimi i çdo kolone të jetë stable; përndryshe puna e kolonave të mëparshme prishet.

## 3. Key-Indexed Counting

Problemi: sorto `N` elemente ku key është integer nga `0` deri `R-1`.

Shembull:

```text
d a c f f b d b f b e a
```

Kodimi:

```text
a=0, b=1, c=2, d=3, e=4, f=5
```

### Pse count ka R+1 vende?

Përdoret offset `+1` gjatë numërimit, në mënyrë që pas cumulative sums `count[r]` të tregojë indeksin fillestar të key `r`.

## 4. Katër hapat

### Hapi 1 - Frekuencat

```java
int[] count = new int[R + 1];

for (int i = 0; i < N; i++) {
    count[key(a[i]) + 1]++;
}
```

Për input-in e mësipërm:

| Key | a | b | c | d | e | f |
|---|---:|---:|---:|---:|---:|---:|
| Frekuenca | 2 | 3 | 1 | 2 | 1 | 3 |

### Hapi 2 - Cumulative sums

```java
for (int r = 0; r < R; r++) {
    count[r + 1] += count[r];
}
```

Pas këtij hapi, `count[r]` tregon sa elemente kanë key më të vogël se `r`, pra ku fillon grupi `r` në output.

```text
count[a]=0
count[b]=2
count[c]=5
count[d]=6
count[e]=8
count[f]=9
```

### Hapi 3 - Shpërndarja stabile

```java
for (int i = 0; i < N; i++) {
    int r = key(a[i]);
    aux[count[r]++] = a[i];
}
```

`count[r]++` vendos elementin e ardhshëm me të njëjtin key në pozitën pasuese. Input-i lexohet majtas-djathtas, prandaj stabiliteti ruhet.

### Hapi 4 - Kopjimi prapa

```java
for (int i = 0; i < N; i++) {
    a[i] = aux[i];
}
```

Output:

```text
a a b b b c d d e f f f
```

### Kompleksiteti

```text
Koha: O(N + R)
Memoria: O(N + R)
```

## 5. LSD String Sort

LSD do të thotë Least Significant Digit. Për stringje, fillon nga karakteri i fundit dhe lëviz majtas.

Përdoret zakonisht kur të gjitha stringjet kanë të njëjtën gjatësi `W`.

### Pse fillon nga fundi?

Sortojmë fillimisht sipas karakterit më pak të rëndësishëm. Pastaj stable sort sipas karakterit para tij e ruan rendin e krijuar për suffix-in.

### Algoritmi

```text
për d = W-1 deri 0:
    bëj key-indexed counting sipas karakterit në pozitën d
```

### Java

```java
static void lsdSort(String[] a, int W) {
    int N = a.length;
    int R = 256;
    String[] aux = new String[N];

    for (int d = W - 1; d >= 0; d--) {
        int[] count = new int[R + 1];

        for (int i = 0; i < N; i++)
            count[a[i].charAt(d) + 1]++;

        for (int r = 0; r < R; r++)
            count[r + 1] += count[r];

        for (int i = 0; i < N; i++)
            aux[count[a[i].charAt(d)]++] = a[i];

        for (int i = 0; i < N; i++)
            a[i] = aux[i];
    }
}
```

### Shembull i vogël

```text
DAB, CAB, BAD, BAC
```

Sorto sipas pozitës 2:

```text
DAB, CAB, BAD, BAC
```

`B,B,D,C` japin grupet B, C, D duke ruajtur DAB para CAB:

```text
DAB, CAB, BAC, BAD
```

Sorto sipas pozitës 1:

```text
DAB, CAB, BAC, BAD
```

Të gjitha kanë A, rendi ruhet.

Sorto sipas pozitës 0:

```text
BAC, BAD, CAB, DAB
```

### Kompleksiteti

Për çdo nga `W` pozitat bëhet `O(N+R)` punë:

```text
O(W(N+R))
```

## 6. MSD String Sort

MSD do të thotë Most Significant Digit. Fillon nga karakteri i parë.

Ai i ndan stringjet në grupe sipas karakterit aktual dhe pastaj e sorton secilin grup sipas karakterit tjetër.

Përshtatet për stringje me gjatësi të ndryshme.

### charAt speciale

Kur pozita `d` është jashtë stringut, kthehet `-1` për të treguar end-of-string.

```java
private static int charAt(String s, int d) {
    if (d < s.length()) return s.charAt(d);
    return -1;
}
```

End-of-string duhet të vijë para karaktereve, sepse `CAR` vjen para `CARPET`.

### Algoritmi

```text
MSD(a, lo, hi, d):
    nëse nënvargu është i vogël: insertion sort dhe kthehu
    numëro karakteret në pozitën d
    llogarit cumulative sums
    shpërndaj në aux
    kopjo prapa
    për çdo grup karakteri:
        MSD(grupi, d+1)
```

### Shembull

```text
SHE, SHELL, SEA, BY, BAT
```

Në `d=0` krijohen grupet:

```text
B: BY, BAT
S: SHE, SHELL, SEA
```

Pastaj secili grup sortohet sipas `d=1`, pastaj sipas `d=2` kur duhet.

Rezultati:

```text
BAT, BY, SEA, SHE, SHELL
```

## 7. LSD kundrejt MSD

| LSD | MSD |
|---|---|
| Fillon nga karakteri i fundit | Fillon nga karakteri i parë |
| Zakonisht kërkon gjatësi fikse W | Lejon gjatësi variabile |
| Iterativ | Rekursiv |
| Sortimi i çdo kolone duhet stable | Ndan stringjet në grupe sipas prefix-it |
| Gjithmonë proceson W karaktere | Mund t'i shmangë suffix-et e panevojshme |

## 8. 3-Way String Quicksort

Ky algoritëm kombinon quicksort 3-way me karakteret e stringut.

Në pozitën `d`, zgjedhet pivot character `v`. Stringjet ndahen në:

- karakter më të vogël se `v`;
- karakter të barabartë me `v`;
- karakter më të madh se `v`.

Vetëm grupi i barabartë vazhdon në `d+1`, sepse ai grup ka të njëjtin prefix deri në `d`.

### Pseudokodi

```text
sort(a, lo, hi, d):
    nëse hi <= lo: kthehu

    lt = lo
    gt = hi
    v = charAt(a[lo], d)
    i = lo + 1

    derisa i <= gt:
        t = charAt(a[i], d)

        nëse t < v: swap(a[lt++], a[i++])
        nëse t > v: swap(a[i], a[gt--])
        përndryshe: i++

    sort(a, lo, lt-1, d)
    nëse v >= 0: sort(a, lt, gt, d+1)
    sort(a, gt+1, hi, d)
```

### Kur është i mirë?

Është veçanërisht i mirë kur ka shumë stringje me prefikse të përbashkëta. Nuk përdor array `count[R]` në çdo thirrje si MSD.

## 9. Gabimet klasike

1. Të bëhet LSD nga majtas në djathtas.
2. Të përdoret sort jo-stable brenda LSD.
3. Të harrohet kopjimi nga `aux` prapa.
4. Të mos përdoret offset `+1` te frekuencat.
5. Të përdoret LSD direkt për stringje me gjatësi të ndryshme pa padding/rregull të qartë.
6. Në MSD, të mos trajtohet end-of-string me `-1`.
7. Në 3-way quicksort, të rritet `d` edhe për grupet `<` dhe `>`; vetëm grupi `=` kalon në `d+1`.

## Kontrollo veten

1. Pse `count` ka `R+1` vende?
2. Çka tregon `count[r]` pas cumulative sums?
3. Pse LSD kërkon stabilitet?
4. Nga cili karakter nis LSD?
5. Nga cili karakter nis MSD?
6. Cili grup i 3-way string quicksort kalon në `d+1`?

### Përgjigjet

1. Për offset-in `key+1`, që cumulative sums të japin pozitat fillestare.
2. Numrin e elementeve me key më të vogël se r, pra pozitën fillestare të grupit r.
3. Që rendi i krijuar nga kolonat e mëparshme të mos prishet.
4. Nga i fundit.
5. Nga i pari.
6. Vetëm grupi me karakter të barabartë me pivot-in.

