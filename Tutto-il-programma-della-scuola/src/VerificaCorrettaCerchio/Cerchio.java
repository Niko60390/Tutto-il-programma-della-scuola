public class Cerchio{
    private double raggio;
    private String colore;
   
    public void setRaggio(double x){
        raggio=x;
    }
    
    public void setColore(String x){
        colore=x;
    }
    
    public double getRaggio(){
        return raggio;
    }
    
    public String getColore(){
        return colore;
    }
    
    public double Area(){
        double x;
        x = 3.14 * (raggio * raggio) * 2;
        return x;
    }
    
    public double Circ(){
        double x;
        x = (2 * 3.14) * raggio;
        return x;
    }
    
    public Cerchio(){
    }
    
    public Cerchio(double x, String y){
        raggio=x;
        colore=y;  
    }
    
    public String dettagli(){
        String info= "Il seguente cerchio ha le seguenti caratteristiche: " + "\n" +
                     "Raggio: " + raggio + "\n" +
                     "Colore " + colore + "\n" +
                     "Circonferenza: " + Circ() + "\n" +
                     "Area: " + Area();
        return info;
    }
}