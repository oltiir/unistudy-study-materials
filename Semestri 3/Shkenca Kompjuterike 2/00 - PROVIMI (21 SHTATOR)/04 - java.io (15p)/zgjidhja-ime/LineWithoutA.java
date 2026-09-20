import java.io.*;
public class LineWithoutA{
	public String emri;
	
	public LineWithoutA(String emri){
		this.emri=emri;
	}
	
	public String longestNonALine() throws IOException{
		Reader fr = new FileReader(emri);
		BufferedReader br = new BufferedReader(fr);
		String gjate = null;
		String rreshti;
		while((rreshti = br.readLine())!=null){
			if((gjate==null || gjate.length() <= rreshti.length())&& !rreshti.contains("A")){
				gjate = rreshti;
			}
		}
		br.close();
		return gjate;
	}
	
	public void shkruaj() throws IOException{
		String text = longestNonALine();
		Writer fw = new FileWriter("ubt.out");
		fw.write("Rreshti i fundit me i gjate qe nuk permban shkronjen A eshte "+ text);
		fw.close();
	}
	public static void main (String [] args){
		try{
		LineWithoutA la = new LineWithoutA("ubt.txt");
		la.shkruaj();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}