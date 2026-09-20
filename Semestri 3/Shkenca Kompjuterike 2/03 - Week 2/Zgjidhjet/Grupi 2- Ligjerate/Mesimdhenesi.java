public class Mesimdhenesi{
	public String emri; //readonly
	public int vitiLindjes;
	public String angazhimi;
	
	// konstruktori
	public Mesimdhenesi(String e, int v, String a){
		emri = e;
		vitiLindjes = v;
		angazhimi = a;
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
	
	public void setAngazhimi(String a){
		angazhimi = a;
	}
	public String getAngazhimi(){
		return angazhimi;
	}
	
	public String toString(){
		return emri + " : " + vitiLindjes + " " + angazhimi;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Mesimdhenesi){
			Mesimdhenesi m = (Mesimdhenesi)obj;
			if(emri.equals(m.getEmri()) &&
			   vitiLindjes == m.getVitiLindjes()){
				   return true;
			   }
		}
		return false;
	}
}

