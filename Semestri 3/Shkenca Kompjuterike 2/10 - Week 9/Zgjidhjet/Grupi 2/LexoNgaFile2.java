import java.io.*;
public class LexoNgaFile2{
	public static void main(String[] bz){
		char[] vargu = new char[20];
		try{
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		br.read(vargu);
		System.out.println(vargu);
		br.close();
		}
		
		catch(IOException io){
			
		}
	}


}