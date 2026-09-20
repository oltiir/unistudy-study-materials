public class MulliriKafes extends Pajisja{
	
	private String materiali;
	
	public MulliriKafes(int ns, String p, String materiali){
		super(ns, p);
		this.materiali=materiali;
	}
	
	public String toString(){
		return "Mulliri i kafes prej "+materiali+" - "+super.toString();
	}
}