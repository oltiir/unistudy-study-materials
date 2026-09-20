import java.util.*;
public class Ndermarrja{
	ArrayList<Punetori> lista;

	public Ndermarrja() throws PunetoriException{
		lista = new ArrayList<Punetori>();
	}		

	public boolean shtoPunetor(Punetori p) throws PunetoriException{
			if(p == null){
				throw new PunetoriException("");
			}
			if(lista.contains(p)){
				throw new PunetoriException("");
			}
		return lista.add(p);
	}

	public void getKualifikimet(){
		for(Punetori p : lista){
			if(p instanceof Individi){
				System.out.println(p);
			}
		}
	}
	/*public ArrayList<Punetori> getKualifikimet(){
		ArrayList<Punetori> temp = new ArrayList<Punetori>();
		for(Punetori p : lista){
			if(p instanceof Individi){
				System.out.println(p);
				temp.add(p);
			}
		}
		return temp;
	}*/
	public boolean kaTeGjithaLlojet(){
		boolean kaShofer = false;
		boolean kaKoordinator = false;
		boolean kaMenaxher = false;
		boolean kaDrejtor = false;
		
		for(Punetori p : lista){
			if(p instanceof Shoferi){
				kaShofer = true;
			}
			if(p instanceof Koordinatori){
				kaKoordinator = true;
			}
			if(p instanceof Menaxheri){
				kaMenaxher = true;
			}
			if(p instanceof Drejtori){
				kaDrejtor = true;
			}
		}
		return kaShofer && kaKoordinator && kaMenaxher && kaDrejtor;
	}
	
	public void shfaq(){
		Iterator it = lista.iterator();
		while(it.hasNext()){
			Punetori p = it.next();
			System.out.println(p.getEmri() + " " + p.getMosha());
		}
	}
}