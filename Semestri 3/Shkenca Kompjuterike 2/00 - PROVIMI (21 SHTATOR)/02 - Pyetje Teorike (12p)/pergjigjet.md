# Pyetje Teorike — 12 pikë (6 pyetje × 2 pikë)

> Këto janë 6 pyetjet nga provimi shembull. Secila vlen **2 pikë**, prandaj
> mjafton një përgjigje e shkurtër + **një shembull**. Shembulli shpesh e blen pikën e dytë.

---

## 1. Çka nënkuptoni me polimorfizëm? (të mirret një shembull)

**Polimorfizëm** = "shumë forma". Një referencë e tipit të superklasës mund të mbajë objekte
të nënklasave të ndryshme, dhe **në kohë ekzekutimi** thirret metoda e klasës konkrete.

Dy lloje:
- **Compile-time (overloading)** — e njëjta emër metode, parametra të ndryshëm.
- **Runtime (overriding)** — nënklasa e rishkruan metodën e superklasës. *Ky është polimorfizmi i vërtetë.*

```java
Punetori p = new Shoferi("Arb", 30, "Prishtine");
System.out.println(p);   // thirret toString() i Shoferit, jo i Punetorit
```

Edhe pse `p` është deklaruar si `Punetori`, Java e thirr `toString()` e **Shoferit**.

---

## 2. Tregoni dallimin në mes bllokut statik dhe bllokut inicializues

| | Blloku **statik** | Blloku **inicializues** (instance) |
|---|---|---|
| Sintaksa | `static { ... }` | `{ ... }` |
| Kur ekzekutohet | **një herë**, kur klasa ngarkohet në memorie | **sa herë** që krijohet një objekt |
| Sa herë | 1 herë për gjithë programin | 1 herë për çdo `new` |
| Radha | para konstruktorit, para bllokut inicializues | para konstruktorit, pas bllokut statik |
| Çka prek | vetëm anëtarët **static** | anëtarët e instancës |

```java
public class Test {
    static { System.out.println("blloku statik"); }     // 1 herë
    { System.out.println("blloku inicializues"); }      // për çdo objekt
    public Test() { System.out.println("konstruktori"); }

    public static void main(String[] a){
        new Test();
        new Test();
    }
}
```

**Output:**
```
blloku statik
blloku inicializues
konstruktori
blloku inicializues
konstruktori
```

---

## 3. Çka trashëgon nënklasa nga super klasa?

Nënklasa trashëgon **anëtarët `public` dhe `protected`** (atributet dhe metodat), si dhe
ata me qasje *default* nëse janë në të njëjtin paketë.

**NUK trashëgohen:**
- **konstruktorët** (thirren me `super(...)`, por nuk trashëgohen)
- anëtarët **`private`** — ekzistojnë në objekt, por nënklasa i qaset vetëm përmes `get`/`set`

```java
public abstract class Punetori {
    private String emri;                 // NUK qaset direkt nga nënklasa
    public String getEmri(){ return emri; }   // KJO trashëgohet
}

public class Shoferi extends Punetori {
    public String toString(){
        return getEmri();    // po — përmes getter-it
        // return emri;      // JO — gabim kompilimi, është private
    }
}
```

---

## 4. Çka mund të posedojë një klasë abstrakte?

Një klasë abstrakte mund të ketë **gjithçka** që ka një klasë normale, **plus** metoda abstrakte:

- atribute (edhe `private`, `static`, `final`)
- **konstruktor** (po! thirret me `super(...)` nga nënklasa)
- metoda konkrete (me trup)
- metoda **abstrakte** (pa trup) — `public abstract void metoda();`
- bllok statik dhe bllok inicializues
- metoda `static`, `final`

**Kufizimi i vetëm:** nuk mund të instancohet — `new Punetori(...)` është gabim.

```java
public abstract class Punetori {
    private String emri;                              // atribut
    public Punetori(String e){ emri = e; }            // konstruktor
    public String getEmri(){ return emri; }           // metodë konkrete
    public abstract boolean angazhimiFullTime();      // metodë abstrakte
}
```

> Nëse një klasë ka **së paku një** metodë abstrakte, klasa **duhet** të jetë abstrakte.
> E kundërta nuk vlen: një klasë abstrakte mund të mos ketë asnjë metodë abstrakte.

---

## 5. Sa mënyra për të arritur abstraksionin ekzistojnë në Java, tregoni dallimin?

**Dy mënyra:** klasa abstrakte dhe interface.

| | Klasa **abstrakte** | **Interface** |
|---|---|---|
| Abstraksioni | i **pjesshëm** (0–100%) | i **plotë** (para Java 8) |
| Metodat | abstrakte **dhe** konkrete | abstrakte; `default` dhe `static` nga Java 8 |
| Atributet | çfarëdo lloji | vetëm `public static final` (konstante) |
| Konstruktor | **po** | **jo** |
| Trashëgimia | `extends` — **vetëm një** | `implements` — **sa të duash** |
| Modifikuesit | `private`, `protected`, `public` | gjithçka `public` |
| Kur përdoret | klasat kanë **kod të përbashkët** | definohet vetëm një **kontratë** |

```java
public interface Individi {           // kontratë
    String getKualifikimin();
}

public abstract class Punetori {      // kod i përbashkët + kontratë
    private String emri;
    public String getEmri(){ return emri; }
    public abstract boolean angazhimiFullTime();
}

// një klasë mund t'i bëjë të dyja njëkohësisht:
public class Menaxheri extends Punetori implements Individi { ... }
```

---

## 6. Çka është variabla statike? (të mirret një shembull)

Variabla statike (`static`) i takon **klasës**, jo objektit. Ekziston **një kopje e vetme**
e ndarë nga të gjitha instancat, krijohet kur klasa ngarkohet, dhe i qasemi me
**emrin e klasës** pa pasur nevojë për objekt.

```java
public class Punetori {
    private static int numriTotal = 0;   // një për GJITHË klasën
    private String emri;                 // një për ÇDO objekt

    public Punetori(String e){
        emri = e;
        numriTotal++;                    // rritet për çdo objekt të ri
    }

    public static int getNumriTotal(){   // metodë statike
        return numriTotal;
    }
}
```

```java
new Punetori("Arb");
new Punetori("Drita");
System.out.println(Punetori.getNumriTotal());   // 2 — pa krijuar objekt
```

**Kujdes:** një metodë `static` **nuk** mund t'i qaset atributeve jo-statike
(`emri`), sepse nuk ka objekt me të cilin të punojë.

---

## Kontrollo veten (mbuloje tabelën dhe përgjigju)

1. Sa herë ekzekutohet `static { }` nëse krijoj 10 objekte? → **1**
2. A trashëgohet konstruktori? → **Jo**
3. A mund të ketë klasa abstrakte konstruktor? → **Po**
4. Sa interface mund të implementojë një klasë? → **Sa të duash**
5. Sa klasa mund të bëjë `extends` një klasë? → **Vetëm një**
6. Sa është `Thread.MAX_PRIORITY`? → **10** (MIN = 1, NORM = 5)
