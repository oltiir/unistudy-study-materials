import java.util.*;
import java.io.*;

public class Biblioteka {
    private String emri;
    private ArrayList<Libri> librat;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;

    public Biblioteka(String e, String input, String output) throws Exception{
        emri = e;
        librat = new ArrayList<Libri>();
        fr = new FileReader(input);
        br = new BufferedReader(fr);
        fw = new FileWriter(output);
    }

    public void shtoLibrin(Libri l)throws LibriException{
        if(librat.contains(l)){
            throw new LibriException("Libri ekziston!");
        }else{
            librat.add(l);
        }
    }

    public void shtypSipasDrejtimit(String d){
        Iterator<Libri> itr = librat.iterator();

        while(itr.hasNext()){
            LibriShkollor l = (LibriShkollor)itr.next();
            if(l.getDrejtimi().equals(d)){
                System.out.println(l);
            }
        }
    }

    public void lexoLibrat() throws Exception{
        String rreshti;

        while((rreshti = br.readLine()) != null){
            String [] vargu = rreshti.split(";");

            if(vargu[0].equals("Libri Shkollor")){
                Libri l = new LibriShkollor(vargu[1], vargu[2], Integer.parseInt(vargu[3]), vargu[4]);
                shtoLibrin(l);
            }else{
                Libri l = new Enciklopedia(vargu[1], vargu[2], Integer.parseInt(vargu[3]),Integer.parseInt(vargu[4]));
                shtoLibrin(l);
            }

        }
        br.close();
    }

    public void shkruaj(String txt) throws IOException{
        fw.write(txt + "\n");
    }

    public void shkruajLibrat() throws IOException{
        Iterator<Libri> itr = librat.iterator();

        while(itr.hasNext()){
            shkruaj(itr.next().toString());
        }
        fw.close();
    }

    public static void main(String[] args) {
        try{
            Biblioteka b = new Biblioteka("Bib", "libri.txt", "biblo.out");
            b.shtypSipasDrejtimit("Matematike");

            System.out.println("===========");

            b.lexoLibrat();
            b.shkruajLibrat();
        }catch(Exception e){
            e.printStackTrace();
        }
    }












}
