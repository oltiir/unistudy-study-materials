import java.io.*;
public class LexoNgaFile{
	public static void main(String[]args){
		try{
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//vargu - String1,String2,String3
		//vargu - int1, int2, int3
		String[]vargu = new String[3]; // String
		String[]vargu2 = new String[3]; // int
		
		String line;
		while((line = br.readLine()) != null){
			String [] va =line.split(";");//
			int tempIndex = 0;
			int tempIndexInt = 0;
			for(int i = 0; i < va.length; i++){
				if(va[i].contains("String")){
					vargu[tempIndex++] = va[i];
				}
				else{
					vargu2[tempIndexInt++] = va[i];
				}
			}
		}
			for(int i = 0; i < vargu.length; i++){
				System.out.println(vargu[i]);
			}
		for(int i = 0; i < vargu2.length; i++){
				System.out.println(vargu2[i]);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		
	}
	
	
}
	