public abstract class Libri implements Botohet{
    private String isbn;
    private String titulli;
    private int vitiPublikimit;

    public Libri(String i, String t, int v) throws LibriException{
        if(i == null || i.length() < 13){
            throw new LibriException("ISBN Gabim!");
        }
        isbn = i;
        if(t == null || t.trim().isEmpty()){
            throw new LibriException("Titulli gabim!");
        }
        titulli = t;
        if(v <= 0){
            throw new LibriException("Viti i publikimit gabim!");
        }
        vitiPublikimit = v;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getVitiPublikimit() {
        return vitiPublikimit;
    }
    public void setVitiPublikimit(int vitiPublikimit) throws LibriException {
        if(vitiPublikimit <= 0){
            throw new LibriException("Viti i publikimit gabim!");
        }
        this.vitiPublikimit = vitiPublikimit;
    }

    public String getTitulli() {
        return titulli;
    }
    public void setTitulli(String titulli) throws LibriException {
        if(titulli == null || titulli.trim().isEmpty()){
            throw new LibriException("Titulli gabim!");
        }
        this.titulli = titulli;
    }

    public abstract boolean kaDetyra();

    public String toString(){
        return isbn + ":" + titulli + "-" + vitiPublikimit;
    }

    public boolean equals(Object o){
        return o instanceof Libri?((Libri)o).getIsbn().equals(isbn):false;
    }
}