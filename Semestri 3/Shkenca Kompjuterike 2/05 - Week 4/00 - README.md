# 05 - Week 4 — Klasa abstrakte — hierarki me shumë nivele

`StafiAkademik`(abstrakte) → `Dekani` / `Mesimdhenesi`(abstrakte) → `Profesori`, `Asistenti`. Metoda abstrakte e deklaruar në nivelin e mesëm, e implementuar në fund.

**Lidhja me provimin:** Ky është **saktësisht** `Punetori → StafiAdministrativ(abstrakte) → Drejtori` i pyetjes 3.

## Ushtrime — detyrat

| File | Përmban | Detyra e parë |
|---|---|---|
| `Shkenca Kompjuterike 2 - (Perseritje Klasat Abstrakte).pdf` | abstrakte, varg | 1.1. Krijoni klasen abstrakte Publikimi që ka tri atribute: isbn[readonly], titulli dhe vitiPublikimit. a) Ofroni konstruktorin që pranon që t |
| `Shkenca Kompjuterike 2 - Ushtrime 4.pdf` | abstrakte, varg | 1.1. Krijoni klasën abstrakte StafiAkademik me tri atribute: emri[readonly], vitiLindjes si dhe iRregullt a) Ofroni konstruktorin që pranon që |

## Zgjidhjet — kodi

`Detyra e zgjidhur - Ligjerate` e zgjidh detyrën 1 të `Ushtrime 4.pdf`.

**`Zgjidhjet/Detyra e zgjidhur - Ligjerate/`** — Asistenti, Dekani, Fakulteti, Mesimdhenesi *(abstrakte)*, Profesori, StafiAkademik *(abstrakte)*

## ⚠ Kujdes

**Nuk kompilon** (verifikuar me javac): `Dekani.getGradaAkademike()` kthen emrin e metodës në vend të fushës; `Fakulteti.stafiIRregulltMeIRi` ridefinon `i`; `mentoretEVitit` ridefinon `m`, krahason `boolean == Mesimdhenesi` dhe s'kthen vlerë. Lexoje për strukturën e hierarkisë, jo për t'u kopjuar.

