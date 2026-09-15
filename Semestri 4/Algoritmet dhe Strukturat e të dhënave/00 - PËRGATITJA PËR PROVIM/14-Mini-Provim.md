# 14 - Mini-provim simulues

Koha: 90 minuta. Pikët: 100.

Rregullat:

1. Mos i hap materialet gjatë pjesës së parë.
2. Trego hapat, jo vetëm rezultatin.
3. Pas 90 minutash kalo te zgjidhjet.
4. Për çdo gabim, shëno file-in që duhet ta përsëritësh.

## Pjesa A - Teori dhe True/False (20 pikë)

### 1. Përgjigju shkurt (10 pikë)

a. Cili është dallimi mes stack dhe queue? (2)

b. Çka do të thotë që dy kulme janë strongly connected? (2)

c. Çka ruan `edgeTo[]` në shortest paths? (2)

d. Çka është prefix-free code? (2)

e. Çka është bottleneck në augmenting path? (2)

### 2. Shëno Saktë/Gabim dhe arsyetoje me një fjali (10 pikë)

a. DFS garanton shortest path në graf pa peshë.

b. Një digraph mund të ketë topological order vetëm nëse është DAG.

c. Çdo spanning tree me V kulme ka V brinjë.

d. Dijkstra lejon negative edges nëse nuk ka negative cycle.

e. LSD duhet ta ruajë stabilitetin në çdo pozitë.

f. Në TST, indeksi i stringut rritet kur shkojmë left.

g. Dy stringje me hash të njëjtë janë domosdoshmërisht të njëjta.

h. `A*` e pranon stringun bosh.

i. Huffman gjithmonë bashkon dy nyjat me frekuencën më të vogël.

j. Backward residual edge mund ta zvogëlojë flow-in e mëhershëm.

## Pjesa B - Grafet (35 pikë)

### 3. DFS dhe BFS (10 pikë)

Grafi pa drejtim ka adjacency lists në këtë rend:

```text
A: B, C
B: A, D, E
C: A, E
D: B, F
E: B, C, F
F: D, E
```

a. Jep rendin DFS nga A. (4)

b. Jep rendin BFS nga A dhe queue pas çdo hapi. (4)

c. Jep një shortest path nga A te F sipas BFS. (2)

### 4. Topological Sort (8 pikë)

Digraph-i ka brinjët:

```text
A->C, B->C, B->D, C->E, D->E, E->F
```

a. Llogarit indegree fillestar. (2)

b. Jep një topological order me Kahn algorithm. (4)

c. A është renditja unike? Arsyeto. (2)

### 5. Kruskal (8 pikë)

Brinjët:

```text
AB=4, AC=2, BC=1, BD=5, CD=8, CE=10, DE=2
```

Gjej MST me Kruskal. Për çdo brinjë trego merret/refuzohet dhe në fund peshën totale.

### 6. Dijkstra (9 pikë)

Brinjët:

```text
S->A=4, S->B=1, B->A=2, A->T=1, B->T=5
```

Plotëso `distTo` pas çdo kulmi të nxjerrë nga priority queue dhe jep shortest path S->T.

## Pjesa C - String Algorithms (25 pikë)

### 7. Key-indexed counting (5 pikë)

Shpjego katër hapat dhe pse përdoret `count[key+1]`.

### 8. LSD/MSD (5 pikë)

Jep tri dallime mes LSD dhe MSD. Shpjego pse LSD duhet stable.

### 9. Trie (5 pikë)

Ndërto konceptualisht Trie për:

```text
CAR, CAT, CART, DOG
```

Shpjego çka ndodh kur fshihet `CAR`. Cilat fjalë mbesin?

### 10. KMP (5 pikë)

Ndërto LPS për:

```text
ABABCABAB
```

Shpjego çka ndodh në mismatch kur `j>0`.

### 11. Regex (5 pikë)

Ndërto regex që pranon vetëm:

```text
MIN, MIND, MINE, MINER, MINT
```

A i pranon `MINERAL` dhe `MINORITY`? Arsyeto.

## Pjesa D - Compression dhe Flow (20 pikë)

### 12. Huffman (10 pikë)

Për `MISSISSIPPI`:

a. Gjej frekuencat. (2)

b. Trego rendin e bashkimeve. (3)

c. Jep një code table prefix-free. (3)

d. Llogarit numrin e bitëve të payload-it. (2)

### 13. Ford-Fulkerson (10 pikë)

Rrjeti:

```text
s->a=10
s->b=5
a->b=15
a->t=10
b->t=10
```

a. Jep augmenting paths dhe bottleneck për secilin. (4)

b. Jep max flow. (2)

c. Jep një minimum cut dhe capacity. (2)

d. Shpjego pse ekziston backward edge në residual graph. (2)

---

# Zgjidhjet

## Pjesa A

### 1

a. Stack është LIFO; queue është FIFO.

b. Ekziston rrugë nga v te w dhe nga w te v.

c. Brinjën e fundit në rrugën më të mirë të njohur nga source te kulmi.

d. Asnjë kod nuk është prefix i një kodi tjetër.

e. Residual capacity minimale në augmenting path.

### 2

a. **Gabim.** BFS garanton shortest path pa peshë; DFS jo.

b. **Saktë.** Directed cycle e bën renditjen topologjike të pamundur.

c. **Gabim.** Ka V-1 brinjë.

d. **Gabim.** Dijkstra kërkon të gjitha peshat jo-negative.

e. **Saktë.** Përndryshe prishet rendi nga kolonat e mëparshme.

f. **Gabim.** Indeksi rritet vetëm kur karakteri është i barabartë dhe shkojmë mid.

g. **Gabim.** Mund të ketë collision.

h. **Saktë.** Star lejon zero paraqitje.

i. **Saktë.** Përdor min-PQ dhe i bashkon dy minimumet.

j. **Saktë.** Kapaciteti backward është flow-i që mund të anulohet.

## Pjesa B

### 3. DFS/BFS

Me rendin e dhënë të adjacency lists:

```text
DFS: A, B, D, F, E, C
```

BFS:

| Hapi | Del | Queue pas hapit |
|---:|---|---|
| 0 | - | A |
| 1 | A | B, C |
| 2 | B | C, D, E |
| 3 | C | D, E |
| 4 | D | E, F |
| 5 | E | F |
| 6 | F | bosh |

Një shortest path A->F është `A-B-D-F`, me 3 brinjë. `A-C-E-F` gjithashtu ka 3 brinjë; cili regjistrohet varet nga rendi i zbulimit.

### 4. Topological

Indegree:

```text
A=0, B=0, C=2, D=1, E=2, F=1
```

Një rend:

```text
A, B, C, D, E, F
```

Mund të merret B para A dhe, pasi përpunohen prerequisites, C/D mund të kenë rend të ndryshëm që respekton brinjët. Prandaj renditja nuk është unike.

### 5. Kruskal

Rendi:

```text
BC=1, AC=2, DE=2, AB=4, BD=5, CD=8, CE=10
```

Vendimet:

```text
BC merret
AC merret
DE merret
AB refuzohet - cycle A-B-C-A
BD merret
```

Ka 5 kulme dhe 4 brinjë, prandaj ndalemi. Pesha `1+2+2+5=10`.

### 6. Dijkstra

```text
Fillimi: S=0, A=∞, B=∞, T=∞
Pas S:    S=0, A=4, B=1, T=∞
Pas B:    S=0, A=3, B=1, T=6
Pas A:    S=0, A=3, B=1, T=4
Pas T:    pa ndryshim
```

Rruga: `S->B->A->T`, pesha 4.

## Pjesa C

### 7. Key-indexed counting

Frekuencat me offset; cumulative sums; shpërndarja stable në aux; kopjimi prapa. `key+1` bën që pas cumulative sums `count[key]` të jetë pozita fillestare e grupit.

### 8. LSD/MSD

- LSD nis nga fundi; MSD nga fillimi.
- LSD zakonisht kërkon gjatësi fikse; MSD lejon variabile.
- LSD është iterativ për W kolona; MSD është rekursiv sipas grupeve.

LSD duhet stable që sortimi i kolonës së re të ruajë rendin e krijuar nga kolonat më pak të rëndësishme.

### 9. Trie

CAR, CAT dhe CART ndajnë `C-A`. CAR dhe CART ndajnë edhe R. DOG është degë tjetër.

Kur fshihet CAR, hiqet value në R, por nyja R ruhet sepse vazhdon te T për CART. Mbesin CAT, CART dhe DOG.

### 10. KMP

```text
Pattern: A B A B C A B A B
LPS:     0 0 1 2 0 1 2 3 4
```

Në mismatch dhe `j>0`, bëhet `j=lps[j-1]`; `i` nuk ndryshon.

### 11. Regex

```text
MIN(D|E(R)?|T)?
```

MINERAL refuzohet sepse pas MINER mbeten AL. MINORITY refuzohet sepse pas MIN nuk ekziston alternativa ORITY.

## Pjesa D

### 12. Huffman

Frekuencat:

```text
M=1, I=4, S=4, P=2
```

Bashkimet:

```text
1+2=3
3+4=7
4+7=11
```

Një code table:

```text
I=0, S=11, P=101, M=100
```

Bitët:

```text
4*1 + 4*2 + 2*3 + 1*3 = 21
```

### 13. Ford-Fulkerson

Një zgjedhje e paths:

```text
s->a->t, bottleneck 10
s->b->t, bottleneck 5
```

Max flow është 15.

Minimum cut mund të jetë `{s}` kundrejt `{a,b,t}`. Capacity është `10+5=15`.

Backward edge lejon anulimin/ridrejtimin e flow-it të mëhershëm, që zgjedhja e një path-i jo të mirë të mos e bllokojë optimumin.

## Interpretimi i rezultatit

- 85-100: teoria është në gjendje shumë të mirë; rishiko vetëm gabimet.
- 70-84: bazat janë të mira; përsërit temat ku humbe më shumë se gjysmën e pikëve.
- 55-69: fokusohu në DFS/BFS, topological/SCC, MST, shortest paths, Huffman dhe flow.
- Nën 55: kthehu te roadmap-i dhe bëj fillimisht temat A me video/ushtrime.

