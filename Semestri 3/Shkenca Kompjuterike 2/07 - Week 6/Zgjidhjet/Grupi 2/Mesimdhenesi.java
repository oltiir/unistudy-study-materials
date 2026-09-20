public abstract class Mesimdhenesi {
    public String emri; //readonly
    public int vitiLindjes;
    public String angazhimi;

    public void setVitiLindjes(int vitiLindjes) {
        this.vitiLindjes = vitiLindjes;
    }
    public void setAngazhimi(String angazhimi) {
        this.angazhimi = angazhimi;
    }
    public String getEmri() {
        return emri;
    }
    public int getVitiLindjes() {
        return vitiLindjes;
    }
    public String getAngazhimi() {
        return angazhimi;
    }
    public abstract boolean mentoron();

    public Mesimdhenesi(String emri, int vitiLindjes, String angazhimi) {
        this.emri = emri;
        this.vitiLindjes = vitiLindjes;
        this.angazhimi = angazhimi;
    }
    
    public String toString(){
        //<emri> : < vitiLindjes > angazhohet ne <angazhimi>
        return emri + " : " + vitiLindjes + " angazhohet ne " + angazhimi; 
    }
    
}
