/**************************************************************************
 * Cognome: Nicolo
 * Nome:    Tauro
 * Titolo della traccia: Il Magazzino
 * ***********************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Frutta melinda = new Frutta("Mela", 4 , "30 febbraio del 2050", "Orto Felice");
	    System.out.print(melinda.dettagli());
	    Formaggi granaPadano = new Formaggi("Formaggio", 20, "MAI", 36);
	    System.out.print(granaPadano.dettagli());
	    ProdottoNonAlimentare padella = new ProdottoNonAlimentare("Padella", 25, "Acciaio Inox");
	    System.out.print(padella.dettagli());
	}
}
