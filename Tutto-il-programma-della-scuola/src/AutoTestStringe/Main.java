// Cognome:
// Nome:
package AutoTestStringe;
public class Main
{
	public static void main(String[] args) {
		// 1. Dichiarare una variabile di tipo String chiamata "testo" e assegnarle il valore "Benvenuti".
		String testo = "Benvenuti";
		
		// 2. Creare un nuovo oggetto string "nuovoTesto" dandogli il valore "Benvenuti"
		String nuovoTesto=new String("Benvenuti");
		
		// 3. Stampare a schermo la lunghezza della stringa "testo"
		System.out.println(testo.length());
		
		// 4. Verificare se la stringa "testo" contiene la sottostringa "ven"
		System.out.println(testo.contains("ven"));
		
		// 5. Estrarre il carattere alla posizione 3 dalla stringa "testo" e stampare il risultato
		System.out.println(testo.charAt(3));
		
		// 6. Convertire la stringa "testo" in minuscolo utilizzando il metodo toLowerCase() e assegnare 
		//    il risultato a una nuova variabile di tipo String chiamata "testoMinuscolo"
		String testoMinuscolo;
		testoMinuscolo=testo.toLowerCase();
		
		// 7. Stampa a schermo la stringa "testoMinuscolo"
		System.out.println(testoMinuscolo);
		
		// 8. Estrarre una sottostringa dalla stringa "testo" che vada dal secondo(2) al quarto(4) carattere e 
		//    assegnare il risultato a una nuova variabile di tipo String chiamata "sottostringa"
		String sottostringa;
		sottostringa=testo.substring(1,4);
		
		// 9. Stampa a schermo la stringa "sottostringa"
		System.out.println(sottostringa);
		
		// 10. Concatenare la stringa "sottostringa" con la stringa "Mondo" utilizzando l'operatore + e 
		//     assegnare il risultato a una nuova variabile di tipo String chiamata "saluto"
		String saluto;
		saluto = sottostringa + " Mondo";
		
		// 11. Stampa a schermo la stringa "saluto"
		System.out.println(saluto);
		
		// 12. Verificare se la stringa "testo" è vuota e stampare il risultato
		System.out.println(testo.isEmpty());
		
		// 13. Sostituire tutte le occorrenze del carattere 'e' con il carattere 'a' nella stringa "testo" 
		//     e assegnare il risultato a una nuova variabile di tipo String chiamata "testoModificato"
		String testoModificato;
		testoModificato=testo.replace("e","a");
		
		// 14. Stampa a schermo la stringa "testoModificato"
		System.out.println(testoModificato);
		
		// 15. Verificare se la stringa "testo" termina con la sottostringa "ti" e stampare il risultato
		System.out.println(testo.endsWith("ti"));
		
		// 16. Trovare l'indice della prima occorrenza del carattere 'n' nella stringa "testo" e stampare il risultato.
		System.out.println(testo.indexOf("n"));
		
		// 17. Stampare il valore di "testo"
		System.out.println(testo);
		
		// 18. Stampare il valore di "nuovoTesto"
		System.out.println(nuovoTesto);
		
		// 19. Stampare la frase "Sono uguali" se "testo" e "nuovoTesto" sono uguali, "Sono diverse" altrimenti
		if(testo.equals(nuovoTesto)==true){
		    System.out.println("Sono uguali");
		}else{
		    System.out.println("Sono diverse");
		}
		
		
	}
}

