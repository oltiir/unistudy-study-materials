// Varianti 1: klasa e bene EXTEND Thread (keshtu e nenkupton detyra,
// sepse kerkon setPriority() dhe start() direkt mbi instancat e OurThread).
public class OurThread extends Thread{
    private String emri;

    public OurThread(String e){
        emri = e;
    }

    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(emri + " (prioriteti " + getPriority() + ") - hapi " + i);
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    // (b) 5 pike
    public static void main(String[] args) {
        OurThread t1 = new OurThread("Thread-1");
        OurThread t2 = new OurThread("Thread-2");

        t1.setPriority(Thread.NORM_PRIORITY);   // 5
        t2.setPriority(Thread.MAX_PRIORITY);    // 10

        t1.start();
        t2.start();
    }
}
