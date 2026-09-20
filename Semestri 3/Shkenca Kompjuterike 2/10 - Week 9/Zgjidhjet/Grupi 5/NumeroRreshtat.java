import java.io.*;
public class NumeroRreshtat{
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	String fileIn = "";
	String fileOut= "";
	
	public NumeroRreshtat(String fI, String fO) throws Exception{
		fr = new FileReader(fI);
		br = new BufferedReader(fr);
		fw = new FileWriter(fO);
		fileIn = fI;
		fileOut = fO;
	}
	
	public int numero(String fjala)throws Exception{
		int count =0;
		String line = "";
		
		while((line = br.readLine()) != null){
			if(line.startsWith(fjala)){
				count++;
			}
		}
		return count;
	}
	
	public void numeroRreshtat(String fjala) throws Exception{
		int rez = numero(fjala);
		fw.write("Numri i rreshtave ne file-in" + fileIn + " qe fillojne me tekstin " + fjala+ " eshte: " + rez);
		fw.flush();
	}
	
	public static void main(String[]args){
		try{
		NumeroRreshtat nr = new NumeroRreshtat("grupi5.txt","grupi5.out");
		nr.numeroRreshtat("UBT");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
}