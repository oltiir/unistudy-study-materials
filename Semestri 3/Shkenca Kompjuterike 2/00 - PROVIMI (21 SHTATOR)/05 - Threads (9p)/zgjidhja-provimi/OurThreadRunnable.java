// Varianti 2: nese OurThread implementon Runnable, atehere prioriteti
// dhe start() i caktohen objektit Thread qe e mbeshtjell Runnable-in.
public class OurThreadRunnable implements Runnable{
    private String emri;

    public OurThreadRunnable(String e){
        emri = e;
    }

    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(emri + " - hapi " + i);
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new OurThreadRunnable("Thread-1"));
        Thread t2 = new Thread(new OurThreadRunnable("Thread-2"));

        t1.setPriority(Thread.NORM_PRIORITY);   // 5
        t2.setPriority(Thread.MAX_PRIORITY);    // 10

        t1.start();
        t2.start();
    }
}
