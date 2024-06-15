public class Acquatico extends Veicoli{
    private int velocitaMassima;
    Acquatico(){
    }
    Acquatico(String marca, int anno, int velocitaMassima){
        super(marca, anno);
        this.velocitaMassima=velocitaMassima;
    }
    public void setVelocitaMassima(int velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
    }
    public int getVelocitaMassima() {
        return velocitaMassima;
    }
    public String dettagli(){
        String info;
        info=super.dettagli() + "La sua velocita massima è di " + getVelocitaMassima() + "\n";
        return info;
    }
}