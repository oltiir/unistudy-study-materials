public class Profesori extends Mesimdhenesi{
	public String thirrjaAkademike;
	
	public Profesori(String e, int v, boolean i,  String tha){
		super(e,v,i,"Ligjerata");
		thirrjaAkademike = tha;
	}
	// Profesori p = new Profesori("");

	public boolean mentoron(){
		return true;
	}
	//Profesori <emri> : < vitiLindjes> staf (jo) i rregullt, mban <angazhimi>, ka thirrje <thirrjaAkademike> 
	public String toString(){
		return "Profesori " + super.toString()  + " ka thirrje " + thirrjaAkademike;
	}

}