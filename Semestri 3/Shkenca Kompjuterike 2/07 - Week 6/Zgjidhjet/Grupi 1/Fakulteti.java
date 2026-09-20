
package com.mycompany.grupi1;

public class Fakulteti {
   Mesimdhenesi[] vargu;
   int index;
   public String drejtimi;
   boolean kaDekan;
   static int nrM;
   public Fakulteti(String d){
       drejtimi = d;
   }
   
   class Tutori extends Mesimdhenesi{
       int vitiStudimeve;
        public Tutori(String e, int v, int vitiS){
            super(e,v,"Tutormie");
              vitiStudimeve = vitiS; 
        }
        public boolean mentoron() {
            return false;
        }
       //Tutori i vitit <vitiStudimeve>: <emri> : < vitiLindjes > angazhohet ne <angazhimi>
        public String toString(){
            return "Tutori i vitit : " + vitiStudimeve + " " + super.toString();
        }
   }
   public static class Vizituesi extends Mesimdhenesi{
       int nrOreve;
       public Vizituesi(String e, int v, String a, int nr){
           super(e,v,a);
           nrOreve = nr;
       }
       public boolean mentoron(){
           return true;
       }
       //Mesimdhenesi vizitues <emri> : < vitiLindjes > angazhohet ne <angazhimi> me <nrOreve> ore
       public String toString(){
           return "Mesimdhenesi vizitues " + super.toString() + " me " + nrOreve + " ore";
       }
   }
   static{
       nrM = 25;
   }
   {
       Fakulteti.Vizituesi v = new Fakulteti.Vizituesi("Diar", 2000,"Ligjerata", 10);
       shtoMesimdhenesin(v);
   }
   
   
   public void shtoMesimdhenesin(Mesimdhenesi m){
       if(m == null){
           System.out.println("Nuk eshte shtuar");
               return;
       }
       if(index >= vargu.length){
           System.out.println("Nuk eshte shtuar");
               return;
       }
       for(int i = 0; i < index; i++){
           if(vargu[i].equals(m)){
               System.out.println("Nuk eshte shtuar");
               return;
           }
       }
       vargu[index++] = m;
   }
   
   public void shtoNjeMesimdhenes(String e, int v, String a, boolean m2){
       Mesimdhenesi m = new Mesimdhenesi(e,v,a){
         public boolean mentoron(){
             return m2;
         }
       };
       shtoMesimdhenesin(m);  
   }
   
   public void shtoDekanin(String e, int v){
       class Dekani extends Mesimdhenesi{
           public Dekani(){
               super(e,v,"Menaxhon");
           }
           public boolean mentoron(){
               return true;
           }
           public String toString(){
               return "";
           }
       }
       Dekani d = new Dekani();
        if(!kaDekan){
            shtoMesimdhenesin(d);
            kaDekan = true;
        }
       // else{
       //     kaDekan = false;
       // }
   }
}
