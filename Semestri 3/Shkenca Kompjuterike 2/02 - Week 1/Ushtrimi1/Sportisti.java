package Ushtrimi1;

public class Sportisti {

    // 1.1 - atributet.
    // id eshte [readonly] => 'final' (caktohet vetem njehere, ne konstruktor)
    // dhe nuk i bejme setter. Atributet jane 'private' - enkapsulim:
    // bota e jashtme i prek vetem permes get/set.
    private final int id;
    private String emri;
    private int mosha;
    private Gjinia gjinia;

    // a) konstruktori qe pranon te kater parametrat
    public Sportisti(int id, String emri, int mosha, Gjinia gjinia) {
        this.id = id;
        this.emri = emri;
        this.mosha = mosha;
        this.gjinia = gjinia;
    }

    // b) get / set
    // Vini re: NUK ka setId(), sepse id eshte readonly.
    public int getId() {
        return id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public Gjinia getGjinia() {
        return gjinia;
    }

    public void setGjinia(Gjinia gjinia) {
        this.gjinia = gjinia;
    }

    // c) formati i kerkuar:  <id> : <emri> <mashkull / femer> <mosha> vjec
    @Override
    public String toString() {
        return id + " : " + emri + " " + gjinia.getPershkrimi() + " " + mosha + " vjec";
    }

    // d) dy sportiste jane te njejte nese kane id te njejte
    public boolean equals(Sportisti s) {
        if (s == null) {
            return false;
        }
        return this.id == s.id;
    }
}
