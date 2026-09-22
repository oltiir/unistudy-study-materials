# 10 - 2-3 Trees dhe Red-Black BST

## Burimet e mbuluara

- `33BalancedSearchTrees.pdf`
- `Red-black BST & 2-3 Tree - Detyra të zgjidhura.docx`

Shënim për mbulimin: faqja hyrëse e ligjëratës e përmend edhe B-tree, por skedari i kursit nuk përmban seksion të zhvilluar për B-tree. Materiali real i kësaj teme është 2-3 tree dhe left-leaning red-black BST.

## Pse duhet balancimi

BST i zakonshëm mund të bëhet linear. Qëllimi është garantimi i `O(log N)` për search, insert dhe delete duke kontrolluar lartësinë.

## 2-3 tree

- 2-node: 1 key, 2 fëmijë.
- 3-node: 2 keys të sortuar, 3 fëmijë: më të vegjël, ndërmjet, më të mëdhenj.
- Të gjitha rrugët nga root te null links kanë gjatësi të njëjtë: perfect balance.

Lartësia është mes `log3 N` dhe `log2 N`; operacionet janë `O(log N)`.

## Insert në 2-3 tree

Insertimi bëhet në nivelin e fundit.

- Në 2-node: shto key dhe krijo 3-node.
- Në 3-node: krijo përkohësisht 4-node me 3 keys; çoje key e mesëm te prindi dhe ndaj dy keys skajorë.
- Nëse split përhapet te root, krijo root të ri. Vetëm kështu rritet lartësia.

Invariantet: symmetric order dhe të gjitha gjethet në të njëjtin nivel.

## Lidhja me red-black BST

Një 3-node paraqitet si dy nodes të lidhura me një link të kuq që anon majtas. Links të zeza lidhin 2/3-nodes e ndryshme.

Rregullat e left-leaning red-black BST:

1. Asnjë link i kuq nuk anon djathtas.
2. Nuk ka dy links të kuqe radhazi në një rrugë.
3. Çdo rrugë root-null ka të njëjtin numër links të zeza.
4. Root përfundimtar është i zi.

Search është identik me BST; ngjyra injorohet.

## Operacionet lokale

### rotateLeft

Përdoret kur right link është e kuqe dhe left jo. Node djathtas ngrihet; root-i i vjetër bëhet fëmijë majtas. Ngjyra e re trashëgon ngjyrën e root-it të vjetër; root-i i vjetër bëhet i kuq.

### rotateRight

Përdoret kur ka dy links të kuqe majtas radhazi. Node majtas ngrihet, root-i i vjetër kalon djathtas; ngjyrat përshtaten simetrikisht.

### flipColors

Kur të dy fëmijët janë të kuq, ata bëhen të zinj dhe prindi bëhet i kuq. Kjo përfaqëson split të 4-node dhe shtyn key e mesëm lart.

## Rendi standard pas insertimit

Pas insertit rekursiv si node e kuqe:

```java
if (isRed(h.right) && !isRed(h.left)) h=rotateLeft(h);
if (isRed(h.left) && isRed(h.left.left)) h=rotateRight(h);
if (isRed(h.left) && isRed(h.right)) flipColors(h);
```

Në fund `root.color=BLACK`.

Rendi i këtyre kontrolleve është pjesë e algoritmit; mos i aplikoni sipas intuitës pa verifikuar kushtet.

## Konvertimi RB -> 2-3

Për çdo link të kuq majtas, bashko child-in dhe parent-in në një 3-node me dy keys. Links të zeza mbeten lidhje vertikale mes nodes të 2-3 tree.

## Shembuj të zgjidhur hap pas hapi

### Insert në 2-3 tree

Inserto `10,20,30,15,25`:

1. `10` krijon 2-node `[10]`.
2. `20` futet në të njëjtën gjethe -> 3-node `[10|20]`.
3. `30` krijon përkohësisht `[10|20|30]`; ndahet dhe key e mesëm `20` ngrihet si root, me fëmijët `[10]` dhe `[30]`.
4. `15<20`, futet në gjethen majtas -> `[10|15]`.
5. `25>20`, futet në gjethen djathtas -> `[25|30]`.

Tree finale ka root `[20]` dhe dy 3-nodes `[10|15]`, `[25|30]`. Të gjitha gjethet janë në të njëjtin nivel.

#### Detyrë për ty

Ndërto 2-3 tree për `10,15,2,12,5,13`. Pas çdo key shkruaj node ku hyn, 4-node e përkohshme nëse krijohet, key që ngrihet dhe tree pas split-it.

### I njëjti balancim në LLRB

Inserto `10,20,30`:

1. `10` insertohet i kuq, pastaj root ngjyroset i zi.
2. `20` vjen si link i kuq djathtas i `10`; `rotateLeft(10)` e bën `20` root të zi dhe `10` fëmijë të kuq majtas. Kjo përfaqëson 3-node `[10|20]`.
3. `30` futet i kuq djathtas i `20`. Tani të dy fëmijët `10` dhe `30` janë të kuq, prandaj `flipColors`: ata bëhen të zinj, `20` bëhet përkohësisht i kuq dhe në fund root ngjyroset i zi.

Rezultati përfaqëson 2-3 tree me root `[20]` dhe fëmijët `[10]`, `[30]`.

#### Detyrë për ty

Ndërto LLRB për `15,41,32,10`. Pas çdo inserti provo kontrollet në rend: red-right, red-left-left, dy fëmijë të kuq. Shëno çdo `rotateLeft`, `rotateRight`, `flipColors`, pastaj ktheje tree finale në 2-3 tree.

## Performanca

- Lartësia worst case `<= 2 log2 N`.
- Search/insert/delete `O(log N)`.
- Ordered operations ruhen.
- Typical height afër `log N`.

## Trace në provim

Për çdo key:

1. Inserto si në BST me link të kuq.
2. Kontrollo red-right -> rotateLeft.
3. Kontrollo red-left-left -> rotateRight.
4. Kontrollo dy fëmijë të kuq -> flipColors.
5. Ngjyrose root të zi.
6. Vizato tree pas çdo key, jo vetëm në fund.

## Gabimet tipike

- Ngjyros node-in, jo linkun nga prindi (implementimi ruan ngjyrën e parent link).
- Lejon link të kuq djathtas.
- Bën color flip para rotacionit të nevojshëm dhe humb invariantin.
- Harron root të zi.
- Në 2-3 tree lë gjethe në nivele të ndryshme.

## Kontrolli i njohurive

1. Çfarë përfaqëson një link i kuq?
2. Kur bëhet rotateLeft dhe rotateRight?
3. Çka përfaqëson flipColors në 2-3 tree?
4. Pse lartësia kufizohet me `2 log N`?

## Ushtrime

- Ndërto RB tree për `15,41,32,10,19,22,67,30,12,48`, pastaj ktheje në 2-3 tree.
- Ndërto 2-3 tree për `10,15,2,12,5,13,20,11,17`.
- Pas çdo inserti shkruaj cilin operacion përdore dhe pse.
