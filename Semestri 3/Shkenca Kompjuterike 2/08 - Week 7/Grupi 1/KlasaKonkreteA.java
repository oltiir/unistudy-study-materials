public class KlasaKonkreteA implements InterfaceA, InterfaceB{
	
	public void printoInterfaceA(){
		System.out.println("printoInterfaceA");
	}
	public void printoInterfaceB(){
		System.out.println("printoInterfaceB");
	}
	
	public void printo(){
		System.out.println("printo");
	}
	public static void main(String[]args){
		KlasaKonkreteA kka = new KlasaKonkreteA();
		kka.printoInterfaceA();
		kka.printoInterfaceB();
		String e = kka.getEmri();
		System.out.println(e);
		System.out.println(InterfaceA.getNumri());
	}
	
}