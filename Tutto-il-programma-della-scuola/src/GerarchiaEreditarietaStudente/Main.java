// Cognome: Tauro 
// Nome:    Nicolo'
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
    Persona x = new Persona();
    x.setNome("Nicolo");
    x.setCognome("Tauro");
    x.setGiorno(12);
    x.setMese(05);
    x.setAnno(2006);
    
    System.out.println(x.dettagli());
    
    Persona z = new Persona("Danile", "Brescia", 16, 3, 2006);
    System.out.println(z.dettagli());
    
    Studente y = new Studente();
    y.setNome("Alfio");
    y.setCognome("Tani");
    y.setGiorno(25);
    y.setMese(8);
    y.setAnno(2006);
    //in piu 
    y.setMatricola("20");
    y.setAnnoCorso(4);
    y.setIstituto("Vito sante Longo");
    
    System.out.println(y.dettagli());
    
    Studente c = new Studente("Vincenzo", "Sardella", 1, 4, 2006, "19",4,"Vito Sante Longo");
    System.out.println(dettagli());
    
    }
}