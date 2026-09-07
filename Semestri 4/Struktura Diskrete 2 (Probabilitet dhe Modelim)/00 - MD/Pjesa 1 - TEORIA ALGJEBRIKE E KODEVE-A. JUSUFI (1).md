Matematikë Diskrete dhe Aplikime-A. Jusufi, K. Filipi
TEORIA ALGJEBRIKE E KODEVE
10.1. Hyrje në teorinë e kodimit
Supozojmë se jemi duke përdorur një lidhje Bluetooth për të përcjellë një MP3 fajll nga
smartphon-i në laptop. Të dhënat janë të modeluar si lidhje ndërmjet zerove dhe njëshave.
Kur dërgohet një 0, zakonisht pranohet 0 dhe kur dërgohet një 1 pranohet 1. Në disa raste,
pengesa të ndryshme në kanalin e transmetimit në formën e pengesave atmosferike ose
mosfunksionimit të harduerit e tje., bëjnë që ndonjë 0 të pranohet si 1 apo ndonjë 1 të pranohet
si 0. Lind kështu nevoja e përpunimit të mënyrave që i shmangin këto gabime. Këtij qëllimi i
shërbejnë të ashtuquajturit kodet e kontrollit të gabimit . Ato përdoren për të zbuluar dhe
korrigjuar gabimet që ndodhin, kur të dhënat transmetohen nëpërmjet disa kanaleve me
pengesa. Kështu, kur fotografitë transmetohen në Tokë nga një hapësirë e thellë, supozojmë
nga planeti Mars, kodet e kontrollit të gabimit përdoren për ti mbrojtur këto fotografi nga
ndikimi i pengesave të ndryshme në mënyrë që tek ne fotografitë të mbrrijnë sa më reale. Kode
të kontrollit të gabimit përdoren gjithashtu dhe në kompakt disqet (CD), në mënyrë që një CD-
aparat të mund të lexojë të dhëna edhe nga një CD, që ka gërvishje të lehta.
Fusha e Matematikës së Aplikuar që merret me studimin e kodeve të kontrollit të
gabimit quhet Teoria e kodimit. Kjo përfshin studimin dhe zbulimin e skemave të ndryshme të
kodeve të cilat përdoren për të evidentuar dhe korigjuar gabimet gjatë transmetimit të të
dhënave. Zanafillën Teoria e kodimit e ka te libri “Teoria matematikore e komunikimit “ e
Claude Shannon, botuar në vitin 1948.
Kjo teori është një nga aplikimet më të rëndësishme dhe të drejtpërdrejta të teorisë së
informacionit. Ajo është sot një degë e inxhinierisë elektrike, ku ndërthuren njohuri nga
matematika, nga komunikimi digjital dhe nga shkencat kompjuterike, që kanë për qëllim
zbulimin dhe përdorimin e metodave eficiente të transmetimit të të dhënave, në mënyrë që të
eliminohen humbjet në informacionet dhe të korrigjohen gabimet e induktuara nga një kanal
me zhurmë.
Modeli themelor i komunikimit përbëhet nga burimi (dhënësi) i informacionit, që
gjeneron informacionet e nevojshme për transmetim dhe nga marrësi i informacionit. Synimi
modelit të komunikimit është riprodhimi në formë ekzakte ose përafërsisht ekzakte nga
marrësi i mesazhit apo informacionit të ardhur nga burimi i tij. Diagrami në vijim (Fig.10.2.1)
paraqet sistemin e komunikimit gjatë transmetimit të të dhënave prej burimit të informacionit
deri te marrësi i informacionit nëpërmjet mediumit transmetues.
Burimi i Mediumi Marrësi i
Kodimi Dekodimi
informacionit transmetues informacionit
Zhurma

Matematikë Diskrete dhe Aplikime-A. Jusufi, K. Filipi
Fig.10.2.1. Sistemi i komunikimit
Dhënësi ka për detyrë që informacionin ta shndërrojë në një formë të përshtatshme për
transmetim nëpërmjet kanalit komunikues, kurse detyra e marrësit është që të tentojë të heqë
deformimet dhe gabimet, si dhe vazhdimisht të transformojë informacionin në një formë të
përshtatshme për destinacionin.
Gjatë transmetimit të informacionit mund të shkaktohen gabime ose deformime si
rezultat i ndikimit të pengesave (zhurmave) në kanalin komunikues. Natyrisht, gjithmonë
synohet që transmetimi të bëhet me një shkallë të caktuar kualiteti, varësisht nga mundësitë që
ka marrësi, i cili mund të korrigjojë disa gabime serioze të shkaktuara gjatë transmetimit nëpër
kanal, ndërkohë që mund të tolerojë disa të tjera, para se ta dërgoj informacionin e ardhur në
destinacion. Veç kësaj, duke ditur se të gjitha informacionet që gjeneron burimi nuk janë të
rëndësishme për destinacionin, marrësi ka për detyrë të mënjanojë pjesën e parëndësishme të
tij. Pjesa e mbetur e informacionit quhet informacion efektiv. Një proces i tillë quhet reduktim
i të
dhënave.
Informacioni efektiv shpesh përpunohet, duke u shndërruar në një formë tjetër (p.sh.
binar) që i jep atij një strukturë të brendëshme të vetën. Me përdorimin e kodimit nga burimi,
që ndryshe quhet edhe komprimim i të dhënave, informacioni efektiv paraqitet në formë sa të
jetë e mundur më kompakte.
Eshtë shumë e rëndësishme mbrojtja e informacionit nga përdorime të paautorizuara.
Përmes kodeve për shifrim bëhet e ashtuquajtura mbrojtja shifrore (kriptimi ose shifrimi).
Informacioni i mbrojtur nuk është i pandjeshëm ndaj gabimeve që mund të ndodhin në kanal.
Prandaj dhënësi fut informacion shtesë, i cili do të shfrytëzohet gjatë rikonstruktimit të
informacionit burimor, kur gjatë transmetimit kanë ndodhur gabime. Kësaj i shërben kodimi i
kanalit ose kodimi për kontrollin e gabimeve (error control coding). Për këtë shfrytëzohen kode
me mundësi detektimi dhe (ose) korrigjimi të gabimeve. Informacionin e përgatitur në këtë
mënyrë dhënësi e dërgon në kanal, ku transmetimi i tij bëhet nga sinjalet e duhura (p.sh.
elektrike). Kanalin e konsiderojmë diskret kur nëpërmjet tij informacioni transmetohet në nivel
simbolesh nga hyrja deri në dalje të kanalit. Shndërrimi i simboleve në sinjale quhet modulim.
Sinjalet e përftuara nga modulimi i ekspozohen pengesave (zhurmave) të kanalit. “Përzierja”
sinjal-zhurmë shndërrohet përsëri në simbole gjatë demodulimit. Zhurma prezente mund të
shkaktojë ndryshimin e simboleve të përftuar pas demodulimit nga ata të dërguar, pra të
shkaktohen gabime në transmetim. Prandaj informacioni i përftuar pas deshifrimet dekodohet,
dhe mandej në rikonstruktimin e të dhënave shndërrohet në formë të përshtatshme për
destinacionin.
10.1.1. Shembuj të kodeve të kontrollit të gabimit
Theksojmë fillimisht, që në shembujt më poshtë dhe më tej në shtjellimin e Teorisë së

Matematikë Diskrete dhe Aplikime-A. Jusufi, K. Filipi
kodimit një sistem i radhitur me n koordinata (vektor me n përmasa) (x , x , …, x ) shënohet
1 2 n
edhe në trajtën x x … x , ku koordinatat vendosen thjesht njera pas tjetrës.
1 2 n
Kodi ISBN me dhjetë shifra. Një kod ISBN është një një sistem i radhitur me n
•
koordinata (x , x , …, x ) nga bashkësia e 10 shifrave {0, 1, 2, ..., 9}, i shënuar në trajtën
1 2 10
x x … x , ku koordinatat vendosen thjesht njera pas tjetrës, të ndara tek tuk me një vizë,
1 2 n
duke vendosur përpara shkronjat ISBN. Një i tillë është për shembull shënimi ISBN 99943-
862-0-4 . Kodi ISBN me dhjetë shifra përdoret shpesh nga shtëpitë botuese dhe i
bashkangjitet librit për të identifikuar karakteristikat e tij. Nëntë shifrat e para përfaqësojnë
informacione të ndryshme mbi librin si gjuhën, publikuesin, titullin etj. Kodi njihet me
emrin “numri ndërkombëtar i librit standard me dhjetë shifra”. Kodi i mësipërm është i
librit “Algjebra I” i autorit Bashkim Gazidede.
Në mënyrë që të mbrohet nga gabimet, shifra e dhjetë e kodit është një shifër kontrolli,
e zgjedhur në mënyrë të tillë që koordinatat x , x , …, x të kodit të vërtetojnë relacionin
1 2 10
10
å
(11- i)x º 0 (mod11).
i
i=1
Shembull 10.2.1.1. Për cilën vlerë të t vargu i shifrave 99856 – 762 – 3 – t shërben si
ISBN kod?
Zgjidhje.
10 ∙ 9 + 9 ∙ 9 + 8 ∙ 8 + 7 ∙ 5 + 6 ∙ 6 + 5 ∙ 7 + 4 ∙ 6 + 3 ∙ 2 + 2 ∙ 3 + 1 ∙ t ≡ 0 (mod 11);
377+t≡ 0 (mod 11);
t=3.
Pra, 3 është shifër kontrolli dhe ISBN kodi është ISBN 99856–762–3–3.
Kodi ISBN me trembëdhjetë shifra. Një tjetër numër ndërkombëtar i librit standard
•
është ISBN kodi me 13 shifra. Në këtë ISBN kod rritet numri i shifrave që përfaqësojnë
informacione mbi librin nga 9 në dymbëdhjetë, pra rritet sasia e informacioneve ndaj librit.
Shifër kontrolli në këtë kod është shifra e trembëdhjetë e zgjedhur në mënyrë të tillë që
koordinatat x , x , …, x të kodit të vërtetojnë relacionin
1 2 13
x = 10 - (x + 3× x + x + 3× x + x + 3× x + x + 3× x + x + 3× x + x + 3× x ) (mod10)
13 1 2 3 4 5 6 7 8 9 10 11 12
Shembul 10.2.1.2. Për cilën vlerë të t vargu i shifrave 978-9928-07-147-t shërben si
ISBN kod?
Zgjidhje. t = 10 - (9 + 3× 7 + 8 + 3× 9 + 9 + 3× 2 + 8 + 3× 0 + 7 + 3×1+ 4 + 3× 7) (mod10) ;
t= 10-123 (mod 10)=10-3=7.
Nëse shfletohet baza e të dhënave të ISBN kodeve, do të shohim se ISBN 978-9928-07-147-7
është ISBN kodi i librit “Algjebër Abstrakte”, autori Kristaq Filipi, botuar në Tiranë, më 2013.
Kodi i përsëritshëm. Ky është një kod i korrigjimit të thjeshtë të gabimit. Supozojmë
•
se duhet dërguar një 1-sh për të thënë “PO” dhe një 0 për të thënë “JO”. Nëse thjeshtë dërgohet
një bit, atëherë ka mundësi që pengesat e ndryshme në kanalin e transmetimit ta prishin atë bit
dhe të merret një mesazh i paqëllimshëm. Për të evituar ketë mund të përdoret i ashtuquajturi
kodi i përsëritshmëm, sipas të cilit në vend që të dërgohet një bit dërgohen pesë bita d. m. th.
11111 për të përfaqësuar 1 ose “PO-në” dhe 00000 për të përfaësuar 0 ose “JO-në”. Shifrat që

Matematikë Diskrete dhe Aplikime-A. Jusufi, K. Filipi
përsëriten gjatë përdorimit të tij janë dy 0 dhe 1, prandaj  ky kod quhet edhe kodi binar.
Ndryshe themi që alfabeti i kodit është fusha Gallua GF(2)={0, 1} me dy elemente.

Kodi 2D. Kështu quhet kodi që ka si alfabet fushën Gallua GF(2)={0, 1} me dy
•
elemente, të cilat vendosen si elemente të një matrice në varësi të mesazhit që duhet të përcillet.
Supozojmë se duhet koduar mesazhi 20-bitsh 11011011001100101011. Fillimisht këtë
mesazh rresht me 20 koordinata e copëtojmë në 4 rreshta me nga 5 koordinata, duke e ruajtur
renditjen. I konsiderojmë ato si rreshtat e një matrice, duke formuar në këtë mënyrë një matrice
M me 4 ×	5 përmasa si më poshtë, që quhet matrica e mesazhit:
|       | 1	 1	 | 0	 1	 | 1	  |     |     |
| ----- | ----- | ----- | --- | --- | --- |
|       | 0 1	  |       | 0   |     |     |
| M = [ | 	     | 1	 0	 | ].  |     |     |
|       | 1	 1	 | 0	 0	 | 1	  |     |     |
|       | 0	 1	 | 0	 1	 | 1	  |     |     |
E plotësojmë  djathtas çdo rresht dhe në fund çdo shtylle të matricës M , përjashtuar rreshtin
dhe shtyllën e fundit të saj, me një bit kontrolli të tillë që shuma e njëshave në çdo rresht të ri
dhe në çdo shtyllë të re të jetë çift. Ndërkaq, plotësimi në fund të rreshtit dhe shtyllës së fundit
të matricës M  bëhet nga ndryshori  x  {0, 1}., i cili quhet  bit kontrolli i mesazhit. Fitojmë
Î
kështu matricën e plotësuar
|     |      | 1	  | 1	 0	 | 1	  | 1	 0	   |
| --- | ---- | --- | ----- | --- | ------- |
|     |      | 0	  | 1	 1	 | 0	  | 0	 0	   |
|     | 𝐶	=	 | 1	  | 1	 0	 | 0	  | 1	 1	.  |
|     |      | 0	  | 1	 0	 | 1	  | 1	 1	   |
|     |      | [0	 | 0	 1	 | 0	  | 1	 𝑥]	  |
Në mesazhin e koduar vemë re se ndryshori x ka vlerën 0, prandaj matrica e mesazhit të koduar
ka pamjen e mëposhtëme:

|     |      | 1	  | 1	 0	 | 1	 1	 | 0	  |
| --- | ---- | --- | ----- | ----- | --- |
|     |      | 0	  | 1	 1	 | 0	 0	 | 0	  |
|     | 𝐶	=	 | 1	  | 1	 0	 | 0	 1	 | 1	  |
|     |      | 0	  | 1	 0	 | 1	 1	 | 1	  |

|     |     | [0	 |       |       | 0]   |
| --- | --- | --- | ----- | ----- | ---- |
|     |     |     | 0	 1	 | 0	 1	 | 5𝑥6	 |
Duket se ai është një mesazh tridhjetë bitësh 110110 011000 110011 010111 001010,  i cili
mbartet përtej kanalit të transmetimit.
Të tregojmë tani se si mund të korrigjohet (apo përmirësohet) një gabim. Supozojmë
që marrësi pranon mesazhin tridhjetë bitësh dhe, mbasi e sistemon atë në matricë të tipit 5x6,
merr

|     |     | 1	  | 1	 0	 | 1	 1	 | 0	  |
| --- | --- | --- | ----- | ----- | --- |

|     |      | 0	  | 1	 1	  | 𝟏	    | 0	 0	 |
| --- | ---- | --- | ------ | ----- | ----- |
|     | 𝑅	=	 | 1	  | 1	 0	  | 0	 1	 | 1	 .  |
|     |      | 0	  | 1		 0	 | 1	 1	 | 1	    |

|     |     | [0	 | 0	 1	 | 0	 1	 | 0]  |
| --- | --- | --- | ----- | ----- | --- |
5𝑥6

Pastaj marrësi kontrollon shumat e njëshave në çdo rresht dhe në çdo shtyllë të matricës. Kur
të gjitha shumat dalin çift, atëherë ai mendon se nuk kanë ndodhur gabime. Në rast të kundërt
ai konstaton elementin e matricës, që sjell gabimin dhe e korrigjon atë. Në këtë shembull, duket
se shumat e njëshave në rreshtin e dytë dhe në shtyllën e katërt janë tek. Kjo çon në përfundimin

Matematikë Diskrete dhe Aplikime-A. Jusufi, K. Filipi
se ka ndodhur gabim në pozicionin (2,4), prandaj korrigjohet ky gabimin dhe mandej lexohet
mesazhi që do të dërgohet në destinacion.
Theksojmë se alfabetet që përdoren në teorinë e kodimit janë fushat Gallua GF(q) me
q elemente. Një kod është q-sh nëse alfabeti i tij është fusha Gallua GF(q) . Kodet ISBN janë
10-sh, pasi simbolet e tyre janë elemente të bashkësisë së shifrave {0, 1, …, 9}. Kodi i
përsëritshëm dhe 2D-kodi janë dysh ose binarë, sepse alfabeti i tyre është GF(2) ={0, 1}.
10.2. Parametra të rëndësishme të kodit
Kod quhet një bashkësi sistemesh të radhitura me elemente nga një alfabet i dhënë
GF(q)., ndërsa çdo sistem i radhitur i asaj bashkësie quhen fjalëkod (codewords). Procesi i
kodimit është kështu proces formimi bashkësish me elemente sisteme të radhitura, d. m. th.
vektorë. Numri i koordinatave (komponenteve) në një fjalëkod quhet gjatësi e tij.
Përkufizim 10.3.1. Një kod 𝐶 quhet bllok kod ose kod me gjatësi të fiksuar, në qoftë se
të gjitha fjalëkodet e tij kanë gjatësi të njejtë. Ai quhet kod me gjatësi të ndryshme, në qoftë se
përmban dy fjalëkode me gjatësi të ndryshme. Numri i fjalëkodeve të një kodi C shënohet |𝐶|.
Për çdo kod binar 𝐶 me gjatësi n vlen mosbarazimi 1 ≤ |𝐶| ≤ 2𝑛. Një bllok kod si
bashkësi sistemesh të radhitura me n koordinata, që janë elemente të fushës Gallua GF(q)
mund të formojë hapësirë lineare mbi këtë fushë. Nga Shembulli10.1.1.2. ai formon hapësirën
lineare V(n, q) mbi fushën GF(q), kur çdo vektor i tillë është një fjalëkod i tij, d. m. th. kur ai
përmban qn fjalëkode.
Shembull 10.3.1. Kodi binar 𝐶 = {000, 100, 010, 001, 110, 101, 011, 111}
përmban |𝐶| = 23 = 8 fjalëkode .
Përkufizim 10.3.2. Peshë e Hammingut e një fjalëkodi c nga kodi C quhet numri i
koordinatave (komponenteve) të ndryshme nga 0 në të; shënohet 𝑤(𝑐).
Shembull 10.3.2. Të gjendet pesha e Hammingut për fjalëkodet 000, 111 dhe 11011.
Zgjidhje. Pesha e Hammingut për secilin nga fjalkodet e mësipërme është 𝑤(000) = 0,
𝑤(111) = 3, 𝑤(11011) = 4.
Përkufizim 10.3.3. Largesë (distance) e Hammingut midis dy fjalëkodeve x dhe y të
një bllok kodi, që shënohet d(x, y), quhet numri i pozicioneve të koordinatave të tyre, ku ato
janë të ndryshme.
Shembull 10.3.3. d(0001, 1110) = 4, pasi fjalëkodet 0001 dhe 1110 në të katër
pozicionet e koordinatave, ato janë të ndryshme, ndërsa d(1101, 1011) = 2, pasi fjalëkodet
1101, 1011 kanë koordinata të ndryshme në pozicionin e dytë dhe të tretë.
Shembull 10.3.4. Për kubin tre bitësh (Fig. 10.3.1) të gjenden largesat e Hammingut
për fjalëkodet 100 , 011 dhe fjalëkodet 010, 111.
Fig. 10.3.1
Zgjidhje. Largesa d(100, 011) = 3 , pasi fjalëkodet 100 dhe 011 në të tre pozicionet
kanë koordinata të ndryshme, kurse largesa d(010, 111) =2, pasi fjalëkodet 010, 111 kanë
koordinata të ndryshme në pozicionin e parë dhe të tretë.

Matematikë Diskrete dhe Aplikime-A. Jusufi, K. Filipi
Përkufizim 10.3.4. Largesë e Hammingut e bllok kodit 𝐶 quhet largesa minimale
ndërmjet dy fjalëkodeve të ndryshme nga 𝐶; shënohet d(C). Pra,
𝑑(𝐶) = 𝑚𝑖𝑛{𝑑(𝑥, 𝑦)| x ¹ y , 𝑥, 𝑦 ∈ 𝐶}.
Përkufizim 10.3.5. Tip i bllok kodit C quhet simboli (𝑛, 𝑀, 𝑑) , ku n është gjatësia e
fiksuar, M është numri |𝐶| i fjalëkodeve dhe d është largesa d(C) e Hammingut e tij.
Shembull 10.3.5. Le të jetë C = {00000, 00111, 11111} një kod binar. Atëherë nga
d(00000, 00111) = 3, d(00000, 11111) = 5, d(00111, 11111) = 2 del që d(C) = 2; n=5, sepse
fjalëkodet janë pesë bitëshe; M=3, sepse kodi C ka tre fjalëkode. Prandaj C është kod binar i
tipit (5, 3, 2).
Largesa e Hammingut d midis dy fjalëkodeve nga hapësira vektoriale V(n, q) mbi
fushën GF(q) gëzon vetitë e mëposhtëme për çdo tre fjalëkode x, y, z nga kjo hapësirë:
1) d ( x, y ) ≥ 0, d ( x, x ) = 0;
2) d ( x, y ) = d ( y, x );
3) d ( x, y ) ≤ d ( x, z ) + d ( z, y ).
Vetia e tretë quhet mosbarazimi i trekëndëshit . Në këtë rast thuhet se largesa e Hammingut
d është një metrikë në hapësirën vektoriale V(n, q).
Për bllok kodet binare, që formojnë hapësirë vektoriale mbi fushën Gallua GF(2),
largesa e Hammingut ndërmjet dy fjalëkodeve x dhe y të saj është e njëjtë me peshën e
Hammingut të fjalëkodit shumë x+y (mod 2) apo ndryshesë x-y (mod 2): d (x, y) = w(x ± y) . Ky
pohim del lehtësisht, duke patur parasysh Tabelën 10.1.1 të mbledhjes + (mod 2) në fushën
Gallua GF(2).
Përkufizim 10.3.6. Shkallë e një bllok kodi quhet raporti k/n i gjatësisë k të një mesazhi
mbi gjatësinë n të mesazhit të koduar të tij.
Shembull 10.3.6.
• Shkalla e kodit ISBN dhjetëshifrorë është 9/10, pasi mesazhi 9-shifror është i koduar si
mesazh 10-shifror.
• Shkalla e kodit të përsëritshëm me gjatësi 5 është 1/5, pasi mesazhi 1-bitësh është i
koduar si mesazh 5-bitësh.
• Shkalla e 2D kodit është 20/30 apo 2/3, pasi mesazhi 20-bitësh është i koduar si mesazh
30-bitësh.
10.3. Zbulimi dhe korrigjimi i gabimeve
Një nga qëllimet kryesore të Teorisë së kodimit është zhvillimi i kodeve për të arritur
një ekuilibër midis vlerës sa më të vogël të gjatësisë 𝑛 (për bartje të shpejtë të mesazhit), vlerë
sa më të madhe të 𝑀 (për ta mundësuar transmetimin e mesazheve të shumëllojshme) dhe vlerë
sa më të madhe të 𝑑 (për të detektuar shumë gabime).
Lidhur me këtë të fundit supozojmë se një fjalëkod c = 𝑐 𝑐 𝑐 … 𝑐 me gjatësi n është
0 1 2 𝑛−1
dërguar përmes një kanali dhe vektori i pritur është r = 𝑟 𝑟 𝑟 … 𝑟 . Si vektor i gabimit merret
0 1 2 𝑛−1
me përkufizim vektori e = r - c = 𝑒 𝑒 𝑒 … 𝑒 . Puna e dekoderit është që, duke
0 1 2 𝑛−1

Matematikë Diskrete dhe Aplikime-A. Jusufi, K. Filipi
përcaktuar vektorin e gabimit, që është ndeshur në këtë rast, të vendosë se cili bit është
transmetuar gabimisht.
Shumë kode përdorin skemën e dekodimit më të afërt fqinj i cili zgjedh shifrën që
minimizon largesën midis vektorit të pranuar dhe vektorëve të mundshëm për t’u pranuar. Një
skemë e tillë për një kod q-sh, që maksimizon mundësinë e dekoderit për të përmirësuar
gabime, jepet duke u mbështetur në supozimet e mëposhtëme mbi kanalin:
• Çdo simbol i transmetuar ka të njëjtin probabilitet p (<1/2) të pranimit me gabim ( 1–
p të pranimit pa gabim).
• Kanali nuk ka kujtesë, në kuptimin që probabiliteti i pranimit me gabim të një simboli
të transmetuar nuk varet nga transmetimi më parë i simboleve të tjerë. Ky kanal quhet
kanal simetrik q-sh .
Kur analizojmë kodet, shpesh kemi nevojë të flasim për probabilitetin e disa ngjarjeve.
Kur përdorim p.sh. një fjalëkod q-sh me gjatësi n, shpesh bëhet pyetja: Sa është probabiliteti i
gabimeve që ndodhin brenda një fjalëkodi të tillë?
Shqyrtojmë këtë
Shembull 10.4.1. Supozojmë se është dhënë kanali simetrik q-sh me probabilitet p të
transmetimit me gabimi për çdo simbol. Të njehsohet probabiliteti që nuk ndodhin gabime
gjatë transmetimit të një fjalëkodi q-sh me gjatësi n.
Me qenë se kanali është simetrik q-sh, ai nuk ka kujtese, që do të thotë që ngjarjet e
pranimit pa gabim të çdo simboli mbas transmetimit janë të pavarura dhe ngjarja “nuk ndodhin
gabime gjatë transmetimit të një fjalëkodi q-sh me gjatësi n “ është prodhim i tyre. Ndërkaq,
duke qenë p probabiliteti i transmetimit me gabim për çdo simbol, probabiliteti i ngjarjes së
kundërt “ transmetimi pa gabim për çdo simbol” do të jetë 1-p. Por nga Teoria e probabiliteteve
dihet që probabiliteti i prodhimit është i barabartë me prodhimin e probabiliteteve për ngjarje
të pavarura, të cilat në këtë rast janë n sa gjatësia e fjalëkodit të dhënë. Prandaj probabiliteti i
kërkuar është (1 − 𝑝)𝑛.
