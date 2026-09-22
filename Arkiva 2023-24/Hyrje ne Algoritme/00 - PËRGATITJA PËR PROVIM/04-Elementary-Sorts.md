# 04 - Elementary Sorts

## Burimet e mbuluara

- `21ElementarySorts.pdf`
- `Elementary Sorts - Detyrat e shtepise.pdf`
- `Elementary Sorts - Detyra të zgjidhura & detyra për ushtrime.pdf`

## Comparable dhe operacionet ndihmëse

`v.compareTo(w)` kthen negativ, zero ose pozitiv. Algoritmet përdorin:

```java
less(v, w)  // v < w
exch(a, i, j)
```

Për tipe të personalizuara, `compareTo` duhet të krijojë total order.

## Selection sort

Në iterimin `i`, gjen minimumin në `[i..N-1]` dhe e ndërron me `a[i]`.

```java
for (int i=0; i<N; i++) {
    int min=i;
    for (int j=i+1; j<N; j++)
        if (a[j] < a[min]) min=j;
    swap(a, i, min);
}
```

Invariant: `[0..i-1]` është i sortuar dhe final; asnjë element në të djathtë nuk është më i vogël se ai prefix.

- Krahasime: `N(N-1)/2`.
- Ndërrime: afërsisht `N`.
- Best/average/worst: `O(N²)`.
- In-place; zakonisht jo stable.

Avantazh: pak ndërrime, i dobishëm kur lëvizja e elementit kushton shumë.

## Insertion sort

Prefix-i majtas mbahet i sortuar. Elementi aktual lëviz majtas derisa të arrijë vendin.

```java
for (int i=1; i<N; i++)
    for (int j=i; j>0 && a[j] < a[j-1]; j--)
        swap(a, j, j-1);
```

Invariant: `[0..i]` është i sortuar pas iterimit `i`.

- Best: `N-1` krahasime, 0 swaps -> `O(N)`.
- Average: rreth `N²/4` krahasime/swaps.
- Worst: rreth `N²/2` -> `O(N²)`.
- In-place dhe stable, nëse elementet e barabarta nuk ndërrohen.

Shumë i mirë për array të vogla ose pothuajse të sortuara.

## Shellsort

Është insertion sort me hapa `h`. Fillimisht lëviz elementet larg, pastaj përfundon me `h=1`.

Sekuenca 3x+1: `1, 4, 13, 40, ...`. Zgjidhet `h` më i madh nën `N/3`, pastaj `h /= 3`.

```java
int h=1;
while (h < N/3) h=3*h+1;
while (h>=1) {
    for (int i=h; i<N; i++)
        for (int j=i; j>=h && a[j] < a[j-h]; j-=h)
            swap(a,j,j-h);
    h/=3;
}
```

`h`-sorted do të thotë se çdo nënsekuencë `a[r], a[r+h], a[r+2h]...` është e sortuar. Pas `h=1`, array është plotësisht e sortuar.

- In-place, jo stable.
- Materiali jep worst rreth `N^(3/2)` për 3x+1; analiza e saktë varet nga gap sequence.

## Trace i saktë në provim

### Selection

Shëno `i`, skano për `min`, bëj vetëm një swap në fund të iterimit.

### Insertion

Pas çdo iterimi shkruaj prefix-in e sortuar. Elementi mund të bëjë disa swaps majtas.

### Shell

1. Gjej gap-et, p.sh. për `N=10`: `h=4`, pastaj `h=1`.
2. Për çdo `i`, krahaso vetëm me `i-h`, `i-2h`, ...
3. Shkruaj array pas çdo ndryshimi.

## Stable dhe in-place

- Stable: elementet me çelës të njëjtë ruajnë rendin relativ.
- In-place: përdor vetëm hapësirë shtesë konstante ose shumë të vogël.

Selection mund të lëvizë një element të barabartë përtej tjetrit; Shell bën swaps të largëta. Insertion lëviz vetëm kur është rreptësisht më i vogël, prandaj është stable.

## Gabimet tipike

- Selection bën swap gjatë kërkimit të minimumit, jo pas përfundimit.
- Insertion krahasohet me `a[i]` origjinal pa përcjellë lëvizjen e `j`.
- Shellsort harron gap-in `1`.
- Shkruan se selection ka best `O(N)` vetëm pse array është e sortuar; ai prapë skanon gjithçka.

## Krahasimi

| Algoritmi | Best | Average | Worst | Stable | In-place |
|---|---:|---:|---:|---|---|
| Selection | `N²` | `N²` | `N²` | Jo | Po |
| Insertion | `N` | `N²` | `N²` | Po | Po |
| Shell (3x+1) | më mirë se quadratic në praktikë | varet | rreth `N^(3/2)` në material | Jo | Po |

## Kontrolli i njohurive

1. Cili invariant përdoret nga selection sort?
2. Pse insertion sort është linear në array të sortuar?
3. Çka do të thotë 4-sorted?
4. Cili algoritëm bën numër minimal linear swaps?

## Ushtrime

- Selection: `13 24 15 8 25 19 4 1 4 46`.
- Insertion: `E L E M E N T A R Y`.
- Shellsort: `H A S H T A B L E S` me gap-et 4 dhe 1.
