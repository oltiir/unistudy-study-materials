public abstract class StafiAdministrativ extends Punetori { 
    protected String departamenti;

    public StafiAdministrativ(String emri, int mosha, String departamenti) throws PunetoriException{
        super(emri, mosha);
        if(departamenti == null || departamenti.trim().isEmpty()){
            throw new PunetoriException("Sbon departamenti me kan empty ose null !");
        }
        this.departamenti = departamenti;
    }
    public boolean angazhimiFullTime(){
        return true;
    }
}