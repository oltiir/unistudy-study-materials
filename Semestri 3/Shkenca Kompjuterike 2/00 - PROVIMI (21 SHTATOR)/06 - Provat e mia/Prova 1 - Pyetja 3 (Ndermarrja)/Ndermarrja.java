public class Ndermarrja{
	private Punetori [] puntoret;
	private int index;
	private int nrP;
	public Ndermarrja(int nrP){
		puntoret = new Punetori[nrP];
		index = 0;
	}
	public boolean ekziston(Punetori p){
		
		for(int i = 0; i<index;i++){
		if(puntoret[i].equals(p)){
			return true;
			}
		}
		return false;
	}
	public void shtoPuntor(Punetori p){
		if(p==null){
			System.out.println("Puntori eshte null");
			return;
		}
		if(ekziston(p)){
			System.out.println("Puntori ekziston");
			return;
		}
		if(puntoret.length==index){
			System.out.println("Vargu eshte full");
			return;
		}
		puntoret[index++]=p;
	}
	public void getKualifikimet() {
    for(int i = 0; i < index; i++){
        if(puntoret[i] instanceof Individi){
            System.out.println(puntoret[i].toString());
        }
    }
}

	public boolean kaTeGjithaLlojet(){
		boolean d = false;
		boolean m = false;
		boolean k = false;
		boolean sh= false;
		for(int i = 0; i<index;i++){
			if(puntoret[i] instanceof Drejtori){d = true;}
			if(puntoret[i] instanceof Menaxheri){m = true;}
			if(puntoret[i] instanceof Koordinatori){k = true;}
			if(puntoret[i] instanceof Shoferi){sh = true;}
		}
		return d && m && k && sh;
	}
	
	public void shfaq(){
    for(int i = 0; i < index; i++){ 
        Punetori p = puntoret[i];
        System.out.println(p.getEmri() + " : " + p.getMosha());
    }
	}
	public static void main (String [] args){
		Ndermarrja n = null;
		try{
			n = new Ndermarrja(10);
			Shoferi s1 = new Shoferi("Alban",20,"Ferizaj");
			Shoferi s2 = new Shoferi("Mehmet",28,"Prizren");
			Koordinatori k1 = new Koordinatori("Armend",29,2);
			Koordinatori k2 = new Koordinatori("Hakif",38,3);
			Menaxheri m1 = new Menaxheri("Sefi", 26,"Rroba","Regjional");
			Menaxheri m2 = new Menaxheri("Muharrem", 66,"Dekor","Regjional");
			Drejtori d1 = new Drejtori ("Driton",50,"Arsim","PhD");
			Drejtori d2 = new Drejtori ("Naser",52,"Kulture","MSc");
			
			n.shtoPuntor(s1);
			n.shtoPuntor(s2);
			n.shtoPuntor(k1);
			n.shtoPuntor(k2);
			n.shtoPuntor(m1);
			n.shtoPuntor(m2);
			n.shtoPuntor(d1);
			n.shtoPuntor(d2);
			
		System.out.println("Te gjitha punetoret:");
        n.shfaq();
		
		System.out.println("\nPunetoret me kualifikime:");
        n.getKualifikimet();
			
		System.out.println("\nA ka te gjitha llojet? " + (n.kaTeGjithaLlojet()?"PO":"JO"));
		
		}catch (PuntoriException e){
			System.out.println(e.getMessage());
		}
	}
}