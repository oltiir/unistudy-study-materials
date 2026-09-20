
public class Asistenti extends Mesimdhenesi{
	public String llojiUshtrimeve;
	
	public Asistenti(String e, int v, String tha){
		super(e,v,"Ushtrime");
		llojiUshtrimeve = tha;
	}
	
	public void setLlojiUshtrimeve(String tha){
		llojiUshtrimeve = tha;
	}
	public String getLlojiUshtrimeve(){
		return llojiUshtrimeve;
	}
	//Asistenti <emri> : < vitiLindjes> staf (jo) i rregullt, mban <angazhimi>,  <llojiUshtrimeve> 
	public String toString(){
		return "Asistenti " + super.toString() + "  " + llojiUshtrimeve;
	}
	
	public boolean mentoron(){
		return false;
	}
}