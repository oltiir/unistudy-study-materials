public class Journal extends Publikimi{
	private int nrVolumit;
	
	public Journal(String i,String t,int v,int nr){
		super(i,t,v);
		nrVolumit=nr;
	}
	public int getNrVolumit(){
		return nrVolumit;
	}
	public void setNrVolumit(int nr){
		this.nrVolumit=nr;
	}
	public boolean eshteDigjitale(){
		return true;
	}
	public String toString(){
		return "Journal "+super.toString()+" : "+nrVolumit;
	}
	
}




