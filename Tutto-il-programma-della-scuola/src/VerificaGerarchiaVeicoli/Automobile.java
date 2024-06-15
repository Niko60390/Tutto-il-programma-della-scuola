public class Automobile extends Terrestre{
    private String ciclindrata;
    Automobile(){
    }
    Automobile(String marca, int anno, int numeroRuote, String ciclindrata){
        super(marca, anno, numeroRuote);
        this.ciclindrata=ciclindrata;
    }
    public void setCiclindrata(String ciclindrata) {
        this.ciclindrata = ciclindrata;
    }
    public String getCiclindrata() {
        return ciclindrata;
    }
    public String dettagli(){
        String info;
        info=super.dettagli() + "La sua ciclindrata è di " + getCiclindrata() + "\n";
        return info;
    }
}