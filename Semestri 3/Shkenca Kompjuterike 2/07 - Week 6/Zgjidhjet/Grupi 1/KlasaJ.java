
package com.mycompany.grupi1;

public class KlasaJ {
    
    public static class KlasaB{
        public void printo(){
            System.out.println("Print nga klasa e brendshme statike");
        }
    }
    
    public static void main(String[]args){
        KlasaJ.KlasaB kb = new KlasaJ.KlasaB();
        kb.printo();
    }
}
