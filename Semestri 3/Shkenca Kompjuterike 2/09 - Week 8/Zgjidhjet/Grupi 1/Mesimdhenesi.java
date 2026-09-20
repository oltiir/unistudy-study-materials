public abstract class Mesimdhenesi{
	public String emri;
	public int vitiLindjes;
	public String fushaStudimit;
	public Mesimdhenesi(String e, int v, String fsh) throws Exception{
			if(e == null || e.trim().isEmpty()){
				throw new Exception("Duhet te keni nje emer");
			}
			if(v < 0){
				throw new Exception("Duhet te jete pozitiv");
			}
			if(fsh == null || fsh.trim().isEmpty()){
				throw new Exception("Duhet te keni nje fushe te studimit");
			}
		emri = e;
		vitiLindjes = v;
		fushaStudimit = fsh;
	}


	public void setVitiLindjes(int v)throws Exception{
			if(v < 0){
				throw new Exception("Duhet te jete pozitiv");
			}
			vitiLindjes = v;
	}
}