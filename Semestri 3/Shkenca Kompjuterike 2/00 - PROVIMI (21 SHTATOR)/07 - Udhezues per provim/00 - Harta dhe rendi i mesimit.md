# Harta e materialeve dhe rendi i mësimit

Ky udhëzues krahason **dy teste**: `01 - Provimi Shembull.pdf` në dosjen prind dhe **testin më të fundit në gjashtë fotot e bisedës**. Fotot nuk janë një PDF/zgjidhje në repository; detyra `Kinemaja` është zgjidhur veçmas te [02 - Kinemaja](<02 - Kinemaja e zgjidhur.md>).

## Fillimi i shpejtë

Nëse ke pak kohë, lexo sipas kësaj radhe:

1. [06 - Fleta e fundit](<06 - Fleta e fundit para provimit.md>) — 10 minuta për sintaksën.
2. [02 - Kinemaja](<02 - Kinemaja e zgjidhur.md>) — detyra e madhe e testit të fundit, **65 pikë**.
3. [01 - OOP dhe vendimet](<01 - OOP dhe vendimet ne detyre.md>) — pse secila klasë/atribut/metodë është aty; krahasim me `Punetori/Ndermarrja`.
4. [05 - Teoria dhe analiza](<05 - Teoria dhe analizimi i kodit.md>) — pyetjet dhe output-et e dy testeve.
5. [04 - Threads](<04 - Threads.md>) — 5–9 pikë me pak kod.
6. [03 - Files](<03 - Files java io.md>) — pjesa `java.io` e provimit shembull, 15 pikë.
7. [07 - Plotësime](<07 - Plotesime - metodat e koleksionit, teoria dhe threads.md>) — shtatë shabllonet e metodave të koleksionit (i pari/i fundit/mesatare/fshij), lexim objektesh nga file, modifikuesit, checked/unchecked, `final`, termat e threads nga ligjërata.

Lexoji si modele. Në provim, emrat dhe atributet mund të ndërrojnë.

## Çka kanë dy testet

| Pjesa | Provimi shembull në PDF | Testi i fundit në foto |
|---|---:|---:|
| Teori / analizim kodi | 12p teori + 4p interface | 15p koncepte + 15p analizim kodi |
| Hierarki dhe program Java | 60p `Punetori/Ndermarrja`, **varg** `Punetori[]` | 65p `Shfaqja/Filmi/Koncerti/Kinemaja`, **ArrayList** |
| Files | 15p `FileNumero` | Nuk shihet në fotot e testit të fundit |
| Threads | 9p teori + `OurThread` | 5p `ShfaqjaThread` |

**Përfundim praktik:** modeli i përbashkët është exception → klasë abstrakte → interface → nënklasa → koleksion/main. Dallimi me pikë është **varg apo `ArrayList`** dhe cilat metoda kërkohen. Testi i fundit nuk garanton formatin e provimit të ardhshëm, prandaj `java.io` e mbajmë në përmbledhje.

## Pamja e dosjeve: ku gjendet çka

| Dosja / fajlli | Përmbajtja e dobishme | Si ta përdorësh |
|---|---|---|
| `00 - PROVIMI (21 SHTATOR)/01 - Provimi Shembull.pdf` | Teksti i vjetër, 5 faqe | Referencë e saktë për `Punetori`, `FileNumero`, teori, threads. Është **identik** me `Week 12/Ushtrime/SHK2 - Provim Shembull.pdf`. |
| `02 - Pyetje Teorike (12p)/pergjigjet.md` | Gjashtë përgjigje të teorisë së vjetër | Lexoje pas [05](<05 - Teoria dhe analizimi i kodit.md>); ka më shumë shembuj. |
| `03 - Klasa dhe Interface (64p)/zgjidhja-provimi.md` | Pyetja e interface-ve + shpjegimi a–m | Për strukturën dhe pikët e detyrës së vjetër. |
| `03 - Klasa dhe Interface (64p)/zgjidhja-provimi/*.java` | Nëntë klasa të zgjidhura për `Punetori/Ndermarrja` | Zgjidhja e plotë e vjetër; `Ndermarrja.java` i ka metodat f–l. |
| `03 - Klasa dhe Interface (64p)/cheatsheet.md` | Shabllone Java | Kujdes: zgjidh shabllonin e **vargut** apo **ArrayList** sipas tekstit. |
| `04 - java.io (15p)/zgjidhja-provimi/FileNumero.java` | Lexim rreshtash + shkrim në file | Krahasoje me [03](<03 - Files java io.md>). |
| `04 - java.io (15p)/ushtrime/00 - I.O Streams...pdf`, detyra 8 | `LineCounter`, shumë e afërt me `FileNumero` | Ushtrim praktik i files. |
| `05 - Threads (9p)/zgjidhja-provimi/OurThread.java` | `extends Thread`, prioritet, `start()` | Modeli i testit të vjetër. |
| `06 - Provat e mia/GABIMET-E-MIA.md` | Gabime reale nga prova të mëparshme | Kontrolli i fundit para dorëzimit. |
| `13 - Week 12/Ushtrime/Shkenca Kompjuterike 2 -Perseritje.pdf` | `Libri/Biblioteka`: abstrakte, interface, exception, `ArrayList`, file | Ushtrimi javor më i afërt me hierarkinë e testit të fundit. |
| `13 - Week 12/Zgjidhjet/Ushtrimi 12 - Zgjidhja/*.java` | Zgjidhja e Bibliotekës | Shih shënimin për cast-in më poshtë. |
| `11 - Week 10/Ushtrime/Shkenca Kompjuterike 2 - ArrayList.pdf` | Ushtrim me `ArrayList`, `Iterator`, exception | Për të fiksuar `add`, `contains`, `for-each`. |
| `09 - Week 8/Ushtrime/Shkenca Kompjuterike 2 - Exceptions.pdf` | `EkipiOlimpik` i zgjeruar me hierarki dhe exception | Urë nga Week 1 te detyrat e provimit. |
| `10 - Week 9/Ushtrime/Shkenca Kompjuterike 2 - I.O Streams.pdf` | Lexim/shkrim; detyra 8 `LineCounter` | Vetëm nëse po ushtron `java.io`. |
| `12 - Week 11/Ushtrime/Shkenca Kompjuterike 2 - Threads.pdf` | Detyrë e gjatë me threads | Për konceptin `Runnable`; pyetja në testin e fundit është më e shkurtër. |

### Fajllat e zgjidhjeve kryesore, një nga një

| Fajlli | Çka duhet të marrësh prej tij |
|---|---|
| `PunetoriException.java` | `extends Exception`, `super(mesazhi)`; shkruhet para klasave që e përdorin. |
| `Individi.java` | Interface me `getKualifikimin()`. |
| `Punetori.java` | Bazë abstrakte: emër, moshë, get/set, validim, `angazhimiFullTime()`, `equals`. |
| `Shoferi.java` | Nënklasë me `regjioni` readonly dhe `super(emri, mosha)`. |
| `Koordinatori.java` | Nënklasë me `nrShofereve` jo negativ. |
| `Menaxheri.java` | Nënklasë që implementon `Individi`; `sektori` dhe `kualifikimi`. |
| `StafiAdministrativ.java` | Klasë abstrakte ndërmjetëse; mban `departamenti`. |
| `Drejtori.java` | `extends StafiAdministrativ implements Individi`; `super` me 3 parametra. |
| `Ndermarrja.java` | Vargu `Punetori[]`, metodat f–l dhe `main` i provimit të vjetër. |
| `FileNumero.java` | Input nga `BufferedReader`, dy numërues, output nga `FileWriter`. |
| `OurThread.java` / `OurThreadRunnable.java` | Dy mënyrat e thread-it; `setPriority()` dhe `start()`. |
| `LibriException.java`, `Libri.java`, `Botohet.java` | Modeli për exception, bazë abstrakte dhe interface me `default`. |
| `LibriShkollor.java`, `Enciklopedia.java` | Dy nënklasa me sjellje të ndryshme dhe `super.toString()`. |
| `Biblioteka.java` / `Bibloteka.java` | `ArrayList<Libri>`, `contains`, `Iterator`, `instanceof`, lexim/shkrim file. Varianti me cast të drejtpërdrejtë ka gabimin e shënuar më poshtë. |

Fajllat me emrat `Shfaqja`, `Filmi`, `Koncerti`, `Vleresueshme`, `Kinemaja` **nuk ishin në burime**; zgjidhja e tyre nga fotot është shkruar te [02](<02 - Kinemaja e zgjidhur.md>). Fajllat `Week 12/Ushtrime/*.java` janë **prova jote në punim**, jo zgjidhja referencë.

### Dy dosjet `Downloads` që dërgove

Inventari i tyre ka shumë `.class`, `.rar`, `.zip` dhe kopje të së njëjtës detyrë. Këto janë artefakte/arkiva; për mësim, burimi është `.java` dhe PDF-ja. U krahasuan emrat, roli dhe variantet përkatëse me materialet në `UniStudy`.

| Dosja | Çka ka në burimin `.java` | Vlera për provim |
|---|---|---|
| `/home/olti/Downloads/Provim SHK2/Provim` | `Punetori`, `Shoferi`, `Koordinatori`, `Menaxheri`, `Drejtori`, `Ndermarrja`, `Individi`, exception | Prova jote e detyrës së vjetër. |
| `.../Provim 2` | `FileNumero`, `OurThread` | Files + threads të testit të vjetër. |
| `.../Provim 3` | Një tjetër `Ndermarrja`, `FileNumero`, `LinesWithX`, testime | Krahasim i gabimeve të përsëritura. |
| `.../Provim 5` | `FileNumero`, `OurThread`, `Mesimdhenesi` | Një tjetër provë. |
| `.../Java 10`, `.../java 11` | `Fakulteti/Mesimdhenesi`, interface, exception, file | Model i ngjashëm për hierarki + I/O. |
| `.../Java 12` | `Gara`, mjete garuese, exception, threads | Shumë më e gjatë se pyetja 5p e fotos. |
| `.../java 2 shk2`, `.../java 3`, `.../Java 4`, `.../java 7` | Trashëgimi, abstraksion, `Sportisti`, `Fakulteti`, `Dyqani` | Ushtrime mbështetëse, jo prioriteti i parë. |
| `/home/olti/Downloads/Ushtrime SHK2/Java 1`, `Java 3...`, `Java 4...` | Bazat me varg, pastaj klasa abstrakte | Për një boshllëk konkret në bazë. |
| `.../Java 5`, `Java 6`, `Java 7 p 2`, `Java 8`, `Java 8 p 2` | Pajisje, sportistë, interface, exception | Shembuj të të njëjtit model OOP. |
| `.../Java 9 real` | `NumeroReshtat`, `LineCounter`, `LineMax...`, `Detyra1–3` | Ushtrime të leximit/shkrimit të file-ve. |
| `.../Java 12 p 2` | `Libri`, `Botohet`, `LibriShkollor`, `Enciklopedia`, `Bibloteka`, exception | Modeli i afërt me `Kinemaja`: abstrakte + interface + `ArrayList`. |

**Dy kujdese në zgjidhjet ekzistuese:** `Week 12/Zgjidhjet/Ushtrimi 12 - Zgjidhja/Biblioteka.java` bën cast të çdo libri në `LibriShkollor` pa `instanceof`, prandaj dështon kur has `Enciklopedia`. Në `/Downloads/Ushtrime SHK2/Java 9 real/LineCounter.java`, kodi kontrollon `SHK1`, ndërsa detyra e PDF-së kërkon `SHK2`. Udhëzuesit përdorin variantin sipas tekstit të detyrës.

## Si ta përdorësh këtë paketë

Lexo një seksion, mbulo kodin dhe shkruaj skeletin nga kujtesa. Për secilën kërkesë pyet: **ku ruhet e dhëna, kush e përdor, a ndryshon, a duhet validim, a është metodë apo atribut?** Pastaj krahaso me zgjidhjen. Kjo funksionon edhe kur profesori ndërron `Punetori` me `Shfaqja`, `Libri` ose diçka tjetër.
