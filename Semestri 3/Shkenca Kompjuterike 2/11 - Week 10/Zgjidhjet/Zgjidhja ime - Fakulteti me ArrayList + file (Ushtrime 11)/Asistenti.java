public class Asistenti extends Mesimdhenesi implements Angazhohet{
	private String llojiUshtrimeve;
	
	public Asistenti(String e, int v, String f, String l)throws MesimdhenesiException{
		super(e,v,f);
		if(l==null|| l.trim().isEmpty()){
				throw new MesimdhenesiException("That");
			}
		llojiUshtrimeve=l;
	}
	public String getAngazhimi(){
		return "Ushtrime";
	}
	public boolean mentoron(){
		return false;
	}
	public String getLlojiUshtrimeve(){
		return llojiUshtrimeve;
	}

	public String toString(){
		return "Asistenti "+super.toString()+" mban "+getAngazhimi()+" "+llojiUshtrimeve;
	}
	
}