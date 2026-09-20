# 02 - Week 1 — Përsëritje: klasa, objekte, varg

Klasa konkrete me atribut readonly, get/set, toString(), equals(); klasa kontejner me varg dhe metodat ekziston / shto (nëse s'ekziston dhe ka vend) / largo.

**Lidhja me provimin:** Kontejneri me varg + `ekziston` + `shto` me 'ka vend të lirë' është **saktësisht `Ndermarrja` e pyetjes 3**.

## Ushtrime — detyrat

| File | Përmban | Detyra e parë |
|---|---|---|
| `Shkenca Kompjuterike 2 - Ushtrimi 1.pdf` | varg | 1.1. Krijoni klasën Spor%s% që ka atributet: id [readonly], emri, mosha si dhe gjinia [M-mashkull, F-femër] a) Ofroni konstruktorin që pranon |

## Zgjidhjet — kodi

`Ushtrimi1/` është **zgjidhja IME**, jo e profesorit (paketa `Ushtrimi1`, enum `Gjinia`). E zgjidh detyrën 1 të PDF-së.

**`Zgjidhjet/Ushtrimi1/`** — EkipiOlimpik *(koleksion)*, Gjinia, Sportisti

## ⚠ Kujdes

`Sportisti.equals(Sportisti s)` është *overload*, jo *override* i `equals(Object)` — `ArrayList.contains()` nuk do ta thërriste. Në provim shkruaj gjithmonë `public boolean equals(Object o)`.

