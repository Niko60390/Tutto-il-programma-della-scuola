
package ClasseRettangolo;

public class Rettangolo {
    private double base;
    private double altezza;
    private double perimetro;
    private double area;
    
    //costruttore parziale
    public Rettangolo(){
        base = 0;
        altezza = 0;
    }
    public Rettangolo(double x1, double x2){
        base = x1;
        altezza = x2;
    }
    
    //metodi set 
    public void setBase(double x){
        base = x;
    }
    public void setAltezza(double x){
        altezza = x;
    }
    
    //metodi get
    public double getBase(){
        return base;
    }
    public double getAltezza(){
        return altezza;
    }
    
    //calcoli dati
    public double calcolaPerimetro(){
        perimetro = 2 * (base + altezza); 
        return perimetro;
    }
    public double calcolaArea(){
        area = base * altezza;
        return area;
    }
    
    //dettagli 
    public String dettagli(){
        String info="";
        info =  "Perimetro: " + calcolaPerimetro() + "\n" +
                "Area: " + calcolaArea() + "\n";
        return info;
    }
}