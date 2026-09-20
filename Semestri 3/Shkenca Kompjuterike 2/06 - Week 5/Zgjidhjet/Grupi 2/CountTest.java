public class CountTest{
	int count = 2;
	
	public CountTest(){
		count++;
		System.out.println(count);
	}
	
	
	public static void main(String[]args){
		CountTest c1 = new CountTest(); 
		CountTest c2 = new CountTest(); 
		CountTest c3 = new CountTest(); 
	}
	
	
}