public abstract class Libri{
    private String isbn;
    private String titulli;
    private int vitiPublikimit;

    public Libri(String i, String t, int v ){
        isbn = i;
        titulli = t;
        vitiPublikimit = v;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitulli(){
        return titulli;
    }
    public void setTitulli(String t){
        titulli = t;
    }

    public int getVitiPublikimit(){
        return vitiPublikimit;
    }
    public void setVitiPublikimit(int v){
        vitiPublikimit = v;
    }

    public abstract boolean kaDetyra();

    public String toString(){
        return isbn + " : " + titulli + " - " + vitiPublikimit;
    }

    public boolean equals(Object o){
        return o instanceof Libri?((Libri)o).getIsbn()==isbn:false;
    }
}
/* if(o instanceof Libri){
	Libri l = (Libri)o;
	return l.getIsbn()==isbn;
}return false;
}*/