package ClasseStudente;
// Cognome: Tauro
// Nome:    Nicolò

public class Main {
    public static void main (String[] args) {
        Studenti Tauro= new Studenti();
        Tauro.nome="Nicolo'";
        Tauro.cognome="Tauro";
        Tauro.giorno_nascita=12;
        Tauro.mese_nascita=5;
        Tauro.anno_nascita=2006;

        int eta=Tauro.calcola_eta();
        System.out.println(Tauro.dettagli());
        System.out.println("L'eta di Tauro è di " + eta);
    }
}