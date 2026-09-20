# Pyetja 4 — Kodi rreth paketës java.io (15 pikë)

Kodi i kompiluar dhe i testuar: `zgjidhja-provimi/FileNumero.java`

> **Binjaku i saktë i kësaj pyetjeje është detyra 8 e `I.O Streams.pdf` — `LineCounter`**
> (`ushtrime/00 - I.O Streams (detyra 8 LineCounter = pyetja 4).pdf`, zgjidhja te
> `zgjidhja-mesuesit/Detyrat I.O (Java 9)/LineCounter.java`). Krahaso:
>
> | | Detyra 8 (LineCounter) | Pyetja 4 (FileNumero) |
> |---|---|---|
> | numëro | totalin e rreshtave | totalin e rreshtave |
> | + kusht | gjatësi çift **dhe** përmban `SHK2` | gjatësi < 5 **dhe** përmban `UBT21` |
> | output | `<file> ka: <n> në total. <k> gjatesia...` | `File-i <file> ka: - ... <n> rreshta. - <k> gjatësia...` |
>
> Ndryshon vetëm kushti dhe emri i output file-it. `NumeroReshtat` (Ushtrime 8.pdf) është e ngjashme,
> por numëron vetëm një gjë dhe pranon dy emra file-ash — më larg nga provimi.

---

## Çka kërkon detyra

| Kërkesa | Zbatimi |
|---|---|
| Konstruktori pranon emrin e file-it `"fileName.txt"` | `public FileNumero(String emri) throws IOException` |
| Metoda `countReshtat()` | numëron rreshtat totalë + ata që plotësojnë kushtin |
| Output-i në `fileName_out.txt` | emri i input-it pa `.txt` + `_out.txt` |
| `main()` që krijon instancë dhe e thirr metodën | brenda `try/catch(IOException)` |

## Emri i output file-it — kurthi i vogël

```java
String output = emri.substring(0, emri.lastIndexOf(".")) + "_out.txt";
// "fileName.txt" -> "fileName" + "_out.txt" -> "fileName_out.txt"
```

## Zgjidhja

```java
import java.io.*;

public class FileNumero {
    private String emriFileit;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;

    public FileNumero(String emri) throws IOException{
        emriFileit = emri;
        fr = new FileReader(emri);
        br = new BufferedReader(fr);
        String output = emri.substring(0, emri.lastIndexOf(".")) + "_out.txt";
        fw = new FileWriter(output);
    }

    public void countReshtat() throws IOException{
        String rreshti;
        int totali = 0;
        int kushti = 0;

        while((rreshti = br.readLine()) != null){
            totali++;
            if(rreshti.length() < 5 && rreshti.contains("UBT21")){
                kushti++;
            }
        }

        fw.write("File-i " + emriFileit + " ka:\n");
        fw.write("\t- Ne file gjinden gjithesej " + totali + " rreshta.\n");
        fw.write("\t- " + kushti + " gjatesia e te cilave eshte me e vogel se 5 karaktere dhe e permbajne tekstin UBT21.\n");

        br.close();
        fw.close();
    }

    public static void main(String[] args) {
        try{
            FileNumero f = new FileNumero("fileName.txt");
            f.countReshtat();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
```

---

## ⚠ Kontradikta në tekstin e detyrës

Detyra kërkon rreshta *"gjatësia e të cilave është më e vogël se **5 karaktere** dhe
përmbajnë tekstin **UBT21**"*.

Por `"UBT21"` ka **saktësisht 5 karaktere**. Një rresht me gjatësi < 5 **nuk mund**
ta përmbajë kurrë → numëruesi del **gjithmonë 0**. (E testova — del 0.)

**Çka të bësh në provim:** shkruaje **saktësisht si e kërkon detyra** (`&&`, `< 5`).
Kodi është korrekt; kontradikta është e tekstit, jo e jotja. Nëse do siguri, shto
një koment një rresht:

```java
// Kushti sipas tekstit te detyres: length < 5 && contains("UBT21").
// Verejtje: "UBT21" ka 5 karaktere, prandaj ky kusht s'plotesohet kurre.
```

Variantet e mundshme nëse profesori e ka menduar ndryshe — **mos i shkruaj pa pyetur**:
- `rreshti.length() > 5 && rreshti.contains("UBT21")`
- `rreshti.split(" ").length < 5 && rreshti.contains("UBT21")`

---

## Gabimet që të kushtojnë pikë

| Gabimi | Pasoja |
|---|---|
| Harrohet `fw.close()` | file-i i output-it del **i zbrazët** |
| Harrohet `br.close()` | resurset s'lirohen (pikë e vogël, por merret) |
| Harrohet `throws IOException` | nuk kompilon |
| `main()` pa `try/catch` | nuk kompilon |
| Output-i shkruhet me `System.out` në vend të file-it | humb gjysmën e pikëve |
| Hardkodohet `"fileName_out.txt"` | detyra kërkon të ndërtohet nga emri i input-it |

## Shabllonet e tjera nga Java 9 (mund të bien në vend të kësaj)

Të gjitha gjenden të zgjidhura te `zgjidhja-mesuesit/Detyrat I.O (Java 9)/`:

| Detyra | Klasa e zgjidhur | Çka bën |
|---|---|---|
| numëro rreshtat me kusht | `LineCounter.java` | total + ata që plotësojnë kushtin |
| rreshtat që përmbajnë X | `LinesWithX.java` | `rreshti.contains("X")` |
| rreshti më i gjatë | `LineMaxChar.java` | `LineNumberReader` + `getLineNumber()` |
| fjala më e gjatë | `LineMaxWord.java` | `rreshti.split(" ")` |
| rreshti me më shumë fjalë | `LineMaxWords.java` | `split(" ").length` |
| numëro fjalën char-për-char | `Detyra1.java` | `fr.read()` |
| numëro fjalën me `indexOf` | `Detyra2.java` | `indexOf(fjala, index+len)` |
| me `finally` dhe `closeR()` | `Detyra3.java` | mbyllja e sigurt |
