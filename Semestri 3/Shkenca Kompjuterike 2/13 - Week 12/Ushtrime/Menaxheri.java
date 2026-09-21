public class Menaxheri extends Punetori implements Individi { 
    protected String sektori;
    protected String kualifikimi;

    public Menaxheri(String emri, int mosha, String sektori, String kualifikimi) throws PunetoriException{
        super(emri, mosha);
        if(sektori == null || sektori.trim().isEmpty()){
            throw new PunetoriException("Smun me kan sektori null ose empty");
        }
        this.sektori = sektori;
        if(kualifikimi == null || kualifikimi.trim().isEmpty()){
            throw new PunetoriException("Sbon me kan kualifikimi empty ose null");
        }
        this.kualifikimi = kualifikimi;
    }

    public String getSektori(){
        return sektori;
    }

    public String getKualifikimin (){
        return kualifikimi;
    }

     public boolean angazhimiFullTime() {
         return true;
     }
}