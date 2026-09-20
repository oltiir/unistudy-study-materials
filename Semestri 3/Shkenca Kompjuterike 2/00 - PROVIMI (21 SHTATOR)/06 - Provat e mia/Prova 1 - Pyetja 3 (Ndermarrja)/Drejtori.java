public class Drejtori extends StafiAdministrativ implements Individi{
	private String kualifikimi;
	
	public Drejtori(String e, int m, String d, String k ) throws PuntoriException{
		super(e,m,d);
		if(k==null|| k.trim().isEmpty()){
			throw new PuntoriException("Eshte e zbrazet");
		}
		kualifikimi = k;
	}
	public String getKualifikimi(){
		return kualifikimi;
	}
	public boolean angazhimiFullTime(){
		return true;
	}
}