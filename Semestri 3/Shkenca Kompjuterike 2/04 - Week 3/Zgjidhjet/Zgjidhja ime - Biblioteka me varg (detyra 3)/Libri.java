public abstract class Libri {
	public int isbn;
	public String titulli;
	public int vitiPublikimit;
	
	
	public Libri(int isbn, String titulli, int vitiPublikimit){
		this.isbn=isbn;
		this.titulli=titulli;
		this.vitiPublikimit=vitiPublikimit;
	
		
	}
	public int getIsbn(){
		return isbn;
	}
	public String getTitulli(){
		return titulli;
	}
	public int getViti(){
		return vitiPublikimit;
	}
	public void setIsbn(int isbn){
		this.isbn=isbn;
	}
	public void setTitulli(String titulli){
		this.titulli=titulli;
	}
	public void setViti(int viti){
    this.vitiPublikimit = viti;
	}

	
	public abstract boolean kaDetyra();
	
	public String toString(){
		return isbn+" : "+titulli+" "+vitiPublikimit;
	}
	public boolean equals(Object obj){
		if (obj == null) return false;

		if(obj instanceof Libri){
			Libri l = (Libri)obj;
			return l.getIsbn()==isbn;
		}
		return false;
	}
}