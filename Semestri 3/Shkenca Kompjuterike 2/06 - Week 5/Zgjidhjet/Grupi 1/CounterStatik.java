public class CounterStatik{
	public static int count;
	
	public CounterStatik(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String[]args){
		CounterStatik cs1 = new CounterStatik();
		CounterStatik cs2 = new CounterStatik();
		CounterStatik cs3 = new CounterStatik();
	}
	
}