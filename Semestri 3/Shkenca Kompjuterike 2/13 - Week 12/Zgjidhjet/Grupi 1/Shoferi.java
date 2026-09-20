public class Shoferi extends Punetori{
	public String regjioni;
	
	public Shoferi(String e, int m, String r) throws PunetoriException{
		super(e,m);
		regjioni = r;
	}
	
	public boolean angazhimiFullTime(){
		return true;
	}
	
	
	
}