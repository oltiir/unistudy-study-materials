import java.io.*;

public class LineWithoutA{
	FileReader fr = null;
	BufferedReader br = null;
	FileWriter fw = null;
	String fileIn;
	String fileOut;
	
	public LineWithoutA(String fI,String fO) throws Exception{
		fr = new FileReader(fI);
		br = new BufferedReader(fr);
		fw = new FileWriter(fO);
		fileIn = fI;
		fileOut = fO;
	}
		
	public String longestNonALine() throws Exception{
		String line;
		String rreshtiGjate = null;
		while((line = br.readLine()) != null){
			if(rreshtiGjate == null || (rreshtiGjate.length() <= line.length() && !line.contains("A"))){
				rreshtiGjate = line;
			}
		}
		return rreshtiGjate;
	}
	
	public void shkruaj() throws Exception{
		String fjalia = "Testim testim";
		fw.write("Rreshti i fundit me i gjate qe nuk permban shkronjen A eshte: " + fjalia);
	}
	
	public void mbylliRes() throws Exception{
		if(fr != null){
			fr.close();
		}
		if(br != null){
			br.close();
		}	
		if(fw != null){
			fw.close();
		}	
		System.out.println("Portet u mbyllen");
	}
	
	public static void main(String[]args){
		LineWithoutA a = longestNonALine();
		try{
		 a= new LineWithoutA("input.txt","longestNonALine.txt");
		 a.shkruaj();
		 a.mbylliRes();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
			
	}
	
}

	