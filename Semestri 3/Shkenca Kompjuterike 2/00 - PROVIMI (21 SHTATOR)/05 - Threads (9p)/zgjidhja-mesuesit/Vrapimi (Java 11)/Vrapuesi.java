import java.util.Random;

public class Vrapuesi extends Atleti implements Runnable{
	private byte nrMedaljeve;

	public Vrapuesi(int n, String e, byte m, char gj,double gjat, byte nrM) throws AtletiException{
		super(n, e, m , gj, gjat);
		if(nrM < 0){
			throw new AtletiException("Nr i medaljeve gabim!");
		}
		nrMedaljeve = nrM;
	}

	public byte getNrMedaljeve(){
		return nrMedaljeve;
	}
	public void setNrMedaljeve(byte m){
		nrMedaljeve = m;
	}

	public String toString(){
		return "Vrapuesi - " + super.toString() + " me " 
		+ nrMedaljeve + " medalje, aktualisht ka arritur distancen " 
		+ getDistanca() + "!";
	}

	public void garo(){
		try{
			setDistanca(getDistanca()+10);
		}catch(AtletiException a){
			a.printStackTrace();
		}
		System.out.println(toString());
	}

	public void run(){
		Random r = new Random();
		while(getDistanca() < getGjatesiaEPistes()){
			garo();

			try{
				Thread.sleep(r.nextInt(0,300));
			}catch(Exception e){
				e.printStackTrace();
			}
		}

		if(getDistanca() == getGjatesiaEPistes()){
			System.out.println("=================FINISH===============" + toString());
		}
	}
}