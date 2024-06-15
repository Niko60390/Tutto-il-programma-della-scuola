// Cognome:
// Nome:
package ClasseRettangolo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        
    Scanner in = new Scanner(System.in);
    double numero;
    
    Rettangolo tavolo = new Rettangolo();
    System.out.print("Inserisci la base del tavolo: ");
    numero = in.nextDouble();
    tavolo.setBase(numero);
    
    System.out.print("Inserisci la altezza del tavolo: ");
    numero = in.nextDouble();
    tavolo.setAltezza(numero);
    
    System.out.println("Il rettangolo è di " + "\n" +
                       "Base: "+ tavolo.getBase() + "\n" +
                       "Altezza" + tavolo.getAltezza());
    System.out.print (tavolo.dettagli()); 
    }
}
