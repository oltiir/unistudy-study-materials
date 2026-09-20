// (c) 2 pike - nrShofereve READONLY, jo negativ
public class Koordinatori extends Punetori{
    private int nrShofereve;

    public Koordinatori(String e, int m, int nrSh) throws PunetoriException{
        super(e, m);
        if(nrSh < 0){
            throw new PunetoriException("Numri i shofereve gabim!");
        }
        nrShofereve = nrSh;
    }

    public int getNrShofereve() {
        return nrShofereve;
    }

    public boolean angazhimiFullTime(){
        return true;
    }

    public String toString(){
        return "Koordinatori " + super.toString() + " - " + nrShofereve + " shofere";
    }
}
