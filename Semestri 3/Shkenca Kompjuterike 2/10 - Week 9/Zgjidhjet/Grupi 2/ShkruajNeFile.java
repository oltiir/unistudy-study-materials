import java.io.*;

public class ShkruajNeFile{
	public static void main(String[]args){
		String fjalia = "Si jeni a jeni mire .... po po mire une jam ...";
		
		try{
			FileWriter fw = new FileWriter("shki.out");
			fw.write(fjalia);
			fw.close();
		}
		catch(Exception e){
			
		}
	}
}