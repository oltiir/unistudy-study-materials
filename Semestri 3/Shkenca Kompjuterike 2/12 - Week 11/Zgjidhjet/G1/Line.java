
public class Line {
    public synchronized void getLine() throws Exception{
        for(int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            try{
               Thread.sleep(600);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
}
}