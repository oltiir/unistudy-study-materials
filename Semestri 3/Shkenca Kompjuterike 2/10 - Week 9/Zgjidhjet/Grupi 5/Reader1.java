import java.io.*;
public class Reader1{
	public static void main(String[]args){
		char[] vargu = new char[100];
		try{
		FileReader fr = new FileReader("grupi5.txt");
		fr.read(vargu);
		System.out.println(vargu);
		fr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		//catch(FileNotFoundException f){
		//	System.out.println(f);
		//}
		//catch(IOException i){
		//	System.out.println(i);
		//}
	}
	
	
	
}