# Files (`java.io`): kur përdoret cila klasë dhe cila metodë

Kjo pjesë është **15 pikë në provimin shembull**: `FileNumero`. Në gjashtë fotot e testit të fundit nuk shihet detyrë files, por formati i provimit të ardhshëm mund të ndryshojë.

## 1. Pamja e përgjithshme

```text
emri i input-it → FileReader → BufferedReader.readLine() → numërim/kusht
                                                   ↓
emri i output-it → FileWriter.write(...) ← tekst i formatuar
```

| Nevoja | Mjeti | Metoda |
|---|---|---|
| Lexo rresht pas rreshti | `BufferedReader` mbi `FileReader` | `readLine()` kthen `String` ose `null` në fund |
| Lexo karakter pas karakteri | `FileReader` | `read()` kthen `int` ose `-1` në fund |
| Shkruaj tekst në file | `FileWriter` | `write(String)` |
| Nxirr tekstin e gabimit | `IOException e` | `e.getMessage()` |
| Mbyll file-t | `try (...) {}` | mbyllen automatikisht në fund |

**Pse `BufferedReader`?** `FileReader` i jep karakteret; `BufferedReader` shton `readLine()`, që e bën detyrën e rreshtave shumë më të lehtë. `FileWriter` hap file-in e daljes dhe `write()` shkruan tekstin. Me `new FileWriter(path)` pa `append`, përmbajtja e vjetër e output-it zëvendësohet.

## 2. Detyra e vjetër `FileNumero`: zgjidhje e plotë

Teksti kërkon: konstruktori merr `"fileName.txt"`; `countReshtat()` numëron **të gjithë** rreshtat dhe ata që kanë gjatësi `< 5` **dhe** përmbajnë `"UBT21"`; rezultati shkruhet në `fileName_out.txt`; `main` krijon objektin dhe thërret metodën.

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileNumero {
    private final String emriFileit;

    public FileNumero(String emriFileit) {
        this.emriFileit = emriFileit;
    }

    public void countReshtat() throws IOException {
        int pika = emriFileit.lastIndexOf('.');
        String baza = pika >= 0 ? emriFileit.substring(0, pika) : emriFileit;
        String emriDaljes = baza + "_out.txt";

        int total = 0;
        int meKusht = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(emriFileit));
             FileWriter fw = new FileWriter(emriDaljes)) {
            String rreshti;
            while ((rreshti = br.readLine()) != null) {
                total++;
                if (rreshti.length() < 5 && rreshti.contains("UBT21")) {
                    meKusht++;
                }
            }

            fw.write("File-i " + emriFileit + " ka:\n");
            fw.write("\t- Ne file gjinden gjithesej " + total + " rreshta.\n");
            fw.write("\t- " + meKusht
                    + " gjatesia e te cilave eshte me e vogel se 5 karaktere"
                    + " dhe e permbajne tekstin UBT21.\n");
        }
    }

    public static void main(String[] args) {
        try {
            FileNumero f = new FileNumero("fileName.txt");
            f.countReshtat();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

**Pse vetëm `emriFileit` është atribut?** Ai merret në konstruktor dhe përdoret më vonë te `countReshtat()`. `total`, `meKusht`, `rreshti`, `br`, `fw` duhen vetëm gjatë një thirrjeje, prandaj janë variabla lokale. Kjo shmang file të hapur gjatë gjithë jetës së objektit.

### Kurthi i tekstit

`"UBT21"` ka **5 karaktere**. Një rresht me `length() < 5` nuk mund ta përmbajë. Prandaj `meKusht` del **gjithmonë 0**. Prapëseprapë kushti i kodit duhet të jetë **si në tekst**: `< 5 && contains("UBT21")`. Ndryshimi i tij në `< 6` ose `<= 5` nuk e zgjidh detyrën e dhënë.

## 3. Ushtrimi binjak: `LineCounter` te Week 9, detyra 8

PDF-ja `I.O Streams.pdf` kërkon të numërohen të gjithë rreshtat dhe rreshtat me gjatësi **çift** që përmbajnë `SHK2` (case sensitive). Ndryshon vetëm kushti:

```java
if (rreshti.length() % 2 == 0 && rreshti.contains("SHK2")) {
    meKusht++;
}
```

Pjesa tjetër është i njëjti model: `readLine()` → dy numërues → `write()` → mbyllja. Në një variant të vjetër të kodit te `/Downloads/Ushtrime SHK2/Java 9 real/LineCounter.java` përdoret `"SHK1"`; **PDF-ja thotë `"SHK2"`**. Në provim ndiq tekstin e pyetjes.

## 4. Metodat e `String` që bien shpesh

| Kërkesa | Kod | Shembull |
|---|---|---|
| “fillon me X” | `rreshti.startsWith("X")` | `"Xabc"` → true |
| “përmban UBT21” | `rreshti.contains("UBT21")` | `"xxUBT21"` → true |
| “gjatësia nën 5” | `rreshti.length() < 5` | `"ABCD"` → true |
| “gjatësi çift” | `rreshti.length() % 2 == 0` | `"ABCD"` → true |
| “ndaj fushat me ;” | `String[] pjese = rreshti.split(";")` | `"Film;A;120"` → 3 pjesë |
| `String` në `int` | `Integer.parseInt(pjese[2])` | `"120"` → 120 |
| krahaso llojin e lexuar | `pjese[0].equals("Film")` | Mos përdor `==` për përmbajtjen e String. |

Nëse lexon objekte nga file: kontrollo sa pjesë dha `split`, kthe numrat me `parseInt`, krijo objektin `new Filmi(...)`/`new Libri...(...)`, pastaj shtoje në koleksion. `NumberFormatException` mund të dalë nëse teksti s'është numër.

## 5. `throws IOException`, `try/catch` dhe mbyllja

`readLine()` dhe `write()` mund të hedhin `IOException`. Një metodë mund ta deklarojë:

```java
public void countReshtat() throws IOException { ... }
```

Thirrësi e kap:

```java
try {
    f.countReshtat();
} catch (IOException e) {
    System.out.println(e.getMessage());
}
```

`try (BufferedReader br = ...; FileWriter fw = ...)` i mbyll automatikisht edhe kur del exception. Nëse përdor stilin e ligjëratës me hapje manuale, duhet `br.close()` dhe `fw.close()`; nëse harron `fw.close()`, shkrimi mund të mos përfundojë në file. `System.out.println()` shtyp në konzolë, **nuk** e krijon output file-in.

## 6. Gabime që i kushtojnë pikët shpejt

- `while (br.readLine() != null)` dhe pastaj një `readLine()` tjetër brenda: humb çdo rresht të dytë. Ruaje një herë: `while ((r = br.readLine()) != null)`.
- Kushti i gabuar `||` kur kërkohen **të dyja** vetitë. Për “gjatësi çift **dhe** përmban SHK2” duhet `&&`.
- `String` krahasohet me `==`; përdor `.equals(...)`, `.contains(...)` ose `.startsWith(...)` sipas kërkesës.
- Output file i fiksuar kur detyra kërkon emër nga input-i; për `fileName.txt`, dalja duhet `fileName_out.txt`.
- E hap `FileWriter` brenda lakut për çdo rresht: e mbishkruan file-in vazhdimisht. Hape para lakut, shkruaj rezultatet pas numërimit.

## Provoje vetë në 60 sekonda

Për `"ABCD"`, `"UBT21"`, `"XUBT21"`, çka del nga kushti `< 5 && contains("UBT21")`? **Asnjë rresht**. Sa është numri total? **3**. Kjo ta tregon pse dy numëruesit duhet të jenë të ndarë.
