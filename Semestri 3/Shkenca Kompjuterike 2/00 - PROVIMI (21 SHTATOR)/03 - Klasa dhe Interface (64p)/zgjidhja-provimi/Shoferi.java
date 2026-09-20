// (c) 2 pike - regjioni eshte READONLY => vetem get, pa set
public class Shoferi extends Punetori{
    private String regjioni;

    public Shoferi(String e, int m, String r) throws PunetoriException{
        super(e, m);
        if(r == null || r.trim().isEmpty()){
            throw new PunetoriException("Regjioni gabim!");
        }
        regjioni = r;
    }

    public String getRegjioni() {
        return regjioni;
    }

    public boolean angazhimiFullTime(){
        return true;
    }

    public String toString(){
        return "Shoferi " + super.toString() + " - " + regjioni;
    }
}
