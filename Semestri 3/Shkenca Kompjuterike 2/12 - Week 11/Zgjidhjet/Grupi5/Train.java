
package Grupi5;

public class Train extends Thread {
    Line l ;
    
    public Train(Line emri) throws Exception{
        l = emri;
    }
    
    @Override
    public void run(){
        l.getLine();
    }
}
