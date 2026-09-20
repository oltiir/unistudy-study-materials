public class Klasa4 extends Klasa3{
	
	public int rez(){
		return 5;
	}		
	
	public void shtyp(){
		System.out.println("metoda shtyp e klases femije");
	}
	
	
	
	public static void main(String[]args){
		Klasa4 k4 = new Klasa4();
		k4.shtyp();
		System.out.println(k4.fjalia());
		//Klasa3 k3 = new Klasa3();
		
	}
	
}