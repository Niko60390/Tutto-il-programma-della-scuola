public class StudenteSuperiore extends Studente{
    private String sezione;
    private String indirizzo;
    private int classe;

    public StudenteSuperiore(){

    }
    public StudenteSuperiore (String n, String c, int g, int me, int a,String m, int ac, String is, String s, String i, int cl){
        super (n, c, g, me, a, m, ac, is);
        sezione = s;
        indirizzo = i;
        classe=cl;
    }

    public void setClasse(int x){
        classe=x;
    }
    public void setIndirizzo(String x){
        indirizzo = x;
    }
    public void setSezione(String x){
        sezione = x;
    }

    public int getClasse(){
        return classe;
    }
    public String getIndirizzo(){
        return indirizzo;
    }
    public String getSezione(){
        return sezione;
    }

    public String dettagli(){
        String info =    "lo studente ha:\n" +
                "Nome: " + getNome() + "\n" +
                "Cognome: " + getCognome() + "\n" +
                "Data di nascita: " + getGiorno() + " " + getMese() + " " + getAnno() + "\n" +
                "Età: " + calcoloEta() + "\n" +
                "Matrticola: " + getMatricola() + "\n" +
                "Anno di corso: " + getAnnoCorso() + "\n" +
                "Istituto: " + getIstituto() + "\n"+
                "Sezione: " + getSezione() + "\n" +
                "Classe: " + getClasse() + "\n\n";
        return info;
    }
}