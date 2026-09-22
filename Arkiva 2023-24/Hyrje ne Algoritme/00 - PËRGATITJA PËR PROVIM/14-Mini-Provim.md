# Mini‑Provim - Hyrje në Algoritme

Provoje pa materiale për 90 minuta. Pastaj hap seksionin e përgjigjeve.

## Pjesa A - Teori (20 pikë)

1. Shpjego dallimin mes `O`, `Theta` dhe `Omega`. (3)
2. Pse insertion sort është stable, ndërsa selection sort jo? (3)
3. Shpjego dallimin mes stack, queue dhe priority queue. (3)
4. Cilat janë tri invariantet kryesore të left-leaning red-black BST? (4)
5. Pse hash table expected është `O(1)`, por worst case `O(N)`? (3)
6. Kur duhet përdorur `ST<Key,SET<Value>>`? Jep shembull. (4)

## Pjesa B - Kompleksitet (15 pikë)

Gjej kompleksitetin dhe arsyeto:

```java
for (int i=1; i<n; i*=2)
    for (int j=0; j<n; j++)
        work();
```

```java
for (int i=0; i<n; i++)
    for (int j=i+1; j<n; j++)
        work();
```

```java
for (int i=0; i<n; i++) work();
for (int j=0; j<n; j++)
    for (int k=0; k<n; k++) work();
```

## Pjesa C - Stack dhe Queue (15 pikë)

1. Kthe në postfix: `(A*B)/(C-D*E)+F`. (5)
2. Vlerëso me Dijkstra two-stack: `((2+(4*5))-((8*2)/4))`. (5)
3. Jep gjendjen finale dhe elementet e dala për queue size 3: `enq(I), enq(N), deq, enq(P), enq(U), deq, deq, enq(T), deq`. (5)

## Pjesa D - Sortim (20 pikë)

1. Bëj selection sort për `7,2,5,1,4`; shkruaj array pas çdo iterimi të jashtëm. (5)
2. Bëj vetëm merge final të `[2,5,8]` dhe `[1,3,9]`. (4)
3. Bëj një partition 2-way me pivot të parë për `5,3,1,7,4,2,6`. (5)
4. Jep best/average/worst, stable dhe in-place për Merge, Quick dhe Heap. (6)

## Pjesa E - Trees dhe Hashing (30 pikë)

1. Ndërto BST nga `8,3,10,1,6,14,4,7,13`; jep inorder/preorder/postorder, floor(5), ceiling(5), pastaj fshi 3 me successor. (10)
2. Shpjego veprimin që duhet për secilin rast RB: red-right; red-left-left; dy fëmijë red. (6)
3. Linear probing me `M=11`, `f(x)=2x+1`, keys `5,16,3,14,25`. Jep çdo tentim. (6)
4. Double hashing me `M=13`, `f(x)=3x+3`, keys `2,10,3,6,18,13,11,5`. Jep tabelën finale. (8)

---

<details>
<summary><strong>Përgjigjet e shkurtra</strong></summary>

## A

1. `O` upper bound, `Omega` lower bound, `Theta` tight bound.
2. Insertion nuk i kalon elementet e barabarta kur përdor `<`; selection bën swap të largët dhe mund t'ua ndryshojë rendin.
3. LIFO; FIFO; largon key me prioritet maksimal/minimal.
4. Red links anojnë majtas; pa dy red radhazi; black balance i njëjtë; root black pas operacionit.
5. Shpërndarja uniforme jep zinxhir/probe konstant; collision ekstrem i vendos keys në një cluster/chain.
6. Kur një key ka shumë values, p.sh. fjalë -> set skedarësh.

## B

1. `O(N log N)`.
2. `N(N-1)/2 = O(N²)`.
3. `O(N+N²)=O(N²)`.

## C

1. `A B * C D E * - / F +`.
2. `2+20-4 = 18`.
3. Dalin `I,N,P,U`; queue finale është `[T]`. Pas `enq(U)` queue është `[N,P,U]`.

## D

1. `[1,2,5,7,4]`, `[1,2,5,7,4]`, `[1,2,4,7,5]`, `[1,2,4,5,7]`, final njësoj.
2. `[1,2,3,5,8,9]`.
3. Pas partition: `[4,3,1,2,5,7,6]`, pivot 5 në indeksin final të tij për këtë segment.
4. Merge: `NlogN/NlogN/NlogN`, stable, jo in-place. Quick: `NlogN/NlogN/N²`, jo stable, in-place. Heap: `NlogN/NlogN/NlogN`, jo stable, in-place.

## E

1. Inorder: `1,3,4,6,7,8,10,13,14`; preorder: `8,3,1,6,4,7,10,14,13`; postorder: `1,4,7,6,3,13,14,10,8`; floor 5 = 4; ceiling 5 = 6. Për fshirjen e 3, successor është 4.
2. rotateLeft; rotateRight; flipColors.
3. `5->0`, `16->0 collision->1`, `3->7`, `14->7 collision->8`, `25->7 collision->8 collision->9`.
4. Përdor `h1=f mod 13`, `h2=13-h1`, duke rritur `i` vetëm në collision. Rezultati: `5` përfundon në 0 pas collision me 18 në slot 5; keys e tjera në slotet e tyre fillestare: 13->3, 18->5, 10->7, 6->8, 2->9, 11->10, 3->12.

</details>
