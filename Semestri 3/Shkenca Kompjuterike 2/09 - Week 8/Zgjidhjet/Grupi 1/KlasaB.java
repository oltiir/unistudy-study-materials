public class KlasaB{
	
	public static void printo(int g) throws Grupi1Exception{
		if(g == 1){
			System.out.println("Pershendetje grupi 1");
		}
		else{
			throw new Grupi1Exception("Gabim");
		}
	}
	
	public static void main(String[]args){
		try{
		printo(Integer.parseInt("123"));
		}
		catch(Grupi1Exception e){
			System.out.println(e);
		}
		System.out.println("Test test");
	}
	
	
}