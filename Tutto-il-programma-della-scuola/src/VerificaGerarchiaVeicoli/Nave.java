public class Nave extends Acquatico{
    private String stazza;
    public Nave(){
    }
     Nave(String marca, int anno, int velocitaMassima, String stazza){
        super(marca, anno, velocitaMassima);
        this.stazza=stazza;
    }
    public void setStazza(String stazza) {
        this.stazza = stazza;
    }
    public String getStazza() {
        return stazza;
    }
    public String dettagli(){
        String info;
        info=super.dettagli() + "La sua stazza è di " + getStazza() + "\n";
        return info;
    }
}