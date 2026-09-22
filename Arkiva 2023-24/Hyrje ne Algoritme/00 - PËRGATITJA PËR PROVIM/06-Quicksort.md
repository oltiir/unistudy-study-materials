# 06 - Quicksort

## Burimet e mbuluara

- `23Quicksort.pdf`
- `Quicksort - Detyrat e shtëpisë.docx`
- `Quick Sort - Detyra të zgjidhura & detyra për ushtrime.docx`

Shënim: menuja e slide-ve përmend edhe selection/system sorts, por në PDF-në e kursit nuk ka seksion të zhvilluar për to; përmbajtja reale është 2-way quicksort, 3-way quicksort, duplikatet dhe analiza.

## Plani bazë

1. Shuffle array për të shmangur inpute të këqija sistematike.
2. Partition rreth pivotit.
3. Sorto rekursivisht pjesët majtas dhe djathtas.

Pas partition, pivoti është në pozitën finale; elementet majtas janë `<= pivot`, ato djathtas `>= pivot`.

## Sedgewick 2-way partition

Pivot është `a[lo]`. `i` skanon nga majtas, `j` nga djathtas.

```text
i = lo
j = hi + 1
repeat:
    lëviz i djathtas derisa a[i] >= pivot
    lëviz j majtas derisa a[j] <= pivot
    nëse i >= j: ndalo
    swap(a[i], a[j])
swap(a[lo], a[j])
return j
```

Kujdes kufijtë. Skanimet duhet të ndalen edhe në elemente të barabarta me pivotin; përndryshe shumë duplikate mund të japin sjellje shumë të keqe.

### Shembull

`[5,3,1,7,4,2,6]`, pivot 5:

- `i` ndalet te 7, `j` te 2 -> swap;
- vargu `[5,3,1,2,4,7,6]`;
- pointerët kryqëzohen rreth 4/7;
- swap pivot me 4 -> `[4,3,1,2,5,7,6]`.

Pivoti 5 është final. Tani rekursion vetëm te `[4,3,1,2]` dhe `[7,6]`.

### Detyrë për ty: 2-way

Bëj vetëm partition-in e parë për `[6,3,7,2,8,5,4]`, me pivot `6`. Shëno ku ndalen `i/j` dhe çdo swap. Kontrolli pas vendosjes së pivotit: `[5,3,4,2,6,8,7]`; pivoti përfundon në indeksin 4.

## Dijkstra 3-way partition

Përdoret kur ka shumë duplikate. Mban invariantin:

- `a[lo..lt-1] < v`;
- `a[lt..i-1] == v`;
- `a[i..gt]` ende të panjohura;
- `a[gt+1..hi] > v`.

```java
int lt=lo, i=lo+1, gt=hi;
while (i<=gt) {
    int cmp=a[i].compareTo(v);
    if (cmp<0) swap(a, lt++, i++);
    else if (cmp>0) swap(a, i, gt--);
    else i++;
}
```

Kur elementi është `> v`, mos e rrit `i`: elementi i ardhur nga `gt` ende nuk është kontrolluar.

Pas partition rekursioni bëhet vetëm në `[lo..lt-1]` dhe `[gt+1..hi]`; pjesa e barabartë është final.

### Shembull 3-way i zgjidhur hap pas hapi

Partition për `[3,5,2,3,4,3,2]`, me pivot `v=3`:

| Hapi | `lt,i,gt` para hapit | Krahasimi | Veprimi | Array pas hapit |
|---:|---|---|---|---|
| 1 | `0,1,6` | `5>3` | swap `i,gt`; `gt--`, por jo `i++` | `[3,2,2,3,4,3,5]` |
| 2 | `0,1,5` | `2<3` | swap `lt,i`; `lt++`, `i++` | `[2,3,2,3,4,3,5]` |
| 3 | `1,2,5` | `2<3` | swap `lt,i`; `lt++`, `i++` | `[2,2,3,3,4,3,5]` |
| 4 | `2,3,5` | `3=3` | vetëm `i++` | `[2,2,3,3,4,3,5]` |
| 5 | `2,4,5` | `4>3` | swap `i,gt`; `gt--` | `[2,2,3,3,3,4,5]` |
| 6 | `2,4,4` | `3=3` | `i++`; cikli mbaron | `[2,2,3,3,3,4,5]` |

Në fund zonat janë `<3: [2,2]`, `=3: [3,3,3]`, `>3: [4,5]`. Pjesa e barabartë nuk futet më në rekursion.

### Detyrë për ty: 3-way

Bëj partition për `[4,2,4,5,1,4,3]` me pivot `4`. Pas çdo hapi shkruaj `lt,i,gt` dhe katër zonat e invariantit. Kujdes: pas rastit `> pivot`, mos e rrit `i`.

## Kompleksiteti

- Best/ndarje të balancuara: `O(N log N)`.
- Average pas shuffle: `O(N log N)`; ligjërata jep afërsisht `2N ln N` krahasime.
- Worst, pivot vazhdimisht skajor: `O(N²)`.
- Hapësira nga rekursioni: average `O(log N)`, worst `O(N)`.
- In-place në kuptimin praktik; jo stable.

Shuffle jep garanci probabilistike. Alternativë: zgjedh pivot random në çdo subarray.

## 2-way kundrejt 3-way

| Situata | Zgjedhja |
|---|---|
| Shumë çelësa të ndryshëm | 2-way është i mirë |
| Shumë duplikate | 3-way është dukshëm më i mirë |
| Kërkohet stabilitet | Quicksort standard nuk përshtatet |

## Si bëhet trace

Për 2-way shkruaj në çdo rresht: vargun, pivotin, `i`, `j`, kushtin dhe swap-in. Pasi kryqëzohen, shëno pivotin me kuti dhe mos e prek më.

Për 3-way shkruaj `lt`, `i`, `gt` dhe katër zonat e invariantit. Ky format të mbron nga gabimi `i++` pas swap me `gt`.

## Gabimet tipike

- Harron shuffle dhe deklaron worst-case `N log N`.
- Pas partition e përfshin pivotin përsëri në rekursion.
- Ngatërron kushtet e skanimit të `i` dhe `j`.
- Te 3-way rrit `i` pas rastit `> pivot`.
- Thotë se quicksort është stable.

## Kontrolli i njohurive

1. Çka është e garantuar kur `partition` kthen `j`?
2. Pse shuffle është i rëndësishëm?
3. Cilat zona mban 3-way partition?
4. Pse 3-way ndihmon me shumë duplikate?

## Ushtrime

- 2-way: `3 24 5 8 5 9 4 1 2 6`.
- 2-way: `Q U I C K S O R T`.
- 3-way: `P A B X W P P V P D P C Y Z`.
- 3-way: `6 7 9 5 9 5 7 1 2 9`.
