public class Koordinatori extends Punetori{
    protected int nrShofereve;

    public Koordinatori(String emri, int mosha, int nrShofereve) throws PunetoriException{
        super(emri, mosha);
        if(nrShofereve < 0){
            throw new PunetoriException("Kjo sbon me kan numer negativ !");
        }
        this.nrShofereve = nrShofereve;
    }

    public int getNrShofereve(){
        return nrShofereve;
    }

    public boolean angazhimiFullTime(){
        return true;
    }
}