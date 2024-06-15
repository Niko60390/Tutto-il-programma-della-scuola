public class Terrestre extends Veicoli{
    private int numeroRuote;
    Terrestre(){
    }
    Terrestre(String marca, int anno, int numeroRuote){
        super(marca, anno);
        this.numeroRuote=numeroRuote;
    }
    public void setNumeroRuote(int numeroRuote) {
        this.numeroRuote = numeroRuote;
    }
    public int getNumeroRuote() {
        return numeroRuote;
    }
    public String dettagli(){
        String info;
        info=super.dettagli() + "Il suo numero di ruote è " + getNumeroRuote() + "\n";
        return info;
    }
}