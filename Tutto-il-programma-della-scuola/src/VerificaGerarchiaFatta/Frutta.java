public class Frutta extends ProdottoAlimentare{
    //variabili
    private String provenienza;
    //costruttore vuoto
    public void Frutta(){
    }
    //costruttore pieno
    public void Frutta(String nome, int prezzo, String dataDiScadenza, String provenienza){
        super(nome, prezzo, dataDiScadenza);
        this.provenienza = provenienza;
    }
    //set provenienza
    public void setProvenienza(String provenienza){
        this.provenienza = provenienza;
    }
    //get provenienza
    public String getProvenienza(){
        return this.provenienza;
    }
    //dettagli
    public String dettagli(){
        String info =super.dettagli() + 
                    "E' fatto di: " + getProvenienza() + "\n";
        return info;
    }
}