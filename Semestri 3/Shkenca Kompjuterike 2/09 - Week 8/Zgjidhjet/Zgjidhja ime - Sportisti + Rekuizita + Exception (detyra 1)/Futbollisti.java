public class Futbollisti extends Sportisti implements Rekuizita {
    private int numri;

    public Futbollisti(int i, String e, int m, char gj, int nr)throws SportistiException{
		super(i, e, m, gj);
		if(nr<=0){
			throw new SportistiException("Numri duhet te jete pozitiv");
		}
        numri = nr;
    }

    public int getNumri(){
        return numri;
    }
    public void setNumri(int n) throws SportistiException{
		if(n<0){
			throw new SportistiException("Numri duhet te jete pozitiv");
		}
        numri = n;
    }

    public boolean garonIndividualisht(){
        return false;
    }

    public String getRekuizita(){
        return "top";
    }

    public String toString(){
        return "Futbollisti " + super.toString() + " - nr: " + numri;
    }
}
