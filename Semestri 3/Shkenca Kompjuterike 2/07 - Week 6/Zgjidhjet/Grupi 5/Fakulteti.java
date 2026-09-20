
package com.mycompany.grupi5;

public class Fakulteti{
	Mesimdhenesi [] vargu;
	int index;
	String drejtimi;
	static int nrM;
	//Dekan d;
	boolean kaDekan;

        // Konstruktori
        public Fakulteti(String d){
            drejtimi = d;
        }
	public class Tutori extends Mesimdhenesi{
            int vitiStudimeve;
            public Tutori(String e, int v,int viti){
                super(e,v,"Tutorime");
                vitiStudimeve = viti;
            }
            public boolean mentoron(){
                return false;
            }
            //Tutori i vitit <vitiStudimeve>: <emri> : < vitiLindjes > angazhohet ne <angazhimi>
            public String toString(){
                return "Tutori i vitit " + vitiStudimeve + " " + super.toString();
            }
        }
        public static class Vizituesi extends Mesimdhenesi{
            int nrOreve;
            public Vizituesi(String e, int v,String a, int nr){
                super(e,v,a);
                nrOreve = nr;
            }
            public boolean mentoron(){
                return true;
            }
            public String toString(){
//Mesimdhenesi vizitues <emri> : < vitiLindjes > angazhohet ne <angazhimi> me <nrOreve> ore

                return "Mesimdhenesi vizitues " + super.toString() + " me " + nrOreve + " ore";
            } 
        }
        static{
            nrM = 25;
        }
        {
            vargu = new Mesimdhenesi[nrM];
            Fakulteti.Vizituesi v = new Fakulteti.Vizituesi("Shpati",2000,"Ligjerata",10);
          shtoMesimdhenesin(v);
        }
        public void shtoMesimdhenesin(Mesimdhenesi m){
            if(m == null){
                 System.out.println("M. nuk eshte vendosur ne varg");
                    return;
            }
            if(index >= vargu.length){
               System.out.println("M. nuk eshte vendosur ne varg");
                    return;  
            }
            for(int i= 0; i < index; i++){
                if(vargu[i].equals(m)){
                    System.out.println("M. nuk eshte vendosur ne varg");
                    return;
                }
            }
            vargu[index++] = m;
        }
        
        
        public void shtoNjeMesimdhenes(String e, int v, String a, boolean mentoron){
            Mesimdhenesi m = new Mesimdhenesi(e,v,a){
                public boolean mentoron(){
                    return mentoron;
                }
            };
            shtoMesimdhenesin(m);
        }
        
       public void shtoDekan(String e, int vl){
           class Dekani extends Mesimdhenesi{
               public Dekani(){
                   super(e,vl,"Menaxher");
               }
               public boolean mentoron(){
                   return true;
               }
           }
           Dekani d = new Dekani();
           if(!kaDekan){
               shtoMesimdhenesin(d);
               kaDekan = true;
           }
           else{
            System.out.println("Fakuleti ka nje dekan");
           }
       } 
        
}
