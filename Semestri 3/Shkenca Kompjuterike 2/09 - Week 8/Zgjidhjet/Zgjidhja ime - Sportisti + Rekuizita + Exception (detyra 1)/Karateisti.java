public class Karateisti extends Sportisti {
    private String stili;

    public Karateisti(int i, String e, int m, char gj, String s)throws SportistiException{
        super(i, e, m, gj);
       if(s == null || s.isEmpty() || s.trim().equals("")){
        throw new SportistiException("Stili gabim!");
       }
        stili = s;
    }

    public String getStili(){
        return stili;
    }
    public void setStili(String st) throws SportistiException {
        if(st == null || st.isEmpty() || st.trim().equals("")){
            throw new SportistiException("Stili gabim - setStili!");
        }
        stili = st;
    }

    public boolean garonIndividualisht(){
        return true;
    }



    public String toString(){
        return "Karateisti me stil " + stili + " - " + super.toString();
    }
}






