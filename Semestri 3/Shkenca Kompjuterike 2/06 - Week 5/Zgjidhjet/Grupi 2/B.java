public class B extends A{

	public B(){
		System.out.println("Konstruktori - B");
	}
	static{
		System.out.println("b. s - B");	
	}
	{
		System.out.println("b. i - B");	
	}
	public static void main(String[]args){
		B b1 = new B();
	}

}