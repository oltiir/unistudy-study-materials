import java.util.*;
public class Ndermarrja{
	ArrayList<Punetori> lista;
	
	public Ndermarrja()throws PunetoriException{
		lista = new ArrayList<Punetori>();
	}

	public boolean shtoPunëtor(Punetori p) throws PunetoriException{
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
	
	public boolean kaTeGjithaLlojet(){
		boolean kaShofer = false;
		boolean kaMenaxher = false;
		boolean kaKoordinator = false;
		for(Punetori p : lista){
			if(p instanceof Shoferi){
				kaShofer = true;
			}
			if(p instanceof Menaxheri){
				kaMenaxher = true;
			}
			if(p instanceof Koordinatori){
				kaKoordinator = true;
			}
		}
		return kaShofer && kaMenaxher && kaKoordinator;	
	}
	
	public void shfaq(){
		Iterator it = lista.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	
}