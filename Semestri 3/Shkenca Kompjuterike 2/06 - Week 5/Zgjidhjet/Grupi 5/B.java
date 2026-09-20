public class B extends A{

	public B(){
		System.out.println("Konstruktor B");
	}

	//Blloku inicializues
	{
		System.out.println("Blloku inicializues B");
	}
	
	static{
		System.out.println("Blloku static B");
	}

	public static void main(String[]args){
		B b = new B();
	}
}