// (e) 5 pike - trashegon StafiAdministrativ DHE implementon Individi
public class Drejtori extends StafiAdministrativ implements Individi{
    private String kualifikimi;

    public Drejtori(String e, int m, String d, String k) throws PunetoriException{
        super(e, m, d);
        if(k == null || k.trim().isEmpty()){
            throw new PunetoriException("Kualifikimi gabim!");
        }
        kualifikimi = k;
    }

    public String getKualifikimin(){
        return kualifikimi;
    }

    public boolean angazhimiFullTime(){
        return true;
    }

    public String toString(){
        return "Drejtori " + super.toString() + " - " + getDepartamenti() + " (" + kualifikimi + ")";
    }
}
