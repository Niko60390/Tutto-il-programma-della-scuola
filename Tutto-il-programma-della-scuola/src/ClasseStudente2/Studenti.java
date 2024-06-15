package ClasseStudente2;

public class Studenti {
    public String nome;
    public String cognome;
    public boolean test;
    public int giorno_nascita;
    public int mese_nascita;
    public int anno_nascita;

    public Studenti(String n, String c,boolean t, int g,int m, int a){//costuttore pieno
        nome=n;
        cognome=c;
        test = t;
        giorno_nascita=g;
        mese_nascita=m;
        anno_nascita=a;
    }

    public Studenti(String n, String c, boolean t){//costuttore parziale
        nome=n;
        cognome=c;
        test = t;
    }
    
    public Studenti(){
        test = true;
    }

    public int calcola_eta(){
        int risultato;
        risultato = 2023-anno_nascita;
        return risultato;
    }

    public String nome_mese() {
        String mese = "";
        switch (mese_nascita) {
            case 1:
                mese = "Gennaio";
                break;
            case 2:
                mese = "Febbraio";
                break;
            case 3:
                mese = "Marzo";
                break;
            case 4:
                mese = "Aprile";
                break;
            case 5:
                mese = "Maggio";
                break;
            case 6:
                mese = "Giugno";
                break;
            case 7:
                mese = "Luglio";
                break;
            case 8:
                mese = "Agosto";
                break;
            case 9:
                mese = "Settembre";
                break;
            case 10:
                mese = "Ottobre";
                break;
            case 11:
                mese = "Novembre";
                break;
            case 12:
                mese = "Dicembre";
                break;
            default:
                mese = "ERROR";
                break;
        }
        return mese;
    }
    public String dettagli() {
        String info="";
        if (test==false){
            info = "L'oggetto ha le seguenti proprietà:\n" +
                    "Nome: " + nome + "\n" +
                    "Cognome: " + cognome;
        }else{
            info = "L'oggetto ha le seguenti proprietà:\n" +
                    "Nome: " + nome + "\n" +
                    "Cognome: " + cognome + "\n" +
                    "Data di  nascita " + giorno_nascita + " " + nome_mese() + " " + anno_nascita;
        }
        return info;
    }
}