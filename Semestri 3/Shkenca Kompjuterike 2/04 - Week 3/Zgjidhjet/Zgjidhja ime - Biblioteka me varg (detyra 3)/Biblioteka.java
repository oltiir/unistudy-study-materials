public class Biblioteka{
	private String emri;
	private Libri [] vargu;
	private int index;
	
	public Biblioteka(String emri, int nr){
		this.emri=emri;
		vargu = new Libri[nr];
	}
	
	public boolean ekziston(Libri l){
		for(int i=0;i<index;i++){
			if(vargu[i].equals(l)){
				return true;
			}
		}
		return false;
	}
	public void shtoLibrin(Libri l){
		if(l==null){
			System.out.println("Libri nuk eshte i inicializuar");
			return;
		}
		if(ekziston(l)){
			System.out.println("Libri ekziston");
			return;
		}
		if(index==vargu.length){
			System.out.println("Nuk ka vend ne varg");
			return;
		}
		vargu[index++]=l;
	}
	
	public Libri meIRiuMeDetyra(){
		Libri meIRi = null;
		for(int i =0;i<index;i++){
			if(vargu[i].kaDetyra()){
				if(meIRi==null ||meIRi.getViti() < vargu[i].getViti()){
						meIRi = vargu[i];
				}
			}
		}
		return meIRi;
	}
	
	public Libri[] shtypLibratEVitit(int a){
		int count = 0;
		for(int i = 0; i< index; i++){
			if(vargu[i].getViti()==a){
				count++;
			}
		}
		Libri [] temp = new Libri[count];
		int j = 0;
		for(int i = 0; i< index; i++){
			if(vargu[i].getViti()==a){
				temp[j]=vargu[i];
					j++;
				}
			}
		return temp;
	} 
	public Enciklopedia [] shtypEnciklopediaTitulli(String a){
		int count = 0;
		for (int i = 0; i < index; i++) {
        if (vargu[i] instanceof Enciklopedia) {
            Enciklopedia e = (Enciklopedia) vargu[i];
            if (e.getTitulli().startsWith(a)) {
                count++;
            }
        }
    }	
		Enciklopedia [] temp = new Enciklopedia[count];
		int j =0;
		for (int i = 0; i < index; i++) {
        if (vargu[i] instanceof Enciklopedia) {
            Enciklopedia e = (Enciklopedia) vargu[i];
            if (e.getTitulli().startsWith(a)) {
                temp[j] = e;
                j++;
            }
        }
    }
		return temp;
	}
	
	public Libri[] ktheSipasDrejtimit(String d) {
    int count = 0;

   
    for (int i = 0; i < index; i++) {
        if (vargu[i] instanceof LibriShkollor) {
            LibriShkollor ls = (LibriShkollor) vargu[i];

            if (ls.getDrejtimi().equals(d) &&
                ls.getViti() >= 2012 &&
                ls.getViti() <= 2017) {
                count++;
            }
        }
    }

    Libri[] temp = new Libri[count];
    int j = 0;
    for (int i = 0; i < index; i++) {
        if (vargu[i] instanceof LibriShkollor) {
            LibriShkollor ls = (LibriShkollor) vargu[i];

            if (ls.getDrejtimi().equals(d) &&
                ls.getViti() >= 2012 &&
                ls.getViti() <= 2017) {

                temp[j] = ls;
                j++;
            }
        }
    }

    return temp;
}
 public boolean fshijLibrin(Libri l){
	for(int i = 0; i<index;i++){
		if(vargu[i].equals(l)){
		for (int j = i; j < index - 1; j++) {
               vargu[j] = vargu[j + 1];
            }
		
			vargu[index-1]=null;
			index--;
			return true;
		}
	}
	return false;
 }
 public static void main(String[] args) {
        Biblioteka b = new Biblioteka("UBT Library", 20);

        Libri l1 = new LibriShkollor(1001, "Matematika 1", 2012, "Shkenca natyrore");
        Libri l2 = new LibriShkollor(1002, "Programimi në Java", 2015, "Inxhinieri");
        Libri l3 = new LibriShkollor(1003, "Fizika 2", 2017, "Shkenca natyrore");
        Libri l4 = new LibriShkollor(1004, "Algoritmet", 2019, "Inxhinieri");

        Libri e1 = new Enciklopedia(2001, "Enciklopedia e Shkencës", 2010, 5);
        Libri e2 = new Enciklopedia(2002, "Enciklopedia e Historisë", 2013, 3);
        Libri e3 = new Enciklopedia(2003, "Enciklopedia e Teknologjisë", 2016, 4);

        b.shtoLibrin(l1);
        b.shtoLibrin(l2);
        b.shtoLibrin(l3);
        b.shtoLibrin(l4);
        b.shtoLibrin(e1);
        b.shtoLibrin(e2);
        b.shtoLibrin(e3);

      
    }
}
