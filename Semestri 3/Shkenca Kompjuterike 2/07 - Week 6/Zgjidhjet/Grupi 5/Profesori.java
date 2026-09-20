package com.mycompany.grupi5;
public class Profesori extends Mesimdhenesi{
	public String thirrjaAkademike;
	
	public Profesori(String e, int v, String tha){
		super(e,v,"Ligjerata");
		thirrjaAkademike = tha;
	}
	
	public void setThirrjaAkademike(String tha){
		thirrjaAkademike = tha;
	}
	public String getThirrjaAkademike(){
		return thirrjaAkademike;
	}
	//Profesori <emri> : < vitiLindjes> staf (jo) i rregullt, mban <angazhimi>, ka thirrje <thirrjaAkademike> 
	public String toString(){
		return "Profesori " + super.toString() + " ka thirrje " + thirrjaAkademike;
	}
	
	public boolean mentoron(){
		return true;
	}
}