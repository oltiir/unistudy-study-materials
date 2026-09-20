public class StudentiStatik{
	public String emri;
	public String mbiemri;
	public static String kolegji = "UBT";
	
	public StudentiStatik(String e, String m){
			emri = e;
			mbiemri = m;
	}
	
	public String toString(){
		return emri + " " + mbiemri + " " + kolegji;
	}

	
}