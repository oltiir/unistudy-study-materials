public class Drejtori extends StafiAdministrativ implements Individi{
	public String kualifikimi;
	
	public Drejtori(String e, int m, String d, String k) throws PunetoriException{
		super(e,m,d);
		kualifikimi = k;
	}

	public boolean angazhimiFullTime(){
		return true;
	}
	public String getKualifikimi(){
		return kualifikimi;
	}

}