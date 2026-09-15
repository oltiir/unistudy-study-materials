# 12 - Pyetje teorike dhe Flashcards

Përdorimi: lexo vetëm pyetjen, jep përgjigjen me zë ose në letër, pastaj hape seksionin `<details>` për kontroll. Nëse përgjigjja jote ka vetëm emrin e algoritmit pa arsyen, konsideroje të paplotë.

## Parakushtet

### 1. Cili është dallimi mes stack dhe queue?

<details><summary>Përgjigjja</summary>

Stack është LIFO: elementi i fundit që futet del i pari. Queue është FIFO: elementi i parë që futet del i pari. DFS përdor stack/rekursion, ndërsa BFS përdor queue.

</details>

### 2. Çka do të thotë O(V+E)?

<details><summary>Përgjigjja</summary>

Koha rritet në mënyrë lineare me numrin e kulmeve V dhe brinjëve E. Me adjacency list, DFS/BFS vizitojnë çdo kulm dhe shqyrtojnë çdo brinjë një numër konstant herësh.

</details>

### 3. Për çka përdoret min-priority queue?

<details><summary>Përgjigjja</summary>

Për ta nxjerrë shpejt elementin me key minimale. Në Dijkstra key është distanca, në Prim pesha e lidhjes më të mirë, ndërsa në Huffman frekuenca.

</details>

### 4. Për çka përdoret Union-Find?

<details><summary>Përgjigjja</summary>

Për të mbajtur komponentët dhe për të kontrolluar nëse dy kulme janë tashmë të lidhura. Kruskal e përdor për ta refuzuar brinjën që do të krijonte cikël.

</details>

## Grafet pa drejtim

### 5. Çka është path?

<details><summary>Përgjigjja</summary>

Varg kulmesh ku çdo dy kulme të njëpasnjëshme lidhen me brinjë.

</details>

### 6. Çka është connected component?

<details><summary>Përgjigjja</summary>

Grup maksimal kulmesh ku ekziston rrugë mes çdo çifti kulmesh në grup.

</details>

### 7. Pse DFS ka nevojë për marked[]?

<details><summary>Përgjigjja</summary>

Për të mos vizituar të njëjtin kulm përsëri dhe për të mos hyrë në cikël të pafund.

</details>

### 8. A e jep DFS shortest path?

<details><summary>Përgjigjja</summary>

Jo në përgjithësi. Në graf pa peshë, BFS e jep rrugën me numrin minimal të brinjëve.

</details>

### 9. Pse BFS jep shortest path pa peshë?

<details><summary>Përgjigjja</summary>

Sepse i viziton kulmet nivel pas niveli: fillimisht largësia 1, pastaj 2, e kështu me radhë. Vizita e parë e një kulmi është me numrin minimal të brinjëve.

</details>

### 10. Kur duhet të shënohet kulmi në BFS?

<details><summary>Përgjigjja</summary>

Para se të futet në queue. Nëse shënohet vetëm kur del, mund të futet disa herë nga fqinjë të ndryshëm.

</details>

## Directed graphs

### 11. Çka është DAG?

<details><summary>Përgjigjja</summary>

Directed Acyclic Graph: graf i drejtuar pa directed cycle.

</details>

### 12. Kur ekziston topological order?

<details><summary>Përgjigjja</summary>

Nëse dhe vetëm nëse digraph-i është DAG.

</details>

### 13. A është topological order gjithmonë unik?

<details><summary>Përgjigjja</summary>

Jo. Kur ka disa kulme me indegree zero ose constraints jo të plota, mund të ketë disa renditje të sakta.

</details>

### 14. Si e zbulon Kahn algorithm ciklin?

<details><summary>Përgjigjja</summary>

Nëse queue e kulmeve me indegree zero zbrazet para se të përpunohen V kulme, kulmet e mbetura janë në/varen nga cikli.

</details>

### 15. Çka do të thotë strongly connected?

<details><summary>Përgjigjja</summary>

Për kulmet v dhe w ekziston rrugë v->w dhe rrugë w->v.

</details>

### 16. Cilët janë hapat e Kosaraju-Sharir?

<details><summary>Përgjigjja</summary>

Krijo reverse graph; gjej reverse postorder në reverse graph; ekzekuto DFS në grafin origjinal sipas atij rendi; çdo nisje e re formon SCC.

</details>

### 17. Pse condensation graph është DAG?

<details><summary>Përgjigjja</summary>

Një cikël mes SCC-ve do të nënkuptonte arritshmëri në të dy drejtimet, prandaj ato do të ishin një SCC e vetme.

</details>

## MST

### 18. Sa brinjë ka një spanning tree me V kulme?

<details><summary>Përgjigjja</summary>

V-1.

</details>

### 19. Çka është cut property?

<details><summary>Përgjigjja</summary>

Brinja me peshën më të vogël që e kalon një cut të vlefshëm është e sigurt për MST, nën kushtet standarde të algoritmit.

</details>

### 20. Kur Kruskal e refuzon brinjën?

<details><summary>Përgjigjja</summary>

Kur skajet e saj janë tashmë në të njëjtin komponent, sepse brinja do të krijonte cikël.

</details>

### 21. Si dallon Prim nga Kruskal?

<details><summary>Përgjigjja</summary>

Prim rrit një tree nga një kulm dhe zgjedh brinjën minimale që del nga tree. Kruskal zgjedh globalisht brinjët nga më e lira dhe bashkon komponentë me Union-Find.

</details>

### 22. Pse Lazy Prim quhet lazy?

<details><summary>Përgjigjja</summary>

Sepse nuk i heq menjëherë brinjët që bëhen të pavlefshme; i lë në PQ dhe i refuzon kur dalin.

</details>

### 23. Kur është MST unik?

<details><summary>Përgjigjja</summary>

Garantohet unik kur të gjitha peshat janë të ndryshme. Me pesha të barabarta mund të ketë disa MST.

</details>

## Shortest Paths

### 24. Çka është relaxation?

<details><summary>Përgjigjja</summary>

Kontrolli nëse rruga deri te v plus brinja v->w është më e lirë se distTo[w]. Nëse po, përditësohen distTo[w] dhe edgeTo[w].

</details>

### 25. Kur mund të përdoret Dijkstra?

<details><summary>Përgjigjja</summary>

Kur të gjitha peshat e brinjëve janë jo-negative.

</details>

### 26. Pse Dijkstra dështon me negative edge?

<details><summary>Përgjigjja</summary>

Sepse e konsideron distancën finale kur kulmi del minimum nga PQ, por një brinjë negative e zbuluar më vonë mund ta zvogëlojë atë.

</details>

### 27. Pse Bellman-Ford relakson V-1 herë?

<details><summary>Përgjigjja</summary>

Një shortest simple path ka maksimum V-1 brinjë. Çdo kalim mund ta zgjerojë informacionin e saktë me një brinjë tjetër.

</details>

### 28. Si zbulohet negative cycle?

<details><summary>Përgjigjja</summary>

Pas V-1 kalimeve bëhet një kalim shtesë. Nëse ende përmirësohet ndonjë distancë, ka negative cycle të arritshëm.

</details>

### 29. Pse shortest path në DAG lejon negative edges?

<details><summary>Përgjigjja</summary>

DAG nuk ka cikle. Në topological order të gjitha hyrjet e një kulmi përpunohen para brinjëve të tij dalëse, prandaj mjafton një kalim.

</details>

## String sorts dhe Tries

### 30. Cilët janë katër hapat e key-indexed counting?

<details><summary>Përgjigjja</summary>

Numëro frekuencat; llogarit cumulative sums; shpërndaj stabilisht në aux; kopjo prapa.

</details>

### 31. Pse përdoret count[key+1]++?

<details><summary>Përgjigjja</summary>

Offset-i lejon që pas cumulative sums count[key] të tregojë pozitën fillestare të atij key.

</details>

### 32. Pse LSD duhet stable?

<details><summary>Përgjigjja</summary>

Që sortimi sipas kolonës së re të mos e prishë rendin e vendosur nga kolonat më pak të rëndësishme.

</details>

### 33. LSD kundrejt MSD?

<details><summary>Përgjigjja</summary>

LSD nis nga karakteri i fundit dhe zakonisht përdor gjatësi fikse. MSD nis nga i pari, ndan sipas prefix-it dhe punon me gjatësi variabile.

</details>

### 34. Si dallon key i plotë nga prefix në Trie?

<details><summary>Përgjigjja</summary>

Nyja ku përfundon key ka value/shenjë fundi. Arritja te nyja pa value tregon vetëm prefix.

</details>

### 35. Çka ndodh kur fshihet POTTER, por ekziston POTTERHEAD?

<details><summary>Përgjigjja</summary>

Hiqet value e POTTER, por nyjat e prefix-it ruhen sepse kanë child që nevojitet për POTTERHEAD.

</details>

### 36. Kur rritet indeksi d në TST?

<details><summary>Përgjigjja</summary>

Vetëm kur karakteri është i barabartë me karakterin e nyjës dhe kalojmë në lidhjen mid. Kur shkojmë left/right, d nuk ndryshon.

</details>

## Substring, Regex dhe NFA

### 37. Çka ruan LPS në KMP?

<details><summary>Përgjigjja</summary>

Gjatësinë e proper prefix-it më të gjatë që është edhe suffix për prefix-in e pattern-it deri në atë pozitë.

</details>

### 38. Çka ndodh në KMP mismatch kur j>0?

<details><summary>Përgjigjja</summary>

Vendoset j=lps[j-1]. Indeksi i text-it i nuk ndryshon.

</details>

### 39. Pse Rabin-Karp verifikon karakteret kur hash-et përputhen?

<details><summary>Përgjigjja</summary>

Sepse dy stringje të ndryshme mund të kenë të njëjtin hash; kjo quhet collision.

</details>

### 40. Në cilin drejtim krahason Boyer-Moore?

<details><summary>Përgjigjja</summary>

Nga fundi i pattern-it drejt fillimit.

</details>

### 41. Çka dallon A* nga A+?

<details><summary>Përgjigjja</summary>

A* lejon zero ose më shumë A; A+ kërkon të paktën një A.

</details>

### 42. Çka është epsilon transition?

<details><summary>Përgjigjja</summary>

Transition në NFA që ndryshon gjendje pa konsumuar karakter input-i.

</details>

### 43. Kur NFA e pranon stringun?

<details><summary>Përgjigjja</summary>

Kur janë konsumuar të gjitha karakteret dhe accept state është në bashkësinë e gjendjeve aktive.

</details>

## Compression dhe Flow

### 44. Çka është prefix-free code?

<details><summary>Përgjigjja</summary>

Kod ku asnjë kod i simbolit nuk është prefix i kodit të një simboli tjetër.

</details>

### 45. Cilat nyja bashkon Huffman?

<details><summary>Përgjigjja</summary>

Dy nyjat me frekuencën më të vogël. Parent-i ka shumën e frekuencave dhe futet prapa në min-PQ.

</details>

### 46. Si bëhet Huffman decompression?

<details><summary>Përgjigjja</summary>

Nga root, 0 shkon majtas dhe 1 djathtas. Kur arrihet leaf output-ohet simboli dhe kthehemi në root.

</details>

### 47. Çka output-on LZW kur w+c nuk është në dictionary?

<details><summary>Përgjigjja</summary>

Output-on kodin e w, shton w+c në dictionary dhe vendos w=c.

</details>

### 48. Cilat janë dy rregullat e flow të vlefshëm?

<details><summary>Përgjigjja</summary>

Capacity constraint 0<=f(e)<=c(e) dhe flow conservation në çdo kulm tjetër nga source/sink.

</details>

### 49. Çka është residual capacity?

<details><summary>Përgjigjja</summary>

Mundësia për të shtuar flow në drejtim forward, c-f, ose për të anuluar flow në drejtim backward, f.

</details>

### 50. Çka është bottleneck?

<details><summary>Përgjigjja</summary>

Residual capacity minimale përgjatë augmenting path. Është sasia maksimale që mund të shtohet në atë path.

</details>

### 51. Pse duhen backward edges?

<details><summary>Përgjigjja</summary>

Lejojnë anulimin dhe ridrejtimin e flow-it të vendosur më herët, që një zgjedhje e keqe e path-it të mos e bllokojë optimumin.

</details>

### 52. Çka thotë max-flow min-cut theorem?

<details><summary>Përgjigjja</summary>

Vlera e maximum flow është e barabartë me capacity e minimum s-t cut.

</details>

