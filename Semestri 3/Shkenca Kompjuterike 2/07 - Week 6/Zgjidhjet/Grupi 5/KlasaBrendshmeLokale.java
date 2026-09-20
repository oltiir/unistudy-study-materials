package com.mycompany.grupi5;

public class KlasaBrendshmeLokale {
    public void printo(){
       class Shpati{
            public void printo(){
                    System.out.println("Shpat llegenda");
            }
        }
         Shpati s = new Shpati();
         s.printo();
    }
    public static void main(String[]args){
        KlasaBrendshmeLokale kbl = new KlasaBrendshmeLokale();
        kbl.printo();
    }
}
