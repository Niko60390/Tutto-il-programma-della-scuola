public class Persona {
    
    private String nome;
    private String cognome;
    private int giorno;
    private int mese;
    private int anno;
    
    public Persona(){
        
    }
    
    public Persona (String n, String c, int g, int m, int a){
        nome = n;
        cognome = c;
        giorno = g;
        mese = m;
        anno = a;
    }
    
    public void setNome(String x){
        nome = x;
    }
    
    public void setCognome(String x){
        cognome = x;
    }
    
    public void setGiorno(int x){
        giorno = x;
    }
    
    public void setMese(int x){
        mese = x;
    }
    
    public void setAnno(int x){
        anno = x;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getCognome(){
        return cognome;
    }
    
    public int getGiorno(){
        return giorno;
    }
    public int getMese(){
        return mese;
    }
    public int getAnno(){
        return anno;
    }
    
    public int calcoloEta(){
        int eta = 2023 - anno;
        return eta;
    }
     public String dettagli(){
         String info = "La persona è:\n" +
                        "Nome: " + nome + "\n" +
                        "Cognome: " + cognome + "\n" +
                        "Età: " + calcoloEta() + "\n";
         return info;
     }
     
     
     
     
     
     
     
}