import java.io.*;

public class Detyra1{
    public static void main(String [] args){
        try {
            String input = "ubt.txt";
            FileReader fr = new FileReader(input);
            int c;
            int count = 0;
            while((c = fr.read())!= -1){
                while(c == 'U' || c == 'u'){
                    c = fr.read();
                    if(c == 'B' || c == 'b'){
                        c = fr.read();
                        if(c == 'T' || c == 't'){
                            count++;
                        }
                    }
                }
            }
           
            FileWriter fw = new FileWriter("ubt.out");

            if(count==0){
                fw.write("Ne file-in " + input + " nuk u gjet asnje fjale UBT");
            }else{
                fw.write("Ne file-in " + input + " u gjeten " + count + " fjale UBT");
            }
            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}