import java.io.*;
public class LinesWithX {
    String input;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;

    public LinesWithX(String file) throws IOException{
        input = file;
        fr = new FileReader(file);
        br = new BufferedReader(fr);
        fw = new FileWriter("shk2.out");
    }

    public int countLines() throws IOException{
        String rreshti;
        int count = 0;
        rreshti = br.readLine();
        while(rreshti != null){
            if(rreshti.contains("X")){
                count++;
            }
            rreshti = br.readLine();
        }

        if(count == 0){
            fw.write("Nuk ka rreshta qe e permbajne X!");
        }else{
            fw.write("Numri i rreshtave ne file-in " + input + " që e permbajnë shkronjën X eshte: " + count);
        }

        return count;
    }

    public void closeR(){
        try{
            if(br != null){
                br.close();
            }
            if(fw != null){
                fw.close();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        LinesWithX lwx = null;

        try{
            lwx = new LinesWithX("shk2.txt");

            System.out.println(lwx.countLines());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            lwx.closeR();
        }
    }



}
