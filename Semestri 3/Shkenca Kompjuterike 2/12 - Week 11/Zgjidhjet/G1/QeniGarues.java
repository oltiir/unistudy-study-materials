
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class QeniGarues extends KafshaGaruese implements Garon {
    int distanca;
    public QeniGarues(int m , String e, int p) throws Exception{
        super(m,e,p);
    }
    
    @Override
   public void vrapo() {
        distanca += 10;
        System.out.println(super.emri + " ka vrapuar me distance " + distanca);
    }
    
    public void run(){
       while(distanca <= GJATESIA){
           Random r = new Random();
           try {
               Thread.sleep(r.nextInt(2000));
                vrapo();
           } catch (InterruptedException ex) {
               Logger.getLogger(QeniGarues.class.getName()).log(Level.SEVERE, null, ex);
           }
           if(distanca == GJATESIA){
               System.out.println(super.emri + " ka perfundu garen");
               break;
           }
       }
       
    }
    
    
    
}
