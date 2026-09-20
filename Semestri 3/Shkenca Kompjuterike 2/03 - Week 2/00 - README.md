# 03 - Week 2 — Trashëgimia (extends): single, multilevel, hierarchical

Klasë bazë konkrete → nënklasa me `super(...)`, `toString()` që thërret `super.toString()`, `equals(Object)` me `instanceof`. Ende **pa** klasa abstrakte.

**Lidhja me provimin:** `super(...)`, `super.toString()`, `equals(Object)` — të gjitha kërkohen te pyetja 3.

## Ligjërata

- `Ligjërata 1.pdf` — *(e skenuar, pa tekst të kërkueshëm)*

## Ushtrime — detyrat

| File | Përmban | Detyra e parë |
|---|---|---|
| `Detyra Shtese.docx` | — | (dokument Word) |
| `Ligjerate - Shkenca Kompjuterike 2 - Ushtrime 2.pdf` | varg | 1.1. Krijoni klasën Mesimdhenesi që ka tri atribute: emri[readonly], vitiLindjes si dhe angazhimi (p.sh. Ligjerata, Ushtrime, etj.) a) Ofroni |
| `Shkenca Kompjuterike 2 - Ushtrime 2.pdf` | varg | 1.1. Krijoni klasën Sportisti që ka atributet: id [readonly], emri, mosha si dhe gjinia [M-mashkull, Ffemer] a) Ofroni konstruktorin që pranon |

## Zgjidhjet — kodi

Grupi 1/2/5: `Klasa1→Klasa2→Klasa3(→Klasa4)` = demo single/multilevel/hierarchical. `Mesimdhenesi/Profesori/Asistenti/Fakulteti` = zgjidhja e detyrës 1 të PDF-ve (e paplotë: `shtypLlojinEUshtrimeve` është bosh).

**`Zgjidhjet/Grupi 1 - Ligjerate/`** — Asistenti, Fakulteti, Klasa1, Klasa2, Klasa3, Mesimdhenesi, Profesori

**`Zgjidhjet/Grupi 2- Ligjerate/`** — Asistenti, Fakulteti, Klasa1, Klasa2, Klasa3, Klasa4, Mesimdhenesi, Profesori

**`Zgjidhjet/Grupi 5 - Ligjerate/`** — Asistenti, Fakulteti, Klasa1, Klasa2, Klasa3, Mesimdhenesi, Profesori

## ⚠ Kujdes

Grupi 5 **nuk kompilon**: `Klasa3` thërret `super(s)` me 1 argument, por `Klasa2` kërkon 2.

## Arkivat

Origjinalet nga Moodle, të shpaketuara te `Zgjidhjet/` — nuk të duhen.

- `Grupi 1 - Ligjerate.rar`
- `Grupi 2- Ligjerate.rar`
- `Grupi 5 - Ligjerate.rar`

