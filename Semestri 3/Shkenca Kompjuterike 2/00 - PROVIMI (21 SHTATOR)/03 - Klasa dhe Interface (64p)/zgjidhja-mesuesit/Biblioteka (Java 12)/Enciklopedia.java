public class Enciklopedia extends Libri{
    private int nrAutoreve;

    public Enciklopedia(String i, String t, int v, int nrA) throws LibriException{
        super(i, t, v);
        if(nrA <= 0){
            throw new LibriException("Numri i autoreve gabim!");
        }
        nrAutoreve = nrA;
    }

    public int getNrAutoreve() {
        return nrAutoreve;
    }
    public void setNrAutoreve(int nrAutoreve) throws LibriException{
        if(nrAutoreve <= 0){
            throw new LibriException("Numri i autoreve gabim!");
        }
        this.nrAutoreve = nrAutoreve;
    }

    public boolean kaDetyra(){
        return false;
    }

    public boolean kaKopertina(){
        return true;
    }

    public String toString(){
        return "Enciklopedia " + super.toString() + " ka " + nrAutoreve + " autore";
    }
}
    

