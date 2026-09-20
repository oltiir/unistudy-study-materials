
package com.mycompany.grupi1;

public class KlasaJashtmeLokale {
    
    public void printo(){
         class KBL{
            public void printoKBL(){
                System.out.println("printoKBL");
            }
        }
         KBL k = new KBL();
         k.printoKBL();
    }
    
    public static void main(String[]args){
        KlasaJashtmeLokale kjl = new KlasaJashtmeLokale();
        kjl.printo();
    }
    
}
