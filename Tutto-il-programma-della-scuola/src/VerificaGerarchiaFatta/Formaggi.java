public class Formaggi extends ProdottoAlimentare{
    //variabili
    private int mesiStagionatura;
    //costruttore vuoto
    public void Formaggi(){
    }
    //costruttore pieno
    public void Formaggi(String nome,int prezzo,String dataDiScadenza,int mesiStagionatura){
        super(nome, prezzo, dataDiScadenza);
        this.mesiStagionatura = mesiStagionatura;
    }
    //set mese stagionatura
    public void setMesiStagionatura(int mesiStagionatura){
        this.mesiStagionatura = mesiStagionatura;
    }
    //getmesi stagionatura
    public int getMesiStagionatura(){
        return this.mesiStagionatura;
    }
    //dettagli
    public String dettagli(){
        String info =super.dettagli() + 
                    "E' fatto di: " + getMesiStagionatura() + " mesi\n";
        return info;
    }
}