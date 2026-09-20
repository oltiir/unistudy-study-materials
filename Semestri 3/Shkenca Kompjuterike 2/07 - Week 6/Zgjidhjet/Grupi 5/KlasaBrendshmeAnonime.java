package com.mycompany.grupi5;
public class KlasaBrendshmeAnonime {
    public void printo(){
        KlasaAnonime ka = new KlasaAnonime(){
            public boolean kaMesuar(){
                return true;
            }
        };
       System.out.println(ka.kaMesuar());
    }
    public static void main(String[]args){
        KlasaBrendshmeAnonime kba = new KlasaBrendshmeAnonime();
        kba.printo();
    }
}
