public class Vrapuesi extends Atleti {
    private double distanca;

    public Vrapuesi(int i, String e, int m, char gj, int nrM, double dist) throws SportistiException{
        super(i, e, m, gj, nrM);
        if(dist < 0){
            throw new SportistiException("Distanca < 0");
        }
        distanca = dist;
    }

    public double getDistanca(){
        return distanca;
    }
    public void setDistanca(double d)throws SportistiException{
        if(d < 0){
            throw new SportistiException("Distanca < 0 - setDist");
        }
        distanca = d;
    }

    public boolean garonIndividualisht(){
        return true;
    }

    public String toString(){
        return "Vrapuesi i distances " + distanca + " m - " + super.toString();
    }
}






