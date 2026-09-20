public class KlasaA{
	
	public static void printo(int g){
		if(g == 1){
			System.out.println("Pershendetje grupi 1");
		}
		else{
			System.out.println("Gabim");
		}
	}
	
	public static void main(String[]args){
		try{
		printo(Integer.parseInt("test"));
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Test test");
	}
	
	
}