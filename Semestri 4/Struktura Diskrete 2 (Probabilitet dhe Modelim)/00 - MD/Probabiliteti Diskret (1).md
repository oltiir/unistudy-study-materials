Përgatiti: A. Jusufi, D. Berisha,M.Reqica
9
Kreu
ELEMENTE TË PROBABILITETI DISKRET
Teoria e probabilitetit është pjesë e matematikës e cila merret me zbulimin dhe shqyrtimin e
ligjshmërive në paraqitjen e dukurive apo ngjarjeve të rastit. Sikurse çdo shkencë edhe teoria e
probabilitetit është e lidhur ngushtë me domosdoshmëritë jetësore të njerëzve. Për shembull,
dukuritë që i studion meteorologjia, dukuria e tërmeteve, paraqitja e prodhimeve jo të rregullta,
jetëgjatësia e ndonjë makinerie, rezultati paraqitjes në hedhjen e monedhës apo të zarit etj. Edhe
pse jemi të vetëdijshëm se këto dukuri kanë arsyen e paraqitjes dhe këto arsye janë ligjore, ne
përsëri i trajtojmë si dukuri ose ngjarje të rastit. Këto dukuri ose ngjarje mundet të ndodhin ose të
mos ndodhin, prandaj ne themi se këto ngjarje janë të mundshme, për disa të tjera themi se janë më
pak të mundshme ose aspak të mundshme.
Sot teoria e probabilitetit ka një zbatim të gjer në shumë fusha: si në biologji posaçërisht në
gjenetikë, ekonomi, statistikë, teknikë, astronomi etj. Pa probabilitet nuk ka paralajmërim në
meteorologji (që është shumë e rëndësishme për bujqësinë), nuk ka analiza ekonomike (të
nevojshme për planifikimin e prodhimeve) , nuk ka eksperimente biologjike dhe prognoza
mjekësore, nuk ka analiza demografike etj. Pra, probabiliteti është pjesë e jetës bashkëkohore te
njerëzit.
9.1. Ngjarjet e rastit
Është e njohur se të studiuarit e natyrës, shoqërisë ose botës në përgjithësi, ndodh si rezultat i
hulumtimeve të ndryshme, eksperimenteve ose vrojtimeve. Me eksperiment nënkuptojmë
realizimin e bashkësisë së kushteve të dhëna. Përfundimin e çdo eksperimenti ose prove do ta
quajmë ngjarje.
Ngjarjet shënohen me shkronja të mëdha të alfabetit latin: A,B,C,....
Shembull 9.1.1. Nëse hedhim një monedhë metalike, pas rënies së monedhës, në rrafsh do të
paraqitet “ figura” ose “numri”. Me hedhjen e monedhës dhe me rënien e saj në rrafsh kemi kryer
një eksperiment, rezultati i paraqitjes mbi monedhë “figura” apo “numri” përbëjnë ngjarje
elementare.
Nëse gjatë kryerjes së ndonjë eksperimenti, nuk mundet të parashihet nëse ndonjë ngjarje do të
ndodh ose nuk do të ndodh, atëherë atë ngjarje e quajmë ngjarje të rastit.
Në jetë, shpesh takojmë ngjarje të rastit, siç janë:
• fitimi në një lojë fati
• paraqitja e “figurës” ose “numrit” gjatë hedhjes së monedhës
• goditja ose mos goditja e shënjestrës.
40

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

Shembull  9.1.2.  Në  vazhdim  shqyrtojmë  eksperimentet  dhe  ngjarjet  që  lidhen  me  ato
eksperimente:
a)  Le të kryhet eksperimenti hedhja e zarit (kubit) dhe le të shqyrtohen ngjarjet:
|                 A | : bie numër nga 1 deri te 6,  |     |     |     |     |     |     |     |     |
| ----------------- | ----------------------------- | --- | --- | --- | --- | --- | --- | --- | --- |
1
|                 A | : bie numri 8.  |     |     |     |     |     |     |     |     |
| ----------------- | --------------- | --- | --- | --- | --- | --- | --- | --- | --- |
2

b)  Le të kryhet eksperimenti i tërheqjes së lëmshit nga kutia me 7 lëmsha të bardhë dhe le të
shqyrtohen ngjarjet:
|                 B | : tërhiqet lëmshi bardh,  |     |     |     |     |     |     |     |     |
| ----------------- | ------------------------- | --- | --- | --- | --- | --- | --- | --- | --- |
1
|                 B | 2 : tërhiqet lëmshi kuq.  |     |     |     |     |     |     |     |     |
| ----------------- | ------------------------- | --- | --- | --- | --- | --- | --- | --- | --- |

Siç dimë zari ka 6 faqe të shënuara na 1 deri te 6, prandaj ngjarja A  do të ndodh sa herë që të
1
përsëritet  eksperimenti,  ndërsa  ngjarja  A   nuk  ndodh  asnjëherë  sepse  zari  nuk  ka  numër  8.
2
Gjithashtu ngjarja B 1  do të ndodh sa herë që të përsëritet eksperimenti sepse në kuti ka vetëm
lëmshe të bardhë, ndërsa ngjarja B  nuk do të ndodh asnjëherë sepse kutia nuk ka lëmshe të kuq.
2

Ngjarjet që ndodhin gjithmonë gjatë realizimit të ndonjë eksperimenti quhen ngjarje të sigurta-S,
| siç janë ngjarjetA |  dhe B | .   |     |     |     |     |     |     |     |
| ------------------ | ------ | --- | --- | --- | --- | --- | --- | --- | --- |
|                    |   1    | 1   |     |     |     |     |     |     |     |
Ngjarjet  që  nuk  ndodhin  asnjëherë  gjatë  realizimit  të  ndonjë  eksperimenti  quhen  ngjarje  të
| pamundura-˘ | , siç janë ngjarjetA |     |  dhe B | .   |     |     |     |     |     |
| ----------- | -------------------- | --- | ------ | --- | --- | --- | --- | --- | --- |
|             |                      |     |   2    | 2   |     |     |     |     |     |

9.2. Bashkësia e ngjarjeve elementare. Veprimet me ngjarje

Shembull 9.2.1. Le të shqyrtojmë eksperimentin e hedhjes së zarit. Disa nga ngjarjet e rastit në
lidhje  me  këtë  eksperiment  janë:  A-  bie  numër  çift,  B-  bie  numër  tek,  C-  bie  numër  i
plotpjesëtueshëm me 3, E - bie numri 1, E - bie numri 2, E - bie numri 3, E - bie numri 4, E - bie
|              |                | 1   |     | 2   |     | 3   | 4   |     | 5   |
| ------------ | -------------- | --- | --- | --- | --- | --- | --- | --- | --- |
| numri 5, E 6 | -bie numri 6.  |     |     |     |     |     |     |     |     |
•  Nëse shikojmë me kujdes ngjarjet A, B dhe C janë të lidhura me të pakën njërën nga
| ngjarjet E | , E , E | , E , E |  dhe E | .   |     |     |     |     |     |
| ---------- | ------- | ------- | ------ | --- | --- | --- | --- | --- | --- |
|            | 1 2     | 3 4     | 5      | 6   |     |     |     |     |     |
•  Ngjarja A ndodh atëherë dhe vetëm atëherë kur ndodh njëra nga ngjarjet E , E  dhe E .
|     |     |     |     |     |     |     |     | 2 4 | 6   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
•  Ngjarja B ndodh atëherë dhe vetëm atëherë kur ndodh njëra nga ngjarjet E , E  dhe E .
|     |     |     |     |     |     |     |     | 1 3 | 5   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
•  Ngjarja C ndodh atëherë dhe vetëm atëherë kur ndodh njëra nga ngjarjet E  dhe E .
3 6
•
Ngjarjet E , E , E , E , E  dhe E  nuk mundet të zbërthehen në ngjarje të tjera.
|     | 1 2 | 3 4 | 5   | 6   |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

Prandaj, ngjarjet të cilat nuk mund të zbërthehen në ngjarje të tjera ose që janë ngjarje të vetme të
mundshme quhen ngjarje elementare, të tilla janë ngjarjet: E , E , E , E , E  dhe E , në shembullin
|     |     |     |     |     |     | 1 2 | 3 4 5 | 6   |     |
| --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- |
paraprak.
Bashkësinë e të gjitha ngjarjeve elementare do ta quajmë hapësirë të ngjarjeve elementare  dhe do
ta shënojmë me
|     |     |     |     | {        |          | }   |     |     |     |
| --- | --- | --- | --- | -------- | -------- | --- | --- | --- | --- |
|     |     |     |     | W = E ,E | ,.....,E | .   |     |     |     |
|     |     |     |     | 1        | 2        | n   |     |     |     |

|     |     | A=  | {   | }   | = { } |     |     |     |     |
| --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- |
Le të jenë dhënë ngjarjet  E ,E ,E  dhe  D E , gjatë hedhjes së zarit. Është e qartë se
|     |     |     | 2 4 | 6   | 3   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
ngjarjet A dhe D nuk mundet të ndodhin njëkohësisht, sepse paraqitja e numrit çift gjatë hedhjes së
zarit e përjashton paraqitjen e numrit tek 3 dhe anasjelltas. Për ngjarjet e këtilla themi se janë
ngjarje që përjashtojnë njëra tjetrën dhe do ti quajmë ngjarje disnjukte.  Prerja e ngjarjeve disjunkte
është bashkësi boshe.
|     |     |     |     | 41  |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
Ekzistojnë edhe ngjarje të cilat nuk janë disjunkte, d.m.th. që nuk janë bashkë përjashtuese. Për
{ } { }
shembull ngjarje të tilla janë: A= E ,E ,E dhe C = E ,E . Këto ngjarje mundet të ndodhin
2 4 6 3 6
njëkohësisht atëherë kur në anën e sipërme të zarit paraqitet numri 6.
Le të jenë A dhe B dy ngjarje rasti. Do të themi se ngjarja A e tërheq ngjarjen B, nëse kur ndodhë
ngjarja A gjithmonë të ndodhë edhe ngjarja B. Simbolikisht shkruajmë A˝ B.
{ } { }
p.sh. E ,E ,E (cid:204) E ,E ,E ,E ,E .
2 4 6 2 3 4 5 6
Nëse A˝ B dhe B˝ A atëherë për ngjarjet A dhe B themi se janë ngjarje ekuivalente dhe
shkruajmë A=B.
Mundet të ndodh që gjatë kryerjes së ndonjë eksperimenti të kemi vetëm dy ngjarje të mundshme,
të cilat e përjashtojnë njëra tjetrën. Këto ngjarje i quajmë ngjarje të kundërta. Nëse me A shënojmë
njërën nga ngjarjet atëherë ngjarjen e kundërt të saj do ta shënojmë me A.
Shembull 9.2.3.
a) Paraqitja e “figurës” dhe paraqitja e “numrit” gjatë hedhjes së monedhës paraqesin ngjarje të
kundërta.
b) Paraqitja e numrit tek dhe paraqitja e numrit çift gjatë hedhjes së zarit paraqesin ngjarje të
kundërta
• Prodhim të ngjarjeve A dhe B quajmë ngjarjen që ndodhë atëherë dhe vetëm atëherë kur
ndodhin njëkohësisht edhe ngjarja A edhe ngjarja B. Shënojmë A˙ B ose A(cid:215) B.
Shembull 9.2.4. Nëse kryejmë eksperimentin e gjuajtjes në shënjestër e pushkë nga ana e dy
ushtarëve dhe shënojmë ngjarjet:
A: qëllon në shënjestër ushtari i parë,
B: qëllon në shënjestër ushtari i dytë.
Të caktohet ngjarja prodhim A(cid:215) B.
Zgjidhje: Ngjarja prodhim të cilën e shënojmë A(cid:215) B do të jetë:
A(cid:215) B: qëllojnë në shënjestër të dy ushtarët.
Shembull 9.2.5. Kryejmë eksperimentin e hedhjes së zarit. Shqyrtojmë ngjarjet e rastit në lidhje
me këtë eksperiment:
A: bie numër më i vogël ose barabartë me 3,
B: bie numër më i madh se 4,
C: bie numër i plotpjesëtueshëm me 3.
Të caktohet ngjarjet prodhim A(cid:215) B, A(cid:215) C dhe B(cid:215) C.
Zgjidhje: Ngjarjet e dhëna simbolikisht i shkruajmë:
{ } { } { }
A= E ,E ,E , B = E ,E dhe C = E ,E
1 2 3 5 6 3 6
{ } { }
Ngjarjet prodhim janë: A(cid:215) B =F , A(cid:215) C = E dhe B(cid:215) C = E .
3 6
Në mënyrë analoge përkufizohet edhe prodhimi i tri e më shumë ngjarjeve. Ngjarje prodhim të
ngjarjeve A , A ,.....,A quajmë ngjarjen A ·A ·.....·A e cila ndodhë atëherë dhe vetëm atëherë kur
1 2 n 1 2 n
ndodhin të gjitha ngjarjet.
Për prodhimin e ngjarjeve vlejnë vetitë:
a) AB˝ A dhe AB˝ B
42

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

=
|       b)  AB | BA             vetia komutative  |     |     |     |     |     |
| ------------ | -------------------------------- | --- | --- | --- | --- | --- |
|              | ( )                              | ( ) |     |     |     |     |
=
|       c) A       | BC     | AB C    vetia asociative  |             |         |     |     |
| ---------------- | ------ | ------------------------- | ----------- | ------- | --- | --- |
|       d) AA=     | A,  AS | =                         | A,  AF =F   | ,  AA=F |     |     |
|                  |        | ˝                         | ˝           |         | ˝   |     |
|       e)  Nëse C |        | A dhe C                   | B atëherë C |         | AB  |     |
|                  |        | =                         | A˝          |         |     |     |
|       f)   Nga   | AB     | A rrjedhë                 |             | B.      |     |     |

•
Shumë të ngjarjeve A dhe B quajmë ngjarjen që ndodhë atëherë dhe vetëm atëherë kur
ndodhë të paktë njëra nga ngjarjet A ose B. Shënojmë  A¨ B. Në rast se ngjarjet A dhe B janë
| ngjarje disjukte atëherë për ngjarjen shumë shënojmë  |     |     |     |     |     | A+ B.   |
| ----------------------------------------------------- | --- | --- | --- | --- | --- | ------- |

Shembull 9.2.6. Të caktohet ngjarja shumë e ngjarjeve të shembullit 3.
| Zgjidhje: Ngjarja shumë  |                                                             |     | A¨  | B është:  |     |     |
| ------------------------ | ----------------------------------------------------------- | --- | --- | --------- | --- | --- |
|            A¨            | B: në shënjestër qëllon ushtari i parë ose ushtari i dytë.  |     |     |           |     |     |

Shembull 9.2.7. Të shkruhet si shumë ngjarjesh elementare ngjarja:
                         B:bie numër tek, gjatë hedhjes së zarit.
| Zgjidhje:  | =   | +   | +E .  |     |     |     |
| ---------- | --- | --- | ----- | --- | --- | --- |
B E E
|     |     | 1   | 3 5 |     |     |     |
| --- | --- | --- | --- | --- | --- | --- |

Në  mënyrë  analoge  përkufizohet  edhe  shuma  e  tri  e  më  shumë  ngjarjeve.  Ngjarje  shumë  të
ngjarjeve A , A ,.....,A  quajmë ngjarjen A 1UA 2U.....UA   e cila ndodhë atëherë dhe vetëm atëherë
|                                           | 1   | 2   | n   |     |              | n     |
| ----------------------------------------- | --- | --- | --- | --- | ------------ | ----- |
| kur ndodhë të paktën njëra nga ngjarjet A |     |     |     |     | , A ,.....,A | .     |
|                                           |     |     |     |     | 1 2 n        |       |

 Për shumën e ngjarjeve vlejnë vetitë:
|        a) A˝       | A¨  |          | ˝ A¨                                      |                        |             |     |
| ------------------ | --- | -------- | ----------------------------------------- | ---------------------- | ----------- | --- |
|                    |     | B dhe B  |                                           | B                      |             |     |
|                    | A¨  | = B¨     |                                           |                        |             |     |
|        b)          | B   |          | A                       vetia komutative  |                        |             |     |
|                    | (   | )        | ( )                                       |                        |             |     |
|        c) A¨       | B¨  | =        | A¨                                        | ¨                      |             |     |
|                    |     | C        | B                                         | C    vetia asociative  |             |     |
|        d) A¨       | A=  | A,  A¨   | = S,  A¨                                  | F                      | = A,  A¨ A= |     |
|                    |     |          | S                                         |                        |             | S   |
|        e)  Nëse A˝ |     | C dhe B˝ |                                           |                        | A¨ B˝       |     |
|                    |     |          |                                           | C atëherë              | C           |     |
|                    | A¨  | =        |                                           | ˝                      |             |     |
|        f)  Nga     |     | B        | A rrjedhë B                               | A.                     |             |     |

 Për ngjarjet e rastit gjithashtu vlejnë edhe këto veti:
( )
B¨ = AB¨
|        a) A |     | C       | AC ,                        |     |     |     |
| ----------- | --- | ------- | --------------------------- | --- | --- | --- |
| (           | A¨  | ) = AC¨ |                             |     |     |     |
|             | B   | C       | BC      vetia distributive  |     |     |     |

|        b)   | A¨ B | = A˙ | B,    |     |     |     |
| ----------- | ---- | ---- | ----- | --- | --- | --- |
A˙ = A¨
|         |     | B   | B            ligjet e De Morganit.  |     |     |     |
| ------- | --- | --- | ----------------------------------- | --- | --- | --- |

•  Ndryshim të ngjarjeve A dhe B quajmë ngjarjen e cila paraqitet atëherë dhe vetëm atëherë
 kur paraqitet ngjarja A dhe nuk paraqitet ngjarja B, shënojmë me A-B.

|     |     |     |     |     | 43  |     |
| --- | --- | --- | --- | --- | --- | --- |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

|     |     |     |     |     |     |     |     | A= { | }   |
| --- | --- | --- | --- | --- | --- | --- | --- | ---- | --- |
Shembull 9.2.8. Nëse A paraqet ngjarjen e rënies të numrit çift  E ,E ,E , gjatë hedhjes së
|     |     |     |     |     |     |     |     |     | 2 4 6 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- |
{ }
=
zarit, ndërsa B është ngjarja që paraqet rënien e numrit që plotpjesëtohet me 3, pra  B E ,E
3 6
|            |     | {     | }            |     |     | { }     |     |     |     |
| ---------- | --- | ----- | ------------ | --- | --- | ------- | --- | --- | --- |
| atëherë A- |     | B = E | ,E  ,ndërsa  |     | B-  | A= E .  |     |     |     |
|            |     |       | 2 4          |     |     | 3       |     |     |     |

Shembull 9.2.9. Në shënjestër qëllohet tri herë. Shënojmë ngjarjet:
|                    A |     | : qëllohet shënjestra në herën e parë,  |     |     |     |     |     |     |     |
| -------------------- | --- | --------------------------------------- | --- | --- | --- | --- | --- | --- | --- |
1
|                    A |     | : qëllohet shënjestra në herën e dytë,  |     |     |     |     |     |     |     |
| -------------------- | --- | --------------------------------------- | --- | --- | --- | --- | --- | --- | --- |
2
|                    A |     | 3 : qëllohet shënjestra në herën e tretë.  |     |     |     |     |     |     |     |
| -------------------- | --- | ------------------------------------------ | --- | --- | --- | --- | --- | --- | --- |
Me ndihmën e këtyre ngjarjeve, të shkruhen simbolikisht ngjarjet e rastit:
                   B: është qëlluar tri herë shënjestra,
                   C: nuk është qëlluar asnjëherë,
                   D: është qëlluar të paktën njëherë,
                   E: është gabuar të paktën njëherë,
                   F: është paraqitur një dhe vetë një prej tri ngjarjeve.
Zgjidhje:
| •   |     |     |     |     |     |     |     | =   | (cid:215) (cid:215) |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ------------------- |
Ngjarja B do të ndodh kur të ndodhin të tri ngjarjet, prandaj  B A A A .
|     |     |     |     |     |     |     |     |     | 1 2 3 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | ----- |
•  Ngjarja  C  do  të  ndodh  kur  nuk  do  të  ndodhi  asnjëra  prej  të  tri  ngjarjeve,  prandaj
|     |     | = (cid:215) | (cid:215) |     |     |     |     |     |     |
| --- | --- | ----------- | --------- | --- | --- | --- | --- | --- | --- |
|     | C   | A A         | A .       |     |     |     |     |     |     |
|     |     | 1 2         | 3         |     |     |     |     |     |     |
•  Ngjarja  D  do  të  ndodh  kur  të  ndodhi  të  paktën  njëra  prej  të  tri  ngjarjeve,  prandaj
|     |     | = ¨ | ¨   |                                     |     |     |     | = ¨ | ¨    |
| --- | --- | --- | --- | ----------------------------------- | --- | --- | --- | --- | ---- |
|     | D   | A A | A   | , përkatësisht për ngjarjen E kemi  |     |     | E   | A A | A .  |
|     |     | 1   | 2 3 |                                     |     |     |     | 1   | 2 3  |
•  Për ngjarjen F shënojmë
|        |     | = (cid:215) | (cid:215) ¨ | (cid:215) | (cid:215) ¨ | (cid:215) (cid:215) |     |     |     |
| ------ | --- | ----------- | ----------- | --------- | ----------- | ------------------- | --- | --- | --- |
|        | F   | A A         | A           | A A       | A           | A A A  .            |     |     |     |
|        |     | 1 2         | 3           | 1 2       | 3           | 1 2 3               |     |     |     |

9.3. Përkufizimi i probabilitetit të ngjarjes dhe vetitë
Madhësia e cila objektivisht e përcakton mundësin e paraqitjes së një ngjarje në kushte të caktuara,
të cilat mund të përsëriten shumë herë quhet probabilitet ose gjasë.
Që  të  mund  të  caktojmë  konkretisht  probabilitetin  e  një  ngjarje  rasti,  së  pari  njihemi  me  të
ashtuquajturat ngjarje të volitshme dhe ngjarje të pavolitshme.

Shembull 9.3.1. Le të jetë dhënë një kuti që brenda ka 7 lëmshe të kuq dhe 5 lëmshe të bardhë, pra
gjithsej 12 lëmshe. Tërheqjen e rastësishme të një lëmshi e quajmë ngjarje elementare. Nëse duam
që gjatë tërheqjes të paraqitet lëmshi i kuq dhe nëse me të vërtet paraqitet lëmshi kuq atëherë këtë
ngjarje e quajmë ngjarje të volitshme. Nëse dëshirojmë lëmsh të kuq dhe pas tërheqjes marrim
lëmsh të bardh atëherë këtë ngjarje quajmë ngjarje të pavolitshme.  Nëse ngjarjet e volitshme i
shënojmë me A, ndërsa ngjarjet e pavolitshme i shënojmë me  A atëherë nga 12 ngjarje elementare
, 7 janë të volitshme dhe 5 janë të pavolitshme. Konkretisht probabilitet i ngjarjes A: nga kutia
7
P(A)=
tërheqim lëmsh të kuq, është  , ndërsa probabiliteti i ngjarjes  A: nga kutia tërheqim
12
5
| lëmsh të bardh, është  |     |     | P(A)= |     | .   |     |     |     |     |
| ---------------------- | --- | --- | ----- | --- | --- | --- | --- | --- | --- |
12
|     |     |     |     | W = | {   | }   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Përkufizim  9.3.1.  Nëse  E ,E ,.....,E   është  hapësira  e  ngjarjeve  elementare  të  ndonjë
|     |     |     |     |     | 1 2 | n   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
eksperimenti, prej të cilave  0£ m£ n janë ngjarje të volitshme për ngjarjen A atëherë probabiliteti
|     |     |     |     |     |     | 44  |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
i ngjarjes A, pra P(A) paraqet herësin midis numrit të ngjarjeve të volitshme m dhe numrit të
ngjarjeve elementare n, d.m.th.
m
P(A)= (1)
n
Ky përkufizim quhet përkufizim klasik i probabilitetit.
Shembull 9.3.2. Sa është probabiliteti i paraqitjes të numrit tek gjatë hedhjes së zarit?
Zgjidhje: Ngjarje elementare janë gjithsej 6, prej të cilave 3 janë ngjarje të volitshme, prandaj
m 3 1
P(A)= = = .
n 6 2
{ }
Le të jetë W = E ,E ,.....,E hapësira e ngjarjeve elementare të ndonjë eksperimenti dhe le të
1 2 n
jenë p ,p ,...,p probabilitet përkatëse për çdo ngjarje elementare E, ku i=1,2,.,n ,të tillë që
1 2 n i
0£ p £ 1 dhe p +p +...+p =1. Le të jetë A një ngjarje rasti në lidhje me të njëjtin eksperiment,
i 1 2 n
është e qartë se A˝ W dhe A ka formën
{ }
{ }
A= E ,E ,.....,E , ku k £ n dhe i ,i ,...,i janë elemente të ndryshme nga 1,2,...,n .
i i i 1 2 k
1 2 k
Përkufizim 9.3.2. Probabiliteti i ngjarjes A është shuma e probabiliteteve të ngjarjeve elementare
që përmbahen në ngjarjen A. Domethënë,
P(A)= p + p +....+ p (2)
i i i
1 2 k
Kështu marrim:
Teoremë 9.3.1.
a) P(A)‡ 0,
b) P(W )=1,
c) Nëse A dhe B janë ngjarje disjunkte, atëherë
P(A+ B)= P(A)+P(B).
Vërtetim.
{ }
a) Probabiliteti i ngjarjes A të dhënë në formën A= E ,E ,.....,E , i përcaktuar sipas
i i i
1 2 k
barazimit (2) është shumë e numrave jonegativ, prandaj P(A)‡ 0.
{ }
b) Ngjarja e sigurt W i përmban të gjitha ngjarjet elementare, pra W = E ,E ,.....,E .
1 2 n
Prandaj nga përkufizimi 2, kemi
P(W )= p + p +....+ p ,
1 2 n
por shuma p +p +...+p =1. Prej ku P(W )=1.
1 2 n{ } { }
b) Le të jenë A= E ,E ,.....,E dhe B = E ,E ,.....,E dy ngjarje disjunkte. Shuma e
i i i j j i
1 2 k 1 2 m
këtyre ngjarjeve
{ }
A+ B = E ,E ,.....,E ,E ,E ,.....,E , përmban k+m ngjarje elementare. Probabiliteti i A+B,
i i i j j i
1 2 k 1 2 m
në bazë të përkufizimit 2 është:
( )
P(A+ B)= p + p +....+ p + p + p +....+ p =
( i 1 i 2 ) ( i k j 1 j 2 ) j m
= p + p +....+ p + p + p +....+ p = P(A)+ P(B)
i i i j j j
1 2 k 1 2 m
45

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
Shembull 9.3.3. Në një kuti ka 8 lëmshe të kuqë, 5 lëmshe të bardhë dhe 6 lëmshe të kaltër. Së
është probabiliteti që nga kutia të tërhiqet lëmsh me ngjyrë të kuqe ose të bardhë?
Zgjidhje: Shënojmë me A ngjarjen e tërheqjes së lëmshit të kuq, ndërsa me B shënojmë tërheqjen e
lëmshit të bardhë. Ngjarjet A dhe B janë ngjarje disjunkte. Gjithsej në kuti ka 8+5+6=19 lëmshe.
Njehsojmë probabilitet për A dhe B.
8 5
P(A)= dhe P(B)= . Për ngjarjen A+B: tërhiqet lëmsh me ngjyrë të kuqe ose të bardhë,
19 19
kemi:
8 5 13
P(A+ B)= P(A)+ P(B)= + = .
19 19 19
Nga teoremën 9.3.1, marrim vetitë:
( )
1. Probabiliteti i ngjarjes së pamundur është zero, d.m.th.P ˘ = 0;
2. Nëse A , A ,.....,A janë ngjarje disjunkte, atëherë
1 2 n
P(A + A +...+ A )= P(A)+ P(A )+...+P(A );
1 2 n 1 2 n
3. Nëse A˝ B, atëherë P(A)£ P(B);
4. Për ngjarjen e çfarëdoshme A të ndonjë eksperimenti vlen:
0£ P(A)£ 1
5. Për ngjarjen e kundërt A të ngjarjes së dhënë A vlen:
P(A)=1- P(A)
6. Probabiliteti i shumës së dy ngjarjeve të çfarëdoshme A dhe B është
( ) ( ) ( ) ( )
P A¨ B = P A +P B - P AB .
Vërtetimi i këtyre vetive është i thjesht, këtu vërtetojmë vetit 4 dhe 6, ndërsa të tjerat ia lejmë
lexuesit.
Vërtetimi i vetisë 4: Për cilëndo ngjarje A vlen ˘ ˝ A˝ W , nga vetia 3 del se
P(˘ )£ P(A)£ P(W ), prej ku 0£ P(A)£ 1.
Vërtetimi i vetisë 6: Le të jenë A dhe B dy ngjarje të çfarëdoshme të tilla që
{ } { }
A= E ,E ,.....,E ,E ,...,E dhe B = E ,E ,.....,E ,E ,...,E . Shuma e këtyre
i 1 i 2 i k{ i k+1 i k+m i k+1 i k+2} i k=m i k+m+1 i k+m+n
ngjarjeve A+ B = E ,E ,.....,E ,E ,E ,.....,E , ndërsa prodhimi i këtyre ngjarjeve është
{ i 1 i}2 i k i k+1 i k+2 i k+m+n
AB = E ,E ,.....,E . Probabiliteti i A+B, në bazë të përkufizimit 9.3.2 është:
i k+1 i k+2 i k+m
P ( A+B )= p + p +....+ p + p +...+ p +....+ p =
i 1 i 2 i k i k+1 i k+m i k+m+n
( )
= p +....+ p + p +...+ p +
i 1 i k i k+1 i k+m
( ) ( )
+ p +....+ p + p +....+ p - p + .+. p =
i k+1 i k+m i k+m+1 i k+m+n i k+1 i k+m
= P(A)+P(B)- P(AB).
Pra, P(A+B)= P(A)+P(B)- P(AB).
46

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

Shembull 9.3.4. Sa është probabiliteti që gjatë hedhjes së zarit të paraqitet numër që është i
plotpjesëtueshëm me 2 ose me 3?
{ }
Zgjidhje: Shënojmë me A: numër i plotpjesëtueshëm me 2, pra  A= E ,E ,E  dhe ngjarja B:
2 4 6
|     |     |     |     |     |     | {   | }   | { } |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
numër i plotpjesëtueshëm me 3, pra  B = E ,E . Ngjarja prodhim është  AB = E . Probabiliteti i
3 6 6
ngjarjes shumë A+B, është
3 2 1 4 2
|     |     |     |     | P(A+B)= | P(A)+P(B)- |     | P(AB)= | + - = = |
| --- | --- | --- | --- | ------- | ---------- | --- | ------ | ------- |
.
6 6 6 6 3

9.4. Probabiliteti i kushtëzuar. Pavarësia e ngjarjeve të rastit
Ngjarjet e rastit ne mund ti ndajmë edhe në ngjarje rasti të varura dhe  në ngjarje rasti të pavarura.
Për dy ngjarje rasti do të themi se janë ngjarje rasti të pavarura nëse paraqitja e njërës ngjarje nuk
ndikon në paraqitjen e ngjarjes tjetër. Nëse paraqitja e njërës ngjarje ndikon në paraqitjen e ngjarjes
tjetër atëherë këto ngjarje quhen ngjarje rasti të varura.

Shembull 9.4.1.  Në një kuti ka 8 lëmshe të bardhë dhe 5 lëmshe të kuqë. Probabiliteti që në
8
tërheqjen e parë të merret lëmsh i bardhë është  P(A)= . Nëse lëmshi i tërhequr nuk kthehet në
13
kuti atëherë probabiliteti që edhe në tërheqjen e dytë të marrim lëmsh të bardhë nuk do të jetë më
8
, por do të varet nga fakti se çfarë lëmshi kemi tërhequr rastin e parë. Nëse ka ndodhur ngjarja
13
A, pra në rastin e parë kemi tërhequr lëmsh të bardhë atëherë probabiliteti për të ndodhë ngjarja B:
7
(B)=
në tërheqjen e dytë marrim lëmsh të bardh do të jetë  P . Nëse në tërheqjen e parë nuk
A
12
kemi marrë lëmsh të bardhë por kemi marrë lëmsh të kuq pra, ngjarja C atëherë probabiliteti që në
8
(B)=
tërheqjen e dytë të marrim lëmsh të bardhë është  P . Domethënë ngjarja B varet nga
C
12
paraqitja e ngjarjes A. Prandaj themi se ngjarja B kushtëzohet nga ngjarja A.
|       |       | 8   |      | 7     |      | 8   |     |     |
| ----- | ----- | --- | ---- | ----- | ---- | --- | --- | --- |
|       | P(A)= |     | (B)= |       | (B)= |     |     |     |
| Pra,  |       | ,   | P    |  dhe  | P    |     | .   |     |
|       |       |     | A    |       | C    |     |     |     |
|       |       | 13  |      | 12    |      | 12  |     |     |

 Teoremë  9.4.1.  Probabiliteti  i  ngjarjes  prodhim  të  dy  ngjarjeve  të  varura  është
| P(AB)= |     | P(A)(cid:215) | P (B)  ose   | P(AB)= | P(B)(cid:215) |     | P (A).  |     |
| ------ | --- | ------------- | ------------ | ------ | ------------- | --- | ------- | --- |
|        |     |               | A            |        |               |     | B       |     |
 Vërtetim. Le të jetë n numri i ngjarjeve elementare , prej të cilave  m  (m<n)ngjarje janë të
<m)ngjarje janë të volitshme edhe për ngjarjen B. Pra,
volitshme për ngjarjen A, prej të cilave k (k
|     |     | m   |     | k   |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
P(A)= ,  P(AB)=  dhe probabiliteti i ngjarje B me kusht që të ketë ndodh ngjarja A është
|     |      | n          |               | n   |      |             |         |     |
| --- | ---- | ---------- | ------------- | --- | ---- | ----------- | ------- | --- |
|     |      | k          |               |     | m    | k           | k       |     |
|     | (B)= |            | P(A)(cid:215) |     | (B)= | (cid:215) = | =       |     |
| P   |      | . Atëherë  |               | P   |      |             | P(AB).  |     |
|     | A    |            |               | A   |      |             |         |     |
|     |      | m          |               |     | n    | m           | n       |     |
Vërejtje: Nëse ngjarjet A dhe B janë ngjarje të pavarura atëherë  P(AB)= P(A)(cid:215) P(B).

Shembull 9.4. 2. Nëse gjatë hedhjes së një zari dihet se ka rënë numër më i vogël ose i barabartë
me 4, atëherë të caktohet probabiliteti që ky numër është çift.
Zgjidhje: Shënojmë ngjarjet:
|     |     |     |     |     |     |     | 47  |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
A: ka rënë numër çift
B: ka rënë numër më i vogël ose i barabartë me 4.
Ngjarja prodhim AB: ka rënë numër çift që është më i vogël ose i barabartë me 4. Probabilitetet për
ngjarjet B dhe AB janë:
4 2 2 1
P(B)= = dhe P(AB)= = .
6 3 6 3
Probabiliteti i ngjarjes së kushtëzuar është
1
P (A)= P(AB) = 3 = 1 .
B P(B) 2 2
3
Probabiliteti i ngjarjes prodhim të dy ngjarjeve të varura mundet të përgjithësohet edhe për tri e më
shumë ngjarje të varura. Probabiliteti për prodhimin e tri ngjarjeve të varura do të jetë:
P(ABC)= P(A)(cid:215) P (B)(cid:215) P (C).
A AB
9.5. Degëzimet
Gjatë zgjidhjes së shumë problemeve në teorinë e probabilitetit, përdoren edhe të ashtuquajturat
“degëzime”.
Shembull 9.5.1. Çanta përmban 8 lëmshe të bardhë dhe 3 lëmshe të zi. Tërhiqen dy lëmshe njëri
pas tjetrit. Të caktohet probabiliteti që të merret një lëmsh i bardh dhe një lëmsh i zi, në çfarëdo
renditje:
a) nëse lëmshi i parë është rivendosur në çantë,
b) lëmshi i parë nuk është rivendosur në çantë.
Zgjidhja.
a) Le të jetë:
B ngjarja: “në herën e parë nxirret topi i bardhë”
1
B ngjarja: “në herën e dytë nxirret topi i bardhë”
2
Z ngjarja: “në herën e parë nxirret topi i zi”
1
Z ngjarja: “në herën e dytë nxirret topi i zi”.
2
Rezultatet e paraqitjes së këtyre ngjarjeve i marrim me anë të degëzimeve:
a)
48

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
Vërejmë se P ( B (cid:215) B )= 8 (cid:215) 8 = 64 , P ( B (cid:215) Z )= 8 (cid:215) 3 = 24 ,
1 2 11 11 121 1 2 11 11 121
P ( Z (cid:215) B )= 3 (cid:215) 8 = 24 , P ( Z (cid:215) Z )= 3 (cid:215) 3 = 9
1 2 11 11 121 1 2 11 11 121
Atëherë probabiliteti që të merret një lëmsh i bardh dhe një lëmsh i zi është
P ( B(cid:215) Z )= P ( B(cid:215) Z +) P ( B(cid:215) Z=) 24 + 24 = 48 .
1 2 2 1 121 121 121
b)
Vërejmë se P ( B (cid:215) B )= 8 (cid:215) 7 = 56 , P ( B (cid:215) Z )= 8 (cid:215) 3 = 24 ,
1 2 11 10 110 1 2 11 10 110
P ( Z (cid:215) B )= 3 (cid:215) 8 = 24 , P ( Z (cid:215) Z )= 3 (cid:215) 2 = 6
1 2 11 10 110 1 2 11 10 110
Atëherë probabiliteti që të merret një lëmsh i bardh dhe një lëmsh i zi është
P ( B(cid:215) Z )= P ( B(cid:215) Z +) P ( B(cid:215) Z=) 24 + 24 = 48 = 24 .
1 2 2 1 110 110 110 55
2
Shembull 9.5.2. Probabiliteti që monedha jo homogjene të bie në numër (N) është . Monedha
3
hidhet tri herë. Të caktohet probabiliteti që
a) asnjë N të mos bie;
b) të ketë më tepër N se sa F (figurë).
Zgjidhje:
49

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

| (               | )                        |               |     |       |         |           |     |
| --------------- | ------------------------ | ------------- | --- | ----- | ------- | --------- | --- |
|                 | 1                        | 1 1 1         |     |       |         |           |     |
| a) P N(cid:215) | N(cid:215) N = (cid:215) | (cid:215) =   |     |       |         |           |     |
|                 | 3                        | 3 3 27        |     |       |         |           |     |
|                 |                          |               |     | 2 2 2 | 2 2 1 2 | 1 2 1 2 2 | 20  |
b)    P(NNN)+P(NNF)+P(NFN)+P(FNN)= (cid:215) (cid:215) + (cid:215) (cid:215) + (cid:215) (cid:215) + (cid:215) (cid:215) =

|     |     |     |     | 3 3 3 | 3 3 3 3 | 3 3 3 3 3 | 27  |
| --- | --- | --- | --- | ----- | ------- | --------- | --- |

9.6. Probabiliteti i plotë (total). Formula e Bajesit
, të cilët formojnë një zbërthim të bashkësisë W
| Le të jenë dhënë  ngjarjet H |     |     | ,H ,...,H |     |     |     | , gjegjësisht  |
| ---------------------------- | --- | --- | --------- | --- | --- | --- | -------------- |
|                              |     |     | 1 2 n     |     |     |     |                |
n
∑ =W
H , me probabilitet përkatësisht P(H ),k =1,...,n të cilat janë të njohura paraprakisht.
| k   |     |     |     | k   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- |
k=1
 Shënojmë me A ngjarjen e çfarëdoshme e cila realizohet nëpërmjet të paktën njërën nga këto
ngjarje. Për të caktuar probabilitetin e ngjarjes A, duhet të njehsohen probabilitetet e kushtëzuara
), d.m.th. realizimi i hipotezave të veçanta që çuanë në paraqitjen e ngjarjes A.
P(A|H
k

Përkufizim 9.6.1. Formula e probabilitetit total:  Nëse ngjarjet   formojnë sistem të
H ,H ,...,H
|     |     |     |     |     |     | 1 2 | n   |
| --- | --- | --- | --- | --- | --- | --- | --- |
plotë hipotezash në lidhje me ngjarje A, atëherë
P(A)=∑ n
|     |     |     |     | P(H | )P(A|H | )   |     |
| --- | --- | --- | --- | --- | ------ | --- | --- |
k k
k=1

Shembull 9.6.1. Në provimin e Matematikës kanë hyrë 60% të studentëve të cilët janë nënshtruar
provimit për herë të parë dhe 40% janë të tjerë. Probabiliteti që studentët që janë për herë të parë të
japin provimin është 0,3, ndërsa për të tjerët është 0,4. Të njehsohet probabiliteti që studenti I
zgjedhur rastësisht të japi provimin.
Zgjidhje.  Le të jenë   ngjarjet që studenti nënshtrohet për herë të parë, përkatësisht më
H ,H
1 2
shumë  herë,  probabilitetet  përkatëse  janë  )=0,6,  )=0,4.  Shënojmë  me  A  ngjarjen:
|     |     |     |     | P(H | P(H |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     | 1   | 2   |     |     |
studenti kalon provimin,  ndërsa  P(A|H ),i=1,2 probabilitetet që studenti e kalon në herën e parë
i
provimin, përkatësisht në herët e tjera. Pra, P(A|H )=0,3 dhe P(A|H )=0,4.
|     |     |     |     | 1   |     | 2   |     |
| --- | --- | --- | --- | --- | --- | --- | --- |
Rrjedhimisht,
|     |     | P(A)=P(H | )P(A|H | )+P(H )P(A|H | )=0,6(cid:215) 0,3+0,4(cid:215) | 0,4=0,34 |     |
| --- | --- | -------- | ------ | ------------ | ------------------------------- | -------- | --- |
|     |     |          | 1 1    | 2            | 2                               |          |     |

|     |     |     |     | 50  |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

Shembull 9.6.2.  Një artikull i caktuar prodhohet në tri fabrika të ndryshme. Është e njohur që
fabrika e parë prodhon dy herë më shumë se e dyta, ndërsa e dyta dhe e treta kanë prodhimtari të
njëjtë. Gjthashtu dihet që  prodhimet e fabrikës së parë dhe të dytë janë 2% me defekt, ndërsa të
fabrikës së tretë 4% janë me defekt. Të gjithë prodhimet ndodhen në të njëjtën depo. Rastësisht
zgjedhet një artikull. Të gjendet probabiliteti që ai është me defekt.

 Zgjidhje. Nëse me H , H , H  shënojmë ngjarjet që prodhimi është nga këto fabrikat përkatëse,
|     | 1   | 2   | 3   |     |     |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
atëherë nga të dhënat e detyrës kemi P(H )=2P(H ), P(H )=P(H ), P(H )+P(H )+P(H )=1
|                   |     |         |       |     | 1       | 2   | 2   | 3   | 1 2 | 3   |
| ----------------- | --- | ------- | ----- | --- | ------- | --- | --- | --- | --- | --- |
| Nga ku marrim P(H | )=  | 1 , P(H | )=P(H |     | )= 1 .  |     |     |     |     |     |
|                   | 1   | 2       | 2     |     | 3 4     |     |     |     |     |     |
Nëse shënojmë me A ngjarjen që paraqet tërheqjen e artikullit me defekt, kemi:
|     |     |     |     | )=P(A|H | )=0,02 dhe P(A|H |     |     | )=0,04.  |     |     |
| --- | --- | --- | --- | ------- | ---------------- | --- | --- | -------- | --- | --- |
P(A|H
|     |     |     |     | 1   | 2   |     |     | 3   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Në bazë të formulës së probabilitetit të plotë
|     |     |     |     |     |     |     |     | 1   | 1 1 |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
P(A)=P(H )P(A|H )+P(H )P(A|H )+P(H )P(A|H )= (cid:215) 0,02+ (cid:215) 0,02+ (cid:215) 0,04=0,025
|     | 1   | 1   |     | 2   | 2   | 3   | 3   |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     |     |     |     | 2   | 4 4 |     |
Në shembullin e mësipërm nëse parashtrojmë pyetjen se  cilës fabrikë i takon artikulli, atëherë me
anë të formulës së probabilitetit të plotë nuk mundemi të përgjigjemi. Përgjigjen e kësaj pyetje e
jep formula e Bajesit

Përkufizim 9.6.2. Nëse ngjarjet H ,H ,...,H  formojnë sistem të plotë hipotezash në lidhje me
|     |     |     |     | 1 2 | n   |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
ngjarje A dhe P(A)>0, atëherë
|     |     |     |      | P(H )P(A|H | )   | P(H | )P(A|H | )               |     |     |
| --- | --- | --- | ---- | ---------- | --- | --- | ------ | --------------- | --- | --- |
|     |     | P(H | |A)= | i          | i   | =   | i      | i ,i=1,2,...,n  |     |     |
i
|     |     |     |     | P(A) |     | n   |     |     |     |     |
| --- | --- | --- | --- | ---- | --- | --- | --- | --- | --- | --- |
∑
|     |     |     |     |     |     | P(H | )P(A|H | )   |     |     |
| --- | --- | --- | --- | --- | --- | --- | ------ | --- | --- | --- |
|     |     |     |     |     |     |     | k      | k   |     |     |
k=1
Formula e Bajesit ndryshe njihet edhe si formula e probabiliteteve të hipotezave (shkaqeve), sepse
në ngjarjet H , H ,.. .,H  mund të shohim si shkaqe të ndryshme që çojnë në realizimin e ngjarjes A.
1 2 n

Shembull 9.6.3. Në shembullin e mësipërm, probabiliteti që artikulli i tërhequr rastësisht me defekt
ti përkas fabrikës së parë është

|     |     |     |     |     |      | 0,5(cid:215) 0,02 |       |     |     |     |
| --- | --- | --- | --- | --- | ---- | ----------------- | ----- | --- | --- | --- |
|     |     |     |     |     | |A)= |                   | =0,4  |     |     |     |
P(H
|     |     |     |     |     | 1   | 0,025 |     |     |     |     |
| --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- |
Shembull 9.6.4. Hidhet kubi. Nëse te kubi paraqitet 1 ose 6, atëherë merret lëmshi nga kutia e
parë, në të kundërt merret nga kutia tjetër. Kutia e parë përmban 3 lëmshe të zi, 2 të bardhë dhë 1 të
gjelbërt, ndërsa kutia e dytë përmban 4 lëmshe të bardhë dhe 2 lëmshe të gjelbërt.
a)  Të gjendet probabiliteti që është tërheqë lëmsh i bardhë
b)  Të gjendet probabiliteti që është marr nga kutia e parë, nëse dimë që është i bardhë.
Zgjidhje.  a) Nëse H ,H  janë ngjarjet që është zgjedhur kutia e parë përkatësisht kutia e dytë
1 2

|     |     | 2   | 1       |     | 4 2 |         | 2   | 1         | 4 2    |     |
| --- | --- | --- | ------- | --- | --- | ------- | --- | --------- | ------ | --- |
|     |     | )=  | = , P(H | )=  | =   | , P(A|H | )=  | = , P(A|H | )= =   |     |
P(H
|     |          | 1 6 | 3      | 2   | 6 3   |        | 1 6 | 3                     | 21 6 3  |     |
| --- | -------- | --- | ------ | --- | ----- | ------ | --- | --------------------- | ------- | --- |
|     |          |     |        |     |       |        | 1   | 1 2 2                 | 1 4 5   |     |
|     | P(A)=P(H |     | )P(A|H |     | )+P(H | )P(A|H | )=  | (cid:215) + (cid:215) | = + =   |     |
|     |          |     | 1      | 1   |       | 2      | 2   |                       |         |     |
|     |          |     |        |     |       |        | 3   | 3 3 3                 | 9 9 9   |     |

|     |     |     |     |     |     | 51  |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

|           |      | P(H )P(A|H | )   | 1/9 1 |     |     |     |
| --------- | ---- | ---------- | --- | ----- | --- | --- | --- |
| b)    P(H | |A)= | 1          | 1 = | =     |     |     |     |
1
|     |     | P(A) |     | 5/9 5 |     |     |     |
| --- | --- | ---- | --- | ----- | --- | --- | --- |

9.7. Ndryshoret e rastit
Kuptimi ndryshore rasti është një ndër kuptimet kryesore të teorisë së probabilitetit. Shumë shpesh
( )
|     |     |     |     | ˛ W |     | ˛   |     |
| --- | --- | --- | --- | --- | --- | --- | --- |
ndodh që çdo ngjarje elementare  E  ti shoqërohet ndonjë numër  X E R.
i i

Shembull  9.7.1.  Kryejmë  eksperimentin  e  hedhjes  së  zarit.  Shënojmë  me
| W = | {   |     | }   |     |     |     | ˛ W |
| --- | --- | --- | --- | --- | --- | --- | --- |
E ,E ,E ,E ,E ,E  hapësirën e ngjarjeve elementare. Ngjarja elementare  E  tregon se
|     | 1 2 3 | 4 5 | 6   |     |     |     | i   |
| --- | ----- | --- | --- | --- | --- | --- | --- |
në faqen e sipërme janë paraqitur i pika. Në lidhje me këtë eksperiment mundemi të shqyrtojmë
|     |     |     |     | (   | )   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- |
funksionin  X :W fi R , të dhënë me  X E =i,  i =1,2,3,4,5,6. Funksioni X do të marri vlera nga
i
{ }
bashkësia  R = 1,2,3,4,5,6  dhe çdonjërën nga këto vlera do ta pranoj me një probabilitet të
X
caktuar. Rrjedhimisht, për shembullin konkret do të kemi
|     |     |     | {   | } (      | ) 1           |                |     |
| --- | --- | --- | --- | -------- | ------------- | -------------- | --- |
|     |     |     | P X | =i = P E | = , për çdo i | =1,2,3,4,5,6.  |     |
|     |     |     |     |          | i 6           |                |     |
Shembull 9.7.2. Tre ushtarë gjuajnë në të njëjtën shënjestër. Probabiliteti që ushtari A të qëllojë në
shënjestër është 0,5, për ushtarin B është 0,4 dhe për ushtarin C është 0,3. Shënojmë me X të
qëlluarat në shënjestër. Atëherë X do të jetë ndryshore e cila mund të marr një nga vlerat 0,1,2 dhe
3. Probabiliteti i këtyre vlerave nuk është i njëjtë, prandaj do ti njehsojmë:
|                               |     |     |     |                                      | ( )           |                         |     |
| ----------------------------- | --- | --- | --- | ------------------------------------ | ------------- | ----------------------- | --- |
|                               |     |     |     | ( )                                  |               |                         |     |
|                               |     |     |     | =0 =                                 | =0,5(cid:215) | 0,6(cid:215) 0,7=0,21.  |     |
|                               |     |     | P   | X P                                  | ABC           |                         |     |
| Meqenëse ngjarjet A,B,C,A,B,C |     |     |     |  janë ngjarje të pavarura, prandaj:  |               |                         |     |
|                               |     |     |     | ( )                                  | ( )           |                         |     |
|                               |     |     |     | =1-                                  | =1-           | 0,5=0,5                 |     |
|                               |     |     |     | P A                                  | P A           |                         |     |
( )
|     |     |     |     | =1- | ( ) =1- | 0,4=0,6  |     |
| --- | --- | --- | --- | --- | ------- | -------- | --- |
|     |     |     |     | P B | P B     |          |     |
( )
( )
|     |     |     |     | P C =1- | P C =1- | 0,3=0,7  |     |
| --- | --- | --- | --- | ------- | ------- | -------- | --- |
Në mënyrë analoge marrim:
|     |     |     |     | (          | ) ( )      | ( )   |     |
| --- | --- | --- | --- | ---------- | ---------- | ----- | --- |
|     |     |     | (   | )          |            |       |     |
|     |     |     | P X | =1 = P ABC | + P ABC +P | ABC = |     |

|     |     |     | =0,5(cid:215) | 0,6(cid:215) 0,7+0,5(cid:215) | 0,4(cid:215) 0,7+0,5(cid:215) | 0,6(cid:215) 0,3=0,44 |     |
| --- | --- | --- | ------------- | ----------------------------- | ----------------------------- | --------------------- | --- |
|     |     |     |               | (                             | ) ( )                         | ( )                   |     |
|     |     |     | (             | =2 ) =                        | +P                            | + =                   |     |
|     |     |     | P X           | P ABC                         | ABC                           | P ABC                 |     |

|     |     |     | =0,5(cid:215) | 0,4(cid:215) 0,7+0,5(cid:215) | 0,6(cid:215) 0,3+0,5(cid:215) | 0,4(cid:215) 0,3=0,29 |     |
| --- | --- | --- | ------------- | ----------------------------- | ----------------------------- | --------------------- | --- |
|     |     |     |               |                               | 52                            |                       |     |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

|     |     | (   | =3 ) = ( | ) = ( ) (cid:215) | ( ) (cid:215) ( ) | =0,5(cid:215) 0,4(cid:215) | 0,3=0,06.  |
| --- | --- | --- | -------- | ----------------- | ----------------- | -------------------------- | ---------- |
|     |     | P X | P ABC    | P A               | P B P C           |                            |            |
Shuma e këtyre probabiliteteve është:
|     |     |     | ( =0 | ) + ( =1 ) | +P ( =2 ) | +P ( | =3 ) = |
| --- | --- | --- | ---- | ---------- | --------- | ---- | ------ |
|     |     |     | P X  | P X        | X         | X    |        |
=0,21+0,44+0,29+0,06=1

Përkufizim 9.7.1. Funksioni X i cili çdo ngjarje të rastit w ˛ W   i përcakton një vlerë reale të vetme
| X(w )quhet ndryshore e rastit, pra X |     |     |     | :W fi R  |     |     |     |
| ------------------------------------ | --- | --- | --- | -------- | --- | --- | --- |
Ndryshoret e rastit do ti shënojmë me shkronja të mëdha X,Y,Z,..

Dallojmë dy lloje ndryshoresh të rastit edhe atë ndryshore të rastit diskrete dhe ndryshore të rastit
të vazhdueshme. Por, ne do të shqyrtojmë  vetëm ndryshoren e rastit diskrete.

9.7.1. Ndryshorja diskrete e rastit

Përkufizim 9.7.1.  Funksioni X, i cili në rezultatet e eksperimentit merr një varg vlerash të fundme
ose të pafundme, por të numërueshme  x ,x ,...,x ,.. quhet ndryshore diskrete e rastit, nëse çdo
|          |                                                         |     |     | 1 2 | k   |      |     |
| -------- | ------------------------------------------------------- | --- | --- | --- | --- | ---- | --- |
| vlere  x | ,  i =1,2,...k,.. i përgjigjet probabiliteti i caktuar  |     |     |     | p   | .    |     |
|          | i                                                       |     |     |     | i   |      |     |

Varësia funksionale e probabilitetit p nga x përcakton ligjin e shpërndarjes së probabiliteteve të
ndryshores diskrete X, të cilin e paraqesim në formë të tabelës:
|     |     |     |     | x x .... | x      | n      |     |
| --- | --- | --- | --- | --------- | ------- | ------ | --- |
|     |     |     | =   | 1 2       | n       | ∑ =1.  |     |
|     |     |     | X   |          | , ku   | p      |     |
i
|     |     |     |     | p p .... | p  |     |     |
| --- | --- | --- | --- | --------- | --- | --- | --- |
|     |     |     |     | 1 2       | n   | i=1 |     |
Shpërndarja e ndryshores së rastit mund të paraqitet edhe grafikisht në një sistem koordinativ . Në
boshtin X paraqesim vlerat x  të ndryshores X, ndërsa në boshtin Y paraqesim vlerat përkatëse të
i
probabiliteteve p, kështu kur i bashkojmë pikat A(x,p) fitojmë poligonin e shpërndarjes.
|     |     | i   |     |     | i i |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     | 53  |     |     |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

Fig. 9.7.1
Shembull 9.7.1.  Ligji shpërndarjes së probabiliteteve për shembullin 9.7.2 është:
|     |     |     |     |     |    |     |     |     |    |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
|     |     |     |     |     | 0   |     | 1   | 2   | 3   |     |     |     |
|     |     |     |     | X   | =   |     |     |     | .  |     |     |     |

|     |     |     |     |     | 0,21 | 0,44 | 0,29 | 0,06 |     |     |     |     |
| --- | --- | --- | --- | --- | ----- | ---- | ---- | ----- | --- | --- | --- | --- |
Shembull 9.7.2. Ndryshorja diskrete e rastit është dhënë me ligjin e shpërndarjes
|     |     |     |     |     | -  | 2   | - 1 | 1 2 |    |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
=
|     |     |     |     |     | X   |     |         |      | .  |     |     |     |
| --- | --- | --- | --- | --- | ---- | --- | ------- | ---- | --- | --- | --- | --- |
|     |     |     |     |     | 0,1 |     | 0,3 0,2 | 0,4 |     |     |     |     |
=
| Të caktohet ligji i shpërndarjes për ndryshoren Y |     |     |     |     |     |     | X2.  |     |     |     |     |     |
| ------------------------------------------------- | --- | --- | --- | --- | --- | --- | ---- | --- | --- | --- | --- | --- |
Zgjidhje:
|     |     |     |     |     |     |     |     |     |     | {f )f, | (xf), | }   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ------ | ----- | --- |
Vlerat  y ,y ,y ,...  të  ndryshores  Y  caktohen  nga  bashkësia (x (x ),.... .  Nëse
|       | 1   | 2 3                      |     |     |     |     |     |     |     | 1   | 2   | 3   |
| ----- | --- | ------------------------ | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| f )=f |     |                          |     |     | =   | +   |     |     |     |     |     |     |
| (x    | (x  | ) atëherë probabilitetiq |     |     | p   | p   | .   |     |     |     |     |     |
| i     | i   |                          |     |     | i i | i   |     |     |     |     |     |     |
| 1     |     | 2                        |     |     |     | 1 2 |     |     |     |     |     |     |
Vërejmë që:
|     |     | f )=(- | )2= | 4, f | )=(- |     | )2= 1, f | )=12 | =1, f | )=22 | =4.  |     |
| --- | --- | ------ | --- | ---- | ---- | --- | -------- | ---- | ----- | ---- | ---- | --- |
|     |     | (x     | 2   |      | (x   | 1   |          | (x   |       | (x   |      |     |
|     |     | 1      |     |      | 2    |     |          | 3    |       | 4    |      |     |
Ligji i shpërndarjes për ndryshoren Y, do të jetë:
|     |     |     |     |     | 4 1 | 1   | 4    |    | 1    | 4  |     |     |
| --- | --- | --- | --- | ---- | --- | --- | ---- | ---- | ---- | --- | --- | --- |
|     |     |     |     | =    |     |     |      | =    |      |     |     |     |
|     |     |     | Y   |     |     |     |      |    |      | .  |     |     |
|     |     |     |     | 0,1 | 0,3 | 0,2 | 0,4 | 0,5 | 0,5 |     |     |     |
Le të jenë X dhe Y dy ndryshore diskrete të rastit të përkufizuara në bashkësinë W ( )
|     |     |     |     |     |     |     |     |     |     |     |     | . Sistemi  X,Y   |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | ---------------- |
quhet ndryshore rasti dydimensionale dhe ligji i shpërndarjes së saj jepet me
|     |     |     |     |     | P(x ,y | )=P(X | =x  | ,Y = y | ).  |     |     |     |
| --- | --- | --- | --- | --- | ------ | ----- | --- | ------ | --- | --- | --- | --- |
|     |     |     |     |     | i      | j     |     | i      | j   |     |     |     |
Nëse ndryshoret diskrete X dhe Y janë të pavarura, atëherë:
|     |     |     |     |     |     |     | 54  |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
P ( x ,y ) = p = P ( X = x ,Y = y ) = P ( X = x )(cid:215) P ( Y= y ) .
i j ij i j i j
( )
Shembull 9.7.3. Të gjendet ligji i shpërndarjes Z =Z X,Y = X +Y nëse
- 2 0 1  - 1 2 
X =  dhe Y =   .
1/4 1/4 1/2 1/3 2/3
{ }
Zgjidhje.Vërejmë që Z = X +Y˛ - 3,- 1,0,2,3 . Njehsojmë probabilitetin për çdo vlerë të Z-së.
( ) ( ) ( ) ( ) 1 1 1
P z =- 3 = P x = - 2,y = - 1 = P x =- 2 (cid:215) P y =- 1 = (cid:215) =
4 3 12
( ) ( ) ( ) ( ) 1 1 1
P z =- 1 = P x =0,y =- 1 = P x =0 (cid:215) P y =- 1 = (cid:215) =
4 3 12
( ) ( ) ( )
P z =0 = P x =- 2,y =2 +P x=1,y =- 1 =
( ) ( ) ( ) ( ) 1 2 1 1 1
= P x =- 2 (cid:215) P y =2 +P x =1 (cid:215) P y =- 1 = (cid:215) + (cid:215) =
4 3 2 3 3
( ) ( ) ( ) ( ) 1 2 1
P z =2 = P x =0,y = 2 = P x =0 (cid:215) P y =2 = (cid:215) =
4 3 6
( ) ( ) ( ) ( ) 1 2 1
P z =3 = P x =1,y =2 = P x =1 (cid:215) P y =2 = (cid:215) = .
2 3 3
Kështu, ligji i shpërndarjes ë probabilteteve për ndryshoren Z është:
 - 3 - 1 0 2 3 
Z =   .
1/12 1/12 1/3 1/6 1/3
Vlera e e ndryshores së rastit nuk mund të parashihet përpara kryerjes së eksperimentit. Funksioni i
shpërndarjes është karakteristikë e ndryshores së rastit X e cila mundëson njehsimin e probabilitetit
kur ndryshorja merr vlera në një interval të boshtit ox. Me fjalë të tjera, ndryshorja e rastit X(w )
merr ndonjë vlerë x me probabilitet P(w ).
Në vend që të flasim për probabilitete ku ndryshorja e rastit merr vlerë konkrete, ne flasim për
probabilitete ku vlera e ndryshores së rastit i takon një inervali. Arsyeja e kësaj janë eksperimentet të cilët
nuk kanë përfundim në një bashkësi dikrete.
55

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
Fig.9.7.2.
Përkufizim 9.7.2. Le të jetë X ndryshore e rastit. Funksioni real F i definuar si
{ } { }
w ˛ W |X(w )£ x fi Pw ˛ W |X(w )£ x =F(x)
quhet funksion i shpërndarjes së ndryshores së rastit X.
Funksioni i shpërndarjes jep të gjtha vetitë kryesore të ndryshores së rastit. Për dallim nga vlerat e
ndryshores së rastit të cilat nuk dihen përpara zhvillimit të eksperimentit, funksioni i shpërndarjes
plotësisht është i njohur. Për këto arsye, teoria e probabilitetit merret me shqyrtimin e
shpërndarjeve dhe funksionit të shpërndarjes së një ndryshorje të rastit X.
Shembull 9.7.4. Nëse ndryshorja e rastit X është përfundimi i hedhjes së kubit, ne përpara hedhjes
( ) 4
së kubit dime që F(x)=P X £ 4 = , dhe pse nuk dimë saktësisht se cili numër do të paraqitet.
6
9.8. Karakteristikat numerike të ndryshores diskrete të rastit
Le të jetë ndryshorja diskrete e rasti X, e cila në rezultatet e eksperimentit merr një varg vlerash të
fundme x ,x ,...,x , çdonjërës prej të cilave u përgjigjet probabiliteti i caktuar p , i =1,2,..,n.
1 2 n i
Përkufizim 9.8.1. Pritje matematike të ndryshores diskrete të rastit X, do të quajmë shprehjen:
E ( X ) = p x + p x +....+ p x =∑ n p x , ku ∑ n p =1.
1 1 2 2 n n i i i
i=1 i=1
Shembull 9.8.1. Të njehsohet pritja matematike për ndryshoren e rasti X, shpërndarja e të cilës
është dhënë me tabelën:
- 2 - 1 1 2 
X =  
0,1 0,3 0,2 0,4
Zgjidhje. Në bazë të formulës së pritjes matematike, marrim:
( )
E X = p x + p x +....+ p x =
1 1 2 2 n n
=0,1(cid:215) (- 2)+0,3(cid:215) (- 1)+0,2(cid:215) 1+0,4(cid:215) 2=- 0,2- 0,3+0,2+0,8=0,5.
Vlejnë vetit:
1. E(c)=c, ku c është konstante e çfarëdoshme,
56

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

E(cX)=cE(X),
  2.
+Y)= E(X)+E(Y),
  3.   E(X
  4.  Nëse X dhe Y janë ndryshore të rastit të pavarura, atëherë
E(XY)= E(X)(cid:215)
         E(Y).

Shembull 9.8.2. Le të jenë X dhe Y ndryshore rasti të pavarura, shpërndarjet e të cilave janë:
|     |  1  | 3 5     |  1  | 2   |
| --- | ---- | -------- | ---- | ---- |
|     | =    |          | =    |      |
|     | X   | dhe   Y |     | .   |
|     | 0,4 | 0,3 0,3 | 0,3 | 0,7 |
+Y) dhe E(XY).
Të njehsohen  E(X
Zgjidhje: Njehsojmë pritjet matematike E(X) dhe E(Y):
| ( ) |                                             |            | ( )               |                        |
| --- | ------------------------------------------- | ---------- | ----------------- | ---------------------- |
| E X | =0,4(cid:215) 1+0,3(cid:215) 3+0,3(cid:215) | 5= 2,8dhe  | E Y =0,3(cid:215) | 1+0,7(cid:215) 2=1,7.  |
Duke përdorur vetit e mësipërme marrim:
|     | E(X +Y)= | E(X)+E(Y)=2,8+1,7=4,5           |            |     |
| --- | -------- | ------------------------------- | ---------- | --- |
|     | E(XY)=   | E(X)(cid:215) E(Y)=2,8(cid:215) | 1,7=4,76.  |     |

Shembull 9.8.3. Në një Hotel, çmimi i fjetjes dhe mëngjesit është si vijon:
•  Për dhomën për një mysafir 12 euro;
•  Për dhomën për dy mysafirë 17 euro;
•  Për dhomën për tre mysafirë  22 euro;
•
Për dhomën për katër mysafirë 25 euro.
Probabilitetet për numrin e musafirëve që mund të kërkojnë dhomë në hotel gjatë një nate janë:
              P(1 mysafirë) = 0,17; P(2 mysafirë) = 0,43;
              P(3 mysafirë) = 0,25; P(4 mysafirë) = 0,15.
Të caktohet fitimi ditor që pritet.
Zgjidhje.
E(x)=12(cid:215) 0,17+ 17(cid:215) 0,43+ 22(cid:215) 0,2+5 2(cid:215)5 0,1=5 2,0+4 7,3+1 5+,5 3,7=5
18,6.
Pra, të hyrat ditore mesatarisht  për një shtrat me gjithë mëngjes do të jetë 18,6 euro.
Shënim: Kjo vlerë mesatare ndoshta nuk arrihet për një ditë, por këtu fjala është për një periudhë
më të gjatë kohore.

Shembull 9.8.4. Një tabelë shënjestrash është ndarë në tri rrathë koncentrik në të cilën janë
shënuar  pikët  8,  9  dhe  10.  Për  gjuajtjet  e  dy  ushtarëve  janë  dhënë  ligjet  e  shpërndarjes  së
probabiliteteve:
|     |  8 9    | 10      |  8      | 9 10 |
| --- | -------- | -------- | -------- | ----- |
|     | X =      | dhe   Y | =        | .    |
|     |         |          |         |       |
|     | 0,1 0,3 | 0,6     | 0,2 0,1 | 0,7  |

Të njehsohet pritja matematike e pikëve të grumbulluara për të dy ushtarët.
Zgjidhje. Njehsojmë pritjet matematike për të dy ushtarët:
|     | ( ) =0,1(cid:215) | 8+0,3(cid:215) 9+0,6(cid:215) | 10=9,5  |     |
| --- | ----------------- | ----------------------------- | ------- | --- |
E X
|     | ( )               |                               |          |     |
| --- | ----------------- | ----------------------------- | -------- | --- |
|     | E Y =0,2(cid:215) | 8+0,1(cid:215) 9+0,7(cid:215) | 10=9,5.  |     |

  57

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
Vërejmë se të dy ushtarët presin të grumbullojnë numër të njëjtë pikash edhe pse shpërndarjet e
ndryshoreve të rastit X dhe Y ndryshojnë. Prandaj lind nevoja për marrjen e një karakteristike të re
numerike.
Përkufizim 9.8.2. Dispersion të ndryshores diskrete të rastit X, do të quajmë shprehjen:
D ( X )= E ( X - E(X) )=
.
=( x - E(X) )(cid:215)2 p+ ( x- E(X(cid:215)) )2+p +.... -( x E((cid:215)X) )2 p
1 1 2 2 n n
Me veprime të thjeshta matematike, formula e mësipërme sillet në:
( )
( ) ( )
D X = E X2 - E(X) 2,
( )
ku E X2 = p x2 + p x2 +....+ p x2.
1 1 2 2 n n
Shembull 9.8.5. Të njehsohen dispersionet për ndryshoret e rastit X dhe Y, nga shembulli 4.
( ) ( )
Zgjidhje. Pritjet matematike ishin E X =9,5 dhe E Y =9,5, njehsojmë tani:
( )
E X2 =0,1(cid:215) 82 +0,3(cid:215) 92 +0,6(cid:215) 102 =90,7
( )
E Y2 =0,2(cid:215) 82 +0,1(cid:215) 92 +0,7(cid:215) 102 =90,9.
Për dispersionet marrim:
( )
( ) ( )
D X = E X2 - E(X) 2 =90,7- 9,52 =0,45
( )
( ) ( )
D Y = E Y2 - E(Y) 2 =90,9- 9,52 =0,65.
( ) ( )
Meqenëse D X < D Y , ne mundemi të përfundojmë se ushtari i parë ka shpërndarje më
homogjene të pikëve në krahasim me ushtarin e dytë, prandaj lirisht mund të themi se ushtari i parë
është qëllues më i mirë.
9.9. Shpërndarja binomial
Shqyrtojmë shembullin:
Shembull 9.9.1. Tre ushtarë gjuajnë në një shënjestër në mënyrë të pavarur njëri nga tjetri
Probabiliteti që ushtari A të qëllojë në shënjestër është 0,6, për ushtarin B është 0,5 dhe për ushtarin
C është 0,8.
a) Shënojmë me X të qëlluarat në shënjestër. Atëherë X do të jetë ndryshore e cila mund të
marr një nga vlerat 0,1,2 dhe 3. Të gjendet ligji i shpërndarjes së probabiliteteve.
b) Të njehsohet P(1<x£ 3)
Zgjidhje. Meqenëse ngjarjet A,B,C,A,B,C janë ngjarje të pavarura, prandaj:
P(A)=1- P(A)=1- 0,6=0,4
P(B)=1- P(B)=1- 0,5=0,5
P(C)=1- P(C)=1- 0,8=0,2
Kështu, marrim:
P(X =0)=P(ABC)=0,4(cid:215) 0,5(cid:215) 0,2=0,04
P(X =1)=P(ABC)+P(ABC)+P(ABC)=0,26
58

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
P(X =2)=P(ABC)+P(ABC)+P(ABC)=0,46
P(X =3)=P(ABC)=0,24
Shuma e këtyre probabiliteteve është:
P(X =0)+P(X =1)+P(X =2)+P(X =3)=1
N d ë r s a ligji i sh përnda rjes
 0 1 2 3 
X =  
0,04 0,26 0,46 0,24
b)Nga tabela e ligjit të shpërndarjes, marrim:
P(1<x£ 3)=0,46+0,24=0,7
Shembull 9.9.2. Të përcaktohet ligji i shpërndarjes së probabiliteteve të ndryshore së rastit X nga
shembulli paraprak, nëse të gjithë ushtarët gjuajnë me probabilitet të njëjtë p (0<p<1).
Zgjidhje. Nëse në detyrën paraprake vendosim P(A)=P(B)=P(C)= p dhe
P(A)=P(B)=P(C)=1- p=q, atëherë
P(X =0)=P(ABC)=qqq=q3 =C0p0q3
3
P(X =1)=P(ABC)+P(ABC)+P(ABC)= pq2 + pq2 + pq2 =3pq2 =C1pq2
3
P(X =2)=P(ABC)+P(ABC)+P(ABC)= p2q+ p2q+ p2q=3p2q=C2p2q
3
P(X =3)=P(ABC)= p3 =C3p3q0
3
Shkurt, këto probabilitete mund ti shkruajmë në formën
P =Cipiq3- i, i=0,1,2,3
i 3
Për ndryshoren e tillë themi se ka shpërndarje binomial me parametra 3 dhe p. ShënojmëX ~B(3,p)
Le ta zëmë se kryejmë një eksperiment binomial,domethënë se kryejmë n prova të pavarura në
lidhje me një ngjarje A. Si rezultat i këtij eksperimenti binomial në secilën provë ndodh ngjarja A
me probabilitet p ose nuk ndodh ngjarja A; domethënë ndodh ngjarja Ā me probabilitet q = 1- p.
Shënojmë me X madhësinë që tregon numrin e ndodhjes së ngjarjes A pas kryerjes së eksperimentit
d.m.th pas kryerjes së n provave. Është e qartë se X është madhësi rasti diskrete me vlera të
mundshme 0,1,2,...,n.
Përkufizim 9.9.1: Numri X i ndodhjes së ngjarjes A në n provat e eksperimentit binomial quhet
madhësi rasti binomiale.
Le të gjejmë ligjin e shpërndarjes së probabiliteteve të madhësisë së rastit diskrete X me numër të
fundëm vlerash të mundshme. Për këtë mjafton të gjejmë probabilitetin p(k) d.m.th probabilitetin
që madhësia X të marë vlerën k. Pra, P(X = k).
Ky probabilitet në bazë të formulës së Bernulit do të jetë:
P(X = k) =p(k) = P (k) =C kpkqn-k
n n
ose për k = x kemi:
p(x) = C xpxqn-x (1)
n
Pra shpërndarja e probabilitetit e madhësisë së rastit binomiale X analitikisht paraqitet me
formulën e Bernulit (1).
59

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

Shpërndarja  e  probabilitetit  e  madhësisë  binomiale  X  quhet  shpërndarje  binomiale  ose  ligj
binomial i shpërndarjes dhe simbolikisht shënohet b(x;n,p) = p(x) mbasi vlera e tij varet nga numri
i provave dhe probabiliteti p i ndodhjes së ngjarjes A në një provë.
Emërtimi,shpërndarje binomiale rrjedh nga fakti që probabilitetet p(x), për x = 0,1,2,…n  janë
termat e zbërthimit të  formulës së binomit të Njutonit (p + q)n.
Pra:
| (p+q)n = C | 0qn + C | 1pqn-1 + … + C |     | npn = p(0) + p(1) +…+ p(n)  |     |     |
| ---------- | ------- | -------------- | --- | --------------------------- | --- | --- |
|            | n       | n              |     | n                           |     |     |

Përkufizim  9.9.2.  Për  çdo  madhësi  rasti  X,  themi  se  ka  shpërndarje  binomiale  në  qoftë  se
shpërnadrja e probabilitetit të saj paraqitet me formulën:
|     | ( ) =Cx(cid:215) | px(cid:215) qn- x  ,  x= |     | 0,1,2,...,n  dhe  0£ |     | £    |
| --- | ---------------- | ------------------------ | --- | -------------------- | --- | ---- |
|     | p x              |                          |     |                      |     | p 1  |
n

Shpërndarja binomiale duke qënë shpërndarje e një madhësie rasti diskrete mund të paraqitet edhe
me anë të tabelës së shpërndarjes:

| X   | 0    | 1       | …   | k   |          | …  n  |
| --- | ---- | ------- | --- | --- | -------- | ----- |
|     | 0qn  | 1pqn-1  |     |     | kpkqn-k  | npn   |
| P   | C    | C       | …   | C   |          | …  C  |
|     | n    | n       |     | n   |          | n     |
Tabela 9.9.1. Tabela e ligjit të shpërndarjes binomiale

Probabiliteti  p  përbën parametrin e shpërndarjes
Është e qartë se  p+q = 1 dhe se shuma e të gjitha probabiliteteve P n (k) ose p(x), d.m.th shuma e të
gjithë termave te rreshtit të fundit të tabelës është e barabartë me 1.
n
|                            | ∑        | ( )=( p+q )n | =1n | =1  |     |     |
| -------------------------- | -------- | ------------ | --- | --- | --- | --- |
| Pra:                       |        p | x            |     |     |     |     |
x=0
Ky fakt na ndihmon për të  llogaritur:
r
|     | P(X>r) = 1 – P(X≤ r) ku P(X≤r) =  |     |     |     | ∑   | p(x)  |
| --- | --------------------------------- | --- | --- | --- | --- | ----- |
x=0
ose
|             |     | b        | b      |      | b     | a- 1  |
| ----------- | --- | -------- | ------ | ---- | ----- | ----- |
|             |     | ∑ p(x)=∑ |        | p)=∑ | p(x)- | ∑     |
| P(a≤X≤b) =  |     |          | b(x,n, |      |       | p(x)  |
|             |     | x=a      | x=a    |      | x=0   | x=0   |

Teoremë 9.9.1: Pritja matematike dhe dispersoni i shpërndarjes binomiale B(x,n,p) janë E(X) = np
dhe   D(X) = npq

Vërtetim. Paraqesim rezultatin në provën e i-të me anë të madhësisë së rastit X e cila merr dy
i
vlera të mundëshme:vlerën 0 ose vlerën 1 me probabilitete përkatësisht q dhe p . Madhësia X quhet
i
ndryshe madhësi indikator mbasi X = 0 tregon se në provën e i-të ngjarja A nuk ka ndodhur ndërsa
i
X = 1 tregon se në provën e i-të  ngjarja A ka ndodhur.
i
Pra:                                 P(X = 0) = P(Ā)= q, dhe  P(X = 1) = P(A) = p
|     | i   |     |     | i   |     |     |
| --- | --- | --- | --- | --- | --- | --- |
Meqë seicila nga madhësitë X, i=1,2,…,n, merr vlerën zero kur nuk ndodh ngjarja A në provën e i-
i
të dhe vlerën 1 kur ndodh ngjarja A në këtë provë atëhere madhësia binomiale X mund të shkruhet
si shumë e n madhësive të pavarura X .
i
Kështu që:
  60

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

|     | X=X |  + X  + … + X |     |     |
| --- | --- | ------------- | --- | --- |
|     |     | 1 2           | n   |     |
Pritja matematike e  çdo madhësie X është:
i
|     | E(X )=0(cid:215) | q +  1(cid:215) | p= p  |     |
| --- | ---------------- | --------------- | ----- | --- |
i
Nga  vetitë e pritjes matematike marrim që:

E(X) = E(X +X  + … +X ) = E(X ) + E(X ) + … + E(X ) = p + p + … + p = np
| 1 2 | n 1 | 2   | n   |     |
| --- | --- | --- | --- | --- |

Dispersioni i çdo X , i=1,2,…,n është :
i
D(X)=E(X2) – [E(X)]2
|     | i   | i   | i   |     |
| --- | --- | --- | --- | --- |

D(X)=E(X2) – p2 = p – p2 = p(1-p) = pq
i i
sepse
E(X2) = 0q + (12)p = p
i
Nga vetitë e dispersionit del se:
n
|            |         |             | ∑       | =    |
| ---------- | ------- | ----------- | ------- | ---- |
| D(X) = D(X | ) + D(X | ) + … + D(X | ) =  pq | npq  |
|            | 1       | 2           | n       |      |
i=1
9.10. Shpërndarja e Puasonit
 Shpërndarja Puasonit1  përcakton  probabilitetet e numrit të ngjarjeve të rastit për njësi të kohës
apo hapësirës.
Shqyrtojmë  numrin  e  ndodhjeve  së  një  ngjarjeje  gjatë  një  intervali  kohor  ose  hapsinor,  dhe
supozojmë se:
•
Probabiliteti i ndodhjes është i njëjtë për çdo intervale të së njëjtës gjatësi.
•
Ndodhja në çdo interval është e pavarur nga ndodhja në çfarëdo intervali disjunkt.

Në qoftë se x është numri i ndodhjeve në intervalin e dhënë, atëherë x është një variabël e
rastësishme e Poisson-it dhe probabiliteti i x ndodhjeve në intervalin është:
lk
|     | =k)=e | - l (cid:215) , k=0,1,2,…  |     |     |
| --- | ----- | -------------------------- | --- | --- |
P(X
k!

 l  numri i pritur i ndodhjeve  dhe e =2.71828.
Kjo shpërndarje quhet shpërndarje e Puasonit, shënohet  X~P(l)
K paraqet numrin e ngjarjeve të realizuara në njësi të kohës apo hapësirës, ndërsa l  është
parametër i  shpërndarjes dhe paraqet numërin mesatar të këtyre ngjarjeve.
Ligji i shpërndarjes është
|     | ¥         | ¥         |                |     |
| --- | --------- | --------- | -------------- | --- |
|     | ∑         | - l ∑ lk  | - l l=1        |     |
|     | P(X =k)=e | (cid:215) | =e (cid:215) e |     |
k!
|     | k=1 | k=1 |     |     |
| --- | --- | --- | --- | --- |

Dhe grafikisht paraqitet me anë histogramit

1 Simeon Denis Poisson, 1781-1840
  61

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
Fig.9.10.1. Histogrami i një shpërndarje Poisson
Bazat e drejtkëndshave janë të qendërzuara në pikat k=0,1,...,10, ndërsa lartësitë e tyre janë P(X=k).
Syprina e përgjithshme e këtyre drejtkëndëshave është 1. Në figurë janë paraqitur vetëm disa, sepse
lartësia e drejkëndëshave të tjerë është e papërfillshme.
Shembull 9.10.1. Sekretarja e një firme komunikon me 1000 filjale të saj me
telefon.Përvoja ka treguar se probabiliteti i pranimit të thirrjes së çdo filjali nga sekretarja në 10
minutat e para të ditës është 0,005.
a) Të gjendet probabiliteti që në periudhën prej 10 minutave të para të ditës sekretarja të
pranojë vetëm 1 thirrje.
b) Të gjendet probabiliteti që në periudhën prej 10 minutave të para të ditës sekretarja të mos
pranojë asnjë thirrje.
Zgjidhje. Shënojmë X numrin e thirrjeve prej filjaleve të pranuara nga sekretarja. Në këtë
problem kemi skemën e Bernulit, ku n=1000, p=0,005. Meqenëse kemi n të madhe dhe p të vogel
përdorim formulën asimptotike (45), ku l = np=1000(cid:215) 0,005=5< 10. Nga tabela shpërndarjes së
Puasonit kemi:
a) P(X =1)» e - 5(cid:215)
51
» 0,0336;
1!
b) P(X =0)» e - 5(cid:215)
50
» 0,0067
0!
Shembull 9.10.2 Gjatë një ditë në një aeroport qarkullojnë 2000 avionë. Eshtë llogaritur se
probabiliteti i gabimit në kontrollin e trafikut ajror për çdo avion gjatë një dite është 0,0002. Të
gjendet probabiliteti që ndodhin 3 gabime në kontrollin e trafikut ajror në një ditë.
Zgjidhje. Shënojmë X numrin e gabimeve në kontrollin e trafikut ajror në një ditë. Jemi në
kushtet e variantit të parë ku n=2000, p=0,0002, për rrjedhojë l = np=2000(cid:215) 0,0002=0.4< 10.
Prandaj
e - 0,4(0,4)3
P(x=3)» » 0,0072
3!
Pritja matematike, dispersion dhe shmangia standard e ndryshores ë rastit diskrete të dhënë me
shpërndarje Puason janë: E(X)=l, D(X)=l, s = D(X) = l .
62

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

9.11. Përafrimi i shpërndarjes binomiale me shpërndarjen e Puasonit
Shpërndarja Puason është marr si rasti limit i shpërndarjes binomiale. Në mënyrë të veçantë, kur
shpërndarja binomiale me parametra n dhe p, prodhimi np → λ , nëse n është e madhe, dhe p e
vogël, atëherë shpërndarja binomiale tenton te shpërndarja Puason me parametër λ.

Në praktikë, zëvendësimi kryhet në qoftë se np ≤ 10.

lk
| a)  | =k)» - l   |     |     |
| --- | ---------- | --- | --- |
| P(X | e          |     |     |
k!
|     | m lk |     |     |
| --- | ---- | --- | --- |
£ m)» ∑ - l
| b)  P(X | e   |     |     |
| ------- | --- | --- | --- |
k!
k=0
|         | m         | lk  |     |
| ------- | --------- | --- | --- |
|         | ∑ - l     |     |     |
| c)  P(X | >m)» 1- e |     |     |
k!
k=0
Shembull 9.11.1. Probabiliteti për të prodhuar një artikull me defekt është 0,003. Të gjendet
probabiliteti që nga 1000 artikujtë e zgjedhur rastësisht të jenë:
a)  4 me defekt
b)   të paktën 1 me defekt
c)  jo më shume se 2 me defekt.
Zgjidhje. Janë dhënë n=1000,    p=P(A)=0,003,    q=1- p= p(A)=0,997. Ndryshorja e rastit X paraqet
numrin e elementeve me defekt dhe ka shpërndarje binimiale X~B(1000;0,003), kemi:

| a)  P(X | =4)=C4 (cid:215) 0,0034(cid:215) | 0,997996  |     |
| ------- | -------------------------------- | --------- | --- |
1000

Në këtë rast np=3=l <10, prandaj shpërndarja e ndryshores së rastit X ka përafësisht shpërndarje
Puason:
34
|                 | =4)» - 3 » |     |     |
| --------------- | ---------- | --- | --- |
|             P(X | e 0,168    |     |     |
4!
| b)  P(X | ‡ 1)=P(1£ X £ 1000)=1- | P(X <1)=1- | P(X =0)»   |
| ------- | ---------------------- | ---------- | ---------- |
30
| -   | 1          |                  |     |
| --- | ---------- | ---------------- | --- |
| » e | 3 =1- » 1- | 0,04978=0,95022  |     |
0! e3
| c)  P(0£ | £ 2)=P(X =0)+P(X | =1)+P(X | =2)»   |
| -------- | ---------------- | ------- | ------ |
X
|     | 30 31         | 32           |     |
| --- | ------------- | ------------ | --- |
| » - | 3 +e - 3 +e - | 3 » 0,42319  |     |
e
|     | 0! 1! | 2!  |     |
| --- | ----- | --- | --- |

Shembull 9.11.2. Një servis për rregullimin e televizorave mesatarsiht për një orë thirret 6 herë. Sa
është probabiliteti brenda  një ore ta caktuar servisi të thirret:
a)  Saktësisht 5 herë
b)  Të paktë një herë
Zgjidhje.  Bëhet fjalë për shpërndarje Puason me parametër l =6.
65
|     | =5)=e - 6 =0,16  |     |     |
| --- | ---------------- | --- | --- |
a)  P(X
5!
|     |     |     | 63  |
| --- | --- | --- | --- |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
b) P(X ‡ 1)=1- P(X =0)=1- e - 6
60
=0,9975
0!
Shembull 9.11.3. Një seri prodhimesh përmban 5% me defekt. Merret një mostër e rastësishme
prej 60 prodhimesh. Të njehsohet probabiliteti që në këtë mostër të mos ketë asnjë me defekt.
Zgjidhje. Bëhet fjalë për shpërndarje të Bernulit:
n=60, p=P(A)=0,05 q=1- p= p(A)=0,95
.
Meqë
np=3=l <10,
përafrimi bëhet me shpërndarje të Puasonit:
P(X =0)=e - 3
30
» 0,04979
0!
9.12. Detyra për përgatitje
9.12.1. Sa është probabiliteti që gjatë tërheqjes së rastësishëm të një letre bixhozi të merret një As?
Zgjidhje. Gjithësej janë 52 letra në kuti, prej të cilave 4 janë As-e, kështu
4 1
P(Asi)= = » 0.0769
52 13
9.12.2. Nëse zgjedhim një qershi rastësisht nga një kuti me 20 qershi, prej të cilave 14 janë të
ëmbla dhe 6 të tharta. Sa është probabiliteti që ajo të jetë e ëmbël?
Zgjidhje. Ekzistojnë 20 qershi që mund të merren, kështu që numri i ngjarjeve elementare është 20.
Nga këto 20 ngjarje të mundshme, 14 janë të volitshme (të ëmbla), kështu që probabiliteti që
14 7
qershija të jetë e ëmbël është P(embel)= = .
20 10
9.12.3. Sa është probabiliteti që gjatë tërheqjes së rastësishëm të një letre bixhozi të mos merret
letër me zemër?
Zgjidhje. Gjithësej janë 13 letra me zemër nga 52, kështu që të marrim letër me zemër kemi
13 1
P(Z)= = , ndërsa probabiliteti për të mos tërhequr zemër është:
52 4
1 3
P(Z)=1- P(Z)=1- = .
4 4
9.12.4. Në sirtar keni 10 palë çorape, 6 prej të cilave janë të bardha, dhe 7 këmisha, 3 nga të cilat
janë të bardha. Nëse tërheqim rastësisht një palë çorape dhe një këmishë, atëherë sa është
probabiliteti që edhe çorapet edhe këmisha të jenë të bardha?
6
Zgjidhje. Probabiliteti për të zgjedhur një palë çorape të bardha është P(Ç)= , ndërsa probabiliteti
10
3
i zgjedhjes së një këmishë të bardhë është P(K)= . Atëherë, probabiliteti që të dy të jenë të
7
6 3 18 9
bardha është P(Ç(cid:215) K)=P(Ç)(cid:215) P(K)= (cid:215) = = .
10 7 70 35
9.12.5. Supozojmë se tërheqim një letër bixhozi nga një kuvertë standarde me 52 letra. Sa është
probabiliteti që të marrim një Mbretëreshë ose një Mbret?
64

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
Zgjidhje. Në kuvertë janë 4 Mbretëresha dhe 4 Mbretër, kështu që 8 ngjarje janë të volitshme që u
korrespondojnë letrave me Mbretëreshë ose me Mbret nga gjithësej 52 letrat që janë ngjarjet e
mundshme (elemetare). Kështu që probabiliteti për të marrë një Mbretëreshë ose një Mbret është:
8
P(Mbret ose Mbretëreshë)= . Vini re se në këtë rast, nuk ka letra që janë njëkohësisht me
52
Mbretëreshë dhe me Mbret, kështu që P(Mbret dhe Mbretëreshë)=0.
Kështu, duke përdorur formulën P ( A ¨ B )= P ( A )+ P ( B )- P ( AB ), marrim:
4 4 8
P(Mbret ose Mbretëreshë)=P(Mbret)+P(Mbretëreshë)- P(Mbret dhe Mbretëreshë)= + - 0= .
52 52 52
9.12.6. Supozojmë se tërheqim një letër bixhozi nga një kuvertë standarde. Sa është probabiliteti që
të marrim një letër të kuqe apo një Mbret?
26
Zgjidhje. Gjysmat e letrave në kuvertë janë me ngjyrë të kuq, kështu P(kuqe)= , dhe katër letra
52
4
kanë mbret, prandaj P(Mbret)= . Dhe prej 52 letrave 2 letra janë të kuqe dhe që kanë Mbret, pra
52
2
P(kuqe dhe Mbret)= . Kështu,
52
26 4 2 28
P(kuqe ose Mbret)=P(kuqe)+P(Mbret)- P(kuqe dhe Mbret)= + - = .
52 52 52 52
9.12.6. Sa është probabiliteti që gjatë tërheqjesë së rastësishme të dy letrave të bixhozit nga një
kuvertë e letravetë lojërave tëmarrim dy ase?
[Rez: 1/221]
9.12.7. Në shkollë 70% e shokëve të tu pëlqejnë çokollatën dhe 35% pëlqejnë çokollatën dhe
karamelet. Sa përqind e atyre që pëlqejnë çokollatën, pëlqejnë gjithashtu edhe karamelet?
Zgjidhje. Shënojmë me A ngjarjen "Personi pëlqen çokollatë" dhe me B ngjarjen "Personi pëlqen
karamele".Nga të dhënat e detzrës kemi:
P(A)=70%=0,7 dhe P(B∩A)=35%=0,35
Nga formula e probabilitetit me kusht kemi P(B|A)=(cid:2)((cid:4)∩(cid:6))= 0,35:0,7=0,5=50%
(cid:2)((cid:4))
9.12.8. Janë hedhur dy monedha metalike. Të caktohet probabiliteti që në të dy monedhat të
paraqitet figura.
Zgjidhje. Hapësira e ngjarjeve është Ω={FF,FN,NF,NN} Nëse me A e shënojmë ngjarjen “në të dy
monedhat bie figura”, atëherë numri i ngjarjeve të volitshme është n(A)=1.
Pra, P(A)=(cid:8) (cid:11).
=
(cid:9) (cid:12)
9.12.9. Në grupin prej 20 të rinjve, 4 nga 7 vajzat dhe 2 nga 13 djemtë përdorin syze. Të caktohet
probabiliteti që personi i zgjedhur rastësisht është vajzë ose mban syze.
Zgjidhje. Le të jetë V ngjarja “personi i zgjedhur është vajzë” dhe S ngjarja “personi i zgjedhur
mban syze”. Atëherë
P(V)=(cid:13), P(S)=(cid:16), P S)=(cid:12). Kështu, P S)= P(V)+P(S)- P S)= (cid:13) + (cid:16) - (cid:12)=(cid:19)
((cid:17)∩ ((cid:17)∪ ((cid:17)∩
(cid:14)(cid:15) (cid:14)(cid:15) (cid:14)(cid:15) (cid:14)(cid:15) (cid:14)(cid:15) (cid:14)(cid:15) (cid:14)(cid:15)
Probabiliteti që personi i zgjedhur të jetë vajzë ose që mban syze është (cid:19).
(cid:14)(cid:15)
65

PPëërrggaattiittii::  AA..  JJuussuuffii,,  DD..  BBeerriisshhaa,,MM..RReeqqiiccaa

9.12.10. DDuukkee  ddiittuurr  ssee  nnggaa  5522  lleettrraa  ëësshhttëë  ttëërrhheeqquurr  nnjjëë  ““zzeemmëërr””,,  ttëë  ccaakkttoohheett  pprroobbaabbiilliitteettii  qqëë  aajjoo  ttëë
jetë “figurë”
[Rez: 3/13]
9.12.11. KKuubbii  ëësshhttëë  hheeddhhuurr  ddyy  hheerrëë..  TTëë  ccaakkttoohheett  pprroobbaabbiilliitteettii  qqëë  hheerrëënn  ee  ppaarrëë  ttëë  mmeerrrreett  44  ddhhee  hheerrëënn
tjetër të merret numër tek.
Zgjidhje. Le të jetë A nnggjjaarrjjaa::  ““mmeerrrreett  44  nnëë  hheeddhhjjeenn  ee  ppaarrëë””.. Atëherë  (cid:11).
(cid:22)((cid:23)) =
(cid:16)
               Le të jetë B nnggjjaarrjjaa::  ““mmeerrrreett  nnuummrrii  tteekk,,  nnëë  hheeddhhjjeenn  ee  ddyyttëë””.. Atëherë  (cid:22)(((cid:24)))= (cid:20) (cid:11)
=
(cid:16) (cid:14)
|     |     |     |     | 1   | 1 1.  |     |
| --- | --- | --- | --- | --- | ----- | --- |
Meqë ngjarjet A dhe B jjaannëë  ttëë  ppaavvaarruurraa, atëherë kemi:  (cid:22)((cid:23)∩(cid:24)) (cid:22)((cid:23))∙(cid:22)((cid:24))
|     |     |     | =   | = ∙ | =    |     |
| --- | --- | --- | --- | --- | ---- | --- |
|     |     |     |     | 6   | 2 12 |     |
9.12.12. Çanta pëëërrrmmmbbbaaannnëëë   111000   tttooopppaaa,,,   777   ppprrreeejjj   tttyyyrrreee   jjjaaannnëëë   tttëëë   gggjjjeeelllbbbëëërrrttt   dddhhheee   333   jjjaaannnëëë   tttëëë   bbbaaarrrdddhhhëëë...   NNNëëëssseee   tttooopppiii   nnnxxxiiirrrrrreeettt
nnngggaaa   çççaaannntttaaa   dddhhheee   ssshhhëëënnnooohhheeettt   nnngggjjjyyyrrraaa   eee   tttiiijjj,,,   tttooopppiii   nnnuuukkk   kkkëëëttthhheeehhheeettt   mmmëëë   nnnëëë   çççaaannntttëëë...   PPPaaassstttaaajjj   merret një top
tjetër. Të catohett  pprroobbaabbiilliitteettii  qqëë::
a) TTooppii  ii  ppaarrëë  ii  nnxxjjeerrrruurr  ttëë  jjeettëë  ii  ggjjeellbbëërrtt
b) TTooppii  ii  ppaarrëë  ttëë  jjeettëë  ii  ggjjeellbbëërrtt  ddhhee  ttooppii  ii  ddyyttëë  ttëë  jjeettëë  ii  bbaarrddhhëë
c) TTooppaatt  ttëë  jjeennëë  mmee  nnggjjyyrraa  ttëë  nnddrryyhhmmee
Zgjidhje.NNëë  ffiilllliimm  nnddëërrttoojjmmëë  ppeemmëënn  ee  ddeeggëëzzuuaarr::

Nga e cila vërejmë:
P(GJ)=(cid:13)
a)
(cid:11)(cid:15)
|     |     |     | b)  P(GJ)+P(B))== |             | (cid:13) + (cid:20)=(cid:14)(cid:11)=      | (cid:13)         |
| --- | --- | --- | ----------------- | ----------- | ------------------------------------------ | ---------------- |
|     |     |     |                   |             |                                            |                  |
|     |     |     |                   |             | (cid:11)(cid:15) (cid:19) (cid:19)(cid:15) | (cid:20)(cid:15) |
|     |     |     | c)  P(GJ)         | P(B))++P(B) | P(GJ)=                                     | (cid:13)         |
|     |     |     |                   | ∙           | ∙                                          |   ∙              |
(cid:11)(cid:15)
| (cid:20) + (cid:20)   (cid:13) = | (cid:13) + (cid:13)=(cid:11)(cid:12) =                      | (cid:13)         |     |     |     |     |
| -------------------------------- | ----------------------------------------------------------- | ---------------- | --- | --- | --- | --- |
| ∙                                |                                                             |                  |     |     |     |     |
| (cid:19) (cid:11)(cid:15)        | (cid:19) (cid:20)(cid:15) (cid:20)(cid:15) (cid:20)(cid:15) | (cid:11)(cid:27) |     |     |     |     |

9.12.13. Çanta pëëërrrmmmbbbaaannnëëë   555   tttooopppaaa   kkkuuuqqq   dddhhheee   777   tttooopppaaa   tttëëë   zzziii...   NNNjjjëëë   tttoooppp   nnnxxxiiirrrrrreeettt   nnngggaaa   çççaaannntttaaa   dddhhheee   ssshhhëëënnnooohhheeettt   nnngggjjjyyyrrraaa
ee   ttiijj   ddhhee   kktthheehheett   ssëërriisshh   nnëë   ççaannttëë..   PPaassttaajj   nnxxiirrrreett   ttooppii   ii   ddyyttëë   nnggaa   ççaannttaa..   TTëë   ccaakkttoohheett
pprroobbaabbiilliitteettii  qqëë  ttooppii  ii  ppaarrëë  ttëë  jjeettëë  ii  kkuuqq  ddhhee  ooppii  ii  ddyyttëë  ttëë  jjeettëë  ii  zzii..
Zgjidhje. NNddëërrttoojjmmëë  ddeeggëëzziimmeett,,  nnggaa  kkuu  mmaarrrriimm  eeddhhee  ppëërrggjjiiggjjeenn::
  66

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
5 7 35
(cid:22)((cid:29)∩(cid:30)) = (cid:22)((cid:29))∙(cid:22)((cid:30)) = ∙ =
12 12 144
9.12.14. Popullata përbëhet nga 53% meshkuj. Probabiliteti që mashkulli të mos i shoh ngjyrat
është 0,02, kurse që femra të mos i shoh ngjyrat është 0,001. Të caktohet probabiliteti që
personi i zgjedhur rastësisht të mos i shoh ngjyrat.
[Rez: 0,10647]
9.12.15. Tërhiqet një letër. Nëse është “zemër” ktheje prapa dhe tërhiqe letrën tjetër. Nëse “nuk
është zemër” tërhiq letrën tjetër pa e kthyer të parën. Të caktohet probabiliteti që letra e
dytë është As zemër.
[Rez (cid:11)(cid:11)]
:
(cid:12)(cid:27)(cid:19)
9.12.16. Probabiliteti që kubi jo fer të bie 6 është (cid:11). Kubi hidhet dy herë. Të caktohet probabiliteti
(cid:27)
që të bie saktësisht një 6.
[Rez $]
:
(cid:14)(cid:27)
9.12.17. Në një kuti ka 8 lëmsha të kuq, 6 lëmsha të bardhë dhe 4 lëmsha të verdhë. Nëse nga
kutia tërhiqen 3 lëmsha radhazi pa mos u kthyer më në kuti. Shënojmë me X ndryshoren e
rastit që ka si vlera paraqitjen e lëmshave të bardhë. Të formohet tabela e ligjit të
shpërndarjes për propabilitetin, të njesohet pritja matematike dhe dispersioni matematikë.
Zgjidhje. Ndërtojmë pemën e degëzimeve:
67

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

|                                    |     |     |       |                    | (cid:16)  dhe   |                     | (cid:11)(cid:14).  |     |     |     |
| ---------------------------------- | --- | --- | ----- | ------------------ | --------------- | ------------------- | ------------------ | --- | --- | --- |
| Gjithësej kemi18 lëmshe. Kështu:   |     |     |       | (cid:22)((cid:24)) | =               | (cid:22)%(cid:24)&= |                    |     |     |     |
|                                    |     |     |       |                    | (cid:11)$       |                     | (cid:11)$          |     |     |     |
|                                    |     |     | 12 11 | 10 1320            |                 |                     |                    |     |     |     |

| (cid:22)(' = 0)= | (cid:22)((cid:24)∙(cid:24)∙(cid:24)) | =   | ∙     | ∙ =     | =   | 0.27 |     |       |     |            |
| ---------------- | ------------------------------------ | --- | ----- | ------- | --- | ---- | --- | ----- | --- | ---------- |
|                  |                                      |     | 18 17 | 16 4896 |     |      |     |       |     |            |
|                  |                                      |     |       |         |     | 6    | 12  | 11 12 | 6   | 11 12 11 6 |
(cid:22)(' = 1)= (cid:22)((cid:24)∙(cid:24)∙(cid:24))+(cid:22)((cid:24)∙(cid:24)∙(cid:24))+(cid:22)((cid:24)∙(cid:24)∙(cid:24)) = ∙ ∙ + ∙ ∙ + ∙ ∙ =
|     |     |     |     |          |     | 18  | 17  | 16 18 | 17  | 16 18 17 16 |
| --- | --- | --- | --- | -------- | --- | --- | --- | ----- | --- | ----------- |
|     | 792 | 792 |     | 792 2376 |     |     |     |       |     |             |

|     | =    | +    | +   | =         | =   | 0.49 |     |      |     |          |
| --- | ---- | ---- | --- | --------- | --- | ---- | --- | ---- | --- | -------- |
|     | 4896 | 4896 |     | 4896 4896 |     |      |     |      |     |          |
|     |      |      |     |           |     | 6    | 5   | 12 6 | 12  | 5 12 6 5 |
(cid:22)(' = 2)= (cid:22)((cid:24)∙(cid:24)∙(cid:24))+(cid:22)((cid:24)∙(cid:24)∙(cid:24))+(cid:22)((cid:24)∙(cid:24)∙(cid:24)) = ∙ ∙ + ∙ ∙ + ∙ ∙ =
|     |     |     |     |          |     | 18  | 17  | 16 18 | 17  | 16 18 17 16 |
| --- | --- | --- | --- | -------- | --- | --- | --- | ----- | --- | ----------- |
|     | 360 | 360 |     | 360 1080 |     |     |     |       |     |             |

|                  | =                                    | +    | +                          | =                                          | =      | 0.22 |     |     |     |     |
| ---------------- | ------------------------------------ | ---- | -------------------------- | ------------------------------------------ | ------ | ---- | --- | --- | --- | --- |
|                  | 4896                                 | 4896 |                            | 4896 4896                                  |        |      |     |     |     |     |
|                  |                                      |      | (cid:16) (cid:27)          | (cid:12) (cid:11)(cid:14)(cid:15)          |        | .    |     |     |     |     |
| (cid:22)(' = 3)= | (cid:22)((cid:24)∙(cid:24)∙(cid:24)) | =    | ∙                          | ∙ =                                        | = 0.02 |      |     |     |     |     |
|                  |                                      |      | (cid:11)$ (cid:11)(cid:13) | (cid:11)(cid:16) (cid:12)$(cid:19)(cid:16) |        |      |     |     |     |     |
Formojmë tabelën e ligjit të shpërndarjes së probabiliteteve:
|          |                        |     |     | . = 0 | . =  | 1 . = | 2 . = | 3   |     |     |
| -------- | ---------------------- | --- | --- | ----- | ---- | ----- | ----- | --- | --- | --- |
|          |                        |     |     | ' = - |      |       |       | /   |     |     |
|          |                        |     |     | 0.27  | 0.49 | 0.22  | 0.02  |     |     |     |
| ku,  ∑12 |                        |     |     |       |      |       |       |     |     |     |
|          | = 0.27+0.49+0.22+0.02= |     |     | 1     |      |       |       |     |     |     |
Njehsojmë pritjen matematike:  3(.) = 0∙0.27+1∙0.49+2∙0.22+3∙0.02 = 0.99
Njehsojmë dipersionin matematike
|     |     |       |     | : 3(. 2)                     | = 0 2 ∙0.27+1 |                     | 2 ∙0.49+2 | 2      | ∙0.22+3 | 2 ∙0.02 = 1.55 |
| --- | --- | ----- | --- | ---------------------------- | ------------- | ------------------- | --------- | ------ | ------- | -------------- |
|     |     |       |     |  3(.(cid:14))−63(.)7(cid:14) |               | 1.55−(0.99)(cid:14) |           |        | .       |                |
|     |     | 4(.)= |     |                              |               | =                   |           | = 0.57 |         |                |
9.12.18. Në një kuti ka 6 lëmsha të kuq, 4 lëmsha të zi dhe 3 lëmsha të bardhë. Nëse nga kutia
tërhiqen 3 lëmsha radhazi pa mos u kthyer më në kuti. Shënojmë me X ndryshoren e rastit
që ka si vlera paraqitjen e lëmshave të zi. Të formohet tabela e ligjit të shpërndarjes për
propabilitetin, të njesohet pritja matematike dhe dispersioni matematikë.
Zgjidhje. Gjithësej kemi 13 lëmshe. Kështu   (cid:12)  dhe    (cid:19).
|     |     |     |     |     | (cid:22)((cid:30)) | =                | (cid:22)%(cid:30)& | =                |     |     |
| --- | --- | --- | --- | --- | ------------------ | ---------------- | ------------------ | ---------------- | --- | --- |
|     |     |     |     |     |                    | (cid:11)(cid:20) |                    | (cid:11)(cid:20) |     |     |
|     |     |     |     |     |                    | 68               |                    |                  |     |     |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

|     |     |     | 9 8 | 7 504 |     |     |     |     |     |     |
| --- | --- | --- | --- | ----- | --- | --- | --- | --- | --- | --- |

| (cid:22)(' = 0)= | (cid:22)((cid:30)∙(cid:30)∙(cid:30)) | =   | ∙ ∙ | =       | = 0.29 |     |     |     |         |     |
| ---------------- | ------------------------------------ | --- | --- | ------- | ------ | --- | --- | --- | ------- | --- |
|                  |                                      | 13  | 12  | 11 1716 |        |     |     |     |         |     |
|                  |                                      |     |     |         |        | 4   | 9 8 | 9 4 | 8 9 8 4 |     |
(cid:22)(' = 1)= (cid:22)((cid:30)∙(cid:30)∙(cid:30))+(cid:22)((cid:30)∙(cid:30)∙(cid:30))+(cid:22)((cid:30)∙(cid:30)∙(cid:30)) = ∙ ∙ + ∙ ∙ + ∙ ∙
|     |     |         |     |     |     | 13  | 12 11 | 13 12 | 11 13 12 11 |     |
| --- | --- | ------- | --- | --- | --- | --- | ----- | ----- | ----------- | --- |
|     |     | 288 288 |     | 288 | 864 |     |       |       |             |     |

|     | =    | +    | +    | =    | =   | 0.5 |     |     |         |     |
| --- | ---- | ---- | ---- | ---- | --- | --- | --- | --- | ------- | --- |
|     | 1716 | 1716 | 1716 | 1716 |     |     |     |     |         |     |
|     |      |      |      |      |     | 9   | 4 3 | 4 9 | 3 4 3 9 |     |
(cid:22)(' = 2)= (cid:22)((cid:30)∙(cid:30)∙(cid:30))+(cid:22)((cid:30)∙(cid:30)∙(cid:30))+(cid:22)((cid:30)∙(cid:30)∙(cid:30)) = ∙ ∙ + ∙ ∙ + ∙ ∙
|     |     |         |     |     |     | 13  | 12 11 | 13 12 | 11 13 12 11 |     |
| --- | --- | ------- | --- | --- | --- | --- | ----- | ----- | ----------- | --- |
|     |     | 108 108 |     | 108 | 324 |     |       |       |             |     |

|     | =    | +    | +    | =    | =   | 0.19 |     |     |     |     |
| --- | ---- | ---- | ---- | ---- | --- | ---- | --- | --- | --- | --- |
|     | 1716 | 1716 | 1716 | 1716 |     |      |     |     |     |     |
|     |      |      | 4 3  | 2    | 24  |      |     |     |     |     |

| (cid:22)(' = 3)= | (cid:22)((cid:30)∙(cid:30)∙(cid:30)) | =   | ∙ ∙ | =       | = 0.02 |     |     |     |     |     |
| ---------------- | ------------------------------------ | --- | --- | ------- | ------ | --- | --- | --- | --- | --- |
|                  |                                      | 13  | 12  | 11 1716 |        |     |     |     |     |     |
Formojmë tabelën e ligjit të shpërndarjes së probabiliteteve:
|      |                       |     |     | . =  | 0 . = | 1 . = | 2 . = | 3   |     |     |
| ---- | --------------------- | --- | --- | ---- | ----- | ----- | ----- | --- | --- | --- |
|      |                       |     | '   | = -  |       |       |       | /   |     |     |
|      |                       |     |     | 0.29 | 0.5   | 0.19  | 0.02  |     |     |     |
| ku,  |                       |     |     | .    |       |       |       |     |     |     |
| ∑12  | = 0.29+0.5+0.19+0.02= |     |     | 1    |       |       |       |     |     |     |
Njehsojmë pritjen matematike:  3(.) = 0∙0.29+1∙0.5+2∙0.19+3∙0.02 = 0.94
Njehsojmë dispersionin matematik:
|     |     | 3(.(cid:14))= | 0(cid:14)∙0.29+1(cid:14)∙0.5+2(cid:14)∙0.19+3(cid:14)∙0.02 |     |     |     |     |     |     |     |
| --- | --- | ------------- | ---------------------------------------------------------- | --- | --- | --- | --- | --- | --- | --- |
= 1.44
|     |     |      |  3(.(cid:14))−63(.)7(cid:14) |     |     | 1.44−(0.94)(cid:14) |     |        |     |     |
| --- | --- | ---- | ---------------------------- | --- | --- | ------------------- | --- | ------ | --- | --- |
|     |     | 4(.) | =                            |     |     | =                   |     | = 0.56 |     |     |
9.12.19. Në një kuti ka 9 lëmsha të kuq, 6 lëmsha të verdh dhe 5 lëmsha të bardhë. Nëse nga kutia
tërhiqen 4 lëmsha radhazi pa mos u kthyer më në kuti. Shënojmë me X ndryshoren e rastit
që ka si vlera paraqitjen e lëmshave të verdh. Të formohet tabela e ligjit të shpërndarjes për
propabilitetin, të njesohet pritja matematike dhe dispersioni matematikë.
|     |     |        | .     | = 0 . | = 1  | . = 2 . | =3   | . = 4  |              |     |
| --- | --- | ------ | ----- | ----- | ---- | ------- | ---- | ------ | ------------ | --- |
|     |     | [Rez:  |       |       |      |         |      | /,3(.) | =1,193,4(.)= | ]   |
|     |     |        | ' = - |       |      |         |      |        |  0,71        |     |
|     |     |        |       | 0,21  | 0,45 | 0,28    | 0,06 | 0,003  |              |     |

9.12.20. Nëse kemi dy kuti, të cilat përbëhen nga këto topa. Kutia e parë ka 6 topa të bardhë, 3 topa
të zi dhe 5 topa të kuq. Kutia e dytë ka 4 topa të bardhë, 5 topa të zi dhe 3 topa të kuq. Nëse
nga kutia e parë tërhiqen dy topa dhe i kalojmë tek kutia e dytë, pastaj nga kutia e dytë
tërheqim vetem një top. Sa është probabiliteti që gjatë tërheqjes topat të jenë me ngjyra të
bardhë?
|     |     |     |     |     | 69  |     |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |

PPëërrggaattiittii:: AA.. JJuussuuffii,, DD.. BBeerriisshhaa,,MM..RReeqqiiccaa
Zgjidhje.Nga të dhënat e detyrrëëss kkeemmii::
Marrim Hipotezat:
<! <∙B∙>!
H.1. Bardhë dhe Bardhë. (cid:22)(9 ))== ;< ? = ?!∙>! = ?∙>! = (cid:11)(cid:27) dhe (cid:22) ((cid:24))= (cid:16).
(cid:11) ;? =>! =>∙=@∙=?! (cid:19)(cid:11) C= (cid:11)(cid:12)
=>
?!∙=?! ?!∙=?!
6! 3! 6∙5!3∙2!
H.2. Bardhë dhe Zi. (cid:22)(9 ) = :6 1∙::3 1 = 1!∙5! ∙ 1!∙2! = 1∙5! ∙ 2! = 18 dhe (cid:22) ((cid:24))= (cid:27)
2 :1 2 1 2 44 91 91 91 C? (cid:11)(cid:12)
B! B∙>!
H.3. Bardhë dhe Kuq. (cid:22)(9 )= ;< =∙;;B = = (cid:16)∙ =!∙>! = (cid:16)∙ =∙>! = (cid:20)(cid:15) dhe (cid:22) ((cid:24))= (cid:27)
(cid:20) ;?? (cid:19)(cid:11) (cid:19)(cid:11) (cid:19)(cid:11) C@ (cid:11)(cid:12)
==>>
@! @∙?!
H.4. Zi dhe Zi. (cid:22)(9 )= ;@ ? = ?!∙=!! = ?! = (cid:20) dhe (cid:22) ((cid:24))= (cid:12)
(cid:12) ;? (cid:19)(cid:11) (cid:19)(cid:11) (cid:19)(cid:11) C> (cid:11)(cid:12)
=>
@! B! @∙?!B∙>!
H.5. Zi dhe Kuq. (cid:22)(9 )= ;@ =∙;B = = ==!∙?! ∙ =!∙>! = =∙?! ∙ =∙>! = (cid:11)(cid:27) dhe (cid:22) ((cid:24))= (cid:12)
(cid:27) ;? (cid:19)(cid:11) (cid:19)(cid:11) (cid:19)(cid:11) CB (cid:11)(cid:12)
=>
B! B∙>∙@!
H.6. Kuq dhe Kuq. (cid:22)(9 )= ;B ? = ?!∙@! = ?∙@! = (cid:11)(cid:15) dhe (cid:22) ((cid:24)) = (cid:12).
(cid:16) ;? (cid:19)(cid:11) (cid:19)(cid:11) (cid:19)(cid:11) C< (cid:11)(cid:12)
=>
NNggaa ffoorrmmuullaa ee pprroobbaabbiilliitteettiitt ttëë pplloottëë,, mmarrim:
(cid:11)(cid:27) (cid:16) (cid:11)$ (cid:27) (cid:20)(cid:15) (cid:27) (cid:20) (cid:12) (cid:11)(cid:27) (cid:12) (cid:11)(cid:15) (cid:12) (cid:13)(cid:27) (cid:19)(cid:15) (cid:11)(cid:27)(cid:15) (cid:11)(cid:14) (cid:16)(cid:15) (cid:12)(cid:15)
(cid:22)((cid:24)) = ∙ + ∙ + ∙ + ∙ + ∙ + ∙ = + + + ++ + ==
(cid:19)(cid:11) (cid:11)(cid:12) (cid:19)(cid:11) (cid:11)(cid:12) (cid:19)(cid:11) (cid:11)(cid:12) (cid:19)(cid:19)(cid:11)(cid:11) (cid:11)(cid:12) (cid:19)(cid:11) (cid:11)(cid:12) (cid:19)(cid:11) (cid:11)(cid:12) (cid:11)(cid:14)(cid:13)(cid:12) (cid:11)(cid:14)(cid:13)(cid:12) (cid:11)(cid:14)(cid:13)(cid:12) (cid:11)(cid:14)(cid:13)(cid:12) (cid:11)(cid:14)(cid:13)(cid:12) (cid:11)(cid:14)(cid:13)(cid:12)
(cid:12)(cid:14)(cid:13) .
= 0,34
(cid:11)(cid:14)(cid:13)(cid:12)
9.12.21. Në një fabrikë 30% ee pprrooddhhiimmeevvee ii ttaakkoojjnnëë mmaakkiinnëëss ssëë ppaarrëë,, 25% ii ttaakkoojjnnëë mmaakkiinnëëss ssëë
dddyyytttëëë dddhhheee tttëëë tttjjjeeerrraaattt mmmaaakkkiiinnnëëësss sssëëë tttrrreeetttëëë... NNNgggaaa ppprrrooodddhhhiiimmmeeettt eee mmmaaakkkiiinnnëëësss sssëëë pppaaarrrëëë 111%%% jjjaaannnëëë mmmeee dddeeefffeeekkkttt,,, nnnëëë
tttëëë dddyyytttëëënnn 111,,,222%%% dddhhheee nnnëëë tttrrreeetttëëënnn 222 %%% jjjaaannnëëë mmmeee dddeeefffeeekkkttt... SSSaaa ëëëssshhhtttëëë ppprrrooobbbaaabbbiiillliiittteeetttiii qqqëëë nnnjjjëëë ppprrrooodddhhhim I
zzggjjeeddhhuurr rraassttëëssiisshhtt ttëë jjeettëë mmee ddeeffeekktt??
Zgjidhje. Shënojmë me A nnngggjjjaaarrrjjjeeennn qqqëëë ppprrrooodddhhhiiimmmiii iii zzzgggjjjeeedddhhhuuurrr rrraaassstttëëësssiiissshhhttt tttëëë jjjeeetttëëë mmmeee dddeeefffeeekkkttt,,, nnndddëëërrrsssaaa
H , H , H jjaannëë pprrooddhhiimmeett ee mmaakkiinnaavvee përkatësisht të parës, të dytës, të tretës. Nga të dhënat e
1 2 3
detyrës kemi:
P ( H ) = 0, 30, P ( H ) = 0, 25, P ( H ) = 0, 45, P ( A |H ) = 0,01,
1 2 3 1
P ( A |H ) = 0,012, P ( A |H ) = 00,,0022.
2 3
P ( A) = P ( H ) P ( A |H ) + P ( H ) PP ( A |H ) + P ( H ) P ( A |H3 ) = 0,015
1 1 2 2 3
9.12.22. NNNëëë nnnjjjëëë mmmooossstttëëërrr rrraaassstttiii tttëëë mmmaaarrrrrrëëë nnngggaaa ssstttuuudddeeennntttëëëttt eee nnnjjjëëë UUUnnniiivvveeerrrsssiiittteeetttiii kkkeeemmmiii qqqëëë::: 555000%%% jjjaaannnëëë nnnëëë
dddrrreeejjjtttiiimmmeee eeekkkooonnnooommmiiikkkeee,,, 444000%%% nnnëëë dddrrreeejjjtttiiimmmeee iiinnnxxxhhhiiinnniiieeerrriiikkkeee dddhhheee 111000%%% dddrrreeejjjtttiiimmmeee tttëëë tttjjjeeerrraaa... NNNgggaaa dddrrreeejjjtttiiimmmeeettt
eekkoonnoommiikkee,, 6600%% iisshhiinn ffeemmrraa;; nnddëërrssaa,, 3300%% ee ddrreejjttiimmeevvee ttëë iinnxxhhiinniieerriissëë iisshhiinn ffeemmrraa,, ssii ddhhee 2200%% ee
dddrrreeejjjtttiiimmmeeevvveee tttëëë tttjjjeeerrrëëë iiissshhhiiinnn fffeeemmmrrraaa... DDDuuukkkeee pppaaasssuuurrr pppaaarrraaasssyyyssshhh qqqëëë nnnjjjëëë ssstttuuudddeeennntttiii ëëëssshhhtttëëë fffeeemmmëëërrr,,, ccciiillliii ëëëssshhhtttëëë
pprroobbaabbiilliitteettii qqëë aajjoo ttëë jjeettëë nnëë nnjjëë ddrreejjttiimm iinnxxhhiinniieerriiee??
Zgjidhje. Shënojmë:
A : janë studentë të ddrreejjttiimmeevvee iinnxxhhiinniieerriikkee
1
A :: jjaannëë ssttuuddeennttëë ttëë ddrreejjttiimmeevvee eekkoonnoommiikkee
2
A :: jjaannëë ssttuuddeennttëë ttëë ddrreejjttiimmeevvee ttëë ttjjeerraa..
3
B: janë studentë femra.
VVëërreejjmmëë qqëë hhaappëëssiirraa ee nnggjjaarrjjeevvee lleemmeennttaarree ëësshhttëë W = A ¨ A ¨ A .
1 2 3
70

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

Nga të dhëna e hulumtimit, kemi:
|     |     |     | P(A)=0.4, P(A |     | )=0.5, P(A)=0.1, P(B|A)=0.3, P(B|A |     |     |     |     | )=0.6, P(B|A)=0.2  |     |     |
| --- | --- | --- | ------------- | --- | ---------------------------------- | --- | --- | --- | --- | ------------------ | --- | --- |
|     |     |     | 1             |     | 2                                  | 3   |     | 1   |     | 2                  | 3   |     |
Pastaj, nga teorema e Bayes-it,
|     |     |     |     |            |        |             |                   | P(A            | )P(B | | A )   |              |     |
| --- | --- | --- | --- | ---------- | ------ | ----------- | ----------------- | -------------- | ---- | ------- | ------------ | --- |
|     |     |     |     |            | =      |             |                   |                | 1    | 1       |              | =   |
|     |     |     |     | P(A        | | B)   |             |                   |                |      |         |              |     |
|     |     |     |     | 1          |        | P(A )P(B    | | A )             | + P(A          | )P(B | | A ) + | P(A )P(B | A | )   |
|     |     |     |     |            |        | 1           | 1                 |                | 2    | 2       | 3            | 3   |
|     |     |     |     |            |        |             | 0.4 (cid:215) 0.3 |                |      |         |              |     |
|     |     |     |     |            |      = |             |                   |                | =    | 0.2727  |              |     |
|     |     |     |     |            |        | (cid:215) + | 0.5(cid:215)      | + 0.1(cid:215) |      |         |              |     |
|     |     |     |     |            | 0.4    | 0.3         | 0.6               |                | 0.2  |         |              |     |

9.12.23. Funksioni i shpërndarjes së probabilitetit për një ndryshore diskrete të rastit X është
=
|     |     |     |     |     |     |     |     |  2k, |   x | 1   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- |

|     |     |     |     |     |     |     |     |  3k, |   x | = 3 |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- |
=
|     |     |     |     |     |     | f ( | x ) |    |     |     |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
=
|     |     |     |     |     |     |     |     |  4k, |   x | 5   |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ----- | --- | --- | --- | --- |

|                                                 |     |     |     |     |     |     |     |  0,     |  të  tjera |     |     |     |
| ----------------------------------------------- | --- | --- | --- | --- | --- | --- | --- | -------- | ---------- | --- | --- | --- |
| ku k është konstante. Të njehsohen: (a) k. (b)  |     |     |     |     |     |     |     | >2) (c)  | E(X).      |     |     |     |
P(X
Zgjidhje.
1
| a)  ∑ | f(x)= | f(1)+ | f(3)+ | f(5)=2k+3k+4k |     | =9k | =1. Prej ku, |     | =   | .   |     |     |
| ----- | ----- | ----- | ----- | ------------- | --- | --- | ------------ | --- | --- | --- | --- | --- |
k
9
x
1 7
b)    P(X >2)=P(X =3 ose X =5)=P(X =3)+P(X =5)= = f(3)+ f(5)=3k+4k =7k =7(cid:215) =
9 9
|     |        |                  |     |                 |                 |                 | 2           | 3           | 4 31 |     |     |     |
| --- | ------ | ---------------- | --- | --------------- | --------------- | --------------- | ----------- | ----------- | ---- | --- | --- | --- |
| c)  | E(X)=∑ | xf(x)=1(cid:215) |     | f(1)+3(cid:215) | f(3)+5(cid:215) | f(5)=1(cid:215) | +3(cid:215) | +5(cid:215) | =    |     |     |     |
|     |        |                  |     |                 |                 |                 | 9           | 9           | 9 9  |     |     |     |
x
9.12.24. Nëse 3 nga 20 gomat janë me defekt dhe 4 prej tyre zgjidhen rastësisht për  inspektim. Sa
është probabiliteti që vetëm një nga gomat me defekt të përfshihet në ispektim?
|     |     |     |     |     |     |     |     | 3   |     | 17  |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
Zgjidhje. Nga të dhënat e detyrës,  kemi:  n = 4, p= , q =1- p = . Kështu,
|     |     |     |     |     |     |     |     | 20  |     | 20  |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
3
|     |     |     |     |                                |     |     |     | 3 17 |     | 4(cid:215) 3(cid:215)173 |           |     |
| --- | --- | --- | --- | ------------------------------ | --- | --- | --- | ----- | --- | ------------------------ | --------- | --- |
|     |     |     |     | P(x = 1) =  C1·p1 ·q(4 - 1) =  |     |     |     | 4. . |  = |                          | = 0,368.  |     |
4
|     |     |     |     |     |     |     |     | 20 20 |     | 204 |     |     |
| --- | --- | --- | --- | --- | --- | --- | --- | ------- | --- | --- | --- | --- |

9.12.25. Dy monedha hidhen njëkohësisht dhjetë herë. Gjeni probabilitetin e gjetjes së të  paktën
 shtatë N?
                                                                                                                           [Rez: 0,172]

9.12.26. Në një fabrikë prodhimi 10% e bulonave të prodhuara nga një makinë e caktuar rezultojnë
me defekt. Gjeni probabilitetin që në një kampion prej 10 bulonash të zgjedhura rastësisht,
saktësisht dy të jenë me defekt duke përdorur:
|                                      | (i)   | shpërndarjen binomiale      |     |     |     |                    |     |     |            |     |     |     |
| ------------------------------------ | ----- | --------------------------- | --- | --- | --- | ------------------ | --- | --- | ---------- | --- | --- | --- |
|                                      | (ii)  | Shpërndarjen e Poisson-it.  |     |     |     |                    |     |     |            |     |     |     |
|                                      |       |                             |     |     |     | 10 =0,1, n = 10, l |     |     |            |     |     |     |
|  Zgjidhje. Nga të dhënat kemi:  p =  |       |                             |     |     |     |                    |     |     |  = np = 1  |     |     |     |
100
|     | i)  | Me shpërndarje binomiale:   |     |     |     |     |     |     |     |     |     |     |
| --- | --- | --------------------------- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
 q = 1 – p = 1 – 0,1 = 0,9
10(cid:215)
|     | P(X=2) = C2 |     |     | p2 q(n -2) =  |     | 9 (cid:215) 0,12(cid:215) 0,98 | =      |     |     |     |     |     |
| --- | ----------- | --- | --- | ------------- | --- | ------------------------------ | ------ | --- | --- | --- | --- | --- |
|     |             |     |     |               |     |                                | 0,194  |     |     |     |     |     |
|     |             |     | 10  |               |     | 2                              |        |     |     |     |     |     |
|     |             |     |     |               |     |                                |        | 71  |     |     |     |     |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica

| ii)       |   Me shpërndarje Poisson-it:  |       |       |         |     |     |     |     |
| --------- | ----------------------------- | ----- | ----- | ------- | --- | --- | --- | --- |
|           |                               | - ll2 | -     |         |     |     |     |     |
|           |                               | e     | e 112 | 1       |     |     |     |     |
|   P(X=2)  | =                             | =     | =     | =0,184  |     |     |     |     |
|           |                               | 2!    | 2     | 2e      |     |     |     |     |

9.12.27. Një qendër urgjencash merr mesatarisht 4 thirrje urgjente në interval prej 10 min. Sa është
probabiliteti që:
(i)  të ketë të shumtën 2 thirrje urgjente;
(ii)
ka saktësisht 3 thirrje urgjente në interval prej 10 min?
| Zgjidhje. Nga të dhënat, kemi l |                          |         |         | =4.       |       |       |              |     |
| ------------------------------- | ------------------------ | ------- | ------- | --------- | ----- | ----- | ------------ | --- |
|                                 |                          |         |         |           | - ll0 | - ll1 | - ll2        |     |
|                                 |                          |         |         |           | e     | e     | e            |     |
|      (i)    P(X£                | 2)=P(X=0)+P(X=1)+ P(X=2) |         |         |           | = +   |       | + = 0,238.   |     |
|                                 |                          |         |         |           | 0!    | 1!    | 2!           |     |
|                                 |                          | e - ll3 | e - 443 |           |       |       |              |     |
|      (ii)    P(X=3) =           |                          |         | =       | = 0,195   |       |       |              |     |
|                                 |                          | 3!      | 3!      |           |       |       |              |     |

9.12.28. Një aparaturë përbëhet prej 100 pjesëve. Probabiliteti që një pjesë të dështojë  brenda  një
viti është 0,01. Sa është probabiliteti që të dështojnë:
| a)  | Dy pjesë                    |     |     |     |     |     |     |     |
| --- | --------------------------- | --- | --- | --- | --- | --- | --- | --- |
| b)  | Të paktën 2 gjatë një viti  |     |     |     |     |     |     |     |
Zgjidhje. Bëhet fjalë për shpërndarje të Bernulit  n=100,    p=0,01    q=0,99. Meqë  np=1=l <10,
përafrimi bëhet me shpërndarje të Puasonit:
12
|               | a)    P(X =2)=e | -   | 1 » 0,184  |     |     |     |     |     |
| ------------- | --------------- | --- | ---------- | --- | --- | --- | --- | --- |
2!
|                |           | ‡ 2)=1- | <2)=1- |     | =0)+P(X | =1))» | 0,264  |     |
| -------------- | --------- | ------- | ------ | --- | ------- | ----- | ------ | --- |
|                | b)    P(X |         | P(X    |     | (P(X    |       |        |     |
9.12.29. Probabiliteti që një person e përkrah vizitën në teater është 0.6. Të caktohet probabiliteti
që nga tetë persona të zgjedhur rastësisht të jenë:
| a)  | saktësisht 3 persona që përkarahin vizitën në teatër   |     |     |     |     |     |     |     |
| --- | ------------------------------------------------------ | --- | --- | --- | --- | --- | --- | --- |
| b)  | më shumë se 5 persona që përkrahin vizitën në teatër   |     |     |     |     |     |     |     |
Zgjidhje. Le të konsiderojmë si ngjarje të volitshme:”përkrahet vizita në teatër”.Atëherë në bazë të
kushteve të detres kemi: p=0.6 dhe q=1-p=1-0.6=0.4
Le të jetë X-numri i përkrahësve të vizitës në teatër.Atëherë:
8
| a)  P(X=3)= | D   | E(0.6)(cid:14)∙(0.4)$F(cid:20) |     | =   | 0.124   |     |     |     |
| ----------- | --- | ------------------------------ | --- | --- | ------- | --- | --- | --- |
3
b)  Kërkohet P(X>5). Pra
             P(X>5)=P(X=6)+ P(X=7)+ P(X=8)=
|             = | 8                                  |     |     | 8                                |                                  |           | 8                 |     |
| ------------- | ---------------------------------- | --- | --- | -------------------------------- | -------------------------------- | --------- | ----------------- | --- |
|               | D E(0.6)(cid:16)∙(0.4)$F(cid:16)+D |     |     |                                  | E(0.6)(cid:13)∙(0.4)$F(cid:13)+D |           | E(0.6)$∙(0.4)$F$  |     |
|               | 6                                  |     |     | 7                                |                                  |           | 7                 |     |
|             = | 8 E(0.6)(cid:16)∙(0.4)(cid:14)+D   |     |     | 8 E(0.6)(cid:13)∙(0.4)(cid:11)+D |                                  | 8 E(0.6)$ |                   |     |
|               | D                                  |     |     |                                  |                                  |           | = 0.315           |     |
|               | 6                                  |     |     | 7                                |                                  | 7         |                   |     |
9.12.30. Le të jenë dhënë ndryshoret e rastit diskret me ligjet e shpërndarjes:
|                             |     | -   |     |     |                    |     | -       |      |
| --------------------------- | --- | ---- | --- | --- | ------------------ | --- | -------- | ---- |
|                             |     | 2    | 0   | 4   | 6                 |     | 1 0      | 1   |
|                             |     | =    |     |     |                    |     | =        |      |
|                           X |     |     |     |     |        dhe      Y |     |         |     |
|                             |     | 0,1 | 0,6 | 0,2 | 0,1               |     | 0,7 0,1 | 0,2 |
|                             |     |      |     |     | 72                 |     |          |      |

Përgatiti: A. Jusufi, D. Berisha,M.Reqica
a) Të gjendet ligji i shpërndarjes Z = Z(X,Y) = X +2Y
b) Të gjenden E(X),E(Y), dhe E(X +Y)
[Udhëzim: Vepro si në shembullin 9.7.3]
73
