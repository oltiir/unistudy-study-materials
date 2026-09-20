
package Grupi5;

import java.util.Iterator;
import java.util.Vector;

public class Hipodromi {
    public String emri;
    Vector<KafshaGaruese> lista;
    
    public Hipodromi(String e) throws Exception{
        emri = e;
        lista = new Vector<KafshaGaruese>();
    }
    
    
    public void shto(KafshaGaruese kg)throws Exception{
        if(lista.contains(kg)){
            throw new Exception("Kafsha ekziston");
        }
        lista.add(kg);
    }
    
    public void shtyp(){
        Iterator it =  lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void filloGaren(KafshaGaruese kg) throws Exception{
        if(kg instanceof KaliGarues){
            kg.setPriority(Thread.MAX_PRIORITY);
        }
        kg.start();
    }
    
    public static void main(String[]args){
        try{
            Hipodromi h = new Hipodromi("Undercover");
            KaliGarues k1 = new KaliGarues(4, "Kali 1", 1);
            KaliGarues k2 = new KaliGarues(3, "Kali 2", 2);
            QeniGarues q1 = new QeniGarues(5, "Qeni 1", 3);
            QeniGarues q2 = new QeniGarues(3, "Qeni 2", 4);
        
            h.filloGaren(k1);
                    h.filloGaren(k2);
            h.filloGaren(q1);
            h.filloGaren(q2);

        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
}
