# Threads: dy teste, një model i shkurtër

Në provimin shembull threads janë **9 pikë** (4 teori + 5 kod). Në testin e fundit në foto është një pyetje kodi **5 pikë**. Të dyja kërkojnë të kuptosh `run()`, `start()` dhe prioritetet.

## 1. Çka është një thread?

Thread është një rrjedhë ekzekutimi brenda programit. `main` është një thread; me `start()` krijon një tjetër që e ekzekuton `run()` e vet. Rendi i rreshtave të shtypur nga dy threads **nuk është i garantuar**.

```java
ShfaqjaThread t = new ShfaqjaThread("Salla-1");
t.start(); // nis thread të ri; JVM pastaj thërret run()
t.run();   // thirrje normale metode në thread-in aktual; nuk nis thread të ri
```

**Mos i thirr të dyja si sipër në një zgjidhje**; kjo është vetëm për të treguar dallimin.

## 2. Testi i fundit: `ShfaqjaThread`, 5 pikë

Fotoja jep klasën `ShfaqjaThread extends Thread` dhe kërkon dy instanca me emrat `"Salla-1"`, `"Salla-2"`; të parës `MAX_PRIORITY`, të dytës `MIN_PRIORITY`; pastaj të dyja nisen me `start()`.

```java
public class ShfaqjaThread extends Thread {
    private final String emri;

    public ShfaqjaThread(String emri) {
        this.emri = emri;
    }

    @Override
    public void run() {
        System.out.println(emri + " - Prioriteti: " + getPriority());
    }

    public static void main(String[] args) {
        ShfaqjaThread ePara = new ShfaqjaThread("Salla-1");
        ShfaqjaThread eDyta = new ShfaqjaThread("Salla-2");

        ePara.setPriority(Thread.MAX_PRIORITY); // 10
        eDyta.setPriority(Thread.MIN_PRIORITY); // 1

        ePara.start();
        eDyta.start();
    }
}
```

**Emri është atribut** sepse jepet në konstruktor dhe duhet më vonë te `run()`. Prioritetin s'ke nevojë ta ruash në atribut tjetër: `Thread` tashmë e ruan; përdor `setPriority()` dhe `getPriority()`.

Dy rreshtat mund të dalin në cilëndo renditje. Prioriteti 10 **nuk premton** që `Salla-1` shtypet para `Salla-2`.

## 3. Provimi shembull: `OurThread`, 5 pikë kod

Kërkesa është pothuajse e njëjtë, por prioritetet janë **normal** për të parin dhe **maksimal** për të dytin:

```java
OurThread t1 = new OurThread();
OurThread t2 = new OurThread();
t1.setPriority(Thread.NORM_PRIORITY); // 5
t2.setPriority(Thread.MAX_PRIORITY);  // 10
t1.start();
t2.start();
```

Ky kod presupozon që `OurThread extends Thread`, si te [zgjidhja në repo](<../05 - Threads (9p)/zgjidhja-provimi/OurThread.java>). Nëse `OurThread` ka konstruktor me parametër, jepi atë te `new OurThread(...)`; sintaksa e konstruktorit duhet të përputhet me klasën e dhënë.

## 4. Dy mënyra për ta përcaktuar punën e thread-it

| Mënyra | Kodi | Kur përdoret |
|---|---|---|
| `extends Thread` | klasa trashëgon `Thread`, override `run()`, objekti thërret `start()` | Kur klasa s'ka nevojë të trashëgojë një klasë tjetër; si dy testet. |
| `implements Runnable` | klasa implementon `run()`, pastaj `new Thread(new Detyra()).start()` | Kur klasa tashmë bën `extends` diçka tjetër ose do ta ndash detyrën nga objekti Thread. |

```java
class Detyra implements Runnable {
    @Override
    public void run() {
        System.out.println("Po punon");
    }
}

Thread t = new Thread(new Detyra());
t.start();
```

`Runnable` **nuk** ka `setPriority()` ose `start()`; këto i thërret te objekti `Thread` që e mbështjell. Java lejon vetëm një `extends`, prandaj `Vrapuesi extends Atleti implements Runnable` është model i rëndësishëm nga Week 11.

## 5. Konstantet dhe pyetjet e shpejta

| Konstantja | Vlera |
|---|---:|
| `Thread.MIN_PRIORITY` | 1 |
| `Thread.NORM_PRIORITY` | 5 |
| `Thread.MAX_PRIORITY` | 10 |

- `t.setPriority(...)` cakton prioritetin; `t.getPriority()` e lexon.
- `t.start()` thirret **vetëm një herë** për të njëjtin objekt. Thirrja e dytë hedh `IllegalThreadStateException` — kjo është pyetje direkte e testit të fundit.
- `t.run()` mund të thirret si metodë, por **nuk nis thread të ri**. Për testin përdor `start()`.
- Prioriteti është udhëzim për scheduler-in, **jo garanci renditjeje**.
- `Thread.sleep(ms)` e ndal përkohësisht thread-in aktual dhe kërkon trajtim të `InterruptedException`:

```java
try {
    Thread.sleep(100);
} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
}
```

## 6. Përgjigjja e teorisë së provimit të vjetër

**“Cilat janë dy mënyrat dhe pse?”** `extends Thread` dhe `implements Runnable`. E dyta nevojitet sidomos kur klasa ka tashmë një superklasë, sepse Java nuk lejon dy `extends`; gjithashtu ndan kodin e punës nga kontrolli i thread-it.

**“Çka janë MAX/MIN?”** Konstante të `Thread` për prioritetin 10 dhe 1. `NORM_PRIORITY` është 5. Asnjëra nuk garanton cilin thread e sheh të parin në output.

## Kontrollo veten

1. `t.start(); t.start();` → `IllegalThreadStateException` në thirrjen e dytë.
2. `t.run();` → metodë normale, nuk krijon thread të ri.
3. `new Thread(new Detyra()).start()` → mënyra `Runnable`.
4. Dy threads me prioritete 10 dhe 1 → output-i mund të dalë në cilëndo renditje.
