import java.io.*;

import javax.sound.sampled.Line;

public class LineMaxWord {

    String input;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;

    public LineMaxWord(String file) throws IOException{
        input = file;
        fr = new FileReader(input);
        br = new BufferedReader(fr);
        fw = new FileWriter("ubt.out");
    }

    public String findMaxWord() throws IOException{
        LineNumberReader lnr = new LineNumberReader(br);
        String rreshti;
        String meEGjata = null;

        while((rreshti = lnr.readLine()) != null){
            String [] fjalet = rreshti.split(" ");
            for(int i = 0; i < fjalet.length; i++){
                if(meEGjata == null || fjalet[i].length() > meEGjata.length()){
                    meEGjata = fjalet[i];
                }
            }
        }

        fw.write("Fjala me e gjate eshte fjala: " + meEGjata );
        br.close();
        lnr.close();
        fw.close();
        return meEGjata;
    }

    public static void main(String [] args){
        try{
            LineMaxWord lmc = new LineMaxWord("ubt.txt");
            System.out.println(lmc.findMaxWord());

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}

