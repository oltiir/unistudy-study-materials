public class KlasaIme{

	public String emri;
	public int pozita;
	
	public KlasaIme(String e, int p){
		emri = e;
		pozita = p;
	}

	public String toString(){
		return emri + " " + pozita;
	}

}