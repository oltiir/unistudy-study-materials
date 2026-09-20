
package Grupi5;

public class Station {
    public static void main(String[]args){
        try{
        Line l = new Line();
        Train t1 = new Train(l);
        Train t2 = new Train(l);
        t1.start();
        t2.start();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
