public abstract class Punetori {
	private String emri;
	private int mosha;
	public Punetori(String e, int m){
		emri=e;
		mosha=m;
	}
	public String getEmri(){
		return emri;
	}
	public int getMosha(){
		return mosha;
	}
	
	public abstract boolean angazhimiFullTime();
}