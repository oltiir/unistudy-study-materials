public class Koordinatori extends Punetori{
	public int nrShofereve;
	
	public Koordinatori(String e, int m, int nr) throws PunetoriException{
		super(e,m);
		nrShofereve = nr;
		
	}
	public boolean angazhimiFullTime(){
		return false;
	}
}