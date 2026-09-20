import java.io.*;

public class Ushtrimi1Write{
	
	public static void main(String[]args){
		String fjalia = "Test test test";
		
		try{
			FileWriter fw = new FileWriter("shk2.txt",true);
			
			fw.write(fjalia);
			fw.close();
		}
		catch(Exception e ){
			System.out.println(e);
		}
		
	}
	
}