
public class CounterMain implements Runnable {
    Counter c;
    public String emri;
    
    public CounterMain(Counter c1, String e){
        c = c1;
        emri =  e;
    }
    
    @Override
    public void run() {
        c.inc();
        System.out.println(c.ktheVleren());
        c.dec();
        System.out.println(c.ktheVleren());

    }
    
}
