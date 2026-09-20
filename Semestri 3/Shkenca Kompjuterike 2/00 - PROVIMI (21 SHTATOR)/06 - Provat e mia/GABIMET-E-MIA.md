# Provat e mia të provimit shembull — çka bëra mirë, çka humbi pikë

Katër prova nga `Downloads/Provim SHK2/` (Provim, Provim 2, Provim 3, Provim 5). I kompilova dhe i
ekzekutova të gjitha. Këtu janë vetëm dy më të plotat; gabimet janë nxjerrë nga të katërta.

---

## Prova 1 — Pyetja 3, Ndermarrja (`Prova 1 - Pyetja 3 (Ndermarrja)/`)

**Kompilon dhe ekzekutohet.** Struktura është e saktë — kjo është ~50 nga 60 pikë. Çka ke saktë:

| ✓ | Pika |
|---|---|
| varg `Punetori[]` + `index`, numri në konstruktor | (f) |
| `ekziston()` me lak deri te `index` | (g) |
| `shtoPuntor` me **tri** kushtet: null, ekziston, plot | (h) |
| `instanceof Individi` për kualifikimet | (i) |
| katër llojet me `instanceof` | (j) |
| `shfaq()` në formatin `emri : mosha` | (k) |
| `main` me 2 instanca të secilës klasë, brenda `try/catch` | (l) |
| readonly pa set te Shoferi/Koordinatori/Menaxheri/Drejtori | (c),(e) |

### Ku humbin pikët (verifikuar me ekzekutim)

**1. `Punetori` nuk ka `equals(Object)`** → `ekziston()` krahason **referenca**, jo të dhëna.
E testova: shtova `Shoferi("Alban",20,"Ferizaj")` dy herë — `ekziston()` ktheu `false` dhe
`shfaq()` e shtypi **dy herë**. Kjo i rrëzon (g) dhe (h) — 7 pikë.
```java
// shto te Punetori:
public boolean equals(Object o){
    return o instanceof Punetori ? ((Punetori)o).getEmri().equals(emri) : false;
}
```

**2. `Punetori` nuk validon dhe nuk ka `set`.** E testova: `new Shoferi(null, -5, "X")` u krijua **pa
gabim**. Pika (b) kërkon *"get dhe set"*, pika (m) kërkon exception për **të gjitha** atributet.
```java
public Punetori(String e, int m) throws PunetoriException{
    if(e == null || e.trim().isEmpty()) throw new PunetoriException("Emri gabim!");
    if(m <= 0) throw new PunetoriException("Mosha gabim!");
    emri = e; mosha = m;
}
public void setEmri(String e) throws PunetoriException{ /* i njëjti if */ }
public void setMosha(int m) throws PunetoriException{ /* i njëjti if */ }
```

**3. Emri i exception-it: `PuntoriException`.** Provimi thotë **`PunetoriException`**. Emrat e klasave
janë pikë — kopjoji **saktësisht** nga teksti.

**4. `StafiAdministrativ.departamenti` është `public`.** Bëje `private` + `getDepartamenti()`.

**5. `shtoPuntor` shtyp mesazh në vend të hedhë exception.** Pranohet, por pika (m) thotë
*"gjenerohet exception specifik"* — me `throw` je i sigurt.

---

## Prova 2 — Pyetjet 4 dhe 5 (`Prova 2 - Pyetjet 4 dhe 5/`)

### OurThread — **5/5, saktë.** `NORM_PRIORITY`, `MAX_PRIORITY`, `start()`. Asgjë për të ndryshuar.

### FileNumero — struktura saktë, dy gabime që përsëriten në **të tria** provat (2, 3, 5):

**1. Emri i output file-it është i ngulitur** (`"ushtrimi12.out"`, `"shk12.out"`, `"shk200.out"`).
Provimi kërkon **`fileName_out.txt`**, të nxjerrë nga emri i input-it:
```java
String output = input.substring(0, input.lastIndexOf(".")) + "_out.txt";
```

**2. E ndryshove kushtin** për të marrë rezultat jo-zero: `<= 5` (Prova 3), `< 6` (Prova 5).
E kuptove kontradiktën (UBT21 ka 5 karaktere → `< 5` s'plotësohet kurrë) — **por në provim shkruaje
`< 5` siç thotë teksti** dhe shto një koment. Kushti i ndryshuar = kod që s'përputhet me detyrën.

**3. Formati i output-it** — kopjoje rresht për rresht nga teksti, me `\n` dhe `\t- `.

---

## Prova 3 — pse nuk kompilon

`super.toString` **pa kllapa** në `Drejtori` dhe `Menaxheri`. Një karakter, zero pikë për krejt
klasën nëse korrigjuesi kompilon. Gjithashtu: `shtoPunetor` **harron kontrollin "ka vend"** →
`ArrayIndexOutOfBoundsException` te punëtori i 11-të.

---

## Gabime nga kodi javor që do të ndodhin edhe në provim

| Gabimi | Ku e bëre | Rregullimi |
|---|---|---|
| `if(emri.trim().isEmpty() \|\| emri == null)` | Java 8 `Dyqani`, `MulliriKafes` | **null i pari**: `if(emri == null \|\| emri.trim().isEmpty())` — përndryshe NPE |
| `public abstract MjetiGarues extends ...` | Java 12 `MjetiGarues` | mungon **`class`** — të njëjtin gabim e bëri profesori te G1 `StafiAdministrativ` |
| `return "Vetura"` pa `;` | Java 12 `VeturaGaruese` | — |
| `public getPozitaStartuese()` | Java 12 `MjetiGarues` | mungon **tipi i kthimit** |
| `new Pajisja Exception(...)` | Java 8 `MulliriKafes` | hapësirë në emër |

---

## Lista e kontrollit — 60 sekonda para se ta dorëzosh

```
[ ] klasa bazë ka  equals(Object o)          → ekziston() punon
[ ] klasa bazë ka  get + set + validim        → pikat (b) dhe (m)
[ ] emri i exception-it identik me tekstin    → PunetoriException, jo Puntori
[ ] shto...(): null? ekziston? ka vend?       → tri kushte, jo dy
[ ] super.toString()  — ME kllapa
[ ] abstract  class  X  — fjala class
[ ] null == para trim()
[ ] output file: nga emri i input-it, jo hardcoded
[ ] kushti  < 5  fjalë për fjalë, + koment
[ ] fw.close()  dhe  br.close()
[ ] main() brenda try/catch
```
