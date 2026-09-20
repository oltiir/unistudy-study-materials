package com.mycompany.grupi5;
public class KlasaJashtme {
    public class KlasaBrendshme{
        public void printo(){
            System.out.println("Klasa brendshme");
        }
    }
    
    public static void main(String[]args){
        KlasaJashtme kj = new KlasaJashtme();
        KlasaJashtme.KlasaBrendshme kb = kj.new KlasaBrendshme();
        kb.printo();
        
    }
}
