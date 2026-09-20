# 10 - Week 9 — java.io — lexim dhe shkrim file-ash

`FileReader`, `BufferedReader.readLine()`, `FileWriter`, `LineNumberReader`, `split()`, `close()`.

**Lidhja me provimin:** **PYETJA 4 — 15 pikë.** Binjaku i saktë është **`LineCounter` (I.O Streams.pdf, detyra 8)**: numri total i rreshtave + rreshtat që plotësojnë një kusht, output në file me të njëjtin format. `NumeroReshtat` (Ushtrime 8.pdf) është e ngjashme por numëron vetëm një gjë.

## Ligjërata

- `Ligjërata-.pdf` — *(e skenuar, pa tekst të kërkueshëm)*

## Ushtrime — detyrat

| File | Përmban | Detyra e parë |
|---|---|---|
| `Shkenca Kompjuterike 2 - I.O Streams.pdf` | java.io | 1. Të lexohet, char për char, file‐i “ubt.txt” dhe të numërohet sa herë është paraqitur fjala UBT. Në fund të shkruhet në file‐in “ubt. |
| `Shkenca Kompjuterike 2 - Ushtrime 8.pdf` | exception, java.io | 1. Krijoni klasën NumeroReshtat që pranon dy parametra në konstruktor: - emrin e input file-it (p.sh. “shk2.txt”) dhe - emrin e outnput file |

## Zgjidhjet — kodi

`Ushtrimi 9 - Zgjidhja` = **zgjidhja zyrtare** e 8 detyrave të `I.O Streams.pdf`. Grupi 1/5 `NumeroReshtat` = detyra 1 e `Ushtrime 8.pdf`; Grupi 2 `LineWithoutA` = detyra 2 (e paplotë). **Zgjidhja ime** — `Ushtrime 8 detyrat 1-3`: NumeroReshtat, LineWithoutA, LineStartX — të vetmet zgjidhje për këtë fletë (profesori s'e publikoi), kompilojnë.

**`Zgjidhjet/Grupi 1/`** — NumeroReshtat *(io)*, Ushtrimi1Read *(io)*, Ushtrimi1Write *(io)*, Ushtrimi2Read *(io)*

**`Zgjidhjet/Grupi 2/`** — LexoNgaFile *(io)*, LexoNgaFile2 *(io)*, LineWithoutA *(io)*, ShkruajNeFile *(io)*

**`Zgjidhjet/Grupi 5/`** — NumeroRreshtat *(io)*, Reader1 *(io)*, Reader2 *(io)*, Writer1 *(io)*

**`Zgjidhjet/Ushtrimi 9 - Zgjidhja/`** — Detyra1 *(io)*, Detyra2 *(io)*, Detyra3 *(io)*, LineCounter *(io)*, LineMaxChar *(io)*, LineMaxWord *(io)*, LineMaxWords *(io)*, LinesWithX *(io)*

**`Zgjidhjet/Zgjidhja ime - Ushtrime 8 detyrat 1-3 (pa zgjidhje zyrtare)/`** — LineStartX *(io)*, LineWithoutA *(io)*, NumeroReshtat *(io)*

## ⚠ Kujdes

Grupi 1 `NumeroReshtat.numero()` e lexon rreshtin e parë **para** ciklit → e humb. Grupi 2 `LineWithoutA` **nuk kompilon** dhe `shkruaj()` shkruan tekst hardcoded.

## Arkivat

Origjinalet nga Moodle, të shpaketuara te `Zgjidhjet/` — nuk të duhen.

- `Grupi 1.rar`
- `Grupi 2.rar`
- `Grupi 5.rar`
- `Ushtrimi 9 - Zgjidhja.zip`

