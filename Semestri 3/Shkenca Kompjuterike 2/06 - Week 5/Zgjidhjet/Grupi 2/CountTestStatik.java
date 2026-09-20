public class CountTestStatik{
	static int count = 2;
	
	public CountTestStatik(){
		count++;
		System.out.println(count);
	}
	
	
	public static void main(String[]args){
		CountTestStatik c1 = new CountTestStatik();//3 
		CountTestStatik c2 = new CountTestStatik();//4
		CountTestStatik c3 = new CountTestStatik();//5
	}
	
	
}