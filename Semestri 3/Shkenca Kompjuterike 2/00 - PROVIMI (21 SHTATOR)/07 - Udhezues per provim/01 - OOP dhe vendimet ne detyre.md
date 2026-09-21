# OOP: si e kthen tekstin e detyrës në klasa dhe metoda

Kjo fletë vlen për **të dy testet**. [Provimi i vjetër](<../01 - Provimi Shembull.pdf>) përdor `Punetori/Ndermarrja`; testi i fundit në foto përdor `Shfaqja/Filmi/Koncerti/Kinemaja`. Për kodin e plotë të këtij të fundit, shih [02 - Kinemaja](<02 - Kinemaja e zgjidhur.md>).

## 1. Pyetja e parë: çka është atribut, çka është metodë?

**Atributi ruan një gjendje të objektit.** **Metoda kryen veprim ose llogarit përgjigje.** Mos krijo atribut sa herë që sheh një emër në tekst.

| Kërkesa në tekst | Vendimi | Pse |
|---|---|---|
| `Shfaqja` ka titull, kohëzgjatje, çmim | 3 atribute te `Shfaqja` | Çdo shfaqje i mban këto vlera. |
| `Filmi` ka vlerësim | `vleresimi` vetëm te `Filmi` | `Koncerti` nuk ka vlerësim në detyrë. |
| `Koncerti` ka artist | `artisti` vetëm te `Koncerti` | Nuk është pronë e çdo shfaqjeje. |
| `zhanri()` kthen gjithmonë `"Film"` për film | metodë `return "Film";` | Nuk ka nevojë për atribut `zhanri`; vlera del nga tipi. |
| `Kinemaja` numëron filmat | `int numri = 0` lokal në `main` | Numri llogaritet nga lista; nuk kërkohet të ruhet vazhdimisht. |
| `Kinemaja` krijon `ArrayList` në `main` | variabël lokale `shfaqjet` | Fotoja kërkon pikërisht deklarimin në `main`, jo atribut të klasës. |
| `Ndermarrja` përmban punëtorë | atribut `Punetori[] punetoret` | Konstruktori dhe disa metoda përdorin të njëjtin varg. |
| `FileNumero` mban emrin e file-it për më vonë | atribut `emriFileit` | Konstruktori e merr, metoda tjetër e përdor. Numëruesit janë lokalë. |
| `ShfaqjaThread.run()` shtyp emrin e sallës | atribut `emri` | Konstruktori e vendos, `run()` e lexon më vonë. |

**Test i shpejtë:** nëse vlera ndryshon nga një objekt te tjetri dhe duhet të mbahet për metodë tjetër, bëje atribut. Nëse është rezultat i llogaritjes së një metode, zakonisht bëje variabël lokale. Nëse është e njëjtë për çdo objekt të asaj nënklase, shpesh mjafton `return` konstant.

## 2. Hierarkia: ku vendoset kodi?

```text
Testi i vjetër                         Testi i fundit
Individi (interface)                   Vleresueshme (interface)
  getKualifikimin()                      mesatariaVleresimit(), pershkrimi()
        ▲                                      ▲
Punetori (abstract)                     Shfaqja (abstract)
  emri, mosha                              titulli, kohezgjatja, cmimiBilete
  angazhimiFullTime()                      zhanri()
  ▲ Shoferi / Koordinatori / Menaxheri      ▲ Filmi implements Vleresueshme
  ▲ StafiAdministrativ (abstract)           ▲ Koncerti
       ▲ Drejtori
Ndermarrja: Punetori[]                  Kinemaja.main: ArrayList<Shfaqja>
```

- **Klasa bazë abstrakte**: vendos atributet/metodat që janë të përbashkëta. Nuk bëhet `new Punetori(...)` ose `new Shfaqja(...)`.
- **Nënklasa konkrete**: `extends Baza`, ka vetëm atributet e veta dhe i jep trup metodave abstrakte të mbetura.
- **Interface**: aftësi/kontratë. `Menaxheri` dhe `Drejtori` kanë kualifikim → `implements Individi`. Në testin e fundit **vetëm `Filmi`** ka vlerësim → `implements Vleresueshme`; `Koncerti` nuk e implementon.
- Një klasë mund të bëjë `extends` vetëm **një** klasë, por mund të implementojë disa interface: `class X extends Baza implements A, B`.

### `super(...)`: pse duhet?

```java
public Filmi(String t, int k, double c, double v) throws ShfaqjaException {
    super(t, k, c);  // konstruktori i Shfaqja validon dhe ruan 3 atributet e përbashkëta
    vleresimi = v;   // Filmi ruan vetëm atributin e vet
}
```

`super(...)` thërret konstruktorin e klasës prind dhe duhet të jetë **rreshti i parë** në konstruktor. Nëse prindi ka vetëm konstruktor me parametra, Java nuk mund ta thërrasë vetë `super()` bosh. Te `Drejtori`, prindi `StafiAdministrativ` kërkon `emri, mosha, departamenti` — prandaj Drejtori duhet t'i marrë e t'i përcjellë të tre.

### Kur e shkruan `@Override`?

Kur nënklasa zëvendëson metodën e prindit ose plotëson metodën e interface: `zhanri()`, `angazhimiFullTime()`, `toString()`, `equals(Object)`, `mesatariaVleresimit()`. `@Override` e bën kompajlerin të të tregojë nëse e ke shkruar gabim emrin ose parametrat. `getKualifikimi()` **nuk** plotëson `getKualifikimin()` — janë dy emra të ndryshëm.

## 3. `readonly`, `final`, getter dhe setter

Kur teksti thotë **readonly**, vlera vendoset në konstruktor dhe nuk ndryshon më. Zgjidhja e sigurt:

```java
protected final String titulli;
public String getTitulli() { return titulli; }
// nuk ka setTitulli(...)
```

Në `Shfaqja`, fotoja kërkon atribute `protected`; `protected final` e plotëson edhe atë, edhe readonly. Për atributet e tjera mund të përdorësh `private final` nëse s'kërkohet `protected`. `final` nuk është e domosdoshme në çdo stil të ligjëratës, por e mbron realisht vlerën; vetëm mungesa e setter-it s'e ndalon një nënklasë ta ndryshojë një fushë `protected`.

| Atribut | Getter? | Setter? | Kontrolli |
|---|---|---|---|
| `Shfaqja.titulli` readonly | po | **jo** | jo `null`, jo bosh në konstruktor |
| `Shfaqja.kohezgjatja` | po | po | `> 0` në konstruktor **dhe** setter |
| `Shfaqja.cmimiBilete` | po | po | `>= 0` në konstruktor **dhe** setter; **0 lejohet** |
| `Shoferi.regjioni`, `Koordinatori.nrShofereve`, `Menaxheri.sektori/kualifikimi` | po | **jo** | kontroll në konstruktor |

Për string jo të zbrazët, **`null` kontrollohet i pari**:

```java
if (s == null || s.trim().isEmpty()) {
    throw new ShfaqjaException("Vlere e zbrazet");
}
```

`||` ndalet sapo e majta është `true`; prandaj `trim()` nuk thirret mbi `null`.

## 4. Exception: katër fjalë që nuk duhen përzier

```java
class ShfaqjaException extends Exception {      // klasa e exception-it
    ShfaqjaException(String mesazh) { super(mesazh); }
}

void setKohezgjatja(int k) throws ShfaqjaException { // nënshkrimi: mund ta hedhë
    if (k <= 0) throw new ShfaqjaException("Gabim"); // këtu hidhet realisht
}

try {
    // kod që mund të hedhë exception
} catch (ShfaqjaException e) {
    System.out.println(e.getMessage());
} finally {
    System.out.println("Verifikimi u krye.");
}
```

`throw` është **veprim**; `throws` është **deklarim**. `Exception` është checked: konstruktori/metoda që e hedh duhet ta deklarojë me `throws`, kurse thirrësi duhet ta kapë me `catch` ose ta deklarojë më tej. `finally` ekzekutohet edhe nëse `try` apo `catch` ka `return` (para kthimit). Nëse ka disa `catch`, shkruaj fillimisht tipin më specifik, pastaj më të përgjithshmin.

**Mos e tepro validimin:** kur teksti thotë `cmimi < 0`, çmimi `0` është i vlefshëm. Për `Filmi.vleresimi` në foto nuk jepet interval; mos shpik kufi `0–10` si kërkesë e provimit. Për `Koncerti.artisti` nuk jepet rregull i veçantë në pikën D; kontrolli për string bosh është zgjedhje e arsyeshme sipas hyrjes së përgjithshme për të dhëna të vlefshme, jo kufi numerik i specifikuar.

## 5. `equals`, `hashCode`, `toString` dhe `instanceof`

`==` pyet a janë **i njëjti objekt**. `equals(Object)` pyet a i konsideron **të barabartë sipas rregullit të detyrës**.

```java
@Override
public boolean equals(Object obj) {
    if (!(obj instanceof Shfaqja)) return false;
    Shfaqja tjeter = (Shfaqja) obj;
    return titulli.equals(tjeter.getTitulli());
}

@Override
public int hashCode() {
    return titulli.hashCode();
}
```

Te `Shfaqja`, fotoja e thotë qartë: titull i njëjtë = shfaqje e njëjtë. Te `Punetori`, PDF-ja **nuk e specifikon** kriterin e barazisë; zgjidhja shembull përdor emrin. Nëse e shkruan `equals`, mbaje të njëjtin kriter edhe në `hashCode`. Kjo është veçanërisht e rëndësishme në koleksione si `HashSet`; `ArrayList.contains` përdor `equals`.

`toString()` përcakton çka shtyp `System.out.println(objekti)`. Në nënklasë, `super.toString()` të kursen përsëritjen e pjesës së përbashkët. Kllapat `()` janë të domosdoshme.

`instanceof` përdoret kur referenca është e tipit bazë, por duhet sjellje e një tipi specifik:

```java
for (Shfaqja s : shfaqjet) {
    System.out.println(s.zhanri()); // polimorfizëm: zgjedhet Filmi ose Koncerti në runtime
    if (s instanceof Filmi) {
        Filmi f = (Filmi) s;
        System.out.println(f.mesatariaVleresimit());
    }
}
```

`null instanceof Filmi` është `false`, prandaj kontrolli ndihmon edhe me `null`. Pa kontroll, cast-i i një `Koncerti` në `Filmi` jep `ClassCastException`.

## 6. Varg apo `ArrayList`? Lexo fjalën e detyrës

| Teksti | Zgjidhja | Metodat / kujdesi |
|---|---|---|
| “krijoni **vargun** e tipit Punetori” | `Punetori[] punetoret = new Punetori[n];` | Qelizat fillojnë `null`; kontrollo `!= null` para `equals`, getter, `toString`. |
| “deklaroni **ArrayList<Shfaqja>**” | `ArrayList<Shfaqja> shfaqjet = new ArrayList<>();` | `add`, `size`, `get`, `contains`; lista rritet vetë. |

`for (Punetori p : punetoret)` ecën edhe mbi qelizat `null` të vargut. `for (Shfaqja s : shfaqjet)` ecën vetëm mbi elementet e shtuara. `ArrayList.contains(x)` përdor `equals`; në varg, ti e shkruan vetë lakun.

## 7. Detyra e vjetër `Ndermarrja`: çka bën secila metodë

Kodin e plotë e ke te `../03 - Klasa dhe Interface (64p)/zgjidhja-provimi/Ndermarrja.java`. Këtu është logjika që duhet të dish ta rindërtosh:

| Pika | Metoda | Pyetja që zgjidh |
|---|---|---|
| f | konstruktori | Merr kapacitetin, kontrollon `> 0`, krijon `Punetori[]`. |
| g | `ekziston(Punetori p)` | Ecën në varg; për çdo qelizë jo `null`, thërret `equals(p)`. |
| h | `shtoPunetor(Punetori p)` | Kontrollon **p jo null → nuk ekziston → ka vend**; e vendos në qelizën e parë `null`. |
| i | `getKualifikimet()` | `instanceof Individi`; cast në `Individi`; thërret `getKualifikimin()`. |
| j | `kaTeGjithaLlojet()` | Katër flamuj për `Shoferi`, `Koordinatori`, `Menaxheri`, `Drejtori`; në fund `&&`. |
| k | `shfaq()` | Për çdo punëtor jo `null`, shtyp `emri + " : " + mosha`. |
| l | `main()` | Nga dy objekte për secilin tip konkret, thërret/teston metodat brenda `try/catch`. |

```java
public boolean ekziston(Punetori p) {
    if (p == null) return false;
    for (Punetori aktual : punetoret) {
        if (aktual != null && aktual.equals(p)) return true;
    }
    return false;
}

public void shtoPunetor(Punetori p) throws PunetoriException {
    if (p == null) throw new PunetoriException("Punetori eshte null");
    if (ekziston(p)) throw new PunetoriException("Ekziston");
    for (int i = 0; i < punetoret.length; i++) {
        if (punetoret[i] == null) {
            punetoret[i] = p;
            return;
        }
    }
    throw new PunetoriException("Nuk ka vend");
}
```

**Kujdes te llojet:** `StafiAdministrativ` është abstrakte, prandaj s'ka instancë të drejtpërdrejtë për ta numëruar te `kaTeGjithaLlojet()`. Drejtori është nënklasa konkrete e saj. `Individi` nuk është klasë punëtori, por interface që e implementojnë Menaxheri dhe Drejtori.

## 8. Gabimet që u panë në provat e tua

| Gabimi | Korrigjimi |
|---|---|
| `extends Excepion` | `extends Exception` |
| `throws new PunetoriException(...)` brenda `if` | `throw new PunetoriException(...)` |
| `super(emri, mosha)` te Drejtori | `super(emri, mosha, departamenti)` |
| kontrollon `nrShofereve`, por nuk e ruan | `this.nrShofereve = nrShofereve;` pas kontrollit |
| `getKualifikimi()` kur interface kërkon `getKualifikimin()` | emri i metodës duhet identik |
| `super.toString` | `super.toString()` |
| `ArrayList` kur detyra thotë varg | shkruaj `Punetori[]` |
| cast në `LibriShkollor` për çdo `Libri` | bëj `if (l instanceof LibriShkollor)` para cast-it |

## Kontrollo veten

1. Pse `Filmi` ka `vleresimi`, por `Shfaqja` nuk e ka? Sepse nuk i përket çdo shfaqjeje.
2. Pse `titulli` nuk ka setter? Sepse kërkohet readonly.
3. Pse `Kinemaja` në foton e fundit përdor `ArrayList`, ndërsa `Ndermarrja` në PDF përdor varg? Sepse kështu i kërkojnë tekstet.
4. Pse `Filmi f = (Filmi) s` kërkon `instanceof`? Sepse `s` mund të jetë edhe `Koncerti`.
5. Çka e dallon `throw` nga `throws`? I pari hedh exception; i dyti paralajmëron në nënshkrim.
