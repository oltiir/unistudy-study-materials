# 16 - Testet reale: çfarë përsëritet dhe si të përgatitesh

Ky udhëzues është ndërtuar nga testet dhe përmbledhja e teorisë që u shtuan më 23 shtator 2026. Qëllimi nuk është t'i mësosh pyetjet përmendësh, por të ushtrosh **formatet që përsëriten**.

## Formati që shihet në teste

| Pjesa | Formati | Çfarë kontrollon | Rreziku kryesor |
|---|---|---|---|
| I | Saktë/Pasaktë | definicione, veti, kompleksitete | ka pikë negative për përgjigje të gabuar |
| II | Një ose disa alternativa të sakta | dallime të imëta mes strukturave/algoritmeve | mund të ketë më shumë se një alternativë të saktë |
| III | Detyra të gjata, zakonisht nga 10 pikë | zgjidhje dhe arsyetim hap pas hapi | rezultati pa hapa zakonisht humb pikë |

Në fotografitë e testeve shfaqet shpesh skema `20 + 30 + 50 = 100` pikë. Formulimi dhe numri i pyetjeve ndryshojnë, por llojet e detyrave përsëriten.

## Çfarë përsëritet më së shumti

### Prioriteti A - duhet patjetër

1. **Analiza e kodit:** cikle të futura, cikle të njëpasnjëshme, `foreach`, numërimi i instruksioneve dhe termi dominues.
2. **BST:** inorder/preorder/postorder, fshirja me successor, rregulli majtas `< root <` djathtas.
3. **Max-heap/Priority Queue:** ndërtimi i heap-it, `delMax`, insert me `swim`, `sink` dhe indeksimi.
4. **Hashing:** separate chaining, linear/open addressing, funksioni hash dhe çdo tentim pas kolizionit.
5. **Stack/Postfix:** infix në postfix dhe paraqitja e stack-ut gjatë përpunimit.
6. **Flowchart/pseudokod:** kushte me intervale dhe funksione pjesë-pjesë.

### Prioriteti B - del shumë shpesh

- Selection, Insertion, Shell, Merge dhe Quick: stable/in-place, best/worst dhe trace.
- 2-3 tree dhe Red-Black BST: insert, split, root, red links dhe balancimi.
- Lista të lidhura: `next`, `previous`, fshirja e nyjës dhe garbage collection.
- Symbol Table: `put`, `get`, `delete`, `contains`, ordered vs unordered.
- Dallimi stack/queue/priority queue.

### Prioriteti C - pikë të shpejta teorike

- `equals`, `compareTo`, `less`, `exch`.
- Complete tree, perfect balance dhe height.
- Generic, `Comparable`, `Iterable` dhe `Iterator`.
- Horner për stringje, primary clustering dhe Cuckoo hashing.

## Modelet e detyrave të gjata

Nga testet e dhëna dalin këto modele:

1. ndërto flowchart për çmim/kredi me disa intervale;
2. shkruaj algoritëm për funksion pjesë-pjesë;
3. analizo dy cikle të futura dhe shkruaj `T(n)` dhe `Θ(...)`;
4. bëj QuickSort për një varg me duplikate;
5. ndërto 2-3 tree dhe ktheje në Red-Black Tree;
6. gjej traversals në BST dhe fshi një nyjë me dy fëmijë;
7. ndërto max-heap, hiq root-in dhe shto një key të ri;
8. kthe një shprehje infix në postfix dhe trego stack-un;
9. ndërto hash table me separate chaining ose open addressing;
10. simulo Priority Queue dhe rendin e `remove maximum`.

## Si të përgjigjesh kur ka pikë negative

Për Saktë/Pasaktë përdor këtë kontroll:

1. Identifiko fjalët absolute: **gjithmonë**, **vetëm**, **domosdoshmërisht**, **çdo**.
2. Kërko kundërshembull. Nëse ekziston një kundërshembull, pohimi është i pasaktë.
3. Shëno strukturën dhe implementimin. Për shembull, kompleksiteti i Priority Queue ndryshon mes array-t të renditur, array-t të parenditur dhe heap-it.
4. Nëse pyetja thotë vetëm “binary tree”, mos supozo automatikisht BST të balancuar.

Për pyetje me disa alternativa, vlerëso secilën alternativë si pyetje të veçantë S/P. Mos u ndal pasi gjen të parën të saktë.

## Korrigjime të rëndësishme në përmbledhjen e teorisë

Këto formulime duhen mësuar saktë:

- `O(f(n))` është **upper bound**, `Ω(f(n))` është **lower bound**, ndërsa `Θ(f(n))` është **tight bound**. Ato nuk do të thonë vetvetiu worst/best/average case; rasti duhet specifikuar veçmas.
- Një node i paarritshëm mund të pastrohet nga garbage collector. **Loitering** është mbajtja e një reference të panevojshme ndaj një objekti që nuk përdoret më.
- Stack lejon qasje te elementi i **fundit** i futur (LIFO); queue shërben elementin e **parë** të futur (FIFO).
- BST search është `Θ(h)`, ku `h` është lartësia. Është `Θ(log n)` vetëm kur pema është e balancuar ose ka lartësi logaritmike; worst case është `Θ(n)`.
- Standard mergesort është stable dhe kërkon `Θ(n)` hapësirë ndihmëse; nuk është in-place në variantin standard.
- Insertion sort në array tashmë të renditur bën rreth `n-1` krahasime dhe ka `Θ(n)` kohë, jo zero punë.
- Në max-heap 1-based: prindi `⌊k/2⌋`, fëmijët `2k` dhe `2k+1`. Në 0-based: prindi `⌊(k-1)/2⌋`, fëmijët `2k+1` dhe `2k+2`.
- Në heap, `insert` dhe `delMax` janë `O(log n)`. Në **ordered array**, insert është `O(n)` dhe `delMax` mund të jetë `O(1)`; në **unordered array** është e kundërta.
- Hash table nuk ruan rend natyral të keys. Për `min/max/floor/range` preferohet një ordered symbol table, p.sh. Red-Black BST.
- Për double hashing formula standarde është `(h1(x) + i * h2(x)) mod M`, jo `(h1+i+h2) mod M`.
- Termat “open hashing/closed hashing” ndryshojnë mes librave. Në përgjigje shkruaj mekanizmin: **separate chaining** ose **open addressing/probing**.

## Shembull i plotë: BST nga testi

Pema ka root `7`; në të majtë është subtree me `5,3,1,4,6`, ndërsa në të djathtë subtree me `12,9,8,10,15,13,17`.

- Inorder: `1,3,4,5,6,7,8,9,10,12,13,15,17`
- Preorder: `7,5,3,1,4,6,12,9,8,10,15,13,17`
- Postorder: `1,4,3,6,5,8,10,9,13,17,15,12,7`
- Për të fshirë `12` me Hibbard delete, successor është `13`, sepse është minimumi i subtree të djathtë të `12`.

Kontrolli: inorder pas fshirjes duhet të mbetet i renditur dhe të mos përmbajë `12`.

## Shembull i plotë: max-heap nga testi

Inputi: `15,27,24,9,8,72,49,82,19,6`.

Me bottom-up heap construction:

1. Max-heap: `[82,27,72,19,8,24,49,9,15,6]`
2. Pas `delMax`: `[72,27,49,19,8,24,6,9,15]`
3. Pas insertimit të `41`: `[72,41,49,19,27,24,6,9,15,8]`

Shënim: një heap tjetër mund të jetë gjithashtu valid nëse është ndërtuar me insertime një nga një. Në provim trego metodën dhe çdo `sink/swim`.

## Shembull i plotë: postfix nga testi

Shprehja:

```text
Y = (A-B) + C*(G+H) + D
```

Postfix i anës së djathtë:

```text
A B - C G H + * + D +
```

Arsyetimi: `(A-B)` jep `A B -`; `(G+H)` jep `G H +`; shumëzimi jep `C G H + *`; pastaj bëhen dy mbledhjet.

## Shembull i plotë: separate chaining nga testi

Për `h(x)=(2x+1) mod 5` dhe keys `3,5,7,10,11,12,2,13`:

| Bucket | Keys sipas rendit të inputit |
|---:|---|
| 0 | `7 -> 12 -> 2` |
| 1 | `5 -> 10` |
| 2 | `3 -> 13` |
| 3 | `11` |
| 4 | bosh |

Nëse implementimi shton çdo key në fillim të listës, rendi brenda secilit bucket del i kundërt; bucket-at mbeten të njëjtë.

## Checklist para provimit

- [ ] E bëj analizën e dy cikleve të futura pa ngatërruar `T(n)` me `Θ`.
- [ ] I jap tri traversals të një BST pa gabim.
- [ ] E fshij një node me dy fëmijë duke gjetur successor-in.
- [ ] Ndërtoj heap, bëj `delMax` dhe insert me çdo swap.
- [ ] E kthej një shprehje me kllapa në postfix.
- [ ] Ndërtoj chaining/probing duke shkruar çdo hash dhe collision.
- [ ] E dalloj stable nga in-place për çdo sortim.
- [ ] E ndërtoj një flowchart me intervale pa lënë rast jashtë.
- [ ] E zgjidh një funksion pjesë-pjesë me pseudokod.
- [ ] Në test me alternativa, kontrolloj çdo opsion veçmas.

## Burimet e reja

Shiko [folderin e testeve dhe përmbledhjes](burime-shtese/README.md). Për ushtrim pa përgjigje të dukshme, vazhdo me [Provimin realist](17-PROVIM-REALIST-NGA-TESTET.md).
