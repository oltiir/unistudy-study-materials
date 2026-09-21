public class Sportisti1 { 
    
    private final int id;
    protected String emri;
    protected int mosha;
    protected Gjinia1 gjinia; 

    public Sportisti1 (int id, String emri, int mosha, Gjinia1 gjinia){
        this.id = id;
        this.emri = emri;
        this.mosha = mosha;
        this.gjinia = gjinia;
    }

    public int getId(){
        return id;
    }
    public String getEmri(){
        return emri;
    }
    public int getMosha(){
        return mosha;
    }
    public Gjinia1 getGjinia(){
        return gjinia;
    }

    public void setEmri(String e){
        emri = e;
    }
    public void setMosha(int m){
        mosha = m;
    }
    public void setGjinia(Gjinia1 gj){
        gjinia = gj;
    }

    @Override
    public String toString() {
        return id + " : " + emri + " " + gjinia.getPershkrimi() + " " + mosha + " vjec";
    }

    @Override
    public boolean equals(Object s){
        if(!(s instanceof Sportisti1)){
            return false;
        }
        return this.id == ((Sportisti1) s).id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
