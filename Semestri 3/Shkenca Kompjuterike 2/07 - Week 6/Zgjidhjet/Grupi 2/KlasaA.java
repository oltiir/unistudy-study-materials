public class KlasaA{
	
	public void printo(){
		Artor a = new Artor(){
			public void printo(){
				System.out.println("Printo nga Artori");
			}
		};
		a.printo();
	}
	public static void main(String[]args){
		KlasaA ka = new KlasaA();
		ka.printo();
	}
	
}