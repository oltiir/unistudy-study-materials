public class Klasa2 extends Klasa1{
	// single level
	//public int shuma = 4000;
	public Klasa2(int sh){
		super(sh);
	}
	
	
	public static void main(String[]args){
		Klasa2 k2 = new Klasa2(5000);
		System.out.println(k2.shuma);
		
	}
}