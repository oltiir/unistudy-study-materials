public class OurThread extends Thread{
	private String threadName;
	
	public OurThread (String n){
		threadName = n;
	}
	public String getThreadName(){ return threadName;}
	
	public void run(){
		System.out.println("Thread "+getThreadName()+
		" - Priority:" +Thread.currentThread().getPriority());
	}
	public static void main (String [] args){
		OurThread ot1 = new OurThread("Nishi");
		OurThread ot2 = new OurThread("Dyshi");
		ot1.setPriority(Thread.NORM_PRIORITY);
		ot2.setPriority(Thread.MAX_PRIORITY);
		ot1.start();
		ot2.start();
		
		
	}
}