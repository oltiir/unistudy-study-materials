public class MP3Player extends Pajisja implements Perdoret{
	private int memoria;
	
	public MP3Player(int nS, String p, int v, char kS, int m){
		super(nS,p,v,kS);
		memoria=m;
	}
	public boolean kaBateri(){
		return true;
	}
	public String getPerdorimi(){
		return "argetues";
	}
	public String toString(){
		return "MP3Player - "+super.toString()+" : "+memoria+" GB.";
	}
	
}