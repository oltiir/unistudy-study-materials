public abstract class PajisjaElektrike extends Pajisja{
	private int voltazhi;
	private char kategoriaShpenzuese;
	
	  public PajisjaElektrike(int ns, String p, int voltazhi, char kategoriaShpenzuese) {
        super(ns, p); 
        this.voltazhi = voltazhi;
        this.kategoriaShpenzuese = kategoriaShpenzuese;
    }
	

	public abstract boolean kaBateri();
	
	public String toString(){
		return super.toString()+" "+voltazhi+" - "+kategoriaShpenzuese;
	}
	
}