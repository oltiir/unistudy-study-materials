public class Vrapuesi extends Atleti{
	private float distanca;

	public Vrapuesi(int id, String e, byte m, char gj, int nrM, float d){
		super(id, e, m, gj, nrM);
		distanca = d;
	}

	public float getDistanca(){
		return distanca;
	}
	public void setDistanca(float dist){
		distanca = dist;
	}

	public boolean garonIndividualisht(){
		return true;
	}

	public String toString(){
		return " Vrapuesi i distances " + distanca + "m - " + super.toString();
	}

}