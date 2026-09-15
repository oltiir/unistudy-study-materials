# 01 - Parakushtet: gjithçka që duhet para algoritmeve

Ky kapitull i sqaron termat që përdoren në të gjitha temat e tjera. Mos e kalo një term nëse nuk e kupton, sepse algoritmet e mëvonshme ndërtohen mbi këto ide.

## 1. Çka është një algoritëm?

Algoritmi është një varg i fundëm dhe i qartë hapash që e shndërron input-in në output.

Shembull i thjeshtë: duam numrin më të madh në vargun `[4, 2, 9, 5]`.

1. E marrim elementin e parë si maksimum të përkohshëm: `max = 4`.
2. E krahasojmë `2` me `4`; maksimumi mbetet `4`.
3. E krahasojmë `9` me `4`; maksimumi bëhet `9`.
4. E krahasojmë `5` me `9`; maksimumi mbetet `9`.
5. Output-i është `9`.

Algoritmi duhet të përfundojë. Një procedurë që mund të vazhdojë pafund nuk është zgjidhje e vlefshme.

## 2. Input, output dhe gjendja e algoritmit

- **Input** janë të dhënat që algoritmi i pranon.
- **Output** është rezultati që prodhon.
- **Gjendja** janë vlerat e përkohshme gjatë ekzekutimit.

Në provim shpesh nuk mjafton vetëm output-i. Duhet ta tregosh gjendjen pas çdo hapi, për shembull:

- cilat kulme janë `marked`;
- çka gjendet në queue ose stack;
- vlerat në `distTo[]`;
- brinjët e zgjedhura për MST;
- përmbajtjen e dictionary në LZW;
- residual capacities në Ford-Fulkerson.

## 3. Array dhe indeks

Array është një varg elementesh të ruajtura me rend. Indeksi zakonisht fillon nga `0`.

```text
Vargu:   [A, B, C, D]
Indeksi:  0  1  2  3
```

`a[2]` është `C`. Qasja në një indeks të njohur bëhet në `O(1)`.

Në algoritmet e grafeve hasen shpesh këto arrays:

- `marked[v]`: tregon nëse kulmi `v` është vizituar;
- `edgeTo[v]`: tregon prej cilit kulm kemi ardhur te `v`;
- `distTo[v]`: distanca më e mirë e njohur nga burimi te `v`;
- `id[v]`: komponenti ku bën pjesë `v`.

## 4. Stack - LIFO

Stack ndjek rregullin **Last In, First Out**. Elementi i fundit që futet është i pari që del.

Operacionet kryesore:

- `push(x)`: vendos `x` në majë;
- `pop()`: heq dhe kthen elementin nga maja;
- `peek()`: e sheh majën pa e hequr;
- `isEmpty()`: kontrollon nëse stack-u është bosh.

Shembull:

```text
push(A) -> [A]
push(B) -> [A, B]
push(C) -> [A, B, C]
pop()   -> kthen C; stack-u bëhet [A, B]
```

DFS përdor stack. Kur DFS shkruhet me rekursion, call stack i programit e kryen të njëjtin rol.

## 5. Queue - FIFO

Queue ndjek rregullin **First In, First Out**. Elementi i parë që futet është i pari që del.

Operacionet:

- `enqueue(x)`: e vendos `x` në fund;
- `dequeue()`: e heq elementin nga fillimi;
- `isEmpty()`: kontrollon nëse queue është bosh.

```text
enqueue(A) -> [A]
enqueue(B) -> [A, B]
enqueue(C) -> [A, B, C]
dequeue()  -> kthen A; queue bëhet [B, C]
```

BFS përdor queue. Kjo e bën BFS-in të punojë nivel pas niveli.

## 6. Priority Queue

Priority queue nuk e nxjerr domosdoshmërisht elementin e futur i pari. Ajo nxjerr elementin me prioritetin më të lartë.

Në **min-priority queue**, del elementi me vlerën më të vogël.

```text
insert(7), insert(2), insert(5)
delMin() -> 2
delMin() -> 5
delMin() -> 7
```

Përdoret në:

- Dijkstra, ku prioriteti është `distTo[v]`;
- Prim, ku prioriteti është pesha më e vogël që e lidh kulmin me pemën;
- Huffman, ku nxirren dy frekuencat më të vogla.

## 7. Set dhe Union-Find

Set është bashkësi pa duplikate. Union-Find mban disa komponentë të ndarë dhe mbështet dy operacione:

- `find(x)`: tregon përfaqësuesin e komponentit të `x`;
- `union(x, y)`: i bashkon komponentët e `x` dhe `y`.

Kruskal e përdor Union-Find për të kontrolluar ciklet:

```text
nëse find(u) != find(v):
    brinja u-v nuk krijon cikël
    merre brinjën
    union(u, v)
përndryshe:
    refuzo brinjën
```

## 8. Rekursioni

Funksioni rekursiv e thërret vetveten. Duhet të ketë:

1. **base case**, ku ndalet;
2. **recursive case**, ku problemi zvogëlohet.

```java
static int factorial(int n) {
    if (n <= 1) return 1;       // base case
    return n * factorial(n - 1); // recursive case
}
```

DFS, MSD sort, Trie dhe shumë algoritme mbi pemë përdorin rekursion.

## 9. Çka është kompleksiteti?

Kompleksiteti tregon si rritet puna kur rritet input-i. Nuk matet me sekonda, sepse sekondat varen nga kompjuteri. Matet me rritjen e numrit të operacioneve.

### O(1) - konstant

Puna nuk rritet me input-in.

```java
int x = a[5];
```

### O(log N) - logaritmik

Në çdo hap problemi zvogëlohet shumë, zakonisht përgjysmë. Binary search është shembull.

### O(N) - linear

Çdo element vizitohet afërsisht një herë.

```java
for (int x : a) {
    System.out.println(x);
}
```

### O(N log N)

Ky është kompleksitet tipik i algoritmeve efikase të sortimit me krahasime.

### O(N²) - kuadratik

Për çdo element kalojmë përsëri nëpër shumë elemente.

```java
for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++)
        doSomething();
```

### Renditja nga më e mira te më e keqja

```text
O(1) < O(log N) < O(N) < O(N log N) < O(N²) < O(2^N)
```

## 10. V dhe E në graf

Për grafet përdoren:

- `V`: numri i kulmeve, vertices;
- `E`: numri i brinjëve, edges.

`O(V + E)` do të thotë se algoritmi përpunon çdo kulm dhe çdo brinjë një numër konstant herësh.

Në graf pa drejtim, çdo brinjë shfaqet në listën e të dy skajeve. Prandaj shuma e shkallëve është `2E`.

## 11. Infinity në shortest paths

Kur nuk njohim ende rrugë deri te një kulm, distancën e shënojmë `∞`.

```text
Burimi s: distTo[s] = 0
Të tjerat: distTo[v] = ∞
```

Në Java mund të përdoret `Double.POSITIVE_INFINITY`.

## 12. Greedy

Algoritmi greedy zgjedh në çdo hap opsionin që duket më i mirë lokalisht. Kjo nuk garanton gjithmonë optimum global. Duhet një veti matematikore që e bën zgjedhjen të sigurt.

Te MST, **cut property** e bën zgjedhjen greedy të sigurt. Kruskal dhe Prim janë greedy.

## 13. Pseudokodi kundrejt Java-s

Pseudokodi nuk ka nevojë të kompilohet. Ai e shpjegon idenë pa sintaksë të panevojshme.

```text
while queue is not empty:
    v = dequeue()
    visit(v)
```

Java e njëjtë:

```java
while (!queue.isEmpty()) {
    int v = queue.remove();
    visit(v);
}
```

Në provim përdor formatin që kërkohet. Nëse kërkohet ekzekutimi me dorë, tabela e hapave është më e vlefshme se kodi i plotë.

## Kontrollo veten

1. Cili është dallimi mes stack dhe queue?
2. Pse Dijkstra përdor min-priority queue?
3. Çka ruan `marked[]`?
4. Çka do të thotë `O(V + E)`?
5. Pse Kruskal përdor Union-Find?
6. Çka është base case?

### Përgjigjet

1. Stack është LIFO; queue është FIFO.
2. Që ta përpunojë kulmin me distancën më të vogël të njohur.
3. Nëse një kulm është vizituar.
4. Puna rritet në mënyrë lineare me kulmet dhe brinjët.
5. Që të kontrollojë nëse një brinjë do të krijojë cikël.
6. Kushti ku rekursioni ndalet.

