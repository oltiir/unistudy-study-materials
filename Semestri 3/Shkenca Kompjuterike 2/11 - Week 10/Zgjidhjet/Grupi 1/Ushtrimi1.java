import java.util.*;

public class Ushtrimi1{
	public static void main(String[]args){
		ArrayList<String> lista = new ArrayList<String>();
			lista.add("Test 1");
			lista.add("Test 2");
			lista.add("Test 3");
			
			System.out.println(lista);
			System.out.println("------");

			Iterator <String> itr = lista.iterator();
			//System.out.println(itr.hasNext());
			//System.out.println(itr.next());
				while(itr.hasNext()){
					System.out.println(itr.next());
				}
			System.out.println("-------");
			for(String e : lista){
				System.out.println(e);
			}
				
	}
	
	
	
	
}
