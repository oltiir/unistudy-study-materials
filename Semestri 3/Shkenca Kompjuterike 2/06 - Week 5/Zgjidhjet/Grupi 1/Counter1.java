public class Counter1{
	public int count;
	// 1 2 3
	// 1 1 1 WWWWW
	// 0 1 2
	// 0 0 0
	
	public Counter1(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[]args){
		Counter1 obj1 = new Counter1();
		Counter1 obj2 = new Counter1();
		Counter1 obj3 = new Counter1();
	}
	
	
}