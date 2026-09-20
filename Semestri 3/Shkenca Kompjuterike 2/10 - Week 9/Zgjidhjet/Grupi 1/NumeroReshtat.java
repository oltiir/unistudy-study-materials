import java.io.*;

public class NumeroReshtat{
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	BufferedWriter bw  = null;
	String fileIn = "";
	String fileOut = "";
	
	public NumeroReshtat(String fi, String fo) throws Exception{
		fr = new FileReader(fi);
		br = new BufferedReader(fr);
		
		fw = new FileWriter(fo);
		bw = new BufferedWriter(fw);
		fileIn = fi;
		fileOut = fo;
	}

	public int numero(String fjala) throws Exception{
		int count = 0;
		String line =br.readLine();
		while((line = br.readLine()) != null){
			if(line.startsWith(fjala)){
				count++;
			}
		}
		return count;
	}
	
	public void numeroReshtat(String fjala) throws Exception{
		int count = numero(fjala);
		//Numri i rreshtave ne file-in <emri_i_input_file-it> qe fillojne me tekstin <teksti> eshte: <nr_rreshtave> 
		fw.write("Numri i rreshtave ne file-in " + fileIn + " qe fillojne me tekstin " + fjala + " eshte: " + count);
		fw.flush();
	}

	
	public static void main(String[]args){
		try{
		NumeroReshtat nr = new NumeroReshtat("shk2.txt","shk2.out");
		
		nr.numeroReshtat("UBT");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}

