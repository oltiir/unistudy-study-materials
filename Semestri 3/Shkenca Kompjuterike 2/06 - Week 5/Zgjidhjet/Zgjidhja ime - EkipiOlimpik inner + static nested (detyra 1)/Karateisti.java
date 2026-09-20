public class Karateisti extends Sportisti{
	private String stili;

	public boolean garonIndividualisht(){
		return true;
	}

	public Karateisti(int id, String e, byte m, char gj,String st ){
		super(id, e, m, gj);
		stili = st;
	}

	public String getStili(){
		return stili;
	}
	public void setStili(String s){
		stili = s;
	}

	public String toString(){
		return "Karateisti me stil " + stili + " - " + super.toString();
	}

}