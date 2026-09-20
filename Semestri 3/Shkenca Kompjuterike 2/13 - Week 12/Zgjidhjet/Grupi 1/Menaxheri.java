public class Menaxheri extends Punetori implements Individi{
	public String sektori;
	public String kualifikimi;
	
	public Menaxheri(Sring e, int m, String s, String k) throws PunetoriException{
		super(e,m);
		sektori = s;
		kualifikimi = k;
	}

	public boolean angazhimiFullTime(){
		return true;
	}
	
	public String getKualifikimi(){
		return kualifikimi;
	}
}