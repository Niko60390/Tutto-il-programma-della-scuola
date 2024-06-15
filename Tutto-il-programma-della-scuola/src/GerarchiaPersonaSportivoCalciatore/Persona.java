public class Persona{
    public String nome;
    public String cognome;
    public Persona(){
    }
    public Persona(String x, String y){
        nome=x;
        cognome=y;
    }
    public void setNome (String x){
        nome = x;
    }
    public void setCognome (String x){
        cognome=x;
    }
    public String getNome (){
        return nome;
    }
    public String getCognome (){
        return cognome;
    }
    public String dettagli(){
        String info;
        info="\n\n" + 
             "Nome: " + nome + "\n" + 
             "Cognome: " + cognome + "\n";
        return info;
    }
}