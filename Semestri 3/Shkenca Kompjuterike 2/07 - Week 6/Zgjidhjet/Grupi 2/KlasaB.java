public class KlasaB{
	public class InnerClass{
		public String getEmri(){
			return "Grupi 2";
		}
	}
	
	public static void main(String[]args){
		KlasaB kb = new KlasaB();
		KlasaB.InnerClass kbi = kb.new InnerClass();
		System.out.println(kbi.getEmri());
		
	}
	
}