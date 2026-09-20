public class Shoferi extends Punetori{
	private String regjioni;
	
	public Shoferi(String e, int m, String r) throws PuntoriException{
		super(e,m);
		if(r==null||r.trim().isEmpty()){
			throw new PuntoriException("Eshte e zbrazet");
		}
		regjioni=r;
	}
	public String getRegjioni(){
		return regjioni;
	}
	public boolean angazhimiFullTime(){
		return true;
	}
}