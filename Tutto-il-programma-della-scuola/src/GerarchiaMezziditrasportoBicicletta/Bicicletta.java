public class Bicicletta extends MezzoDiTrasporto{
    private String colore;
    private String velocita;

    public Bicicletta(){

    }
    public Bicicletta(String marca, int prezzo, String numeroPassegeri, String colore, String velocita) {
        super(marca, prezzo, numeroPassegeri);
        this.colore = colore;
        this.velocita = velocita;
    }
    public void setColore(String colore){
        this.colore = colore;
    }
    public void setVelocita(String velocita){
        this.velocita = velocita;
    }
    public String getColore(){
        return colore;
    }
    public String getVelocita(){
        return velocita;
    }
    public String dettagli(){
        String info;
        info = super.dettagli() + "Colore: " + getColore() + "\n" +
                "Velocità: " + getVelocita();
        return info;
    }
}
