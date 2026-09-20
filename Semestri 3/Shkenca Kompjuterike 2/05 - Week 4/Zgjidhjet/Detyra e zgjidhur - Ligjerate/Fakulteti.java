public class Fakulteti{
	public String drejtimi;
	StafiAkademik[] vargu;
	int index;
	
	public Fakulteti(String d, int nr){
		drejtimi = d;
		vargu = new StafiAkademik[nr];
	}

	public void shtoStafin(StafiAkademik sa){
		if(sa == null){
			System.out.println("");
			return;
		}
		if(index >= vargu.length){
			System.out.println("");
			return;
		}
		for(int i = 0; i < index; i++){
			if(vargu[i].equals(sa)){
				System.out.println("");
			return;
			}
		}
		vargu[index++] = sa;
	}

	public StafiAkademik stafiIRregulltMeIRi(boolean i){
		StafiAkademik sa = null;
		for(int i = 0; i < index; i++){
			if(vargu[i].getIRregullt() == i){
				sa = vargu[i];
			}
		}
		return sa;
	}
	
	public Mesimdhenesi[] mentoretEVitit(int v, boolean m){
		Mesimdhenesi[] vTemp;
		int count = 0;
		for(int i = 0; i < index; i++){
			if(vargu[i] instanceof Mesimdhenesi){
				Mesimdhenesi m = (Mesimdhenesi) vargu[i];
					if(m.mentoron() == m && vargu[i].getVitiLindjes() == v){
						count++;
					}
			}
			
		}
		
		
		
	}
	
	
	
	
}