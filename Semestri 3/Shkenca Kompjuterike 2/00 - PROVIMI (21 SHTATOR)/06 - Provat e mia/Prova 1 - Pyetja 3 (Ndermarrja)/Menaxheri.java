public class Menaxheri extends Punetori implements Individi {
	private String sektori;
	private String kualifikimi;
	
	public Menaxheri(String e, int m,String s, String k)throws PuntoriException{
		super(e,m);
		if(s==null|| s.trim().isEmpty()){
			throw new PuntoriException("Eshte e zbrazet");
		}
		if(k==null|| k.trim().isEmpty()){
			throw new PuntoriException("Eshte e zbrazet");
		}
		sektori=s;
		kualifikimi=k;
	}
	public String getKualifikimi(){
		return kualifikimi;
	}
	public boolean angazhimiFullTime(){
		return true;
	}
	
}