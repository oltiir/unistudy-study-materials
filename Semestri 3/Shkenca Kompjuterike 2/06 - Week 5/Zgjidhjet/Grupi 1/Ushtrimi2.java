public class Ushtrimi2 extends Ushtrimi1{
	int c = 0;
	static int d;
	
	public Ushtrimi2(){
		super();
		System.out.println("Konstruktori i u2");
	}
	
	static{
		d = 15;
		System.out.println("blloku statik i U2");
	}

	public static void main(String[]args){
		Ushtrimi2 u2 = new Ushtrimi2();
		Ushtrimi2 u3 = new Ushtrimi2();
		
	}


}