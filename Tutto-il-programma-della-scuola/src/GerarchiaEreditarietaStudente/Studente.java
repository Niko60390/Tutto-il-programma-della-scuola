public class Studente extends Persona{
    
    private String matricola;
    private int annoCorso;
    private String istituto;
    
    public Studente (){
        
    }
    
    public Studente(String n, String c, int g, int m, int a, String m, int ac,String i){
        super (n,c,g,m,a);
        matricola = m;
        annoCorso = ac;
        istituto = i;
    }
    
    public void setMatricola(String x){
        matricola = x;
    }
    
    public void setAnnoCorso(int x){
        annoCorso = x;
    }
    
    public void setIstituto(String x){
        istituto = x;
    }
    
    public String dettagli(){
        String info=    "lo studente ha:\n" +
                        "Nome: " + getNome() + "\n" +
                        "Cognome: " + getCognome() + "\n" +
                        "Data di nascita: " + getGiorno() + " " + getMese() + " " + getAnno() + "\n" +
                        "Età: " + calcoloEta() + "\n" + 
                        "Matrticola: " + matricola + "\n" + 
                        "Anno di corso: " + annoCorso + "\n" + 
                        "Istituto: " + istituto + "\n\n";
        return info;
    }
}