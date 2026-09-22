# 05 - Mergesort

## Burimi i mbuluar

- `22Mergesort.pdf`

## Ideja divide-and-conquer

1. Ndaje array në dy gjysma.
2. Sorto secilën gjysmë rekursivisht.
3. Bashko dy gjysmat e sortuara.

Base case: subarray me zero ose një element (`hi <= lo`) është e sortuar.

## Operacioni merge

Parakushti: `a[lo..mid]` dhe `a[mid+1..hi]` janë veçmas të sortuara. Kopjo segmentin në `aux`, pastaj përdor pointerët `i=lo`, `j=mid+1`.

Për çdo `k`:

1. nëse gjysma e majtë mbaroi, merr nga e djathta;
2. nëse e djathta mbaroi, merr nga e majta;
3. nëse `aux[j] < aux[i]`, merr nga e djathta;
4. përndryshe merr nga e majta.

```java
for (int k=lo; k<=hi; k++) aux[k]=a[k];
int i=lo, j=mid+1;
for (int k=lo; k<=hi; k++) {
    if (i>mid) a[k]=aux[j++];
    else if (j>hi) a[k]=aux[i++];
    else if (aux[j].compareTo(aux[i])<0) a[k]=aux[j++];
    else a[k]=aux[i++];
}
```

Invariant: `a[lo..k-1]` përmban `k-lo` elementet më të vogla nga dy gjysmat.

## Top-down mergesort

```java
sort(a, aux, lo, hi) {
    if (hi <= lo) return;
    int mid = lo + (hi-lo)/2;
    sort(a, aux, lo, mid);
    sort(a, aux, mid+1, hi);
    merge(a, aux, lo, mid, hi);
}
```

Pema e rekursionit ka rreth `log N` nivele; çdo nivel përpunon gjithsej `N` elemente. Prandaj koha është `Theta(N log N)` në best, average dhe worst case.

Hapësira shtesë është `Theta(N)` për `aux`, plus stack-u rekursiv `O(log N)`.

## Bottom-up mergesort

Nuk përdor rekursion. Bashkon blloqe me madhësi 1, pastaj 2, 4, 8...

```java
for (int sz=1; sz<N; sz+=sz)
    for (int lo=0; lo<N-sz; lo+=2*sz)
        merge(a, aux, lo, lo+sz-1,
              Math.min(lo+2*sz-1, N-1));
```

Kujdes te blloku i fundit që mund të jetë më i shkurtër.

## Shembull i shkurtër

`[7,2,6,3]`

- merge `[7]` dhe `[2]` -> `[2,7]`;
- merge `[6]` dhe `[3]` -> `[3,6]`;
- merge `[2,7]` dhe `[3,6]` -> `[2,3,6,7]`.

Në merge final: merret 2 majtas, 3 djathtas, 6 djathtas, pastaj 7 majtas.

## Shembull i zgjidhur hap pas hapi

Bashko dy pjesët e sortuara `L=[2,5,8]` dhe `R=[1,3,9]`. Krahaso vetëm elementet ku tregojnë `i` dhe `j`; më i vogli kalon në output.

| Hapi | Krahasimi | Zgjedhja dhe arsyeja | Output |
|---:|---|---|---|
| 1 | `2` me `1` | merret `1` nga R, sepse `1<2` | `[1]` |
| 2 | `2` me `3` | merret `2` nga L | `[1,2]` |
| 3 | `5` me `3` | merret `3` nga R | `[1,2,3]` |
| 4 | `5` me `9` | merret `5` nga L | `[1,2,3,5]` |
| 5 | `8` me `9` | merret `8` nga L | `[1,2,3,5,8]` |
| 6 | L mbaroi | kopjohet pjesa e mbetur e R | `[1,2,3,5,8,9]` |

Rezultati është i sortuar sepse në çdo hap merret elementi më i vogël që ende nuk është përdorur. Për `N=6`, merge shkruan saktësisht 6 elemente në output.

### Detyrë për ty

Bashko `L=[1,6,7,12]` dhe `R=[2,3,9,10]`. Shkruaj një rresht për çdo krahasim, vlerat e `i/j` dhe output-in pas hapit. Kontrolli final: `[1,2,3,6,7,9,10,12]`.

### Detyrë top-down për ty

Bëj ndarjet dhe merge-t për `[8,3,7,4,9,2]`. Në çdo merge shëno dy pjesët që janë tashmë të sortuara; nëse ndonjëra nuk është e sortuar, ke bërë merge para kohe.

## Stabiliteti

Mergesort është stable nëse, kur çelësat janë të barabartë, merret elementi nga gjysma e majtë. Kjo është arsyeja e degës finale `else a[k]=aux[i++]`.

Nuk është in-place në implementimin standard sepse kërkon `aux[N]`.

## Përmirësime

- Nëse `a[mid] <= a[mid+1]`, segmenti është veç i bashkuar; mos bëj merge.
- Për subarrays shumë të vogla përdor insertion sort.
- Natural mergesort zbulon runs ekzistuese.
- Timsort kombinon runs natyrore dhe insertion/merge; është stable dhe adaptiv.

## Comparator

`Comparable` jep rendin natyror të tipit. `Comparator` lejon rende alternative, p.sh. studentët sipas emrit ose seksionit. Stabiliteti lejon sortim me shumë çelësa: së pari sipas çelësit sekondar, pastaj stable sort sipas primarit.

## Lower bound i sorting me krahasime

Decision tree duhet të ketë së paku `N!` gjethe; lartësia është të paktën `log2(N!) = Omega(N log N)`. Mergesort është optimal asimptotik për numrin e krahasimeve, por jo për hapësirën.

## Gabimet tipike

- Bën merge para se dy gjysmat të jenë të sortuara.
- Humb element kur njëra gjysmë mbaron.
- Llogarit `mid=(lo+hi)/2` pa menduar overflow; përdor `lo+(hi-lo)/2`.
- Merr nga e djathta kur vlerat janë të barabarta dhe e prish stabilitetin.
- Ngatërron `O(N log N)` kohë me `O(log N)` hapësirë; `aux` është `O(N)`.

## Kontrolli i njohurive

1. Cili është parakushti i `merge`?
2. Pse çdo nivel i rekursionit kushton `O(N)`?
3. Pse implementimi standard është stable?
4. Si ndryshon bottom-up nga top-down?

## Ushtrim

Bëj trace top-down për `M E R G E S O R T`: shkruaj ndarjet dhe çdo merge. Pastaj përsërite bottom-up me `sz=1,2,4,8`.
