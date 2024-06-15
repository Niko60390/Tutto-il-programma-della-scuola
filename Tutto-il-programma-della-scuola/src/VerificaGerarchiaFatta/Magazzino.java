public class Magazzino{
    //variabili
    private String nome;
    private int prezzo;
    //costruttore vuoto
    public void Magazzino(){
    }
    //costruttore pieno
    public void Magazzino(String nome,int prezzo){
        this.nome=nome;
        this.prezzo=prezzo;
    }
    //set nome
    public void setNome(String nome){
        this.nome = nome;
    }
    //set prezzo
    public void setPrezzo(int prezzo){
        this.prezzo = prezzo;
    }
    //get nome
    public String getNome(){
        return this.nome;
    }
    //get prezzo
    public int getPrezzo(){
        return this.prezzo;
    }
    //dettagli
    public String dettagli(){
        String info="Nome: " + getNome() + "\n" + 
                    "Prezzo: €" + getPrezzo() + "\n";
        return info;
    }
}