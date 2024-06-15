public class Quadrato{
    
    //attributo lato è privato
    private int lato;
    
        //Assegnazione dei metodi -INIZIO
    
    //metodi per impostare il lato
    public void setLato(int x){
        lato = x;
    }
    //metodi calcoli 
    public int Area(){
        int calcoloArea;
        calcoloArea = lato * lato;
        return calcoloArea;
    }
    
    public int Perimetro(){
        int calcoloPerimetro;
        calcoloPerimetro = 4 * lato;
        return calcoloPerimetro;
    }
        //Assegnazione dei metodi -FINE
    
    
        //STAMPA variabili -INIZIO
    public String Dettagli(){
        String info="";
        info="I dettagli del quadrato sono:" + 
             "\nLato: " + lato +  
             "\nPerimetro: " + Perimetro() + 
             "\nArea: " + Area();
             
             return info;
    }
        //STAMPA variabili -FINE 
}