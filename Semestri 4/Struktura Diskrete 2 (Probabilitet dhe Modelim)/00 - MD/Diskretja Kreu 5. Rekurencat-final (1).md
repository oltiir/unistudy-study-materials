Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Kreu
FUNKSIONET GJENERUESE DHE EKUACIONET REKURENTE
Funksionet gjeneruese janë një metodë shumë e dobishme, për t’u marrë me shumë
probleme, shpesh të një natyre kombinatorike, por jo vetëm të tilla. Ideja është që një grupi të
pafundëm apo të fundëm numrash t’u caktohet një funksion i vetëm, të ashtuquajturin funksion
gjenerues. Në këtë mënyrë, pafundësisht shumë vargje zëvendësohen me një objekt të vetëm.
5.1. Funksionet gjeneruese të vargut të fundëm
Që t’i përafrohemi kuptimit të funksionit gjenerues, dhe mbi të gjitha marrëdhënieve me
problemet e kombinatorikës, le të shqyrtojmë disa shembujt të thjeshtë:
Shembull 5.1.1. Le të jenë a dhe b dy elemente, që mund të mblidhen, të shumëzohen me
numër real dhe të shumëzohen midis veti (elemente të tilla janë, për shembull, dy numra realë, dy
numra kompleksë, dy polinomë…). Do të shqyrtojmë të gjitha kombinacionet e mundshme pa
përsëritje, të këtyre dy elementeve.
Natyrisht, kombinacione të klasës së parë nga dy elemente është dy, dhe kombinacioni i klasës së
dytë nga dy elemente është një.
Le të shqyrtojmë tani funksionin f ( x ) = (1 + a x ) (1 + b x ) ku mbledhësi një do të thotë:
elementi a nuk merr pjesë në kombinacion, ndërsa mbledhësi ax don të thotë elementi a merr pjesë
në kombinacion. E njëjta gjë vlen edhe për elementin b.
Kur kllapat shumëzohen, marrim:
f ( x ) = (1 + a x ) (1 + b x ) = 1 + ( a + b ) x + a b x 2
5
Koeficienti pranë x është në fakt shuma e të gjitha kombinacioneve të klasës së parë nga dy
elementet, ndërsa koeficienti pranë x2 është kombinacioni i vetëm i klasës së dytë nga dy elementet.
Shembull 5.1.2. Shqyrtojmë tani tri elemente a, b dhe c me kushtet si në shembullin e
mësipërm. Tani kërkojmë kombinacionet pa përsëritje të klasës së parë, dytë dhe të tretë nga këto
elemente. Konsiderojmë funksionin:

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
|     | f ( x ) = (1 | + a x ) (1 + b | x ) (1 + c x ) | = 1 + ( a | + b + c ) x | + ( a b + b | c + a c ) x 2 + ( a b c ) x 3 .  |
| --- | ------------ | -------------- | -------------- | --------- | ----------- | ----------- | -------------------------------- |
Koeficienti pranë x paraqet shumën e kombinacioneve të klasës së parë nga tre elementet,
koeficienti pranë x2 paraqet shumën e kombinacioneve të klasës së dytë nga tre elementet  dhe
koeficienti pranë x3 paraqet kombinacionin e vetëm të klasës së tretë nga tre elementet.
Nëse jemi të interesuar vetëm për numrin e kombinacioneve, por jo kombinacionet në
vetvete,  mjafton që të njehsojmë numrin e mbledhësve pranë çdo shkalle të x. Në këtë rast
vendosim a=b=c=1  dhe funksioni bëhet  f ( x ) = (1 + x ) 3 , është një funksion,  në zhvillimi e të cilit
koeficientët pranë fuqive të x, japin numrin e kombinacioneve të klasës një, dy, dhe tre nga një
grup prej tre elementesh përkatësisht.
Përkufizim 5. 1.1. Le të jetë dhënë vargu me numër të fundëm kufizash  a , a , a ,...,a  .
0 1 2 n
Funksioni
n
                              x2 xn =a xk                    (1)
|     |     | f(x)=a | +a  | x+a | +...+a |     |     |
| --- | --- | ------ | --- | --- | ------ | --- | --- |
|     |     |        | 0   | 1 2 |        | n   | k   |
k=0
| quhet funksion gjenerues i vargut të fundëm a |     |     |     | ,a  | ,...,a .   |     |     |
| --------------------------------------------- | --- | --- | --- | --- | ---------- | --- | --- |
0 1 n
| Shembull 5.1.3. Funksioni gjenerues i vargut    |     |     |     |     | 1   | ,1 ,1n ,...,1 , |     |
| ----------------------------------------------- | --- | --- | --- | --- | --- | ---------------- | --- |
k  
|     |     |     |     |     |     | − jesh a   |     |
| --- | --- | --- | --- | --- | --- | ---------- | --- |
1−xk
| është  f(x)=1+x+x2 | +...+xk−1 |     |     |     |     |     |     |
| ------------------ | --------- | --- | --- | --- | --- | --- | --- |
=
1−x
|                                               |     |     |             |             |  n      |   n   n |   n    |
| --------------------------------------------- | --- | --- | ----------- | ----------- | ----------- | ----------------------- | ---------------- |
| Shembull 5.1.4. Funksioni gjenerues i vargut  |     |     |             |             |             |                         | është            |
|                                               |     |     |             |             |             | , ,                     | ,..., ,        |
|                                               |     |     |             |             | 0           | 1 2                     | n                |
|                                               |     |     |  n  |  n  |  n  |  n              |                  |
|                                               |     | f ( | x ) = +     | x +         | x 2 +       | ... + x                 | n = (1 + x ) n   |
|                                               |     |     | 0           | 1           | 2           | n                       |                  |
Shembull 5.1.5. Në sa mënyra mundemi të paguajmë llogaritë prej një, dy dhe tri eurosh?
Nëse në dispozicion kemi emitime të veçanta prej një eurosh, që janë një monedhë ari, një monedhë
argjendi dhe një monedhë bronzi.
Zgjidhje. Këtë radhë nuk do të përdorim formulën e kominacioneve, por do të shkojmë
nëpërmjet prodhimit
2 3
|     |     | f ( x ) | = (1 + x ) (1 | + x ) (1 | + x ) = 1 + | 3 x + 3 x | + x |
| --- | --- | ------- | ------------- | -------- | ----------- | --------- | --- |
që  paraqet  funksionin  gjenerues  të  vargut  1,3,3,1  dhe  që  japin  përgjigje  të  pyetjeve  tona.
Koeficienti pranë x  që është 3 na përgjigjet në pyetjen se, në sa mënyra paguhet llogaria prej një
euro,  koeficienti pranë x2  që është poashtu  3 na përgjigjet në pyetjen se, në sa mënyra paguhet

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
llogariaprej dy eurosh dhe koeficienti pranë x3  që është 1 na përgjigjet në pyetjen se në sa mënyra
paguhet llogaria prej tri eurosh.
Shembull 5.1.6. Në sa mënyra mundemi të paguajmë llogaritë prej 5 eurosh? Nëse në
dispozicion kemi 3 monedha prej 1 euro,  1 prej prej 2 eurosh dhe 2 kartëmonedha prej 5 eurosh,
të cilat janë emetime të ndryshme.
Zgjidhje. Në këtë rast shqyrtojmë funksionin:
| f(x)=(1+x+x2 | +x3)(1+x)(1+x+x2)=1+3x+5x2 |     | +6x3 +5x4 | +3x5 +x6  |
| ------------ | -------------------------- | --- | --------- | --------- |
Përgjigjen e kërkojmë te koeficienti pranë x5 që është 3, pra në 3 mënyra mund ta paguajmë
llogarinë prej 5 euro.  Funksioni f(x) është funksion gjenerues i vargut 1,3,5,6,5,3,1. Dhe këtu
gjejmë përgjigjet edhe të pyetjeve: Në sa mënyra mundemi të paguajmë llogaritë prej 1,2,3,4,5,6
eurosh? Përgjigjet janë përkatësisht: 3,5,6,5,3,1. Por, shtrohet pyetja se çfarë është 1 i parë në
vargun 1,3,5,6,5,3,1. Meqë 1=x0  dhe kjo jep mundësinë që monedha të mos zgjidhet.

5.2. Funksionet gjeneruese të vargut të pafundëm
Përkufizim 5. 2.1. Le të jetë dhënë vargu i pafundëm
|     | a , a | , a ,...,a ,.... |     |     |
| --- | ----- | ---------------- | --- | --- |
                                       0 1 2 n                                            (2)
Funksion gjenerues të vargut (2) quajmë serinë:

|     | a + a x | + a x 2 + ... = | k a x k |     |
| --- | ------- | --------------- | -------- | --- |
|     | 0 1     | 2               | k        |     |
                                    = 0                               (3)

Shembull 5.2.1. Funksioni gjenerues i vargut  1 ,1 ,1 , . . .  , ku  0  x  1 . Është
|        |                    |     | 1         |       |
| ------ | ------------------ | ---- | --------- | ----- |
| 1+x+x2 | +x3 +...+xk−1+...= |  xk | ,   ku 0 | x1.  |
=
1−x
k=0
Shembull 5.2.2. Funksioni gjenerues i vargut 1,0,1,0,... . Është
| f(x)=1+0x+x2 | +0x3 | +...+0x2k−1+x2k |     |     |
| ------------- | ----- | ---------------- | --- | --- |
+...=
 ,  ku 0 x1.
|       |              |      | 1   |     |
| ----- | ------------ | ----- | --- | --- |
| =1+x2 | +x4 +...+x2k |  x2k |     |     |
+....= =
1−x2
|             |     | k=0 |     |     |
| ----------- | --- | --- | --- | --- |

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Shembull  5.2.3.Është  i  njohur  se  seria  e  Maclaurinit  për  funksionin  e x   është
|     | x x 2 | x 3 x | 4 x 5 |     |     |     |     |     |     |     |     | 1 1 1 1 |     |
| --- | ----- | ----- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | ------- | --- |
1 + + + + + + ... .      Rrjedhimisht, funksioni  gjenerues i   vargut  1 ,1 ! , , , , ,...  është
|     | 1 ! 2 ! | 3 ! | 4 ! 5 ! |     |     |     |     |     |     |     |     | 2 ! 3 ! 4 ! 5 ! |     |
| --- | ------- | --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- | --------------- | --- |
|     |         |     |         |     |     |     |     |     |     |     | x 3 | x 5 x 7 x 9 x   | 1 1 |
x . Gjithashtu, seria e Maclaurinit për funksionin  s in x  është  .
| f ( | x ) = e |     |     |     |     |     |     |     |       | x   | − + | − + −         | + ... |
| --- | ------- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | ------------- | ----- |
|     |         |     |     |     |     |     |     |     |       |     | 3 ! | 5 ! 7 ! 9 ! 1 | 1 !   |
|     |         |     |     |     |     |     |     | − 1 | 1 − 1 | 1   |     |               |       |
Rrjedhimisht,  funksioni    gjenerues  i      vargut  0 , , , , , ,... është  f(x)=sinx  dhe  seria  e
|     |     |     |     |     |     |     |     | 3 !   | 5 ! 7 ! | 9 !   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ----- | ------- | ----- | --- | --- | --- |
|     |     |     |     |     |     |     | x 2 | x 4 x | 6 x 8   | x 1 0 |     |     |     |
Maclaurinit  për  funksionin  c o s x   është  1 − + − + − + ... .  Rrjedhimisht,  funksioni
|                                             |     |     |     |             |             |     | 2 !            | 4 ! 6           | ! 8 !   | 1 0 !  |     |     |     |
| ------------------------------------------- | --- | --- | --- | ----------- | ----------- | --- | -------------- | --------------- | ------- | ------ | --- | --- | --- |
|                                             |     |     | −   | 1 1 − 1     | 1           |     |                |                 |         |        |     |     |     |
| gjenerues i   vargut                        |     |     | 1 , | , , ,       | ,... është  | f ( | x ) = c o      | s x             |         |        |     |     |     |
|                                             |     |     | 2   | ! 4 ! 6 ! 8 | !           |     |                |                 |         |        |     |     |     |
|                                             |     |     |     |             |             |     | n              | n n             | n       |        |     |     |     |
|                                             |     |     |     |             |             |     |    |     |   |        |     |     |     |
| Nga funksioni gjenerues i vargut të fundëm  |     |     |     |             |             |     | ,              | , ,...,       |         | , Pra, |     |     |     |
|                                             |     |     |     |             |             |     | 0 1            | 2               | n       |        |     |     |     |

|        | n | n  | n | n        |                         |     |     |     |     |  n  | n !       | V knk   |     |
| ------ | --- | ---- | --- | ---------- | ----------------------- | --- | --- | --- | --- | ----------- | --------- | ------- | --- |
| f(x)= | + | x+ | x2 | +...+ xn | =(1+x)ndhe nga formula  |     |     |     |     | kn          |           |         |     |
|        |   |    |   |          |                         |     |     |     | C   | = =         |           | = .     |     |
|        | 0 | 1  | 2 | n        |                         |     |     |     |     | k           | k ! ( n − | k ) ! ! |     |

|          |     |         |       | n       | n   | V knk | n     | x k |     |     |     |     |     |
| -------- | --- | ------- | ----- | ------- | --- | ----- | ----- | --- | --- | --- | --- | --- | --- |
| marrim:  |     | (1      | ) n   | k kn k | k  | k     | k kn |     |     |     |     |     |     |
|          | f   | ( x ) = | + x = | C x     | =   | x =   | V     |     |     |     |     |     |     |
|          |     |         |       |         |     | !     |       | k ! |     |     |     |     |     |
|          |     |         |       | = 0     | = 0 |       | = 0   |     |     |     |     |     |     |
Më sipër shqyrtuam funksion gjenerues të një lloji tjetër, pra të llojit
|     |     |     |     |     |     |       |    | xk   |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | ----- | --- | ---- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     | f(x)= |    | a .  |     |     |     |     |     |
k
k!
k=0
Përkufizim 5.2.2.Funksioni
 a
|     |     |     |                                       |     |     | ( ) | k  | k! k                                     (4)  |     |     |     |     |     |
| --- | --- | --- | ------------------------------------- | --- | --- | --- | --- | --------------------------------------------- | --- | --- | --- | --- | --- |
|     |     |     |                                       |     |     | f x | =   |  x                                           |     |     |     |     |     |
k
= 0
| quhet funksion gjenerues eksponencial i vargut  |     |     |     |     |     |     | ( a | ).  |     |     |     |     |     |
| ----------------------------------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
n

Shembull 5.2.4.  Në sa mënyra mund të formojmë fjalë me k shkronja (k=1,2,3,4,5) nga
shkronjat a,a,a,b,c ?
Zgjidhje. Vërejmë re se bëhet fjalë për variacione me përsëritje. Formojmë funksionin
|     |     |     |     |     | f(x)=(1+x+x2 |     | +x3)(1+x)(1+x).  |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | ------------ | --- | ---------------- | --- | --- | --- | --- | --- | --- |
Treguesit e fuqisë së x në kllapën e parë tregojnë se a mund të paraqitet, zero, një, dy apo tri herë,
kllapa e dytë tregon se b mund të paraqitet zero apo një herë dhe kllapa e tretë tregon se  c mund
të paraqitet zero apo një herë.
Shumëzojmë kllapat dhe pastaj çdo termë të prodhimit e shumëzojmë dhe e pjesëtojmë me k!,
marrim:
|     |     |     |              |           |        |            |         | x       | x 2 | x 3       | x 4 | x 5   |     |
| --- | --- | --- | ------------ | --------- | ------ | ---------- | ------- | ------- | --- | --------- | --- | ----- | --- |
|     |     |     |              | 2         | 3      |            |         |         |     |           |     |       |     |
|     |     |     | f ( x ) = (1 | + x + x + | x ) (1 | + x ) (1 + | x ) = 1 | + 3 + 8 | +   | 2 4 + 7 2 | +   | 1 2 0 |     |
|     |     |     |              |           |        |            |         | 1 !     | 2 ! | 3 !       | 4 ! | 5 !   |     |
xk
Duhet të na jap se koeficienti pranë   përcakton fjalët me k shkronja. Por nuk është ashtu, duhet
k!
pasur në konsideratë se kemi të bëjmë me variacione me përsëritje. Kështu nëse një shkronjë

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
gjendet në kombinacion m herë, atëherë duhet të pjestojmë me m!. Pra, funksioni gjenerues i saktë
është
|     |     |            |     | 2 3    |            |           | 2       | 3       | 4         | 5   |
| --- | --- | ---------- | --- | ------ | ---------- | --------- | ------- | ------- | --------- | --- |
|     |     |            | x   | x      |            |           | x       | x       | x         | x   |
|     | f ( | x ) = (1 + | x + | + ) (1 | + x ) (1 + | x ) = 1 + | 3 x + 7 | + 1 3 + | 2 0 + 2 0 | .   |
|     |     |            | 2   | ! 3 !  |            |           | 2 !     | 3 !     | 4 !       | 5 ! |
Përfundimisht,  për të formuar fjalë me një shkronjë kemi 3 mundësi, fjalë me dy shkronja kemi 7
mundësi, me tre shkonja kemi 13 mundësi, me katër shkronja kemi 20 mundësi dhe me 5 shkronja
kemi 20 mundësi.

5.3. Veprimet me funksione gjeneruese
Pamë disa vargje dhe funksionet e tyre gjeneruese, megjithatë shtrohet pyetja: -A mundemi
me ndihmën e funksioneve gjeneruese tashmë të njohura, të ndërtojmë funksione të reja gjeneruese
për disa vargje të tjera?
   Duke u bazuar te vetitë e serive, marrim teknika të caktuara, me të cilat mund të kryejmë
veprime me funksione gjeneruese, të cilat i përshkruajmë më poshtë:
|     |     |     |     |     |    |     |    |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
•  Mbledhja. Le të jenë   f1 ( x ) = k a x k  dhe   f ( x ) = k b x k funksione gjeneruese
|     |     |     |     |     | k   |     | 2   | k   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     | = 0 |     | = 0 |     |     |     |
përkatësisht të vargjeve  ( )  dhe  (b ) . Funksioni gjenerues i  vargut  (c ) ( )  është
|     |     |     | a   |     |     |     |     |     | = a + | b   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- |
|     |     |     | n   | n   |     |     |     |     | n n   | n   |
|     |     |     |     |     |    |    |     |    |       |     |

|     |     | f ( x | ) = f ( | x ) + f ( x | ) = k a | x k + k | b x k = k | ( a + b | )x k            (5) |     |
| --- | --- | ----- | ------- | ----------- | -------- | -------- | ---------- | ------- | ------------------- | --- |
|     |     |       | 1       | 2           | k        |          | k          | k       | k                   |     |
|     |     |       |         |             | = 0      | = 0      |            | = 0     |                     |     |

•  Shumëzimi me konstantë. Le të jetë  f1 ( x ) = k a x k funksioni gjenerues i vargut  ( a )
k n
= 0
|                             |     |     | (c  | )                             |     |     |     |     |     |     |
| --------------------------- | --- | --- | --- | ----------------------------- | --- | --- | --- | --- | --- | --- |
| Funksion gjenerues i vargut |     |     |     |  a ,ku c –konstante, është   |     |     |     |     |     |     |
n

|     |     |     |     | f ( x ) = | c  f1 ( x ) = | k c  a | x k                                    (6)  |     |     |     |
| --- | --- | --- | --- | --------- | -------------- | -------- | ------------------------------------------- | --- | --- | --- |
k
|     |                        |     |     |     |     | = 0 |     |     |     |     |
| --- | ---------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

Shembull 5.3.1.   Funksioni  gjenerues i  vargut 4,1,4,1,4,1,... mund të caktohet duke
kombinuar funksionet gjeneruese të vargjeve
                                           1,1,1,1,... dhe 3,0, 3,0,... .

Zgjidhja. Në shembujt 5.2.1 dhe 5.2.2, pamë se vargu 1,1,1,1,... ka funksion gjenerues
| 1   |     |     |     |     |     |     |     |     | 1   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
f ( x ) =  , si dhe funksioni gjenerues i vargut  1 ,0 ,1 ,0 ,...  është  f(x)=
| 1 − x |     |     |     |     |     |     |     |     | 1−x2 |     |
| ----- | --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- |
Kështu, funksioni gjenerues i vargut 3,0, 3,0,... është:
|                                      |     |     |      |            | (   | )      | 3   |       |     |     |
| ------------------------------------ | --- | --- | ---- | ---------- | --- | ------ | --- | ----- | --- | --- |
|                                3+3x2 |     |     | +3x4 | +...=31+x2 | +x4 | +... = | =   | g(x)  |     |     |
1−x2

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
|     |     |     |     |     |     | 1   | 3 1 | + x + 3 | 4 + | x   |
| --- | --- | --- | --- | --- | --- | --- | --- | ------- | --- | --- |
Përfundimisht, funksioni gjenerues i vargut 4,1,4,1,4,1,... është   + = =
|     |     |     |     |     |     |         | 2     | 2   |       | 2   |
| --- | --- | --- | --- | --- | --- | ------- | ----- | --- | ----- | --- |
|     |     |     |     |     |     | 1 − x 1 | − x 1 | − x | 1 − x |     |

Shembull 5.3.2. Funksioni gjenerues i vargut 4, 5,1,1,1, ... është
|     |     |     |     |     |     |    |     | 4+x−4x2 |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ------- | --- | --- |
|     |     |     |     | (   | )   |     | 1   |         |     |     |
4+5x+x2 +x3 +...=(3+4x)+ 1+x+x2 +x3 +... =(3+4x)+  xk =3+4x+ =
|     |     |     |     |     |     |     | 1−x | 1−x |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
k=0

|     |     |     |     |     |    |    |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
•  Kombinimi linear.  Le të jenë   ( ) k k  dhe   ( ) k k funksione
|     |     |     |     | f1 x = | a x | f x = b | x   |     |     |     |
| --- | --- | --- | --- | ------ | --- | ------- | --- | --- | --- | --- |
|     |     |     |     |        | k   | 2 k     |     |     |     |     |
|     |     |     |     |        | = 0 | = 0     |     |     |     |     |
|     |     |     |     | ( )    | ( ) |         |     |     |     |     |
gjeneruese përkatësisht të vargjeve  a  dhe  b . Funksioni gjenerues i  vargut  (c ) = (  a +  b )
|     |     |     |     | n   | n   |     |     | n   | n   | n   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
është
|     |     |     |     |    |    |    |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

|     | f ( x ) = |  f1 ( x ) | +  f ( | x ) = k  a x k | + k  b x k = k | ( a +  b )x k |                   (7)  |     |     |     |
| --- | --------- | ---------- | ------- | ---------------- | ----------------- | --------------- | ---------------------- | --- | --- | --- |
|     |           |            | 2       | k                | k                 | k k             |                        |     |     |     |
|     |           |            |         | = 0              | = 0               | = 0             |                        |     |     |     |
•  Translacioni: Nëse funksioni gjenerues i vargut  ( a )  është  f(x), atëherë për çdo  k  N
|     |     |     |     |     |     | n   |     |     |     | ,   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
funksioni
                                                  k ( )                                        (8)
|     |     |     |     | g ( x ) = x |  f x |     |     |     |     |     |
| --- | --- | --- | --- | ----------- | ----- | --- | --- | --- | --- | --- |

është funksion gjenerues i vargut
|     |     |     |     | 0 ,0 ,...,0 , | a , a , a , a ,... |     |     |     |     |     |
| --- | --- | --- | --- | -------------- | ------------------ | --- | --- | --- | --- | --- |
|     |     |     |     |              | 0 1 2 3            |     |     |     |     |     |
k
Me të vërtet, vargu i dhënë  0 ,0 ,...,0 , a , a , a , a ,... ka funksioni gjenerues
|     |     |     |   | 0 1 2 3 |     |     |     |     |     |     |
| --- | --- | --- | --- | ------- | --- | --- | --- | --- | --- | --- |
k
g ( x ) = 0 + 0 x + ....+ 0 x k − 1 + a x k + a x k + 1 + a x k + 2 + a x k + 3 + ... = a x k + a x k + 1 + a x k + 2 + a x k + 3 + ... =
|         |               |       | 0         | 1 2     | 3   | 0 1 | 2   | 3   |     |     |
| ------- | ------------- | ----- | --------- | ------- | --- | --- | --- | --- | --- | --- |
| (a      |               |       | )         |         |     |     |     |     |     |     |
| x k + a | x + a x 2 + a | x 3 + | ... = x k | f ( x ) |     |     |     |     |     |     |
| 0       | 1 2           | 3     |           |         |     |     |     |     |     |     |
Shembull 5.3.3. Të gjendet funksioni gjenerues i vargut
                                           0,0,0,0,0,0,5,1,5,1,5,1,...
Zgjidhja. Nga vetia e funksionit gjenerues të shumës së dy vargjeve, marrim:
                                          0,0,0,0,0,0,1,1,1,1,...
                                          0,0,0,0,0,0,4,0,4,0,...

Tani, në bazë të shembullit 5.2.1 dhe në bazë të pohimit të translacionit, përfundojmë se funksioni
gjenerues i vargut  0,0,0,0,0,0,1,1,1,... është:
x6
|                                                          |     |     |     |     |     |     |     |     |     |     |
| -------------------------------------------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1−x
Ngjashëm, në bazë shembullit 5.3.3 dhe të translacionit, përfundojmë se funksioni gjenerues i
vargut   0,0,0,0,0,0, 4,0, 4,0,...   është

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
4 x 6
|                                                          |     |     |     |     |       |     |     |     |     |     |     |     |
| -------------------------------------------------------- | --- | --- | --- | --- | ----- | --- | --- | --- | --- | --- | --- | --- |
|                                                          |     |     |     |     | 1 − x | 2   |     |     |     |     |     |     |
Përfundimisht, funksioni gjenerues i vargut
                                                0,0,0,0,0,0,5,1,5,1,5,1,...
është
|     |     |     |     |           | 6     | 6     | 6   | 7     | 6     | 6 7   |     |     |
| --- | --- | --- | --- | --------- | ----- | ----- | --- | ----- | ----- | ----- | --- | --- |
|     |     |     |     |           | x     | 4 x   | x + | x +   | 4 x 5 | x + x |     |     |
|     |     |     |     | g ( x ) = | +     |       | =   |       | =     | .     |     |     |
|     |     |     |     |           | 1 − x | 2     |     | 2     |       | 2     |     |     |
|     |     |     |     |           |       | 1 − x |     | 1 − x |       | 1 − x |     |     |

•  Ndërrimi  i  ndryshoreve.  Nëse ( ) k k është  funksion  gjenerues  i  vargut ( a ) ,
|     |     |     |     |     |     | f   | x = | a x |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
k n
= 0
|     | atëherë |     |     |     |     |     |     |     |     |     |     |     |
| --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |         |     |     |     |     |    |     |    |     |     |     |     |
                                        f ( y ) = f ( c x ) = k a (c x ) k = k c k a x k                        (9)
|                                    |     |     |     |     |         |         | k           |       | k   |     |     |     |
| ---------------------------------- | --- | --- | --- | --- | ------- | ------- | ----------- | ----- | --- | --- | --- | --- |
|                                    |     |     |     |     |         | = 0     |             | = 0   |     |     |     |     |
| është funksion gjenerues i vargut  |     |     |     |     | a , c a | , c 2 a | , c 3 a ,.. |       |     |     |     |     |
|                                    |     |     |     |     | 0       | 1 2     | 3           |       |     |     |     |     |
Shembull  5.3.4.   Nëse dëshirojmë të gjejmë funksionin gjenerues të vargut
1,2,4,8,16,...., atëherë nisemi nga funksioni gjenerues i vargut 1,1,1,1,... e që është
|     |     |     |     |     |     |         | 1   |         | 2 3   |        |     |     |
| --- | --- | --- | --- | --- | --- | ------- | --- | ------- | ----- | ------ | --- | --- |
|     |     |     |     |     | f   | ( x ) = | =   | 1 + x + | x + x | + .... |     |     |
|     |     |     |     |     |     | 1       | − x |         |       |        |     |     |

Marrim c=2 dhe nga formula e vetisë kemi:
1
|     |     |       |         |           | 2         |           | 3      |         | 2         | 3           |     |     |
| --- | --- | ----- | ------- | --------- | --------- | --------- | ------ | ------- | --------- | ----------- | --- | --- |
|     |     | f ( 2 | x ) = 1 | + ( 2 x ) | + ( 2 x ) | + ( 2 x ) | + .... | = 1 + 2 | x + 4 x + | 8 x + ... = |     |     |
|     |     |       |         |           |           |           |        |         |           | 1 −         | 2 x |     |
1
Morëm kështu, funksioni gjenerues i vargut 1,2,4,8,16,....,  është  g(x)=
|     |     |     |     |     |     |     |     |     |     | 1−2x | .   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- | --- |
|     |     |     |     |     |     |    |     |     |    |      |     |     |
•  Shumëzimi. Le të jenë  f (x)=a xk  dhe   f (x)=b xk funksione
|                                      |       |        |        |      | 1     | k        |           | 2     | k       |                    |     |     |
| ------------------------------------ | ----- | ------ | ------ | ---- | ----- | -------- | --------- | ----- | ------- | ------------------ | --- | --- |
|                                      |       |        |        |      |       | k=0      |           |       | k=0     |                    |     |     |
|                                      |       |        |        |      | (     | )        | ( )       |       |         |                    |     |     |
| gjeneruese përkatësisht të vargjeve  |       |        |        |      | a     |  dhe     | b . Meqë  |       |         |                    |     |     |
|                                      |       |        |        |      | n     |          | n         |       |         |                    |     |     |
|                                      |       |        |        | (    |       |          | ) (       |       |         | )                  |     |     |
|                                      | f(x)= | f (x) | f (x)= | a +a | x+a   | x2 +... | b +b      | x+b   | x2 +... | =                  |     |     |
|                                      |       | 1      | 2      | 0    | 1     | 2        | 0         | 1     | 2       |                    |     |     |
|                                      |       |        |        |      | +(a   | )x+(a    |           |       |         | )x2                |     |     |
|                                      |       |        | =a     | b    | b     | +ab      | b         | +ab   | +a b    | +...+              |     |     |
|                                      |       |        |        | 0 0  | 0 1   | 1 0      | 0         | 2 1   | 1 2 0   |                    |     |     |
|                                      |       |        | +(a    | b    | +ab   | +...+a   | b +a      | b )xn | +...    |                    |     |     |
|                                      |       |        |        | 0 n  | 1 n−1 |          | n−1 1     | n 0   |         |              (10)  |     |     |
përfundojmë se f (x) paraqet funksionin gjenerues të vargut
n
|     |     |     |     |     | c   | =a | b     | ,n=0,1,2,...  |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | ------------- | --- | --- | --- | --- |
|     |     |     |     |     | n   |     | k n−k |               |     |     |     |     |
k=0
| Rast i veçantë merret për |     |     |     | (x)= | 1 , atëherë  |     |     |     |     |     |     |     |
| ------------------------- | --- | --- | --- | ---- | ------------ | --- | --- | --- | --- | --- | --- | --- |
f
2 1−x
1
|     |     |     | f ( | x ) = f1 | ( x )  | = a | + ( a + | a ) x + | ( a + a + | a ) x 2 + ...   |     |     |
| --- | --- | --- | --- | -------- | ------- | --- | ------- | ------- | --------- | --------------- | --- | --- |
|     |     |     |     |          |         | 0   | 0       | 1       | 0 1       | 2               |     |     |
1 − x
Pra, f (x) është funksion gjenerues i vargut
                        a ,a ,a ,a +a +a ,... që është vargu i shumave të pjesshme të vargut(a )
|     |     | 0 0 | 1 0 | 1   | 2   |     |     |     |     |     |     | n . |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Shembull 5.3.5. Të gjendet funksioni gjenerues i vargut të numrave natyrorë 1,2,3,4,5,......

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Zgjidhje. Vërejmë që 1,2,3,4,5,.... është 1,1+1,1+1+1, 1+1+1+1,..... pra, është vargu i
1
shumave të pjesëshme të vargut 1,1,1,1,1,....... me funksion gjenerues  f (x)=  . Kështu, duke
1
1−x
pasur parasysh rastin e veçantë, marrim që:
|     |     |     |     | ( )      | ( ) 1 | 1     | 1       |      | 1     |     |     |
| --- | --- | --- | --- | -------- | ----- | ----- | ------- | ---- | ----- | --- | --- |
|     |     |     |     | f x = f1 | x    | =     |        | =    |       |     |     |
|     |     |     |     |          | 1 −   | x 1 − | x 1 − x |      | 2     |     |     |
|     |     |     |     |          |       |       |         | (1 − | x )   |     |     |
është funksion gjenerues i vargut 1,2,3,4,5,....

( )
•  Derivimi:  Le të jetë f ( x ) = k a x k funksion gjenerues i vargut a . Funksioni
|     |     |     |     |     | k   |     |     |     |     | n   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
= 0

                                     (' ) k ( )a k                             (11)
|     |     |     |     |     | f x = | k + | 1   | x   |     |     |     |
| --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- | --- | --- |
k + 1
= 0
| është funksion gjenerues i vargut  |     |     |     | a ,2 a | ,3 a ,4 a | ,..    |     |     |     |     |     |
| ---------------------------------- | --- | --- | --- | ------ | --------- | ------ | --- | --- | --- | --- | --- |
|                                    |     |     |     | 1      | 2 3       | 4      |     |     |     |     |     |

Shembull 5.3.6. Gjejmë edhe njëherë funksionin gjenerues të vargut të numrave natyrorë
1,2,3,4,5..., por tani nëpërmjet rregullës së derivimit:
|     |     |           |       |           |       |       | ')     |       |       |       | '       |
| --- | --- | --------- | ----- | --------- | ----- | ----- | ------ | ----- | ----- | ----- | ------- |
|     |     |           | 2 3   | (x        | 2 3   | 4     |        | (x (1 | 2     | 3 4   | ))      |
|     | 1 + | 2 x + 3 x | + 4 x | + ... = + | x + x | + x + | .... = | + x   | + x + | x + x | + ... = |
,
|     |     |     |     |     |  x |   | 1       |     |     |     |     |
| --- | --- | --- | --- | --- | ----- | ---- | ------- | --- | --- | --- | --- |
|     |     |     |     |     | =     | =    |         | .   |     |     |     |
|     |     |     |     |     | 1 −   | x (1 | − x ) 2 |     |     |     |     |

|     |     |     |     | ( ) k |     |     |     |     |     | (   | )   |
| --- | --- | --- | --- | ------ | --- | --- | --- | --- | --- | --- | --- |
•  Integrimi. Le të jetë f x = a x k funksion gjenerues i vargut a . Funksioni
|     |     |     |     |     | k   |     |     |     |     | n   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
= 0
x0
|     |     |     |     |     | 1   | 1   |     |    | a   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
                             ( ) ( )d 2 3 k k k + 1           (12)
|     |     | f 1 | x = f | x x = a 0 | x + a 1 | x + a | 2 x + ... | =   | x     | .   |     |
| --- | --- | --- | ----- | --------- | ------- | ----- | --------- | --- | ----- | --- | --- |
|     |     |     |       |           | 2       | 3     |           |     | k + 1 |     |     |
= 0
|                                     |     |     |     |       | a a   |      |     |     |     |     |     |
| ----------------------------------- | --- | --- | --- | ----- | ----- | ---- | --- | --- | --- | --- | --- |
| është  funksion gjenerues i vargut  |     |     |     |       | 12 23 | .    |     |     |     |     |     |
|                                     |     |     |     | 0 , a | , ,   | ,... |     |     |     |     |     |
0
|                                                    |     |           |     |     |       |         |       | 1 1     | 1            |         |                |
| -------------------------------------------------- | --- | --------- | --- | --- | ----- | ------- | ----- | ------- | ------------ | ------- | -------------- |
| Shembull 5.3.6. Funksioni gjenerues i vargut: 0,1, |     |           |     |     |       |         |       | , ,     | ,... është   |         |                |
|                                                    |     |           |     |     |       |         |       | 2 3     | 4            |         |                |
|                                                    |     |           | 2   | 3 4 | x0   |         |       |         | x0          |         |                |
|                                                    |     |           | x   | x x | (1    |         | 2 3   | )       | 1            |         |                |
|                                                    | f ( | x ) = x + | +   | + + | ... = | + x + x | + x + | ... d x | =            | d x = − | ln ( 1 − x )   |
|                                                    |     |           | 2   | 3 4 |       |         |       |         | 1 −          | x       |                |

5.4. Teorema binomiale e zgjeruar

Në shqyrtimin e  problemeve të ndryshme të matematikës diskrete, shpesh paraqitet nevoja
për të studiuar shprehje si:
|                                                  (1+x)−n ku  |     |     |     |     | n  | Z   |     |     |     |     |     |
| ------------------------------------------------------------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

Përgjithësimi i teoremës binomiale nënkupton që, për tregues të fuqisë së binomit, në vend
të numrit natyror n, të merret një numër i çfarëdoshëm i plotë.

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Përkufizim 5.4.1. Për një numër të çfardoshëm 𝑛 ∈ 𝑁 dhe për k natyror, definojmë
koeficientin binomial si
 n
k

=
n ( n − 1 ) ( n −
k
2
!
) ....(n − k )
dhe
 n
0

= 1
Përkufizim 5.4.2. Seria k

= 0
 n
k

x k = 1 + n x +
n ( n
2
−
!
1 )
x 2 +
n ( n − 1 ) (
3 !
n − 2 )
x 3 + ...... quhet seri
binomiale, e cila konvergjon për x  1 .
Teoremë 5.4.1. Le të jetë 𝑛 ∈ 𝑁. Për çdo k = 0 ,1 , 2 ,... vlen
 − n
k

= ( − 1 ) k 
 n + k
k
− 1 
(13)
Vërtetim.
 − n
k

=
= (
−
−
n
1
( −
) k
n
( n
−
+
) 1
k
(  ... −
k !
)( − 1 n
n
+
−
k
k
−
+
2
) 1
=
)  ...
k !
( −
( n
1
+
) k
k
n
−
( n
1 −
+ 1
k
)
+
(  ...
k !
) 1
=
n
(
+
−
k
) 1
−

k 
) 1
n
=
+ k
k
− 1 
gjë që duhej treguar.
 −n  n+k−1  n+k−1
Zhvillojmë (1−x)−n =  (−x)k =  (−1)k (−x)k =  xk =
     
 k   k   k 
k=0 k=0 k=0
n+1 n+k−1
=1+nx+ x2 +...+ xk +...
   
 2   k 
është funksion gjenerues i vargut
 n
0

,
 n
1

,
 n
2

,
 n
3

,....
Kështu marrim:
Teoremë 5.4.2. (Teorema binomiale e zgjeruar). Le të jetë n numër i çfarëdoshëm i plotë.
Atëherë
 −n  n+k−1
(1−x)−n = (−x)k,= xk (14)
   
 k  k 
k=0 k=0
1
Shembull 5.4.1. Të gjendet vargu që si funksion gjenerues ka f(x)=
(1−2x)3
1  3+k−1  2+k
Zgjidhje. Nga f(x)= =(1−2x)−3 = (2x)k = 2kxk
   
(1−2x)3  k   k 
k=0 k=0

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Prej ku marrim që a
k
=
 2 +
k
k 
2 k , kështu japi vlera k=0,1,2,3,.... dhe marrim vargun
1,6,24,80,....
5.5. Ekuacionet rekurente
Ekuacionet rekurente janë formë e veçantë e të shkruarit të vlerave të një vargu të caktuar.
Këto janë ekuacione në të cilat, duke filluar nga një anëtar i caktuar i vargut, të gjithë anëtarët e
vargut varen nga disa anëtarë paraardhës. Një nga mënyrat më të përdorshme për ndërtimin e
algoritmeve është nëpërmjet rekurencave apo rekursioneve. Fjala rekursion rrjedhë nga fjala latine
recurrere që ka kuptimin e kthimit.
Në matematikë dhe te shkencat kompjuterike ka kuptimin e procedurës apo funksionit me
dy hapa:
Hapi 1. Funksioni është i përcaktuar për ndonjë vlerë fillestare a (shpesh 0 ose 1);
Hapi 2. Nëse funksioni është i definuar për ndonjë vlerë n, që është më e madhe apo e
barabartë me a, atëherë funksioni mund të përcaktohet edhe për vlerën n+1.
Përkufizim 5.5.1. Ekuacion rekurent të rendit k quajmë ekuacionin e formës
a
n + k
= F ( n , a
n
, a
n + 1
,...,a
n + k − 1
) , ku n është numër natyror, ndërsa a ,a ,...,a janë k+1 anëtarë të
n n+1 n+k−1
njëpasnjëshëm të vargut (a ), të cilat ekuacionin rekurent e kthejnë në identitet.
n
Zgjidhje të përgjithshme të ekuacionit rekurent të rendit k, quajmë zgjidhjen e cila i
përmban të gjitha zgjidhjet. Zgjidhja e përgjithshme e ekuacionit rekurent të rendit k përmban k
konstante arbitrare.
Nëse dihen termat fillestarë të vargut dhe mundemi t’i caktojmë vlerat e këtyre
konstanteve, atëherë themi se kemi marrë një zgjidhje të vetme ose të pjesëshme.
Përkufizim 5.5.2. Ekuacion rekurent linear quajmë ekuacionin e formës
f
k
( n ) a
n + k
+ f
k − 1
( n ) a
n + k − 1
+ ...+ f
0
( n ) a
n
= f ( n ) (15)
Dallojmë:
• Nëse f (n)=1, atëherë rekurenca quhet rekurencë e normuar;
k
• Nëse f ( n ) = 0 , atëherë rekurenca quhet rekurencë homogjene;
• Nëse f(n)0, atëherë rekurenca quhet rekurencë johomogjene;
• Nëse f (n)=c janë konstante, atëherë rekurenca quhet rekurencë me koeficientë
i i
konstantë, në të kundërt quhet me keoficientë funksional.
Në vazhdim do të shqyrtojmë rekurencat lineare homogjene dhe johomogjene me koeficientë
konstantë. Por, në fillim do të ndalemi në zgjidhjen e tyre me ndihmën e funksioneve gjeneruese.

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Shembull 5.5.1. Duke shfrytëzuar kuptimin e funksionit gjenerues, të gjendet formula e
anëtarit të përgjithshëm a  të vargut të dhënë në formë rekurente  a = a + n , me kusht fillestar
|     |     |     | n   |     |     |     |     |     | n + 1 | n   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- |
a 0 =1.

Zgjidhje. Shënojmë me   2 k k funksionin gjenerues të vargut të
|                                               |     |     | f   | ( x ) = a | + a x + | a x + | ... = | a x   |     |     |
| --------------------------------------------- | --- | --- | --- | --------- | ------- | ----- | ----- | ----- | --- | --- |
|                                               |     |     |     |           | 0 1     | 2     |       | k     |     |     |
|                                               |     |     |     |           |         |       | =     | 0     |     |     |
| dhënë. Qëllimi jonë është të marrim shprehje  |     |     |     |           |         |       |       | n + 1 |     |     |
|                                               |     |     |     |           |         | ( a − | a − n | ) x   |     |     |
|                                               |     |     |     |           |         | n + 1 | n     |       |     |     |

të cilat janë të gjitha zero, meqë  nga  a = a + n , marrim  a − a − n = 0 .
|     |     |     |     |     | n + 1 n |     |     | n + 1 | n   |     |
| --- | --- | --- | --- | --- | ------- | --- | --- | ----- | --- | --- |
Për të fituar këtë, marrim:
|                                | f(x)=a |         | +a x+a  | x2    | +...+a  | xn +...         | (i)   |     |     |     |
| ------------------------------ | ------ | ------- | ------- | ----- | ------- | --------------- | ----- | --- | --- | --- |
|                                |        |         | 0 1     | 2     | n       |                 |       |     |     |     |
|                                |        |         |         | 2     | 3       | n + 1           | (ii)  |     |     |     |
|                                | x f    | ( x ) = | a x + a | x + a | x + ... | + a x           | + ... |     |     |     |
|                                |        |         | 0       | 1     | 2       | n               |       |     |     |     |
|                                |        |         |         |       |         |                 |       |     |     |     |
dhe duke ditur që funksioni gjenerues i vargut 0,0,1,2,3,4,.... ,është
2
|                             | x   |     | 2     | 3       | 4         | n + 1   |     | (iii)  |     |     |
| --------------------------- | --- | --- | ----- | ------- | --------- | ------- | --- | ------ | --- | --- |
|                             |     | =   | x + 2 | x + 3 x | + ... + n | x + ... |     |        |     |     |
2
|     | (1 − | x ) |     |     |     |     |          |     |     |     |
| --- | ---- | --- | --- | --- | --- | --- | -------- | --- | --- | --- |
Nga  (i)-(ii)-(iii), marrim:
2
|     |     |     | x   |     |     |     |     | 2   |     | n + 1 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- |
f ( x ) − x f ( x ) − = a + ( a − a ) x + ( a − a − 1 ) x + ... + ( a − a − n ) x + ....
|     |     |     | 2   | 0   | 1 0 | 2   | 1   |     | n + 1 | n   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- |
(1 − x )

2
x
|     |     |     |     | (1  | − x ) f ( x ) | −   | = a | = 1 . |     |     |
| --- | --- | --- | --- | --- | ------------- | --- | --- | ----- | --- | --- |
2 0
|          |     |     |     |     |     | (1 − x | )   |     |     |     |
| -------- | --- | --- | --- | --- | --- | ------ | --- | --- | --- | --- |
|          | 1   | x 2 |     |     |     |        |     |     |     |     |
| Nga ku,  |     |     | .   |     |     |        |     |     |     |     |
f ( x ) = +
|     | 1 − x | (1 − x | ) 3 |     |     |     |     |     |     |     |
| --- | ----- | ------ | --- | --- | --- | --- | --- | --- | --- | --- |
1
Duke pas parasysh vargun që ka funksion gjenerues   dhe nga teorema e zgjeruar binomiale
1 − x
|                                           |     |     |     |     |     | 1   | (1 ) − | 3           |     |     |
| ----------------------------------------- | --- | --- | --- | --- | --- | --- | ------ | ----------- | --- | --- |
| gjejmë që vargu që ka funksion gjenerues  |     |     |     |     |     | =   | − x    | , marrim:   |     |     |
3
|     |             |     |         |     | (1 −       | x )      |        |        |        |        |
| --- | ----------- | --- | ------- | --- | ---------- | -------- | ------ | ------ | ------ | ------ |
|     |             |     |         |     |            | 2     | 3    | 4    | n    |       |
|     | f(x)=1+x+x2 |     | +...+xn |     | +....+x2 |          |        | x2    | xn−2  |        |
|     |             |     |         |     |            | +      | x+   |        | +...+ | +...= |
|     |             |     |         |     |            |   2  |  2  |  2  |  2  |       |
|     |             |     |         |     |            |        |       |       |       |       |

|     |          |     |      | 3 |  4 |                |     | n             |      |                  |
| --- | -------- | --- | ----- | ---- | ------ | -------------- | ---- | ---------------- | ---- | ---------------- |
|     | =1+x+2x2 |     | +1+ | x3 | +1+  | x4 +...+1+ |      | xn             |      |                  |
|     |          |     |       |    |       |               |      |                | +... |                  |
|     |          |     |      | 2  |  2   |               |     | 2              |      |                  |
|     |          |     |      |    |       |              |     |                |      |                  |
|     |          |     |       |      |        |                |  |  3   |  |  n   |
Marrim që f(x) është funksion gjenerus i vargut : 1,1,2,  , .....  ,....
|     |     |     |     |     |     |     | 1   | +   | 1 + |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     |     | 2   |     | 2   |
Prej ku,
|     |     |     |     |     | n | n!  |     | n(n−1) |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ------ | --- | --- |
,
|     |     |     | a   | =1+ |  =1+  |          | =1+ |     |     |     |
| --- | --- | --- | --- | ---- | -------- | -------- | --- | --- | --- | --- |
|     |     |     |     | n    | 2       | 2!(n−2)! |     | 2   |     |     |


Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
 është zgjidhje e rekurencës, për çdo n=0,1,2,....
Shembull 5.5.2. Le të jetë dhënë vargu  F = F + F , për  n  2 , me kushte fillestare F =0
|     |     |     |     |     |     | n   | n − | 1 n | − 2 |     | 0   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
dhe F 1 =1. Të  shkruhen disa anëtar të vargut, të gjendet funksioni gjenerues dhe të gjendet anëtari
i përgjithshëm i vargut?

Zgjidhja. Disa anëtarë të vargut janë: 0,1,1,2,3,5,8,13,21,....... Ky varg njihet si vargu
Fibonaçi, ndërsa forma  F = F + F , quhet forma rekurente e vargut Fibonaçi.
|     |     |     | n n − | 1 n − | 2   |     |     |     |     |     |     |
| --- | --- | --- | ----- | ----- | --- | --- | --- | --- | --- | --- | --- |
Nga përkufizimi i funksionit gjenerues kemi:
|     |     |     |     | ( ) |         |         | 2       | 3       |     |     |     |
| --- | --- | --- | --- | --- | ------- | ------- | ------- | ------- | --- | --- | --- |
|     |     |     |     | g x | = F 0 + | F 1 x + | F 2 x + | F 3 x + | ... |     |     |
( )
|     |     |     |     | x g x       | = F x + | F x 2   | + F x 3 | + F x   | 4 + ...   |     |     |
| --- | --- | --- | --- | ----------- | ------- | ------- | ------- | ------- | --------- | --- | --- |
|     |     |     |     |             | 0       | 1       | 2       | 3       |           |     |     |
|     |     |     |     | x 2 g ( x ) | = F x   | 2 + F x | 3 + F   | x 4 + F | x 5 + ... |     |     |
|     |     |     |     |             | 0       | 1       | 2       | 3       |           |     |     |
Gjejmë ndryshimin g(x)-xg(x)-x2g(x) dhe  marrim:
(1 )g
|                                    | −   | x − x 2 | ( x ) = F | + ( F | − F ) x | + ( F | − F − | F ) x 2 + | ( F − F | − F ) x 3 + ... = x   |     |
| ---------------------------------- | --- | ------- | --------- | ----- | ------- | ----- | ----- | --------- | ------- | --------------------- | --- |
|                                    |     |         |           | 0 1   | 0       | 2     | 1     | 0         | 3       | 2 1                   |     |
| Prej ku funksioni gjenerues është  |     |         |           | ( )   |         | x     | .     |           |         |                       |     |
|                                    |     |         |           | g x   | =       |       |       |           |         |                       |     |
|                                    |     |         |           |       | 1 − x   | − x 2 |       |           |         |                       |     |
|                                    |     |         | −         | 1 + 5 |         | − 1   | − 5   |           |         |                       |     |
Nga  1 − x − x 2 = 0 , marrim  x =  dhe  x = .  Zëvendësojmë te funksioni gjenerues dhe
|     |     |     | 1   |     |     | 2   |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     | 2   |     |     | 2   |     |     |     |     |
marrim:
|                                       |     |       | 1     |  1 |       | 1    |         | 1 +        | 5   | 1 − 5 |     |
| ------------------------------------- | --- | ----- | ----- | --- | ----- | ----- | ------- | ---------- | --- | ----- | --- |
|                                       |     | g(x)= |       |    | −     |  ku  | t1      | =          | , t | = .   |     |
|                                       |     |       |       |    |       |      |         |            | 2   |       |     |
|                                       |     |       | 51−t |     | x 1−t | x    |         | 2          |     | 2     |     |
|                                       |     |       |       | 1   |       | 2     |         |            |     |       |     |
| Nëse x është numër për të cilin vlen  |     |       |       | t1  | x  1 |  dhe  | t x  1 | , atëherë  |     |       |     |
2
|     |     |     | ( ) | 1 (1 | 2         | 2       | ) 1 | (1  | 22      | 2 )     |     |
| --- | --- | --- | --- | ---- | --------- | ------- | --- | --- | ------- | ------- | --- |
|     |     | g   | x = | +    | t1 x + t1 | x + ... | −   | + t | x + t x | + ... = |     |
2
|     |     |     |     | 5      |         |      | 5   |       |     |     |     |
| --- | --- | --- | --- | ------ | ------- | ---- | --- | ----- | --- | --- | --- |
|     |     |     |     | 1 ((t1 |         | (    | )x  | )     |     |     |     |
|     |     |     |     |        | )       | 2    | 2 2 |       |     |     |     |
|     |     |     | =   |        | − t x + | t1 − | t   | + ... |     |     |     |
|     |     |     |     | 5      | 2       |      | 2   |       |     |     |     |
Përfundimisht,
|     |     |     |     |      |          |  |          | n      |            | n  |     |
| --- | --- | --- | --- | ---- | -------- | ----- | -------- | ------ | ---------- | ------- | --- |
|     |     |     |     | 1 (  | )        | 1     |  1 + | 5  |  1 − 5 |     |     |
|     |     |     | F = | t1 n | − t n2 = |       |          | −      |            | .       |     |
n
|     |     |     |     | 5   |     | 5   | 2   |     | 2   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

Shembull 5.5.3. (Numrat e Katalanit) Vargu  me anëtarë të përgjithshëm
| ( 2( n ) ! |     |     |     |     |     |     |     |     |     |     |     |
| ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
a = , për n=0,1,2,3,.... quhet varg i numrave të Katalanit. Disa anëtarë të këtij vargu janë:
| n )!      |     |     |     |     |     |     |     |     |     |     |     |
| --------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| n ! n + 1 |     |     |     |     |     |     |     |     |     |     |     |
1, 1, 2 , 5, 14 , 42 , 132 , 429 , 1430 , 4862 , 16796,.....

Tani parashtrojmë problemin e Katalanit: Në rreth janë dhënë 2n pika. Në sa mënyra këto
2n pika mund të ndërlidhen me n dyshe me anë të n tetivave, ashtu që tetivat të mos priten?

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Zgjidhja. Le të jetë  a numri i kërkuar. Së pari vërejmë se  a = 1 dhe   a = 1 .Le të jenë
|     |     |     |     | n   |     |     |     |     |     |     | 0   | 1   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
A , A ,..., A pikat e dhëna të shënuara me renditjen me të cilën janë paraqitur në rreth.
| 1 2 | 2 n |     |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Meqë pika  A mund të bashkohet vetëm me pikat  A , A , A ,..., A përfundojmë se për  n  1
|     | 1   |     |     |     |     |     |     | 2 4 | 6   | 2 n |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
vlen identiteti:
|                                               |     |     |         | a = a a | + a     | a         | + ... + a | a                 | + ... + | a a .   |             |     |
| --------------------------------------------- | --- | --- | ------- | ------- | ------- | --------- | --------- | ----------------- | ------- | ------- | ----------- | --- |
|                                               |     |     |         | n 0     | n − 1   | 1 n − 2   |           | k − 1 n − k       |         | n − 1 0 |             |     |
| Le të jetë g(x) funksioni gjenerues i vargut  |     |     |         |         |         | ( a       | , a , a   | ,...) . Atëherë:  |         |         |             |     |
|                                               |     |     |         |         |         | 0         | 1         | 2                 |         |         |             |     |
|                                               |     |     | g ( x ) | = a + a | x + a   | x 2 + ... |           |                   |         |         |             |     |
|                                               |     |     |         | 0 1     | 2       |           |           |                   |         |         |             |     |
|                                               |     |     | ( ( ))  | 2       |         | 2         | (         |                   |         | 2 )     |             |     |
|                                               |     |     | g x     | = ( a   | + a x + | a x +     | ...)  a  | + a x             | + a x   | + ... = |             |     |
|                                               |     |     |         | 0       | 1(      | 2         |           | 0 1               | 2       |         |             |     |
|                                               |     |     |         | = a a   | + a a   | + a a     | ) x + (   | a a +             | a a +   | a a ) x | 2 + ... =   |     |
|                                               |     |     |         | 0 0     | 0       | 1 1       | 0         | 0 2               | 1 1     | 2 0     |             |     |
|                                               |     |     |         | (       |         |           |           |                   |         | ) n     |             |     |
|                                               |     |     |         | = a a   | + a     | a +       | ... + a   | a +               | a a     | x + ... | =           |     |
|                                               |     |     |         | 0       | n − 1   | 1 n − 2   | n         | − 2 1             | n − 1 0 |         |             |     |
|                                               |     |     |         | = a +   | a x +   | a x 2 +   | ... + a   | x n + ...         |         |         |             |     |
|                                               |     |     |         | 1       | 2       | 3         | n         |                   |         |         |             |     |
Nga dy barazimet e fundit marrim:
|     |     |     |     |     | x   | ( g ( x )) 2 | − g ( x | ) + 1 = 0 |     |     |     |     |
| --- | --- | --- | --- | --- | --- | ------------ | ------- | --------- | --- | --- | --- | --- |

1 1−4x
| prej ku,g(x)= |     |     | .   |     |     |     |     |     |     |     |     |     |
| ------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
2x
Meqë
|     |     |     |         |         |       | 1     |            |     | 1       |               |             |     |
| --- | --- | --- | ------- | ------- | ----- | ----- | ---------- | --- | ------- | ------------- | ----------- | --- |
|     |     |     |         |         |      |     |            |    |       |               |             |     |
|     |     |     |         | ( )     | 1    |   ( | )          |    |   (   | )             |             |     |
|     |     | 1   | − 4 x = | 1 − 4 x | =     | 2 −   | 4 x k =    | 1 + | 2       | − 4 x k =     |             |     |
|     |     |     |         |         | 2     |     |            |     |       |               |             |     |
|     |     |     |         |         |       |     |            |     |       |               |             |     |
|     |     |     |         |         | k = 0 |  k  |            | k = | 1  k  |               |             |     |
|     |     |     |         | 1       |  1   |   1 |           |  1 |        |               |             |     |
|     |     |     |         |         | −     | 1    | − 2  ... | −   | k + 1   |               |             |     |
|     |     |     |         |        |      |     |           |    |       |               |             |     |
|     |     |     |         | 2       |  2   |   2 |           |  2 |         |               |             |     |
|     |     |     | =       | 1 +    |       |       |            |     |         |  ( − 1 ) k  | 4 k  x k = |     |
k !
k = 1
|     |     |     |     |  (   | )     | ( ) k   | − 1 ( | )     |           |           |     |     |
| --- | --- | --- | --- | ----- | ----- | ------- | ----- | ----- | --------- | --------- | --- | --- |
|     |     |     |     | 2     | k − 3 | !! − 1  |  k − | 1 !   |           |           |     |     |
|     |     |     | =   | 1 +  |       |         |       |  ( − | 1 ) k  4 | k  x k = |     |     |
|     |     |     |     |       |       | (       | )     |       |           |           |     |     |
|     |     |     |     |       | 2 k   |  k ! k | − 1 ! |       |           |           |     |     |
k = 1
|     |     |     |     |  ( | )         | (     | )       |       |     |     |     |     |
| --- | --- | --- | --- | --- | --------- | ----- | ------- | ----- | --- | --- | --- | --- |
|     |     |     |     |  2 | k − 3 !! | k − 1 | !       |       |     |     |     |     |
|     |     |     | = 1 | −   |           |       |  4 k  | x k = |     |     |     |     |
|     |     |     |     |     | (         | )     |         |       |     |     |     |     |
|     |     |     |     |     | k ! k     | − 1 ! |         |       |     |     |     |     |
k = 1
|     |     |     |     |  ( |         | ) (         | )     |       |    |  2 k − 2 |   |     |
| --- | --- | --- | --- | --- | ------- | ----------- | ----- | ----- | --- | --------- | ----- | --- |
|     |     |     |     |    | 2 k − 3 | !! 2 k −   | 2 !   | k     |  1 |           | k     |     |
|     |     |     | = 1 | − 2 |         |             |  x   | = 1 − | 2   |          |  x . |     |
|     |     |     |     |     | k ( k − | 1 ) ! ( k − | 1 ) ! |       | k   |  k − 1   |       |     |

|     |     |     |     | k = 1 |     |     |     |     | k = 1 |     |     |     |
| --- | --- | --- | --- | ----- | --- | --- | --- | --- | ----- | --- | --- | --- |
Pra,
|     |     |     |     |         |        |         |     |    |      |         |     |     |
| --- | --- | --- | --- | ------- | ------- | ------- | --- | --- | ---- | ------- | --- | --- |
|     |     |     |     |         | 12k−2 |         |     | 1   | 2n |         |     |     |
|     |     |     |     | g(x)=  |        | xk−1= |     |    |    | xn .  |     |     |
|     |     |     |     |         |        |        |     |     |     |        |     |     |
|     |     |     |     |         | k      | k−1    |     | n+1 | n   |        |     |     |
|     |     |     |     | k=1     |         |         |     | n=0 |      |         |     |     |
Përfundimisht,
|     |     |     |     | 1   | 2n  | (2n)!    |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | ----- | -------- | --- | --- | --- | --- | --- | --- |
|     |     |     | a   | =   |  =  |          |     |     |     |     |     |     |
|     |     |     |     | n   |     | n!(n+1)! |     |     |     |     |     |     |
|     |     |     |     | n+1 |  n  |          |     |     |     |     |     |     |
,    për n=0,1,2,3,....

5.5.1. Ekuacionet rekurente homogjene

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica

Kujtojmë që ekuacion rekurent homogjen quajmë ekuacionin e trajtës:
|     |     |     |     | c   | a + c | a + c | a       | + ... + | c a     | = 0 , n  m   |     |     |     |
| --- | --- | --- | --- | --- | ----- | ----- | ------- | ------- | ------- | ------------- | --- | --- | --- |
|     |     |     |     | 0   | n 1   | n − 1 | 2 n − 2 |         | m n − m |               |     |     |     |
Zëvendësojmë  a = r m  dhe marrim ekuacionin karakteristik polinomial:
n
|     |             |     |               |                                         |     | m   | m − 1 | m − | 2       | .     |     |     |     |
| --- | ----------- | --- | ------------- | --------------------------------------- | --- | --- | ----- | --- | ------- | ----- | --- | --- | --- |
|     |             |     |               |                                         | c r | + c | r +   | c r | + ... + | c = 0 |     |     |     |
|     |             |     |               |                                         | 0   | 1   |       | 2   |         | m     |     |     |     |
|     | Le të jenë  |     | r1 , r ,...,r | rrënjët e këtij ekuacioni polinomial.   |     |     |       |     |         |       |     |     |     |
|     |             |     | 2             | m                                       |     |     |       |     |         |       |     |     |     |
Për zgjidhjen e përgjithshme, dallojmë:

1)  Nëse rrënjët  r1 , r ,..,r  janë të njëfishta, atëherë zgjidhja e përgjithshme kërkohet në trajtë:
2 m
                                    (16)
|     |     |                              |     |     | a = |  r n | +  r n | + ... + |  r nm |     |     |     |     |
| --- | --- | ---------------------------- | --- | --- | --- | ----- | ------- | ------- | ------ | --- | --- | --- | --- |
|     |     |                              |     |     | n   | 1 1   | 2 2     |         | m      |     |     |     |     |
ku koeficientë   -përcaktohen me ndihmën e kushteve fillestare të rekurencës.
i
2)  Nëse rrënjët r ,r ,..,r  janë të shumëfishta, me shumëfishitet përkatësisht m ,i=1,2,..,s
|     |     |     | 1   | 2 s |     |     |     |     |     |     |     | i   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
ashtu që  , atëherë zgjidhja e përgjithshme kërkohet në trajtën:  ( )  ( ) ,
|     | m   | + m | + .. + m | = m |     |     |     |     |     |     |     | a n = | a n |
| --- | --- | --- | -------- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- |
|     |     | 1 2 | s        |     |     |     |     |     |     |     |     |       | i   |
|     |     |     |          | (   |     |     |     |     |     | ) r |     |       |     |
ku                             a ( n ) =  +  n +  n 2 + ...+  n m i−1 ni , (i = 1 , 2 , ..., s )        (17)
|     |     |     | i   |     | i i1 | i   |     | i ,m | −i 1 |     |     |     |     |
| --- | --- | --- | --- | --- | ---- | --- | --- | ---- | ---- | --- | --- | --- | --- |
|     |     |     |     |     | 0    | 2   |     |      |      |     |     |     |     |

koeficientë   -përcaktohen me ndihmën e kushteve fillestare të rekurencës.
ij

Në vazhdim po japim dy nënrastet e veçanta:
1 ) Nëse rrënja r =a+bi,  është rrënjë komplekse e njëfishtë , atëherë  edhe
|     | a   |     |     | k   |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
r =r =a−bi është zgjidhje e rekurencës, prandaj  pjesa e zgjidhjes së  përgjithshme që u takon
k+1 k
| dhe  |     |    kërkohet në trajtën:   |     |     |     |     |     |     |     |     |     |     |     |
| ---- | --- | ------------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
r r
| k                               | k + 1 |     |     |         |       |             |      |     |         |                        |     |     |     |
| ------------------------------- | ----- | --- | --- | ------- | ----- | ----------- | ---- | --- | ------- | ---------------------- | --- | --- | --- |
|                                |       |     |     | n       |       |             | n    | n   |         | n ,              (18)  |     |     |     |
|                                 |       |     | ( a | + b i ) | +    | ( a − b i ) | =  | c o | s n  + |   s in n            |     |     |     |
|                                 |       |     | k   |         | k + 1 |             |      | k   |         | k + 1                  |     |     |     |
ku koeficientët   ,   janë konstante komplekse ,  ndërsa   ,    janë konstante reale.
|     |     |     | k k+1 |     |     |     |     |     |     | k k + 1 |     |     |     |
| --- | --- | --- | ----- | --- | --- | --- | --- | --- | --- | ------- | --- | --- | --- |
2 ) Nëse rrënja  ,  është rrënjë komplekse e s-fishtë , atëherë  edhe
|     | a   |     |     | r = a | + b i |     |     |     |     |     |     | r =   | r = a − b i |
| --- | --- | --- | --- | ----- | ----- | --- | --- | --- | --- | --- | --- | ----- | ----------- |
|     |     |     |     | k     |       |     |     |     |     |     |     | k + 1 | k           |
është zgjidhje e rekurencës e s-fishtë, prandaj  pjesa e zgjidhjes së  përgjithshme që u takon r dhe
k
r    kërkohet në trajtën:
k+1
,      (19)
 n c o s n  +  n  n c o s n  + ... +  n s − 1  n c o s n  +  n s in n  +  n  n s in n  + ... +  n s − 1  n s in n 
| 1                 |     | 2   |                            |     | s   |     |     | 1   |     | 2   | s   |     |     |
| ----------------- | --- | --- | -------------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| ku koeficientët  |     |     | ,  janë konstante reale.  |     |     |     |     |     |     |     |     |     |     |
i i

Shembull 5.5.1.1.  Të zgjidhet rekurenca x +ax +bx +cx =0, a,b,cR.
|     |     |     |     |     |     |     |     | n+3 |     | n+2 n+1 n |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --------- | --- | --- | --- |
Zgjidhje. Ekuacioni karakteristik është r3 +ar2 +br+c=0. Le të jenë  r1 , r , r  rrënjët e
2 3
ekuacionit, dallojmë rastet:

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
•  Nëse të tre rrënjët janë të ndryshme, pra të njëfishta, atëherë zgjidhjen e
kërkojmë:
|     |     |            |     |        |                                       |       |          | n n2       | n3                 |     |
| --- | --- | ---------- | --- | ------ | ------------------------------------- | ----- | -------- | ---------- | ------------------ | --- |
|     |     |            |     |        |                                       | x     | =  r1   | +  r      | +  r              |     |
|     |     |            |     |        |                                       |       | n 1      | 2          | 3                  |     |
|     | •   | Nëse kemi  |     | r1 = r |  r ,  atëherë zgjidhjen e kërkojmë:  |       |          |            |                    |     |
|     |     |            |     | 2      | 3                                     |       |          |            |                    |     |
|     |     |            |     |        |                                       | x =   |  r1 n + |   n     | r1 n +  r n3      |     |
|     |     |            |     |        |                                       | n     | 1        | 2          | 3                  |     |
|     | •   | Nëse kemi  |     |        | ,  atëherë zgjidhjen e kërkojmë:      |       |          |            |                    |     |
|     |     |            |     | r1 = r | = r                                   |       |          |            |                    |     |
|     |     |            |     | 2      | 3                                     |       |          |            |                    |     |
|     |     |            |     |        |                                       | x =  | r1 n +  |  n  r1 n | +   n 2  r1 n   |     |
|     |     |            |     |        |                                       | n     | 1        | 2          | 3                  |     |
•  Nëse kemi  r1  është zgjidhje reale, ndërsa  r  dhe  r komplekse, pra
|         |           |           |            |       |         |               |              | 2                                      | 3   |     |
| ------- | --------- | --------- | ---------- | ----- | ------- | ------------- | ------------ | -------------------------------------- | --- | --- |
|         |           |           |            |  dhe  |         |               |              |  rrënjë komplekse të konjuguara midis  |     |     |
| r = a + | b i =  ( | c o s  + | i s in  ) |       | r = a − | b i =  ( c o | s  − i s in |  )                                    |     |     |
| 2       |           |           |            |       | 3       |               |              |                                        |     |     |
veti, atëherë zgjidhjen e kërkojmë:
                                                                 n n n
|     |     |     |     |     |     | x =  | r1 +  |   c o s | n  +  s in n  |     |
| --- | --- | --- | --- | --- | --- | ----- | ------ | --------- | ----------------- | --- |
|     |     |     |     |     |     | n 1   | 2      |           | 3                 |     |
Shembull 5.5.1.2.  Të zgjidhet ekuacioni rekurent homogjen:
|                                           |     |     |     |  2 a − | 3 a   | + a = 0 |     |     |                         |     |
| ----------------------------------------- | --- | --- | --- | --------- | ----- | ------- | --- | --- | ----------------------- | --- |
|                                           |     |     |     | n         | n − 1 | n − 2   |     |     |                         |     |
|                                           |     |     |     | a =       | 1 , a | = 1     |     |     |                         |     |
|                                           |     |     |     | 0         | 1     |         |     |     |                         |     |
|                                           |     |     |     |           |       |         |     |     |                         |     |
Zgjidhje.
1
Zëvendësojmë  2  dhe marrim:  2 r 2 − 3 r + 1 = 0 , gjejmë rrënjët  r1 = 1 , r = , të cilat janë të
|     |     | a = | r   |     |     |     |     |     | 2   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     | n   |     |     |     |     |     |     |     | 2   |
njëfishta, pra jemi në rastin e parë  dhe zgjidhja e përgjithshme është
n
 1 
|     |     |     |     |     |     | a =  1 | n +  | .   |     |     |
| --- | --- | --- | --- | --- | --- | ------- | ----- | --- | --- | --- |
|     |     |     |     |     |     | n 1     | 2     |     |     |     |
2
 Nga kushtet fillestare  a = 1 ; a = 1 , caktojmë  ,  . Kështu, zgjidhim sistemin:
|                                  |     |     | 0   | 1    |          |         | 1 2 |      |     |     |
| -------------------------------- | --- | --- | --- | ---- | -------- | ------- | --- | ---- | --- | --- |
|                                  |     |     |     | 1= | +       |         |     |      |     |     |
|                                  |     |     |     |     | 1        | 2 1=  | +  |    | =1  |     |
|                                  |     |     |     |      |          |       | 1   | 2  | 1   |     |
|                                  |     |     |     |     |          |        |     |      |     |     |
|                                  |     |     |     | 1=  | +        | 2 2=2 | +  |    | =0  |     |
|                                  |     |     |     |     | 1        |         | 1   | 2    | 2   |     |
|                                  |     |     |     |     |          | 2       |     |      |     |     |
| Përfundimisht, zgjidhja  është a |     |     |     |      | =1, nN | .       |     |      |     |     |
n

5.5.2. Ekuacionet rekurente johomogjene

Kujtojmë që ekuacion rekurent johomogjen quajmë ekuacionin e trajtës:
|                          |     |     |       |       |         |            |       |         |                             |     |
| ------------------------ | --- | --- | ----- | ----- | ------- | ---------- | ----- | ------- | --------------------------- | --- |
|                          |     | c   | a + c | a + c | a       | + ...+ c a | = f ( | n ) , n |  m                         |     |
|                          |     | 0   | n 1   | n − 1 | 2 n − 2 | m n −      | m     |         |                        (20) |     |

ku c ,(i=0,1,2,...,m) dhe c 0janë konstante quhet relacion rekurent linear johomogjen me

| i   |     |     |     | m   |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
koeficient konstant.
| Nëse te (1) marrim  |     |     | f(n)=0, atëherë         |     |     |     |     |     |     |     |
| ------------------- | --- | --- | ----------------------- | --- | --- | --- | --- | --- | --- | --- |
                                        c a +c a +c a +...+c a =0 (21)
|     |     |     |     | 0 n | 1 n−1 | 2 n−2 | m   | n−m                            |     |     |
| --- | --- | --- | --- | --- | ----- | ----- | --- | ------------------------------ | --- | --- |
quhet rekurencë homogjene e (20).

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Rekurencën homogjene e zgjidhim sipas rregullave të  zgjidhjes së rekurencës homogjen

(shih 5.5.1.), por pa mos i caktuar koeficientët. E shënojmë me h(n).
Nëse  te  (21),  zëvendësojmë  =rm,  atëherë  rm rm−1+c rm−2 ,  do  ta  quajmë
|     |     |     | a   |     | c   | +c  |     | +...+c | =0  |
| --- | --- | --- | --- | --- | --- | --- | --- | ------ | --- |
|     |     |     |     | n   | 0   | 1   | 2   |        | m   |
ekuacion karakteristik të (20), ndërsa rrënjët e tij, do ti quajmë rrënjë karakteristike të (20) .
Zgjidhja e përgjithshme e rekurencës (20) kërkohet në trajtën:
                                                       a =h(n)+p(n)                                         (22)
n
ku p(n) është zgjidhje e pjesëshme e (20) të cilën do ta dsiktuojmë më poshtë dhe h(n) është
zgjidhja e përgjithshme e rekurencës homogjene të (20).

Zgjidhjen e pjesëshme p(n) të rekurencës (20), e marrim duke detektuar rastin konkret në një nga
nënrastet e mëposhtme:

i)  Nëse f(n)=P (n) është polinom i shkallës d sipas n –së, atëherë:
d
a)   Nëse r=1 nuk është rrënjë karakteristike e (20), atëherë zgjidhja e pjesëshme p(n),
kërkohet në formën:
|                         |     |       |     |       | n2     | nd  |     |     |     |
| ----------------------- | --- | ----- | --- | ----- | ------ | --- | --- | --- | --- |
|                         |     | p(n)= | A   | +An+A | +...+A |     |     |     |     |
|                         |     |       |     | 0 1   | 2      | d   |     |     |     |

b)  Nëse 1 është rrënjë karakteristike me shumëfishitet m, atëherë
|                        |     | (n                                           | )   | m m + 1 |             | m + d .  |     |     |     |
| ---------------------- | --- | -------------------------------------------- | --- | ------- | ----------- | -------- | --- | --- | --- |
|                        |     | p                                            | = A | n + A n | + ... + A n |          |     |     |     |
|                        |     |                                              | 0   | 1       | d           |          |     |     |     |
| Konstantet             |     | A  caktohen pasi p(n) zëvendësohet te (20).  |     |         |             |          |     |     |     |
i
| ii)  Nëse  | f ( n )                                         | = k b n  , ku k është ndonjë konstante, atëherë:   |     |     |     |     |         |            |     |
| ---------- | ----------------------------------------------- | -------------------------------------------------- | --- | --- | --- | --- | ------- | ---------- | --- |
| a)         | Nëse b nuk është rrënjë karakteristike, atëherë |                                                    |     |     |     |     | p ( n ) | = A b n .  |     |
b)  Nëse b është rrënjë karakteristike e shumëfishitetit m, atëherë  ( ) m n .
|     |     |     |     |     |     |     |     |     | p n = A n b |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----------- |
             Konstantja A njehsohet pas zëvendësimit të p(n) te (20).
iii)  Nëse  ( ) n  , ku  P (n) është polinom i shkallës d sipas n –së, atëherë
|     | f n | = P d ( n | ) b | d   |     |     |     |     |     |
| --- | --- | --------- | --- | --- | --- | --- | --- | --- | --- |
a)   Nëse b nuk është rrënjë karakteristike, atëherë:
|             |               | p ( n )                                      | = ( A | + A n + A n | 2 + ... + A | n d ) b n   |     |     |     |
| ----------- | ------------- | -------------------------------------------- | ----- | ----------- | ----------- | ----------- | --- | --- | --- |
|             |               |                                              | 0     | 1 2         |             | d           |     |     |     |
| Konstantet  |               | A  caktohen pasi p(n) zëvendësohet te (20).  |       |             |             |             |     |     |     |
i

b)  Nëse b është rrënjë karakteristike e shumëfishitetit m, atëherë
|     |                 | p ( n | ) = ( A | n m + A n m + | 1 + ... + A | n m + d ) b n .  |     |     |     |
| --- | --------------- | ----- | ------- | ------------- | ----------- | ---------------- | --- | --- | --- |
|     |                 |       |         | 0 1           | d           |                  |     |     |     |
                Konstantet A  caktohen pasi p(n) zëvendësohet te (20).
i

|     | f(n)=Kcosn apo |     |     | ( ) |     | f(n)=K |     |     |     |
| --- | --------------- | --- | --- | --- | --- | ------ | --- | --- | --- |
iv)  Nëse  f n = K s in n   apo  cosn+K sinn, ku  K, K 1  apo K 2
|     |     |     |     |     |     |     | 1   |     | 2   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
janë konstante, atëherë:
a)  Nëse r=cos+isin nuk është rrënjë karakteristike, atëherë
|     |                              |     |     | p(n)= Acosn+Bsinn  |     |     |     |     |     |
| --- | ---------------------------- | --- | --- | -------------------- | --- | --- | --- | --- | --- |

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
                      Konstantet A dhe B caktohen pasi p(n) zëvendësohet te (20).

b)  Nëse r=cos+isin është rrënjë karakteristike me shumëfishitet m, atëherë
|     |                          |     |     |     |     |     |     |     |     |     |     |     |
| --- | ------------------------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
p(n)=(Acosn+Bsinn)nm
.
Konstantet A dhe B caktohen pasi p(n) zëvendësohet te (20).

| v)  Nëse  | ( ) |     |  apo | (   | )   |     |  apo  | ( ) |     |     |     | , ku   |
| --------- | --- | --- | ---- | --- | --- | --- | ----- | --- | --- | --- | --- | ------ |
f n = P d ( n ) c o s n  f n = P d ( n ) s in n  f n = P ( n ) c o s n  + P ( n ) s in n 
|     |     |     |     |     |     |     |     |     | d 1 | d   | 2   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
është  P (n) polinom i shkallës d sipas n –së apo  ,   janë  polinome
|     | d   |     |     |     |     |     |     | P ( | n ) P | ( n ) |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- | ----- | --- | --- |
|     |     |     |     |     |     |     |     | d 1 |       | d 2   |     |     |
përkatësisht të shkallës d  dhe d  sipas n –së ku d=max{d ,d }, atëherë:
|     |      |             | 1                                          |     | 2   |     |     | 1   | 2   |     |     |     |
| --- | ---- | ----------- | ------------------------------------------ | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| a)  | Nëse |             |  nuk është rrënjë karakteristike, atëherë  |     |     |     |     |     |     |     |     |     |
|     | r =  | c o s  + i | s in                                      |     |     |     |     |     |     |     |     |     |
|     |      |             |                                            | 2   |     | d   |     |     | 2   |     | d   |     |
p ( n ) = ( A 0 + A 1 n + A 2 n + ... + A d n ) s in n  + ( B 0 + B 1 n + B 2 n + ... + B d n ) c o s n 
                 Konstantet A dhe B caktohen pasi p(n) zëvendësohet te (20).
|     |     | i i |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

b)  nëse r = c o s  + i s in   është rrënjë karakteristike me shumëfishitet m, atëherë
p ( n ) = n m ( A + A n + A n 2 + ... + A n d ) s in n  + n m ( B + B n + B n 2 + ... + B n d ) c o s n 
|     |     | 0   | 1   | 2   |     | d   |     | 0 1 | 2   |     | d   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
                 Konstantet A dhe B caktohen pasi p(n) zëvendësohet te (20).
|            |       | i i         |           |           |             |             |               |           |     |     |     |     |
| ---------- | ----- | ----------- | --------- | --------- | ----------- | ----------- | ------------- | --------- | --- | --- | --- | --- |
|            | ( )   | n           |           |           | ( )         |             | n             |           |     |     |     |     |
| vi)  Nëse  | f n = | P ( n )  b |  c o s n |   apo    | f n =       | P ( n )  b |  s in n     |  apo      |     |     |     |     |
|            |       | d           |           |           |             | d           |               |           |     |     |     |     |
|            |       | f           | ( n ) = P | ( n )  b | n  c o s n |  + P (     | n )  b n  s | in n  ,  |     |     |     |     |
|            |       |             | d         |           |             | d           |               |           |     |     |     |     |
|            |       |             |           | 1         |             | 2           |               |           |     |     |     |     |
ku  është  P (n) polinom i shkallës d sipas n –së apo  P ( n ) ,  P ( n )  janë  polinome
|     | d   |     |     |     |     |     |     | d   |     | d   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     |     | 1   |     | 2   |     |     |
përkatësisht të shkallës d  dhe d  sipas n –së ku d=max{ d ,d }, atëherë:
|             |             |             | 1                                          | 2   |     |     |     | 1   | 2   |     |     |     |
| ----------- | ----------- | ----------- | ------------------------------------------ | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|             | r = b  ( c | o s  + i s | in  )                                     |     |     |     |     |     |     |     |     |     |
| a)    Nëse  |             |             |  nuk është rrënjë karakteristike, atëherë  |     |     |     |     |     |     |     |     |     |
p(n)=bn[(A +An+A n2 +...+A nd)sinn+(B +Bn+B n2 +...+B nd)cosn]
|     |     | 0   | 1   | 2   | d   |     | 0   | 1   | 2   | d   |     | .   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Konstantet A dhe B caktohen pasi p(n) zëvendësohet te (20).
|     |     | i   | i   |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
b) Nëse  është rrënjë karakteristike me shumëfishitet m, atëherë
|     | r = | b  ( c o s  | + i s in  | )   |     |     |     |     |     |     |     |     |
| --- | --- | ------------- | ---------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     | m n |               |            | 2   |     | d   | m   | n   |     | 2   |     | d   |
p ( n ) = n  b  ( A + A n + A n + ... + A n ) s in n  + n  b  ( B + B n + B n + ... + B n ) c o s n 
|     |     | 0   | 1   | 2   | d   |     |     | 0   | 1   | 2   | d   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Konstantet A dhe B caktohen pasi p(n) zëvendësohet te (20).
|     |     | i   | i   |     |     |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

vii)  Nëse  pjesa  johomogjene  f ( n ) = f1 ( n ) + f ( n ) + ... + f ( n ) ,  atëherë  kësaj  i  përgjigjet
|     |     |     |     |     |     | 2   |     | s   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
zgjidhja e pjesshme p(n)= p (n)+ p (n)+...+ p (n), ku p (n) është zgjidhje e pjesshme e
|     |     |     |     | 1   | 2   |     | s   | i   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(n), për i=1,2,..,s, e që gjendet në bazë të rasteve të mësipërme.
f
i

Shembull 5.5.2.1. Të njehsohet 12+22+32+...+n2.
| Zgjidhje. Shënojmë   |     | a   |  1 2 + | 2 2 + 3 2 | + ...+ ( | n − 1 ) 2 + | n 2 .  |     |     |     |     |     |
| -------------------- | --- | --- | ------- | --------- | -------- | ----------- | ------ | --- | --- | --- | --- | --- |
n
Marrim kështu ekuacionin rekurent johomogjen:
|     |     |     |     | a | =a  | +n2 |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     | n   | n−1 |     |     |     |     |     |     |

|     |     |     |     | a | =0  |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
0

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Gjejmë zgjidhjet h(n) dhe p(n).
Për f ( n ) = n 2 = 0 , marrim a
n
= a
n − 1
, a
n
− a
n − 1
= 0 . Zëvendësojmë a
n
= r dhe marrim r-1=0
Pra, kemi r = 1, (shumëfishiteti m = 1). Prandaj , h(n)=crn =c1n =c
Nga rasti i), pika b), meqë 1 është rrënjë karakteristike atëherë:
p ( n ) = A
0
n 1 + A
1
n 2 + A
2
n 3 .
Pas zëvendësimit të p(n) në ekuacionin rekurent, marrim:
p ( n ) = p ( n − 1 ) + n 2
A
0
n 1 +
=
=
=
A
A
A
( −
n
1
n
0
n
0
A
2
−
−
0
+
+
A
A
A
0
0
A
n
2
+
+
−
1
3 = A
0
(
2 A n
1
2 A n −
1
) A +
2
(
−
(
) n − 1 +
2 n + 1
2 A n +
1
A − 2
0
)
A
A
+
A
1
( n
1
A
2
+
1
+ 3
−(n
A
A
) 2 1
3 −
3 n
2
)n
2
+
3
−
+
( A n
2
2 n + 3
3 A n
2
( A −
1
−
n
2
3
1
−
+
A
)3
1
3
2
+)
+
A
+
2 n
2 n
n −
2
) 2 1 n
=
A
+
2
A
+
2
n
n
2
3
=
Krahasojmë koeficientët në të dy anët dhe formojmë sistemin:
 −
A
A
A
0
1
0
−
−
+
2
3
A
1
A
1
A
2
+
+
+
3
1
A
A
=
=
2
=
2
A
1
0
A
0
1 1 1
me zgjidhjen e të cilit merren: A = ;A = ;A = .
0 6 1 2 2 3
Nga a =h(n)+p(n)dhe nga kushti fillestar
n
a
0
= 0 kemi:
a
0
= c + p (0 )
0 = c + A
0
 0 + A
1
 0 + A
2
 0 , c = 0 .
Prandaj a
n
= p (n ) .
Përfundimisht kemi:
a
n
=
1
6
n +
1
2
n 2 +
1
3
n 3 =
n ( n + )( 1
6
n + 2 )
.
Shembull 5.5.2.2. Të zgjidhet ekuacioni rekurent johomogjene:
a =2a +3a +3n
n n−1 n−2

a
0
=0;a
1
=1
Zgjidhje. Vendosim f ( n ) = 3 n = 0 dhe marrim ekuacionin homogjen:
a
n
− 2 a
n − 1
− 3 a
n − 2
= 0
Zëvendësojmë a =r2, dhe marrim:
n
r2 −2r−3=0
2 4+12 24
r = = ;r =3;r =−1.
1,2 2 2 1 2
Prandaj zgjidhja homogjen është h(n)=c 3n+c (−1)n
1 2
Meqë f(n)=3n , pra b = 3 dhe 3 është rrënjë karakteristike me shumëfishitet 1, prandaj
p(n)=c n3n
3

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
| Vendosim te zgjidhja e përgjithshme  |     |     | a   | = h ( n ) + p ( n ) dhe marrrim:  |     |     |
| ------------------------------------ | --- | --- | --- | --------------------------------- | --- | --- |
n

|     |     |     | a = | c  3 n + c ( − 1 ) n | + c  n  3 n |     |
| --- | --- | --- | --- | --------------------- | ------------- | --- |
|     |     |     | n   | 1 2                   | 3             |     |
Nga a =0kemi:
0
|     |     |     |     | 0 ( )0          | 0         |     |
| --- | --- | --- | --- | --------------- | --------- | --- |
|     |     |     | 0 = | c  3 + c − 1 + | c  0  3 |     |
|     |     |     |     | 1 2             | 3         |     |
c +c =0
1 2
| Nga   a    | = 1 merret  |             |               |                     |              |     |
| ---------- | ----------- | ----------- | ------------- | ------------------- | ------------ | --- |
| 1          |             |             |               |                     |              |     |
|            |             |             |               | 1=c 3−c +3c        |              |     |
|            |             |             |               | 1 2                 | 3            |     |
| Njehsojmë  | a = 2 a +   | 3 a + 3 2 = | 2  1 + 3  0 | + 9 = 1 1 , prandaj |              |     |
|            | 2 1         | 0           |               |                     |              |     |
|            |             |             |               | 1 1 = 9 c 1 + c 2 + | 1 8 c 3      |     |
Formojmë sistemin
|     |     |     |     |  c + c = 0 |     |     |
| --- | --- | --- | --- | --------------- | --- | --- |
1 2
|                                             |     |     |       | c  3 − c + 3 c | = 1             |     |
| ------------------------------------------- | --- | --- | ----- | --------------- | --------------- | --- |
|                                             |     |     |       | 1 2             | 3               |     |
|                                             |     |     |       | 9 c + c + 1 8 c | = 1 1           |     |
|                                             |     |     |       | 1 2 3           |                 |     |
|                                             |     |     |       | 5 5             | 3               |     |
| Pas zgjidhjes së  sistemit, merren:         |     |     | c = − | ; c = ; c       | =               |     |
|                                             |     |     | 1     | 1 6 2 1 6 3     | 4               |     |
|                                             |     |     |       |                 |                 |     |
|                                             |     |     |       | 5 5             | 3               |     |
| Përfundimisht:                              |     |     | a = − |  3 n + ( − 1 ) | n +  n  3 n . |     |
n
|     |     |     |     | 1 6 1 6 | 4   |     |
| --- | --- | --- | --- | ------- | --- | --- |

5.6. Detyra për përgatitje
5.6.1. Tё gjendet funksioni gjenerues i vargut 3,1,3,1,3,1 …
Zgjidhje. Vargun e dhёnё e shkruajmё si shumё tё dy vargjeve:
|     |     |     |     | (𝑎 𝑛 ): 1,1,1,1,….. (1)  |     |     |
| --- | --- | --- | --- | ------------------------ | --- | --- |
|     |     |     |     | (𝑏 ): 2,0,2,0,….. (2)    |     |     |
𝑛
1
Siç dimё  vargu 1,1,1,1.. nё bazё tё pёrkufizimit ka kёtё funksion gjenerues  f(x) =   , ndërsa
1−𝑥
vargun (2) e rishkruajmë si  2,0,2,0,2,0 … = 2∙ (1,0,1,0,1,0…) dhe nga përkufizimi i funksionit
gjenerues kemi:
 𝑔(𝑥)= 2∙(1+0∙𝑥+ 𝑥2+0∙ 𝑥3+ 𝑥4+ 0∙𝑥5+𝑥6….) =  2∙(1+𝑥2+ 𝑥4+𝑥6….) =
| 1     | 2      |     |     |     |     |     |
| ----- | ------ | --- | --- | --- | --- | --- |
|  = 2∙ |  =  .  |     |     |     |     |     |
| 1−𝑥2  | 1−𝑥2   |     |     |     |     |     |
Kështu vargu i dhënë ka kёtё funksion gjenerues:
|     |       |               |     | 1 2  | (1+𝑥)+2 | 𝑥+3  |
| --- | ----- | ------------- | --- | ---- | ------- | ---- |
|     | ℎ(𝑥)= |  𝑓(𝑥)+ 𝑔(𝑥)=  |     | +    | =       | =    |
|     |       |               |     | 1−𝑥2 | 1−𝑥2    | 1−𝑥2 |
1−𝑥
5.6.2.  Tё gjendet funksioni gjenerues i vargut 2,1,2,1,2,1 …

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Zgjidhje.  Veprojmë në tё njejtёn mёnyrё si në detyrёn paraprake:
| ):    1,1,1,1,…,kemi:  𝑓(𝑥)= (1+𝑥+ 𝑥2+ 𝑥3+ 𝑥4+ 𝑥5+𝑥6….) =  |     |     |     |     |     |     |     | 1   |     |
| ---------------------------------------------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Për (𝑎       (1)
| 𝑛   |     |     |     |     |     |     |     | 1−𝑥 |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1,0,1,0,…,kemi:𝑔(𝑥)= (1+0∙𝑥+ 𝑥2+0∙ 𝑥3+ 𝑥4+ 0∙𝑥5+𝑥6….)
| Për (𝑏 𝑛 )= |     |     |     |     |     |     |     |     | =   |
| ----------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
1
= (1+𝑥2+ 𝑥4+𝑥6….)=                                                                                    (2)
1−𝑥2
Kështu, funksioni gjenerues i vargut 2,1,2,1,2,1 …, është:
|           |                 |     | 1   | 1    |     | (1+𝑥)+1 |     | 𝑥+2  |     |
| --------- | --------------- | --- | --- | ---- | --- | ------- | --- | ---- | --- |
|      ℎ(𝑥) | =  𝑓(𝑥)+ 𝑔(𝑥)=  |     | +   |      | =   |         | =   |      |     |
|           |                 |     | 1−𝑥 | 1−𝑥2 |     | 1−𝑥2    |     | 1−𝑥2 |     |
5.6.3.  Tё gjendet funksioni gjenerues i vargut 4,3,4,3,4,3 …
Zgjidhje. Veprojmë në tё njejtёn mёnyrё si në detyrat paraprake:
|     |     |     |     |     |     |     |     | 1   | 3   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
(𝑎 ): 3,3,3,3,3…,kemi: 𝑓(𝑥)=  3∙(1+𝑥+ 𝑥2+ 𝑥3+ 𝑥4+ 𝑥5+𝑥6….) = 3∙( ) =
𝑛
|     |     |     |     |     |     |     |     | 1−𝑥 | 1−𝑥 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
= (1+0∙𝑥+ 𝑥2+0∙ 𝑥3+ 𝑥4+0∙𝑥5+𝑥6….)=
(𝑏 ): 1,0,1,0,…,kemi: 𝑔(𝑥)
𝑛
1
= 1+𝑥2+ 𝑥4+𝑥6….=
1−𝑥2
Kështu, vargu 4,3,4,3,4,3 … ka këtë funksion gjenerues:
|      |              |     | 3    | 1   | 3(1+𝑥)+1 | 3+3𝑥+1 |      | 3𝑥+4 |     |
| ---- | ------------ | --- | ---- | --- | -------- | ------ | ---- | ---- | --- |
| ℎ(𝑥) | = 𝑓(𝑥)+ 𝑔(𝑥) | =   | +    | =   |          | =      |  =   |      |     |
|      |              |     | 1−𝑥2 |     | 1−𝑥2     |        | 1−𝑥2 | 1−𝑥2 |     |
1−𝑥
5.6.4.  Tё gjendet funksioni gjenerues i vargut 2,4,1,1,1,1,1, …
Zgjidhje. Duke u bazuar në përkufizimin e funksionit gjenerues, kemi:
(2∙𝑥0+4∙𝑥1+ 𝑥2+ 𝑥3+ 𝑥4+ 𝑥5+𝑥6….)
|     |  𝑓(𝑥) = |     |     |     |     |     |     |     |     |
| --- | ------- | --- | --- | --- | --- | --- | --- | --- | --- |
E ndajmë, si më poshtë:
                     𝑓(𝑥)= ((1+1)+(3∙𝑥+𝑥)+ 𝑥2+ 𝑥3+𝑥4+ 𝑥5+𝑥6….)
1
| = (1+𝑥+𝑥2+𝑥3+𝑥4+𝑥5+𝑥6+⋯)+(1+3𝑥)= |     |     |     |     |     |     |     | +(1+3𝑥)  |     |
| -------------------------------- | --- | --- | --- | --- | --- | --- | --- | -------- | --- |
1−𝑥
Përfundimisht,
|      |              |     | 1+(1−𝑥)∙(1+3𝑥) |     | 1+1+3𝑥−𝑥−3𝑥2 |     |     | −3𝑥2+2𝑥+2 |     |
| ---- | ------------ | --- | -------------- | --- | ------------ | --- | --- | --------- | --- |
| 𝑓(𝑥) | =  1 +  1+3𝑥 | =   |                |     | =            |     |  =  |           |     |
|      | 1−𝑥          |     | 1−𝑥            |     |              | 1−𝑥 |     | 1−𝑥       |     |

5.6.5.  Tё gjendet funksioni gjenerues i vargut 2,4,7,2,1,1,1,1,1, …

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
−𝑥4−5𝑥3+3𝑥2+2𝑥+2
|     |     |     |     |     |     |     |     | [Rez: 𝑓(𝑥) |     | =   |     | ]   |
| --- | --- | --- | --- | --- | --- | --- | --- | ---------- | --- | --- | --- | --- |
1−𝑥
5.6.6.  Tё gjendet funksioni gjenerues i vargut 0,0,0,5,3,5,3,5,3,5,3 …
Zgjidhje.Nё bazё tё vetisё sё mbledhjes dhe vetisë së traslacionit
| Për vargun (𝑎 |     | ):  |     |     |     |     |     |     |     |     |     |     |
| ------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
𝑛
|     |     | (𝑎  | ):  0,0,0,3,3,3,3,3,3,….= |     |     | 3∙(0,0,0,1,1,1,1,1,1,1,…),  |     |     |     |     |     |     |
| --- | --- | --- | ------------------------- | --- | --- | --------------------------- | --- | --- | --- | --- | --- | --- |
𝑛
3𝑥3
| kemi:  𝑓(𝑥)=3∙𝑥3(1+𝑥+𝑥2+𝑥3+𝑥4+⋯) = |     |     |     |     |     | 3∙𝑥3( | 1   |          |     |     |     |     |
| ---------------------------------- | --- | --- | --- | --- | --- | ----- | --- | -------- | --- | --- | --- | --- |
|                                    |     |     |     |     |     |       | )=  |          |     |     |     |     |
|                                    |     |     |     |     |     |       | 1−𝑥 | 1−𝑥      |     |     |     |     |
| Për vargun (𝑏                      |     | ):  |     |     |     |       |     |          |     |     |     |     |
𝑛
|     |     |     | (𝑏 )= | 0,0,0,2,0,2,0,2,….. = 2(0,0,0,1,0,1,0,1,0,1,…).  |     |     |     |     |     |     |     |     |
| --- | --- | --- | ----- | ------------------------------------------------ | --- | --- | --- | --- | --- | --- | --- | --- |
𝑛
2𝑥3
| kemi: g(x)= |     |  2∙𝑥3∙(1+𝑥2+𝑥4+⋯) = |     |     | 2∙𝑥3∙( |      | 1 )= |    .        |     |     |     |     |
| ----------- | --- | ------------------- | --- | --- | ------ | ---- | ---- | ----------- | --- | --- | --- | --- |
|             |     |                     |     |     |        | 1−𝑥2 | 1−𝑥2 |             |     |     |     |     |
Kështu, vargu  0,0,0,5,3,5,3,5,3,5,3 … , ka këtë funksion gjenerues:
|     |      |               |     | 3𝑥3 | 2𝑥3  | 3𝑥3(1+𝑥)+2𝑥3  |      |     | 3𝑥3+3𝑥4+2𝑥3  |     | 3𝑥4+5𝑥3  |     |
| --- | ---- | ------------- | --- | --- | ---- | ------------- | ---- | --- | ------------ | --- | -------- | --- |
|     | ℎ(𝑥) | =  𝑓(𝑥)+ 𝑔(𝑥) |     | =   | +    | =             |      | =   |              |     |  = .     |     |
|     |      |               |     | 1−𝑥 | 1−𝑥2 |               | 1−𝑥2 |     | 1−𝑥2         |     | 1−𝑥2     |     |

5.6.7.  Tё gjendet funksioni gjenerues i vargut 0,0,0,0,0,0,3,2,3,2,3,2 …
2𝑥7+3𝑥6
|     |     |     |     |     |     |     |     |     |     | [Rez: 𝑓(𝑥) | =   | ]   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---------- | --- | --- |
1−𝑥2
5.6.8.   Tё gjendet funksioni gjenerues i vargut 0,2,0,4,0,6,0,8, …
Zgjidhje. Nga përkufizimi i funksionit gjenerues dhe rregulla e derivimit,  kemi:
| 𝑓(𝑥)= | 0+2𝑥+0𝑥2+4𝑥3+0 𝑥4+6𝑥5+0𝑥6+8𝑥7 |     |     |     |     |     | = 2𝑥+4𝑥3+6𝑥5+8𝑥7 |     |     |     | =   |     |
| ----- | ----------------------------- | --- | --- | --- | --- | --- | ---------------- | --- | --- | --- | --- | --- |
1
|     |     | = (𝑥2+𝑥4+𝑥6+ 𝑥8+⋯)′ |     |     | =   | [𝑥2 (1+𝑥2+𝑥4+ 𝑥6+⋯)]′ |     |     |     | =   | [𝑥2 ( | )]′ = |
| --- | --- | ------------------- | --- | --- | --- | --------------------- | --- | --- | --- | --- | ----- | ----- |
(1−𝑥)2
|     |     | (𝑥2)′(1−𝑥2)−𝑥2 (1−𝑥2)′ |     |     |     | 2𝑥(1−𝑥2)−𝑥2(−2𝑥) |     |     |     |     |     |     |
| --- | --- | ---------------------- | --- | --- | --- | ---------------- | --- | --- | --- | --- | --- | --- |
2𝑥

|     |     | =   |         |     |     | =   |         |     |     | =       |     |     |
| --- | --- | --- | ------- | --- | --- | --- | ------- | --- | --- | ------- | --- | --- |
|     |     |     | (1−𝑥2)2 |     |     |     | (1−𝑥2)2 |     |     | (1−𝑥2)2 |     |     |
5.6.9.  Tё caktohet funksioni gjenerues i vargut 0,0,0,0,1,2,3,4, …
𝑥4
|     |     |     |     |     |     |     |     |     |     | [Rez: 𝑓(𝑥) |     | = ]  |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---------- | --- | ---- |
(1−𝑥)2
5.6.10.  Tё gjendet funksioni gjenerues i vargut  0,−2,−2,− 8 ,−4, …
3
Zgjidhje. Nga përkufizimi i funksionit gjenerues dhe rregulla e integrimit,  kemi:

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
|       |                         |     | 8                   |     |                          | 8   |              |     |     |     |
| ----- | ----------------------- | --- | ------------------- | --- | ------------------------ | --- | ------------ | --- | --- | --- |
| 𝑓(𝑥)= | 0𝑥0−2𝑥1−2𝑥2−            |     | 𝑥3−4 𝑥4+⋯=−2𝑥1−2𝑥2− |     |                          |     | 𝑥3−4𝑥4+⋯ =   |     |     |     |
|       |                         |     | 3                   |     |                          | 3   |              |     |     |     |
|       | 𝑥                       |     |                     |     |                          | 𝑥   |              |     |     |     |
|       | = ∫(−2−4𝑥−8𝑥2−16𝑥3+⋯)𝑑𝑥 |     |                     |     | = ∫−2 (1+2𝑥+4𝑥2+8𝑥3+⋯)𝑑𝑥 |     |              |     |     | =   |
|       | 0                       |     |                     |     | 0                        |     |              |     |     |     |
𝑥
−2
|     |     |     |     | =   | ∫   |  𝑑𝑥  |     |     |     |     |
| --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- |
1−2𝑥
0
| Zёvendёsojmё me 𝑢 |     | = 1−2𝑥 dhe  𝑑𝑢 |     | = −2 𝑑𝑥, fitojmё:  |     |     |     |     |     |     |
| ----------------- | --- | -------------- | --- | ------------------ | --- | --- | --- | --- | --- | --- |
𝑑𝑢
|     |     |     | 𝑓(𝑥)= | ∫   | = ln|𝑢| | = ln|1−2𝑥|    |     |     |     |     |
| --- | --- | --- | ----- | --- | ------- | ------------- | --- | --- | --- | --- |
𝑢
| 5.6.11. Tё gjendet funksioni gjenerues i vargut  0,1, |     |     |     |     |     | 1 1 1 , …   |     |     |     |     |
| ----------------------------------------------------- | --- | --- | --- | --- | --- | ----------- | --- | --- | --- | --- |
, ,
|     |     |     |     |     |     | 2 3 4 |     |     |     |     |
| --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- |
Zgjidhje. Nga përkufizimi i funksionit gjenerues dhe rregulla e integrimit,  kemi:
|                   |           | 𝑥2            | 𝑥3 𝑥4 | 𝑥                  |                         |     |     |     | 𝑥 1   |     |
| ----------------- | --------- | ------------- | ----- | ------------------ | ----------------------- | --- | --- | --- | ----- | --- |
|                   | 𝑓(𝑥)= 𝑥+  |               | + +   | +⋯=∫               | (1+ 𝑥+𝑥2+𝑥3+𝑥4+⋯ )𝑑𝑥 =∫ |     |     |     |       | 𝑑𝑥  |
|                   |           |               | 2 3 4 | 0                  |                         |     |     |     | 0 1−𝑥 |     |
| Zёvendёsojmё me 𝑢 |           | = 1−𝑥 dhe  𝑑𝑢 |       | = −1 𝑑𝑥, fitojmё:  |                         |     |     |     |       |     |
𝑑𝑢
|     |     |     | 𝑓(𝑥)= |     | − ln|𝑢| | =− ln|1−𝑥|    |     |     |     |     |
| --- | --- | --- | ----- | --- | ------- | ------------- | --- | --- | --- | --- |
∫− =
𝑢
1
5.6.12.  Të gjendet vargu i numrave, i cili për funksion gjenerues ka  𝑓(𝑥) =   .
(1+2𝑥)3
Zgjidhje.Duke pёrdorur formulёn e teoremёs binomiale tё zgjeruar mund të pёrcaktojmё edhe
vargun përkatës. Pra, nga
|     |     |         |      | 𝑛    |            | 𝑛   |     |        |     |     |
| --- | --- | ------- | ---- | ---- | ---------- | --- | --- | ------ | --- | --- |
|     |     |         |      | −𝑛   |            |     | 𝑘   |        |     |     |
|     |     | (1+𝑥)−𝑛 | = ∑( | ) 𝑥𝑘 | = ∑(−1)𝑘 ( |     |     | )  𝑥𝑘  |     |     |
𝑘
𝑛+𝑘−1
|     |     |     |     | 𝑘=0 |     | 𝑘=0 |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
kemi:
𝑛
𝑘
|     |                                 (1+2𝑥)−3 |     |     | = ∑(−1)𝑘 ( |     |     | )  (2𝑥)𝑘 | =   |     |     |
| --- | ---------------------------------------- | --- | --- | ---------- | --- | --- | -------- | --- | --- | --- |
3+𝑘−1
𝑘=0
|     |     |     | 𝑛               |     |     | 𝑛                |     |     |          |     |
| --- | --- | --- | --------------- | --- | --- | ---------------- | --- | --- | -------- | --- |
|     |     |     |                 |     | 𝑘   |                  |     |     | 𝑘        |     |
|     |     |     | ∑(−1)𝑘 (2𝑥)𝑘  ( |     |     | = ∑(−1)𝑘(2)𝑘   ( |     |     | )𝑥𝑘      |     |
|     |     |     | =               |     |     | )                |     |     |          |     |
|     |     |     |                 |     | 𝑘+2 |                  |     |     | 𝑘+2      |     |
|     |     |     | 𝑘=0             |     |     | 𝑘=0              |     |     |          |     |
Shohim që anëtari i përgjithshëm i vargut është:
𝑘
|     |     |     | 𝑎   (−1)𝑘 (2)𝑘  ( |     |     | ),  𝑘 = | 0,1,2,3….  |     |     |     |
| --- | --- | --- | ----------------- | --- | --- | ------- | ---------- | --- | --- | --- |
|     |     |     | 𝑘=                |     | 𝑘+2 |         |            |     |     |     |

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Pёr k=0,  marrim anëtarin e parё tё vargut:
0
|     |     |     | 𝑎   (−1)0 20  ( |     | ) =1  |     |
| --- | --- | --- | --------------- | --- | ----- | --- |
|     |     |     | 0=              |     | 0+2   |     |
Anëtari i dytё i vargut merret për k=1:
1
|     |     |     | 𝑎   (−1)1 21 ( |     | )= −6  |     |
| --- | --- | --- | -------------- | --- | ------ | --- |
|     |     |     | 1=             | 1+2 |        |     |
Anëtari i tretё i vargut merret për k=2:
2
|     |     |     | 𝑎   (−1)2 22  ( |     | )= 24  |     |
| --- | --- | --- | --------------- | --- | ------ | --- |
|     |     |     | 2=              | 2+2 |        |     |
Anëtari i katёrt i vargut merret për k=3:
3
|     |     |     | 𝑎   (−1)3 23  ( |     | )= −80 …  |     |
| --- | --- | --- | --------------- | --- | --------- | --- |
|     |     |     | 3=              | 3+2 |           |     |
Kështu, vargu i kërkuar është: 1,−6 ,24 ,−80 ,…
1
5.6.13.  Të gjendet vargu i numrave, i cili për funksion gjenerues ka (𝑥) =   .
(1−𝑥)3
Zgjidhje. Veprojmё ngjashёm si nё detyrёn paraprake dhe marrim:
|     |         | 𝑛           |       |          | 𝑛                 |        |
| --- | ------- | ----------- | ----- | -------- | ----------------- | ------ |
|     |         |             |       | 𝑘        |                   | 𝑘      |
|     | (1−𝑥)−3 | = ∑(−1)𝑘  ( |       | )  (−𝑥)𝑘 | = ∑(−1)𝑘 (−𝑥)𝑘  ( | ) =    |
|     |         |             | 3+𝑘−1 |          | 𝑘+2               |        |
|     |         | 𝑘=0         |       |          | 𝑘=0               |        |
𝑘 𝑘
                       = ∑𝑛 (−1)𝑘 (−1)𝑘 (𝑥)𝑘  ( )  = ∑𝑛  (−1)2𝑘  (𝑥)𝑘  ( )  =
|     | 𝑘=0 |     |     | 𝑘=0 |     |     |
| --- | --- | --- | --- | --- | --- | --- |
𝑘+2 𝑘+2
𝑛
𝑘
|     |     |     | =   | ∑𝑥𝑘  ( | )    |     |
| --- | --- | --- | --- | ------ | ---- | --- |
𝑘+2
𝑘=0
Anëtarët e vargut i gjenerojmë nga anëtari i përgjithshëm:
𝑘
|     |     |     | 𝑎  ( | ), 𝑘 | = 0,1,2,3….  |     |
| --- | --- | --- | ---- | ---- | ------------ | --- |
𝑘=  𝑘+2
0
| Pёr k = 0, marrim: 𝑎 |     | (       | )= 1.  |     |     |     |
| -------------------- | --- | ------- | ------ | --- | --- | --- |
|                      |     | 0=  0+2 |        |     |     |     |
1
| Për k = 1, marrim: 𝑎 |     |       | 3.  |     |     |     |
| -------------------- | --- | ----- | --- | --- | --- | --- |
|                      |     | 1=  ( | )=  |     |     |     |
1+2
2
| Për k = 2, marrim: 𝑎 |     | (   | )= 12.  |     |     |     |
| -------------------- | --- | --- | ------- | --- | --- | --- |
2=
2+2
3
| Për k=3, marrim:𝑎 |     | ( )= | 20…..  |     |     |     |
| ----------------- | --- | ---- | ------ | --- | --- | --- |
3=
3+2

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Kështu, vargu i kërkuar ёshtё : 1, 3, 12, 20,…..
5.6.14.  Të gjendet vargu i numrave, i cili për funksion gjenerues ka 𝑓(𝑥) 1
|     |     |     |     |     |     |     |     |     | = .  |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ---- |
(1+2𝑥)4
[Rez: Vargu i kërkuar është: 1, -8, 240, -960,…]
5.6.15. Tё zgjidhet rekurenca:
|     |     |     | 𝑎   | = 2𝑎 +3𝑎 |            |     |      |     |     |
| --- | --- | --- | --- | -------- | ---------- | --- | ---- | --- | --- |
|     |     |     | 𝑛   | 𝑛−1      | 𝑛−2 ,   𝑛  |     | ≥ 2  |     |     |
{
|     |     |     | 𝑎   | = 1,   𝑎 = | 3      |     |     |     |     |
| --- | --- | --- | --- | ---------- | ------ | --- | --- | --- | --- |
|     |     |     |     | 0 1        |        |     |     |     |     |

Zgjidhje.Në rekurencёn e dhёnё zëvendësojmë 𝑎 = 𝑡2 dhe marrim 𝑡2 = 2𝑡+3, nga ku
𝑛
|                                           |     |     |     | 𝑡2−2𝑡−3 | =0  |           |          |     |     |
| ----------------------------------------- | --- | --- | --- | ------- | --- | --------- | -------- | --- | --- |
| E zgjidhim barazimin katror dhe marrim: 𝑡 |     |     |     |         |     | = 3 dhe 𝑡 | = −1.    |     |     |
|                                           |     |     |     |         | 1   |           | 2        |     |     |
Kështu, zgjidhjen e përgjithshme e kërkojmë në formën
|     |     |     |     |     | 𝑎   | = 𝑐 (3)𝑛+𝑐 | (−1)𝑛  |     |     |
| --- | --- | --- | --- | --- | --- | ---------- | ------ | --- | --- |
|     |     |     |     |     | 𝑛   | 1          | 2      |     |     |
Duke u nisur nga kushtet fillestare të rekurencës, njehsojmë  𝑐 ,𝑐
1 2
|     |     |     |     | (3)0+𝑐 | (−1)0 = 𝑐 |     |     |     |     |
| --- | --- | --- | --- | ------ | --------- | --- | --- | --- | --- |
Nga 𝑛 = 0,   𝑎 = 1 , marrim 1 = 𝑐 +𝑐  dhe nga  𝑛 = 1,   𝑎 =  3, marrim:
|                                         | 0   |            |      | 1               | 2                    |     | 1 2         |     | 1   |
| --------------------------------------- | --- | ---------- | ---- | --------------- | -------------------- | --- | ----------- | --- | --- |
| 3 = 𝑐 (3)1+𝑐                            |     | (−1)1 =3 𝑐 |      | −𝑐              |                      |     |             |     |     |
| 1                                       | 2   |            | 1    | 2               |                      |     |             |     |     |
|                                         |     |            | 𝑐 +𝑐 | = 1             |                      |     |             |     |     |
| Formojmë sistemin: {                    |     |            | 1    | 2  dhe marrim 𝑐 |                      |     | = 1,𝑐 = 0.  |     |     |
|                                         |     |            | 3 𝑐  | −𝑐 = 3          |                      | 1   | 2           |     |     |
|                                         |     |            | 1    | 2               |                      |     |             |     |     |
| Kështu, zgjidhja e rekurencës është:  𝑎 |     |            |      |                 | = 1∙(3)𝑛+0∙(−1)𝑛=3𝑛  |     |             |     |     |
𝑛
5.6.16. Tё zgjidhet rekurenca:
|     |     |     |     | 𝑎   | = 6𝑎 | −11𝑎 | +6𝑎    |     |     |
| --- | --- | --- | --- | --- | ---- | ---- | ------ | --- | --- |
|     |     |     |     | 𝑛+3 |      | 𝑛+2  | 𝑛+1 𝑛  |     |     |
{
|     |     |     |     | 𝑎   | = 2,   𝑎 | = 0, | 𝑎 = −2      |     |     |
| --- | --- | --- | --- | --- | -------- | ---- | ----------- | --- | --- |
|     |     |     |     | 0   | 1        |      | 2           |     |     |

Zgjidhje. Zëvendësojmë  𝑎 = 𝑡3  dhe marrim:  𝑡3 = 6𝑡2−11𝑡1+6. Prej ku:
𝑛+3
| 𝑡3−6𝑡2+11𝑡−6                    |     | =   | 0 𝑡3 | −6𝑡2+5𝑡+6𝑡−6                 |     | =   | 0                   |     |      |
| ------------------------------- | --- | --- | ----- | ---------------------------- | --- | --- | -------------------- | --- | ---- |
|  𝑡3−6𝑡2+6𝑡+5𝑡−5−1              |     |     |       | = 0  (𝑡3−1)−6𝑡(𝑡−1)+5(𝑡−1)= |     |     |                      | 0  |      |
|  (𝑡−1)(𝑡2+𝑡+1) −6𝑡(𝑡−1)+5(𝑡−1)= |     |     |       |                              |     |     | (𝑡−1)((𝑡2+𝑡+1)−6𝑡+5) |     |      |
|                                 |     |     |       |                              |     | 0  |                      |     | = 0  |


Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
   (𝑡−1)(𝑡2−5𝑡+6)= 0. Nga (𝑡−1)= 0 , marrim 𝑡 = 1 dhe nga  𝑡2−5𝑡+6 = 0, marrim:
|    |       |       |     |     |     |     |     | 1   |     |     |     |
| --- | ----- | ----- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 𝑡   | = 3,𝑡 | = 2.  |     |     |     |     |     |     |     |     |     |
2 3
Kështu, zgjidhjen e përgjithshme e kërkojmë në formën:
|     |     |     |     |     |     | 𝑎   | = 𝑐 (1)𝑛+𝑐 | (3)𝑛+𝑐 | (2)𝑛  |     |     |
| --- | --- | --- | --- | --- | --- | --- | ---------- | ------ | ----- | --- | --- |
|     |     |     |     |     |     | 𝑛   | 1          | 2      | 3     |     |     |
Nga kushtet fillestare të rekurencës, marrim:
| Nga  𝑛  |     |          |              | (1)0+𝑐 | (3)0+𝑐 | (2)0 = 𝑐 |          |          |     |     |     |
| ------- | --- | -------- | ------------ | ------ | ------ | -------- | -------- | -------- | --- | --- | --- |
|         | =   | 0,   𝑎 = | 2 ,  2 = 𝑐   |        |        |          |          | +𝑐 + 𝑐   |     |     |     |
|         |     | 0        |              | 1      | 2      | 3        | 1        | 2        | 3   |     |     |
|         |     |          |              | (1)1+𝑐 | (3)1+𝑐 | (2)1 = 𝑐 |          |          |     |     |     |
| Nga  𝑛  | =   | 1,   𝑎 = | 0,  0 = 𝑐    |        |        |          |          | +3𝑐 + 2𝑐 |     |     |     |
|         |     | 1        |              | 1      | 2      | 3        | 1        | 2        | 3   |     |     |
| Nga   𝑛 | =   | 2,   𝑎 = | −2 ,  -2 = 𝑐 |        | (1)2+𝑐 | (3)2+𝑐   | (2)2 = 𝑐 | +9+ 4𝑐   |     |     |     |
|         |     | 2        |              |        | 1      | 2        | 3        | 1        | 3   |     |     |
Formojmë sistemin:
|                                   |     |     | 𝑐        | +𝑐  | + 𝑐 = 2 |     |     |     |     |     |     |
| --------------------------------- | --- | --- | -------- | --- | ------- | --- | --- | --- | --- | --- | --- |
|                                   |     |     | 1        | 2   | 3       |     |     |     |     |     |     |
|                                {𝑐 |     |     | +3𝑐      |     | + 2𝑐 =  | 0   |     |     |     |     |     |
|                                   |     |     | 1        | 2   | 3       |     |     |     |     |     |     |
|                                   |     |     | 𝑐 +9+ 4𝑐 |     | = −2    |     |     |     |     |     |     |
|                                   |     |     | 1        |     | 3       |     |     |     |     |     |     |
të cilin e zgjidhim me metodën e Kramerit.
|     | 1   | 1 1 |     |     | 2 1 | 1   |     | 1   | 2 1 |     | 1 1 2 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- |
 𝐷 = |1 3 2| = −2, 𝐷 = | 0 3 2| = −10, 𝐷 = |1 0 2| = −2,𝐷 = |1 3 0 |= 8
|     |     |     |     | 𝑥   |      |     | 𝑦   |     |      | 𝑧   |        |
| --- | --- | --- | --- | --- | ---- | --- | --- | --- | ---- | --- | ------ |
|     | 1   | 9 4 |     |     | −2 9 | 4   |     | 1   | −2 4 |     | 1 9 −2 |
𝐷𝑦
| Kështu, 𝑐 |     | 𝐷𝑥  | −10 | 5, 𝑐 | = = −2 | = 1, 𝑐 | = 𝐷𝑧 | = 8 | = −4.  |     |     |
| --------- | --- | --- | --- | ---- | ------ | ------ | ---- | --- | ------ | --- | --- |
|           |     | = = | =   | 2    |        |        | 3    |     |        |     |     |
|           |     | 1 𝐷 | −2  |      | 𝐷 −2   |        | 𝐷    | −2  |        |     |     |
Përfundimisht, zgjiidhja e rekurencës është:
|     |     |     |     |     | 5∙(1)𝑛+1∙(3)𝑛 |     | −4∙(2)𝑛 |     | 5∙1𝑛 +3𝑛−4∙2𝑛  |     |     |
| --- | --- | --- | --- | --- | ------------- | --- | ------- | --- | -------------- | --- | --- |
|     |     |     |     | 𝑎 𝑛 | =             |     |         | =   |                |     |     |
|     |     |     |     |     |               |     |         |     |                |     |     |

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
5.6.17. Tё zgjidhet rekurenca:
|     |     |     | 𝑎     | = 3𝑎 |        | +4𝑎        |     |          |        |            |
| --- | --- | --- | ----- | ---- | ------ | ---------- | --- | -------- | ------ | ---------- |
|     |     |     | {     | 𝑛+2  | 𝑛+1    |            | 𝑛   |          |        |            |
|     |     |     |     𝑎 | =    | 0,   𝑎 | = 2        |     |          |        |            |
|     |     |     |       | 0    |        | 1          |     |          |        |            |
|     |     |     |       |      |        |            |     |          | 2 ∙4𝑛− | 2 ∙(−1)𝑛]  |
|     |     |     |       |      |        |            |     | [ Rez: 𝑎 | =      |            |
|     |     |     |       |      |        |            |     |          | 𝑛 5    | 5          |
5.6.18. Tё zgjidhet rekurenca:
|                                                                 |     |     | 𝑎                                 | − 𝑎   | −2𝑎      | +2𝑛       | = 0 |     |     |     |
| --------------------------------------------------------------- | --- | --- | --------------------------------- | ----- | -------- | --------- | --- | --- | --- | --- |
|                                                                 |     |     | 𝑛                                 | 𝑛−1   |          | 𝑛−2       |     |     |     |     |
|                                                               { |     |     |                                   |       |          |           |     |     |     |     |
|                                                                 |     |     |                                   |     𝑎 | = 0,   𝑎 | =1        |     |     |     |     |
|                                                                 |     |     |                                   | 0     |          | 1         |     |     |     |     |
| Zgjidhje. Vendosim                                              |     | n   |  dhe marrim ekuacionin homogjen:  |       |          |           |     |     |     |     |
f ( n ) = 2 = 0
|               |                       |     | 𝑎   | − 𝑎 | −2𝑎 | =   | 0.  |     |     |     |
| ------------- | --------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|               |                       |     | 𝑛   | 𝑛−1 |     | 𝑛−2 |     |     |     |     |
| Zëvendësojmë  | a = t 2 , dhe marrim  |     |     |     |     |     |     |     |     |     |
n
2
|     |     | t   | − t − 2 | = 0 |     |     |     |     |     |     |
| --- | --- | --- | ------- | --- | --- | --- | --- | --- | --- | --- |

|                                          |     |     | 1  | 1 + 8  | 1  3 |        |           |     |     |     |
| ---------------------------------------- | --- | --- | --- | ------ | ----- | ------ | --------- | --- | --- | --- |
|                                          |     | t1  | =   |        | =     |  t1 = | − 1 ; t = | 2 . |     |     |
|                                          |     |     | ,2  | 2      | 2     |        | 2         |     |     |     |
| Prandaj,  zgjidhja homogjen është h(n)=c |     |     |     | (−1)n |       | (2)n   |           |     |     |     |
+c
|     |     |     |     | 1   |     | 2   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Meqë   f(n)=2n , pra b = 2 dhe 2 është rrënjë karakteristike me shumëfishitet 1, prandaj
|     |     |     |     | (   | )     |         |     |     |     |     |
| --- | --- | --- | --- | --- | ----- | ------- | --- | --- | --- | --- |
|     |     |     |     | p n | = c  | n  2 n |     |     |     |     |
3
Vendosim te zgjidhja e përgjithshme
|     |     |     |     | a   | = h ( n ) + | p ( n )   |     |     |     |     |
| --- | --- | --- | --- | --- | ----------- | --------- | --- | --- | --- | --- |
n
|                | (−1)𝑛+𝑐 | (2)𝑛+ 𝑐 |     | ∙𝑛∙ 2𝑛.  |     |     |     |     |     |     |
| -------------- | ------- | ------- | --- | -------- | --- | --- | --- | --- | --- | --- |
| dhe marrim:  𝑎 | = 𝑐     |         |     |          |     |     |     |     |     |     |
|                | 𝑛 1     | 2       |     | 3        |     |     |     |     |     |     |
Nga kushtet fillestare të rekurencës, marrim:
Nga 𝑛 = 0,𝑎 = 0, marrim: 1 = 𝑐 (−1)0+𝑐 (2)0+ 𝑐 ∙0∙ 20 = 𝑐 +𝑐
|     | 0   |     | 1   |     | 2   | 3   |     | 1 2 |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Nga 𝑛 = 1,𝑎 = 1, marrim:  1 (−1)1+𝑐 (2)1+ 𝑐 ∙1∙ 21 = −𝑐 +2𝑐
|                      | 1                         | = 𝑐 | 1   |     | 2   | 3   |     | 1 +2𝑐 | 2 3 |     |
| -------------------- | ------------------------- | --- | --- | --- | --- | --- | --- | ----- | --- | --- |
| Njehsojmë vlerёn e 𝑎 | , nga rekurenca e dhënë:  |     |     |     |     |     |     |       |     |     |
2
+2𝑛
|     |     |          𝑎 | − 𝑎 |     | −2𝑎 |     | = 0  |     |     |     |
| --- | --- | ---------- | --- | --- | --- | --- | ---- | --- | --- | --- |
|     |     |            | 𝑛   | 𝑛−1 | 𝑛−2 |     |      |     |     |     |
+22
|     |     |     | 𝑎 −𝑎 |     | −2𝑎 |     | = 0  |     |     |     |
| --- | --- | --- | ---- | --- | --- | --- | ---- | --- | --- | --- |
|     |     |     | 2    | 2−1 | 2−2 |     |      |     |     |     |
−22
|     |       |         𝑎 | = 𝑎 | +2𝑎 |     | = 1+2∙1−4 |     | =   | −1  |     |
| --- | ----- | --------- | --- | --- | --- | --------- | --- | --- | --- | --- |
|     |       |           | 2   | 1   | 0   |           |     |     |     |     |
Pra n=2, 𝑎 = −1, marrim −1 = 𝑐 (−1)2+𝑐 (2)2+ 𝑐 ∙2∙ 22 = 𝑐 +4𝑐 +8𝑐
|     | 2   |     | 1   |     | 2   | 3   |     | 1 2 | 3   |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Formojmë sistemin:

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
|     |     |     |     |     |     |     |       | 𝑐 1 +𝑐 2 = | 0      |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | ---------- | ------ | --- | --- | --- |
|     |     |     |     |     |     | {   | −𝑐    | +2𝑐 +2𝑐    | = 1    |     |     |     |
|     |     |     |     |     |     |     | 1     | 2          | 3      |     |     |     |
|     |     |     |     |     |     |     | 𝑐 +4𝑐 | +8𝑐 =      | 1 = −1 |     |     |     |
|     |     |     |     |     |     |     | 1     | 2 3        |        |     |     |     |

| Dhe pas zgjidhjes marrim: 𝑐 |     |     |     |     | = =      | −1  | ,𝑐 =   | 10 ,𝑐 = =  | −2  | .   |     |     |
| --------------------------- | --- | --- | --- | --- | -------- | --- | ------ | ---------- | --- | --- | --- | --- |
|                             |     |     |     |     | 1        | 9   | 2      | 9 3        | 3   |     |     |     |
|                             |     |     |     |     | 1        |     | 10     | 2          |     |     |     |     |
| Pёrfundimisht kemi: 𝑎       |     |     |     | =   | − (−1)𝑛+ |     | (2)𝑛−  | ∙𝑛∙ 2𝑛     |     |     |     |     |
|                             |     |     |     | 𝑛   | 9        |     | 9      | 3          |     |     |     |     |
5.6.19.  Tё zgjidhet rekurenca:
+5𝑛
|     |     |     |     |     |     | 𝑎 𝑛 = 7𝑎 | 𝑛−1      | −10𝑎 𝑛−2   |         |          |           |          |
| --- | --- | --- | --- | --- | --- | -------- | -------- | ---------- | ------- | -------- | --------- | -------- |
|     |     |     |     |     |   { |          |          |            |         |          |           |          |
|     |     |     |     |     |     |     𝑎    | = 1,   𝑎 | = 1        |         |          |           |          |
|     |     |     |     |     |     |          | 0        | 1          |         |          |           |          |
|     |     |     |     |     |     |          |          |            |         | 37 (2)𝑛− | 28 (5)𝑛 5 | ∙𝑛∙ 5𝑛]  |
|     |     |     |     |     |     |          |          |            | [Rez: 𝑎 | =        | +         |          |
|     |     |     |     |     |     |          |          |            |         | 𝑛 9      | 9 3       |          |
5.6.20.  Tё zgjidhet rekurenca:
|     |     |     |     |     |      | 𝑎 = 6𝑎 |     | −9𝑎               | +𝑛∙3𝑛 |       |     |     |
| --- | --- | --- | --- | --- | ---- | ------ | --- | ----------------- | ----- | ----- | --- | --- |
|     |     |     |     |     |      | 𝑛      | 𝑛−1 | 𝑛−2               |       |       |     |     |
|     |     |     |     |     |    { |        |     |                   |       |       |     |     |
|     |     |     |     |     |      |     𝑎  | =   | 2,   𝑎 = 3        |       |       |     |     |
|     |     |     |     |     |      |        | 0   | 1                 |       |       |     |     |
|     |     |     |     |     |      |        |     |                   |       | n − 1 | (n  | )   |
3 3 2
|     |     |     |     |     |     |     |     |     |     | [Rez:  a = | + 3 n − 1 | 0 n + 1 2 ]  |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---------- | --------- | ------------ |
|     |     |     |     |     |     |     |     |     |     | n 2        |           |              |
5.6.21. Tё zgjidhet rekurenca 𝑎 = 2(𝑎 − 𝑎 ) ku  n  2, 𝑎 = 1, 𝑎  = 2
|     |     |     |     |     | 𝑛   |     | 𝑛−1 | 𝑛−2 |     | 0 1 |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Zgjidhje.Vendosim  𝑎  = 𝑟𝑛 , dhe marrim  r2 - 2r + 2 = 0. Gjejmë rrënjët  r =1  i , të cilat i kalojmë
𝑛
në trajtë trigonometrike:
1+ i = √2 (cos(/4) + i sin(/4))
1– i = √2 (cos(/4) - i sin(/4))
| Kështu,  𝑎 |           | 𝑐      | (1+𝑖)𝑛       | +  𝑐 | (1−𝑖)𝑛  |       |           |            |     |      |     |     |
| ---------- | --------- | ------ | ------------ | ---- | ------- | ----- | --------- | ---------- | --- | ---- | --- | --- |
|            |           | 𝑛 =    | 1            |      | 2       |       | =         |            |     |      |     |     |
|            |           |        |              |      | 𝑛       |       |           |            |     | 𝑛    |     |     |
|            |           |        |             |      |        |       |           |           |    |      |     |     |
| = 𝑐        | [√2 (cos( |        | )+ 𝑖sin(     |      | ))]     | + 𝑐   | [√2 (cos( | ) – 𝐼sin(  |     | ))]  |     |     |
|            | 1         |        | 4            |      | 4       | 2     |           | 4          | 4   |      |     |     |
|            |           | 𝑛      |             |      |        |       | 𝑛         |           |     |     |     |     |
|  = 𝑐       | [√2       |  cos(𝑛 | )+ 𝑖sin(𝑛    |      | )]+ [√2 |       |  cos(−𝑛   | )+ 𝑖sin(−𝑛 |     | )]   |     |     |
|            | 1         |        |              |      |         |       |           |            |     |      |     |     |
|            |           |        | 4            |      | 4       |       |           | 4          |     | 4    |     |     |
|            |           | 𝑛      |              |      |         |       | 𝑛         |            |     |      |     |     |
|            |           |        |             |      |        |       |           |           |     |     |     |     |
| =𝑐         | 1   [√2   |  cos(𝑛 | )+ 𝑖sin(𝑛    |      | )]+ [√2 |       |  cos(𝑛    | )− 𝑖sin(𝑛  |     | )]   |     |     |
|            |           |        | 4            |      | 4       |       |           | 4          |     | 4    |     |     |
|            |           |        |             |      |         |      |           |            |     |      |     |     |
| =(√2)𝑛[𝑘   |           | cos(𝑛  | )+ 𝑘         |      | sin(𝑛   | )]    |           |            |     |      |     |     |
|            |           | 1      | 4            | 2    |         | 4     |           |            |     |      |     |     |
| ku,  𝑘     |           | = 𝑐    | +𝑐 2   dhe 𝑘 |      | = (𝑐    | −𝑐 )𝑖 |           |            |     |      |     |     |
|            | 1         | 1      |              | 2    | 1       | 2     |           |            |     |      |     |     |

Pergatiten: A. Jusufi, K. Filipi, D. Berisha, M. Reqica
Nga kushtet fillestare të rekurencës, marrim:
1= 𝑎 = [ 𝑘 cos0+ 𝑘 sin0]=𝑘
0 1 2 1
 
2= 𝑎 = √2[1∙cos( )+𝑘 sin( ) ], nga ku 2 = 1+𝑘 dhe 𝑘 = 1
1 2 2 2
4 4
Përfundimisht, marrim: 𝑎 (√2)𝑛 [cos(𝑛  )+sin(𝑛  )],𝑛 ≥ 0.
𝑛=
4 4
5.6.22. Le tё jetё dhёnё 𝑎 ,tregon që për vlerёn e njё determinante 𝐷 tё tipit nxn, dhe për kushtet
𝑛 𝑛
fillestare 𝑎 = 𝑏 𝑎 = 0 𝑎 = − 𝑏3 vlejnë:
1 , 2 , 3
𝐷 = 𝑏𝐷 − 𝑏2𝐷 dhe 𝑎 = 𝑏𝑎− 𝑏2𝑎
𝑛 𝑛−1 𝑛−2 𝑛 𝑛−2
Zgjidhje. Nёse marrim 𝑎 = 𝑐𝑟𝑛 , pёr c, r≠ 0 dhe n ≥ 1, nga ekuacioni karakteristik marrim :
𝑛
𝑏[1/2± 𝑖√3/2].
Pasi qё,
𝑎 𝑐 [ 𝑏( 1 )+ 𝑖√ 3 ]𝑛+𝑐 [ 𝑏(( 1 )−𝑖√ 3 ]𝑛 =
𝑛 = 1 2
2 2 2 2
= 𝑏𝑛 [𝑐 (cos( 𝜋 )+ 𝑖 𝑠𝑖𝑛 ( 𝜋 ))]𝑛 +𝑐 (cos( 𝜋 )− 𝑖 𝑠𝑖𝑛 ( 𝜋 ))]𝑛 ]=
1 2
3 3 3 3
=𝑏𝑛 [𝑘 cos( 𝑛𝜋 )+ 𝑘 sin( 𝑛𝜋 )]
1 2
3 3
Nga kushtet fillestare, marrim:
b = 𝑎 = 𝑏 [𝑘 cos(
𝑛𝜋
)+ 𝑘 sin(
𝑛𝜋
)], pra 1 = 𝑘 (
1
)+𝑘 (
√3
). Pra, 𝑘 + √3 𝑘 = 2
1 1 2 1 2 1 2
3 3 2 2
0 = 𝑎 = 𝑏2[𝑘 cos( 2𝜋 )+ 𝑘 sin( 2𝜋 )] , pra 0= 𝑘 (− 1 )+𝑘 ( √3 ). Pra, 𝑘 = √3 𝑘
2 1 2 1 2 1 2
3 3 2 2
Pasi qё,
𝑘 = 1,𝑘 = 1 dhe vlera e 𝐷 është: 𝐷 = 𝑏𝑛 [cos( 𝑛𝜋 )+ 1 sin( 𝑛𝜋 )].
1 2 𝑛 𝑛
√3 3 √3 3
