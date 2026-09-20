public class KlasaBL{
	
	public void printo(){
		 class KlasaLokale{
			public int getNumri(){
				return 5;
			}
		}
		KlasaLokale kl = new KlasaLokale();
		System.out.println(kl.getNumri());
	}
	
	public static void main(String[]args){
		KlasaBL kbl = new KlasaBL();
		kbl.printo();
	}
	
	
	
}