# Detyrat origjinale: zgjidhje e kontrolluar, hap pas hapi

Këtu punojmë me **inputet e skedarëve origjinalë të kursit**. Hape burimin përkatës në secilën temë dhe krahaso diagramin e PDF-së me hapat poshtë. Në dokumente ka edhe shkurtesa në shënim ose gabime shtypi; kur dalin dy variante, tregohet saktë cila gjendje po analizohet.

**Metoda:** mbulo përgjigjen me dorë, provo 5 minuta, pastaj lexo arsyen për secilin hap. Çdo detyrë ka një variant për ty dhe zgjidhje të fshehur.

## 1. Selection Sort: detyra 1 e PDF-së së sortimeve

Burimi: [Elementary Sorts - Detyra të zgjidhura](../Elementary%20Sorts%20-%20Detyra%20t%C3%AB%20zgjidhura%20detyra%20p%C3%ABr%20ushtrime.pdf), detyra 1.

Vargu fillestar: `[14,32,2,59,15,35,29,98]`. Në rreshtin `i`, kërko më të voglin vetëm në pozitat `i..7`, pastaj ndërroje **një herë** me `a[i]`.

| i | Minimumi në suffix / indeksi | Vargu pas ndërrimit | Çka është final |
|---:|---|---|---|
| 0 | 2 / 2 | `[2,32,14,59,15,35,29,98]` | `[2]` |
| 1 | 14 / 2 | `[2,14,32,59,15,35,29,98]` | `[2,14]` |
| 2 | 15 / 4 | `[2,14,15,59,32,35,29,98]` | `[2,14,15]` |
| 3 | 29 / 6 | `[2,14,15,29,32,35,59,98]` | `[2,14,15,29]` |
| 4–7 | minimumi është në vend | pa ndryshim | rritet prefix-i final |

Pse ndërrimi 59↔29 bëhet te `i=3`? Sepse pozitat `0..2` janë tashmë finale; minimumi i pjesës që mbetet është 29, në indeksin 6.

**Ti:** puno detyrën 2 të të njëjtit PDF: `[43,29,12,29,35,76,2,4]`. Shkruaj vargun pas `i=0` dhe `i=1`.

<details><summary>Kontrollo dy hapat e parë</summary>`i=0`: minimumi 2 në indeksin 6 → `[2,29,12,29,35,76,43,4]`. `i=1`: minimumi 4 në indeksin 7 → `[2,4,12,29,35,76,43,29]`. Vazhdon me suffix-in nga indeksi 2.</details>

## 2. Quicksort 2-way: detyra 2 e DOCX-it

Burimi: [Quick Sort - Detyra të zgjidhura](../Quick%20Sort%20-%20Detyra%20t%C3%AB%20zgjidhura%20detyra%20p%C3%ABr%20ushtrime.docx), detyra 2. Dokumenti e jep **vargun pas shuffle** `[6,3,7,2,8,5,4]`; pikërisht ky është inputi për trace-in. Në provim, nëse jepet shuffle, nis nga ai varg.

Pivot `a[0]=6`. `i` skanon derisa gjen `>=6`, `j` nga fundi derisa gjen `<=6`.

| Hapi | i/j ku ndalen | Veprimi | Vargu |
|---:|---|---|---|
| 1 | `i=2` (7), `j=6` (4) | 7↔4 | `[6,3,4,2,8,5,7]` |
| 2 | `i=4` (8), `j=5` (5) | 8↔5 | `[6,3,4,2,5,8,7]` |
| 3 | `i=5`, `j=4` | u kryqëzuan; pivot 6↔5 | `[5,3,4,2,6,8,7]` |

Pivoti `6` është final në indeksin 4; pjesët `[5,3,4,2]` dhe `[8,7]` duhen sortuar veçmas. Kontrolli: çdo element majtas është `<=6` dhe djathtas `>=6`.

**Ti:** në dokument gjendet edhe inputi pas shuffle `[5,3,1,7,4,2,6]`. Bëje vetëm partition-in e parë. <details><summary>Kontrollo</summary>`i` ndalet te 7, `j` te 2 → `[5,3,1,2,4,7,6]`; pointerët kryqëzohen, ndërro pivot 5 me 4 → `[4,3,1,2,5,7,6]`.</details>

## 3. Quicksort 3-way: detyra 3 e DOCX-it

Nga i njëjti burim, inputi **pas shuffle** `[3,5,2,4,7,3,3,2]`; pivot `v=3`. Nis `lt=0, i=1, gt=7`. Zonat finale bëhen `<3 | =3 | >3`.

| Hapi | a[i] kundrejt 3 | Veprimi | Vargu pas hapit |
|---:|---|---|---|
| 1 | 5>3 | `swap(i,gt)`, `gt--`; **i mbetet 1** | `[3,2,2,4,7,3,3,5]` |
| 2 | 2<3 | `swap(lt,i)`, `lt++`, `i++` | `[2,3,2,4,7,3,3,5]` |
| 3 | 2<3 | njësoj | `[2,2,3,4,7,3,3,5]` |
| 4 | 4>3 | `swap(i,gt)`, `gt--` | `[2,2,3,3,7,3,4,5]` |
| 5 | 3=3 | vetëm `i++` | `[2,2,3,3,7,3,4,5]` |
| 6 | 7>3 | `swap(i,gt)`, `gt--` | `[2,2,3,3,3,7,4,5]` |
| 7 | 3=3 | `i++`; përfundon | `[2,2,3,3,3,7,4,5]` |

`[7,4,5]` në të djathtë **nuk është ende e sortuar**; partition vetëm i ndan zonat. Në rastin `>`, mos e rrit `i`: elementi që vjen nga `gt` nuk është kontrolluar ende.

**Ti:** për `[3,2,3,4,1]` bëj 3-way partition dhe shkruaj `lt,i,gt` pas çdo hapi. <details><summary>Kontrollo vargun final të partition-it</summary>`[2,1,3,3,4]` ose një rend tjetër brenda zonës `<3` që del nga hapat e implementimit; për versionin me `i=lo+1`: `[2,1,3,3,4]`.</details>

## 4. BST: detyra 1 e PDF-së, para dhe pas fshirjes

Burimi: [BST - Detyra të zgjidhura](../BST%20-%20Detyra%20t%C3%AB%20zgjidhura.pdf), detyra 1. Fut në rendin e dhënë `24,22,94,19,62,39,88,32,40,41,27`.

- Root 24. Djathtas 94, majtas i 94 është 62; 62 ka majtas 39 dhe djathtas 88. 39 ka majtas 32 (me majtas 27) e djathtas 40 (me djathtas 41).
- **Para** `delete(62)`: `floor(68)=62`, `ceiling(68)=88`.
- PDF-ja tregon fshirjen duke marrë **predecessor-in 41**, maksimumin e nënpemës majtas të 62; heq 41 nga poshtë 40. Lejohet edhe **successor-i 88**, minimumi djathtas, nëse detyra nuk kërkon një variant të caktuar.
- **Pas** fshirjes së 62 dhe futjes së 90 si fëmijë djathtas i 88: `floor(68)=41`, `ceiling(68)=88`, `get(68)=null`, `get(40)=40`. Këto janë vlerat që shfaq diagrami i fundit i PDF-së.

Kjo është arsyeja pse nuk mund të kopjosh `floor(68)=41` pa specifikuar **pas cilit operacion** po e llogarit.

**Ti:** për këtë varg gjej inorder *para* fshirjes. Pastaj shkruaj inorder pas fshirjes së 62 me predecessor. <details><summary>Kontrollo</summary>Para: `19,22,24,27,32,39,40,41,62,88,94`. Pas: `19,22,24,27,32,39,40,41,88,94`. Në të dy rastet lista është e sortuar; e dyta nuk përmban 62.</details>

## 5. Hash Tables: linear probing, input identik me DOCX-in

Burimi: [Hash Tables - Detyra të zgjidhura](../Hash%20Tables%20-%20Detyra%20t%C3%AB%20zgjidhura.docx), pjesa Linear Probing. `M=13`, `f(x)=2x+3`, inputi `1,8,49,18,24,34,48,5`. Për çdo çelës nis **i=0** dhe përdor `(f(x)+i) mod 13`.

| Çelësi | f(x) | Tentimet | Slot final |
|---:|---:|---|---:|
| 1 | 5 | 5 | 5 |
| 8 | 19 | 6 | 6 |
| 49 | 101 | 10 | 10 |
| 18 | 39 | 0 | 0 |
| 24 | 51 | 12 | 12 |
| 34 | 71 | 6 zënë, 7 | 7 |
| 48 | 99 | 8 | 8 |
| 5 | 13 | 0 zënë, 1 | 1 |

Në DOCX ka disa etiketa të kopjuara gabim në tekst (`h(18)` në rreshtin e 24), por llogaritja e indeksit është si më sipër. Mëso formulën dhe rindërtoje rezultatin vetë.

**Ti:** nga seksioni Double Hashing i të njëjtit dokument: `M=13`, `f(x)=3x+3`. Pas futjes së `18` në slotin 5, ku shkon `5`? <details><summary>Kontrollo</summary>`f(5)=18`, `h1=18 mod 13=5` (zënë), `h2=13-5=8`. Me `i=1`: `(5+1·8) mod 13=0`; pra 5 futet në slotin 0.</details>

## 6. Flowchart me produkt: detyra 2 e PDF-së

Burimi: [Flowcharts - Detyra të zgjidhura](../Flowcharts%20-%20Detyra%20t%C3%AB%20zgjidhura%20detyra%20p%C3%ABr%20ushtrime.pdf), detyra 2. Formula në figurë është `g = 3x + 4 · ∏(i + 2/x)` për **i çift nga 2 deri në m+1**. Vizato: Fillim → lexo `m,x` → `p=1,i=2` → kontrollo `i<=m+1?` → nëse po, vetëm për `i` çift bëj `p=p*(i+2/x)` → `i++` → kthehu te kushti → `g=3x+4p` → shfaq `g` → Fund. Kërkohet `x≠0`.

**Shembull:** `m=4,x=2`: `i` merr 2,3,4,5; vetëm 2 dhe 4 shumëzohen: `p=(2+1)(4+1)=3·5=15`, prandaj `g=3·2+4·15=66`. Kontrollo kufirin dhe paritetin si vendime të ndara. Figura në PDF e ka kontrollin e kufirit pas trupit të ciklit; për rastet me `m+1<2`, kontrolloje **para** hyrjes që të mos shumëzosh një term të tepërt.

**Ti:** `m=5,x=1`. Shëno `i` që shumëzohen, `p` pas secilit, dhe `g`. <details><summary>Kontrollo</summary>`i=2,4,6`. Faktorët `4,6,8`; `p`: `4 → 24 → 192`. `g=3+4·192=771`.</details>

## 7. Kompleksiteti: kur kodi e ka `n=4` fiks

Burimi: [Analiza e algoritmeve - Detyra të zgjidhura/detyra për ushtrime](../Analiza%20e%20algoritmeve%20-%20Detyra%20t%C3%AB%20zgjidhura%20detyra%20p%C3%ABr%20ushtrime.pdf), detyra 3. Kodi ka **`int n = 4`**, një cikël me `n` përsëritje dhe dy cikle të futura `n·n`. Për këtë ekzekutim: `4+4·4=20` iterime të trupit të cikleve (pa llogaritur `println` jashtë tyre). Nëse e përgjithëson programin për madhësi të ndryshueshme `n`, `T(n)=n+n²=Θ(n²)`. Me `n=4` fiks, në raport me një input që nuk ndryshon, puna është konstante. Në provim shkruaj supozimin tënd.

**Ti:** nëse `n` bëhet 7, sa iterime kanë gjithsej trupat e cikleve? <details><summary>Kontrollo</summary>`7+7²=56`. Për n të ndryshueshme rendi është `Θ(n²)`.</details>

## 8. One-Stack: ruaj kllapat në postfix

Burimi: [Stacks and Queues - Detyra të zgjidhura](../Stacks%20and%20Queues%20-%20Detyra%20t%C3%AB%20zgjidhura%20detyra%20p%C3%ABr%20ushtrime.pdf), detyra 1: `((8+3)*2-6)+(12/2)-4`.

Postfix që e ruan drejtpërdrejt grupimin: `8 3 + 2 * 6 - 12 2 / + 4 -`. Stack: `8+3=11` → `11·2=22` → `22-6=16` → `12/2=6` → `16+6=22` → `22-4=18`. Në PDF operatorët janë shtypur pa hapësira dhe mbledhja/zbritja janë rigrupuar; për këtë shembull numerik dalin po 18. Në zgjidhjen tënde shkruaj tokenët me hapësira dhe ndiq kllapat.

**Ti:** detyra 2 në PDF: `7+(25*2)-((8*2)+3)`. Gjej postfix dhe vlerën. <details><summary>Kontrollo</summary>`7 25 2 * + 8 2 * 3 + -`. Vlera: `7+50-(16+3)=38`.</details>

## Kontrolli para se të kalosh te provimi simulues

- [ ] E sqaroj gjendjen para/pas operacionit në BST dhe heap.
- [ ] Në Selection dhe Quick tregoj çdo ndërrim, pivotin, kufijtë dhe arsyen.
- [ ] Në 3-way Quick nuk e rris `i` pas ndërrimit me `gt`.
- [ ] Në hash shkruaj formulën e dokumentit, tentimet `i=0,1,...` dhe modulo-n.
- [ ] Te flowchart kontrolloj inicializimin, kushtin, degën e ciklit dhe kufijtë.
- [ ] I shikoj demonstrimet e Princeton-it në [temat përkatëse](19-INDEKSI-I-PDF-VE-DHE-VIDEOVE.md), pastaj e bëj trace-in pa video.

Për ushtrime të tjera me inpute të ndryshme përdor [Praktikën para provimit](18-PRAKTIKA-PARA-PROVIMIT.md) dhe [Provimin 100 pikë](17-PROVIM-REALIST-NGA-TESTET.md).
