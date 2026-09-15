# 04 - Minimum Spanning Tree: Greedy, Kruskal dhe Prim

Video përkatëse: [Ligjërata 3](https://www.youtube.com/watch?v=YKy8Kl6mYxk) dhe [Ushtrimi 3](https://www.youtube.com/watch?v=2yHfM_geaPs).

## 1. Çfarë problemi po zgjidhim?

Kemi graf:

- pa drejtim;
- të lidhur;
- me peshë në çdo brinjë.

Duam t'i lidhim të gjitha kulmet me peshën totale më të vogël, pa krijuar lidhje të panevojshme.

Shembull praktik: qytetet janë kulme, kostoja e kabllos mes dy qyteteve është pesha. Duam t'i lidhim të gjitha qytetet me koston minimale.

## 2. Edge-weighted graph

Brinja nuk është vetëm `v-w`, por ka edhe peshë.

```java
class Edge implements Comparable<Edge> {
    private final int v;
    private final int w;
    private final double weight;

    Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    int either() {
        return v;
    }

    int other(int vertex) {
        if (vertex == v) return w;
        if (vertex == w) return v;
        throw new IllegalArgumentException();
    }

    double weight() {
        return weight;
    }

    @Override
    public int compareTo(Edge other) {
        return Double.compare(this.weight, other.weight);
    }
}
```

`Comparable` nevojitet që brinjët të renditen sipas peshës ose të futen në priority queue.

## 3. Tree dhe spanning tree

### Tree

Tree është graf që:

- është connected;
- nuk ka cycle.

Për `V` kulme, çdo tree ka saktësisht `V-1` brinjë.

Këto tri pohime lidhen mes vete:

- connected dhe pa cycle;
- connected dhe ka `V-1` brinjë;
- pa cycle dhe ka `V-1` brinjë.

### Spanning tree

Spanning tree është tree që përmban të gjitha kulmet e grafit origjinal.

Grafi mund të ketë shumë spanning trees.

### Minimum Spanning Tree - MST

MST është spanning tree me shumën minimale të peshave.

Nëse peshat e të gjitha brinjëve janë të ndryshme, MST është unik. Nëse disa pesha janë të barabarta, mund të ketë më shumë se një MST me të njëjtën peshë totale.

## 4. Cut

Cut është ndarje e kulmeve në dy grupe jo të zbrazëta.

```text
Grupi A: {0, 1, 2}
Grupi B: {3, 4, 5}
```

Crossing edge është brinjë me një skaj në A dhe tjetrin në B.

## 5. Cut Property

**Cut property:** për çdo cut, brinja me peshën më të vogël që e kalon cut-in është e sigurt për MST, nëse peshat janë të dallueshme.

Kjo është arsyeja pse zgjedhja greedy funksionon.

Mos e mëso vetëm fjalinë. Ideja është:

1. Çdo spanning tree duhet ta kalojë cut-in të paktën një herë, përndryshe dy grupet mbeten të ndara.
2. Nëse përdorim një crossing edge më të shtrenjtë, mund ta zëvendësojmë me më të lirën.
3. Prandaj brinja minimale e cut-it është zgjedhje e sigurt.

## 6. Greedy MST - forma e përgjithshme

```text
Fillo pa brinjë.

Derisa të kesh V-1 brinjë:
    gjej një cut që respekton brinjët e zgjedhura
    merr minimum-weight crossing edge
```

Kruskal dhe Prim janë dy mënyra të ndryshme për të zgjedhur cut-in.

## 7. Kruskal

Kruskal i shqyrton brinjët globalisht nga më e lira te më e shtrenjta.

### Hapat

1. Rendit të gjitha brinjët sipas peshës në rritje.
2. Fillo me MST bosh.
3. Merre brinjën më të lirë të mbetur.
4. Nëse skajet janë në komponentë të ndryshme, merre dhe bashko komponentët.
5. Nëse skajet janë tashmë të lidhura, brinja krijon cycle; refuzoje.
6. Ndalo kur ke `V-1` brinjë.

### Pseudokodi

```text
pq = të gjitha brinjët sipas peshës
uf = UnionFind(V)

derisa pq nuk është bosh dhe mst.size < V-1:
    e = pq.delMin()
    v = e.either()
    w = e.other(v)

    nëse uf.find(v) != uf.find(w):
        uf.union(v, w)
        mst.add(e)
```

### Shembull i plotë

Brinjët:

```text
BC=1, AC=2, DE=2, AB=4, BD=5, CD=8, CE=10
```

Ka 5 kulme, prandaj MST duhet të ketë 4 brinjë.

| Hapi | Brinja | Vendimi | Arsyeja | MST |
|---:|---|---|---|---|
| 1 | BC=1 | merret | B dhe C janë të ndara | BC |
| 2 | AC=2 | merret | A nuk është në komponentin BC | BC, AC |
| 3 | DE=2 | merret | D dhe E janë të ndara | BC, AC, DE |
| 4 | AB=4 | refuzohet | A dhe B tashmë lidhen përmes C; krijon cikël | pa ndryshim |
| 5 | BD=5 | merret | bashkon ABC me DE | BC, AC, DE, BD |

Pesha totale: `1+2+2+5 = 10`.

### Kompleksiteti

Renditja e brinjëve dominon:

```text
O(E log E)
```

Operacionet Union-Find janë praktikisht shumë afër `O(1)` kur përdoren path compression dhe weighting.

## 8. Prim

Prim nuk ndërton shumë komponentë. Ai rrit një tree të vetëm nga një kulm fillestar.

Në çdo hap ekziston cut-i:

- brenda: kulmet tashmë në MST;
- jashtë: kulmet ende të papërfshira.

Prim zgjedh brinjën më të lirë që kalon këtë cut.

## 9. Lazy Prim

Lazy Prim i mban në priority queue të gjitha brinjët kandidate, edhe disa që më vonë bëhen të pavlefshme.

### Hapat

1. Zgjidh kulmin fillestar, p.sh. `0`.
2. Shënoje dhe fut në min-PQ të gjitha brinjët nga ai kulm drejt kulmeve të pashënuara.
3. Nxirre brinjën minimale.
4. Nëse të dy skajet janë marked, refuzoje; është stale dhe do të krijonte cycle.
5. Përndryshe merre brinjën, vizito kulmin e ri dhe fut brinjët e tij drejt jashtë.
6. Vazhdo deri në `V-1` brinjë.

### Pseudokodi

```text
visit(0)

derisa pq nuk është bosh:
    e = pq.delMin()
    v = e.either()
    w = e.other(v)

    nëse marked[v] dhe marked[w]:
        continue

    mst.add(e)

    nëse v nuk është marked: visit(v)
    nëse w nuk është marked: visit(w)
```

`visit(v)`:

```text
marked[v] = true
për çdo edge e nga v:
    nëse skaji tjetër nuk është marked:
        pq.insert(e)
```

Quhet lazy sepse brinjët e pavlefshme nuk hiqen menjëherë nga PQ; ato hidhen kur dalin.

## 10. Eager Prim - general implementation

Eager Prim mban vetëm kandidatin më të mirë për secilin kulm jashtë pemës.

Arrays:

- `edgeTo[w]`: brinja më e lirë e njohur që e lidh `w` me pemën;
- `distTo[w]`: pesha e asaj brinje;
- `marked[w]`: a është futur `w` në MST;
- indexed min-PQ: prioriteti i `w` është `distTo[w]`.

### Inicializimi

```text
distTo[v] = ∞ për çdo v
distTo[0] = 0
insert 0 në pq me prioritet 0
```

### Kur vizitojmë v

```text
marked[v] = true

për çdo edge v-w:
    nëse marked[w]: vazhdo

    nëse edge.weight < distTo[w]:
        edgeTo[w] = edge
        distTo[w] = edge.weight
        përditëso w në priority queue
```

### Dallimi lazy/eager

| Lazy Prim | Eager Prim |
|---|---|
| Mban shumë brinjë kandidate | Mban një kandidat më të mirë për kulm |
| Mund të nxjerrë brinjë stale | Përditëson prioritetin menjëherë |
| Më i thjeshtë për ta kuptuar | Më efikas në memorie |

### Kompleksiteti

Me binary heap:

```text
O(E log V)
```

## 11. Kruskal kundrejt Prim

| Kruskal | Prim |
|---|---|
| Zgjedh brinjën më të lirë në tërë graf | Zgjedh brinjën më të lirë që del nga tree aktual |
| Fillon me shumë komponentë | Fillon me një kulm/tree |
| Përdor Union-Find | Përdor marked + priority queue |
| Shumë i qartë për sparse graphs | Shumë i përshtatshëm për rritje nga një burim |

Të dy japin MST të saktë. Mund të zgjedhin brinjë në rend të ndryshëm.

## 12. Nëse grafi nuk është connected

Nuk ekziston një spanning tree që i mbulon të gjitha kulmet. Algoritmi prodhon **minimum spanning forest**, pra nga një MST për secilin connected component.

## 13. Gabimet klasike

1. Të merret brinja më e lirë pa kontrolluar cycle/cut.
2. Të ndalet me `V` brinjë në vend të `V-1`.
3. Të mblidhen peshat e brinjëve të refuzuara.
4. Të thuhet se spanning tree ka cikël.
5. Të thuhet se MST është gjithmonë unik.
6. Në Prim, të zgjidhet brinjë që nuk lidhet me tree aktual.
7. Në Kruskal, të përdoret marked në vend të Union-Find pa arsyetim të saktë.

## Kontrollo veten

1. Sa brinjë ka një spanning tree me 12 kulme?
2. Çka është cut?
3. Çka thotë cut property?
4. Pse Kruskal e refuzon një brinjë?
5. Çka dallon Lazy Prim nga Eager Prim?
6. Kur mund të ketë më shumë se një MST?

### Përgjigjet

1. 11.
2. Ndarje e kulmeve në dy grupe jo të zbrazëta.
3. Brinja minimale që kalon një cut të vlefshëm është e sigurt për MST.
4. Sepse skajet janë tashmë në të njëjtin komponent dhe brinja krijon cycle.
5. Lazy mban të gjitha brinjët kandidate; eager vetëm kandidatin më të mirë për çdo kulm.
6. Kur ka pesha të barabarta.

