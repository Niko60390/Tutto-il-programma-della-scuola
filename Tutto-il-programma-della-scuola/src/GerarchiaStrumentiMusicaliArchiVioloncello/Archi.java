public class Archi extends StrumentiMusicali{
    private int numeroCorde;

    public Archi(){
    }

    public Archi(String no, String mar, String mat, int numeroCorde){
        super(no, mar, mat);
        this.numeroCorde = numeroCorde;
    }

    public void setNumeroCorde(int numeroCorde) {
        this.numeroCorde = numeroCorde;
    }
    public int getNumeroCorde(){
        return numeroCorde;
    }
    public String dettagli(){
        String info = "";
        info = super.dettagli() + "Numero di Corde: " + getNumeroCorde() + "\n";
        return info;
    }
}
