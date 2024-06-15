public class ProdottoNonAlimentare extends Magazzino{
    //variabili
    private String materiale;
    //costruttore vuoto
    public void ProdottoNonAlimentare(){
    }
    //costruttore pieno
    public void ProdottoNonAlimentare(String nome,int prezzo,String materiale){
        super (nome, prezzo);
        this.materiale = materiale;
    }
    //set materiale
    public void setMateriale(String materiale){
        this.materiale = materiale;
    }
    //get materiale
    public String getMateriale(){
        return this.materiale;
    }
    //dettagli
    public String dettagli(){
        String info =super.dettagli() + 
                    "E' fatto di: " + getMateriale() + "\n";
        return info;
    }
}