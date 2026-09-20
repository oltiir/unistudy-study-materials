public abstract class Publikimi{
	private String isbn;
	private String titulli;
	private int vitiPublikimit;
	
	public Publikimi(String i,String t,int v){
		isbn=i;
		titulli=t;
		vitiPublikimit=v;
	}
	public String getIsbn(){
		return isbn;
	}
	public String getTitulli(){
		return titulli;
	}
	public int getVitiPublikimit(){
		return vitiPublikimit;
	}
	public void setTitulli(String t){
		titulli=t;
	}
	public void setVitiPublikimit(int v){
		vitiPublikimit=v;
	}
	public abstract boolean eshteDigjitale();
	public String toString(){
		return isbn+" : "+titulli+" - "+vitiPublikimit;
	}
	public boolean equals(Object obj){
		return obj instanceof Publikimi ? ((Publikimi)obj).getIsbn().equals(isbn) : false;
	}
	
}




