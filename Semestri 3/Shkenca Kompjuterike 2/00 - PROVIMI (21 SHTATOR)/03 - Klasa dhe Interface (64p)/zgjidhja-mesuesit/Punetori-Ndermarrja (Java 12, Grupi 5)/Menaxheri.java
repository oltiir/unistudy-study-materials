public class Menaxheri extends Punetori implements Individi{
	public int sektori;
	public String kualifikimi;
	
	public Menaxheri(String e, int m, int s, String k) throws PunetoriException{
		super(e,m);
		sektori = s;
		kualifikimi= k;
	}
	
	public boolean angazhimiFullTime(){
		return false;
	}
	public String getKualifikimin(){
		return kualifikimi;
	}
}