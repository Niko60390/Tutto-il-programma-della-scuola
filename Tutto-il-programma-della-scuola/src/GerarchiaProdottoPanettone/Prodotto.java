package GerarchiaProdottoPanettone;

public class Prodotto {
    private String marca, nome, scadenza;
    private int prezzo;
    public Prodotto(String marca, String nome, int prezzo, String scadenza){
        this.marca=marca;
        this.nome=nome;
        this.prezzo=prezzo;
        this.scadenza=scadenza;
    }
    public Prodotto(){}
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    public void setScadenza(String scadenza) {
        this.scadenza = scadenza;
    }
    public String getMarca() {
        return marca;
    }
    public String getNome() {
        return nome;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public String getScadenza() {
        return scadenza;
    }
    @Override
    public String toString() {
        return "Prodotto{" +
                "marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", scadenza=" + scadenza +
                '}';
    }

}