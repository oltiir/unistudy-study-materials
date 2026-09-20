public class Dyqani {//pytje, detyra 2 i?
	private String emri;
	private Pajisja [] pajisjet;
	static int nrP;
	private int index ;
	
	public Dyqani(String emri){
		this.emri = emri;	
		pajisjet = new Pajisja[nrP];
		index = 0;
		
		Dyqani.TV t1 = new Dyqani.TV(1,"Brendi",210,'A',false);
		shtoPajisjen(t1);
	}
	public class Turiela extends Pajisja{
		private int gjatesia ;
		public Turiela(int ns, String p, int gjatesia){
			super(ns,p);
			this.gjatesia=gjatesia;
		}
		public String toString(){
			return "Turiela "+super.toString()+ " me shpim "+gjatesia + "cm";
		}
	}
	public static class TV extends PajisjaElektrike{
		private boolean eshteHD;
		public TV(int ns, String p, int voltazhi,char kategoriaShpenzuese,boolean eshteHD){
			super(ns, p, voltazhi, kategoriaShpenzuese);
			this.eshteHD = eshteHD;
		}
		
		public boolean kaBateri(){
			return false;
		}
		
		public String toString(){
			return "TV"+(eshteHD?"HD":"jo HD")+super.toString();
		}
	}
	static{
		nrP=35;
	}
	/*{
	Dyqani.TV t1 = new Dyqani.TV(1,"Brendi",210,'A',false);
	shtoPajisjen(t1);
	}*/
	public void shtoPajisjen(Pajisja p){
		for(int i = 0; i<index; i++){
			if(pajisjet[i].equals(p)){
				System.out.println("Eshte ne varg");
				return;
			}
		}
		if(index>=pajisjet.length){
			System.out.println("Ska vend");
			return;
		}
			pajisjet[index++]=p;
			System.out.println("Eshte shtuar me sukses");
	}
	
	public void shtoNjePajisjeElektrike(int ns, String p, int voltazhi, char kategoriaShpenzuese, boolean kaBateri){
		PajisjaElektrike p1 = new PajisjaElektrike(ns,p,voltazhi,kategoriaShpenzuese){
			public boolean kaBateri(){
				return kaBateri;
			}
		};
		shtoPajisjen(p1);
	}
	public void shtoFshese(int ns, String p, int voltazhi, char kategoriaShpenzuese,int shpenzimiNeVat){
		 class Fshesa extends PajisjaElektrike {
			private int shpenzimiNeVat;
			public Fshesa(int ns, String p, int voltazhi, char kategoriaShpenzuese, int shpenzimiNeVat ){
				super(ns,p,voltazhi,kategoriaShpenzuese);
				this.shpenzimiNeVat=shpenzimiNeVat;
			}
			public boolean kaBateri(){
				return false;
			}
			public String toString(){
				return "Fshesa "+super.toString()+" shpenzon "+shpenzimiNeVat+" vat";
			}
			
		
		}
		Pajisja f1 = new Fshesa(ns,p,voltazhi,kategoriaShpenzuese, shpenzimiNeVat);
		shtoPajisjen(f1);
	}
	public void shtypPajisjetElektrike(boolean bateria){
		
		for(int i = 0; i<index;i++){
		if(pajisjet[i] instanceof PajisjaElektrike){
			PajisjaElektrike pe = (PajisjaElektrike) pajisjet[i];
			if(pe.kaBateri()== bateria){
				System.out.println(pe);
				}
			}
		}
	}
	public Pajisja avgMemoria(){
		MP3Player m = null;
		for(int i = 0; i<index;i++){
			if(pajisjet[i] instanceof MP3Player){
				MP3Player temp =(MP3Player) pajisjet[i];
				if(m==null||temp.getMemoria()<=m.getMemoria()){
					m=temp;
				}
			}
		}
		return m;
	}
	public static void main(String[] args) {

        Dyqani d = new Dyqani("ABC Shop");

        d.shtoNjePajisjeElektrike(1, "Radio Sony", 220, 'A', true);   // me bateri
        d.shtoNjePajisjeElektrike(2, "Fshes Dyson", 220, 'A', false); // pa bateri

        d.shtoFshese(3, "Fshese Beko", 220, 'B', 1800);

        Dyqani.TV tv1 = new Dyqani.TV(4, "LG", 220, 'A', true);
        d.shtoPajisjen(tv1);

        MP3Player mp1 = new MP3Player(10, "Sony MP3", 120,'C',10);
        MP3Player mp2 = new MP3Player(11, "Philips MP3", 120,'B',20);
        MP3Player mp3 = new MP3Player(12, "Apple iPod", 120,'A',40); // më pak ose e barabartë

        d.shtoPajisjen(mp1);
        d.shtoPajisjen(mp2);
        d.shtoPajisjen(mp3);

        System.out.println("=== Pajisjet elektrike ME bateri ===");
        d.shtypPajisjetElektrike(true);

        System.out.println("=== Pajisjet elektrike PA bateri ===");
        d.shtypPajisjetElektrike(false);
 
    }
}