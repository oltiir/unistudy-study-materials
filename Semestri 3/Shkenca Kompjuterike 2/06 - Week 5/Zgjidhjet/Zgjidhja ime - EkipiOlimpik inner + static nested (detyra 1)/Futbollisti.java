public class Futbollisti extends Sportisti{
	private int numri;

	public boolean garonIndividualisht(){
		return false;
	}

	public Futbollisti(int id, String e, byte m, char gj,int nr){
		super(id, e, m, gj);
		numri = nr;
	}

	public int getNumri(){
		return numri;
	}
	public void setNumri(int nr){
		numri = nr;
	}

	public String toString(){
		return "Futbollisti " + super.toString() + " - nr: " + numri;
	}
}