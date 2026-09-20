public class Ndermarrja {
    private Punetori[] punetoret;

    // (f) 4 pike - pranon numrin e punetoreve dhe krijon vargun
    public Ndermarrja(int nr) throws PunetoriException{
        if(nr <= 0){
            throw new PunetoriException("Numri i punetoreve gabim!");
        }
        punetoret = new Punetori[nr];
    }

    // (g) 2 pike
    public boolean ekziston(Punetori p){
        for(int i = 0; i < punetoret.length; i++){
            if(punetoret[i] != null && punetoret[i].equals(p)){
                return true;
            }
        }
        return false;
    }

    // (h) 5 pike - i inicializuar + nuk ekziston + ka vend te lire
    public void shtoPunetor(Punetori p) throws PunetoriException{
        if(p == null){
            throw new PunetoriException("Punetori nuk eshte i inicializuar!");
        }
        if(ekziston(p)){
            throw new PunetoriException("Punetori " + p.getEmri() + " ekziston!");
        }
        for(int i = 0; i < punetoret.length; i++){
            if(punetoret[i] == null){
                punetoret[i] = p;
                return;               // u shtua, dalim
            }
        }
        throw new PunetoriException("Nuk ka vend te lire!");
    }

    // (i) 8 pike - kualifikime kane vetem ata qe implementojne Individi
    public void getKualifikimet(){
        for(int i = 0; i < punetoret.length; i++){
            if(punetoret[i] instanceof Individi){
                Individi in = (Individi)punetoret[i];
                System.out.println(punetoret[i].getEmri() + " -> " + in.getKualifikimin());
            }
        }
    }

    // (j) 8 pike - a i ka te kater llojet e punetoreve
    public boolean kaTeGjithaLlojet(){
        boolean shoferi = false, koordinatori = false, menaxheri = false, drejtori = false;

        for(int i = 0; i < punetoret.length; i++){
            if(punetoret[i] instanceof Shoferi){
                shoferi = true;
            }else if(punetoret[i] instanceof Koordinatori){
                koordinatori = true;
            }else if(punetoret[i] instanceof Menaxheri){
                menaxheri = true;
            }else if(punetoret[i] instanceof Drejtori){
                drejtori = true;
            }
        }
        return shoferi && koordinatori && menaxheri && drejtori;
    }

    // (k) 2 pike - formati: emri : mosha
    public void shfaq(){
        for(int i = 0; i < punetoret.length; i++){
            if(punetoret[i] != null){
                System.out.println(punetoret[i].getEmri() + " : " + punetoret[i].getMosha());
            }
        }
    }

    // (l) 3 pike
    public static void main(String[] args) {
        try{
            Ndermarrja n = new Ndermarrja(10);

            n.shtoPunetor(new Shoferi("Arb", 30, "Prishtine"));
            n.shtoPunetor(new Shoferi("Bleron", 28, "Prizren"));
            n.shtoPunetor(new Koordinatori("Drita", 35, 4));
            n.shtoPunetor(new Koordinatori("Egzon", 40, 2));
            n.shtoPunetor(new Menaxheri("Fatos", 45, "Shitje", "MSc Ekonomi"));
            n.shtoPunetor(new Menaxheri("Gent", 38, "IT", "BSc Informatike"));
            n.shtoPunetor(new Drejtori("Hana", 50, "Financa", "PhD Menaxhment"));
            n.shtoPunetor(new Drejtori("Ilir", 55, "Burimet Njerezore", "MSc Juridik"));

            System.out.println("--- shfaq() ---");
            n.shfaq();

            System.out.println("--- getKualifikimet() ---");
            n.getKualifikimet();

            System.out.println("--- kaTeGjithaLlojet() ---");
            System.out.println(n.kaTeGjithaLlojet());

            System.out.println("--- ekziston() ---");
            System.out.println(n.ekziston(new Shoferi("Arb", 30, "Prishtine")));
            System.out.println(n.ekziston(new Shoferi("Zana", 30, "Peje")));

            System.out.println("--- testimi i exception-it ---");
            n.shtoPunetor(new Shoferi("Arb", 30, "Gjilan"));   // duplikat

        }catch(PunetoriException e){
            System.out.println("PunetoriException: " + e.getMessage());
        }
    }
}
