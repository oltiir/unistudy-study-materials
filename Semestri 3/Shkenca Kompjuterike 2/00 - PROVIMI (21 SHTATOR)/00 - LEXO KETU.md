# Shkenca Kompjuterike 2 — Provimi, e hënë 21 shtator

Gjithçka që të duhet është në këtë dosje. Asgjë tjetër nuk të duhet sonte.

---

## Struktura e provimit (nga `01 - Provimi Shembull.pdf`)

| # | Pjesa | Pikë | Dosja |
|---|---|---:|---|
| 1 | Pyetje teorike (6 × 2p) | **12** | `02 - Pyetje Teorike (12p)/` |
| 2 | Klasat dhe Interface-ët (cilat metoda duhen) | **4** | `03 - Klasa dhe Interface (64p)/` |
| 3 | **Kodi rreth Klasave dhe Interface-ëve** | **60** | `03 - Klasa dhe Interface (64p)/` |
| 4 | Kodi rreth paketës java.io | **15** | `04 - java.io (15p)/` |
| 5 | Threads dhe Concurrency | **9** | `05 - Threads (9p)/` |
| | **Gjithsej** | **100** | |

> **64 nga 100 pikë** janë klasa + interface + exception. Aty shpenzoje kohën.

---

## ⭐ Gjetja më e rëndësishme

Profesori **e ka zgjidhur pikërisht detyrën e provimit** (pyetja 3 — Punetori/Ndermarrja)
gjatë ligjëratës së javës 12. Kodi është te:

```
03 - Klasa dhe Interface (64p)/zgjidhja-mesuesit/Punetori-Ndermarrja (Java 12, Grupi 1)/
03 - Klasa dhe Interface (64p)/zgjidhja-mesuesit/Punetori-Ndermarrja (Java 12, Grupi 5)/
```

Lexoji — të tregojnë saktësisht çka pret profesori. **Por të dyja kanë gabime kompilimi
dhe u mungojnë disa pika** (varg, `ekziston()`, `main()`). Detajet dhe krahasimi i plotë
janë në fund të `03 - .../zgjidhja-provimi.md`.

---

## Plani për sonte

### Bllok 1 — 2 orë · pyetja 3 (60 pikë)
1. Hape `03 - .../zgjidhja-provimi.md` dhe lexoje hierarkinë.
2. Hape `cheatsheet.md` — mësoje **shabllonin**, jo detyrën.
3. **Shkruaje me dorë** nga e para: `PunetoriException` → `Individi` → `Punetori` →
   `Shoferi`/`Koordinatori`/`Menaxheri` → `StafiAdministrativ` → `Drejtori` → `Ndermarrja`.
4. Krahasoje me `zgjidhja-provimi/`. Çdo ndryshim = pikë e humbur në provim.

### Bllok 2 — 45 min · pyetja 4 (15 pikë)
- Lexo `04 - java.io (15p)/zgjidhja-provimi.md`.
- Shkruaje `FileNumero` pa shikuar. Shablloni `FileReader → BufferedReader → while readLine → fw.write → close` është i njëjti gjithmonë.

### Bllok 3 — 30 min · pyetja 5 (9 pikë)
- Lexo `05 - Threads (9p)/zgjidhja-provimi.md`. Janë 4 fakte: dy mënyrat, pse dy, 1/5/10, `start()` jo `run()`.

### Bllok 4 — 30 min · pyetja 1 (12 pikë)
- `02 - Pyetje Teorike (12p)/pergjigjet.md` — lexoje dy herë, pastaj bëj "Kontrollo veten" në fund.

### Bllok 5 — 45 min · prova e thatë
- Hape `01 - Provimi Shembull.pdf` dhe zgjidhe **të gjithin me dorë, me kohë**.
- Pastaj krahaso me zgjidhjet.

---

## Nëse ke vetëm 2 orë

1. `03 - .../cheatsheet.md` — seksionet 1–6 (**30 min**)
2. Shkruaj `Ndermarrja` nga koka — `ekziston`, `shtoPunetor`, `getKualifikimet`, `kaTeGjithaLlojet` (**45 min**) ← *35 pikë*
3. `FileNumero` (**20 min**) ← *15 pikë*
4. Threads: dy mënyrat + 1/5/10 (**10 min**) ← *9 pikë*
5. Teoria, lexim i shpejtë (**15 min**) ← *12 pikë*

---

## Rregullat e arta për provimin

1. **`XException` shkruaje të parin.** 3 rreshta, 5 pikë, e përdor gjithçka tjetër.
2. **Readonly = vetëm `get`, pa `set`.** Kërkohet te `regjioni`, `nrShofereve`, `sektori`, `kualifikimi`.
3. **`equals()` te klasa bazë** — pa të, `ekziston()` dhe `shtoPunetor()` s'punojnë.
4. **Varg → gjithmonë `!= null`** para se ta prekësh elementin.
5. **`instanceof Individi`** për "kush ka kualifikime", **jo** `instanceof Menaxheri`.
6. **`fw.close()`** ose file-i i output-it del i zbrazët.
7. **`start()`, jo `run()`.**
8. **`main()` gjithmonë brenda `try/catch`.**
9. Pa kohë? Shkruaj **kontejnerin dhe `main()`** — aty janë më së shumti pikë.

---

## Çka ka në secilën dosje

```
01 - Provimi Shembull.pdf .......... provimi i vjetër, i plotë

02 - Pyetje Teorike (12p)/
    pergjigjet.md .................. 6 pyetjet e provimit, të përgjigjura + shembuj
    zgjidhja-mesuesit/ ............. demot e profesorit për teorinë 1, 2, 4, 6 (A/B blloqet, Counter, overloading)

03 - Klasa dhe Interface (64p)/
    zgjidhja-provimi.md ............ shpjegimi i pyetjeve 2 dhe 3, pikë për pikë
    cheatsheet.md .................. shabllonet që përsëriten në çdo detyrë
    zgjidhja-provimi/ .............. pyetja 3 e zgjidhur — kompilon dhe ekzekutohet
    zgjidhja-mesuesit/
        Biblioteka (Java 12)/ ...... zgjidhja e profesorit, i njëjti model si provimi
        Klasa Abstrakte (Java 4)/ .. zgjidhja e profesorit për klasa abstrakte
    ushtrime/ ...................... 5 fletë ushtrimesh, nga më e rëndësishmja

04 - java.io (15p)/
    zgjidhja-provimi.md ............ shpjegimi i pyetjes 4 + kontradikta e tekstit
    zgjidhja-provimi/ .............. FileNumero.java — i testuar
    zgjidhja-mesuesit/ ............. 8 detyra I/O të zgjidhura nga profesori
    ushtrime/ ...................... I.O Streams.pdf — detyra 8 (LineCounter) është binjaku i pyetjes 4

05 - Threads (9p)/
    zgjidhja-provimi.md ............ teoria + kodi i pyetjes 5
    zgjidhja-provimi/ .............. OurThread.java (të dy variantet) — i testuar
    zgjidhja-mesuesit/ ............. Vrapimi — zgjidhja e profesorit
    ushtrime/ ...................... detyra + ligjërata e threads (teoria)
```

---

## Si ta ekzekutosh kodin

```bash
cd "03 - Klasa dhe Interface (64p)/zgjidhja-provimi"
javac *.java && java Ndermarrja
```

I gjithë kodi këtu është kompiluar dhe ekzekutuar — punon.
