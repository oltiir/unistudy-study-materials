# Testi i fundit: `Kinemaja` — zgjidhje e plotë, 65 pikë

Kjo zgjidhje është ndërtuar nga **dy fotot e pyetjes 3** që dërgove. Nuk kishte zgjidhje Java të kësaj detyre në dosjet e kontrolluara. Shkruaje secilin bllok në fajllin me emrin e tij, në **të njëjtin folder**. Kodi është menduar të kompilohet së bashku me `javac *.java`.

## Harta e pikëve dhe e klasave

| Pika | Pikë | Fajlli | Pse ekziston |
|---|---:|---|---|
| A | 5 | `ShfaqjaException.java` | Gabim specifik kur të dhënat janë të pavlefshme. |
| B | 15 | `Shfaqja.java` | Baza abstrakte me të përbashkëtat: titull, kohëzgjatje, çmim. |
| C | 5 | `Vleresueshme.java` | Kontratë për objekte që kanë vlerësim. |
| D | 15 | `Filmi.java`, `Koncerti.java` | Dy lloje konkrete me atributet e tyre. |
| Main | 25 | `Kinemaja.java` | `ArrayList`, `try/catch/finally`, for-each, `instanceof`, numërim. |

```text
Shfaqja (abstract)
  ├─ Filmi implements Vleresueshme
  └─ Koncerti

Kinemaja.main → ArrayList<Shfaqja> → mban Filmi dhe Koncerti
```

## A) `ShfaqjaException.java`

```java
public class ShfaqjaException extends Exception {
    public ShfaqjaException(String mesazhi) {
        super(mesazhi);
    }
}
```

`extends Exception` e bën **checked exception**. `super(mesazhi)` ia jep mesazhin klasës prind, që `e.getMessage()` ta kthejë në `catch`.

## B) `Shfaqja.java`

```java
public abstract class Shfaqja {
    protected final String titulli; // readonly: vendoset vetëm në konstruktor
    protected int kohezgjatja;
    protected double cmimiBilete;

    public Shfaqja(String titulli, int kohezgjatja, double cmimiBilete)
            throws ShfaqjaException {
        if (titulli == null || titulli.trim().isEmpty()) {
            throw new ShfaqjaException("Titulli eshte i zbrazet!");
        }
        if (kohezgjatja <= 0) {
            throw new ShfaqjaException("Kohezgjatja duhet te jete pozitive!");
        }
        if (cmimiBilete < 0) {
            throw new ShfaqjaException("Cmimi i biletes nuk mund te jete negativ!");
        }
        this.titulli = titulli;
        this.kohezgjatja = kohezgjatja;
        this.cmimiBilete = cmimiBilete;
    }

    public String getTitulli() { return titulli; }
    public int getKohezgjatja() { return kohezgjatja; }
    public double getCmimiBilete() { return cmimiBilete; }

    public void setKohezgjatja(int kohezgjatja) throws ShfaqjaException {
        if (kohezgjatja <= 0) {
            throw new ShfaqjaException("Kohezgjatja duhet te jete pozitive!");
        }
        this.kohezgjatja = kohezgjatja;
    }

    public void setCmimiBilete(double cmimiBilete) throws ShfaqjaException {
        if (cmimiBilete < 0) {
            throw new ShfaqjaException("Cmimi i biletes nuk mund te jete negativ!");
        }
        this.cmimiBilete = cmimiBilete;
    }

    public abstract String zhanri();

    @Override
    public String toString() {
        return "Shfaqja[titulli=" + titulli + ", kohezgjatja="
                + kohezgjatja + ", cmimi=" + cmimiBilete + "]";
    }

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
}
```

**Pse kështu?** `titulli` është `protected final`, sepse fotoja kërkon `protected` dhe `readonly`; s'ka `setTitulli`. Kohëzgjatja dhe çmimi kanë setter, prandaj i njëjti validim bëhet si në konstruktor, ashtu edhe në setter. `kohezgjatja <= 0` ndalon zero; `cmimiBilete < 0` **e lejon zero**. `equals` përdor `instanceof` dhe krahasim sipas titullit, saktësisht si në foto. `hashCode` është shtesë e nevojshme për kontratën e Java-s kur mbishkruan `equals`.

## C) `Vleresueshme.java`

```java
public interface Vleresueshme {
    double mesatariaVleresimit();

    default String pershkrimi() {
        return "Permbajtje e vleresueshme";
    }
}
```

Metoda pa trup është detyrim për klasën që e implementon. `default` ka trup dhe trashëgohet gati; `Filmi` s'ka nevojë ta shkruajë prapë `pershkrimi()`.

## D1) `Filmi.java`

```java
public class Filmi extends Shfaqja implements Vleresueshme {
    private final double vleresimi;

    public Filmi(String titulli, int kohezgjatja, double cmimiBilete,
                 double vleresimi) throws ShfaqjaException {
        super(titulli, kohezgjatja, cmimiBilete);
        if (vleresimi < 0) {
            throw new ShfaqjaException("Vleresimi nuk mund te jete negativ!");
        }
        this.vleresimi = vleresimi;
    }

    @Override
    public String zhanri() {
        return "Film";
    }

    @Override
    public double mesatariaVleresimit() {
        return vleresimi;
    }

    @Override
    public String toString() {
        return "Filmi " + super.toString()
                + " (vleresimi: " + vleresimi + ")";
    }
}
```

`Filmi` trashëgon atributet e `Shfaqja` dhe shton **vetëm** `vleresimi`. `super(...)` i validon e i ruan të përbashkëtat. `zhanri()` kthen fjalën fikse `"Film"`; nuk duhet atribut `zhanri`. Fotoja nuk cakton interval për `vleresimi`; zbatohet vetëm rregulli i përgjithshëm "numër jo negativ" (shih [07 - Plotësime](<07 - Plotesime - metodat e koleksionit, teoria dhe threads.md>), pika 5). Nëse teksti jep interval, shkruaj atë.

## D2) `Koncerti.java`

```java
public class Koncerti extends Shfaqja {
    private final String artisti;

    public Koncerti(String titulli, int kohezgjatja, double cmimiBilete,
                    String artisti) throws ShfaqjaException {
        super(titulli, kohezgjatja, cmimiBilete);
        if (artisti == null || artisti.trim().isEmpty()) {
            throw new ShfaqjaException("Artisti eshte i zbrazet!");
        }
        this.artisti = artisti;
    }

    @Override
    public String zhanri() {
        return "Koncert";
    }

    @Override
    public String toString() {
        return "Koncerti " + super.toString()
                + " (artisti: " + artisti + ")";
    }
}
```

`Koncerti` **nuk** implementon `Vleresueshme`, sepse fotoja ia kërkon atë vetëm `Filmi`. Kontrolli i `artisti` bosh këtu zbaton rregullin hyrës të fotos për të dhëna të vlefshme; në pikën D s'jepet një kusht më i hollësishëm për artistin.

## `Kinemaja.java`: main, 25 pikë

```java
import java.util.ArrayList;

public class Kinemaja {
    public static void main(String[] args) {
        ArrayList<Shfaqja> shfaqjet = new ArrayList<Shfaqja>();

        try {
            shfaqjet.add(new Filmi("Filmi A", 120, 5.0, 8.5));
            shfaqjet.add(new Filmi("Filmi B", 100, 4.0, 7.5));
            shfaqjet.add(new Koncerti("Koncerti A", 90, 10.0, "Arta"));
        } catch (ShfaqjaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Verifikimi u krye.");
        }

        int numriFilmave = 0;
        for (Shfaqja shfaqja : shfaqjet) {
            System.out.println(shfaqja.toString());
            System.out.println("Zhanri: " + shfaqja.zhanri());

            if (shfaqja instanceof Filmi) {
                Filmi film = (Filmi) shfaqja;
                System.out.println("Mesatarja: " + film.mesatariaVleresimit());
                numriFilmave++;
            }
        }
        System.out.println("Numri i filmave: " + numriFilmave);
    }
}
```

### Shpjegimi i `main`, hap pas hapi

1. `ArrayList<Shfaqja>` mban **dy nënlloje**: `Filmi` dhe `Koncerti`. Një `ArrayList<Filmi>` nuk do të mund ta mbante Koncertin.
2. `add()` shton objektin. Nuk ka `index` dhe nuk kontrollon `length` si te vargu i `Ndermarrja`.
3. Krijimi i objekteve mund të hedhë `ShfaqjaException`; `catch` shtyp mesazhin. `finally` shtypet edhe kur s'ka gabim.
4. For-each merr çdo `Shfaqja`. `toString()` dhe `zhanri()` zgjidhen sipas objektit real gjatë ekzekutimit: kjo është **polimorfizëm runtime**.
5. `mesatariaVleresimit()` ekziston te `Filmi`, jo te `Shfaqja`; prandaj bëjmë `instanceof` dhe cast. I njëjti kontroll numëron filmat.

**Rast që duhet ta kuptosh:** nëse objekti i dytë hedh exception, kodi brenda `try` ndalet aty; objektet e shtuara para tij mbeten në listë. `finally` prapë shtypet, pastaj for-each ecën mbi elementet që janë shtuar.

## Tri gabimet më të kushtueshme

1. `new Shfaqja(...)` — s'lejohet, sepse është abstrakte. Krijo `new Filmi(...)` ose `new Koncerti(...)`.
2. `Shfaqja s; s.mesatariaVleresimit()` — s'kompilon, sepse metoda nuk është në tipin `Shfaqja`. Kontrollo `instanceof Filmi`, pastaj cast.
3. `setTitulli(...)` — bie ndesh me readonly. Setter ka vetëm për kohëzgjatje dhe çmim, me validim e `throws ShfaqjaException`.
