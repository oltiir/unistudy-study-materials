public class LibriShkollor extends Libri{
	
	public String drejtimi;
	
	public LibriShkollor(int isbn, String titulli, int vitiPublikimit,String drejtimi){
		super(isbn,titulli,vitiPublikimit);
		this.drejtimi=drejtimi;
	}
	
	
	public String getDrejtimi(){
		return drejtimi;
	}
	public void setDrejtimi(String d){
		drejtimi = d;
	}

	public boolean kaDetyra(){
		return true;
	}
	
	public String toString(){
		return "Libri Shkollor "+super.toString()+" : "+drejtimi;
	}
	
}