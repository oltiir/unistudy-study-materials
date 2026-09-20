public class MP3Player extends PajisjaElektrike{
	
	private int memoria;
	
	public MP3Player(int ns, String p, int voltazhi, char kategoriaShpenzuese, int memoria){
		super(ns, p, voltazhi, kategoriaShpenzuese);
		this.memoria=memoria;
	}
	
	public boolean kaBateri(){
		return true;
	}
	
	public String toString(){
		return "MP3Player - "+super.toString()+" : "+memoria+" GB";
	}
}