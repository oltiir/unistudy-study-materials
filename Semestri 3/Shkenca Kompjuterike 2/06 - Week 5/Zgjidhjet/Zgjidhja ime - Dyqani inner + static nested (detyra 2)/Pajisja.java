public abstract class Pajisja{
	private int numriSerik;
	private String prodhuesi;

	public Pajisja(int ns, String p){
	numriSerik = ns;
	prodhuesi = p;
	}
	
	public int getNrSerik(){
		return numriSerik;
	}
	public String getProdhuesi(){
		return prodhuesi;
	}
	public void setNrSerik(int n){
		numriSerik = n;
	}
	
	public void setProdhuesi(String p){
		prodhuesi = p;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Pajisja){
			Pajisja p = (Pajisja) obj;
			return p.getNrSerik()==numriSerik;
		}
		return false;
	}
	public String toString(){
		return numriSerik+" : "+prodhuesi;
	}
}