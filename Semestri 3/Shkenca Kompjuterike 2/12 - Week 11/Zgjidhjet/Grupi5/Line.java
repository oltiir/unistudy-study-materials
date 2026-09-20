
package Grupi5;

public class Line {
    
    public synchronized void getLine(){
        for(int i = 0; i < 4; i++){
            try{
                Thread.sleep(600);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}
