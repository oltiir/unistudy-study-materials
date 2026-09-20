package Ushtrimi1;

public enum Gjinia {
    // Cdo vlere e enum-it mban edhe nje pershkrim per shtypje.
    // Kjo eshte me e paster se te shkruash (gjinia == Gjinia.M ? "mashkull" : "femer")
    // ne cdo vend qe na duhet teksti.
    M("mashkull"),
    F("femer");

    private final String pershkrimi;

    // Konstruktori i enum-it - thirret automatikisht per M dhe F me lart.. 
    Gjinia(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }
}
