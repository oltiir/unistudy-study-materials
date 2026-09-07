package Ushtrimi1;

public class EkipiOlimpik {

    private String emri;

    // Vargu ku ruhen sportistet. Tipi eshte Sportisti[] - jo Array[]!
    // java.lang.reflect.Array eshte dicka krejt tjeter (reflection), s'ka lidhje.
    private Sportisti[] sportistet;

    // Sa sportiste kemi REALISHT ne varg. sportistet.length na tregon vetem
    // sa vende ka gjithsej (25), jo sa jane te mbushura.
    // Rregulli qe mbajme: sportistet[0..numri-1] jane te mbushur, pjesa tjeter null.
    private int numri;

    // a) konstruktori: pranon emrin dhe numrin (maksimal) e sportisteve
    public EkipiOlimpik(String emri, int numriMaksimal) {
        this.emri = emri;
        this.sportistet = new Sportisti[numriMaksimal];
        this.numri = 0;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getNumri() {
        return numri;
    }

    // b) a eshte ky sportist pjese e ekipit?
    // Nje metode qe pergjigjet nje pyetjeje duhet ta KTHEJE pergjigjen (return),
    // jo ta shtype. Shtypja behet aty ku thirret metoda (shih main-in).
    public boolean ekziston(Sportisti s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < numri; i++) {
            if (sportistet[i].equals(s)) {
                return true; // e gjetem -> dalim menjehere
            }
        }
        return false; // e kaluam tere vargun dhe s'e gjetem
    }

    // c) shto sportistin nese nuk ekziston dhe ka vend
    // Kthejme boolean qe thirresi ta dije a u shtua apo jo.
    public boolean shtoSportistin(Sportisti s) {
        if (s == null) {
            return false;
        }
        if (numri == sportistet.length) {
            return false; // vargu eshte plot
        }
        if (ekziston(s)) {
            return false; // dublikat
        }
        sportistet[numri] = s;
        numri++;
        return true;
    }

    // d) shtyp sportistet e nje gjinie te caktuar
    public void shtypSipasGjinise(Gjinia gjinia) {
        System.out.println("Sportistet e gjinise " + gjinia.getPershkrimi() + ":");
        for (int i = 0; i < numri; i++) {
            if (sportistet[i].getGjinia() == gjinia) {
                System.out.println("   " + sportistet[i]);
            }
        }
    }

    // e) sportisti me i vjeter. Nese ka barazim, kthehet i pari.
    public Sportisti meIVjetri() {
        if (numri == 0) {
            return null; // ekip i zbrazet - s'ka cka te kthehet
        }
        Sportisti meIVjetri = sportistet[0];
        for (int i = 1; i < numri; i++) {
            // '>' rrept (jo '>=') e ben qe ne barazim te mbetet i pari i gjetur
            if (sportistet[i].getMosha() > meIVjetri.getMosha()) {
                meIVjetri = sportistet[i];
            }
        }
        return meIVjetri;
    }

    // f) kthen sportistet emri i te cileve fillon me nje string te caktuar
    // Meqe s'lejohen liste/ArrayList ne kete ushtrim, punojme me varg:
    // hapi 1 - numerojme sa jane, hapi 2 - krijojme vargun e sakte dhe e mbushim.
    public Sportisti[] ktheSipasEmrit(String fillimi) {
        if (fillimi == null) {
            return new Sportisti[0];
        }
        String kerkimi = fillimi.toLowerCase();

        int sa = 0;
        for (int i = 0; i < numri; i++) {
            if (sportistet[i].getEmri().toLowerCase().startsWith(kerkimi)) {
                sa++;
            }
        }

        Sportisti[] rezultati = new Sportisti[sa];
        int k = 0;
        for (int i = 0; i < numri; i++) {
            if (sportistet[i].getEmri().toLowerCase().startsWith(kerkimi)) {
                rezultati[k] = sportistet[i];
                k++;
            }
        }
        return rezultati;
    }

    // g) largo sportistin; kthen true nese u largua
    // "Hapesirat e zbrazeta": pasi e fshijme ne poziten i, i zhvendosim te gjithe
    // pas tij nje vend majtas, e fundit e bejme null dhe e ulim numrin.
    // Keshtu vargu mbetet gjithmone i mbushur nga fillimi, pa vrima ne mes.
    public boolean largoSportistin(Sportisti s) {
        if (s == null) {
            return false;
        }
        for (int i = 0; i < numri; i++) {
            if (sportistet[i].equals(s)) {
                for (int j = i; j < numri - 1; j++) {
                    sportistet[j] = sportistet[j + 1];
                }
                sportistet[numri - 1] = null;
                numri--;
                return true;
            }
        }
        return false;
    }

    // Ndihmese per testim - i shtyp te gjithe
    public void shtypTeGjithe() {
        System.out.println("Ekipi \"" + emri + "\" (" + numri + "/" + sportistet.length + "):");
        for (int i = 0; i < numri; i++) {
            System.out.println("   " + sportistet[i]);
        }
    }

    // h) main - testimi i te gjitha metodave
    public static void main(String[] args) {
        EkipiOlimpik ekipi = new EkipiOlimpik("Kosova Team", 25);

        Sportisti s1 = new Sportisti(1, "Majlinda", 33, Gjinia.F);
        Sportisti s2 = new Sportisti(2, "Distria", 24, Gjinia.F);
        Sportisti s3 = new Sportisti(3, "Akil", 27, Gjinia.M);
        Sportisti s4 = new Sportisti(4, "Nora", 33, Gjinia.F);
        Sportisti s5 = new Sportisti(5, "Driton", 19, Gjinia.M);
        Sportisti iPashtuar = new Sportisti(99, "Dardan", 21, Gjinia.M);

        // --- c) shtoSportistin ---
        System.out.println("=== c) shtoSportistin ===");
        System.out.println("s1 u shtua? " + ekipi.shtoSportistin(s1));
        System.out.println("s2 u shtua? " + ekipi.shtoSportistin(s2));
        System.out.println("s3 u shtua? " + ekipi.shtoSportistin(s3));
        System.out.println("s4 u shtua? " + ekipi.shtoSportistin(s4));
        System.out.println("s5 u shtua? " + ekipi.shtoSportistin(s5));
        // dublikat: id 1 ekziston tashme -> duhet false
        System.out.println("dublikat (id=1) u shtua? "
                + ekipi.shtoSportistin(new Sportisti(1, "Tjeter", 40, Gjinia.M)));
        System.out.println();
        ekipi.shtypTeGjithe();
        System.out.println();

        // --- b) ekziston ---
        System.out.println("=== b) ekziston ===");
        System.out.println("A ekziston s3?        " + ekipi.ekziston(s3));
        System.out.println("A ekziston iPashtuar? " + ekipi.ekziston(iPashtuar));
        System.out.println();

        // --- d) shtypSipasGjinise ---
        System.out.println("=== d) shtypSipasGjinise ===");
        ekipi.shtypSipasGjinise(Gjinia.F);
        ekipi.shtypSipasGjinise(Gjinia.M);
        System.out.println();

        // --- e) meIVjetri ---
        System.out.println("=== e) meIVjetri ===");
        // Majlinda dhe Nora jane te dyja 33 -> duhet te kthehet Majlinda (e para)
        System.out.println("Me i vjetri: " + ekipi.meIVjetri());
        System.out.println();

        // --- f) ktheSipasEmrit ---
        System.out.println("=== f) ktheSipasEmrit(\"D\") ===");
        Sportisti[] meD = ekipi.ktheSipasEmrit("D");
        System.out.println("U gjeten " + meD.length + ":");
        for (int i = 0; i < meD.length; i++) {
            System.out.println("   " + meD[i]);
        }
        System.out.println();

        // --- g) largoSportistin ---
        System.out.println("=== g) largoSportistin ===");
        System.out.println("U largua s2?        " + ekipi.largoSportistin(s2));
        System.out.println("U largua perseri s2? " + ekipi.largoSportistin(s2));
        System.out.println("U largua iPashtuar?  " + ekipi.largoSportistin(iPashtuar));
        System.out.println();
        // pas fshirjes s'duhet te kete vrima ne mes
        ekipi.shtypTeGjithe();
    }
}
