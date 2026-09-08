# ROADMAP – Struktura Diskrete 2 prej zeros

Ky dokument është plani që do ta ndjekim me radhë gjatë përgatitjes për provim. Është ndërtuar nga:

- provimet e kaluara të dërguara;
- shënimet e dorës;
- ushtrimet e ligjëratave;
- përmbledhja e teorisë;
- materialet ekzistuese në këtë folder.

> **Rregulli ynë:** nuk supozojmë që dihet asnjë hap. Çdo temë mësohet në këtë rend:
> 1. kuptimi i thjeshtë;
> 2. pse ekziston dhe prej nga del formula;
> 3. procedura hap pas hapi;
> 4. një detyrë reale nga provimet;
> 5. një detyrë e zgjidhur bashkë;
> 6. një detyrë për t'u zgjidhur vetë;
> 7. kontrolli i përgjigjes dhe gabimet tipike.

---

## Pamja e provimit

Nga variantet e provimeve që kemi:

| Pjesa | Tema tipike | Pikët e zakonshme |
|---|---|---:|
| Detyra 1 | Matrica gjeneruese ose Hamming | 11 |
| Detyra 2 | Hamming, grupi standard ose kod ciklik | 12–15 |
| Detyra 3 | Probabilitet ose kontrolli me polinom | 10–15 |
| Detyra 4 | Statistikë me të dhëna të grupuara | 16–18 |
| Detyra 5 | Shpërndarje probabiliteti ose funksion gjenerues | 17 |
| Detyra 6 | Vargu nga funksioni gjenerues | 17 |
| Teoria | 4 pyetje të shkurtra | 12 |

---

# FAZA 1 – Teoria e kodeve

Materiali kryesor: [01 – Teoria e Kodeve](<./01 - Teoria e Kodeve.md>)

## 1. Bazat binare dhe GF(2)

- [ ] Kuptoj çka janë bitat 0 dhe 1.
- [ ] Di mbledhjen mod 2: 0+0, 0+1, 1+0, 1+1.
- [ ] Kuptoj pse mbledhja mod 2 është XOR.
- [ ] Di si mblidhen dy vektorë bit për bit.
- [ ] Kuptoj çka janë (V(n,2)), mesazhi, kodi dhe fjalëkodi.

## 2. Pesha dhe largesa e Hammingut

- [ ] Di të gjej peshën (w(c)).
- [ ] Di të gjej largesën (d(x,y)).
- [ ] Di të gjej largesën minimale (d(C)).
- [ ] Kuptoj pse për një kod linear mjafton pesha minimale jo-zero.
- [ ] Di sa gabime zbulohen dhe korrigjohen nga (d(C)).

## 3. Kodet lineare dhe pavarësia lineare

- [ ] Kuptoj çka e bën një kod linear.
- [ ] Di të kontrolloj nëse bashkësia (C) është kod linear.
- [ ] Kuptoj çka janë baza, dimensioni dhe rangu.
- [ ] Dalloj vektorët linearisht të pavarur nga ata të varur.
- [ ] Nga numri i fjalëkodeve di të gjej (k) me (M=2^k).

## 4. Matrica gjeneruese (G)

- [ ] Kuptoj pse (G) ka madhësi (k\times n).
- [ ] Di të gjej një bazë dhe ta ndërtoj (G).
- [ ] Di të gjeneroj të gjitha mesazhet binare me gjatësi (k).
- [ ] Di të llogaris (c=mG) mod 2.
- [ ] Di të gjeneroj tërë kodin nga rreshtat e (G).
- [ ] Di ta sjell (G) në formën sistematike (G=[I_k\mid P]).
- [ ] Di ta zgjatoj një kod me bit pariteti.
- [ ] Di t'i shkruaj fjalëkodet në formë polinomiale.

**Detyrat e provimit që mbulohen:** gjetja e (G) nga një kod i listuar, zgjatja në gjatësi 4 dhe gjenerimi i kodit nga një matricë e dhënë.

## 5. Matrica e kontrollit (H)

- [ ] Kuptoj pse numri i bitave të kontrollit është (r=n-k).
- [ ] Kuptoj pse (H) ka madhësi ((n-k)\times n).
- [ ] Kuptoj kushtin (Hc^T=0).
- [ ] Kuptoj kushtin (GH^T=0).
- [ ] Nga (G=[I_k\mid P]) di të ndërtoj (H=[P^T\mid I_r]).
- [ ] Nga (H) di të rikthej matricën (G).

## 6. Sindroma dhe korrigjimi i gabimit

- [ ] Kuptoj çka është vektori i pranuar (r=c+e).
- [ ] Di të llogaris sindromën (s=Hr^T).
- [ ] Kuptoj pse sindroma ka (n-k) bita.
- [ ] Dalloj rastin (s=0) nga (s\neq0).
- [ ] Di ta krahasoj sindromën me kolonat e (H).
- [ ] Di ta gjej pozitën e gabimit dhe ta ndryshoj bitin.
- [ ] Di ta nxjerr mesazhin pasi korrigjohet fjalëkodi.

## 7. Kodi Hamming (C[7,4])

- [ ] Nga ([7,4]) di të gjej (n=7), (k=4), (r=3).
- [ ] Kuptoj kushtin (2^r\ge n+1).
- [ ] Di pse kolonat e (H) duhet të jenë jo-zero dhe të ndryshme.
- [ ] Di ta ndërtoj vetë (H), jo vetëm ta kopjoj.
- [ ] Di ta ndërtoj (G) nga (H).
- [ ] Di t'i gjej formulat për (p_1,p_2,p_3) nga (G).
- [ ] Di ta kodoj mesazhin (m=0110).
- [ ] Di të kontrolloj dhe korrigjoj një gabim me sindromë.
- [ ] Dalloj formën sistematike nga renditja klasike (p_1p_2d_1p_3d_2d_3d_4).

**Detyrë reale e provimit:** “Është dhënë mesazhi (m=[0110]); të gjenerohet një fjalëkod i kodit Hamming (C[7,4]).”

## 8. Hamming (C[9,5])

- [ ] Di të gjej (r=9-5=4).
- [ ] Kuptoj pse sindroma ka 4 bita.
- [ ] Di të zgjedh 9 kolona të ndryshme jo-zero për (H).
- [ ] Di ta vendos (I_4) në fund të (H).
- [ ] Di ta ndërtoj (G=[I_5\mid P]).
- [ ] Di të kontrolloj (GH^T=0).

**Detyrë reale e provimit:** ndërtimi i matricës së kontrollit (H) dhe matricës gjeneruese (G) për (C[9,5]).

## 9. Grupi standard dhe klasat (a+C)

- [ ] Kuptoj çka është klasa (a+C).
- [ ] Di ta gjeneroj rreshtin e parë (C).
- [ ] Di të zgjedh udhëheqësit me peshë minimale.
- [ ] Di ta plotësoj grupin standard pa përsëritje.
- [ ] Di ta gjej vektorin e pranuar në tabelë.
- [ ] Di ta gjej vektorin e gabimit.
- [ ] Di ta korrigjoj fjalëkodin dhe ta dekodoj mesazhin.

## 10. Kodet polinomiale dhe ciklike

- [ ] Di ta kthej një vektor në polinom dhe anasjelltas.
- [ ] Di mbledhjen dhe shumëzimin e polinomeve mod 2.
- [ ] Di pse termat e njëjtë anulohen: (x^i+x^i=0).
- [ ] Di të kodoj me (c(x)=m(x)g(x)).
- [ ] Di ta pjesëtoj (r(x)) me (g(x)).
- [ ] Kuptoj çka tregon mbetja.
- [ ] Di të kontrolloj nëse ka ndodhur gabim.
- [ ] Di të ndërtoj tabelën (x^i\bmod g(x)) për korrigjimin e një gabimi.
- [ ] Di ta gjej fjalëkodin e pranueshëm dhe mesazhin.
- [ ] Di kushtet (deg g=n-k) dhe (g(x)\mid(x^n+1)).

---

# FAZA 2 – Probabiliteti

Materiali kryesor: [02 – Probabiliteti](<./02 - Probabiliteti.md>)

## 11. Bazat e probabilitetit

- [ ] Eksperimenti, hapësira e rezultateve dhe ngjarja.
- [ ] Ngjarjet e volitshme dhe probabiliteti klasik.
- [ ] Bashkimi, prerja dhe komplementi.
- [ ] Ngjarjet e varura dhe të pavarura.
- [ ] Probabiliteti me dhe pa kthim.
- [ ] Probabiliteti i kushtëzuar dhe formula e Bayes-it.

## 12. Kombinatorika që nevojitet në detyra

- [ ] Faktoriali.
- [ ] Kombinacionet (inom nk).
- [ ] Si numërohen zgjedhjet pa renditje.
- [ ] Pse përdorim kombinacione kur tërheqim objekte pa kthim.

## 13. Ndryshorja e rastit dhe shpërndarja

- [ ] Si përcaktohen vlerat e mundshme të (X).
- [ ] Si ndërtohet tabela (x_i, P(X=x_i)).
- [ ] Kontrolli (sum P(X=x_i)=1).
- [ ] Pritja matematike (E(X)).
- [ ] (E(X^2)), varianca dhe dispersioni.

## 14. Modelet që përsëriten në provim

- [ ] Topa me ngjyra, tërheqje pa kthim.
- [ ] Vetura me ngjyra, zgjedhje pa kthim.
- [ ] Numri i objekteve të një ngjyre në mostër.
- [ ] Kalimi i objekteve nga një kuti/parking në tjetrin.

---

# FAZA 3 – Statistika

Materiali kryesor: [03 – Statistika](<./03 - Statistika.md>)

## 15. Tabela me intervale

- [ ] Kufijtë e klasave dhe frekuencat.
- [ ] Mesi i intervalit (x_i).
- [ ] Frekuenca kumulative.
- [ ] Ndërtimi i histogramit.

## 16. Mesataret

- [ ] Mesi aritmetik për të dhëna të grupuara.
- [ ] Mesi gjeometrik.
- [ ] Mesi harmonik.
- [ ] Kur dhe pse përdoret secili.

## 17. Vlerat pozicionale

- [ ] Klasa mediane dhe formula e medianës.
- [ ] Klasa modale dhe formula e modës.
- [ ] Kuartili i parë (Q_1).
- [ ] Kuartili i tretë (Q_3).
- [ ] Mënjanimi interkuartil sipas formulës së përdorur në ligjërata.

## 18. Shpërndarja e të dhënave

- [ ] Varianca.
- [ ] Devijimi standard.
- [ ] Interpretimi i rezultatit.
- [ ] Zgjidhja e plotë e një tabele reale nga provimi.

---

# FAZA 4 – Funksionet gjeneruese dhe rekurencat

Materiali kryesor: [04 – Funksionet Gjeneruese dhe Rekurencat](<./04 - Funksionet Gjeneruese dhe Rekurencat.md>)

## 19. Nga vargu te funksioni gjenerues

- [ ] Kuptoj (F(x)=a_0+a_1x+a_2x^2+\cdots).
- [ ] Di ta lexoj koeficientin e (x^n).
- [ ] Di funksionet bazë gjeometrike.
- [ ] Di të trajtoj zero në fillim të vargut.
- [ ] Di të trajtoj vargjet periodike si (7,3,7,3,\ldots).

## 20. Nga funksioni gjenerues te vargu

- [ ] Di të përdor formulën binomiale.
- [ ] Di të nxjerr disa anëtarë nga ((1-ax)^{-k}).
- [ ] Di çka ndryshon kur kemi ((1+ax)^{-k}).
- [ ] Di t'i zgjidh format që përsëriten në provim:
  - ((1+2x)^{-2})
  - ((1+2x)^{-4})
  - ((1-3x)^{-4})

## 21. Relacionet rekurente

- [ ] Kuptoj relacionin rekurent linear homogjen.
- [ ] Di ta formoj ekuacionin karakteristik.
- [ ] Di rastin e rrënjëve të ndryshme.
- [ ] Di rastin e rrënjës së shumëfishtë.
- [ ] Di t'i përdor kushtet fillestare.

---

# FAZA 5 – Teoria dhe simulimi

Materialet:

- [07 – Pyetjet Teorike](<./07 - Pyetjet Teorike (Flashcards).md>)
- [08 – Formulari](<./08 - Formulari (Cheat Sheet).md>)
- [05 – Provimet e Kaluara](<./05 - Provimet e Kaluara - Zgjidhje të Plota.md>)
- [06 – Detyra për Ushtrim](<./06 - Detyra për Ushtrim (me zgjidhje).md>)
- [09 – Provim Simulues](<./09 - Provim Simulues i Ri.md>)

## 22. Pyetjet teorike

- [ ] Fjalëkodi, kodi linear, (G), (H), sindroma.
- [ ] Pesha dhe largesa minimale e Hammingut.
- [ ] Vektorët linearisht të varur/pavarur.
- [ ] Probabiliteti klasik dhe vetitë e tij.
- [ ] Ngjarjet e varura/pavarura.
- [ ] Formula e Bayes-it.
- [ ] Funksioni gjenerues i një vargu.

## 23. Kontrolli përfundimtar

- [ ] Mund ta zgjidh secilin tip pa shikuar formulat.
- [ ] Mund ta shpjegoj pse përdoret çdo formulë.
- [ ] Kam zgjidhur së paku një detyrë reale për çdo tip.
- [ ] Kam bërë një provim komplet me kohë.
- [ ] I kam kontrolluar gabimet dhe i kam përsëritur temat e dobëta.

---

# Rendi që do ta ndjekim në chat

1. Bazat e GF(2) dhe vektorët binarë.
2. Pesha dhe largesa e Hammingut.
3. Kodet lineare, baza dhe pavarësia lineare.
4. Matrica gjeneruese (G).
5. Matrica e kontrollit (H).
6. Sindroma.
7. Hamming (C[7,4]).
8. Hamming (C[9,5]).
9. Grupi standard (a+C).
10. Kodet polinomiale/ciklike.
11. Probabiliteti.
12. Statistika.
13. Funksionet gjeneruese.
14. Rekurencat.
15. Teoria dhe provimi simulues.

> Checklist-at plotësohen vetëm kur tema mund të zgjidhet dhe të shpjegohet pa ndihmë.
