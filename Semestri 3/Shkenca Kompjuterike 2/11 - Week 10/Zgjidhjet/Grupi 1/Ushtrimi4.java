import java.io.*;

public class Ushtrimi4{
	
	public static void main(String[]args){
		KlasaIme k1 = null;
		KlasaIme k2 = null;
		try{
			FileReader fr = new FileReader("inputFile.txt");
			BufferedReader br = new BufferedReader(fr);
			String line  = br.readLine();
			while(line != null){
					String[] vargu = line.split(";");
					String p = vargu[0];
					int nr = Integer.parseInt(vargu[1]);
					if(k1 == null){
						k1 = new KlasaIme(p,nr);	
					}
					else{
						k2 = new KlasaIme(p,nr);
					}				
					System.out.println(p);
					System.out.println(nr);
					line  = br.readLine();
			}
		}
		catch(IOException i){
			System.out.println(i);
		}
		System.out.println(k1);
		System.out.println(k2);
		
		
	}
	
	
}