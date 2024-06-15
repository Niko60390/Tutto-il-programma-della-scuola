/**************************************************************************
 * Cognome: Tauro
 * Nome:    Nicolo
 * Titolo della traccia: Il quadrato 
 * ***********************************************************************/
public class Main
{
	public static void main(String[] args) {
	    Quadrato pippo1 = new Quadrato();
	    Quadrato pippo2 = new Quadrato();
	    
	    pippo1.setLato(4);
	    pippo2.setLato(5);
	    
	    pippo1.setColore("giallo");
	    pippo2.setColore("rosso");
	    
	    System.out.println(pippo1.Dettagli());
	    System.out.println("\n" + pippo2.Dettagli());
	   
	}
}
