public abstract class Punetori{
	String emri;
	int mosha;
	
	public Punetori(String e, int m) throws PunetoriException{
		if(e == null || e.trim().isEmpty()){
			throw new PunetoriException("");
		}
		if(m < 0){
			throw new PunetoriException("");
		}
		emri = e;
		mosha = m;
	}

	public void setEmri(String e) throws PunetoriException{
		if(e == null || e.trim().isEmpty()){
			throw new PunetoriException("");
		}
		emri = e;
	}
	public String getEmri(){
		return emri;
	}
	
	public void setMosha(int m ) throws PunetoriException{
		if(m < 0){
			throw new PunetoriException("");
		}
		mosha = m;
	}
	
	public abstract boolean angazhimiFullTime();

}