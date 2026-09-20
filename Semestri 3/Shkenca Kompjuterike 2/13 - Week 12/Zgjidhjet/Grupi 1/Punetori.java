public abstract class Punetori{
	public String emri;
	public int mosha;
	
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
	
	public void setMosha(int m) throws PunetoriException{
		if(m < 0){
				throw new PunetoriException("");
		}
		mosha = m;
	}
	public int getMosha(){
		return mosha;
	}
	
	public abstract boolean angazhimiFullTime();
	
	
}