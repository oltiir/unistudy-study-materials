public abstract class StafiAdministrativ extends Punetori{
	public String departamenti;
	
	public StafiAdministrativ(String e, int m, String d) throws PunetoriException{
		super(e,m);
		departamenti = d;
	}
	
	
}