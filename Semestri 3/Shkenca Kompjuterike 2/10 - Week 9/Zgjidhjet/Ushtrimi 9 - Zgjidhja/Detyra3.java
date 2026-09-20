import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Detyra3 {
    String inputFile;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    public Detyra3(String input) throws IOException{
    inputFile = input;
        fr = new FileReader(input);
        br = new BufferedReader(fr);
        fw = new FileWriter("ubt.out");
    }
    

    public void gjejFjalen( String fjala)throws IOException{

        String rreshti;
        int count = 0;

        while((rreshti = br.readLine())!= null){
            int index = rreshti.toLowerCase().indexOf(fjala);
            while(index != -1){
                count++;
                index = rreshti.toLowerCase().indexOf(fjala, index+fjala.length());
            }
        }

        if(count == 0){
            fw.write("Nuk ka fjale " + fjala + " det3");
        }else{
            fw.write("Ka " + count + " fjale " + fjala + " det3");
        }
    }

    public void closeR(){
        try {
            if(br != null){
            br.close(); 
        }
        if(fw != null){
            fw.close();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String [] args){
        Detyra3 d = null;

        try{
            d = new Detyra3("ubt.txt");
            d.gjejFjalen("ubt");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            d.closeR();
        }
    }

}
