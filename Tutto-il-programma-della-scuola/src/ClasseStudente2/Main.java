// Cognome: Tauro
// Nome:    Nicolò
package ClasseStudente2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Studenti tauro = new Studenti("Nicolo'","Tauro", true,12,05, 2006);
        Studenti tani = new Studenti("Alfio","Tani", false);
        Studenti alunni = new Studenti();
        Scanner in = new Scanner(System.in);

        
        System.out.println("Inserire il nome del alunno:\t");
        alunni.nome = in.nextLine();

        System.out.println("Inserire il Cognome del alunno:");
        alunni.cognome = in.nextLine();

        System.out.println("Inserire il giorno che è nato:");
        alunni.giorno_nascita = in.nextInt();

        System.out.println("Inserire il numero del mese che è nato:");
        alunni.mese_nascita = in.nextInt();

        System.out.println("Inserire l'anno che è nato:");
        alunni.anno_nascita = in.nextInt();
        
        System.out.println("\n\n" + tauro.dettagli() + "\n");
        
        System.out.println("\n" + tani.dettagli() + "\n");
        
        System.out.println(alunni.dettagli() + "\n");
 
    }
}