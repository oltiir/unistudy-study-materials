public abstract class Mesimdhenesi{
	public String emri;
	public int vitiLindjes;
	public String fushaStudimit;
	
	/*
	Mesimdhenesi m = null;
	try{
		m = new Mesimdhenesi();
		m.setFushaStudimit();
	}
	catch(MesimdhenesiException e){
		System.out.println(e);
	}
	
	*/
	
	public Mesimdhenesi(String e, int v, String f) throws MesimdhenesiException{
		if(e == null || e.trim().isEmpty()){
			throw new MesimdhenesiException("Emri nuk duhet te jete null apo i zbrazet");
		}
		if(v < 0){
			throw new MesimdhenesiException("viti i lindjes duhet te jete numer pozitiv");
		}
		if(f == null || f.trim().isEmpty()){
			throw new MesimdhenesiException("Fusha e studimit nuk duhet te jete null apo i zbrazet");
		}
		emri = e;
		vitiLindjes = v;
		fushaStudimit = f;
	}

	public void setFushaStudimit(String fusha)throws MesimdhenesiException{
		if(fusha == null || fusha.trim().isEmpty()){
			throw new MesimdhenesiException("Fusha e studimit nuk duhet te jete null apo i zbrazet");
			
		}
		fushaStudimit = fusha;
		
	}

}