// (b) 5 pike - klase ABSTRAKTE (ka metode abstrakte)
public abstract class Punetori {
    private String emri;
    private int mosha;

    public Punetori(String e, int m) throws PunetoriException{
        if(e == null || e.trim().isEmpty()){
            throw new PunetoriException("Emri gabim!");
        }
        emri = e;
        if(m <= 0){
            throw new PunetoriException("Mosha gabim!");
        }
        mosha = m;
    }

    public String getEmri() {
        return emri;
    }
    public void setEmri(String emri) throws PunetoriException{
        if(emri == null || emri.trim().isEmpty()){
            throw new PunetoriException("Emri gabim!");
        }
        this.emri = emri;
    }

    public int getMosha() {
        return mosha;
    }
    public void setMosha(int mosha) throws PunetoriException{
        if(mosha <= 0){
            throw new PunetoriException("Mosha gabim!");
        }
        this.mosha = mosha;
    }

    public abstract boolean angazhimiFullTime();

    // (k) formati: emri : mosha
    public String toString(){
        return emri + " : " + mosha;
    }

    // nevojitet per (g) ekziston()
    public boolean equals(Object o){
        return o instanceof Punetori?((Punetori)o).getEmri().equals(emri):false;
    }
}
