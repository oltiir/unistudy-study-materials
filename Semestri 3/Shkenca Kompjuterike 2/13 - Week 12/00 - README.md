# 13 - Week 12 — Përsëritje — Biblioteka dhe detyra e provimit

`Perseritje.pdf` = abstrakte + interface me default + exception + ArrayList/Iterator + lexim/shkrim file — gjithçka bashkë. `SHK2 - Provim Shembull.pdf` = provimi i vjetër.

**Lidhja me provimin:** ⭐ `Zgjidhjet/Grupi 1` dhe `Grupi 5` janë **pikërisht pyetja 3 e provimit shembull** (Punetori/Ndermarrja). `Ushtrimi 12 - Zgjidhja` është modeli për stilin e validimit.

## Ushtrime — detyrat

| File | Përmban | Detyra e parë |
|---|---|---|
| `SHK2 - Provim Shembull.pdf` | abstrakte, interface, exception, threads, java.io, varg | 1. Pyetje Teorike [12 pikë] 1. Cka nënkuptoni me polimorfizëm (të mirret një shembull) ? 2 pikë 2. Tregoni dallimin në mes bllokut sta |
| `Shkenca Kompjuterike 2 -Perseritje.pdf` | abstrakte, interface, exception, ArrayList, java.io | 1.1. Krijoni klasën abstrakte Libri që ka tri atribute: isbn[readonly], titulli dhe vitiPublikimit. a) Ofroni konstruktorin që pranon që të tr |

## Zgjidhjet — kodi

`Ushtrimi 12 - Zgjidhja` = zgjidhja zyrtare e `Perseritje.pdf`. Grupi 1/5 = Punetori/Ndermarrja nga ligjërata. **Zgjidhja ime** — `Biblioteka (Perseritje)`: `shtypSipasDrejtimit` bën `instanceof LibriShkollor` para cast-it — **më e saktë** se e profesorit, e cila plas me Enciklopedi në listë.

**`Zgjidhjet/Grupi 1/`** — Drejtori, Individi *(interface)*, Koordinatori, Menaxheri, Ndermarrja *(koleksion)*, Punetori *(abstrakte)*, PunetoriException *(exception)*, Shoferi, StafiAdministrativ

**`Zgjidhjet/Grupi 5/`** — Drejtori, Individi *(interface)*, Koordinatori, Menaxheri, Ndermarrja *(koleksion)*, Punetori *(abstrakte)*, PunetoriException *(exception)*, Shoferi, StafiAdministrativ *(abstrakte)*

**`Zgjidhjet/Ushtrimi 12 - Zgjidhja/`** — Biblioteka *(koleksion, io)*, Botohet *(interface)*, Enciklopedia, Libri *(abstrakte)*, LibriException *(exception)*, LibriShkollor

**`Zgjidhjet/Zgjidhja ime - Biblioteka (Perseritje)/`** — Bibloteka *(koleksion, io)*, Botohet *(interface)*, Enciklopedia, Libri *(abstrakte)*, LibriException *(exception)*, LibriShkollor

## ⚠ Kujdes

Grupi 1 dhe 5 **nuk kompilojnë** (G1: mungon `class` te `StafiAdministrativ`; G5: `Iterator` raw + s'ka `getMosha()`), përdorin ArrayList në vend të vargut dhe s'kanë `ekziston()`/`main()`. `Biblioteka.shtypSipasDrejtimit` bën cast çdo libër në `LibriShkollor` → `ClassCastException` po të ketë Enciklopedi në listë (në main thirret para `lexoLibrat`, me listë bosh, prandaj s'plas).

## Arkivat

Origjinalet nga Moodle, të shpaketuara te `Zgjidhjet/` — nuk të duhen.

- `Grupi 1.rar`
- `Grupi 5.rar`
- `Ushtrimi 12 - Zgjidhja.zip`

