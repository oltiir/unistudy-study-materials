public class Grupi5 implements InterfaceA, InterfaceB{
	
	public void printoA(){
		System.out.println("printoA");
	}
	public void printoB(){
		System.out.println("printoB");
	}
	public void printoC(){
		System.out.println("printoC");
	}
	public static void main(String[]args){
		Grupi5 g5 = new Grupi5();
		g5.printoA();
		g5.printoB();
		g5.printoC();
	}
}