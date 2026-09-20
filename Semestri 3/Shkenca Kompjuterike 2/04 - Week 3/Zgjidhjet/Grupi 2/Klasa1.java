public class Klasa1{
	public void shtyp(int a, String b){
			System.out.println(a+b);
	}
	public void shtyp(String b, int a){
			System.out.println(b+a);
	}
	public int rezultati(){
		return 5;
	}
	
	public static void main(String[]args){
		Klasa1 k1 = new Klasa1();
		k1.shtyp(1,"b");
		k1.shtyp("b",2);
		
	}
}