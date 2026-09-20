public class LibriShkollor extends Libri implements Botohet{
		
	private String drejtimi;
	public LibriShkollor(int i, String t, int v, String d) throws LibriException{
		super(i,t,v);
		if(d == null || d.trim().isEmpty()){
			throw new LibriException("Drejtimi nuk guxon te jete i zbrazet");
			}
		drejtimi=d;
	}

	public boolean kaKopertina(){
		return false;
	}
	public boolean eshteMeNgjyra(){
		return false;
	}
	public boolean kaDetyra(){
		return true;
	}
	public String getDrejtimi(){
		return drejtimi;
	}
	public String toString(){
		return "Libri shkollor "+super.toString()+" : "+drejtimi;
	}
}