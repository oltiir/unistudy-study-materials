public abstract class StafiAkademik{
	public String emri;
	public int vitiLindjes;
	public boolean iRregullt;
	
	public StafiAkademik(String e, int v, boolean i){
		emri = e;
		vitiLindjes = v;
		iRregullt = i;
	}
	public String getEmri(){
		return emri;
	}
	public void setVitiLindjes(int viti){
		vitiLindjes = viti;
	}
	public int getVitiLindjes(){
		return vitiLindjes;
	}
	
	public void setIRregullt(boolean i){
		iRregullt = i;
	}
	public boolean getIRregullt(){
		return iRregullt;
	}
	
	// <emri> : < vitiLindjes > staf (jo) i rregullt
	public String toString(){
		return emri + " : " + vitiLindjes +
		(iRregullt? "staf i rregullt":"staf jo i rregullt");
	}
	
	public boolean equals(Object obj){
		if(obj instanceof StafiAkademik){
			StafiAkademik sa = (StafiAkademik) obj;
			if(emri.equals(sa.getEmri()) &&
			vitiLindjes == sa.getVitiLindjes()){
				return true;
			}
		}
		return false;
	}
}