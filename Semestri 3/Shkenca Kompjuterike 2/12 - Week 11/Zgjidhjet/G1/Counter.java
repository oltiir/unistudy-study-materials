public class Counter {
    public int c = 0;
    
    public void inc(){
        c++;
    }
    public void dec(){
        c--;    
    }
    
    public int ktheVleren(){
        return c;
    }
    
    public static void main(String[]args){
        Counter c = new Counter();
        for(int i = 0; i < 3; i++){
            Thread th = new Thread(new CounterMain(c," " + i));
            th.start();
        }
        
        
    }
}
