# 07 - Week 6 — Klasat e brendshme: inner, static nested, lokale, anonime

Inner (`Tutori`), static nested (`Vizituesi`), lokale brenda metode (`Dekani` te `shtoDekanin`), anonime (`new Mesimdhenesi(...){ ... }` te `shtoNjeMesimdhenes`). Kapaciteti si `static int` i caktuar në `static{}`, vargu i krijuar në `{}`.

**Lidhja me provimin:** Jo temë e veçantë në provim, por `static{}` + `{}` në `Fakulteti` është përsëri **teoria 2**.

## Ligjërata

- `Ligjërata.pdf` — *(e skenuar, pa tekst të kërkueshëm)*

## Ushtrime — detyrat

| File | Përmban | Detyra e parë |
|---|---|---|
| `Shkenca Kompjuterike 2 - Java 6.pdf` | abstrakte, inner/nested, varg | 1.1. Krijoni klasen abstrakte Libri që ka tri atribute: isbn[readonly], )tulli dhe vi)Publikimit: a) Ofroni konstruktorin që pranon që të tri |
| `Shkenca Kompjuterike 2 - Ushtrime 6.pdf` | abstrakte, inner/nested, varg | 1.1. Krijoni klasën Mesimdhenesi që ka tri atribute: emri[readonly], vitiLindjes si dhe angazhimi a) Ofroni konstruktorin që pranon që të tri |

## Zgjidhjet — kodi

Grupi 1/2/5 `Fakulteti` = zgjidhja e detyrës 1.4 të `Ushtrime 6.pdf`. `Klasa*`/`KlasaJ*`/`KlasaBrendshme*` = demo minimale për secilin lloj. **Zgjidhja ime** — `Dyqani anonime + lokale (detyra 2)` (PajisjaElektrike anonime, Fshesa lokale) dhe `Biblioteka anonime + lokale (detyra 1)` (Romani/Fjalori/Regjistri) — detyrat që profesori s'i publikoi, kompilojnë.

**`Zgjidhjet/Grupi 1/`** — Asistenti, Beni *(abstrakte)*, Fakulteti *(static{})*, Grupi1, KlasaJ, KlasaJashtmeAnonime, KlasaJashtmeLokale, Mesimdhenesi *(abstrakte)*, Profesori

**`Zgjidhjet/Grupi 2/`** — Artor, Asistenti, Fakulteti *(static{})*, Klasa1 *(static{})*, KlasaA, KlasaB, KlasaBL, KlasaBS, Mesimdhenesi *(abstrakte)*, Profesori

**`Zgjidhjet/Grupi 5/`** — Asistenti, Fakulteti *(static{})*, KlasaAnonime *(abstrakte)*, KlasaBrendshmeAnonime, KlasaBrendshmeLokale, KlasaJashtme, KlasaJashtmeS, Mesimdhenesi *(abstrakte)*, Profesori

**`Zgjidhjet/Zgjidhja ime - Biblioteka anonime + lokale (detyra 1)/`** — Biblioteka *(static{})*, Enciklopedia, Libri *(abstrakte)*, LibriShkollor

**`Zgjidhjet/Zgjidhja ime - Dyqani anonime + lokale (detyra 2)/`** — Dyqani *(static{})*, Enelaresja, MP3Player, MulliriKafes, Pajisja *(abstrakte)*, PajisjaElektrike *(abstrakte)*

## ⚠ Kujdes

Grupi 1 `Fakulteti` **nuk e inicializon `vargu`** → `NullPointerException` te `shtoMesimdhenesin`; Grupi 2 dhe 5 e bëjnë saktë në bllokun inicializues.

## Arkivat

Origjinalet nga Moodle, të shpaketuara te `Zgjidhjet/` — nuk të duhen.

- `Grupi 1.rar`
- `Grupi 2.rar`
- `Grupi 5.rar`

