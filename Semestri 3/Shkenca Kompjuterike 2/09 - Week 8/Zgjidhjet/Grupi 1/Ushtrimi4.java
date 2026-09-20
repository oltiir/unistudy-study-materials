public class Ushtrimi4{
	
	public static void main(String[]args){
		String s = null;
		try{
		System.out.println(s.length());
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Finally");
		}
		System.out.println("Vazhdim i kodit");
		
	}
	
}