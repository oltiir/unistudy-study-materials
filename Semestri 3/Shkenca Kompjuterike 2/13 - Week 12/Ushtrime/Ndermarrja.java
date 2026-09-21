public class Ndermarrja { 
    protected Punetori[] punetoret;
    protected int index;

    public Ndermarrja(int kapaciteti){
        punetoret = new Punetori[kapaciteti];
    }
    

    public boolean ekziston(Punetori p){
        if (p == null) return false;
        
        for(int i = 0; i < index; i++){
            if(punetoret[i].equals(p)){
                return true;
            }
        }
        return false;   
    }

    public boolean shtoPunetorin(Punetori p){
        if(p == null){
            return false;
        }
        if(index <= 0){
            return false;
        }
        if(ekziston(p)){
            return false;
        }
        punetoret[index] = p;
        index++;
        return true;
    }

    public void getKualifikimet(){
        for(int i = 0; i < punetoret.length; i++){
            if(punetoret[i] instanceof Individi in){
                System.out.println(punetoret[i].getEmri() + " -> " + in.getKualifikimin());
            }
        }
    }

}