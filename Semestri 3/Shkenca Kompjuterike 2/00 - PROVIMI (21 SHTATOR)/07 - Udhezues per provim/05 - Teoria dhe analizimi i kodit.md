# Teoria dhe analizimi i kodit — përgjigjet e dy testeve

Testi i fundit në foto ka **15 pikë koncepte OOP + 15 pikë analizim kodi**. Provimi shembull ka **12 pikë teori + 4 pikë interface**. Këtu janë përgjigjet dhe mënyra si të arrish te to, pa i mësuar vetëm përmendsh.

## 1. Testi i fundit: 4 pyetje me zgjedhje, nga 2 pikë

| # | Pyetja | Përgjigjja | Arsyeja |
|---|---|---|---|
| 1 | `start()` dy herë në të njëjtin objekt `Thread` | **b) `IllegalThreadStateException`** | Një objekt Thread mund të niset vetëm një herë. |
| 2 | Qëllimi i `@Override` | **b)** kontrollon në kompilim që metoda po mbishkruan metodë të prindit/interface | Një shkronjë gabim në emër jep gabim të qartë. |
| 3 | Rendi i disa `catch` | **b) specifik → i përgjithshëm** | `catch(Exception)` i pari do ta kapte edhe llojin specifik; tjetri do të ishte i paarritshëm. |
| 4 | Metoda që nis thread të ri | **b) `start()`** | `run()` vetëm thirret si metodë normale nëse e thërret drejtpërdrejt. |

```java
try { ... }
catch (ShfaqjaException e) { ... } // specifik
catch (Exception e) { ... }        // i përgjithshëm, në fund
```

## 2. Testi i fundit: 7 pohime Saktë/Gabuar

| Pohimi | S/G | Shpjegimi i shkurtër |
|---|---|---|
| Një klasë abstrakte mund të ketë metoda jo abstrakte, me trup. | **S** | Mund të ketë edhe abstrakte, edhe konkrete. |
| `instanceof` kthen `true` nëse objekti është instancë e tipit të dhënë. | **S** | Vlen edhe për nënklasën/implementimin; `null instanceof X` është `false`. |
| Metodat `static` në interface trashëgohen nga klasat zbatuese dhe mund të mbishkruhen. | **G** | Thirren me emrin e interface: `I.metoda()`; nuk bëhet override i tyre. |
| Polimorfizmi runtime realizohet përmes method overloading. | **G** | Runtime = **overriding**. Overloading zgjedhet në kohë kompilimi. |
| Një klasë abstrakte mund të ketë konstruktor. | **S** | Nënklasa e thërret me `super(...)`. |
| Blloku `static { ... }` ekzekutohet sa herë krijohet objekt. | **G** | Një herë kur inicializohet klasa; blloku pa `static` ekzekutohet për çdo objekt. |
| Modifikuesi `private` lejon akses të drejtpërdrejtë nga nënklasat. | **G** | Nënklasa përdor getter/setter të lejuar; fusha `private` nuk lexohet direkt. |

## 3. Analizim kodi: `Pija`, `Kafja`, `Uji` (8 pikë)

Nga fotoja: `Pija` është abstrakte, ka `emri`; `toString()` kthen `emri + ": " + kalori() + " kcal"`. `Kafja.kalori()` kthen `5`; `Uji.kalori()` kthen `0`. Vargu përmban, me radhë: `Kafja`, `Uji`, `Kafja`, `Uji`. Për secilën shtypet objekti; nëse kaloritë janë `0`, shtypet edhe `(pa kalori)`.

**Output-i** (hapësirat para `(pa kalori)` varen nga teksti brenda `println` në foto):

```text
Kafja: 5 kcal
Uji: 0 kcal
  (pa kalori)
Kafja: 5 kcal
Uji: 0 kcal
  (pa kalori)
```

**Pse?** `System.out.println(p)` thërret `p.toString()`. Brenda `Pija.toString()`, thirrja `kalori()` shkon te metoda e objektit real (`Kafja` ose `Uji`), edhe pse variabla quhet `Pija p`. Kjo është **polimorfizëm runtime**. Kushti `p.kalori() == 0` vlen vetëm për Ujin. Nuk shtypen emrat e klasave automatikisht; ato vijnë nga atributi `emri` që nënklasa ia ka dërguar prindit me `super("Kafja")`/`super("Uji")`.

**Rregulli për detyra të tilla:** shëno objektin real për secilën pozitë të vargut; për çdo metodë të mbishkruar, përdor implementimin e atij objekti, jo tipin e variablës në të majtë.

## 4. Analizim kodi: `try/catch/finally` (7 pikë)

Fotoja ka metodën `pjesto(a,b)`. Në `try` kthen `a/b`; në `catch(ArithmeticException)` shtyp mesazh dhe kthen `0`; në `finally` shtyp `"Perfundoi pjestimi i " + a`. Në `main`: `pjesto(20,4)`, pastaj `pjesto(7,0)`.

**Output-i me radhë:**

```text
Fillimi
Perfundoi pjestimi i 20
Nuk pjesetohet me zero!
Perfundoi pjestimi i 7
r1=5
r2=0
```

**Gjurmimi:**

1. `Fillimi` shtypet menjëherë në `main`.
2. `pjesto(20,4)` përgatit `return 5`; **para** kthimit ekzekutohet `finally` dhe shtyp `Perfundoi pjestimi i 20`.
3. `pjesto(7,0)` hedh `ArithmeticException`; `catch` shtyp mesazhin dhe përgatit `return 0`; **para** kthimit ekzekutohet `finally` me numrin 7.
4. Vetëm pas dy thirrjeve `main` shtyp `r1=5` dhe `r2=0`.

**Kurth:** `finally` nuk zhduket pse ka `return` brenda `try` ose `catch`. Këtu `finally` shtyp, por nuk e ndryshon vlerën e kthyer.

## 5. Provimi shembull: gjashtë përgjigjet teorike, nga 2 pikë

| Pyetja | Përgjigjja që mund ta shkruash në provim |
|---|---|
| Polimorfizëm + shembull | Një referencë e tipit bazë mban objekte të nënklasave; metoda e mbishkruar zgjidhet sipas objektit real në runtime. `Pija p = new Uji(); p.kalori()` kthen `0`. |
| Blloku statik vs inicializues | `static {}` ekzekutohet një herë kur inicializohet klasa; `{}` ekzekutohet për çdo objekt para konstruktorit. |
| Çka trashëgon nënklasa? | Metodat/atributet e qasshme (`public`, `protected`, dhe package-private në të njëjtën paketë). Konstruktorët nuk trashëgohen; fushat `private` nuk qasen drejtpërdrejt. |
| Çka mund të ketë klasa abstrakte? | Atribute, konstruktor, metoda me trup, metoda abstrakte, metoda `static`/`final`. Nuk mund të instancohet drejtpërdrejt. |
| Dy mënyra të abstraksionit | Klasë abstrakte dhe interface. Klasa abstrakte mban gjendje/kod të përbashkët dhe ka konstruktor; interface jep kontratë, mund të ketë metoda `default`/`static`, por nuk ka konstruktor. |
| Variabla statike + shembull | I përket klasës dhe ndahet mes objekteve: `static int numriTotal`; `new Punetori(...)` mund ta rrisë, dhe lexohet si `Punetori.getNumriTotal()`. |

### Overloading kundrejt overriding

| | Overloading | Overriding |
|---|---|---|
| Ku | Shpesh në të njëjtën klasë | Në nënklasë ndaj prindit/interface |
| Nënshkrimi | I njëjti emër, **parametra të ndryshëm** | I njëjti emër dhe parametra të njëjtë |
| Zgjedhja | Në kompilim | Në runtime për metodat e instancës |
| Shembull | `metoda(int)` dhe `metoda(String)` | `Uji.kalori()` mbi `Pija.kalori()` |

## 6. Provimi shembull: cilat metoda duhet t'i shkruajë `Test`? (4 pikë)

Nga PDF-ja: `Test extends KlasaA implements InterX2`. `KlasaA` ka implementuar vetëm `int metodaA(String a)` nga `InterX1`; i mungon varianti me `char` dhe ka abstrakten `metodaAB(int)`. `InterX2` shton dy metoda.

Prandaj `Test` duhet t'i shkruajë **katër**:

```java
public String metodaA(char a) { ... }         // nga InterX1, ende pa trup
public String metodaAB(int nr) { ... }        // nga KlasaA
public boolean metodaB(int a, int b) { ... }  // nga InterX2
public int metodaB(boolean c) { ... }         // nga InterX2
```

`int metodaA(String a)` është tashmë në `KlasaA`, prandaj `Test` e trashëgon. **Emri i njëjtë nuk mjafton:** `metodaA(String)` dhe `metodaA(char)` janë dy metoda të ndryshme.

## 7. Pyetje të shpejta për vetëkontroll

1. `new Shfaqja(...)`? **Gabim**, klasë abstrakte.
2. `Filmi extends Shfaqja implements Vleresueshme`? **Po**; vetëm një `extends`, mund të ketë interface.
3. `private` i prindit nga nënklasa? **Jo** drejtpërdrejt; përdor getter/setter.
4. `static` në interface a bëhet override? **Jo**.
5. `start()` dy herë në një objekt? **Exception**.
6. `catch(Exception)` para `catch(ShfaqjaException)`? **Gabim kompilimi**: i dyti bëhet i paarritshëm.
7. `finally` me `return` në `try`? **Ekzekutohet para kthimit** në rrjedhën normale të Java-s.
