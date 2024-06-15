public class Quadrato{
    private int lato;
    private String  colore;
    private int area;
    private int perimetro;
    
    
    
    public void setLato(int x){
        lato = x;
    }
    public void setColore( String x){
        colore = x;
    }
    
    
    public int Area(){
        int calcalaArea;
        calcalaArea = lato * lato;
        return calcalaArea;
    }
    
    
    public int Perimetro(){
        int calcolaPerimetro;
        calcolaPerimetro = lato * 4;
        return calcolaPerimetro;
    }
    
    public Quadrato(){
        
    }

    public Quadrato(int l, String c, int a, int p){
        lato=l;
        colore=c;
        area=a;
        perimetro=p;
    }
    
    public Quadrato(int l, String c){
        lato=l;
        colore=c;
    }

    public String Dettagli(){
        String info = "";
        info ="I dettagli del Quadrato: \n" + 
        "Lato " + lato + 
        "\n"+"Colore: " + colore + 
        "\n"+"Area: " + Area() + 
        "\n"+"Perimetro: " + Perimetro();
        return info;
     }
    
    
    
    
    
    
    
    
}