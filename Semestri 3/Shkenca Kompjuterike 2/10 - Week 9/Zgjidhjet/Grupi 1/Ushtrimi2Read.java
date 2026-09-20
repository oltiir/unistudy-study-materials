import java.io.*;

public class Ushtrimi2Read{
	public static void main(String[]args){
		
		char[] vargu = new char[120];
		
		try{
			FileReader fr = new FileReader("grupi1.txt");
			BufferedReader br = new BufferedReader(fr);
			
			System.out.println("A je gati per lexim : " + br.ready());
			br.read(vargu);
			System.out.println(vargu);
			br.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
			
		
		
	}
	
	
}