public class Profesori extends Mesimdhenesi{
	public String thirrjaAkademike;
	
	public Profesori(String e, int vl,String tha){
		super(e,vl,"Ligjerata");
		thirrjaAkademike = tha;
	}
	public String toString(){
		return "Profesori " + super.toString() + " ka thirrje " + thirrjaAkademike;
	}
}