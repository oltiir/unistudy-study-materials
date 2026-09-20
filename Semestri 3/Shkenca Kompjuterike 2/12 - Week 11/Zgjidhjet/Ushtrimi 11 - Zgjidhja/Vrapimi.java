import java.util.*;

public class Vrapimi{
	private double gjatesiaEPistes;
	private ArrayList<Atleti> atletet;

	public Vrapimi(double gj) throws AtletiException{
		if(gj < 100){
			throw new AtletiException("Gjatesia gabim!");
		}
		gjatesiaEPistes = gj;
		atletet = new ArrayList<Atleti>();
	}

	public void shtoAtletin(Atleti a) throws AtletiException{
		if(atletet.contains(a)){
			throw new AtletiException(a + " ekziston!");
		}else{
			atletet.add(a);
		}
	}

	public void shtypAtletet(){
		Iterator<Atleti> itr = atletet.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
 	}

 	public void filloGaren(){
 		Iterator<Atleti> itr = atletet.iterator();

 		while(itr.hasNext()){
 			Atleti a = itr.next();
 			Vrapuesi v = (Vrapuesi)a;
 			Thread th = new Thread(v);
 			if(v.getNrMedaljeve() > 3){
 				th.setPriority(10);
 			}
 			th.start();
 		}
  	}

  	public static void main(String [] args){
  		try{
  			Vrapimi v = new Vrapimi(800);

  			Vrapuesi v1 = new Vrapuesi(1, "V1", (byte)20, 'F', v.gjatesiaEPistes, (byte)3);
  			Vrapuesi v2 = new Vrapuesi(2, "V2", (byte)20, 'F', v.gjatesiaEPistes, (byte)7);
  			Vrapuesi v3 = new Vrapuesi(3, "V3", (byte)20, 'F', v.gjatesiaEPistes, (byte)3);
  			Vrapuesi v4 = new Vrapuesi(4, "V4", (byte)20, 'F', v.gjatesiaEPistes, (byte)5);
  			Vrapuesi v5 = new Vrapuesi(5, "V5", (byte)20, 'F', v.gjatesiaEPistes, (byte)3);
  			Vrapuesi v6 = new Vrapuesi(6, "V6", (byte)20, 'F', v.gjatesiaEPistes, (byte)4);
  			Vrapuesi v7 = new Vrapuesi(7, "V7", (byte)20, 'F', v.gjatesiaEPistes,(byte)3);
  			Vrapuesi v8 = new Vrapuesi(8, "V8", (byte)20, 'F', v.gjatesiaEPistes,(byte)1);

  			v.shtoAtletin(v1);
  			v.shtoAtletin(v2);
  			v.shtoAtletin(v3);
  			v.shtoAtletin(v4);
  			v.shtoAtletin(v5);
  			v.shtoAtletin(v6);
  			v.shtoAtletin(v7);
  			v.shtoAtletin(v8);

  			v.shtypAtletet();

  			System.out.println("========================");

  			v.filloGaren();

  		}catch(Exception e){
  			e.printStackTrace();
  		}
  	}





}