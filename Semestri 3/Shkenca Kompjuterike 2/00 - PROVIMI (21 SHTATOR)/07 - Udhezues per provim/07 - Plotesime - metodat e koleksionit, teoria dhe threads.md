# Plotësime: çka mungonte në fletët 00–06

Fletët 00–06 u kontrolluan: krejt kodi kompilon dhe ekzekutohet, output-et e analizimit të kodit dalin siç janë shkruar, çdo link funksionon. Kjo fletë shton vetëm atë që **nuk mbulohet** aty, por del rregullisht në fletët e ushtrimeve (Ushtrime 3, 9, 10, 11, Përsëritje) dhe në ligjëratën e threads.

---

## 1. Metodat "standarde" të koleksionit — 7 shabllone

Në çdo detyrë të madhe (`EkipiOlimpik`, `Dyqani`, `Biblioteka`, `Ndermarrja`, `Kinemaja`) profesori kërkon 4–6 metoda të kësaj forme. Emrat ndryshojnë, forma jo. Shembujt përdorin `Sportisti[] sportistet` (varg) ose `ArrayList<Sportisti> lista`; çdo qelizë e vargut mund të jetë `null`, prandaj tek vargu **gjithmonë** `s != null` para çdo thirrjeje.

| Fjalët në tekst | Shablloni | Tipi i kthimit |
|---|---|---|
| "shtyp X sipas parametrit" | lak + `if` + `println` | `void` |
| "kthen **të parin** që ..." | lak, `return` brenda `if`, `return null` në fund | objekti |
| "kthen **të fundit** që ..." | lak, ruaj në variabël, `return` pas lakut | objekti |
| "numëron / sa ..." | numërues lokal `int c = 0`, `c++` | `int` |
| "mesatarja e ..." | shuma + numëruesi, `(double) shuma / c` | `double` |
| "kthen sportistët që ..." | krijo koleksion të ri, mbushe, ktheje | `X[]` ose `ArrayList<X>` |
| "fshin ... dhe kthen sa u fshinë" | varg: zhvendosje majtas; lista: `Iterator.remove()` | `int` |

### 1.1 Shtyp sipas parametrit (Ushtrime 3: `shtypKaratistetMeTeRi`)

```java
public void shtypMeTeRi(int mosha) {
    for (Sportisti s : sportistet) {
        if (s != null && s.getMosha() < mosha) {
            System.out.println(s);
        }
    }
}
```

Nëse kërkohet vetëm një nënklasë ("shtyp **futbollistët** e një gjinie"), shto `s instanceof Futbollisti &&` para kushtit.

### 1.2 Kthe të parin (Përsëritje: `meNgjyra` kthen librin e parë)

```java
public Sportisti iPariIndividual() {
    for (Sportisti s : sportistet) {
        if (s != null && s.garonIndividualisht()) {
            return s;        // ndalet te i pari
        }
    }
    return null;             // s'u gjet asnjë
}
```

### 1.3 Kthe të fundit (Interface.pdf: `meIRiu` kthen sportistin **e fundit** më të ri se mosha)

```java
public Sportisti iFundiMeIRi(int mosha) {
    Sportisti rezultati = null;
    for (Sportisti s : sportistet) {
        if (s != null && s.getMosha() < mosha) {
            rezultati = s;   // mbishkruhet, mbetet i fundit
        }
    }
    return rezultati;
}
```

**Dallimi i parë/i fundit:** `return` brenda lakut = i pari; `return` pas lakut = i fundit.

### 1.4 Numëro dhe mesatare (Exceptions.pdf: `atletetAvgMosha`)

```java
public double mesatarjaMoshes() {
    int shuma = 0, c = 0;
    for (Sportisti s : sportistet) {
        if (s != null) { shuma += s.getMosha(); c++; }
    }
    return c == 0 ? 0 : (double) shuma / c;   // cast para pjesëtimit, jo pas
}

public Sportisti[] mbiMesatare() {
    double mes = mesatarjaMoshes();
    int n = 0;
    for (Sportisti s : sportistet) if (s != null && s.getMosha() > mes) n++;
    Sportisti[] r = new Sportisti[n];
    int k = 0;
    for (Sportisti s : sportistet) if (s != null && s.getMosha() > mes) r[k++] = s;
    return r;
}
```

`shuma / c` me dy `int` jep `int` (27.5 → 27). Cast-i `(double)` duhet **para** pjesëtimit.

### 1.5 Kthe koleksion të filtruar

Varg: numëro sa janë → krijo `new X[n]` → mbushe (dy lakë, si te `mbiMesatare` më lart). Lista: një lak.

```java
public ArrayList<Sportisti> ktheIndividualet(boolean individual) {
    ArrayList<Sportisti> r = new ArrayList<>();
    for (Sportisti s : lista) {
        if (s.garonIndividualisht() == individual) r.add(s);
    }
    return r;
}
```

### 1.6 Fshij nga vargu me zhvendosje (Ushtrime 3: `fshijSipasStilit`, "merruni me hapësirat e zbrazëta")

```java
public int fshijSipasStilit(String stili) {
    int fshire = 0;
    for (int i = 0; i < sportistet.length; i++) {
        if (sportistet[i] instanceof Karateisti
                && ((Karateisti) sportistet[i]).getStili().equals(stili)) {
            for (int j = i; j < sportistet.length - 1; j++) {
                sportistet[j] = sportistet[j + 1];   // zhvendos majtas
            }
            sportistet[sportistet.length - 1] = null;  // qeliza e fundit lirohet
            fshire++;
            i--;   // e njëjta pozitë kontrollohet prapë, se aty erdhi elementi tjetër
        }
    }
    return fshire;
}
```

Pa `i--` humb elementin që zhvendoset në pozitën `i`. Pa `= null` në fund, elementi i fundit dyfishohet.

### 1.7 Fshij nga ArrayList (Ushtrime 10: `fshijSportistin` fshin sportistët 30 vjeç)

```java
public int fshijMoshen(int mosha) {
    int c = 0;
    Iterator<Sportisti> it = lista.iterator();
    while (it.hasNext()) {
        if (it.next().getMosha() == mosha) {
            it.remove();   // e vetmja mënyrë e sigurt gjatë iterimit
            c++;
        }
    }
    return c;
}
```

`lista.remove(s)` brenda `for (Sportisti s : lista)` hedh `ConcurrentModificationException`. Ose përdor `Iterator.remove()`, ose `lista.removeIf(s -> s.getMosha() == mosha)`.

### 1.8 Shtypja me `Iterator` (kërkohet me emër te Ushtrime 10 dhe Përsëritje)

```java
import java.util.Iterator;

Iterator<Sportisti> it = lista.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

`it.next()` thirret **një herë** për çdo `hasNext()`. Nëse e thërret dy herë brenda lakut, kapërcen elemente.

### 1.9 `Vector` dhe `Enumeration` (Gara, Week 12 në Downloads)

`Vector<X>` = `ArrayList` i sinkronizuar (i sigurt për threads). Metodat `add`, `contains`, `size`, `get` janë të njëjta. Shtypja e vjetër bëhet me `Enumeration`:

```java
Enumeration<MjetiLevizes> e = mjete.elements();
while (e.hasMoreElements()) {
    System.out.println(e.nextElement());
}
```

Detyra e Vrapimit thotë "ArrayList **ose** Vector"; zgjidh `ArrayList` nëse s'kërkohet ndryshe.

---

## 2. Lexim objektesh nga file dhe shtim në koleksion (Përsëritje 1.5.d)

Kjo është kombinimi i files me hierarkinë: `lexoLibrat()` lexon rreshta `LibriShkollor;12345;Java 1;2001;SHKI 1` dhe krijon objektin sipas fushës së parë.

```java
public void lexoLibrat() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(fileIn));
    String rreshti;
    while ((rreshti = br.readLine()) != null) {
        String[] p = rreshti.split(";");
        if (p.length < 5) continue;                 // rresht i paplotë, kapërce
        try {
            int viti = Integer.parseInt(p[3]);
            if (p[0].equals("LibriShkollor")) {
                shtoLibrin(new LibriShkollor(p[1], p[2], viti, p[4]));
            } else if (p[0].equals("Enciklopedia")) {
                shtoLibrin(new Enciklopedia(p[1], p[2], viti, Integer.parseInt(p[4])));
            }
        } catch (LibriException | NumberFormatException e) {
            System.out.println("Rresht i gabuar: " + rreshti + " -> " + e.getMessage());
        }
    }
    br.close();
}
```

Katër hapa: `split(";")` → kontrollo `length` → `parseInt` numrat → `new Nënklasa(...)` sipas `p[0]`. Exception-i kapet **brenda** lakut, që një rresht i gabuar të mos e ndalë leximin e të tjerëve.

Shkrimi i të gjithë librave në file (`shkruajLibrat`): hap `FileWriter` **një herë** para lakut, `fw.write(l.toString() + "\n")` për secilin, `fw.close()` pas lakut.

---

## 3. Teoria që s'është në fletën 05, por është në ligjërata

### 3.1 Modifikuesit e qasjes

| | e njëjta klasë | e njëjta paketë | nënklasa (paketë tjetër) | kudo |
|---|:-:|:-:|:-:|:-:|
| `private` | ✓ | | | |
| *(pa fjalë, default)* | ✓ | ✓ | | |
| `protected` | ✓ | ✓ | ✓ | |
| `public` | ✓ | ✓ | ✓ | ✓ |

Prandaj `Shfaqja` në testin e fundit kërkon `protected`: nënklasat `Filmi`/`Koncerti` i lexojnë atributet drejtpërdrejt. Me `private` do të duhej `getTitulli()` edhe brenda `Filmi`.

### 3.2 Checked kundrejt unchecked exception

| | Checked | Unchecked |
|---|---|---|
| Trashëgon | `Exception` (jo `RuntimeException`) | `RuntimeException` |
| Kompajleri | **detyron** `throws` ose `try/catch` | nuk kërkon asgjë |
| Shembuj | `IOException`, `ShfaqjaException`, `PunetoriException` | `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ClassCastException`, `NumberFormatException`, `IllegalThreadStateException` |

Kjo shpjegon pse `pjesto(7, 0)` në analizimin e kodit s'ka `throws` në nënshkrim (`ArithmeticException` është unchecked), ndërsa `new Filmi(...)` duhet të jetë në `try` (`ShfaqjaException extends Exception` është checked).

### 3.3 `final` — tri kuptime

| Ku | Kuptimi |
|---|---|
| variabël/atribut `final` | vlera caktohet një herë (konstruktor ose deklarim); modeli i **readonly** |
| metodë `final` | nënklasa **s'mund** ta mbishkruajë |
| klasë `final` | **s'mund** të ketë nënklasa (p.sh. `String`) |

`abstract` dhe `final` në të njëjtën klasë ose metodë = gabim kompilimi (njëra kërkon nënklasë, tjetra e ndalon).

### 3.4 Rregullat e overriding-ut

- I njëjti emër, **të njëjtat parametra**; tipi i kthimit i njëjti ose nëntip.
- Qasja **s'mund të ngushtohet**: metoda `public` e prindit s'bëhet `protected` te fëmija.
- Metodat `static`, `private` dhe `final` **nuk** mbishkruhen. `static` me të njëjtin nënshkrim vetëm fshihet (method hiding).
- Metoda e interface është `public abstract` edhe pa fjalët; implementimi **duhet** `public`. Gabimi klasik: `String getKualifikimin()` pa `public` te `Menaxheri` nuk kompilon.

### 3.5 `this` kundrejt `super`

| | `this` | `super` |
|---|---|---|
| si referencë | objekti aktual: `this.emri = emri` | anëtari i prindit: `super.toString()` |
| si thirrje konstruktori | tjetër konstruktor i **së njëjtës** klasë: `this(emri, 18)` | konstruktori i **prindit**: `super(emri, mosha)` |

Të dyja si thirrje konstruktori duhen **rreshti i parë**; s'mund t'i kesh të dyja në të njëjtin konstruktor.

### 3.6 Rendi i ekzekutimit kur krijohet një objekt nënklase

```
1. blloqet static të prindit         (vetëm herën e parë)
2. blloqet static të fëmijës         (vetëm herën e parë)
3. blloku inicializues i prindit
4. konstruktori i prindit
5. blloku inicializues i fëmijës
6. konstruktori i fëmijës
```

Prindi përfundon plotësisht para se të fillojë fëmija. Kjo është pyetja tipike "çka shtyp ky kod" me `static {}`, `{}` dhe konstruktorë; shembulli me output i ke te `../02 - Pyetje Teorike (12p)/pergjigjet.md`, pyetja 2.

### 3.7 Interface: çka mund të ketë (Java 8+)

- metoda abstrakte (pa trup, `public abstract` nënkuptohet);
- metoda `default` me trup, që klasa e merr gati dhe **mund** ta mbishkruajë (`Botohet.eshteMeNgjyra()` "supozoni se librat janë me ngjyra" → `default boolean eshteMeNgjyra() { return true; }`, `LibriShkollor` e mbishkruan me `false`);
- metoda `static` me trup, thirren me `Interface.metoda()`, **nuk** trashëgohen/mbishkruhen;
- konstante `public static final` (çdo fushë në interface është e tillë automatikisht);
- **jo** konstruktor, **jo** atribute të instancës.

Një interface mund të bëjë `extends` një interface tjetër. Një klasë abstrakte mund të implementojë një interface **pa** i dhënë trup metodave; borxhi kalon te nënklasa konkrete (pyetja 2 e provimit shembull, 4 pikë).

### 3.8 Klasë abstrakte pa metoda abstrakte

Lejohet. Përdoret kur s'do që klasa të instancohet, por s'ke metodë që duhet të mbetet pa trup. E kundërta jo: një metodë abstrakte e **detyron** klasën të jetë abstrakte.

---

## 4. Threads: termat nga ligjërata që mungojnë te fleta 04

Testi i fundit kishte 15 pikë koncepte, me pyetje edhe për threads. Këta janë termat e ligjëratës (`05 - Threads (9p)/ushtrime/01 - Ligjerata Threads (teoria).pdf`) që s'janë te 04:

| Termi | Në një fjali |
|---|---|
| **Procesi** | Program në ekzekutim me memorien e vet; JVM-ja zakonisht është një proces. |
| **Thread** | "Proces i lehtë" brenda procesit; ndan memorien dhe file-t e hapur me threads e tjerë; krijohet më lirë se procesi. |
| **Main thread** | Çdo program nis me një thread; `main` e ka aftësinë të krijojë të tjerë. |
| **`Thread.sleep(ms)`** | Pauzon thread-in aktual; hedh `InterruptedException` (checked) → duhet `try/catch`. |
| **`t.join()`** | Thread-i aktual pret derisa `t` të përfundojë. Përdoret në `main` kur duhet rezultati i thread-ave. |
| **`synchronized`** | Vetëm një thread në një kohë e ekzekuton metodën/bllokun mbi të njëjtin objekt; parandalon **thread interference**. |
| **Thread interference** | Dy threads ndryshojnë të njëjtën variabël njëkohësisht dhe humbin ndryshime (p.sh. `numri++` nga dy threads nuk jep gjithmonë 2000). |
| **Memory consistency error** | Një thread s'e sheh vlerën e re që e vendosi thread-i tjetër. |
| **Thread contention** | Threads garojnë për të njëjtin burim të sinkronizuar dhe ngadalësohen. |
| **Starvation** | Një thread s'e merr kurrë burimin, sepse threads "lakmitarë" e mbajnë të zënë. |
| **Livelock** | Threads reagojnë vazhdimisht ndaj njëri-tjetrit dhe asnjëri s'përparon (pa u bllokuar). |
| **`wait()` / `notify()` / `notifyAll()`** | Thirren brenda `synchronized`: `wait()` e vë thread-in në pritje mbi objektin; `notify()` zgjon **një** thread të rastit; `notifyAll()` i zgjon të gjithë. |
| **`Thread.currentThread()`** | Referenca te thread-i që po ekzekutohet; `getName()`, `getPriority()`. |
| **Prioriteti trashëgohet** | Thread-i i ri e merr prioritetin e thread-it që e krijoi (normalisht 5). |

### Shembulli minimal i `synchronized` dhe `join()`

```java
class Numeruesi implements Runnable {
    int numri = 0;
    public synchronized void rrit() { numri++; }   // pa synchronized: rezultat i paparashikueshëm
    public void run() { for (int i = 0; i < 1000; i++) rrit(); }
}

Numeruesi n = new Numeruesi();
Thread t1 = new Thread(n), t2 = new Thread(n);   // i njëjti objekt, dy threads
t1.start(); t2.start();
t1.join(); t2.join();                             // main pret të dyja
System.out.println(n.numri);                      // 2000, garantuar vetëm me synchronized
```

`join()` hedh `InterruptedException`, prandaj ose `throws` te `main`, ose `try/catch`.

### Pyetje të mundshme me përgjigje të shkurtër

1. Pse `Runnable` në vend të `extends Thread`? Sepse klasa tashmë trashëgon diçka (p.sh. `Vrapuesi extends Atleti`), dhe sepse ndan **punën** nga **mekanizmi**.
2. Çka ndodh me `t.start(); t.start();`? `IllegalThreadStateException`.
3. Pse `numri++` nga dy threads s'jep 2000 pa `synchronized`? Sepse lexim–rritje–shkrim janë tri hapa dhe threads mund të ndërthuren mes tyre.
4. A garanton `MAX_PRIORITY` që thread-i përfundon i pari? Jo, është vetëm sugjerim për scheduler-in.
5. `sleep()` e cilit thread? Gjithmonë të **aktualit**; s'mund të "vësh në gjumë" një thread tjetër.

---

## 5. Një ndryshim i vogël te `Filmi` (fleta 02)

Te 02, `Filmi.vleresimi` nuk validohet, me arsyetimin që fotoja s'jep interval. Rregulli hyrës i **çdo** fletë ushtrimesh dhe i provimit shembull (pika m) thotë: "numrat pozitivë ose jo negativë, përndryshe exception specifik". Një validim që s'kërkohej nuk të heq pikë; një validim që kërkohej dhe mungon të heq. Prandaj në 02 është shtuar:

```java
if (vleresimi < 0) {
    throw new ShfaqjaException("Vleresimi nuk mund te jete negativ!");
}
```

Nëse teksti i provimit jep interval (p.sh. 1–10), shkruaj atë: `if (vleresimi < 1 || vleresimi > 10) throw ...`.
