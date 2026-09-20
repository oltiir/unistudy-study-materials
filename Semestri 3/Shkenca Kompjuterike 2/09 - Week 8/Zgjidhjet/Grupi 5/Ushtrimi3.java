public class Ushtrimi3{
	public static void valido(int mosha) throws Grupi5Llegendat{
		if(mosha < 18){
			throw new Grupi5Llegendat("Nuk mund te votoni");
		}
		else{
			System.out.println("Urime ju keni te drejte vote");
		}
	}
	public static void main(String[]args){
		try{
			valido(16);
		}
		catch(Grupi5Llegendat e){
			System.out.println(e);
		}
		System.out.println("Vazhdimi");
	}
	
}