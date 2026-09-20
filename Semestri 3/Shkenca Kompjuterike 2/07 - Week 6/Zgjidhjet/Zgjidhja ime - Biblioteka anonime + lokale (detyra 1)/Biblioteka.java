public class Biblioteka{
	private String emri;
	private Libri [] librat;
	private int index;
	static int nrL;
	boolean kaRegjister=false;
	
	public Biblioteka(String e){
		emri=e;
	}
	private class Romani extends Libri{
		private String zhanri;
		public Romani(String i, String t, int v,String z){
			super(i,t,v);
			zhanri=z;
		}
		public String getZhanri(){
			return zhanri;
		}
		public void setZhanri(String z){
			zhanri=z;
		}
		public boolean kaDetyra(){
			return false;
		}
		public String toString(){
			return "Romani i zhanrit "+zhanri+" "+super.toString();
		}
	}
	public static class Fjalori extends Libri{
		private int numriFjaleve;
		public Fjalori(String i, String t, int v,int nr){
			super(i,t,v);
			numriFjaleve=nr;
		}
		public int getNumriFjaleve(){
			return numriFjaleve;
		}
		public void setNumriFjaleve(int nr){
			numriFjaleve=nr;
		}
		public boolean kaDetyra(){
			return false;
		}
		public String toString(){
			return "Fjalori "+super.toString()+" me "+numriFjaleve+" fjale";
		}
	}
	static{
		nrL=150;
	}
	{
		librat=new Libri[nrL];
		Biblioteka.Fjalori f1= new Biblioteka.Fjalori("11111","Fjalori shqip-shqip",2005,570);
		shtoLibrin(f1);
	}
	public boolean ekziston(Libri l){
		for(int i=0;i<index;i++){
			if(librat[i].equals(l)){
				return true;
			}
		}
		return false;
	}
	public void shtoLibrin(Libri l){
		if(ekziston(l)){
			System.out.println("Libri ekziston");
		}else if(index==librat.length){
			System.out.println("Nuk ka vend");
		}else{
			librat[index++]=l;
		}
	}
	public void shtoNjeLiber(String i,String t,int v,boolean kD){
		Libri l = new Libri(i,t,v){
			public boolean kaDetyra(){
				return kD;
			}
		};
		shtoLibrin(l);
	}
	public void shtoRegjistrin(String i,String t){
		class Regjistri extends Libri{
			public Regjistri(){
				super(i,t,2025);
			}
			public boolean kaDetyra(){
				return false;
			}
		}
		//me rendesi
		Regjistri r=new Regjistri();
		if(!kaRegjister){
		shtoLibrin(r);
		kaRegjister=true;
		}else{
			System.out.println("Aktualisht ka regjister");
		}
	}
	public Fjalori avgNumriFjaleve(){
		Fjalori f=null;
		for(int i=0;i<index;i++){
			if(librat[i] instanceof Fjalori){
				Fjalori temp=(Fjalori)librat[i];
				if(f==null||temp.getNumriFjaleve()>=f.getNumriFjaleve()){
					f=temp;
				}
			}
		}
		return f;
	}
	public void shtypDetyrat(boolean kD){
		for(int i=0;i<index;i++){
			if(librat[i].kaDetyra()==kD){
				System.out.println(librat[i]);
			}
		}
	}
	public void printAll(){
		for(int i=0;i<index;i++){
			System.out.println(librat[i]);
		}
	}
	public static void main(String [] a){
		Biblioteka biblioteka=new Biblioteka("UBT Library");
		Biblioteka biblioteka2=new Biblioteka("AAB Library");
		
		Libri l1 = new LibriShkollor("123-a","LibriSHkollor1",2014,"Teknologji");
		Libri l2 = new LibriShkollor("124-a","LibriSHkollor2",2014,"Teknologji");
		Libri l3 = new LibriShkollor("125-a","LibriSHkollor3",2014,"Teknologji");
		
		Romani l4=biblioteka.new Romani("234-s","Romani1",2010,"Komedi");
		Romani l5=biblioteka.new Romani("235-s","Romani2",2010,"Komedi");
		Romani l6=biblioteka.new Romani("236-s","Romani3",2010,"Komedi");
		
		biblioteka.shtoLibrin(l1);
		biblioteka.shtoLibrin(l2);
		biblioteka.shtoLibrin(l3);
		biblioteka.shtoLibrin(l4);
		biblioteka.shtoLibrin(l5);
		biblioteka.shtoLibrin(l6);
		biblioteka.shtoNjeLiber("555-d","Libri Gjenerik",2020,false);
		biblioteka.shtoRegjistrin("666-a","Regjistri 1");
		biblioteka.shtoRegjistrin("667-a","Regjistri 2");
		biblioteka.printAll();
		biblioteka2.printAll();
	}
}