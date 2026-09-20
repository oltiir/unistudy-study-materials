import java.io.*;
public class Fakulteti {
	private String drejtimi;
	private Mesimdhenesi [] msusat;
	private int index;
	private BufferedReader br;
    private Writer fw;
	public Fakulteti(String d, int n, String input, String output)throws MesimdhenesiException, IOException{
		if(d==null||d.trim().isEmpty()){
			throw new MesimdhenesiException("Duhet shkruar");
		}
		if(n<10){
			throw new MesimdhenesiException("Duhet me i madh se 10");
		}
		if(input==null||input.trim().isEmpty()){
			throw new MesimdhenesiException("Duhet shkruar");
		}
		if(output==null||output.trim().isEmpty()){
			throw new MesimdhenesiException("Duhet shkruar");
		}
		drejtimi = d;
		msusat = new Mesimdhenesi[n];
		br = new BufferedReader(new FileReader(input));
		fw = new FileWriter(output);
	}
	public void shtoMesimdhenesin(Mesimdhenesi m){
		if(msusat.length == index){
			System.out.println("Vargu full");
			return;
			}
		if(m==null){
			System.out.println("Null");
			return;	
				}
		for(int i = 0; i<index; i++){
			if(msusat[i].equals(m)){
			System.out.println("Ekziston");
			return;
			}
		}
		msusat[index++]=m;
	}
	public void lexoMesimdhenesit() throws IOException, MesimdhenesiException{
		String rreshti;
		while((rreshti = br.readLine())!=null){
		 String [] segmente = rreshti.split(";");
		 if(segmente.length != 5){
			continue;
			}

		 
		 String puna = segmente[0];
		 String emri = segmente[1];
		 int viti = Integer.parseInt(segmente[2]);
		 String fusha = segmente[3];
		 String atributi = segmente[4];
		 
		 Mesimdhenesi m = null;
		 
		 if(puna.equals("Profesori")){
		  m = new Profesori(emri,viti,fusha,atributi);
		 }else if(puna.equals("Asistenti")){
		  m = new Asistenti(emri,viti,fusha,atributi);
		 }else{
			 throw new MesimdhenesiException("Lloji nuk pranohet");
		 }
		 shtoMesimdhenesin(m);
		}
	}
	public void shkruaj(String a) throws IOException{
		fw.write(a);
	}
	public void shkruajMesimdhenesit() throws IOException{
		for(int i = 0; i<index;i++){
			shkruaj(msusat[i].toString()+"\n");
		}
		fw.close();
		br.close();
	}
	public static void main (String [] args){
		
		if(args.length < 2){
			System.out.println("Duhet te jepen input dhe output file!");
			return;
			}

		Fakulteti f1 = null;
		try{
			f1 = new Fakulteti("SHK",25, args[0],args[1]);
			f1.lexoMesimdhenesit();
			f1.shkruajMesimdhenesit();
		}catch(MesimdhenesiException e){
			System.out.println(e.getMessage());
		}catch (IOException e){
			e.printStackTrace();
		}
	}
}