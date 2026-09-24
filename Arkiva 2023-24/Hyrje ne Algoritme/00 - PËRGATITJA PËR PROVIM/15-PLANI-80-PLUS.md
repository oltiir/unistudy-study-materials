# Plani 80+ — Hyrje në Algoritme

## Çka mund dhe çka nuk mund të garantohet

Asnjë material nuk mund ta garantojë notën, sepse provimi mund të ndryshojë dhe rezultati varet nga puna pa ndihmë. Ky plan e zvogëlon rrezikun që të dalë një **lloj i panjohur detyre** duke mbuluar të gjitha familjet e detyrave në 31 materialet e kursit.

Je gati për synimin 80+ vetëm kur:

1. ke zgjidhur së paku 90% të detyrave **Lehtë/Mesatare** pa zgjidhje;
2. ke zgjidhur së paku 80% të detyrave **Provimi**;
3. ke marrë së paku `80/100` në dy provime simuluese radhazi;
4. mund ta shpjegosh invariantin dhe kompleksitetin, jo vetëm rezultatin;
5. mund ta bësh trace-in me dorë pa visualizer.

## Metoda për çdo temë

Përdor këtë rend; mos e ndërro:

1. **Kupto:** lexo kapitullin `.md` dhe shpjegoje idenë me fjalët tua.
2. **Ndiq:** kalo shembullin e zgjidhur rresht për rresht.
3. **Riprodho:** mbylle zgjidhjen dhe bëje të njëjtin shembull në letër.
4. **Ushtro:** zgjidhi detyrat Lehtë → Mesatare → Provimi në Algoritmet Lab.
5. **Trace:** për çdo algoritëm shkruaj gjendjen pas çdo swap/iterimi.
6. **Kontrollo:** shëno gabimin konkret: kusht, indeks, rend operandësh, formulë apo invariant.
7. **Përsërit:** bëj një detyrë të re të të njëjtit lloj pa hint.

## Harta e plotë e llojeve të detyrave

### 1. Flowcharts

- njohja e simboleve;
- llogaritje lineare, p.sh. BMI/formulë;
- shuma me cikël;
- numrat çift/tek me hap `2`;
- prodhimi dhe faktorieli;
- funksioni pjesë-pjesë pa boshllëqe/mbivendosje;
- kombinimi i shumë sums/products në formulë;
- proces real me vendime Po/Jo;
- trace i accumulator-it dhe zbulimi i ciklit të pafund.

**Gate:** shkruaj pseudokod dhe vizato flowchart për një shumë, një prodhim dhe një funksion pjesë-pjesë pa e parë modelin.

### 2. Analiza e algoritmeve

- `O`, `Theta`, `Omega`;
- heqja e konstantave dhe termit më të vogël;
- cikle të njëpasnjëshme;
- cikle të futura;
- cikël trekëndor `1+...+N`;
- iterator me `*=2`, `*=3`, `/=2`;
- `if/else` dhe worst case;
- 1-SUM, 2-SUM, 3-SUM;
- binary search;
- llogaritja e memories së primitiveve, arrays dhe objekteve.

**Gate:** analizo pesë fragmente kodi të përziera dhe arsyeto çdo term.

### 3. Stacks dhe Queues

- LIFO/FIFO dhe API;
- stack me linked list;
- resizing array, amortized cost dhe loitering;
- queue me `first/last`, përfshirë queue që zbrazet;
- circular queue me `head/tail/size` dhe modulo;
- generics dhe iterator;
- infix → postfix me precedence/kllapa;
- vlerësim postfix me rendin `left/right`;
- Dijkstra two-stack.

**Gate:** një konvertim infix/postfix, një vlerësim dhe një trace circular queue pa gabim.

### 4. Elementary Sorts

- Selection: minimumi, një swap për iterim, krahasimet;
- Insertion: lëvizjet majtas dhe prefix-i i sortuar;
- Shellsort: gap-et `3x+1`, h-sort dhe faza `h=1`;
- best/average/worst;
- stable dhe in-place;
- numri i comparisons/swaps.

**Gate:** trace i plotë i të tre algoritmeve në letër.

### 5. Mergesort

- merge i dy pjesëve të sortuara;
- pointerët `i/j` dhe rastet kur njëra pjesë mbaron;
- top-down recursion;
- bottom-up me `sz=1,2,4...`;
- koha `N log N` dhe aux `N`;
- stabiliteti në keys të barabartë;
- optimizimet dhe lower bound i comparison sorting.

**Gate:** një trace top-down dhe një bottom-up, me çdo merge të shkruar.

### 6. Quicksort

- shuffle dhe arsyeja e tij;
- 2-way partition me `i/j`;
- vendosja finale e pivotit;
- kufijtë e rekursionit pa pivot;
- 3-way me zonat `<`, `=`, `>`, `unknown`;
- rasti `>pivot`: `gt--` pa `i++`;
- duplikatet;
- average/worst, hapësira e recursion stack, stability.

**Gate:** dy partition 2-way dhe dy 3-way pa humbur asnjë indeks.

### 7. Priority Queues dhe Heapsort

- complete binary tree dhe formulat parent/children;
- verifikimi i max-heap;
- insert + swim;
- delMax + sink me fëmijën më të madh;
- bottom-up heap construction;
- sortdown dhe kufiri i heap-it aktiv;
- kompleksitetet dhe stability/in-place.

**Gate:** ndërto heap, bëj insert, delMax dhe së paku tri hapa të sortdown.

### 8. Symbol Tables

- API `put/get/delete/contains`;
- update i key ekzistues;
- sequential search;
- ordered arrays dhe binary search;
- `rank` si indeks/pozitë insertimi;
- `min/max/floor/ceiling`;
- `select`, range dhe size;
- krahasimi BST/RB/hash/array/list.

**Gate:** trace i `rank`, `floor`, `ceiling` për key ekzistues dhe key që mungon.

### 9. Binary Search Trees

- ndërtimi sipas rendit të insertimit;
- search dhe insert paths;
- forma, lartësia dhe worst case;
- inorder/preorder/postorder;
- min/max/floor/ceiling;
- count, rank dhe select;
- deleteMin;
- Hibbard delete me 0/1/2 fëmijë;
- rindërtimi nga traversals.

**Gate:** ndërto, bëj tri traversals, floor/ceiling dhe fshi një node me dy fëmijë.

### 10. 2-3 Trees dhe Red-Black BST

- 2-node/3-node dhe perfect balance;
- insert në 2-node;
- 4-node i përkohshëm, split dhe ngritja e key së mesme;
- lidhja 2-3 ↔ LLRB;
- rotateLeft;
- rotateRight;
- flipColors;
- rendi standard i tri kontrolleve;
- root i zi, pa red-right dhe pa dy red links radhazi;
- konvertimi RB → 2-3.

**Gate:** vizato pemën pas çdo inserti dhe emërto operacionin që u përdor.

### 11. Hash Tables

- kontrata `equals/hashCode`;
- indeksi jo-negativ;
- Horner për String;
- separate chaining dhe load factor;
- linear probing dhe primary clustering;
- quadratic probing me formulën e kursit;
- double hashing me `h1/h2`;
- cuckoo hashing dhe dëbimet;
- rolling hash;
- deletion/tombstone/rehash cluster;
- resize + rehash;
- expected `O(1)`, worst `O(N)` dhe complexity attack.

**Gate:** një detyrë për secilën nga chaining, linear, quadratic, double dhe Horner; shkruaj çdo tentim.

### 12. Searching Applications

- Set dhe membership;
- WhiteList/BlackList;
- dictionary lookup;
- një key me shumë values;
- inverted index/FileIndex;
- concordance dhe pozitat;
- sparse vector;
- sparse dot product;
- sparse matrix.

**Gate:** zgjidh key/value/strukturën për tri skenarë dhe llogarit një sparse dot product.

**Për sonte, 24 shtator:** datat 22–23 më poshtë kanë kaluar. Përdor [planin e shkurtër të mbrëmjes](00-FILLO-KETU.md#nis-sonte-plani-me-më-së-shumti-kthim-për-kohën) dhe [praktikën e fundit](18-PRAKTIKA-PARA-PROVIMIT.md). Mos e planifiko 80+ si rezultat të sigurt; bëj një simulim dhe përmirëso gabimet.

## Plani intensiv deri më 25 shtator

Ky plan supozon punën 09:00–17:00 dhe provimin më 25 shtator në 13:00.

### 22 shtator — bazat dhe algoritmet e shkurtra

- Flowcharts;
- analiza e algoritmeve;
- stacks/queues;
- Selection, Insertion, Shellsort;
- në fund: detyrat e këtyre temave derisa secila të jetë së paku 80%.

### 23 shtator — sorting dhe heaps

- Mergesort;
- Quicksort 2-way/3-way;
- Priority Queue, swim/sink, Heapsort;
- një provim simulues; analizo çdo gabim.

### 24 shtator — searching structures

- Symbol Tables;
- BST;
- 2-3/RB trees;
- Hash Tables;
- Searching Applications;
- dy provime simuluese. Ndale teorinë dhe ripuno vetëm llojet e gabuara.

### 25 shtator — para provimit

- mos hap temë të re;
- lexo Cheat Sheet;
- bëj nga një trace Quick/Heap/BST/Hash;
- rishiko listën e gabimeve;
- ndalo mësimin intensiv së paku 60 minuta para nisjes.

## Si analizohet një gabim

Mos shkruaj vetëm “gabim”. Klasifikoje:

| Lloji | Shembull | Korrigjimi |
|---|---|---|
| Kusht | përdore `<` në vend të `<=` | rishkruaj kufirin para ciklit |
| Indeks | ngatërrove 0-based/1-based | shëno formulat mbi fletë |
| Pointer | rrite `i` pas swap me `gt` | shkruaj invariantin 3-way |
| Operand | bëre `right-left` | pop right, pastaj left |
| Strukturë | zgjodhe hash kur duhet range | shkruaj nevojën para strukturës |
| Kompleksitet | mblodhe nested loops | vizato sa herë punon inner loop |
| Trace | kalove dy hapa njëherësh | një rresht pas çdo ndryshimi |

## Standardi final

Mos u mbështet te ndjenja “mendoj që e di”. Je gati kur dashboard-i tregon:

- të gjitha temat së paku 80%;
- asnjë temë nën 70%;
- dy provime simuluese radhazi `>=80/100`;
- provimi i fundit përfundon brenda 75 minutave;
- çdo përgjigje e gabuar është ripunuar pa hint.
