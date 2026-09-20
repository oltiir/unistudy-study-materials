public class Asistenti extends Mesimdhenesi{
	public String llojiUshtrimeve;
	
	public Asistenti(String e, int vl,String tha){
		super(e,vl,"Ushtrime");
		llojiUshtrimeve = tha;
	}
	public String toString(){
		return "Asistenti " + super.toString() + llojiUshtrimeve;
	}
}