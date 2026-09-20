public class Ushtrimi1{
	static int a;
	int b;
	public Ushtrimi1(){
		System.out.println("Konstruktori Ushtrimi1");
	}
	static{
		a = 15;
		System.out.println("Printimi nga blloku statik");
	}
	{
		b = 10;
		System.out.println("Printimi nga blloku inicializues");
	}
	public static void main(String[]args){
		System.out.println("Metoda Main");
		Ushtrimi1 u1 = new Ushtrimi1();
		System.out.println(u1.a);
		
	}
}