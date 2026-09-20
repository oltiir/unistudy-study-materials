import java.io.*;
public class Ushtrimi1Read{
	public static void main(String[]args){
			char [] vargu = new char[100];
		try{
			FileReader fr = new FileReader("grupi1.txt");
			fr.read(vargu);
			System.out.println(vargu);
			fr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
}