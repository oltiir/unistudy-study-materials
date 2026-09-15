# Pyetje reale nga testet - analizë dhe zgjidhje

Ky material është ndërtuar nga fotografitë e një testi real. Qëllimi nuk është vetëm t'i mësosh përgjigjet përmendësh. Duhet të kuptosh pse një pohim është i saktë ose i pasaktë dhe të jesh në gjendje ta ekzekutosh algoritmin në një input tjetër.

## 1. Çka na tregon formati i testit

Testi ndahet në tri lloje pyetjesh:

1. **Saktë/Pasaktë** - kontrollohen kushtet e algoritmeve dhe dallimet mes tyre.
2. **Pyetje me disa alternativa** - mund të ketë më shumë se një përgjigje të saktë dhe përgjigjet e gabuara sjellin pikë negative.
3. **Detyra praktike** - kërkohet ekzekutim me dorë, ndërtim tabele ose shkrim kodi.

Nga fotografitë, temat më të rëndësishme janë:

- shortest paths;
- substring search: Brute Force, KMP/DFA, Boyer-Moore dhe Rabin-Karp;
- Trie dhe TST;
- LZW dhe Huffman;
- MST dhe Kruskal;
- Kosaraju-Sharir;
- maximum flow dhe augmenting paths;
- LSD/MSD dhe metodat e klasës `String`.

Kjo do të thotë se nuk mjafton të dish definicione. Duhet të dish edhe:

- kur një algoritëm **nuk lejohet**;
- cilën strukturë të të dhënave përdor;
- cilat hapa ekzekutohen me radhë;
- si paraqitet rezultati në tabelë;
- pjesët kryesore të implementimit në Java.

---

# Pjesa I - Saktë/Pasaktë

## Pyetja 1

> Topological sort mund të aplikohet në çdo graf të orientuar.

**Përgjigjja: PASAKTË.**

Topological sort mund të ekzistojë vetëm kur grafi i orientuar është **DAG**, pra `Directed Acyclic Graph`.

Nëse grafi ka cikël, për shembull:

```text
A -> B -> C -> A
```

nuk mund të vendosim një nyje para tjetrës pa e shkelur së paku një varësi.

Mbaje mend:

```text
Topological order ekziston <=> digraph-i është DAG.
```

## Pyetja 2

> Në algoritmin Dijkstra, peshat negative të brinjëve nuk ndikojnë në korrektësinë e rezultatit.

**Përgjigjja: PASAKTË.**

Dijkstra kërkon që të gjitha peshat të jenë **jo-negative**.

Arsyeja është se Dijkstra e konsideron si përfundimtare distancën e nyjës që largohet nga priority queue. Një brinjë negative e zbuluar më vonë mund ta zvogëlojë atë distancë dhe ta prishë këtë supozim.

Për pesha negative përdoret zakonisht **Bellman-Ford**. Nëse grafi është DAG, mund të përdoret edhe shortest path sipas topological order.

## Pyetja 3

> Algoritmi Kruskal është algoritëm greedy për ndërtimin e MST-së.

**Përgjigjja: SAKTË.**

Kruskal i merr brinjët nga pesha më e vogël drejt më të madhes. Ai e shton një brinjë vetëm nëse ajo nuk krijon cikël. Vendimi më i mirë lokal është marrja e brinjës më të lirë që është e sigurt.

Strukturat kryesore:

- listë e brinjëve e sortuar ose min-priority queue;
- Union-Find për kontrollimin e ciklit.

## Pyetja 4

> LZW kërkon njohjen paraprake të frekuencës së karaktereve për të ndërtuar kodimin.

**Përgjigjja: PASAKTË.**

Kjo veti i përket **Huffman coding**, sepse Huffman ndërton pemën nga frekuencat.

LZW fillon me një fjalor bazë dhe e zgjeron fjalorin gjatë leximit të inputit. Prandaj nuk ka nevojë t'i dijë paraprakisht frekuencat.

## Pyetja 5

> Kapaciteti i një prerjeje në një flow network është shuma e kapaciteteve të brinjëve që kalojnë nga ana e source-it në anën e sink-ut.

**Përgjigjja: SAKTË.**

Në një prerje `(S,T)`:

- source `s` duhet të jetë në `S`;
- sink `t` duhet të jetë në `T`;
- kapaciteti llogaritet nga brinjët që shkojnë **nga S në T**.

Brinjët që shkojnë nga `T` në `S` nuk shtohen në kapacitetin e prerjes.

---

# Pjesa II - Pyetje me disa alternativa

## Rregulli i sigurisë kur ka pikë negative

Në test shkruan se përgjigjja e gabuar vlerësohet me pikë negative. Prandaj:

- mos e rretho një alternativë vetëm sepse duket e njohur;
- kontrollo çdo alternativë si një pohim të veçantë;
- kërko fjalë absolute si `çdo`, `gjithmonë`, `vetëm` dhe `nuk ndikon`;
- nëse nuk mund ta arsyetosh me një rregull ose kundërshembull, mos u ngut.

## 1. Algoritmet e grafeve

### a) BFS përdoret për rrugën më të shkurtër në grafe me peshë pozitive

**Në përgjithësi: PASAKTË.**

BFS jep shortest path kur grafi është pa peshë ose kur çdo brinjë ka të njëjtën peshë. Vetëm fakti që peshat janë pozitive nuk mjafton. Për pesha pozitive të ndryshme përdoret Dijkstra.

### b) DFS gjithmonë gjen rrugën më të shkurtër

**PASAKTË.** DFS gjen një rrugë, jo domosdoshmërisht më të shkurtën.

### c) Kosaraju-Sharir përdoret për SCC në digraph

**SAKTË.**

### d) Kruskal zgjedh brinjët nga një queue

**Varet nga formulimi.** Implementimi standard përdor brinjë të sortuara ose një **min-priority queue**, jo një FIFO queue të zakonshme. Nëse me `queue` nënkuptohet priority queue, pohimi pranohet; nëse nënkuptohet FIFO, është i pasaktë.

## 2. Kosaraju-Sharir

Pohimet që duhet t'i dish:

- përdoret për komponentët fort të lidhur në graf të orientuar;
- bën një DFS për të krijuar reverse postorder në grafin e transpozuar `G^R`;
- pastaj bën DFS në grafin origjinal `G` sipas asaj renditjeje;
- kostoja është `O(V + E)`;
- nuk thuhet thjesht se "çdo vertex vizitohet vetëm një herë" në krejt algoritmin, sepse ka dy faza DFS;
- rendi kritik është **reverse postorder i grafit të transpozuar**.

Pseudokodi:

```text
order = reversePostorder(G.reverse())

for v in order:
    if not marked[v]:
        dfs(G, v)
        id++
```

## 3. Shortest paths

### a) Dijkstra funksionon vetëm me pesha jo-negative

**SAKTË.** Lejohen edhe peshat zero.

### b) Bellman-Ford mund të zbulojë cikle me peshë negative

**SAKTË.** Nëse cikli negativ është i arritshëm nga source, shortest path nuk ka vlerë përfundimtare sepse cikli mund të përsëritet dhe distanca të ulet pa kufi.

### c) BFS përdoret për pesha të ndryshme pozitive

**PASAKTË.** BFS minimizon numrin e brinjëve, jo shumën e peshave.

### d) Dijkstra punon me pesha negative nëse nuk ka cikël

**PASAKTË.** Edhe një brinjë e vetme negative mund ta bëjë Dijkstra-n të japë rezultat të gabuar.

## 4. R-way Trie dhe TST

Pohimet e sakta:

- R-way Trie ka një array me `R` lidhje në secilën nyje;
- TST ka tri lidhje: `left`, `mid`, `right`;
- Trie është shumë i përshtatshëm për prefix search dhe autocomplete;
- R-way Trie zakonisht përdor **më shumë memorie** se TST kur shumë lidhje janë `null`.

Në TST:

```text
karakter më i vogël  -> left
karakter i barabartë -> mid dhe kalojmë te karakteri tjetër i key
karakter më i madh   -> right
```

## 5. Substring search

Pohimet e sakta:

- KMP shmang kthimin prapa në tekst pas mismatch-it;
- Boyer-Moore mund të kapërcejë disa karaktere;
- Rabin-Karp përdor hash për të krahasuar pattern-in me dritaret e tekstit.

Pohimi se Boyer-Moore është patjetër më i ngadalshmi për alfabet të madh është i pasaktë. Në praktikë, Boyer-Moore shpesh është shumë i shpejtë sepse bën kërcime.

## 6. Augmenting path

Një augmenting path në residual graph mund të përmbajë:

- **forward edges**, ku ka kapacitet të lirë;
- **backward edges**, me të cilat mund të anulojmë një pjesë të flow-it të dërguar më herët.

Ford-Fulkerson është algoritmi që kërkon augmenting paths; nuk është lloj segmenti i path-it. Dijkstra nuk përdoret për këtë qëllim.

## 7. Metodat e `String`

Metodat standarde që shfaqen në algoritmet e stringjeve janë:

```java
s.length();
s.charAt(i);
s.substring(a, b);
s.compareTo(t);
s.concat(t);
```

Kujdes:

- është `length()`, jo `Length()`;
- është `charAt(i)`, jo `get(key, i)`;
- Java ka `concat()`, jo metodë me emrin `concatenate()`.

## 8. LZW

LZW mund ta kodojë inputin ndërsa e lexon dhe e ndërton fjalorin gradualisht. Nuk ka nevojë për tabelë paraprake të frekuencave. Kjo e bën të përshtatshëm edhe për përpunim streaming.

Mos e ngatërro:

| Huffman | LZW |
|---|---|
| Përdor frekuenca | Përdor fraza që përsëriten |
| Ndërton pemë binare | Ndërton dictionary |
| Kod prefix-free | Kode për stringje/fraza |

## 9. Përdorimet e shortest path

Shortest path përdoret për:

- navigim të robotëve;
- protokolle dhe planifikim të rrugëtimit;
- planifikim të trafikut urban;
- navigim në harta dhe lojëra.

`Real-time streaming data` nuk është vetvetiu problem shortest-path.

## 10. Autocomplete

Për autocomplete përdoret Trie ose TST sepse kërkimi fillon me një **prefix**.

Rabin-Karp kërkon një pattern në një tekst; nuk është struktura standarde për autocomplete.

## 11. Krahasimi në LSD dhe MSD

LSD dhe MSD e lexojnë karakterin në pozitën `d` me:

```java
s.charAt(d)
```

Ato nuk bëjnë krahasim të plotë me `compareTo()`. String sorts të bazuara në radix i klasifikojnë elementet sipas karakterit në pozitën aktuale.

---

# Pjesa III - Detyrat praktike

## Detyra 1 - Brute Force substring search

Nga testi:

```text
Teksti:  505550505555055055050005
Pattern: 05555
```

Pozitat numërohen nga zero.

Brute Force e vendos pattern-in fillimisht në pozitën `0`. Pas çdo mismatch-i e zhvendos vetëm një pozitë djathtas.

| Fillimi `i` | Pjesa e tekstit | Rezultati |
|---:|---|---|
| 0 | `50555` | mismatch |
| 1 | `05550` | mismatch në fund |
| 2 | `55505` | mismatch |
| 3 | `55050` | mismatch |
| 4 | `50505` | mismatch |
| 5 | `05055` | mismatch |
| 6 | `50555` | mismatch |
| 7 | `05555` | match |

Pra pattern-i gjendet në indeksin:

```text
7
```

### Implementimi i qartë me dy loops

```java
public static int search(String pattern, String text) {
    int M = pattern.length();
    int N = text.length();

    for (int i = 0; i <= N - M; i++) {
        int j;

        for (j = 0; j < M; j++) {
            if (text.charAt(i + j) != pattern.charAt(j)) {
                break;
            }
        }

        if (j == M) {
            return i;
        }
    }

    return N;
}
```

### Versioni me backup

```java
public static int search(String pattern, String text) {
    int M = pattern.length();
    int N = text.length();
    int i;
    int j;

    for (i = 0, j = 0; i < N && j < M; i++) {
        if (text.charAt(i) == pattern.charAt(j)) {
            j++;
        } else {
            i -= j; // ktheje i te fillimi i mëparshëm
            j = 0;  // provo nga fillimi i pattern-it
        }
    }

    if (j == M) {
        return i - M;
    }

    return N;
}
```

Rreshti që bën backup është:

```java
i -= j;
```

Pastaj `for` e rrit `i` edhe për një, prandaj tentativa e re fillon një pozitë pas tentativës së mëparshme.

Brute Force nuk ka tabelën `skip[]` të Boyer-Moore. Nëse pyetja përdor fjalën `skip`, sqaro se zhvendosja standarde e Brute Force është vetëm një pozitë pas mismatch-it.

## Detyra 2 - Shortest path në graf

Nga fotografia, source është nyja `0`. Brinjët e arritshme janë:

```text
0 -> 2, pesha 2
0 -> 6, pesha 6
2 -> 6, pesha 7
2 -> 5, pesha 4
2 -> 3, pesha 2
6 -> 5, pesha -1
6 -> 3, pesha 1
5 -> 3, pesha -2
```

Ka pesha negative, prandaj **nuk duhet të përdorim Dijkstra**. Grafi nuk ka cikël dhe mund të përpunohet si DAG sipas topological order. Bellman-Ford gjithashtu do të funksiononte.

Fillimi:

```text
distTo[0] = 0
të gjitha distancat tjera = infinity
```

### Relax nga 0

```text
distTo[2] = 0 + 2 = 2
distTo[6] = 0 + 6 = 6
```

### Relax nga 2

```text
0 -> 2 -> 6 = 2 + 7 = 9   // nuk është më mirë se 6
0 -> 2 -> 5 = 2 + 4 = 6
0 -> 2 -> 3 = 2 + 2 = 4
```

### Relax nga 6

```text
0 -> 6 -> 5 = 6 + (-1) = 5  // përmirësohet nga 6 në 5
0 -> 6 -> 3 = 6 + 1 = 7     // nuk është më mirë se 4
```

### Relax nga 5

```text
0 -> 6 -> 5 -> 3 = 5 + (-2) = 3  // përmirësohet nga 4 në 3
```

Rezultati:

| Nyja | Distanca nga 0 | Rruga më e shkurtër |
|---:|---:|---|
| 0 | 0 | `0` |
| 1 | infinity | nuk arrihet nga 0 |
| 2 | 2 | `0 -> 2` |
| 6 | 6 | `0 -> 6` |
| 5 | 5 | `0 -> 6 -> 5` |
| 3 | 3 | `0 -> 6 -> 5 -> 3` |

Gabimi më i zakonshëm është të zgjedhësh gjithmonë brinjën më të vogël që e sheh. Shortest path llogarit **shumën e plotë nga source**, jo vetëm peshën e brinjës së fundit.

## Detyra 3 - LZW për `COMPUTERCOMPUTATIONCOMPUTE`

Inputi:

```text
COMPUTERCOMPUTATIONCOMPUTE
```

Rregulli LZW:

1. Gjej frazën më të gjatë `s` që ekziston në dictionary.
2. Shkruaje kodin e `s`.
3. Shto në dictionary `s + karakteri_tjetër`.
4. Vazhdo nga karakteri që nuk u përfshi në `s`.

Tabela e frazave të reja:

| Hapi | Fraza e gjetur | Fraza e re në dictionary |
|---:|---|---|
| 1 | `C` | `CO` |
| 2 | `O` | `OM` |
| 3 | `M` | `MP` |
| 4 | `P` | `PU` |
| 5 | `U` | `UT` |
| 6 | `T` | `TE` |
| 7 | `E` | `ER` |
| 8 | `R` | `RC` |
| 9 | `CO` | `COM` |
| 10 | `MP` | `MPU` |
| 11 | `UT` | `UTA` |
| 12 | `A` | `AT` |
| 13 | `T` | `TI` |
| 14 | `I` | `IO` |
| 15 | `O` | `ON` |
| 16 | `N` | `NC` |
| 17 | `COM` | `COMP` |
| 18 | `PU` | `PUT` |
| 19 | `TE` | fundi i inputit |

Dalja simbolike është:

```text
C, O, M, P, U, T, E, R, CO, MP, UT, A, T, I, O, N, COM, PU, TE
```

Në versionin e Sedgewick, karakteret ASCII kanë kodet `0..255`, kodi `256` ruhet për EOF dhe frazat e reja fillojnë nga `257`.

```text
CO=257, OM=258, MP=259, PU=260, UT=261, TE=262,
ER=263, RC=264, COM=265, MPU=266, UTA=267,
AT=268, TI=269, IO=270, ON=271, NC=272,
COMP=273, PUT=274
```

Prandaj stream-i numerik është:

```text
67, 79, 77, 80, 85, 84, 69, 82,
257, 259, 261, 65, 84, 73, 79, 78,
265, 260, 262, 256
```

Nëse profesori përdor një konventë tjetër për kodin e parë të lirë, numrat mund të zhvendosen për `1`, por frazat dhe hapat mbesin të njëjtë.

### Paraqitja si Trie

Trie fillestar përmban të gjitha karakteret njëshkronjëshe. Degët e reja të rëndësishme nga ky input janë:

```text
C
└── O  (CO)
    └── M  (COM)
        └── P  (COMP)

M
└── P  (MP)
    └── U  (MPU)

P
└── U  (PU)
    └── T  (PUT)

U
└── T  (UT)
    └── A  (UTA)
```

Degët tjera të shtuara janë:

```text
O -> M, O -> N
T -> E, T -> I
E -> R
R -> C
A -> T
I -> O
N -> C
```

## Detyra 4 - KMP DFA

Nga testi:

```text
Teksti:  OPERATINGSYSTEMKERNEL
Pattern: SYSTEM
```

Pattern-i ka gjatësi `M = 6`:

```text
indeksi:  0 1 2 3 4 5
pattern:  S Y S T E M
```

Gjendja `j` tregon sa karaktere të pattern-it janë përputhur. Gjendja `6` është gjendja pranuese.

Tabela e DFA-së për karakteret relevante:

| Karakteri | j=0 | j=1 | j=2 | j=3 | j=4 | j=5 |
|---|---:|---:|---:|---:|---:|---:|
| `S` | 1 | 1 | 3 | 1 | 1 | 1 |
| `Y` | 0 | 2 | 0 | 2 | 0 | 0 |
| `T` | 0 | 0 | 0 | 4 | 0 | 0 |
| `E` | 0 | 0 | 0 | 0 | 5 | 0 |
| `M` | 0 | 0 | 0 | 0 | 0 | 6 |
| karakter tjetër | 0 | 0 | 0 | 0 | 0 | 0 |

Pjesa e rëndësishme është se `S` përsëritet në pattern. Për këtë arsye, DFA-ja nuk kthehet gjithmonë në zero.

Gjurmimi në tekst:

- `OPERATING` e mban gjendjen në `0`;
- `S` e çon `0 -> 1`;
- `Y` e çon `1 -> 2`;
- `S` e çon `2 -> 3`;
- `T` e çon `3 -> 4`;
- `E` e çon `4 -> 5`;
- `M` e çon `5 -> 6`.

Pattern-i fillon në indeksin:

```text
9
```

Kërkimi:

```java
int i;
int j;
int N = text.length();
int M = pattern.length();

for (i = 0, j = 0; i < N && j < M; i++) {
    j = dfa[text.charAt(i)][j];
}

if (j == M) {
    return i - M;
}

return N;
```

## Detyra 5 - `expand()` në Huffman

Në dekompresim duhet:

1. të lexohet Trie-i binar nga inputi;
2. të lexohet numri i karaktereve origjinale;
3. për secilin karakter, të ndiqen bitat nga root-i deri te një leaf;
4. `0` shkon majtas dhe `1` shkon djathtas;
5. karakteri në leaf shkruhet në output.

Kodi standard:

```java
public static void expand() {
    Node root = readTrie();
    int length = BinaryStdIn.readInt();

    for (int i = 0; i < length; i++) {
        Node x = root;

        while (!x.isLeaf()) {
            boolean bit = BinaryStdIn.readBoolean();

            if (bit) {
                x = x.right;
            } else {
                x = x.left;
            }
        }

        BinaryStdOut.write(x.ch, 8);
    }

    BinaryStdOut.close();
}
```

Mos e ngatërro `length` me numrin e bitave të kompresuar. `length` është numri i karaktereve që duhet të dalin pas dekompresimit.

---

# Çka duhet të praktikosh pas këtij testi

Pa e shiku materialin, provo t'i bësh këto:

1. Shpjego pse Dijkstra dështon me negative edges.
2. Trego dallimin mes BFS, Dijkstra dhe Bellman-Ford.
3. Shkruaj hapat e Kosaraju-Sharir sipas rendit.
4. Shpjego pse Trie është i mirë për autocomplete.
5. Ekzekuto Brute Force në një tekst të ri.
6. Ndërto DFA për pattern-in `ABAB`.
7. Ekzekuto LZW në inputin `ABABABA`.
8. Shkruaj `Huffman.expand()` pa e kopjuar.
9. Shpjego forward dhe backward residual edge.
10. Jep një kundërshembull pse DFS nuk jep shortest path.

## Prioriteti i ri për provim

Bazuar në pyetjet reale, mëso në këtë rend:

1. `08-Substring-Search.md`
2. `05-Shortest-Paths.md`
3. `10-Data-Compression-Huffman-LZW.md`
4. `07-Tries-dhe-TST.md`
5. `03-Grafet-e-Drejtuara-DAG-SCC.md`
6. `11-Maximum-Flow-Ford-Fulkerson.md`
7. `04-Minimum-Spanning-Tree.md`
8. `06-Key-Indexed-Counting-LSD-MSD.md`

DFS/BFS duhet t'i dish si bazë, por fotografitë tregojnë se pjesa më e madhe e pikëve praktike është te substring search, shortest paths dhe compression.
