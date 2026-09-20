public abstract class Pajisja implements Perdoret{
	private int numriSerik;
	private String prodhuesi;
	private int voltazhi;
	private char kategoriaShpenzuese;
	
	public Pajisja(int nS, String p, int v, char kS){
		numriSerik=nS;
		prodhuesi=p;
		voltazhi=v;
		kategoriaShpenzuese=kS;
	}
	
	public abstract boolean kaBateri();
	public int getVoltazhi(){
		return voltazhi;
	}
	public int getNrSerik(){
		return numriSerik;
	}
	public String toString(){
		return numriSerik+" : "+prodhuesi+" "+voltazhi+" - "+kategoriaShpenzuese;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Pajisja){
			Pajisja p = (Pajisja)obj;
			return p.getNrSerik()==numriSerik;
		}
		return false;
	}
}