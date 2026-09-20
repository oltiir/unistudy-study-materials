public abstract class StafiAdministrativ extends Punetori{
	public String departamenti;
	
	public StafiAdministrativ(String e, int m, String d)throws PuntoriException{
		super(e,m);
		if(d==null||d.trim().isEmpty()){
			throw new PuntoriException("Eshte e zbrazet");
		}
		departamenti=d;
	}
	
}