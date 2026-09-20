import java.io.*;

import javax.sound.sampled.Line;

public class LineMaxWords {

    String input;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;

    public LineMaxWords(String file) throws IOException{
        input = file;
        fr = new FileReader(input);
        br = new BufferedReader(fr);
        fw = new FileWriter("ubt.out");
    }

    public String findMaxWords() throws IOException{
        LineNumberReader lnr = new LineNumberReader(br);
        String rreshti;
        String meIGjati = null;
        int nrRreshtit = 0;
        int max = 0;
        lnr.setLineNumber(1);
        while((rreshti = lnr.readLine()) != null){
            String [] fjalet = rreshti.split(" ");
            if(fjalet.length > max){
                 max = fjalet.length;
                meIGjati = rreshti;
                nrRreshtit = lnr.getLineNumber();
               
            }
        }

        fw.write("Rreshti i pare me me shume fjale gjendet ne rreshtin: " + nrRreshtit );
        br.close();
        lnr.close();
        fw.close();
        return meIGjati;
    }

    public static void main(String [] args){
        try{
            LineMaxWords lmc = new LineMaxWords("ubt.txt");
            System.out.println(lmc.findMaxWords());

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}


