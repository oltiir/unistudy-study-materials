# Cheat Sheet — modelet që përsëriten në ÇDO detyrë

> I gjithë provimi është **një model i vetëm** i ripaketuar: Sportisti, Mesimdhenesi,
> Libri, Atleti, Punetori — e njëjta strukturë, emra të ndryshëm.
> Mësoje modelin, jo detyrën.

---

## 1. Exception-i specifik — gjithmonë i pari

```java
public class XException extends Exception{
    public XException(String m){
        super(m);
    }
}
```
3 rreshta, 5 pikë. Mos e harro kurrë.

---

## 2. Klasa abstrakte bazë — shablloni

```java
public abstract class Baza {
    private String teksti;      // jo i zbrazët
    private int numri;          // jo negativ
    private final String id;    // READONLY

    public Baza(String t, int n, String i) throws XException{
        if(t == null || t.trim().isEmpty()){
            throw new XException("Teksti gabim!");
        }
        teksti = t;
        if(n <= 0){
            throw new XException("Numri gabim!");
        }
        numri = n;
        if(i == null || i.trim().isEmpty()){
            throw new XException("Id gabim!");
        }
        id = i;
    }

    // READONLY -> vetëm get
    public String getId(){ return id; }

    // normal -> get + set, me TË NJËJTIN validim
    public String getTeksti(){ return teksti; }
    public void setTeksti(String t) throws XException{
        if(t == null || t.trim().isEmpty()){
            throw new XException("Teksti gabim!");
        }
        teksti = t;
    }

    public abstract boolean metodaAbstrakte();

    public String toString(){
        return id + " : " + teksti + " - " + numri;
    }

    public boolean equals(Object o){
        return o instanceof Baza?((Baza)o).getId().equals(id):false;
    }
}
```

### Validimet — mësoji përmendsh
| Kërkesa | Kodi |
|---|---|
| String jo i zbrazët | `if(s == null \|\| s.trim().isEmpty())` |
| numër jo negativ | `if(n < 0)` |
| numër pozitiv | `if(n <= 0)` |
| objekt jo null | `if(o == null)` |
| gjinia M/F | `if(!(gj == 'M' \|\| gj == 'F'))` |
| ISBN me gjatësi | `if(s == null \|\| s.length() < 13)` |

---

## 3. Nënklasa konkrete

```java
public class Konkretja extends Baza{
    private String shtese;                  // readonly -> vetëm get

    public Konkretja(String t, int n, String i, String sh) throws XException{
        super(t, n, i);                     // GJITHMONË i pari
        if(sh == null || sh.trim().isEmpty()){
            throw new XException("Shtese gabim!");
        }
        shtese = sh;
    }

    public String getShtese(){ return shtese; }

    public boolean metodaAbstrakte(){ return true; }   // detyrim

    public String toString(){
        return "Konkretja " + super.toString() + " : " + shtese;
    }
}
```

---

## 4. Interface

```java
public interface Kontrata {
    boolean metoda();                       // abstrakte, public by default

    default boolean metodaDefault(){        // trup i gatshëm, mund të rishkruhet
        return true;
    }
}
```
- klasa: `implements Kontrata` — mund të implementojë **shumë** interface
- `class X extends Y implements A, B` — **extends i pari**, pastaj implements

---

## 5. Kontejneri — dy variante

### (a) VARG — kur detyra thotë *"vargun e tipit X"*
```java
private X[] vargu;

public Kontejneri(int nr) throws XException{
    if(nr <= 0){ throw new XException("Numri gabim!"); }
    vargu = new X[nr];                    // të gjitha null!
}

public boolean ekziston(X e){
    for(int i = 0; i < vargu.length; i++){
        if(vargu[i] != null && vargu[i].equals(e)){ return true; }
    }
    return false;
}

public void shto(X e) throws XException{
    if(e == null){ throw new XException("Nuk eshte i inicializuar!"); }
    if(ekziston(e)){ throw new XException("Ekziston!"); }
    for(int i = 0; i < vargu.length; i++){
        if(vargu[i] == null){ vargu[i] = e; return; }
    }
    throw new XException("Nuk ka vend te lire!");
}
```
> **Në varg: gjithmonë `!= null` para se ta prekësh.**

### (b) ArrayList — kur detyra thotë *"ArrayList"* / *"Iterator"*
```java
import java.util.*;

private ArrayList<X> lista;
lista = new ArrayList<X>();

public void shto(X e) throws XException{
    if(lista.contains(e)){                 // përdor equals()
        throw new XException("Ekziston!");
    }
    lista.add(e);
}

public void shtyp(){
    Iterator<X> itr = lista.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
}
```
| ArrayList | kuptimi |
|---|---|
| `add(e)` | shton |
| `contains(e)` | a ekziston (thirr `equals`) |
| `size()` | sa elemente |
| `get(i)` | elementi i i-të |
| `remove(e)` | fshin |
| `iterator()` | për shtypje |

---

## 6. Filtrimi sipas llojit — `instanceof`

```java
// a e implementon interface-in?
if(vargu[i] instanceof Individi){
    Individi in = (Individi)vargu[i];
    System.out.println(in.getKualifikimin());
}

// a është lloj i caktuar?
if(vargu[i] instanceof Shoferi){ ... }
```
> `null instanceof X` → **false** gjithmonë. Prandaj `instanceof` s'ka nevojë për kontroll null.
> Kurse `((Shoferi)x).metoda()` pa `instanceof` → **ClassCastException**.

---

## 7. java.io — shablloni

```java
import java.io.*;

FileReader fr = new FileReader("in.txt");
BufferedReader br = new BufferedReader(fr);
FileWriter fw = new FileWriter("out.txt");

String rreshti;
int count = 0;
while((rreshti = br.readLine()) != null){
    count++;
    if(rreshti.contains("X")){ ... }
}
fw.write("Rezultati: " + count + "\n");

br.close();
fw.close();                                // MOS e harro, s'shkruhet file-i!
```

| Veprimi | Kodi |
|---|---|
| lexo rresht për rresht | `while((r = br.readLine()) != null)` |
| lexo char për char | `while((c = fr.read()) != -1)` |
| nr. i rreshtit | `LineNumberReader lnr = ...; lnr.getLineNumber()` |
| ndaj rreshtin | `String[] v = rreshti.split(";")` |
| a e përmban | `rreshti.contains("X")` |
| a fillon me | `rreshti.startsWith("X")` |
| gjatësia | `rreshti.length()` |
| numri i fjalëve | `rreshti.split(" ").length` |
| String → int | `Integer.parseInt(v[3])` |

---

## 8. Threads

```java
// Mënyra 1 — extend Thread
public class T extends Thread{
    public void run(){ ... }
}
T t = new T();
t.setPriority(Thread.MAX_PRIORITY);
t.start();                       // start(), JO run()!

// Mënyra 2 — implements Runnable
public class R implements Runnable{
    public void run(){ ... }
}
Thread t = new Thread(new R());
t.setPriority(Thread.NORM_PRIORITY);
t.start();
```

| Konstantja | Vlera |
|---|---|
| `Thread.MIN_PRIORITY` | 1 |
| `Thread.NORM_PRIORITY` | 5 |
| `Thread.MAX_PRIORITY` | 10 |

`Thread.sleep(ms)` → kërkon `try/catch(InterruptedException)`.

---

## 9. Radha e shkrimit në provim

```
1. XException          (3 rreshta,  mban 5 pikë)
2. interface-at        (2 rreshta,  mban 3 pikë)
3. klasa abstrakte bazë
4. nënklasat konkrete
5. klasa kontejner  <- këtu janë më së shumti pikë
6. main()  brenda try/catch
```

> Nëse mbetesh pa kohë: **shkruaj `main()` dhe kontejnerin**. Aty janë 35 nga 60 pikët.
