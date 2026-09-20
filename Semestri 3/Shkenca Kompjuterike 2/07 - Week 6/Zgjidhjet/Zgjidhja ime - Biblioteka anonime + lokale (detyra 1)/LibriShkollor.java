public class LibriShkollor extends Libri{
    private String drejtimi;

    public LibriShkollor(String isbn, String ti, int v, String d){
        super(isbn, ti, v);
        drejtimi = d;
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
        return "Libri shkollor " + super.toString() + " : " + drejtimi;
    }

}
