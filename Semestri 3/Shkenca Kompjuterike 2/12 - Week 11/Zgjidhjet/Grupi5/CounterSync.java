
package Grupi5;

public class CounterSync {
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
        CounterSync c = new CounterSync();
        for(int i = 0; i < 4; i++){
            Thread th = new Thread(new CounterRunSync(c," " + i));
            th.start();
        }
    }
}
