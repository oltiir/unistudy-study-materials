/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grupi5;

/**
 *
 * @author Blerim-Z
 */
public class CounterRunSync implements Runnable{
    CounterSync c;
    String emri;
    
    public CounterRunSync(CounterSync c1, String e){
        c = c1;
        emri = e;
    }
    
    @Override
    public void run() {
        synchronized (System.out) {
           c.inc(); //1
        System.out.println(Thread.currentThread().getName() + " " + c.ktheVleren()); //1
        c.dec(); //0
       System.out.println(Thread.currentThread().getName() + " " + c.ktheVleren()); //0 
        }
    }
}
