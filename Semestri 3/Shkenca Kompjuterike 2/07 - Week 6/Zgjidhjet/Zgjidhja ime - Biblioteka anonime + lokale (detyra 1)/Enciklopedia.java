public class Enciklopedia extends Libri{
    private int nrAutoreve;

    public Enciklopedia(String i, String t, int v,int n){
        super(i ,t, v=2012);
        nrAutoreve = n;
    }

    public int getNrAutoreve(){
        return nrAutoreve;
    }
    public void setNrAutoreve(int n){
        nrAutoreve = n;
    }

    public boolean kaDetyra(){
        return false;
    }

    public String toString(){
        return "Enciklopedia " + super.toString() + " ka " + nrAutoreve + " autore ";
    }
}
