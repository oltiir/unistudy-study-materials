import java.io.*;
import java.util.*;
public class Bibloteka {
	private String emri;
	ArrayList <Libri> librat;
	private String input;
	private String output;
	
	public Bibloteka(String e, String input, String output){
		emri = e;
		this.input = input;
		this.output=output;
		librat = new ArrayList<>();
	}
	public void shtoLibrin(Libri l) throws LibriException{
    
		if(l == null) {
			throw new LibriException("Libri nuk guxon te jete null");
		}	
		if(!librat.contains(l)){
			librat.add(l);
		}
	}
	public void shtypSipasDrejtimit(String d){
		Iterator <Libri> it = librat.iterator();
		while(it.hasNext()){
			Libri l = it.next();
			if(l instanceof LibriShkollor){
            LibriShkollor ls = (LibriShkollor) l;

            if(ls.getDrejtimi().equals(d)){
                System.out.println(ls);
				}
			}
		}
	}
	
	public void lexoLibrat() throws IOException, LibriException{
		BufferedReader br = new BufferedReader(new FileReader(input));
		String rreshti;
		while((rreshti = br.readLine())!=null){
		String [] segmente = rreshti.split(";");
		if (segmente.length != 5) {
                continue;
		}
		String lloji = segmente[0];
		int isbn = Integer.parseInt(segmente[1]);
		String titulli = segmente[2];
		int vitiPublikimit = Integer.parseInt(segmente[3]);
		String atributi = segmente[4];
		
		Libri l = null;
		if(lloji.equals("LibriShkollor")){
			l = new LibriShkollor(isbn,titulli,vitiPublikimit,atributi);
		}else if(lloji.equals("Enciklopedia")){
			int nrAutoreve = Integer.parseInt(atributi);
			l = new Enciklopedia(isbn,titulli,vitiPublikimit,nrAutoreve);
		}else{
			throw new LibriException("Lloji i gabuar");
		}
		shtoLibrin(l);
		
		}
		br.close();
	}	
	
	public void shkruaj(String a) throws IOException{
		Writer fw = new FileWriter(output);
		fw.write(a);
		fw.close();
	}
	public void shkruajLibrat() throws IOException{
		Writer fw = new FileWriter(output);
		for(Libri l : librat){
			fw.write(l.toString()+"\n");
		}
		fw.close();
	}
	public static void main (String [] args){
		try{
		Bibloteka b1 = new Bibloteka("UBT Library", "libri.txt", "biblioteka.out");

		b1.lexoLibrat();
		b1.shkruajLibrat();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}catch(LibriException e){
			System.out.println(e.getMessage());
		}
	}
}