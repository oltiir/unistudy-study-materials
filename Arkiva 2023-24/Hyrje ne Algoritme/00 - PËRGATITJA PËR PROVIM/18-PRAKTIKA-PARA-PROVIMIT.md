# Praktika e fundit: prej zeros deri te detyrat e provimit

Ky është një set **ushtrimesh të ndërtuara për praktikë sipas llojeve të detyrave në materialet e kursit dhe testet e mëparshme**. Për detyrat origjinale hap [indeksin e 31 burimeve](19-INDEKSI-I-PDF-VE-DHE-VIDEOVE.md). Mos e merr një rezultat të shembullit si “zgjidhje të një PDF-je” nëse inputi nuk është identik: metodat dhe inputet mund të ndryshojnë.

**Rutina për çdo detyrë:** lexo shembullin, mbyll zgjidhjen, provo detyrën tënde me laps, pastaj hap kontrollin. Shëno edhe *pse* bëhet çdo swap, krahasim ose degë.

## 1. Kushtet dhe ciklet: flowchart

**Shembull:** shuma e katrorëve të numrave tek nga 3 deri 9. Input `n=9`, inicializo `s=0, i=3`. Në romb pyet `i<=n?`: Po → `s=s+i*i` → `i=i+2` → kthehu te rombi; Jo → shfaq `s` dhe ndalo.

| i | s para | i² | s pas |
|---:|---:|---:|---:|
| 3 | 0 | 9 | 9 |
| 5 | 9 | 25 | 34 |
| 7 | 34 | 49 | 83 |
| 9 | 83 | 81 | 164 |

Pas `i=11`, kushti është Jo. Në letër vizato fillimin/fundin si oval, hyrjen/daljen si paralelogram, llogaritjen si drejtkëndësh, kushtin si romb.

**Ti:** shuma e katrorëve të numrave çift nga 2 deri në 8. Shkruaj pseudokod, vizato degën Po/Jo dhe bëj trace. <details><summary>Kontrollo zgjidhjen</summary>`s=0;i=2`; derisa `i<=8`, bëj `s+=i*i;i+=2`. Gjendjet e s: `4,20,56,120`; pas `i=10`, del dhe shfaq `120`.</details>

## 2. Kompleksiteti: numëro, pastaj thjeshto

```java
for (int i=0; i<n; i++)
    for (int j=i; j<n; j++)
        work();
```

Për `i=0` ka `n` punë, për `i=1` ka `n-1`, deri te `i=n-1` ka 1. Pra saktësisht `n+(n-1)+...+1=n(n+1)/2` thirrje. Termi dominues është `n²/2`, ndaj `Θ(n²)`. Për `n=4` numëro `4+3+2+1=10` si kontroll.

**Ti:** ndrysho ciklin e brendshëm në `for(j=0;j<i;j++)`. Sa thirrje ka për `n=5`, dhe cili është rendi? <details><summary>Kontrollo</summary>`0+1+2+3+4=10=n(n-1)/2`; `Θ(n²)`. Ndryshon formula e saktë, ruhet klasa.</details>

## 3. Stack/postfix: rendi i operandëve

`8 3 + 2 * 6 -`: push 8 → [8]; push 3 → [8,3]; `+` → [11]; push 2 → [11,2]; `*` → [22]; push 6 → [22,6]; `-` → [16]. Te `-`, pop i parë është ana e djathtë 6; pop i dytë është ana e majtë 22.

**Ti:** `9 2 3 * + 4 /`. Shëno stack-un pas secilit token; krahaso rezultatin. <details><summary>Kontrollo</summary>`[9]→[9,2]→[9,2,3]→[9,6]→[15]→[15,4]→[3.75]`. Nëse kërkohet pjesëtim i plotë në kod, përcakto tipin e operandëve sipas detyrës.</details>

## 4. Sortimet: shkruaj çdo hap, jo vetëm vargun final

**Selection** në `[9,4,7,2,6]`: në `i=0` minimumi 2 është në indeksin 3 → `[2,4,7,9,6]`; në `i=1` minimumi 4 është në vend → pa ndryshim; në `i=2` minimumi 6 është në indeksin 4 → `[2,4,6,9,7]`; në `i=3` minimumi 7 është në indeksin 4 → `[2,4,6,7,9]`. Për secilin `i`, skano suffix-in para se të ndërroni.

**Shellsort** me `h=4` dhe pastaj `h=1` në `[8,5,3,7,6,2]`: faza `h=4` jep `[6,2,3,7,8,5]` (ndërrimet 8↔6, 5↔2). Në fazën `h=1`: `[2,6,3,7,8,5]` → `[2,3,6,7,8,5]` → `[2,3,6,7,5,8]` → `[2,3,6,5,7,8]` → `[2,3,5,6,7,8]`. Në `i=3,4` nuk ka swap.

**Merge** `[2,5,8]` me `[1,3,9]`: krahaso kokat: merr 1 nga djathtas; 2 majtas; 3 djathtas; 5 majtas; 8 majtas; 9 djathtas. Vargu i daljes rritet `[1]`, `[1,2]`, `[1,2,3]`, `[1,2,3,5]`, `[1,2,3,5,8]`, `[1,2,3,5,8,9]`.

**Quicksort 2-way, vetëm partition-i i parë:** `[6,3,7,2,8,5,4]`, pivot `6`. `i` ndalet te 7 (indeksi 2), `j` te 4 (indeksi 6): swap → `[6,3,4,2,8,5,7]`. `i` te 8 (indeksi 4), `j` te 5 (indeksi 5): swap → `[6,3,4,2,5,8,7]`. Pastaj pointerët kryqëzohen; swap pivot 6 me `a[4]=5`: `[5,3,4,2,6,8,7]`. Vetëm 6 është sigurt në pozitën finale.

**Ti:** selection në `[5,1,4,2]`: shkruaj vargun pas `i=0,1,2`. <details><summary>Kontrollo</summary>`i=0`: `[1,5,4,2]`; `i=1`: `[1,2,4,5]`; `i=2`: `[1,2,4,5]`.</details>

**Ti:** bashko `[1,6,7]` me `[2,3,9]`; shëno prej cilës anë merret secili element. <details><summary>Kontrollo</summary>Majtas 1; djathtas 2,3; majtas 6,7; djathtas 9. Dalja `[1,2,3,6,7,9]`.</details>

## 5. Max-heap: indeksimi 1-based

Vargu `[2,24,21,17,6,89,64,62,17,5]`. Ndërto max-heap me `sink(k)` për `k=5,4,3,2,1`. Pas hapave me ndryshim: `k=4` → `[2,24,21,62,6,89,64,17,17,5]`; `k=3` → `[2,24,89,62,6,21,64,17,17,5]`; `k=2` → `[2,62,89,24,6,21,64,17,17,5]`; `k=1` → `[89,62,64,24,6,21,2,17,17,5]`. Kur `k=5` nuk ka ndryshim: 6≥5.

`delMax`: ruaj 89; vendos 5 nga fundi në root dhe zvogëlo heap-in → `[5,62,64,24,6,21,2,17,17]`; zgjidh fëmijën më të madh 64 → `[64,62,5,24,6,21,2,17,17]`; tani zgjidh 21 → `[64,62,21,24,6,5,2,17,17]`.

`insert(14)`: shto në indeksin 10 → `[64,62,21,24,6,5,2,17,17,14]`; krahaso me prindin 6 në indeksin 5 dhe bëj swim → `[64,62,21,24,14,5,2,17,17,6]`. Prindi i ri është 62: ndalo.

**Ti:** inserto 10 në heap-in `[9,7,8,3,2,5,6]`. <details><summary>Kontrollo</summary>`[9,7,8,3,2,5,6,10]` → swap me prindin 3 në k=4: `[9,7,8,10,2,5,6,3]` → swap me prindin 7 në k=2: `[9,10,8,7,2,5,6,3]` → swap me root 9: `[10,9,8,7,2,5,6,3]`.</details>

## 6. BST dhe delete: rruga e secilit key

Inserto `11,6,19,4,8,17,43,5,10,31,49`: root 11; majtas 6 me fëmijë 4 dhe 8; 4 ka djathtas 5, 8 ka djathtas 10; djathtas i 11 është 19 me majtas 17, djathtas 43; 43 ka majtas 31 dhe djathtas 49.

- Inorder `L-Rr-D`: `4,5,6,8,10,11,17,19,31,43,49`.
- Preorder `Rr-L-D`: `11,6,4,5,8,10,19,17,43,31,49`.
- Postorder `L-D-Rr`: `5,4,10,8,6,17,31,49,43,19,11`.
- Për `delete(19)`, successor-i është minimumi i nënpemës djathtas: 31. Vendose 31 në vend të 19 dhe hiqe 31 poshtë 43. Inorder pas fshirjes është lista e parë pa 19.

**Ti:** inserto `8,3,10,1,6,14,4,7`; gjej inorder dhe successor-in e 3 për fshirje. <details><summary>Kontrollo</summary>Inorder `1,3,4,6,7,8,10,14`. Nënpema djathtas e 3 fillon te 6 dhe minimumi i saj është 4. Zëvendëso 3 me 4 dhe largo 4 prej fëmijës majtas të 6; inorder i ri `1,4,6,7,8,10,14`.</details>

## 7. 2-3 tree: ndiqe split-in deri në root

Inserto `10,20,30,40,50,60,70`. `10,20` → `[10|20]`. Kur futet 30, `[10|20|30]` ndahet: root `[20]`, gjethet `[10]`, `[30]`. Futi 40 në të djathtë → `[30|40]`; futi 50 → promovo 40, root `[20|40]`, gjethet `[10],[30],[50]`. Futi 60 te gjethja `[50|60]`; futi 70 → promovo 60, krijohet përkohësisht root `[20|40|60]`; ndaje root-in → root `[40]`, fëmijë të brendshëm `[20]` (gjethe `[10],[30]`) dhe `[60]` (gjethe `[50],[70]`). Çdo rrugë në fund ka të njëjtën gjatësi.

**Ti:** `10,15,2,12,5,13`; vizato tree pas secilës futje. <details><summary>Kontrollo</summary>Pas tre të parave root `[10]`, gjethet `[2]`, `[15]`. 12 → djathtas `[12|15]`; 5 → majtas `[2|5]`; 13 krijon `[12|13|15]` → promovo 13: root `[10|13]`, gjethet `[2|5],[12],[15]`.</details>

## 8. Hashing dhe përparësia e kollizionit

Separate chaining, `M=5, h(x)=(x-1) mod 5`, input `6,8,10,11,15,12,2,13`. Për secilin shëno `h`: `0,2,4,0,4,1,1,2`. Bucket 0 mban 6 dhe 11; 1 mban 12 dhe 2; 2 mban 8 dhe 13; 4 mban 10 dhe 15. Nëse nyja shtohet **në krye**, leximi nga koka është përkatësisht `11→6`, `2→12`, `13→8`, `15→10`; nëse shtohet në fund, rendi është ai i inputit.

**Ti:** linear probing, `M=7, h(x)=x mod 7`, fut `10,17,24,4`. Për çdo key shkruaj `i=0,1,...`, indeksin e provuar dhe slotin final. <details><summary>Kontrollo</summary>10→3. 17: 3 zënë, 4→17. 24: 3 zënë, 4 zënë, 5→24. 4: 4 zënë, 5 zënë, 6→4. Tabela aktive 3:10, 4:17, 5:24, 6:4.</details>

## Kontrolli final para nisjes në provim

- [ ] Pa shikuar zgjidhjet, zgjidh [mini-provimin](14-Mini-Provim.md) ose [provimin 100 pikë](17-PROVIM-REALIST-NGA-TESTET.md) me kohëmatës.
- [ ] Ripuno vetëm gabimet; për secilin shëno rregullin që e shkaktoi.
- [ ] Kontrollo inputet/kufijtë dhe variantin e kërkuar në PDF: quicksort 2-way apo 3-way, heap 1-based apo 0-based, chaining fut në krye apo fund.
- [ ] Për një shembull të ri, shpjego *pse* bëhet hapi, jo vetëm cili është rezultati.
- [ ] Fli mjaftueshëm; rezultati 80+ varet nga puna jote dhe nga përmbajtja reale e provimit, nuk mund të garantohet.
