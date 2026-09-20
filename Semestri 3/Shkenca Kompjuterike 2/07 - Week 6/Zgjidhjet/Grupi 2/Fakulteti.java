public class Fakulteti{
	Mesimdhenesi[] vargu;
	int index;
	static int nrM;
	boolean kaDekan;
	String drejtimi;
	
	public Fakulteti(String d){
		drejtimi = d;
	}		

	static{
		nrM = 25;
	}
	
	{
		vargu = new Mesimdhenesi[nrM];
		Fakulteti.Vizituesi v = new Fakulteti.Vizituesi("Emri",2000,"Ligjerata",10);
		shtoMesimdhenesin(v);
	}
	
	public class Tutori extends Mesimdhenesi{
		public int vitiStudimeve;
		
		public Tutori(String e, int v, int vs){
			super(e,v,"Tutorime");
			vitiStudimeve = vs;
		}
		
		public boolean mentoron(){
			return false;
		}
	}

	public static class Vizituesi extends Mesimdhenesi{
		public int nrOreve;
		public Vizituesi(String e, int v, String a, int nr){
			super(e,v,a);
			nrOreve = nr;
		}
		public boolean mentoron(){
			return true;
		}
	}
	
	public void shtoMesimdhenesin(Mesimdhenesi m){
			if(m == null ){
				System.out.println("Nuk mund te shtohet");
				return;
			}
			if(index >= vargu.length){
				System.out.println("Nuk mund te shtohet");
				return;
			}
			for(int i = 0; i < index; i++){
				if(vargu[i].equals(m)){
					System.out.println("Nuk mund te shtohet");
					return;
				}
			}
			vargu[index++] = m;
	}

	public void shtoNjeMesimdhenes(String e, int v, String a, boolean ment){
			Mesimdhenesi m = new Mesimdhenesi(e,v,a){
				public boolean mentoron(){
					return ment;
				}
			};
			shtoMesimdhenesin(m);
	}
	
	public void shtoDekanin(String e, int v){
		class Dekani extends Mesimdhenesi{
			public Dekani(){
				super(e,v,"Menaxhim");
			}
			public boolean mentoron(){
				return true;
			}
		}
		Dekani d = new Dekani();
		if(!kaDekan){
			shtoMesimdhenesin(d);
			kaDekan = true;
		}
		else{
			System.out.println("Ka dekan");
		}
	}
	
	
	
	
}