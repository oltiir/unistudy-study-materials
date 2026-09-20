import java.io.*;
public class Detyra2 {
    public static void main(String [] args){
        try{
            String input = "ubt.txt";
            FileReader fr = new FileReader(input);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("ubt.out");
            BufferedWriter bw = new BufferedWriter(fw);

            String rreshti;
            int count = 0;

            while((rreshti = br.readLine())!= null){
                int index = rreshti.indexOf("ubt");
                while(index != -1){
                    count++;
                    index = rreshti.indexOf("ubt",index+3);
                }
            }

            if(count==0){
                bw.write("Nuk ka fjale ubt");
            }else{
                bw.write("Ka " + count + " fjale ubt");
            }

            br.close();
            bw.close();

            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
