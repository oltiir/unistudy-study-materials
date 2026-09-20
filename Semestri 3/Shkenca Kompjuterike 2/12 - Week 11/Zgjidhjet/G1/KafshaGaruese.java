
public abstract class KafshaGaruese extends Thread {
    public int mosha;
    public String emri;
    public int pozitaStartuese;

    public KafshaGaruese(int mosha, String emri, int pozitaStartuese) {
        this.mosha = mosha;
        this.emri = emri;
        this.pozitaStartuese = pozitaStartuese;
    }

    public int getMosha() {
        return mosha;
    }

    public String getEmri() {
        return emri;
    }

    public int getPozitaStartuese() {
        return pozitaStartuese;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setPozitaStartuese(int pozitaStartuese) {
        this.pozitaStartuese = pozitaStartuese;
    }
    
    public String toString(){
            return emri + " " + mosha + " ne poziten :  " + pozitaStartuese;
     }
    
    public boolean equals(Object o){
        if(o instanceof KafshaGaruese){
            KafshaGaruese kg = (KafshaGaruese) o;
            if(emri.equals(kg.getEmri())){
                return true;
            }
        }
        return false;
    }
}
