import java.io.*;

public class Reader2{
	
	public static void main(String[]args){
		
		char [] vargu = new char[20];
		
		try{
			FileReader fr = new FileReader("grupi5.txt");
			BufferedReader br = new BufferedReader(fr);
			
			br.read(vargu);
			System.out.println(vargu);
			br.close();
		}
		catch(Exception e){
			
		}
		
		
	}
	
	
}