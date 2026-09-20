public class Klasa1{

	public Klasa1(){
		System.out.println("Konstruktori");
	}
	
	static{
	System.out.println("statik");
	}
	
	{
	System.out.println("inicializues");
	}
	
	public static void main(String[]args){
		System.out.println("main");
		Klasa1 k1 = new Klasa1();
	}

}