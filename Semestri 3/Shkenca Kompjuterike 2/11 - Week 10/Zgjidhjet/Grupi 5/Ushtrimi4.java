import java.io.*;

public class Ushtrimi4{
	public static void main(String[]args){
		KlasaIme k1 = null;
			KlasaIme k2 = null;
		try{
			FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			while((line = br.readLine()) != null){
				String[] vargu = line.split(";");
				String p0 = vargu[0];
				int p1 = Integer.parseInt(vargu[1]);
				if(k1 == null){
					k1 = new KlasaIme(p0,p1);
				}
				else{
					k2 = new KlasaIme(p0,p1);
				}
				System.out.println(p0);
				System.out.println(p1);
			}
		}
		catch(IOException i){
			System.out.println(i);
		}
		
				System.out.println(k1);
				System.out.println(k2);
	}
	
	
	
}