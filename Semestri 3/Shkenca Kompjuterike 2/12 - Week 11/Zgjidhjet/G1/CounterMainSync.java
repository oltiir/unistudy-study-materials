
public class CounterMainSync implements Runnable{
     CounterSyn c;
    public String emri;
    
    public CounterMainSync(CounterSyn c1, String e){
        c = c1;
        emri =  e;
    }
    
    @Override
    public void run() {
       synchronized(System.out){
        c.inc();
        System.out.println(Thread.currentThread().getName() + " : " + c.ktheVleren());
        c.dec();
        System.out.println(Thread.currentThread().getName() + " : " + c.ktheVleren());
       }
    }
}
