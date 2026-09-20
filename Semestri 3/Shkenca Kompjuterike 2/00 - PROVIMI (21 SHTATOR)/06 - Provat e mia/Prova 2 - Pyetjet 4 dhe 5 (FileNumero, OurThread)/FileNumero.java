import java.io.*;
public class FileNumero{
	private String input;
	public FileNumero(String input){
		this.input=input;
	}
	public void countReshtat() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(input));
		String rreshti;
		int count = 0;
		int countKushti=0;
		while((rreshti=br.readLine())!=null){
			count++;
			if(rreshti.length()<5&& rreshti.contains("UBT21")){
				countKushti++;
			}
		}
		
		br.close();
		Writer fw = new FileWriter("ushtrimi12.out");
		fw.write("File "+input+" ka:\n - Ne file gjinden gjithsej "+count+"\n "+countKushti+ " gjatesia e te cileve eshte me e vogel se 5 karaktere dhe e permbajne tekstin UBT21");
		fw.close();
		
	}
	
	public static void main(String [] args){
		 if (args.length < 1) {
            System.out.println("Duhet te jepet emri i file-it input!");
            return;
        }
		FileNumero fn = new FileNumero(args[0]);
		try{
			fn.countReshtat();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	
	}
		
}