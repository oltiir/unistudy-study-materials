public class Biblioteka{
	private String emri;
	private Publikimi [] publikimet;
	private int index;
	
	public Biblioteka(String e,int nr){
		emri=e;
		publikimet=new Publikimi[nr];
	}
	public void shtoPublikimin(Publikimi p){
		for(int i=0;i<index;i++){
			if(publikimet[i].equals(p)){
				System.out.println("Publikimi ekziston");
				return;
			}
		}
		if(publikimet.length==index){
			System.out.println("Nuk ka vend ne varg");
			return;
		}
		publikimet[index++]=p;
	}
	public Publikimi digjitaliMeIVjeter(boolean eshteDigjital){
		Publikimi temp=null;
		for(int i=0;i<index;i++){
			if(publikimet[i].eshteDigjitale()==eshteDigjital){
				if(temp==null||publikimet[i].getVitiPublikimit()<temp.getVitiPublikimit()){
					temp=publikimet[i];
				}
			}
		}
		return temp;
	}
	public Libri[] libratDetyra(boolean kaDetyra){
		int count=0;
		for(int i=0;i<index;i++){
			if(publikimet[i] instanceof Libri){
				Libri l=(Libri)publikimet[i];
				if(l.kaDetyra()==kaDetyra){
					count++;
				}
			}
		}
		Libri [] temp=new Libri[count];
		int index2=0;
		for(int i=0;i<index;i++){
			if(publikimet[i] instanceof Libri){
				Libri l=(Libri)publikimet[i];
				if(l.kaDetyra()==kaDetyra){
					temp[index2++]=l;
				}
			}
		}
		return temp;
	}
	
	public void shtypJournalVolum(int nr){
		for(int i=0;i<index;i++){
			if(publikimet[i] instanceof Journal){
				Journal l=(Journal)publikimet[i];
				if(l.getNrVolumit()==nr){
					System.out.println(publikimet[i]);
				}
			}
		}
	}
	public void printAll(){
		for(int i=0;i<index;i++){
				System.out.println(publikimet[i]);
		}
	}
	public static void main(String [] arg){
		Biblioteka biblioteka=new Biblioteka("UBT",1000);
		
		Publikimi j1=new Journal("111-a","Journal 1",2002,11);
		Publikimi j2=new Journal("112-a","Journal 1",2002,11);
		Publikimi j3=new Journal("113-a","Journal 1",2002,10);
		Publikimi j4=new Journal("114-a","Journal 1",2002,11);
		
		LibriShkollor l1=new LibriShkollor("221-a","Libri Shkollor 1",2010,150,"Programim");
		LibriShkollor l2=new LibriShkollor("222-a","Libri Shkollor 2",2010,150,"Programim");
		LibriShkollor l3=new LibriShkollor("223-a","Libri Shkollor 3",2010,150,"Programim");
		
		Enciklopedia e1=new Enciklopedia("331-a","Enciklopedia 1",2015,180,7);
		Enciklopedia e2=new Enciklopedia("332-a","Enciklopedia 2",2015,180,7);
		Enciklopedia e3=new Enciklopedia("333-a","Enciklopedia 3",2015,180,7);
		
		biblioteka.shtoPublikimin(j1);
		biblioteka.shtoPublikimin(j2);
		biblioteka.shtoPublikimin(j3);
		biblioteka.shtoPublikimin(j4);
		
		biblioteka.shtoPublikimin(l1);
		biblioteka.shtoPublikimin(l2);
		biblioteka.shtoPublikimin(l3);
		
		biblioteka.shtoPublikimin(e1);
		biblioteka.shtoPublikimin(e2);
		biblioteka.shtoPublikimin(e3);
		
		biblioteka.printAll();
		System.out.println("-----------------");
		System.out.println(biblioteka.digjitaliMeIVjeter(true));
		System.out.println("-----------------");
		Libri [] temp=biblioteka.libratDetyra(true);
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
		System.out.println("-----------------");
		biblioteka.shtypJournalVolum(11);
		//System.out.println(((Journal)j1).getNrVolumit());
	}
	
}