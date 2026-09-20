public class Dyqani {
    private String emri;
    private Pajisja[] pajisjet;
    private int index;

    public Dyqani(String emri, int nrP) {
        this.emri = emri;
        pajisjet = new Pajisja[nrP];
    }

    public boolean ekziston(Pajisja p) {
        for (int i = 0; i < index; i++) {
            if (pajisjet[i].equals(p)) {
                return true;
            }
        }
        return false;
    }

    public void shtoPajisjen(Pajisja p) {
        if (pajisjet.length == index) {
            System.out.println("Nuk ka vend");
            return;
        }
        if (ekziston(p)) {
            System.out.println("Ekziston");
            return;
        }
        pajisjet[index++] = p;
    }

    public void shtypPerdorimin(String p) {
        for (int i = 0; i < index; i++) {
            if (pajisjet[i].getPerdorimi().equals(p)) {
                System.out.println(pajisjet[i]);
            }
        }
    }

    public void shtypBateri(boolean b) {
        for (int i = 0; i < index; i++) {
            if (pajisjet[i].kaBateri() == b) {
                System.out.println(pajisjet[i]);
            }
        }
    }

    public Pajisja voltazhiMeIVogel(int v) {
        Pajisja temp = null;

        for (int i = 0; i < index; i++) {
            Pajisja p = pajisjet[i];
            if (p.getVoltazhi() <= v && (temp == null || p.getVoltazhi() < temp.getVoltazhi())) {
                temp = p;
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        Dyqani d = new Dyqani("ABC Shop", 50);

        Pajisja p1 = new Enelarsja(1, "Bosch", 220, 'A', 8);
        Pajisja p2 = new Enelarsja(2, "Samsung", 220, 'B', 6);
        Pajisja p3 = new MP3Player(3, "Sony", 5, 'A', 32);
        Pajisja p4 = new MP3Player(4, "Apple", 5, 'A', 64);

        d.shtoPajisjen(p1);
        d.shtoPajisjen(p2);
        d.shtoPajisjen(p3);
        d.shtoPajisjen(p4);

        System.out.println("Ekziston p1: " + d.ekziston(p1));

        System.out.println("\nPajisjet per perdorim 'Shtepiak':");
        d.shtypPerdorimin("Shtepiak");

        System.out.println("\nPajisjet me bateri:");
        d.shtypBateri(true);

        System.out.println("\nPajisja me voltazh me te vogel <= 220:");
        Pajisja min = d.voltazhiMeIVogel(220);
        System.out.println(min);
    }
}
