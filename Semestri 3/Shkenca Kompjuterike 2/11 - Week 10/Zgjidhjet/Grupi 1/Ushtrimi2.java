import java.util.*;

public class Ushtrimi2{
	public static void main(String[]args){
		LinkedList<String> lista = new LinkedList<String>();
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
