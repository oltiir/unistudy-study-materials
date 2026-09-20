public class Klasa3 extends Klasa2{
	public String emri;
	
	public Klasa3(int sum, int mosha, String e){
		super(sum,mosha);
		emri = e;
	}
	
	public static void main(String[]args){
		Klasa3 k3 = new Klasa3(5,20,"Test");
		System.out.println(k3.mosha);
		System.out.println(k3.sum);
		System.out.println(k3.emri);
		
		
	}
	
	
}