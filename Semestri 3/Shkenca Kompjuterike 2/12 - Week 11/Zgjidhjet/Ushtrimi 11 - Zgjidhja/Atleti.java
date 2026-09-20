public abstract class Atleti{
	private int nrRendor;
	private String emri;
	private byte mosha;
	private char gjinia;
	private double distanca;
	private double gjatesiaEPistes;

	public Atleti(int n, String e, byte m, char gj,double gjat) throws AtletiException{
		if(n < 0){
			throw new AtletiException("Nr rendor gabim!");
		}
		nrRendor = n;

		if(e == null || e.trim().isEmpty()){
			throw new AtletiException("Emri gabim!");
		}
		emri = e;

		if(m < 0){
			throw new AtletiException("Mosha gabim!");
		}
		mosha = m;

		if(!(gj == 'M' || gj == 'F')){
			throw new AtletiException("Gjinia gabim!");
		}
		gjinia = gj;

		distanca = 0;

		if(gjat < 0){
			throw new AtletiException("Gjatesia gabim!");
		}
		gjatesiaEPistes = gjat;

	}

	public int getNrRendor(){
		return nrRendor;
	}

	public String getEmri(){
		return emri;
	}
	public void setEmri(String e){
		emri = e;
	}

	public byte getMosha(){
		return mosha;
	}
	public void setMosha(byte e){
		mosha = e;
	}

	public char getGjinia(){
		return gjinia;
	}
	public void setGjinia(char e){
		gjinia = e;
	}

	public double getDistanca(){
		return distanca;
	}
	public void setDistanca(double e) throws AtletiException{
		if(e < 0){
			throw new AtletiException("Distanca gabim!");
		}
		distanca = e;
	}

	public double getGjatesiaEPistes(){
		return gjatesiaEPistes;
	}
	public void setGjatesiaEPistes(double e) throws AtletiException{
		if(e < 0){
			throw new AtletiException("Gjatesia gabim!");
		}
		gjatesiaEPistes = e;
	}


	public abstract void garo();

	public String toString(){
		return nrRendor + " : " + emri 
		+ (gjinia=='M'?" mashkull ":" femer ") + mosha + " vjec";
	}

	public boolean equals(Object o){
		return o instanceof Atleti?((Atleti)o).getNrRendor()==nrRendor:false;
	}

















}