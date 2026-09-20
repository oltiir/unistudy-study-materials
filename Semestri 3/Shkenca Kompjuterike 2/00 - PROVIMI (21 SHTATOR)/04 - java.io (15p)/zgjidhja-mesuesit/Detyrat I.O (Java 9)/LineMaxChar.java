import java.io.*;

import javax.sound.sampled.Line;

public class LineMaxChar {

    String input;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;

    public LineMaxChar(String file) throws IOException{
        input = file;
        fr = new FileReader(input);
        br = new BufferedReader(fr);
        fw = new FileWriter("ubt.out");
    }

    public String findMaxChar() throws IOException{
        LineNumberReader lnr = new LineNumberReader(br);
        String rreshti;
        int nrRreshtit = 0;
        String meIGjati = null;
        lnr.setLineNumber(1);
        while((rreshti = lnr.readLine()) != null){
            if(meIGjati == null || rreshti.length() >= meIGjati.length()){
                meIGjati = rreshti;
                nrRreshtit = lnr.getLineNumber();
            }
        }

        fw.write("Rreshti i fundit me i gjate gjendet ne rreshtin " + nrRreshtit );
        br.close();
        lnr.close();
        fw.close();
        return meIGjati;
    }

    public static void main(String [] args){
        try{
            LineMaxChar lmc = new LineMaxChar("ubt.txt");
            System.out.println(lmc.findMaxChar());

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
