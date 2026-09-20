public class Station {
    
    public static void main(String[]args){
        Line l = new Line();
        Train t1 = new Train(l);        
        Train t2 = new Train(l);
        Train t3 = new Train(l);
        t1.start();
        t2.start();
        t3.start();
    }
}
