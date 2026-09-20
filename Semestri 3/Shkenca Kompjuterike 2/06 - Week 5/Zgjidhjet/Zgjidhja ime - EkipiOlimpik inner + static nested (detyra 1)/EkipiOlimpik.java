public class EkipiOlimpik{
	private String emri;
	private Sportisti [] sportistet;
	private int index;
	static int nrS;
	
	public EkipiOlimpik(String e){
		emri=e;
	}
	private class HedhesiGjyles extends Atleti{
		private int peshaTrupore;
		public HedhesiGjyles(int id, String e, byte m, char gj, int nrM,int pT){
			super(id,e,m,gj,nrM);
			peshaTrupore=pT;
		}
		public boolean garonIndividualisht(){
			return true;
		}
		public int getPeshaTrupore(){
			return peshaTrupore;
		}
		public void setPeshaTrupore(int pT){
			peshaTrupore=pT;
		}
		public String toString(){
			return "Hedhesi Gjyles 	me "+peshaTrupore+" kg - "+super.toString();
		}
	}
	public static class Mundesi extends Sportisti{
		private char kategoria;
		
		public Mundesi(int id, String e, byte m, char gj,char k){
			super(id,e,m,gj);
			kategoria=k;
		}
		public boolean garonIndividualisht(){
			return true;
		}
		public char getKategoria(){
			return kategoria;
		}
		public void setKategoria(char k){
			kategoria=k;
		}
		public String toString(){
			return "Mundesi i kategorise se "+
			(kategoria=='L'?"Lehte":(kategoria=='M'?"Mesem":"Rende"))+" "+super.toString();
		}
		
	}
	static{
		nrS=25;
	}
	{
		sportistet = new Sportisti[nrS];
		EkipiOlimpik.Mundesi m1=new EkipiOlimpik.Mundesi(12,"Mundesi1",(byte)22,'M','L');
		shtoSportistin(m1);
	}
	public void shtoSportistin(Sportisti s){
		if(s==null){
			System.out.println("Sportisti nuk eshte inicializuar");
			return;
		}
		for(int i=0;i<index;i++){
			if(sportistet[i].equals(s)){
				System.out.println("Sportisti ekziston");
				return;
			}
		}
		if(index==sportistet.length){
			System.out.println("Nuk ka vend ne varg");
			return;
		}
		sportistet[index++]=s;
	}
	public void shtypKategorine(char kategoria){
		for(int i=0;i<index;i++){
			if(sportistet[i] instanceof Mundesi && ((Mundesi)sportistet[i]).getKategoria()==kategoria){
				System.out.println(sportistet[i]);
			}
		}
	}
	public HedhesiGjyles[] hedhesitPesha(int pesha){
		int count=0;
		
		for(int i=0;i<index;i++){
			if(sportistet[i] instanceof HedhesiGjyles){
				HedhesiGjyles h=(HedhesiGjyles)sportistet[i];
				if(h.getPeshaTrupore()==pesha){
					count++;
				}
			}
		}
		HedhesiGjyles [] temp=new HedhesiGjyles[count];
		int pozita=0;
		for(int i=0;i<index;i++){
			if(sportistet[i] instanceof HedhesiGjyles){
				HedhesiGjyles h=(HedhesiGjyles)sportistet[i];
				if(h.getPeshaTrupore()==pesha){
					temp[pozita++]=h;
				}
			}
		}
		return temp;
	}
	public void printAll(){
		for(int i=0;i<index;i++){
			System.out.println(sportistet[i]);
		}
	}
	public static void main(String [] a){
		EkipiOlimpik eo=new EkipiOlimpik("Kosova Team");
		Futbollisti s1=new Futbollisti(121,"Futbollisti1",(byte)22,'M',11);
		Futbollisti s2=new Futbollisti(2,"Futbollisti1",(byte)22,'M',11);
		Futbollisti s3=new Futbollisti(3,"Futbollisti1",(byte)22,'M',11);
		
		Sportisti s4=eo.new HedhesiGjyles(4,"Hedhesi1",(byte)21,'F',11,60);
		HedhesiGjyles s5=eo.new HedhesiGjyles(5,"Hedhesi3",(byte)21,'F',11,60);
		Sportisti s6=eo.new HedhesiGjyles(6,"Hedhesi5",(byte)21,'F',11,60);
		
		eo.shtoSportistin(s1);
		eo.shtoSportistin(s2);
		eo.shtoSportistin(s3);
		eo.shtoSportistin(s4);
		eo.shtoSportistin(s5);
		eo.shtoSportistin(s6);
		eo.printAll();
		System.out.println("----------------");
		EkipiOlimpik eo2=new EkipiOlimpik("Albania Team");
		eo2.printAll();
	}
}