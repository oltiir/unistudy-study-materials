public class Ushtrimi4 extends Ushtrimi3{

	public Ushtrimi4(){
		System.out.println("Konstruktori Ushtrimi4");
	}

	static{
		System.out.println("Blloku statik i u4");
	}
	{
		System.out.println("Blloku inicializues i u4");
	}

	public static void main(String[]args){
		Ushtrimi4 u4 = new Ushtrimi4();
	}
}