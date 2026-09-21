public class Shoferi extends Punetori { 
    protected String regjioni;

    public Shoferi (String emri, int mosha, String regjioni) throws PunetoriException{
        super(emri, mosha);
        if(regjioni == null || regjioni.trim().isEmpty()){
            throw new PunetoriException("Regjioni nuk mundet me kan empty ose null !");
        }
        this.regjioni = regjioni;
    }

    public String getRegjioni(){
        return regjioni;
    }

    public boolean angazhimiFullTime(){
        return true;
    }
}