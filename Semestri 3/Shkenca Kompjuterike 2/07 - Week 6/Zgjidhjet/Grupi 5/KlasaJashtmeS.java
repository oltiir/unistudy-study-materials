
package com.mycompany.grupi5;

public class KlasaJashtmeS {
    public static class KlasaBrendshme{
        public void printo(){
            System.out.println("Klasa e brendshme statike");
        }
    }
    
    public static void main(String[]args){
       KlasaJashtmeS.KlasaBrendshme kb = new KlasaJashtmeS.KlasaBrendshme();
       kb.printo();
    }
}
