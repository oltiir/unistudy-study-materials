public class Enelarsja extends Pajisja implements Perdoret{
	private int nrProgrameve;
	
	public Enelarsja(int nS, String p, int v, char kS, int nP){
		super(nS,p,v,kS);
		nrProgrameve=nP;
	}
	public boolean kaBateri(){
		return false;
	}
	public String getPerdorimi(){
		return "Shtepiak";
	}
	
	public String toString(){
		return "Enelarsja me "+nrProgrameve+" programe - "+super.toString();
	}
}