public class CounterSyn {
    public int c = 0;
    
    public synchronized void inc(){
        c++;
    }
    public synchronized void dec(){
        c--;    
    }
    
    public synchronized int ktheVleren(){
        return c;
    }
    
    public static void main(String[]args){
        CounterSyn c = new CounterSyn();
        for(int i = 0; i < 3; i++){
            Thread th = new Thread(new CounterMainSync(c," " + i));
            th.start();
        }
        
        
    }
}
