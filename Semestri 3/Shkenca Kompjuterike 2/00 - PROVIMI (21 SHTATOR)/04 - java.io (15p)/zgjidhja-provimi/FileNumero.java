import java.io.*;

public class FileNumero {
    private String emriFileit;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;

    // Konstruktori pranon emrin e file-it, p.sh. "fileName.txt"
    public FileNumero(String emri) throws IOException{
        emriFileit = emri;
        fr = new FileReader(emri);
        br = new BufferedReader(fr);

        // "fileName.txt" -> "fileName_out.txt"
        String output = emri.substring(0, emri.lastIndexOf(".")) + "_out.txt";
        fw = new FileWriter(output);
    }

    public void countReshtat() throws IOException{
        String rreshti;
        int totali = 0;
        int kushti = 0;

        while((rreshti = br.readLine()) != null){
            totali++;
            // KUJDES: keshtu e kerkon detyra fjale per fjale.
            // "UBT21" ka 5 karaktere, prandaj nje rresht me gjatesi < 5
            // nuk mund ta permbaje kurre -> rezultati del gjithmone 0.
            // Ne provim shkruaje keshtu si e kerkon detyra.
            if(rreshti.length() < 5 && rreshti.contains("UBT21")){
                kushti++;
            }
        }

        fw.write("File-i " + emriFileit + " ka:\n");
        fw.write("\t- Ne file gjinden gjithesej " + totali + " rreshta.\n");
        fw.write("\t- " + kushti + " gjatesia e te cilave eshte me e vogel se 5 karaktere dhe e permbajne tekstin UBT21.\n");

        System.out.println("Totali i rreshtave: " + totali);
        System.out.println("Rreshtat qe e plotesojne kushtin: " + kushti);

        br.close();
        fw.close();
    }

    public static void main(String[] args) {
        try{
            FileNumero f = new FileNumero("fileName.txt");
            f.countReshtat();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
