public class Ushtrimi3{
	int a = 5;
	static int b;
	
	public Ushtrimi3(){
		System.out.println("Konstruktori Ushtrimi3");
	}
	
	static{
		//a = 15;
		System.out.println("Blloku statik inicializues Ushtrimi3");
	}
	{
		System.out.println("Blloku inicializues Ushtrimi3");
		
	}
	
	//public static void main(String[]args){
	//	Ushtrimi3 u3 = new Ushtrimi3();
	//	Ushtrimi3 u4 = new Ushtrimi3();
	//}
}