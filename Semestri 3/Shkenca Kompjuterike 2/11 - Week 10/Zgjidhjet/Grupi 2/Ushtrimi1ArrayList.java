import java.util.*;
public class Ushtrimi1ArrayList{
	public static void main(String[]args){
		ArrayList<String> lista = new ArrayList<String>();
			lista.add("Grupi 2");
			lista.add("Te Henen");
			lista.add("kemi mesim");
			lista.add("ne ora 09:00");
			System.out.println(lista);
			System.out.println("    ");
			System.out.println("------ Iterator -----");
			Iterator it = lista.iterator();
		//it.next();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		
		
			System.out.println("    ");
			System.out.println("------ for each -----");
			
		for(String emri : lista){
			System.out.println(emri);
		}
		
	}



}