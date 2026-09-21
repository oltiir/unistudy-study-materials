public class EkipiOlimpik1{ 

    protected String emri;
    public Sportisti1[] sportistet;
    protected int index;

    public EkipiOlimpik1(String emri, int kapaciteti){
        this.emri = emri;
        this.index = 0;
        this.sportistet = new Sportisti1[kapaciteti];
    }
    
    public boolean ekziston(Sportisti1 s){
        if(s == null){
            System.out.println("Sportisti eshte null ! ");
            return false;
        }
        for(int i = 0; i < index; i++){
            if(sportistet[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    public boolean shtoSportistin(Sportisti1 s){
        if(s == null){
            System.out.println("Ju lutem shkrauni nje sportist si duhet !");
            return false;
        }
        if(index == sportistet.length){
            System.out.println("Ska vend ne varg! ");
            return false;
        } 
        if(ekziston(s)){
            System.out.println("Sportisti ekziston");
            return false;
        }
        sportistet[index] = s;
        index++; 
        return true;
    }

    public void shtypSipasGjinise(Gjinia1 gjinia){
        for(int i = 0; i < index; i++){
            if(sportistet[i].getGjinia() == gjinia){
                System.out.println(sportistet[i]);
            }
        }
    }

    public Sportisti1 meIVjetri(){
        if(index == 0){
            System.out.println("Ekipi eshte i zbrazet");
            return null;
        }
        if(index == 1){
            return sportistet[0];
        }
        int meIVjetri = sportistet[0].getMosha();
        int pozita = 0;
        for(int i=1; i < index; i++){
            if(sportistet[i].getMosha() > meIVjetri){
                meIVjetri = sportistet[i].getMosha();
                pozita = i;
            }
        }
        return sportistet[pozita];
    }

    public boolean largoSportistin(Sportisti1 s){
        if(s == null){
            return false;
        }

        for(int i = 0; i < index; i++){
            if(sportistet[i].equals(s)){
                for(int k = i; k < index - 1; k++){
                    sportistet[k] = sportistet[k + 1];
                }
                sportistet[index - 1] = null;
                index--;
                return true;
            }
        }
        return false;
    }

    public Sportisti1[] ktheSipasEmrit(String start){
        if(start == null){
            return new Sportisti1[0];
        }

        String search = start.toLowerCase();

        int count = 0;
        for(int i = 0; i < index; i++){
            if(sportistet[i].getEmri().toLowerCase().startsWith(search)){
                count++;
            }
        }

        Sportisti1[] rezultati = new Sportisti1[count];
        int pozita = 0;
        for(int i = 0; i < index ; i++){
            if(sportistet[i].getEmri().toLowerCase().startsWith(search)){
                rezultati[pozita] = sportistet[i];
                pozita++;
            }
        }
        return rezultati;
    }

    public static void main(String[] args){
        EkipiOlimpik1 e1 = new EkipiOlimpik1("Kosova Team", 25);

        Sportisti1 s1 = new Sportisti1(1, "Majlinda", 33, Gjinia1.F);
        Sportisti1 s2 = new Sportisti1(2, "Distria", 24, Gjinia1.F);
        Sportisti1 s3 = new Sportisti1(3, "Akil", 27, Gjinia1.M);
        Sportisti1 s4 = new Sportisti1(4, "Nora", 33, Gjinia1.F);
        Sportisti1 s5 = new Sportisti1(5, "Driton", 19, Gjinia1.M);

        System.out.println("s1 u shtua? " + e1.shtoSportistin(s1));
        System.out.println("s2 u shtua? " + e1.shtoSportistin(s2));
        System.out.println("s3 u shtua? " + e1.shtoSportistin(s3));
        System.out.println("s4 u shtua? " + e1.shtoSportistin(s4));
        System.out.println("s5 u shtua? " + e1.shtoSportistin(s5));

        System.out.println("A ekziston s2? " + e1.ekziston(s2));
  System.out.println("A shtohet s1 prapë? " + e1.shtoSportistin(s1));

  System.out.println("Sportistet femra:");
  e1.shtypSipasGjinise(Gjinia1.F);

  System.out.println("Me i vjetri: " + e1.meIVjetri());

  System.out.println("Emrat qe fillojne me D:");
  for (Sportisti1 s : e1.ktheSipasEmrit("D")) {
      System.out.println(s);
  }

  System.out.println("U largua s2? " + e1.largoSportistin(s2));
  System.out.println("A ekziston s2 tash? " + e1.ekziston(s2));

    }

}
