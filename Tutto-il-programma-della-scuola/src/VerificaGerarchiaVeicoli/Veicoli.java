public class Veicoli{
    private String marca;
    private int anno;
    public Veicoli(){
    }
    Veicoli(String marca, int anno){
        this.anno=anno;
        this.marca=marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public String getMarca() {
        return marca;
    }
    public int getAnno() {
        return anno;
    }
    public String dettagli(){
        String info;
        info="La marca del veicolo è una " + getMarca() + "\n" +
              "L'anno del veicolo è " + getAnno() + "\n";
        return info;
    }
}