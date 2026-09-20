public class EkipiOlimpik{
    String emri;
    private Sportisti[] sportistet;
    int index = 0;

    public EkipiOlimpik(String e, int nrS)throws SportistiException{
		if(e==null||e.trim().isEmpty()){
			throw new SportistiException("Emri i ekipit nuk duhet te jete i zbrazet");
		}
        emri = e;
		if(nrS<=0){
			throw new SportistiException("Numri i sportisteve duhet te jete pozitiv");
		}
        sportistet = new Sportisti[nrS];
    }

    public boolean ekziston(Sportisti s) throws SportistiException{
		if(s==null){
			throw new SportistiException("Sportisti nuk duhet te jete null");
		}
        for(int i = 0; i < index; i++){
            if(s.equals(sportistet[i])){
                return true;
            }
        }
        return false;
    }

    public void shtoSportistin(Sportisti s)throws SportistiException{
		if(s==null){
			throw new SportistiException("Sportisti nuk duhet te dergohet null");
		}
		if(ekziston(s)){
			throw new SportistiException("Sportisti ekziston");
		}
		if(index==sportistet.length){
			throw new SportistiException("Nuk ka vend ne varg");
		}
		sportistet[index++]=s;
    }

    public void shtypMeRekuizite() throws SportistiException{
        if(index == 0){
            throw new SportistiException("Nuk ka sportista!");
        }
        for(int i = 0; i < index; i++){
            if(sportistet[i] instanceof Rekuizita){
                System.out.println(sportistet[i]);
            }
        }
    }

    public Atleti[] atletetAvgMosha(){
        int count = 0, shuma = 0;
        for(int i = 0; i < index; i++){
            if(sportistet[i] instanceof Atleti){
                count++;
                shuma += sportistet[i].getMosha();
            }
        }

        if(count == 0){
            return null;
        }

        double avg = (double) shuma/count;

        int countAtl = 0;
        for(int i = 0; i < index; i++){
            if(sportistet[i] instanceof Atleti){
                if(((Atleti)sportistet[i]).getMosha() > avg){
                    countAtl++;
                }
            }
        }
    
        if(countAtl == 0){
            return null;
        }

        Atleti[] atl = new Atleti[countAtl];
        int pozita = 0;
        for(int i = 0; i < index; i++){
            if(sportistet[i] instanceof Atleti){
                if(((Atleti)sportistet[i]).getMosha() > avg){
                    atl[pozita++] = (Atleti)sportistet[i];
                }
            }
        }

        return atl;

    }

    public Sportisti sportistiMeTop(){
        Sportisti meTop = null;

        for(int i = 0; i < index; i++){
            //ose - if(sportistet[i] instanceof Futbollisti)
            if(sportistet[i] instanceof Rekuizita){
                meTop = sportistet[i];
            }
        }

        return meTop;
    }



    public static void main(String [] args){
		EkipiOlimpik ekipi=null;
		try{
			ekipi=new EkipiOlimpik("Kosova Team",50);
			//EkipiOlimpik ekipi=new EkipiOlimpik("Kosova Team",50);
			Futbollisti f1=new Futbollisti(111,"Futbollisti1",25,'M',11);
			Futbollisti f2=new Futbollisti(-2,"Futbollisti2",25,'M',11);
			Futbollisti f3=new Futbollisti(113,"Futbollisti3",25,'M',11);
			System.out.println("test");
			ekipi.shtoSportistin(f1);
			ekipi.shtoSportistin(f2);
			ekipi.shtoSportistin(f3);
		}catch(SportistiException e){
			System.out.println(e.getMessage());
		}
		try{
			Vrapuesi v1=new Vrapuesi(222,"Vrapuesi 1",19,'F',5,400);
			Vrapuesi v2=new Vrapuesi(223,"Vrapuesi 2",19,'F',5,400);
			Vrapuesi v3=new Vrapuesi(224,"Vrapuesi 3",19,'F',5,400);
			System.out.println("test2");
			ekipi.shtoSportistin(v1);
			ekipi.shtoSportistin(v2);
			ekipi.shtoSportistin(v3);
		}catch(SportistiException e){
			e.printStackTrace();
		}finally{
			System.out.println("Finally");
		}
    }
}