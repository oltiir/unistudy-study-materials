public abstract class Libri {
	private int isbn;
	private String titulli;
	private int vitiPublikimit;
	
	public Libri(int i, String t, int v) throws LibriException {
    if(i <= 0) throw new LibriException("ISBN duhet te jete pozitiv");
    if(t == null || t.trim().isEmpty()) throw new LibriException("Titulli nuk guxon te jete i zbrazet");
    if(v <= 0) throw new LibriException("Viti publikimit duhet te jete pozitiv");

    isbn = i;
    titulli = t;
    vitiPublikimit = v;
}

	public int getIsbn(){
		return isbn;
	}
	public String getTitulli(){
		return titulli;
	}
	public int getVitiPublikimit(){
		return vitiPublikimit;
	}
	public abstract boolean kaDetyra();
	public String toString(){
		return isbn+" : "+titulli+" - "+vitiPublikimit;
	}
	public boolean equals(Object obj){
		if(obj instanceof Libri){
			Libri l = (Libri)obj;
			return l.getIsbn()==isbn;
		}
		return false;
	}
}