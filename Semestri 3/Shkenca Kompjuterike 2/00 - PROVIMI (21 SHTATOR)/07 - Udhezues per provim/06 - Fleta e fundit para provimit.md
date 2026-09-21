# Fleta e fundit para provimit — lexoje në 10 minuta

## 1. Për çdo detyrë të madhe, shkruaj këtë rend

```text
1. XException extends Exception       → konstruktori super(mesazhi)
2. interface                            → metodat abstrakte/default
3. klasa abstrakte bazë                  → atribute, konstruktor, validim, get/set, abstract, toString, equals
4. nënklasat konkrete                    → extends, super(...), atribute shtesë, override
5. klasa kryesore / main                 → varg OSE ArrayList siç thotë teksti
6. testimi i metodave                    → try/catch nëse përdoren checked exceptions
```

**Mos supozo atribute:** vendose një atribut te baza vetëm nëse e kanë të gjitha nënklasat. `zhanri()` që kthen gjithmonë `"Film"` nuk ka nevojë për fushë. Numri i filmave në `main` është variabël lokale.

## 2. Pesë forma kodi që duhet t'i shkruash pa u menduar

```java
if (s == null || s.trim().isEmpty()) throw new XException("Bosh");
if (n <= 0) throw new XException("Duhet pozitiv");
if (n < 0) throw new XException("S'mund te jete negativ");
```

```java
class Femija extends Prindi implements Interface1 {
    private final String shtese;
    Femija(String a, int b, String shtese) throws XException {
        super(a, b);          // rreshti i parë
        this.shtese = shtese;
    }
}
```

```java
for (Punetori p : punetoret) { // varg: mund të ketë null
    if (p != null) System.out.println(p);
}
```

```java
ArrayList<Shfaqja> lista = new ArrayList<>();
lista.add(new Filmi("A", 90, 5.0, 8.0));
for (Shfaqja s : lista) {
    if (s instanceof Filmi) System.out.println(((Filmi) s).mesatariaVleresimit());
}
```

```java
try { /* krijo objekte / file */ }
catch (XException e) { System.out.println(e.getMessage()); }
finally { System.out.println("Verifikimi u krye."); }
```

`throw` = e hedh gabimin **këtu**. `throws` = e deklaron në nënshkrim. `@Override` = kompajleri kontrollon që metoda e prindit/interface ka pikërisht atë emër dhe parametra.

## 3. Fjalët që e ndryshojnë zgjidhjen

| Në tekst | Në kod |
|---|---|
| **readonly** | vendos në konstruktor, getter, **pa setter**; `final` është zgjedhje e fortë |
| **pozitiv** | `if (n <= 0) throw ...` |
| **jo negativ** | `if (n < 0) throw ...`; zero lejohet |
| **varg** | `X[]`, qeliza `null`, kontroll vendi |
| **ArrayList** | `ArrayList<X>`, `add`, `for-each`, `contains` |
| **ka kualifikim** | `instanceof Individi` në detyrën `Punetori` |
| **është film** | `instanceof Filmi`, pastaj cast |
| **të njëjtin titull** | `equals(Object)` te `Shfaqja`, krahaso `titulli` |

## 4. Për dy testet konkrete

- **Testi i fundit:** 65p `Kinemaja`, 15p koncepte, 15p analizim kodi, 5p thread. Main kërkon **ArrayList**, dy `Filmi` + një `Koncerti`, `try/catch/finally`, `instanceof Filmi`.
- **Provimi shembull:** 60p `Punetori/Ndermarrja`, 4p interface, 12p teori, 15p `FileNumero`, 9p thread. `Ndermarrja` kërkon **varg** `Punetori[]`, jo listë.
- **Files:** `while ((r = br.readLine()) != null)`, numërues total + kusht, `fw.write`, mbyllja. `length() < 5 && contains("UBT21")` është kushti i PDF-së edhe pse matematikisht jep gjithmonë 0.
- **Threads:** `MIN=1`, `NORM=5`, `MAX=10`; `setPriority` para `start`; `run()` drejtpërdrejt nuk nis thread; `start()` dy herë hedh `IllegalThreadStateException`; prioriteti nuk garanton rend.
- **Analizim kodi:** objektin real shiko për `toString()`/override; `finally` ekzekutohet edhe kur `try`/`catch` bën `return`.

## 5. Kontrolli 60 sekonda para dorëzimit

```text
[ ] Emrat e klasave/metodave identikë me tekstin: getKualifikimin, ShfaqjaException, ...
[ ] Çdo klasë konkrete ka implementuar metodat abstrakte/interface.
[ ] super(...) ka të gjithë parametrat e prindit dhe është i pari në konstruktor.
[ ] readonly: pa setter. Setter-at e tjerë bëjnë të njëjtin validim si konstruktori.
[ ] null kontrollohet para trim().isEmpty().
[ ] equals(Object), jo equals(Tipi), kur kërkohet override.
[ ] Vargu: kontroll != null. ArrayList: përdor add/for-each sipas kërkesës.
[ ] Cast vetëm pas instanceof.
[ ] throw new ... në if; throws ... në nënshkrim.
[ ] FileWriter mbyllet ose përdoret try-with-resources.
[ ] Thread: start(), jo run(); dy start() mbi të njëjtin objekt janë gabim.
```
