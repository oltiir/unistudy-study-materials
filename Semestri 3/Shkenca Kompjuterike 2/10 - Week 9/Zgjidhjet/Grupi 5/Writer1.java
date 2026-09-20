import java.io.*;


public class Writer1{

	public static void main(String[]args){
		String fjalia = "......... Test";
		try{
			FileWriter fw = new FileWriter("out.txt",true);;
			fw.write(fjalia);
			fw.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

}