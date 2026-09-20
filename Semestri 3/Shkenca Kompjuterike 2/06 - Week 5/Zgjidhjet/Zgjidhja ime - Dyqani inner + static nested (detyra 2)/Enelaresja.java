public class Enelaresja extends PajisjaElektrike{
	
	private int nrProgrameve;
	
	public Enelaresja(int ns, String p, int voltazhi, char kategoriaShpenzuese, int nrProgrameve){
		super(ns, p, voltazhi, kategoriaShpenzuese);
		this.nrProgrameve = nrProgrameve;
	}
	public boolean kaBateri(){
		return false;
	}
	
	
	public int getProgramet(){
		return nrProgrameve;
	}
	public String toString(){
		return "Enelaresja me " +nrProgrameve+" programe"+"- "+super.toString();
	}
	
}