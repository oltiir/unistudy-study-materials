# Kodi i profesorit që i përgjigjet pyetjeve teorike

Këto janë demot që profesori i shkroi live në ligjëratë — përgjigjet "me kod" të pyetjeve teorike.

| Pyetja | Dosja | Çka tregon |
|---|---|---|
| 1. Polimorfizmi | `Overloading vs Overriding (Java 3)/` | `Klasa1.shtyp(int,String)` / `shtyp(String,int)` = **overloading**; `Klasa2.rezultati()` që rishkruan `Klasa1.rezultati()` = **overriding** (kthen 10, jo 5) |
| 2. Blloku statik vs inicializues | `Blloqet static dhe inicializues (Java 5)/` | Ekzekuto `B` — radha: `static A → static B → init A → konstruktor A → init B → konstruktor B`. Statikët **një herë**, në ngarkim; inicializuesit **për çdo objekt**, para konstruktorit |
| 4. Çka ka klasa abstrakte | `Klasa abstrakte me final (Java 3)/` | `Klasa3` ka metodë **abstrakte** (`rez`), **konkrete** (`shtyp`) dhe **final** (`fjalia`) — `Klasa4` mund ta rishkruajë `shtyp`, jo `fjalia` |
| 6. Variabla statike | `Variabla statike (Java 5)/` | `Counter1` (int count) shtyp `1 1 1`; `Counter2` (static int count) shtyp `1 2 3`. `StudentiStatik.kolegji = "UBT 1"` e ndryshon për **të tre** studentët njëherësh |

```bash
javac *.java && java B          # teoria 2
javac *.java && java Counter2   # teoria 6
```
