# 06 - Week 5 — Static (variabla, metoda, blloqe) — fletët kërkojnë klasa të brendshme

**Ligjërata:** variabla statike vs e instancës (`Counter1` vs `CounterStatik`/`Counter2`, `StudentiStatik`), radha e ekzekutimit `static{}` → `{}` → konstruktor edhe në trashëgimi (`A`/`B`, `Ushtrimi3`/`Ushtrimi4`). **Fletët e ushtrimeve** kërkojnë *Inner class* dhe *static nested class* — zgjidhja e tyre është te **Week 6**.

**Lidhja me provimin:** **Teoria 2** (blloku statik vs inicializues — `A.java`/`B.java` e tregojnë saktë) dhe **teoria 6** (variabla statike — `CounterStatik`, `StudentiStatik`).

## Ligjërata

- `Ligjërata.pdf` — *(e skenuar, pa tekst të kërkueshëm)*

## Ushtrime — detyrat

| File | Përmban | Detyra e parë |
|---|---|---|
| `Detyra shtesë pj.2.pdf` | varg | 1. Krijo një klasë bazë “Shape” me metoda për të kalkuluar perimetrin dhe syprinën e asaj forme. Implemento nënklasët “Rectangle” dhe |
| `Shkenca Kompjuterike 2 - Ushtrime 5 - v1 - Ligjerate.pdf` | abstrakte, inner/nested, varg | 1.1. Krijoni klasën Mesimdhenesi që ka tri atribute: emri[readonly], vitiLindjes si dhe angazhimi a) Ofroni konstruktorin që pranon që të tri |
| `Shkenca Kompjuterike 2 - Ushtrime 5.pdf` | abstrakte, inner/nested, varg | 1.1. Klasa abstrakte Spor%s% ka atributet: id [readonly], emri, mosha si dhe gjinia [M-mashkull, F-femer]: a) Ofroni konstruktorin që pranon |

## Zgjidhjet — kodi

Grupi 1/2/5 = **demo ligjërate për static** — nuk i zgjidhin PDF-të e kësaj jave (ato kërkojnë inner classes); zgjidhjet e fletëve janë te *Zgjidhja ime* më poshtë. **Zgjidhja ime** — `Dyqani inner + static nested (detyra 2)` dhe `EkipiOlimpik inner + static nested (detyra 1)`: **këto i zgjidhin fletët e kësaj jave** (Turiela/TV, HedhesiGjyles/Mundesi), kompilojnë.

**`Zgjidhjet/Grupi 1/`** — Counter1, CounterStatik, Ushtrimi1 *(static{})*, Ushtrimi2 *(static{})*, Ushtrimi3 *(static{})*, Ushtrimi4 *(static{})*

**`Zgjidhjet/Grupi 2/`** — A *(static{})*, B *(static{})*, CountTest, CountTestStatik, Studenti, StudentiMain, StudentiStatik, Ushtrimi1 *(static{})*

**`Zgjidhjet/Grupi 5/`** — A *(static{})*, B *(static{})*, Counter1, Counter2, Ushtrimi1

**`Zgjidhjet/Zgjidhja ime - Dyqani inner + static nested (detyra 2)/`** — Dyqani *(static{})*, Enelaresja, MP3Player, MulliriKafes, Pajisja *(abstrakte)*, PajisjaElektrike *(abstrakte)*

**`Zgjidhjet/Zgjidhja ime - EkipiOlimpik inner + static nested (detyra 1)/`** — Atleti *(abstrakte)*, EkipiOlimpik *(static{})*, Futbollisti, Karateisti, Sportisti *(abstrakte)*, Vrapuesi

## Arkivat

Origjinalet nga Moodle, të shpaketuara te `Zgjidhjet/` — nuk të duhen.

- `Grupi 1.rar`
- `Grupi 2.rar`
- `Grupi 5.rar`

