public class Klasa2 extends Klasa1{
	// single
	// 500
	public String emri;
	public Klasa2(int blerim,String e){
		super(blerim);
		emri = e;
	}
	public static void main(String[]args){
		Klasa2 k2 = new Klasa2(500,"Klasa2");
		System.out.println(k2.shuma);
		
	}
}