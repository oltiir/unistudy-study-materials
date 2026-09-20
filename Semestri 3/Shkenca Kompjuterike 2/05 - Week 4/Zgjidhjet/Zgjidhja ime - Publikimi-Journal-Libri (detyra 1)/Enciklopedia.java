public class Enciklopedia extends Libri{
	private int nrAutoreve;
	
	public Enciklopedia(String i,String t,int v,int nr,int nrAutoreve){
		super(i,t,v,nr);
		this.nrAutoreve=nrAutoreve;
	}
	public int getNrAutoreve(){
		return nrAutoreve;
	}
	public void setNrAutoreve(int nr){
		nrAutoreve=nr;
	}
	public boolean kaDetyra(){
		return false;
	}
	public String toString(){
		return "Enciklopedia "+super.toString()+" ka "+nrAutoreve+" autore";
	}
	
}

