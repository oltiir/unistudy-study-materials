# Përgatitja për provim - Hyrje në Algoritme

Ky material mbulon 12 temat dhe të 31 materialet e kursit Moodle `39168`. Është shkruar për mësim aktiv: së pari kupto idenë, pastaj ndiq algoritmin me dorë, në fund zgjidh ushtrime pa e parë zgjidhjen.

## Versioni interaktiv

Hape [Algoritmet Lab](interactive/index.html) për t'i mësuar të 12 temat me simulatorë, trace hap pas hapi, kontroll automatik të përgjigjeve, hints, zgjidhje dhe progres me XP. Aplikacioni punon pa internet: shkarko folderin `interactive` dhe hape `index.html` në browser.

## Si ta përdorësh

Për çdo temë:

1. Lexo seksionet **Ideja** dhe **Konceptet kryesore**.
2. Ndiqe **Shembullin e zgjidhur** rresht për rresht dhe shpjego me zë pse bëhet secili hap.
3. Mbylle shembullin dhe riprodhoje vetë në letër.
4. Zgjidhe menjëherë seksionin **Detyrë për ty** pa e parë kontrollin final.
5. Përgjigju pyetjeve te **Kontrolli i njohurive**.
6. Zgjidh së paku dy ushtrime nga materialet origjinale.

Çdo kapitull ka së paku një shembull të punuar dhe një detyrë të ngjashme. Te temat me disa algoritme, si sortimet dhe hashing, ka ushtrim pas secilës nën-temë kryesore.

Mos mëso vetëm kodin përmendësh. Në provim duhet të dish të shpjegosh invariantin: çka është e garantuar pas çdo hapi të algoritmit.

## Harta e lëndës

| # | Tema | Duhet të dish patjetër | Materiali |
|---|---|---|---|
| 1 | Flowcharts | simbolet, degëzimi, ciklet, shuma/prodhimi, funksionet pjesë-pjesë | [01](01-Flowcharts.md) |
| 2 | Analiza e algoritmeve | Big-O/Theta/Omega, numërimi i cikleve, klasat e rritjes, memoria | [02](02-Analiza-e-Algoritmeve.md) |
| 3 | Stacks & Queues | LIFO/FIFO, linked list/array, resize, postfix, Dijkstra two-stack | [03](03-Stacks-dhe-Queues.md) |
| 4 | Elementary Sorts | Selection, Insertion, Shellsort, trace dhe kompleksitet | [04](04-Elementary-Sorts.md) |
| 5 | Mergesort | merge, rekursioni, top-down/bottom-up, stabiliteti | [05](05-Mergesort.md) |
| 6 | Quicksort | shuffle, 2-way partition, 3-way partition, rastet | [06](06-Quicksort.md) |
| 7 | Priority Queue & Heap | complete tree, max-heap, swim, sink, heapsort | [07](07-Priority-Queues-dhe-Heapsort.md) |
| 8 | Symbol Tables | key-value API, sequential search, ordered array, rank | [08](08-Symbol-Tables.md) |
| 9 | BST | search/insert/delete, traversals, floor/ceiling | [09](09-Binary-Search-Trees.md) |
| 10 | Balanced Trees | 2-3 tree, red-black BST, rotate/flip colors | [10](10-Balanced-Search-Trees.md) |
| 11 | Hash Tables | hashCode, chaining, probing, double/cuckoo hashing | [11](11-Hash-Tables.md) |
| 12 | Searching Applications | set, dictionary, indexing, sparse vectors | [12](12-Searching-Applications.md) |

Në fund përdor [Cheat Sheet](13-Cheat-Sheet.md) dhe [Mini‑Provimin](14-Mini-Provim.md).

## Prioriteti për provim

### Prioritet shumë i lartë

- Trace me dorë: Selection, Insertion, Shell, Merge, Quick 2-way/3-way dhe HeapSort.
- Kompleksiteti i një pjese kodi me cikle të njëpasnjëshme, të futura dhe me shumëzim/pjesëtim të iteratorit.
- Stack: infix në postfix dhe Dijkstra two-stack.
- Queue: gjendja e queue pas çdo `enqueue`/`dequeue`.
- BST: konstruktim, fshirje, traversals, `floor`, `ceiling`, `get`.
- Red-black BST: `rotateLeft`, `rotateRight`, `flipColors`.
- Hashing: linear/quadratic probing, double hashing, separate chaining dhe Horner për String.

### Prioritet i mesëm

- API-të dhe dallimet mes implementimeve.
- Stabiliteti dhe `in-place` për algoritmet e sortimit.
- `swim`, `sink`, insert/delMax në heap.
- Symbol table ordered operations dhe aplikimet e tyre.

### Prioritet teorik

- Memoria në Java.
- Generics, iterators dhe immutability.
- Timsort, natural mergesort, hashing attacks dhe sparse vectors.

## Tabela kryesore e kompleksiteteve

| Algoritmi/struktura | Mesatarisht | Worst case | Hapësira / veti |
|---|---:|---:|---|
| Selection sort | `O(N²)` | `O(N²)` | in-place, jo stable |
| Insertion sort | `O(N²)` | `O(N²)` | best `O(N)`, stable, in-place |
| Shellsort (3x+1) | varet | rreth `O(N^(3/2))` në material | in-place, jo stable |
| Mergesort | `O(N log N)` | `O(N log N)` | `O(N)` extra, stable |
| Quicksort | `O(N log N)` | `O(N²)` | in-place, jo stable |
| 3-way quicksort | `O(N log N)` | `O(N²)` | shumë i mirë me duplikate |
| Heapsort | `O(N log N)` | `O(N log N)` | in-place, jo stable |
| BST | `O(log N)` | `O(N)` | varet nga forma |
| Red-black BST | `O(log N)` | `O(log N)` | ordered operations |
| Hash table | expected `O(1)` | `O(N)` | nuk ruan renditje |

## Materialet burimore të mbuluara

- Ligjëratat: `00Intro`, `14AnalysisOfAlgorithms`, `13StacksAndQueues`, `21ElementarySorts`, `22Mergesort`, `23Quicksort`, `24PriorityQueues`, `31ElementarySymbolTables`, `32BinarySearchTrees`, `33BalancedSearchTrees`, `34HashTables`, `35SearchingApplications`.
- Të gjitha detyrat e shtëpisë dhe materialet me detyra të zgjidhura për Flowcharts, Complexity, Stacks/Queues, Elementary Sorts, QuickSort, HeapSort, BST, Red-black/2-3 trees dhe Hash Tables.

## Strategjia kur ngec në një detyrë

1. Shkruaj gjendjen fillestare dhe emërto pointerët (`i`, `j`, `lo`, `hi`, `lt`, `gt`, `N`).
2. Shkruaj kushtin që po testohet.
3. Ndrysho vetëm atë që urdhëron hapi aktual.
4. Pas çdo swap-i shkruaj vargun e plotë.
5. Kontrollo invariantin para se të kalosh në iterimin tjetër.

Kjo metodë ul shumicën e gabimeve mekanike në provim.
