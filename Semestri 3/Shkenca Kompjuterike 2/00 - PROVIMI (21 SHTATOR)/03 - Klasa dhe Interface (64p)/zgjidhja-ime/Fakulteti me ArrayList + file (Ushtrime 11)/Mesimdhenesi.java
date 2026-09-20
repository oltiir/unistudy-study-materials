public abstract class Mesimdhenesi{
	private String emri;
	private int vitiLindjes;
	private String fushaStudimit;
	
	public Mesimdhenesi(String e, int v, String f)throws MesimdhenesiException{
		if(v<1950){
			throw new MesimdhenesiException("Viti me i vogel se 1950");
			}
		if(e==null|| e.trim().isEmpty()){
				throw new MesimdhenesiException("Emri that");
			}
		if(f==null|| f.trim().isEmpty()){
				throw new MesimdhenesiException("Fusha that");
			}
		emri=e;
		vitiLindjes=v;
		fushaStudimit=f;
	}
	public String getEmri(){
		return emri;
	}
	public int getVitiLindjes(){
		return vitiLindjes;
	}
	public String getFusha(){
		return fushaStudimit;
	}
	
	public String toString(){
		return emri+" : "+ vitiLindjes+" me fushe studimi "+fushaStudimit;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Mesimdhenesi){
			Mesimdhenesi m = (Mesimdhenesi)obj;
			if(m.getEmri().equals(emri) && m.getVitiLindjes()==vitiLindjes){
				return true;
			}
		}
		return false;
	}
}