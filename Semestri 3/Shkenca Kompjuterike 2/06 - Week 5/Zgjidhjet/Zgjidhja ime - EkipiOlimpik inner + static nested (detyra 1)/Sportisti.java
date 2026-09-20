public abstract class Sportisti{
	protected int id;
	protected String emri;
	protected byte mosha;
	protected char gjinia;

	public Sportisti(int id, String e, byte m, char gj){
		this.id = id;
		emri = e;
		mosha = m;
		gjinia = gj;
	}

	public int getId(){
		return id;
	}

	public String getEmri(){
		return emri;
	}
	public void setEmri(String em){
		emri = em;
	}

	public byte getMosha(){
		return mosha;
	}
	public void setMosha(byte mo){
		mosha = mo;
	}

	public char getGjinia(){
		return gjinia;
	}
	public void setGjinia(char gj){
		gjinia = gj;
	}

	public abstract boolean garonIndividualisht();

	public boolean equals(Object obj){
		return obj instanceof Sportisti?(((Sportisti)obj).getId()==id):false;
	}

	public String toString(){
		return id + " : " + emri + (gjinia=='M'?" mashkull ":(gjinia=='F'?" femer ":" gabim "))
			+ mosha + " vjec";
	}





















}