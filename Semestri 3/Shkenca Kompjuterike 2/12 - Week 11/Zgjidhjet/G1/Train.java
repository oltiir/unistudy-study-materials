
import java.util.logging.Level;
import java.util.logging.Logger;


public class Train extends Thread {
    Line l;
    
    public Train(Line line){
        l =line;
    }
    
    public void run(){
        try {
            l.getLine();
        } catch (Exception ex) {
            Logger.getLogger(Train.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
