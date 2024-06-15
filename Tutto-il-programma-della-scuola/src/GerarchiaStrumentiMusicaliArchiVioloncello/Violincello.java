public class Violincello extends Archi{
    private String misura;

    public Violincello(){
    }

    public Violincello(String no, String mar, String mat, int numeroCorde, String misura){
        super(no, mar, mat, numeroCorde);
        this.misura=misura;
    }
    public void setMisura(String misura){
        this.misura=misura;
    }

    public String getMisura() {
        return misura;
    }

    public String dettagli(){
        String info;
        info = super.dettagli() + "Misura: " + getMisura();
        return info;
    }
}
