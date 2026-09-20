import java.io.*;

import javax.sound.sampled.Line;

public class LineCounter {

    String input;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;

    public LineCounter(String file) throws IOException{
        input = file;
        fr = new FileReader(input);
        br = new BufferedReader(fr);
        fw = new FileWriter("ubt.out");
    }

    public int[] countLines() throws IOException{
        String rreshti;
        int countRreshtat = 0;
        int countKushti = 0;
        while((rreshti = br.readLine()) != null){
            countRreshtat++;
            if(rreshti.length()%2==0 && rreshti.contains("SHK1")){
                countKushti++;
            }
        }

        fw.write(input + " ka: " + countRreshtat + " ne total.\n\t");
        fw.append(countKushti + " rreshtat qe e plotesojne kushtin");
        br.close();
        fw.close();
        int[] counters = {countRreshtat, countKushti};
        return counters;
    }

    public static void main(String [] args){
        try{
            LineCounter lmc = new LineCounter("ubt.txt");
           for(int i : lmc.countLines()){
            System.out.println(i);
           }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}


