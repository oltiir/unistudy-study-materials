public class Studenti{
	public String emri;
	public String mbiemri;
	public String kolegji;
	
	public Studenti(String e, String m, String k){
			emri = e;
			mbiemri = m;
			kolegji = k;
	}
	
	public String toString(){
		return emri + " " + mbiemri + " " + kolegji;
	}

	
}