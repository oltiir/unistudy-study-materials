import java.io.*;
public class LexoNgaFile{
	public static void main(String[] bz){
		char[] vargu = new char[20];
		try{
		FileReader fr = new FileReader("input.txt");
		
		fr.read(vargu);
		System.out.println(vargu);
		fr.close();
		}
		
		catch(IOException io){
			
		}
	}


}