public class Drejtori extends StafiAdministrativ implements Individi { 
    protected String kualifikimi;

    public Drejtori(String emri, int mosha, String kualifikimi, String departamenti) throws PunetoriException{
        super(emri, mosha, departamenti);
        if(kualifikimi == null || kualifikimi.trim().isEmpty()){
            throw new PunetoriException("Sbon kjo me kan null ose empty!");
        }
    }

    public String getKualifikimin(){
        return kualifikimi;
    }
}