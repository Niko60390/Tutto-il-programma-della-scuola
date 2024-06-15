public class Calciatore extends Sportivo{
    public String squadra;
    public String ruolo;
    public String Calciatore;{
    }
    public Calciatore(String x, String y, String z, String c){
        super(x, y, z);
        squadra = c;
    }
    
    public String dettagli(){
        String info;
        info = super.dettagli() + "Squadra: " + squadra + "\n";
        return info;
    }
}