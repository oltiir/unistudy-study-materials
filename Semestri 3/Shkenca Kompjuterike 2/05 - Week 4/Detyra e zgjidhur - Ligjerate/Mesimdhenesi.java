public abstract class Mesimdhenesi extends StafiAkademik{
	public String angazhimi;
	
	public Mesimdhenesi(String e, int v, boolean i, String a){
		super(e,v,i);
		angazhimi = a;
	}
	
	public abstract boolean mentoron();
	
	//<emri> : < vitiLindjes > staf (jo) i rregullt mban <angazhimi>
	public String toString(){
		return  super.toString() + " mban " + angazhimi;
	}
	


}