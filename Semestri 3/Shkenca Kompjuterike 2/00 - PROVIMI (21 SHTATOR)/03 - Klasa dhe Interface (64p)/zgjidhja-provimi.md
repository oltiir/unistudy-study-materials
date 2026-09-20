# Pyetja 2 (4p) + Pyetja 3 (60p) — zgjidhja e plotë

Kodi i kompiluar dhe i testuar gjendet në `zgjidhja-provimi/`.

---

# Pyetja 2 — Klasat dhe Interface-ët (4 pikë)

> *"Nga kodi më poshtë cilat metoda është e obliguar klasa `Test` t'i implementojë?
> Nuk pranohen përgjigje gjysmë të sakta."*

Analizojmë çka **premton** `Test` dhe çka **tashmë e ka**:

```
InterX1 ......... int metodaA(String a)     +  String metodaA(char a)
InterX2 ......... boolean metodaB(int,int)  +  int metodaB(boolean)
KlasaA (abstract) implements InterX1
                  ✓ e jep  int metodaA(String a)
                  ✗ NUK e jep  String metodaA(char a)   -> mbetet borxh
                  + shton abstrakten  String metodaAB(int nr)
Test extends KlasaA implements InterX2
```

## Përgjigjja — 4 metoda:

| # | Metoda | Prej nga vjen |
|---|---|---|
| 1 | `String metodaA(char a)` | InterX1 — KlasaA s'e implementoi, borxhi kalon te Test |
| 2 | `String metodaAB(int nr)` | KlasaA — metodë abstrakte |
| 3 | `boolean metodaB(int a, int b)` | InterX2 |
| 4 | `int metodaB(boolean c)` | InterX2 |

**`int metodaA(String a)` NUK numërohet** — KlasaA tashmë e ka implementuar, Test e trashëgon gati.

```java
public class Test extends KlasaA implements InterX2{
    public String metodaA(char a){ return "" + a; }
    public String metodaAB(int nr){ return "" + nr; }
    public boolean metodaB(int a, int b){ return a > b; }
    public int metodaB(boolean c){ return c ? 1 : 0; }
}
```

> **Kurthi:** `metodaA` dhe `metodaB` janë të **mbingarkuara** (overloaded) — emër i njëjtë,
> parametra të ndryshëm. Janë metoda **të ndryshme**, secila duhet implementuar veçmas.

---

# Pyetja 3 — Kodi rreth Klasave dhe Interface-ëve (60 pikë)

Kjo është **pyetja më e rëndë e provimit**. Është saktësisht i njëjti model si detyra e
`Bibliotekës` (Java 12) dhe `Vrapimit` (Java 11) — vetëm emrat ndryshojnë.

## Hierarkia

```
            Individi  (interface)          Punetori  (abstract)
          getKualifikimin()               emri, mosha  [get/set]
                 ▲                        abstract angazhimiFullTime()
                 │                                  ▲
        ┌────────┼────────┐            ┌────────────┼────────────┐
        │        │        │            │            │            │
   Menaxheri  Drejtori    │        Shoferi   Koordinatori   StafiAdministrativ
   +sektori   +kualif.    │      +regjioni   +nrShofereve      (abstract)
   +kualif.      ▲        │      [readonly]   [readonly]      +departamenti
                 └────────┴──────────────────────────────────────┘
                              Drejtori extends StafiAdministrativ
                                       implements Individi

            Ndermarrja  →  Punetori[] punetoret   (VARG, jo ArrayList!)
```

## Radha e shkrimit në provim (mos e ndrysho)

1. **`PunetoriException`** — pika (m). Shkruaje **të parën**, se gjithçka tjetër e përdor.
2. **`Individi`** — pika (a), 3 rreshta.
3. **`Punetori`** — pika (b), abstrakte.
4. **`Shoferi`, `Koordinatori`, `Menaxheri`** — pika (c).
5. **`StafiAdministrativ`** — pika (d), abstrakte.
6. **`Drejtori`** — pika (e).
7. **`Ndermarrja`** — pikat (f)–(l), **35 pikë**, pjesa më e madhe.

## Rregullat që i kërkon detyra

| Kërkesa | Si zbatohet |
|---|---|
| **readonly** (`regjioni`, `nrShofereve`, `sektori`, `kualifikimi`) | vetëm `get`, **pa `set`** |
| atribut jo i zbrazët | `if(x == null \|\| x.trim().isEmpty()) throw new PunetoriException(...)` |
| numër jo negativ | `if(x < 0) throw ...` |
| validim edhe në `set` | po — i njëjti `if` si në konstruktor |
| `Punetori` abstrakte | ka `abstract boolean angazhimiFullTime()` |
| `StafiAdministrativ` abstrakte | **nuk** e implementon `angazhimiFullTime()`, ia lë Drejtorit |

## Pjesa e vështirë — `Ndermarrja`

### (f) Vargu, jo ArrayList — 4p
```java
private Punetori[] punetoret;

public Ndermarrja(int nr) throws PunetoriException{
    if(nr <= 0){ throw new PunetoriException("Numri i punetoreve gabim!"); }
    punetoret = new Punetori[nr];
}
```
> Detyra thotë *"pranon numrin e Punëtorëve në konstruktor dhe përdoret për të krijuar
> **vargun** e tipit Punëtori"* — pra `Punetori[]`, jo `ArrayList`.
> Pasojë: **çdo qelizë fillimisht është `null`** → në çdo lak duhet kontroll `!= null`.

### (g) `ekziston` — 2p
```java
public boolean ekziston(Punetori p){
    for(int i = 0; i < punetoret.length; i++){
        if(punetoret[i] != null && punetoret[i].equals(p)){ return true; }
    }
    return false;
}
```
> Kërkon `equals()` te `Punetori`. Pa të, `equals` krahason adresat dhe kthen gjithmonë `false`.

### (h) `shtoPunetor` — 5p — **tri kushte**
```java
public void shtoPunetor(Punetori p) throws PunetoriException{
    if(p == null){ throw new PunetoriException("Punetori nuk eshte i inicializuar!"); }
    if(ekziston(p)){ throw new PunetoriException("Punetori ekziston!"); }
    for(int i = 0; i < punetoret.length; i++){
        if(punetoret[i] == null){ punetoret[i] = p; return; }   // vend i lire
    }
    throw new PunetoriException("Nuk ka vend te lire!");
}
```
> Të tria kushtet duhen: **i inicializuar** + **nuk ekziston** + **ka vend**. Secili mban pikë.

### (i) `getKualifikimet` — 8p
```java
public void getKualifikimet(){
    for(int i = 0; i < punetoret.length; i++){
        if(punetoret[i] instanceof Individi){
            Individi in = (Individi)punetoret[i];
            System.out.println(punetoret[i].getEmri() + " -> " + in.getKualifikimin());
        }
    }
}
```
> *"shfaq instancat të cilat kanë kualifikime"* = ato që implementojnë **`Individi`**
> (Menaxheri dhe Drejtori). `instanceof Individi` e zgjidh njëherësh edhe null-in
> (`null instanceof X` është gjithmonë `false`).

### (j) `kaTeGjithaLlojet` — 8p
```java
public boolean kaTeGjithaLlojet(){
    boolean shoferi = false, koordinatori = false, menaxheri = false, drejtori = false;
    for(int i = 0; i < punetoret.length; i++){
        if(punetoret[i] instanceof Shoferi){ shoferi = true; }
        else if(punetoret[i] instanceof Koordinatori){ koordinatori = true; }
        else if(punetoret[i] instanceof Menaxheri){ menaxheri = true; }
        else if(punetoret[i] instanceof Drejtori){ drejtori = true; }
    }
    return shoferi && koordinatori && menaxheri && drejtori;
}
```
> Katër lloje konkrete. `StafiAdministrativ` **nuk** numërohet — është abstrakte,
> s'ka instanca të vetat.

### (k) `shfaq` — 2p — formati `emri : mosha`
```java
public void shfaq(){
    for(int i = 0; i < punetoret.length; i++){
        if(punetoret[i] != null){
            System.out.println(punetoret[i].getEmri() + " : " + punetoret[i].getMosha());
        }
    }
}
```

### (l) `main` — 3p — **nga 2 instanca të secilës klasë**
```java
Ndermarrja n = new Ndermarrja(10);
n.shtoPunetor(new Shoferi("Arb", 30, "Prishtine"));
n.shtoPunetor(new Shoferi("Bleron", 28, "Prizren"));
n.shtoPunetor(new Koordinatori("Drita", 35, 4));
n.shtoPunetor(new Koordinatori("Egzon", 40, 2));
n.shtoPunetor(new Menaxheri("Fatos", 45, "Shitje", "MSc Ekonomi"));
n.shtoPunetor(new Menaxheri("Gent", 38, "IT", "BSc Informatike"));
n.shtoPunetor(new Drejtori("Hana", 50, "Financa", "PhD Menaxhment"));
n.shtoPunetor(new Drejtori("Ilir", 55, "Burimet Njerezore", "MSc Juridik"));
n.shfaq();
n.getKualifikimet();
System.out.println(n.kaTeGjithaLlojet());
```
Gjithçka brenda `try { } catch(PunetoriException e) { }`.

---

## Gabimet që të kushtojnë pikë

| Gabimi | Pasoja |
|---|---|
| Harrohet `throws PunetoriException` te konstruktori | nuk kompilon |
| Bëhet `set` për atribut **readonly** | humb pikën e (c)/(e) |
| Harrohet `equals()` te `Punetori` | `ekziston()` s'punon → bien (g) dhe (h) |
| Harrohet `!= null` në lak mbi varg | `NullPointerException` |
| `StafiAdministrativ` bëhet konkrete | humb pikën e (d) |
| Përdoret `ArrayList` në vend të vargut | humb pikën e (f) |
| Validimi vetëm në konstruktor, jo në `set` | pika të pjesshme te (m) |
| `main` pa `try/catch` | nuk kompilon |

---

# ⭐ Profesori e ka zgjidhur KËTË detyrë në ligjëratën e javës 12

Te `zgjidhja-mesuesit/Punetori-Ndermarrja (Java 12, Grupi 1)/` dhe `... (Grupi 5)/`
gjendet kodi që profesori e shkroi **live në ligjëratë** për pikërisht këtë detyrë:
`Punetori`, `Shoferi`, `Koordinatori`, `Menaxheri`, `StafiAdministrativ`, `Drejtori`,
`Individi`, `PunetoriException`, `Ndermarrja`.

**Lexoje patjetër** — të tregon çka pret profesori. Por **mos e kopjo ashtu siç është**:

## ⚠ Të dyja versionet kanë gabime kompilimi (i testova)

| Versioni | Gabimi | Rregullimi |
|---|---|---|
| Grupi 1 | `public abstract StafiAdministrativ extends Punetori{` | mungon `class` → `public abstract class StafiAdministrativ` |
| Grupi 5 | `Iterator it = lista.iterator(); Punetori p = it.next();` | raw type kthen `Object` → `Iterator<Punetori> it` |
| Grupi 5 | `Punetori` ka `setMosha` por **s'ka `getMosha`** | shto getter-in |

## Çka u mungon të dyjave ndaj tekstit të provimit

| Kërkesa e provimit | Grupi 1 | Grupi 5 | Te `zgjidhja-provimi/` |
|---|---|---|---|
| (f) **varg** `Punetori[]`, numri në konstruktor | ✗ ArrayList, konstruktor bosh | ✗ njëjtë | ✓ |
| (g) `ekziston(Punetori p)` | ✗ mungon | ✗ mungon | ✓ |
| (h) kushti "ka vend të lirë" | ✗ (ArrayList s'mbushet) | ✗ | ✓ |
| (j) të **katër** llojet | ✗ vetëm 3 (pa Drejtorin) | ✓ 4 | ✓ |
| (k) formati `emri : mosha` | ✗ shtyp `toString()` | ✓ | ✓ |
| (l) `main()` me nga 2 instanca | ✗ s'ka fare | ✗ s'ka fare | ✓ |

**Përfundimi:** përdore kodin e profesorit për të parë **stilin dhe strukturën**
(si i vendos validimet, si i emërton metodat), por për **përmbajtjen e plotë**
ndiq `zgjidhja-provimi/` — aty janë të gjitha pikat (a)–(m), kompilon dhe ekzekutohet.

> Nëse në provim teksti thotë **"varg"**, shkruaj varg. Nëse thotë **"ArrayList"**,
> shkruaj ArrayList. Profesori në ligjëratë përdori ArrayList sepse ishte shpjegim i
> shpejtë, por teksti i provimit shembull thotë qartë *"përdoret për të krijuar vargun"*.
