public class Koordinatori extends Punetori{
	private int nrShofereve;
	
	public Koordinatori(String e, int m, int n) throws PuntoriException{
		super(e,m);
		if(n<0){
			throw new PuntoriException("Eshte negative");
		}
		nrShofereve = n;
	}
	public int getNrShofereve(){
		return nrShofereve;
	}
	public boolean angazhimiFullTime(){
		return true;
	}
}