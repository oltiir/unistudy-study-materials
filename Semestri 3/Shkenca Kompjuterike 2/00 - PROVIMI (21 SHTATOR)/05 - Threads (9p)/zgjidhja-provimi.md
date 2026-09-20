# Pyetja 5 — Threads dhe Concurrency control (9 pikë)

Kodi i kompiluar dhe i testuar: `zgjidhja-provimi/`

---

## (a) Pyetje teorike — 2 + 2 pikë

### i. Cilat janë dy mënyrat për të krijuar një Thread dhe pse ofrohen dy?

**Dy mënyrat:**

1. **`extends Thread`** — klasa e trashëgon `Thread` dhe e rishkruan `run()`.
```java
public class OurThread extends Thread{
    public void run(){ ... }
}
OurThread t = new OurThread();
t.start();
```

2. **`implements Runnable`** — klasa e implementon `Runnable`, objekti i jepet konstruktorit të `Thread`.
```java
public class OurThread implements Runnable{
    public void run(){ ... }
}
Thread t = new Thread(new OurThread());
t.start();
```

**Pse ofrohen dy?**

- Java lejon **vetëm një `extends`**. Nëse klasa jote tashmë trashëgon një klasë tjetër
  (p.sh. `Vrapuesi extends Atleti`), **nuk** mund të bëjë edhe `extends Thread`.
  `Runnable` është interface → mund të shtohet gjithmonë.
- `Runnable` e **ndan detyrën nga mekanizmi i ekzekutimit** — i njëjti `Runnable`
  mund t'i jepet shumë thread-ave ose një thread pool-i.
- Vetë `Thread` e implementon `Runnable`, por `run()` e saj nuk bën asgjë.

> **Shembulli nga lënda:** `Vrapuesi extends Atleti implements Runnable` —
> pikërisht sepse `Vrapuesi` tashmë trashëgon `Atleti`, s'mund të bëjë `extends Thread`.

### ii. Çka nënkuptoni me "MAX_PRIORITY" dhe "MIN_PRIORITY"?

Janë **konstante `public static final int`** të klasës `Thread` që e caktojnë
prioritetin e një thread-i:

| Konstantja | Vlera |
|---|---|
| `Thread.MIN_PRIORITY` | **1** |
| `Thread.NORM_PRIORITY` | **5** (default) |
| `Thread.MAX_PRIORITY` | **10** |

- Caktohen me `t.setPriority(Thread.MAX_PRIORITY)`, lexohen me `t.getPriority()`.
- Prioriteti është vetëm një **sugjerim për scheduler-in** e JVM-së / sistemit operativ:
  thread-i me prioritet më të lartë ka **gjasa më të mëdha** të marrë CPU më shpesh,
  **por nuk ka garanci** për radhën e ekzekutimit.
- Një thread e trashëgon prioritetin e thread-it që e krijoi.
- Vlerë jashtë intervalit 1–10 → `IllegalArgumentException`.

---

## (b) Kodi rreth Thread-ave — 5 pikë

> *"Në metodën main krijoni dy instanca të klasës OurThread, ku instancës së parë i caktoni
> prioritet normal, ndërsa instancës së dytë i caktoni prioritet maksimal dhe në fund
> startoni këto dy instanca."*

```java
public static void main(String[] args) {
    OurThread t1 = new OurThread();
    OurThread t2 = new OurThread();

    t1.setPriority(Thread.NORM_PRIORITY);   // 5
    t2.setPriority(Thread.MAX_PRIORITY);    // 10

    t1.start();
    t2.start();
}
```

Kaq. Katër hapa: **krijo 2 → cakto prioritetet → start() → start()**.

- Mund të shkruash edhe `t1.setPriority(5)` dhe `t2.setPriority(10)`, por
  **konstantet janë më të sigurta** dhe tregojnë se e di emrin e tyre.
- Nëse `OurThread` **implementon `Runnable`**, prioriteti i caktohet objektit `Thread`:
```java
Thread t1 = new Thread(new OurThread());
Thread t2 = new Thread(new OurThread());
t1.setPriority(Thread.NORM_PRIORITY);
t2.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
```
Të dyja variantet i ke të shkruara te `zgjidhja-provimi/`.

---

## Gabimet që të kushtojnë pikë

| Gabimi | Pasoja |
|---|---|
| Thirret **`run()`** në vend të **`start()`** | s'krijohet thread i ri — ekzekutohet si metodë normale |
| `setPriority()` pas `start()` | funksionon, por është vonë — cakto para |
| `Thread.sleep()` pa `try/catch` | nuk kompilon (`InterruptedException`) |
| Thuhet se prioriteti **garanton** radhën | pikë e humbur — është vetëm sugjerim |
| MAX = 5, MIN = 0 | vlerat janë **10** dhe **1** |

---

## Nga lënda — `Vrapimi` (Java 11)

Zgjidhja e mësuesit te `zgjidhja-mesuesit/Vrapimi (Java 11)/` e tregon modelin e plotë:

```java
public class Vrapuesi extends Atleti implements Runnable{   // dy trashëgimi njëherësh
    public void run(){
        Random r = new Random();
        while(getDistanca() < getGjatesiaEPistes()){
            garo();
            try{
                Thread.sleep(r.nextInt(0,300));
            }catch(Exception e){ e.printStackTrace(); }
        }
    }
}
```
```java
public void filloGaren(){
    Iterator<Atleti> itr = atletet.iterator();
    while(itr.hasNext()){
        Vrapuesi v = (Vrapuesi)itr.next();
        Thread th = new Thread(v);              // Runnable -> Thread
        if(v.getNrMedaljeve() > 3){
            th.setPriority(10);                 // MAX_PRIORITY
        }
        th.start();
    }
}
```
