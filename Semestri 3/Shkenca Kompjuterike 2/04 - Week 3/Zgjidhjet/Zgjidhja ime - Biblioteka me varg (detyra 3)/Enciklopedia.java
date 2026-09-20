public class Enciklopedia extends Libri{
	public int nrAutoreve;
	
	public Enciklopedia(int isbn, String titulli, int vitiPublikimit,int nr){
		super(isbn,titulli,vitiPublikimit);
		nrAutoreve=nr;
	}
	
	
	public int getNrAutoreve(){
		return nrAutoreve;
	}
	public void setNrAutoreve(int nrAutoreve){
		this.nrAutoreve=nrAutoreve;
	}
	
	public boolean kaDetyra(){
		return false;
	}
	
	public String toString(){
		return "Enciklopedia "+super.toString()+" ka "+nrAutoreve+" autore";
	}
}