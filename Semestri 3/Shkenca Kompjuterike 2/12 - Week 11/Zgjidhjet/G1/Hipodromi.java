
import java.util.Iterator;
import java.util.Vector;


public class Hipodromi {
    public String emri;
    Vector<KafshaGaruese> lista;
    
    public Hipodromi(String e){
        emri = e;
        lista = new Vector<KafshaGaruese>();
    }
    
    public void shtoKafshen(KafshaGaruese kg) throws Exception{
       if(lista.contains(kg)){
           throw new Exception("Ekziston");
       }
       lista.add(kg);
    }
    
    public void printoKafshet(){
        Iterator it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void filloGaren(KafshaGaruese kg) throws Exception{
        try{
            if(kg instanceof KaliGarues){
                kg.setPriority(Thread.MAX_PRIORITY);
            }
            kg.start();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        try{
            Hipodromi h = new Hipodromi("Hipodromi 1");
            KaliGarues k1 =new KaliGarues(5, "Kali 1", 1);
            KaliGarues k2 =new KaliGarues(6, "Kali 2", 2);
            QeniGarues q1 =new QeniGarues(2, "Qeni 1", 3);
            QeniGarues q2 =new QeniGarues(1, "Qeni 2", 4);
            h.filloGaren(k1);            
            h.filloGaren(k2);
            h.filloGaren(q1);
            h.filloGaren(q2);
        }
        catch(Exception e){
            
        }
    }
}
