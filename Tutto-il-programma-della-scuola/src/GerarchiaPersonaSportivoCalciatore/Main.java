// Cognome:
// Nome:
public class Main
{
	public static void main(String[] args) {
		Persona p = new Persona("Daniele","Brescia");
		System.out.println("Persona" + p.dettagli() + "--------------");
		Sportivo s = new Sportivo("Rossi","Velentino","Motociclita");
		System.out.println("Sportivo" + s.dettagli() + "--------------");
		Calciatore c = new Calciatore("Diego","Maradona","Calcio","Napoli");
		System.out.println ("Calciatore"+c.dettagli() + "--------------");
	}
}

