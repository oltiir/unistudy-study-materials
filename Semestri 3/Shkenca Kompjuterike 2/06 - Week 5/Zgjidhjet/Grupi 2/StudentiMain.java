public class StudentiMain{
	
	public static void main(String[]args){
		Studenti s1 = new Studenti("emri","mbiemri","UBT");
		Studenti s2 = new Studenti("emri 2","mbiemri 2","UBT");
		Studenti s3 = new Studenti("emri 3","mbiemri 3","UBT");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		s1.kolegji = "UBT Prishtine";
		s2.kolegji = "UBT Prishtine";
		s3.kolegji = "UBT Prishtine";
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println("---- Variabla statike -----");
		StudentiStatik ss1 = new StudentiStatik("emri","mbiemri");
		StudentiStatik ss2 = new StudentiStatik("emri 2","mbiemri 2");
		StudentiStatik ss3 = new StudentiStatik("emri 3","mbiemri 3");
		System.out.println(ss1.toString());
		System.out.println(ss2.toString());
		System.out.println(ss3.toString());
		
		
		StudentiStatik.kolegji = "UBT 1";
		
		
		System.out.println(ss1.toString());
		System.out.println(ss2.toString());
		System.out.println(ss3.toString());
		
	}
	
}