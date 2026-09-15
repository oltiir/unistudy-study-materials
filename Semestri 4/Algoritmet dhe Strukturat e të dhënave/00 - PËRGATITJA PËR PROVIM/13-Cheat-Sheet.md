# 13 - Cheat Sheet

Ky file përdoret për përsëritjen e fundit. Mos e përdor si zëvendësim për teorinë nëse një algoritëm ende nuk e kupton.

## Strukturat ndihmëse

| Strukturë | Rregulli | Përdoret te |
|---|---|---|
| Stack | LIFO | DFS/rekursion |
| Queue | FIFO | BFS, Kahn, Edmonds-Karp |
| Min-PQ | nxjerr minimumin | Dijkstra, Prim, Huffman |
| Union-Find | find/union komponentë | Kruskal |

## Grafet

| Koncepti | Duhet mbajtur mend |
|---|---|
| Adjacency list | Memorie O(V+E) |
| Adjacency matrix | Memorie O(V²), edge check O(1) |
| Tree | connected, pa cycle, V-1 brinjë |
| DAG | directed graph pa cycle |
| SCC | rrugë në të dy drejtimet |

## DFS dhe BFS

```text
DFS: marked[v]=true; për çdo w të pashënuar -> DFS(w)
BFS: marked[s]=true; enqueue(s); dequeue nivel pas niveli
```

- DFS përdor stack/rekursion.
- BFS përdor queue.
- Të dy: `O(V+E)`.
- BFS jep shortest path në graf pa peshë.
- Kulmi në BFS shënohet para enqueue.

## Topological dhe SCC

```text
Topological order ekziston vetëm për DAG.
Për çdo edge u->v, u duhet të jetë para v.
```

Kahn:

```text
indegree 0 -> queue -> hiq edges -> indegree i ri 0 -> queue
```

Kosaraju:

```text
G^R -> reverse postorder -> DFS në G sipas atij rendi
```

Condensation graph i SCC-ve është DAG.

## MST

```text
Spanning tree me V kulme ka V-1 brinjë.
MST minimizon shumën e peshave.
```

Kruskal:

```text
sort edges -> merre nëse find(u)!=find(v) -> union(u,v)
```

Prim:

```text
rrite një tree -> merr minimum edge që kalon cut-in
```

- Kruskal: `O(E log E)`.
- Prim me heap: `O(E log V)`.
- Me pesha të ndryshme MST është unik.

## Shortest Paths

Relaxation:

```text
if distTo[w] > distTo[v] + weight(v,w):
    distTo[w] = distTo[v] + weight(v,w)
    edgeTo[w] = v->w
```

| Algoritmi | Kushti | Koha |
|---|---|---:|
| BFS | graf pa peshë | O(V+E) |
| Dijkstra | peshat >= 0 | O((V+E)logV) |
| Bellman-Ford | lejon negative edges | O(VE) |
| Acyclic SP | grafi është DAG | O(V+E) |

Bellman-Ford:

```text
relakso të gjitha edges V-1 herë
kalim shtesë me përmirësim -> negative cycle
```

## Key-indexed counting

```text
1. count[key+1]++
2. count[r+1] += count[r]
3. aux[count[key]++] = item
4. kopjo aux prapa
```

Koha `O(N+R)`, memoria `O(N+R)`.

## String sorts

| LSD | MSD | 3-way string quicksort |
|---|---|---|
| fund -> fillim | fillim -> më thellë | partition <,=,> |
| gjatësi fikse W | gjatësi variabile | vetëm = kalon d+1 |
| duhet stable | rekursiv | i mirë për prefikse të përbashkëta |

LSD: `O(W(N+R))`.

## Trie/TST

- Trie search/insert: `O(L)` sipas gjatësisë së key.
- Prefix nuk është key pa value/shenjë fundi.
- Delete heq nyjën vetëm nëse nuk ka value dhe nuk ka children.
- R-way Trie: R links për nyjë.
- TST: left/mid/right; `d++` vetëm kur shkohet mid.

## Substring Search

| Algoritmi | Ideja | Koha |
|---|---|---:|
| Brute force | provo çdo fillim | O(NM) worst |
| KMP | LPS/DFA; text nuk kthehet | O(N+M) |
| Boyer-Moore | krahaso nga djathtas; skip | shpesh sublinear |
| Rabin-Karp | rolling hash | O(N+M) expected |

KMP mismatch:

```text
j>0 -> j=lps[j-1], i nuk ndryshon
j=0 -> i++
```

Rabin-Karp: hash match duhet verifikuar për collision.

## Regex/NFA

| Regex | Kuptimi |
|---|---|
| AB | concatenation |
| A\|B | A ose B |
| A* | zero ose më shumë |
| A+ | një ose më shumë |
| A? | zero ose një |
| . | çdo karakter |

NFA:

```text
epsilon closure -> lexo karakter -> transitions -> closure i ri
```

Pranohet vetëm kur input-i mbaron dhe accept state është aktiv.

Regex të ushtrimeve:

```text
BOOK/BOOT/BOAT/BOO/BOT: BO(O(K|T)?|A?T)
HOUSE/HORSE/HOUR/HORSER: HO(U(SE|R)|RSE(R)?)
CATCH/CATE/CAT/CATTLE/CATALOG: CAT(CH|E|TLE|ALOG)?
MIND/MINE/MIN/MINER/MINT: MIN(D|E(R)?|T)?
DRIVE/DIVE/DIE/DIVER/DRIVER: D(R?IVE|IE|IVER|RIVER)
```

## Huffman

```text
frekuencat -> min-PQ -> bashko dy minimumet -> parent=sum -> përsërit
```

- prefix-free;
- 0 majtas, 1 djathtas;
- frequent symbol -> short code;
- decompress: root, ndiq bits, leaf -> output, kthehu root.

MISSISSIPPI:

```text
M=1, I=4, S=4, P=2
Një kod: I=0, S=11, P=101, M=100
Payload = 21 bitë
```

## LZW

```text
nëse w+c ekziston: w=w+c
përndryshe:
    output code(w)
    add(w+c)
    w=c
në fund output code(w)
```

Huffman kodifikon simbole sipas frekuencës; LZW kodifikon stringje që përsëriten me dictionary.

## Maximum Flow

Kushtet:

```text
0 <= f(e) <= c(e)
inflow(v) = outflow(v), për v != s,t
```

Residual:

```text
forward residual = capacity-flow
backward residual = flow
```

Ford-Fulkerson:

```text
gjej augmenting path
bottleneck = minimum residual në path
augmento forward / zvogëlo backward
përsërit deri sa s'ka path
```

```text
max-flow = min-cut
```

## True/False të shpejta

1. DFS përdor queue. **Gabim.**
2. BFS përdor stack. **Gabim.**
3. Topological order ekziston në graf me cycle. **Gabim.**
4. Spanning tree ka V-1 brinjë. **Saktë.**
5. Kruskal dhe Prim janë greedy. **Saktë.**
6. Dijkstra lejon negative edges nëse s'ka negative cycle. **Gabim.**
7. Bellman-Ford mund ta zbulojë negative cycle. **Saktë.**
8. LSD duhet stable. **Saktë.**
9. Çdo prefix në Trie është key. **Gabim.**
10. KMP e kthen text index prapa. **Gabim.**
11. Hash i njëjtë garanton string të njëjtë. **Gabim.**
12. A* kërkon të paktën një A. **Gabim.**
13. Huffman code është prefix-free. **Saktë.**
14. Në flow, kulmi i ndërmjetëm mund të prodhojë flow. **Gabim.**
15. Bottleneck është residuali maksimal. **Gabim; është minimumi.**

