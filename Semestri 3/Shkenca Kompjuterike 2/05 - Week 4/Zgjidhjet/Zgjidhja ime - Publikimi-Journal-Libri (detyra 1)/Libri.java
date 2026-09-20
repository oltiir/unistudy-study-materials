public abstract class Libri extends Publikimi{
	private int nrFaqeve;
	
	public Libri(String i,String t,int v,int nr){
		super(i,t,v);
		nrFaqeve=nr;
	}
	public int getNrFaqeve(){
		return nrFaqeve;
	}
	public void setNrFaqeve(int nr){
		nrFaqeve=nr;
	}
	public boolean eshteDigjitale(){
		return false;
	}
	public String toString(){
		return super.toString()+" me "+nrFaqeve+" faqe";
	}
	public abstract boolean kaDetyra();
}




