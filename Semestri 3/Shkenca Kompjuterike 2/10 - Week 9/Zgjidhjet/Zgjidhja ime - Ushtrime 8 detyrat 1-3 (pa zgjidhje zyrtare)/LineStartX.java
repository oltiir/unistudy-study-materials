import java.io.*;

public class LineStartX {
    private String emri;

    public LineStartX(String emri) {
        this.emri = emri;
    }

  
    public int evenXLine() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(emri));

        String rreshti;
        int pozita = 0;      
        int maxLen = -1;     

        int nrRreshtit = 0; 

        while ((rreshti = br.readLine()) != null) {
            nrRreshtit++;

            if (rreshti.startsWith("X") && rreshti.length() % 2 == 0) {
                if (rreshti.length() > maxLen) {
                    maxLen = rreshti.length();
                    pozita = nrRreshtit;
                }
            }
        }

        br.close();
        return pozita;
    }

    public void write() throws IOException {
        int rreshtiNr = evenXLine();

        Writer fw = new FileWriter("java.out");
        fw.write("Rreshti me i gjate me gjatesi cift qe fillon me X eshte: " + rreshtiNr);
        fw.close();
    }

    public static void main(String[] args) {
        try {
            LineStartX lx = new LineStartX("java.txt");
            lx.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
