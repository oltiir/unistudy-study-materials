# 11 - Week 10 — Collections (ArrayList, LinkedList, Vector) + lexim objektesh nga file

Tre koleksionet me `Iterator` dhe for-each. `Ushtrime 10.pdf` = **varg** + `lexoX()` nga file me `split(";")`; `Ushtrime 11.pdf` = e njëjta me **ArrayList**; `ArrayList.pdf` = Sportisti me ArrayList + exception.

**Lidhja me provimin:** Varianti me ArrayList i pyetjes 3 (nëse teksti e kërkon). `split(";")` → `Integer.parseInt` → `new X(...)` vlen për java.io.

## Ligjërata

- `Ligjërata.pdf`

## Ushtrime — detyrat

| File | Përmban | Detyra e parë |
|---|---|---|
| `Shkenca Kompjuterike 2 - ArrayList.pdf` | abstrakte, interface, exception, ArrayList, varg | 1.1. Klasa abstrakte Sportisti ka atributet: id [readonly], emri, mosha si dhe gjinia [M-mashkull, F-femer]: a) Ofroni konstruktorin që pran |
| `Shkenca Kompjuterike 2 - Ushtrime 10.pdf` | abstrakte, interface, exception, java.io, varg | 1.1. Krijoni klasën abstrakte Mesimdhenesi që atributet: emri[readonly], vitiLindjes (min 1950) si dhe fushaStudimit a) Ofroni konstruktorin q |
| `Shkenca Kompjuterike 2 - Ushtrime 11.pdf` | abstrakte, interface, exception, ArrayList, java.io | 1.1. Krijoni klasën abstrakte Mesimdhenesi që atributet: emri[readonly], vitiLindjes (min 1950) si dhe fushaStudimit a) Ofroni konstruktorin q |

## Zgjidhjet — kodi

Grupi 1/2/5: `Ushtrimi1/2/3` = tre koleksionet; `Ushtrimi4`/`LexoNgaFile` = lexim rreshtash, `split(";")`, krijim objektesh. **Demo — NUK e zgjidhin detyrat e mëdha të PDF-ve.** **Zgjidhja ime** — `Fakulteti me varg + file (Ushtrime 10)` dhe `Fakulteti me ArrayList + file (Ushtrime 11)`: zgjidhjet e plota me lexim nga file (`split(";")`), interface me default, exception; ekzekutohen me `java Fakulteti ubt.txt dalja.out`.

**`Zgjidhjet/Grupi 1/`** — KlasaIme, Ushtrimi1 *(koleksion)*, Ushtrimi2, Ushtrimi3 *(koleksion)*, Ushtrimi4 *(io)*

**`Zgjidhjet/Grupi 2/`** — LexoNgaFile *(io)*, Ushtrimi1ArrayList *(koleksion)*, Ushtrimi1LinkedList, Ushtrimi1Vector *(koleksion)*

**`Zgjidhjet/Grupi 5/`** — KlasaIme, Ushtrimi1 *(koleksion)*, Ushtrimi2, Ushtrimi3 *(koleksion)*, Ushtrimi4 *(io)*

**`Zgjidhjet/Zgjidhja ime - Fakulteti me ArrayList + file (Ushtrime 11)/`** — Angazhohet *(interface)*, Asistenti, Fakulteti *(koleksion, io)*, Mesimdhenesi *(abstrakte)*, MesimdhenesiException *(exception)*, Profesori

**`Zgjidhjet/Zgjidhja ime - Fakulteti me varg + file (Ushtrime 10)/`** — Angazhohet *(interface)*, Asistenti, Fakulteti *(io)*, Mesimdhenesi *(abstrakte)*, MesimdhenesiException *(exception)*, Profesori

## Arkivat

Origjinalet nga Moodle, të shpaketuara te `Zgjidhjet/` — nuk të duhen.

- `Grupi 1.rar`
- `Grupi 2.rar`
- `Grupi 5.rar`

