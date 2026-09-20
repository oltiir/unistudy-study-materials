public abstract class Sportisti {
    private int id;
    private String emri;
    private int mosha;
    private char gjinia;

    public Sportisti(int i, String e, int m, char gj)throws SportistiException{
		if(i<0){
			throw new SportistiException("Id duhet te jete pozitive");
		}
        id = i;
		if(e==null||e.trim().isEmpty()){
			throw new SportistiException("Emri nuk duhet te jete i zbrazet");
		}
        emri = e;
		if(m<=0){
			throw new SportistiException("Mosha duhet te jete pozitive");
		}
        mosha = m;
		if(gj!='M'&&gj!='F'){
			throw new SportistiException("Gjinia duhet te jete M ose F");
		}
        gjinia = gj;
    }

    public int getId(){
        return id;
    }

    public String getEmri(){
        return emri;
    }
    public void setEmri(String e)throws SportistiException{
		if(e==null||e.trim().isEmpty()){
			throw new SportistiException("Emri nuk duhet te jete i zbrazet");
		}
        emri = e;
    }

    public int getMosha(){
        return mosha;
    }
    public void setMosha(int m)throws SportistiException{
        if(m<=0){
			throw new SportistiException("Mosha duhet te jete pozitive");
		}
		mosha = m;
    }

    public char getGjinia(){
        return gjinia;
    }
    public void setGjinia(char gj)throws SportistiException{
		if(gj!='M'&&gj!='F'){
			throw new SportistiException("Gjinia duhet te jete M ose F");
		}
        gjinia = gj;
    }

    public abstract boolean garonIndividualisht();

    public String toString(){
        return id + " : " + emri + (gjinia=='f'?" femer ":" mashkull ") + mosha + " vjec";
    }

    public boolean equals(Object o){
        return o instanceof Sportisti?((Sportisti)o).getId()==id:false;
    }
}











