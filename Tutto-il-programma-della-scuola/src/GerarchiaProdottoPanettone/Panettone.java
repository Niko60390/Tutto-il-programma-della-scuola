package GerarchiaProdottoPanettone;

public class Panettone extends Prodotto{
    private String canditi, dimensione;
    private boolean ripieno;
    public Panettone(String canditi,String dimensione, boolean ripieno){
        this.canditi = canditi;
        this.dimensione = dimensione;
        this.ripieno = ripieno;
    }
    public Panettone(){}
    public void setCanditi(String canditi) {
        this.canditi = canditi;
    }
    public void setDimensione(String dimensione) {
        this.dimensione = dimensione;
    }
    public void setRipieno(boolean ripieno) {
        this.ripieno = ripieno;
    }
    public String getCanditi() {
        return canditi;
    }
    public String getDimensione() {
        return dimensione;
    }
    public boolean getRipieno(){
        return ripieno;
    }
    @Override
    public String toString() {
        return super.toString()+ "Panettone{" +
                "canditi='" + canditi + '\'' +
                ", dimensione='" + dimensione + '\'' +
                ", ripieno=" + ripieno + "} ";
    }
}
