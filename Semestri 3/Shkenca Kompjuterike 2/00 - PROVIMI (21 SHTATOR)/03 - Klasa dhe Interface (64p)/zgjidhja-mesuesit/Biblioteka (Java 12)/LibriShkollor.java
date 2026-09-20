public class LibriShkollor extends Libri{
    private String drejtimi;

    public LibriShkollor(String i, String t, int v, String d) throws LibriException{
        super(i, t, v);
        if(d == null || d.trim().isEmpty()){
            throw new LibriException("Drejtimi gabim!");
        }
        drejtimi = d;
    }

    public String getDrejtimi() {
        return drejtimi;
    }
    public void setDrejtimi(String drejtimi) throws LibriException {
        if(drejtimi == null || drejtimi.trim().isEmpty()){
            throw new LibriException("Drejtimi gabim!");
        }
        this.drejtimi = drejtimi;
    }

    public boolean kaDetyra(){
        return true;
    }

    public boolean kaKopertina(){
        return false;
    }

    public boolean eshteMeNgjyra(){
        return false;
    }

    public String toString(){
        return "Libri Shkollor " + super.toString() + " : " + drejtimi;
    }
}
