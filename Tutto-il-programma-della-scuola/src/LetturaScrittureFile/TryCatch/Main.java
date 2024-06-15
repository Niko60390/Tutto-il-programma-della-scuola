// Cognome: Tauro
// Nome:    Nicolo
package LetturaScrittureFile.TryCatch;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int x,y,z;
		Scanner input = new Scanner(System.in);
		
		try{
		// Input
		System.out.print("Inserisci x: ");
		x = input.nextInt();
		System.out.print("Inserisci y: ");
		y = input.nextInt();
		
		// Calcolo e stampa
    	    z = x/y;
    	    System.out.println("Il risultato della divisione dei 2 numeri è: "+z);
		}catch(ArithmeticException err){
		    System.out.println("Non puoi fare una divisione per zero!\n" + err);
		}catch(Exception err){
		    System.out.println("C'è in errore dei dati in input!\n" + err);
		}
		// Saluti finali
		System.out.println("Arrivederci alla prossima!");
	}
}

