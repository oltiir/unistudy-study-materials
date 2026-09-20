public class Dyqani{
	private String emri;
	private Pajisja [] pajisjet;
	private int index;
	static int nrP;
	
	public Dyqani (String e){
		emri = e;
	}
	
	public class Turiela extends Pajisja{
		private int gjatesia;
		public Turiela(int ns, String p, int gj){
			super(ns,p);
			gjatesia = gj;
		}
		public int getGjatsia(){
			return gjatesia;
		}
		public String toString(){
			return "Turiela "+super.toString() +"me shpim"+ gjatesia+ "cm";
		}
	}
	public static class TV extends PajisjaElektrike{
		private boolean eshteHD;
		public TV(int ns, String p, int voltazhi, char kategoriaShpenzuese , boolean eshteHD){
			super(ns, p , voltazhi, kategoriaShpenzuese);
			this.eshteHD = eshteHD;
		}
		public boolean kaBateri(){
			return false;
		}
		public boolean aeshteHD(){
			return eshteHD;
		}
		public String toString(){
			return "TV"+(eshteHD?"HD":"jo HD")+super.toString();
		}
	}
	static{
		nrP=25;
	}
	{
		pajisjet = new Pajisja[nrP];
		Dyqani.TV p1=new Dyqani.TV(1, "LG", 120, 'A', true );
		shtoPajisjen(p1);
	}
	public void shtoPajisjen(Pajisja p){
		for(int i=0;i<index;i++){
			if(pajisjet[i].equals(p)){
				System.out.println("Pajisja ekziston");
				return;
			}
		}
		if(pajisjet.length==index){
			System.out.println("Nuk ka vend ne varg");
			return;
		}
		pajisjet[index++]=p;
	}
	public void shtypHD(boolean hd) {
    boolean gjet = false;

    for(int i = 0; i < index; i++){
        if(pajisjet[i] instanceof TV){
            TV t = (TV) pajisjet[i];

            if(t.aeshteHD() == hd){
                System.out.println(t);
                gjet = true;
            }
        }
    }

}

	public Turiela[] turielatGjatesia(int gj){
		int count = 0;
		for(int i = 0 ; i<index;i++){
			if(pajisjet[i] instanceof Turiela){
				Turiela t = (Turiela)pajisjet[i];
				if(t.getGjatsia() == gj){
					count++;
				}
			}
		}
		Turiela [] temp = new Turiela[count];
		int pos = 0;
		for(int i = 0 ; i<index;i++){
			if(pajisjet[i] instanceof Turiela){
				Turiela t = (Turiela)pajisjet[i];
				if(t.getGjatsia() == gj){
					temp[pos++]=t;
				}
			}
		}
		return temp;
	}
	
			

	public static void main(String[] args) {

    // Krijimi i dyqanit
    Dyqani d = new Dyqani("ABC Shop");

    // ===============================
    // Test: shtoPajisjen()
    // ===============================
    Dyqani.TV tv1 = new Dyqani.TV(1, "LG", 220, 'A', true);
    Dyqani.TV tv2 = new Dyqani.TV(2, "Samsung", 220, 'B', false);

    d.shtoPajisjen(tv1);
    d.shtoPajisjen(tv2);

    // Turiela është NON-STATIC → lidhet me objektin d
    Dyqani.Turiela t1 = d.new Turiela(10, "Bosch", 12);
    Dyqani.Turiela t2 = d.new Turiela(11, "Makita", 12);
    Dyqani.Turiela t3 = d.new Turiela(12, "Black&Decker", 8);

    d.shtoPajisjen(t1);
    d.shtoPajisjen(t2);
    d.shtoPajisjen(t3);

    // Pajisje të tjera elektrike
    d.shtoPajisjen(new Enelaresja(1001, "Bosch", 220, 'A', 8));
    d.shtoPajisjen(new MP3Player(2001, "Sony", 5, 'A', 32));
    d.shtoPajisjen(new MulliriKafes(3001, "Philips", "Alumini"));

    // ===============================
    // Test: shtypHD(true / false)
    // ===============================
    System.out.println("=== TV HD ===");
    d.shtypHD(true);

    System.out.println("=== TV jo HD ===");
    d.shtypHD(false);

    // ===============================
    // Test: turielatGjatesia(int)
    // ===============================
    System.out.println("=== Turiela me gjatesi 12cm ===");
    Dyqani.Turiela[] lista = d.turielatGjatesia(12);

    for (Dyqani.Turiela t : lista) {
        System.out.println(t);
    }
}

}