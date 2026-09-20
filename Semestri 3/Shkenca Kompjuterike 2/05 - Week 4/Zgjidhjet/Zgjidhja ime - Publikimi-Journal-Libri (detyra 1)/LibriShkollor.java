public class LibriShkollor extends Libri{
	private String drejtimi;
	
	public LibriShkollor(String i,String t,int v,int nr,String drejtimi){
		super(i,t,v,nr);
		this.drejtimi=drejtimi;
	}
	public String getDrejtimi(){
		return drejtimi;
	}
	public void setDrejtimi(String d){
		drejtimi=d;
	}
	public boolean kaDetyra(){
		return true;
	}
	public String toString(){
		return "Libri shkollor "+super.toString()+" : "+drejtimi;
	}
	
}




