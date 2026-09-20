public abstract class Atleti extends Sportisti{
    private int nrMedaljeve;

    public Atleti(int i, String e, int m, char gj, int nrM)throws SportistiException{
        super(i, e, m, gj);
        if(nrM < 0){
            throw new SportistiException("NRM < 0");
        }
        nrMedaljeve = nrM;
    }

    public int getNrMedaljeve(){
        return nrMedaljeve;
    }
    public void setNrMedaljeve(int nrM) throws SportistiException{
        if(nrM < 0){
            throw new SportistiException("NRM - setM - gabim!");
        }
        nrMedaljeve = nrM;
    }

    public boolean garonIndividualisht(){
        return true;
    }

    public String toString(){
        return super.toString() + " me " + nrMedaljeve + " medalje";
     }
}




