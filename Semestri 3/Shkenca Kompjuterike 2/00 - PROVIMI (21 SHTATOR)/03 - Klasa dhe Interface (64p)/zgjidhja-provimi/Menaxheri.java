// (c) 2 pike - implementon Individi => ka kualifikim
public class Menaxheri extends Punetori implements Individi{
    private String sektori;
    private String kualifikimi;

    public Menaxheri(String e, int m, String s, String k) throws PunetoriException{
        super(e, m);
        if(s == null || s.trim().isEmpty()){
            throw new PunetoriException("Sektori gabim!");
        }
        sektori = s;
        if(k == null || k.trim().isEmpty()){
            throw new PunetoriException("Kualifikimi gabim!");
        }
        kualifikimi = k;
    }

    public String getSektori() {
        return sektori;
    }

    public String getKualifikimin(){
        return kualifikimi;
    }

    public boolean angazhimiFullTime(){
        return true;
    }

    public String toString(){
        return "Menaxheri " + super.toString() + " - " + sektori + " (" + kualifikimi + ")";
    }
}
