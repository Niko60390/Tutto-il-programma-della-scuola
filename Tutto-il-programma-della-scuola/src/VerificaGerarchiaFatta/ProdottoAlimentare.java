public class ProdottoAlimentare extends Magazzino{
    //variabili
    private String dataDiScadenza;
    //costruttore vuoto
    public void ProdottoAlimentare(){
    }
    //costruttore pieno
    public void ProdottoAlimentare(String nome,int prezzo,String dataDiScadenza){
        super(nome, prezzo);
        this.dataDiScadenza = dataDiScadenza;
    }
    //set Data di scadenza 
    public void setDataDiScadenza(String dataDiScadenza){
        this.dataDiScadenza = dataDiScadenza;
    }
    //get Data di scadenza 
    public String getDataDiScadenza(){
        return this.dataDiScadenza;
    }
    //dettagli
    public String dettagli(){
        String info=super.dettagli() + 
                    "Data di scadenza: " + getDataDiScadenza() + "\n";
        return info;
    }
}