# 02 - Analiza e algoritmeve

## Hape burimin dhe shiko demonstrimin

- [14AnalysisOfAlgorithms.pdf](../14AnalysisOfAlgorithms.pdf)
- [2. Kompleksiteti kohor - Detyrat e shtëpise.pdf](../2.%20Kompleksiteti%20kohor%20-%20Detyrat%20e%20sht%C3%ABpise.pdf)
- [Analiza e algoritmeve - Detyra të zgjidhura detyra për ushtrime.pdf](../Analiza%20e%20algoritmeve%20-%20Detyra%20t%C3%AB%20zgjidhura%20detyra%20p%C3%ABr%20ushtrime.pdf)

**Demonstrimet falas të Princeton-it** (ndali te çdo hap, kopjo gjendjen në letër dhe krahasoje me trace-in e kësaj teme):

- [Binary search (PDF)](https://algs4.cs.princeton.edu/lectures/demo/14DemoBinarySearch.pdf)

Skedarët `.mov` janë video të shkurtra demonstrimi; nëse browseri nuk i luan, hapini me një video player. Demonstrimi `PDF` hapet si dokument, nuk është video.

**Si të punosh:** provo vetë detyrën e punuar para se ta lexosh përgjigjen; bëj pastaj detyrën «për ty» dhe kontrollo [ushtrimet e plota me zgjidhje](18-PRAKTIKA-PARA-PROVIMIT.md).

## Burimet e mbuluara

- `14AnalysisOfAlgorithms.pdf`
- `2. Kompleksiteti kohor - Detyrat e shtëpise.pdf`
- `Analiza e algoritmeve - Detyra të zgjidhura detyra për ushtrime.pdf`

## Pse analizohet algoritmi

- Parashikim i performancës për input të madh.
- Krahasim i algoritmeve pa u varur nga kompjuteri.
- Zbulim i problemeve të kohës dhe memories.
- Garantim teorik i sjelljes.

Koha reale varet nga makina dhe implementimi; order of growth fokusohet te mënyra si rritet puna me `N`.

## Modeli matematikor

Koha totale është shuma `kosto e operacionit × frekuenca`. Operacionet primitive zakonisht merren si konstante. Në analizën asimptotike:

- hiq konstantat: `5N -> N`;
- mbaj termin dominues: `3N² + 7N + 2 -> N²`.

## Klasat kryesore

| Rritja | Emri | Shenjë tipike |
|---:|---|---|
| `1` | konstante | vetëm disa operacione |
| `log N` | logaritmike | inputi përgjysmohet/dyfishohet |
| `N` | lineare | një kalim nëpër input |
| `N log N` | linearithmic | divide-and-conquer i balancuar |
| `N²` | kuadratike | çdo çift elementesh |
| `N³` | kubike | çdo treshe |
| `2^N` | eksponenciale | të gjitha nënbashkësitë |

Kur `N` dyfishohet, koha përafërsisht shumëzohet me: `1`, pak mbi `1`, `2`, pak mbi `2`, `4`, `8`, ose afërsisht `2^N` sipas klasës.

## Big Theta, Big O dhe Big Omega

- `Theta(g(N))`: kufi i ngushtë; rritja është e të njëjtit rend.
- `O(g(N))`: kufi i sipërm.
- `Omega(g(N))`: kufi i poshtëm.

Në ushtrimet e kursit zakonisht kërkohet klasa dominuese dhe shkruhet `O(...)`.

## Rregullat për kodin

### Cikle të njëpasnjëshme

```java
for (...) { ... } // N
for (...) { ... } // N^2
```

Mblidhen: `N + N² = O(N²)`.

### Cikle të futura

```java
for (i = 0; i < N; i++)
    for (j = 0; j < N; j++)
        work();
```

Shumëzohen: `N * N = N²`.

Nëse cikli i brendshëm shkon deri te `i`, puna është:

`1 + 2 + ... + (N-1) = N(N-1)/2 = Theta(N²)`.

### Iterator që shumëzohet

```java
while (value < N) value *= 2;
```

Pas `k` hapash `value = 2^k`; prandaj `k = log2(N)` dhe koha është `O(log N)`.

### Kushti

Një `if/else` me punë konstante është `O(1)`. Nëse degët kanë kompleksitete të ndryshme, worst case merr më të madhën.

## Shembujt 1-SUM, 2-SUM, 3-SUM

- 1-SUM kontrollon çdo element: `Theta(N)`.
- 2-SUM kontrollon çdo çift: `N(N-1)/2 = Theta(N²)`.
- 3-SUM kontrollon çdo treshe: `N(N-1)(N-2)/6 = Theta(N³)`.

Këto tregojnë lidhjen mes numrit të cikleve dhe kombinimeve, por kufijtë `j=i+1`, `k=j+1` shmangin përsëritjet.

## Binary search

Kërkon array të sortuar. Krahason me mesin; në çdo hap eliminon gjysmën. Kompleksiteti kohor `O(log N)`, hapësira `O(1)` për versionin iterativ.

## Memoria në modelin e ligjëratës

- `boolean/byte`: 1 byte; `char`: 2; `int/float`: 4; `long/double`: 8.
- Referencë: 8 bytes në modelin 64-bit të ligjëratës.
- Array 1D: overhead rreth 24 bytes plus elementet.
- Objekt: overhead rreth 16 bytes plus fushat dhe padding deri në shumëfish të 8.

Për dy `int[N]` arrays brenda një objekti, llogarit: dy referenca + dy overhead-e të array + `8N` për elementet + overhead/fushat e objektit.

## Shembuj të shpejtë

```java
if (n % 2 == 0) print("even");
```

`O(1)`.

```java
for (i = 1; i <= rows; i++)
    for (j = 1; j <= i; j++) print("*");
```

`1+2+...+rows = O(N²)` nëse `rows=N`. Nëse `rows=7` është literal konstant, teknikisht `O(1)` ndaj inputit; shëno supozimin.

```java
for (i=0; i<N; i++) print(i);
for (j=0; j<N; j++)
    for (k=0; k<N; k++) compare(j,k);
```

`O(N + N²) = O(N²)`.

## Gabimet tipike

- I mbledh ciklet e futura në vend që t'i shumëzojë.
- E quan `O(N)` një loop ku iteratori dyfishohet.
- Mban konstantat dhe termat e vegjël në rezultatin final.
- Analizon një numër literal si `N` pa e shpjeguar.
- Ngatërron worst case me average case.

## Kontrolli i njohurive

1. Pse `N(N-1)/2` është `Theta(N²)`?
2. Sa bëhet `O(N) + O(N log N)`?
3. Çka tregon `Theta`, ndryshe nga `O`?
4. Pse binary search nuk punon siç duhet në array të pasortuar?

## Ushtrime

Gjej kompleksitetin:

```java
for (int i=1; i<n; i*=2)
    for (int j=0; j<n; j++) work();
```

Përgjigjja: `O(N log N)`.

```java
for (int i=0; i<n; i++)
    for (int j=i; j<n; j++) work();
```

Përgjigjja: `O(N²)`.

## Shembull i zgjidhur hap pas hapi

Analizo këtë kod:

```java
for (int i=1; i<=n; i++)
    for (int j=1; j<=i; j++) work();

for (int k=1; k<n; k*=2) work();
```

1. Për `i = 1`, cikli i brendshëm punon 1 herë; për `i = 2`, 2 herë; ...; për `i = n`, `n` herë.
2. Puna e pjesës së parë është `1 + 2 + ... + n = n(n+1)/2 = Theta(n²)`.
3. Në pjesën e dytë, `k` merr vlerat `1, 2, 4, 8, ...`. Pas `t` iterimeve kemi `k = 2^t`; ndalet kur `2^t >= n`, pra bën `Theta(log n)` hapa.
4. Pjesët janë njëra pas tjetrës, prandaj mblidhen: `Theta(n²) + Theta(log n)`.
5. Termi dominues është `n²`, kështu kompleksiteti total është **`Theta(n²)`**.

### Detyrë për ty

Analizo secilën pjesë dhe pastaj totalin:

```java
for (int i=0; i<n; i++)
    for (int j=i; j<n; j++) work();

for (int x=n; x>1; x/=2) work();
```

Shkruaj sa herë ekzekutohet `work()` në pjesën e parë si shumë, kompleksitetin e pjesës së dytë dhe termin dominues. Kontrolli final: totalja duhet të dalë `Theta(n²)`.
