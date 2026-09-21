public abstract class Punetori { 
    protected String emri;
    protected int mosha;

    public Punetori(String emri, int mosha){
        this.emri = emri;
        this.mosha = mosha;
    }

    public String getEmri(){
        return emri;
    }

    public int getMosha(){
        return mosha;
    }
    
    public void setEmri(String e){
        emri = e;
    }

    public void setMosha(int m){
        mosha = m;
    }

    public abstract boolean angazhimiFullTime();

    public boolean equals(Object obj){
        if(!(obj instanceof Punetori)){
            return false;
        }
        Punetori p = (Punetori) obj;
        return emri.equals(p.getEmri());
    }

    public int hashCode(){
        return emri.hashCode();
    }
}