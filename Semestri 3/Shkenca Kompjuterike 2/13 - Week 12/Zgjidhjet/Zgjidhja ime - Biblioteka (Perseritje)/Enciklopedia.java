public class Enciklopedia extends Libri implements Botohet{
	private int nrAutoreve;
	public Enciklopedia(int i, String t, int v, int nr)throws LibriException{
		super(i, t, v);
        if(nr <= 0) throw new LibriException("Nr autoreve duhet te jete pozitiv");
        nrAutoreve = nr;
	}
	public boolean kaKopertina(){
		return true;
	}
	public boolean eshteMeNgjyra(){
		return true;
	}
	public boolean kaDetyra(){
		return false;
	}
	public String toString(){
		return "Enciklopedia "+super.toString()+" ka "+nrAutoreve+" autore";
	}
	
}