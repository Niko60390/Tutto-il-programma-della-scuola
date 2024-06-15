public class Sportivo extends Persona{
    public String sport;
    public String Sportivo;{
    }
    public Sportivo(String x, String y, String z){
        super(x, y);
        sport = z;
    }
    
    public String dettagli(){
        String info;
        info = super.dettagli() + "Sport: " + sport + "\n";
        return info;
    }
}