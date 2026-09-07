public class Asistenti extends Mesimdhenesi{
	public String llojiUshtrimeve;
	
	public Asistenti(String e, int v, boolean i, String tha){
		super(e,v,i,"Ushtrime");
		llojiUshtrimeve = tha;
	}

	public boolean mentoron(){
		return false;
	}
	//Asistenti <emri> : < vitiLindjes> staf (jo) i rregullt, mban <angazhimi>,<llojiUshtrimeve> 
	public String toString(){
		return "Asistenti " + super.toString()  + "  " + llojiUshtrimeve;
	}

}