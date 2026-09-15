# Algoritmet dhe Strukturat e të Dhënave - Përgatitja për provim

Ky folder është materiali kryesor për pjesën teorike të provimit. Shpjegimet fillojnë prej zeros: nuk supozohet se i di termat, strukturat ndihmëse ose hapat e algoritmeve.

Ushtrimet e plota me grafe dhe vargje shikohen nga videot në `Ligjeratat_-_Semestri_3.docx`. Në këto materiale ka shembuj të vegjël vetëm për ta kuptuar teorinë dhe mënyrën e ekzekutimit.

## Si duhet të mësosh

Për çdo temë përdore këtë rend:

1. Lexoje file-in një herë pa provuar ta mbash mend çdo detaj.
2. Lexoje për herë të dytë dhe shkruaji me dorë hapat e algoritmit.
3. Mbylle materialin dhe provo ta shpjegosh algoritmin me fjalët tua.
4. Shiko videon e ushtrimit dhe ndaloje para çdo hapi.
5. Provo ta bësh vetë hapin e radhës, pastaj vazhdo videon për kontroll.
6. Në fund përgjigju në pyetjet "Kontrollo veten" pa e hapur teorinë.

Vetëm shikimi i videos nuk mjafton. Në provim duhet ta tregosh gjendjen pas çdo hapi: `marked[]`, queue, stack, `distTo[]`, brinjët e MST-së, dictionary ose residual capacities.

## Rendi i materialeve

| Rendi | Materiali | Çka mbulon |
|---:|---|---|
| 1 | [Parakushtet](./01-Parakushtet.md) | Big-O, arrays, stack, queue, priority queue, Union-Find dhe terminologjia bazë |
| 2 | [Grafet pa drejtim](./02-Grafet-Pa-Drejtim-DFS-BFS.md) | Reprezentimi, DFS, BFS, paths dhe connected components |
| 3 | [Grafet e drejtuara](./03-Grafet-e-Drejtuara-DAG-SCC.md) | Digraph, cycle, DAG, topological sort dhe Kosaraju-Sharir |
| 4 | [Minimum Spanning Tree](./04-Minimum-Spanning-Tree.md) | Cut property, greedy, Kruskal, Lazy Prim dhe Eager Prim |
| 5 | [Shortest Paths](./05-Shortest-Paths.md) | Relaxation, Dijkstra, Bellman-Ford dhe Acyclic SP |
| 6 | [String Sorts](./06-Key-Indexed-Counting-LSD-MSD.md) | Key-indexed counting, LSD, MSD dhe 3-way string quicksort |
| 7 | [Tries dhe TST](./07-Tries-dhe-TST.md) | Insert, search, prefix, longest prefix dhe delete |
| 8 | [Substring Search](./08-Substring-Search.md) | Brute force, KMP, Boyer-Moore dhe Rabin-Karp |
| 9 | [Regex dhe NFA](./09-Regex-dhe-NFA.md) | Operatorët regex, NFA, epsilon-transition dhe simulimi |
| 10 | [Data Compression](./10-Data-Compression-Huffman-LZW.md) | Prefix-free codes, Huffman, LZW dhe dekompresimi |
| 11 | [Maximum Flow](./11-Maximum-Flow-Ford-Fulkerson.md) | Flow, residual graph, augmenting path, min-cut dhe Ford-Fulkerson |
| 12 | [Pyetje teorike](./12-Pyetje-Teorike-Flashcards.md) | Pyetje dhe përgjigje për rikujtim aktiv |
| 13 | [Cheat Sheet](./13-Cheat-Sheet.md) | Formulat, kushtet dhe kompleksitetet në një vend |
| 14 | [Mini-provim](./14-Mini-Provim.md) | Simulim i provimit me zgjidhje |
| 15 | [Pyetje reale nga testet](./15-Pyetje-Reale-nga-Testet.md) | Analiza e testit, përgjigjet, zgjidhjet praktike dhe strategjia me pikë negative |

## Plani nga e marta deri të premten

### E martë - Grafet bazë

- Lexo `01-Parakushtet.md` vetëm aq sa të kuptosh stack, queue, priority queue dhe Big-O.
- Mëso tërësisht `02-Grafet-Pa-Drejtim-DFS-BFS.md`.
- Mëso tërësisht `03-Grafet-e-Drejtuara-DAG-SCC.md`.
- Shiko Ligjëratat/Ushtrimet 1 dhe 2.

Rezultati i ditës: duhet të mund ta ekzekutosh DFS/BFS, të gjesh connected components, të kontrollosh nëse grafi është DAG, të japësh një topological order dhe të shpjegosh SCC.

### E mërkurë - Grafet me peshë

- Mëso `04-Minimum-Spanning-Tree.md`.
- Mëso `05-Shortest-Paths.md`.
- Shiko Ligjëratat/Ushtrimet 3-5.

Rezultati i ditës: duhet të mund ta ndërtosh MST me Kruskal/Prim dhe ta plotësosh `distTo[]` me Dijkstra ose Bellman-Ford.

### E enjte - Stringjet, kompresimi dhe flow

- Mëso materialet 06-11 sipas rendit.
- Pas çdo dy temave bëj pauzë 10-15 minuta.
- Shiko ushtrimet përkatëse 6-12.
- Në fund bëje `14-Mini-Provim.md` pa e hapur teorinë.

### E premte - Vetëm përsëritje

- Zgjidhi edhe një herë detyrat në `15-Pyetje-Reale-nga-Testet.md` pa i parë zgjidhjet.
- Lexo `13-Cheat-Sheet.md`.
- Përgjigju me zë në flashcards.
- Rishiko vetëm gabimet e mini-provimit.
- Mos fillo temë të re.

## Videot

| Nr. | Ligjërata | Ushtrimi |
|---:|---|---|
| 1 | [Ligjërata 1](https://www.youtube.com/watch?v=Jxiu3MtsVgg) | [Ushtrimi 1](https://www.youtube.com/watch?v=jANLJngStwA) |
| 2 | [Ligjërata 2](https://www.youtube.com/watch?v=eMq4om7WqJU) | [Ushtrimi 2](https://www.youtube.com/watch?v=dBq2LQW2ntY) |
| 3 | [Ligjërata 3](https://www.youtube.com/watch?v=YKy8Kl6mYxk) | [Ushtrimi 3](https://www.youtube.com/watch?v=2yHfM_geaPs) |
| 4 | [Ligjërata 4](https://www.youtube.com/watch?v=w51lmRgpZ_g) | [Ushtrimi 4](https://www.youtube.com/watch?v=sWmTbb1scgY) |
| 5 | [Ligjërata 5](https://www.youtube.com/watch?v=vi4T5Q_JM7I) | [Ushtrimi 5](https://www.youtube.com/watch?v=lH0iwfn9s2c) |
| 6 | [Ligjërata 6](https://www.youtube.com/watch?v=3KDUk3GDOVM) | [Ushtrimi 6](https://www.youtube.com/watch?v=lf1UgnJF7WM) |
| 7 | [Ligjërata 7](https://www.youtube.com/watch?v=K0lJ9nZI1TE) | [Ushtrimi 7](https://www.youtube.com/watch?v=pVFeD5_mYwo) |
| 8 | [Ligjërata 8](https://www.youtube.com/watch?v=4s7zaiAy_nA) | [Ushtrimi 8](https://www.youtube.com/watch?v=WqF0ExfKM-w) |
| 9 | [Ligjërata 9](https://www.youtube.com/watch?v=pJu-I9fCz2g) | [Ushtrimi 9](https://www.youtube.com/watch?v=X0wzWf367Cg) |
| 10 | [Ligjërata 10](https://www.youtube.com/watch?v=5kXoXfFUshU) | [Ushtrimi 10](https://www.youtube.com/watch?v=vs2Te_JFTpc) |
| 11 | [Ligjërata 11](https://www.youtube.com/watch?v=bIy2dd4gFOs) | [Ushtrimi 11](https://www.youtube.com/watch?v=5_NZc0FpNHA) |
| 12 | [Ligjërata 12](https://www.youtube.com/watch?v=FIwWQf8gyYM) | [Ushtrimi 12](https://www.youtube.com/watch?v=20X0K2TOomE) |

[Video e përsëritjes](https://www.youtube.com/watch?v=13nW_n8C6TI)

## Çka do të thotë "e di temën"

Një temë nuk konsiderohet e mësuar vetëm sepse e njeh emrin. Duhet të mundesh:

- ta shpjegosh problemin që zgjidh;
- t'i tregosh strukturat që përdor;
- ta ekzekutosh me dorë;
- ta tregosh kushtin kur lejohet;
- ta tregosh kompleksitetin;
- ta krahasosh me algoritmin më të ngjashëm;
- ta dallosh një pohim të gabuar në true/false.
