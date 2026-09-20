public abstract class Atleti extends Sportisti{
	protected int nrMedaljeve = 0;

	public Atleti(int id, String e, byte m, char gj, int nrM){
		super(id, e, m, gj);
		nrMedaljeve = nrM;
	}

	public int getNrMedaljeve(){
		return nrMedaljeve;
	}
	public void setNrMedaljeve(int n){
		nrMedaljeve = n;
	}

	public String toString(){
		return super.toString() + " me " + nrMedaljeve + " medalje";
	}
}