package com.mycompany.grupi1;

public class Grupi1 {
    public class Grupi11{
        public void printo(){
            System.out.println("Test nga klasa e brendshme");
        }
    }
    public static void main(String[]args){
        Grupi1 g1 = new Grupi1();
        Grupi1.Grupi11 kb = g1.new Grupi11();
        kb.printo();
    }
    
    
}
