import java.io.*;

public class NumeroReshtat{
	private String input;
	private String output;
		
	public NumeroReshtat(String input, String output){
		this.input=input;
		this.output=output;
	}
	
	public int numero(String text) throws IOException{
		Reader fr = new FileReader(input);
		BufferedReader br= new BufferedReader(fr);
		
		String rreshti;
		int count = 0;
		while((rreshti=br.readLine())!=null){
			if(rreshti.startsWith(text)){
				count++;
			}
		}
		br.close();
		return count;
		
	}
	
	public void numeroReshtat(String text) throws IOException{
		int nr = numero(text);
		Writer fw = new FileWriter(output);
		fw.write("Numri i rreshtave ne file-in "+input+" qe fillojne me tekstin "+text+" eshte: "+nr);
			fw.close();
	}
	
	public static void main (String [] args){
		try{
			NumeroReshtat nr = new NumeroReshtat("ubt.txt","SHk2.out");
			nr.numeroReshtat("ferizaj");
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}