
package Grupi5;

import java.util.Random;

public class KaliGarues extends KafshaGaruese implements Garon {
    int distanca = 0;
    public KaliGarues(int m, String e, int po){
        super(m,e,po);
    }
    public void vrapo(){
        distanca += 10;
        System.out.println("(KaliGarues) " + super.emri + " ka vrapuar : " + distanca + " m");
    }
    
    public void run(){
        while(distanca < GJATESIA){
            try{
                Random r = new Random();
                Thread.sleep(r.nextInt(2000));
                vrapo();
            }
            catch(Exception e){
                System.out.println(e);
            }
            if(distanca == GJATESIA){
                System.out.println("(KaliGarues) " + super.emri + " ka perfunduar garen");
                break;
            }
        }
    }
    
    
}
