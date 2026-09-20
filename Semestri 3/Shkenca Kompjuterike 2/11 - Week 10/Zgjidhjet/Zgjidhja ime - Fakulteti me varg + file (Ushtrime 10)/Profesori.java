public class Profesori extends Mesimdhenesi implements Angazhohet{
		private String thirrjaAkademike;
		public Profesori(String e, int v, String f, String t) throws MesimdhenesiException{
			super(e,v,f);
			if(t==null|| t.trim().isEmpty()){
				throw new MesimdhenesiException("That");
			}
			thirrjaAkademike=t;
		}
		public String getAngazhimi(){
			return "Ligjerata";
		}
		public boolean mentoron(){
			return true;
		}
		
		public String toString(){
			return "Profesori "+super.toString()+" ,mban "+getAngazhimi()+" ,ka thirrje "+thirrjaAkademike;
		}
		
}