public class StrumentiMusicali {
    private String nome;
    private String marca;
    private String materiale;

    public StrumentiMusicali(){
    }

    public StrumentiMusicali(String no, String mar, String mat){
        nome = no;
        marca = mar;
        materiale = mat;
    }
    public void setNome(String x){
        nome = x;
    }
    public void setMarca(String x){
        marca = x;
    }
    public void setMateriale(String x){
        materiale = x;
    }
    public String getNome(){
        return nome;
    }
    public String getMarca(){
        return marca;
    }
    public String getMateriale(){
        return materiale;
    }
    public String dettagli(){
        String info = "";
        info = "Nome strumento: " + getNome() + "\n" + "Materiale: " + getMateriale() + "\n" +"Marca: " + getMarca() + "\n";
        return info;
    }
}
