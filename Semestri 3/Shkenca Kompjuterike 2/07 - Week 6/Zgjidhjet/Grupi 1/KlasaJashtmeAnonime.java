package com.mycompany.grupi1;
public class KlasaJashtmeAnonime {
    
    public void printo(){
        Beni b = new Beni(){
            public boolean meson(){
                return true;
            }
        };
       System.out.println(b.meson());
    }
    public static void main(String[]args){
        KlasaJashtmeAnonime kja = new KlasaJashtmeAnonime();
        kja.printo();
    }
}
