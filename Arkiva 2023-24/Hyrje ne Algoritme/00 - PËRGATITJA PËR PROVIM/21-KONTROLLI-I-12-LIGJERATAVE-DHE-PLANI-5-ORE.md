# Kontrolli i 12 PDF-ve të ligjëratave + 5 orë mësim

Krahasimi u bë me **12 PDF-të e lëndës në GitHub**, jo vetëm me faqen e përgjithshme të Princeton-it. MD-të e temave i mbulojnë **idetë dhe formatet kryesore të ushtrimeve** të këtyre ligjëratave. Për 5 orë, përqendrohu te gjurmimi në letër, te detyrat origjinale dhe te gabimet e tua. Asnjë përmbledhje nuk parashikon çdo pyetje që mund të zgjedhë profesori.

## Harta PDF → MD: çka lexova dhe ku mësohet

| PDF i kursit | Faqe | Përmbajtja që duhet të dish | MD / vendimi për 5 orë |
|---|---:|---|---|
| [00Intro](../00Intro.pdf) | 14 | çka është algoritmi/struktura e të dhënave, pasqyra e lëndës | [Flowcharts](01-Flowcharts.md) dhe kjo hartë; 2 min për definicionet |
| [13StacksAndQueues](../13StacksAndQueues.pdf) | 45 | LIFO/FIFO, linked list/array, resize, iterators, Dijkstra two-stack | [03](03-Stacks-dhe-Queues.md); bëj postfix dhe queue |
| [14AnalysisOfAlgorithms](../14AnalysisOfAlgorithms.pdf) | 29 | modeli i kostos, rritja, binary search, memorie | [02](02-Analiza-e-Algoritmeve.md); numëro dy cikle |
| [21ElementarySorts](../21ElementarySorts.pdf) | 37 | Comparable, Selection, Insertion, Shell, trace, veti | [04](04-Elementary-Sorts.md); kodi `less/exch` është afruar me slide; *shuffling* shfaqet në menu, pa trajtim të zgjeruar në këtë PDF |
| [22Mergesort](../22Mergesort.pdf) | 39 | merge, top-down/bottom-up, stabilitet, Comparator, Timsort/lower bound | [05](05-Mergesort.md); bëj një merge me dy gjysma |
| [23Quicksort](../23Quicksort.pdf) | 32 | shuffle, 2-way, duplikate, 3-way, trace/kompleksitet | [06](06-Quicksort.md); kodin 3-way e kemi me `i=lo` si në slide; *selection/system sorts* janë tituj menush pa seksion të zhvilluar këtu |
| [24PriorityQueues](../24PriorityQueues.pdf) | 36 | MaxPQ, heap/swim/sink, Heapsort, veti të immutable keys | [07](07-Priority-Queues-dhe-Heapsort.md); u shtua një shembull për immutable key; simulimi i ngjarjeve përmendet si zbatim |
| [31ElementarySymbolTables](../31ElementarySymbolTables.pdf) | 21 | `put/get/delete`, linked list, ordered array, rank/floor/ceiling | [08](08-Symbol-Tables.md); përgatitu për një kërkim binar |
| [32BinarySearchTrees](../32BinarySearchTrees.pdf) | 30 | BST, traversals, delete, rank, floor/ceiling | [09](09-Binary-Search-Trees.md); vizato para/pas fshirjes |
| [33BalancedSearchTrees](../33BalancedSearchTrees.pdf) | 39 | 2-3 tree, LLRB, rrotullime, flipColors | [10](10-Balanced-Search-Trees.md); *B-trees* janë në menu, pa zgjidhje të zhvilluar në këtë PDF |
| [34HashTables](../34HashTables.pdf) | 38 | hashCode/equals, chaining, linear probing, resize, sulmet me collision | [11](11-Hash-Tables.md); quadratic/double/cuckoo trajtohen edhe në DOCX-të e ushtrimeve |
| [35SearchingApplications](../35SearchingApplications.pdf) | 26 | set, white/black list, indeksimi, sparse vectors/matrix | [12](12-Searching-Applications.md); për 5 orë lexo shembullin dhe definicionet |

**Si ta interpretosh tabelën:** materiali MD është rruga jote për të zgjidhur detyrat. Për një pyetje që kërkon kod Java *saktësisht si slide*, kontrollo PDF-në pranë bllokut të kodit. [8 detyra me inputet origjinale](20-DETYRA-ORIGJINALE-TE-ZGJIDHURA.md) lidhin zgjidhjet e kursit me hapa të kuptueshëm. [Indeksi](19-INDEKSI-I-PDF-VE-DHE-VIDEOVE.md) ka edhe DOCX/PDF e ushtrimeve dhe lidhjet e demonstrimeve.

## Plani i vetëm për 300 minuta

Puno sipas kohëmatësit. Jepi vetes **një tentim pa zgjidhje** për çdo detyrë; nëse ngec mbi 5 minuta, lexo një hint dhe vazhdo. Ky është plan për dikë që ka një bazë, jo mësim i të 12 ligjëratave rresht për rresht.

| Minutat | Tema | Shkruaje në letër | Kontrolli |
|---:|---|---|---|
| 0–35 | [Kompleksitet](02-Analiza-e-Algoritmeve.md) dhe [flowchart](01-Flowcharts.md) | `n+(n-1)+…+1` dhe një cikël me shumë/prodhim e kusht | [Detyrat 6–7 origjinale](20-DETYRA-ORIGJINALE-TE-ZGJIDHURA.md#6-flowchart-me-produkt-detyra-2-e-pdf-së) |
| 35–75 | [BST](09-Binary-Search-Trees.md) | inserto, tri traversals, fshi me successor/predecessor, `floor` para/pas | [Detyra 4 origjinale](20-DETYRA-ORIGJINALE-TE-ZGJIDHURA.md#4-bst-detyra-1-e-pdf-së-para-dhe-pas-fshirjes) |
| 75–110 | [Heap/Heapsort](07-Priority-Queues-dhe-Heapsort.md) | bottom-up `sink`, `delMax`, `insert/swim` me indekse 1-based | [Provimi realist, detyra 4](17-PROVIM-REALIST-NGA-TESTET.md) |
| 110–115 | Pushim | lëre ekranin, ujë | — |
| 115–145 | [Hashing](11-Hash-Tables.md) | chaining + linear; shëno `f(x)`, modulo dhe çdo `i` | [Detyra 5 origjinale](20-DETYRA-ORIGJINALE-TE-ZGJIDHURA.md#5-hash-tables-linear-probing-input-identik-me-docx-in) |
| 145–185 | [Sortimet](04-Elementary-Sorts.md), [Merge](05-Mergesort.md), [Quick](06-Quicksort.md) | 1 kalim Selection, 1 merge, 1 partition 2-way dhe 3-way | [Detyrat 1–3 origjinale](20-DETYRA-ORIGJINALE-TE-ZGJIDHURA.md) |
| 185–190 | Pushim | ec pak, mos hap temë tjetër | — |
| 190–215 | [Stack/Queue](03-Stacks-dhe-Queues.md) | infix→postfix, vlerëso stack-un, bëj një queue FIFO | [Detyra 8 origjinale](20-DETYRA-ORIGJINALE-TE-ZGJIDHURA.md#8-one-stack-ruaj-kllapat-në-postfix) |
| 215–240 | [2-3/RB](10-Balanced-Search-Trees.md), [ST](08-Symbol-Tables.md), [zbatimet](12-Searching-Applications.md) | 1 split ose color flip; përkufizo `rank/floor`; shpjego 1 inverted index | [Cheat Sheet](13-Cheat-Sheet.md) |
| 240–300 | **Simulim + korrigjim** | 50 min: vetëm Pjesa III e [provimit realist](17-PROVIM-REALIST-NGA-TESTET.md); 10 min: rendit 3 gabimet që duhet t'i rishikosh | zgjidhjet poshtë provimit |

Nëse këto 5 orë i bën sonte, **mos e sakrifiko gjumin** për lexime shtesë. Nesër para provimit përsërit 3 gabimet e simulimit dhe [formulat](13-Cheat-Sheet.md), pastaj ndalo mësimin intensiv para nisjes.

## Gjashtë prova që tregojnë nëse MD po të mjafton

1. Nga dy cikle të futura e nxjerr **numrin e saktë** të thirrjeve dhe pastaj `Θ`, duke shpjeguar nëse `n` është literal apo input.
2. Vizatimin e BST e bëj nga një listë keys dhe gjej `floor` **para e pas** fshirjes.
3. Me heap-in 1-based shënoj prindin `k/2`, fëmijët `2k,2k+1` dhe çdo `sink/swim`.
4. Në hashing shkruaj funksionin, indekset e collision dhe variantin e zgjidhjes së tyre.
5. Në Quick 3-way ruaj zonat `< v`, `= v`, `> v`; pas swap me `gt` nuk e rrit `i`.
6. Një postfix e vlerësoj pa ndërruar rendin e operandëve të `-` ose `/`.

Nëse të mungon njëra, kthehu **vetëm** te shembulli i saj dhe bëje pa shikuar përgjigjen. Nota 80+ varet nga ushtrimi dhe nga detyrat që dalin realisht, prandaj këtë dokument përdore si kontroll praktik, jo si garanci.
