
package Grupi5;

public class CounterRun implements Runnable {
    Counter c;
    String emri;
    
    public CounterRun(Counter c1, String e){
        c = c1;
        emri = e;
    }
    
    @Override
    public void run() {
        c.inc(); //TH0 -> c = 1, TH1 -> c=2
        System.out.println(Thread.currentThread().getName() + " " + c.ktheVleren()); //1
        c.dec(); //0
       System.out.println(Thread.currentThread().getName() + " " + c.ktheVleren()); //0
    }
    
}
