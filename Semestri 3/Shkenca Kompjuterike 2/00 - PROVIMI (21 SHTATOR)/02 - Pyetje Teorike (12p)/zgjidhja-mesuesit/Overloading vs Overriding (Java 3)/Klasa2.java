public class Klasa2 extends Klasa1{
	
	public int rezultati(){
		return 10;
	}
	public static void main(String[]args){
		Klasa2 k2 = new Klasa2();
		k2.shtyp(1,"b");
		k2.shtyp("b",2);
		//10
		System.out.println(k2.rezultati());
		
	}
}