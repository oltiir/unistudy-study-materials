public class Dekani extends StafiAkademik{
	public String gradaAkademike;
	
	public Dekani(String e, int v, String ga){
			super(e,v,true);
			gradaAkademike = ga;
	}
	//Dekani d = new Dekani("emri",2000,"Prof. Dr.");
	
	public void setGradaAkademike(String g){
		gradaAkademike = g;
	}
	public String getGradaAkademike(){
		return getGradaAkademike;
	}
	
	public String toString(){
		return "Dekani " + gradaAkademike + " " + super.toString();
	}
}