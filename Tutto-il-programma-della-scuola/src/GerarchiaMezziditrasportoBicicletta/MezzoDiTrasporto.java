public class MezzoDiTrasporto {
    private String marca;
    private int prezzo;
    private String numeroPassegeri;

    public MezzoDiTrasporto(){
    }
    public MezzoDiTrasporto(String marca, int prezzo, String numeroPassegeri){
        this.marca = marca;
        this.prezzo = prezzo;
        this.numeroPassegeri = numeroPassegeri;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    public void setNumeroPassegeri(String numeroPassegeri) {
        this.numeroPassegeri = numeroPassegeri;
    }
    public String getMarca() {
        return marca;
    }
    public String getNumeroPassegeri() {
        return numeroPassegeri;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public String dettagli(){
        String info;
        info = "Mezzo di trasporto \n" +
                "Marca: " + getMarca() + "\n" +
                "Prezzo: €" + getPrezzo() + "\n" +
                "Numero di passeggeri: " + getNumeroPassegeri() + "\n";
        return info;
    }
}
