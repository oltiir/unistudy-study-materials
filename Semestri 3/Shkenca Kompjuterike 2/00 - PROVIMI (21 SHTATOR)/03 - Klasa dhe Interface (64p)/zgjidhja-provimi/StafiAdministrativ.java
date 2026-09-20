// (d) 4 pike - ABSTRAKTE, prandaj NUK e implementon angazhimiFullTime()
public abstract class StafiAdministrativ extends Punetori{
    private String departamenti;

    public StafiAdministrativ(String e, int m, String d) throws PunetoriException{
        super(e, m);
        if(d == null || d.trim().isEmpty()){
            throw new PunetoriException("Departamenti gabim!");
        }
        departamenti = d;
    }

    public String getDepartamenti() {
        return departamenti;
    }
    public void setDepartamenti(String departamenti) throws PunetoriException{
        if(departamenti == null || departamenti.trim().isEmpty()){
            throw new PunetoriException("Departamenti gabim!");
        }
        this.departamenti = departamenti;
    }
}
