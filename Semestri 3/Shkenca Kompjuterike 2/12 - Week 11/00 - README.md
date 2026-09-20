# 12 - Week 11 — Threads dhe Concurrency

`extends Thread` vs `implements Runnable`, `start()`, `sleep()`, `setPriority()`, `synchronized` (metodë dhe bllok).

**Lidhja me provimin:** **PYETJA 5 — 9 pikë.** `Hipodromi.filloGaren`: `if(kg instanceof KaliGarues) kg.setPriority(Thread.MAX_PRIORITY); kg.start();` është saktësisht pika b).

## Ligjërata

- `Ligjërata.pdf`

## Ushtrime — detyrat

| File | Përmban | Detyra e parë |
|---|---|---|
| `Shkenca Kompjuterike 2 - Threads.pdf` | abstrakte, exception, ArrayList, Vector, threads | 1.1. Klasa abstrakte Atleti ka atributet: nrRendor [readonly], emri, mosha, gjinia [M-mashkull, F-femer], distanca, gjatesiaEPistes: a) Ofro |
| `Shkenca Kompjuterike 2 - Ushtrime 12.pdf` | abstrakte, interface, exception, Vector, threads | 1. Të ndërtohet një aplikacion për gara me specifikat si më poshtë: 1.1. Klasa abstrakte MjetiLevizes ka tri atribute readonly: prodhue |

## Zgjidhjet — kodi

`Ushtrimi 11 - Zgjidhja` = **zgjidhja zyrtare** e `Threads.pdf` (Atleti/Vrapuesi/Vrapimi). G1/Grupi5: `Counter*` = pse duhet `synchronized`; `Train/Line/Station` = metodë e sinkronizuar; `KafshaGaruese/KaliGarues/QeniGarues/Hipodromi` = detyra 2 e `Ushtrime 12.pdf` (pjesërisht — pa `GaraException`, pa validim moshe).

**`Zgjidhjet/G1/`** — Counter, CounterMain *(thread)*, CounterMainSync *(thread)*, CounterSyn, Garon *(interface)*, Hipodromi *(koleksion)*, KafshaGaruese *(abstrakte, thread)*, KaliGarues, Line, QeniGarues, Station, Train *(thread)*

**`Zgjidhjet/Grupi5/`** — Counter, CounterRun *(thread)*, CounterRunSync *(thread)*, CounterSync, Garon *(interface)*, Hipodromi *(koleksion)*, KafshaGaruese *(abstrakte, thread)*, KaliGarues, Line, QeniGarues, Station, Train *(thread)*

**`Zgjidhjet/Ushtrimi 11 - Zgjidhja/`** — Atleti *(abstrakte)*, AtletiException *(exception)*, Vrapimi *(koleksion)*, Vrapuesi *(thread)*

## ⚠ Kujdes

Grupi5 `KafshaGaruese.equals()` kthen `true` për çdo objekt të së njëjtës klasë → `contains()` gjithmonë true pas të parit. G1 `Hipodromi.main` nuk i shton kafshët në listë (i starton direkt).

## Arkivat

Origjinalet nga Moodle, të shpaketuara te `Zgjidhjet/` — nuk të duhen.

- `G1.rar`
- `Grupi5.rar`
- `Ushtrimi 11 - Zgjidhja.zip`

