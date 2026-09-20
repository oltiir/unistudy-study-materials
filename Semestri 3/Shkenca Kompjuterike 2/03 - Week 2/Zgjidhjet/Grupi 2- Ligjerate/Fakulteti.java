public class Fakulteti{
	public String drejtimi;
	public Mesimdhenesi[] vargu;
	public int index;
	
	public Fakulteti(String d, int nr){
		drejtimi = d;
		vargu = new Mesimdhenesi[nr];
	}
	
	public boolean ekziston(Mesimdhenesi m){
		for(int i = 0; i < index; i++){
			if(vargu[i].equals(m)){
				return true;
			}
		}
		return false;
	}

	public void shtoMesimdhenesin(Mesimdhenesi m){
			if(m == null){
				System.out.println("");
				return;
			}
			if(index >= vargu.length){
				System.out.println("");
				return;
			}
			if(ekziston(m)){
				System.out.println("");
				return;
			}
			vargu[index++] = m;
	}
	
	public Profesori profesoriMeIRi(){
		Profesori iRi = null;
		for(int i = 0; i < index; i++){
			if(vargu[i] instanceof Profesori){
				Profesori p = (Profesori)vargu[i];
				if(iRi == null || p.getVitiLindjes() >= iRi.getVitiLindjes()){
					iRi = p;
				}
			}
		}
		return iRi;
	}
	
	public void shtypLlojinEUshtrimeve(){
		
		
	}
	

}