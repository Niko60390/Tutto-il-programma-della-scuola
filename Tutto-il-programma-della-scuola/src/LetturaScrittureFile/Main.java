// Cognome: Tauro
// Nome:    Nicolò
package LetturaScrittureFile;
import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args) throws IOException{
        // Apertura file in uscita
        FileWriter file1 = new FileWriter("pippo.txt");
        
        // Scrittura su file
        file1.write("Paperino\n");
        file1.write("Pluto\n");
        file1.write("Gastone\n");
        
        // Chiusura file
        file1.close();
        
        // Apertura file in lettura
        FileReader file2 = new FileReader("pippo.txt");
        FileWriter file3 = new FileWriter("pluto.txt");
        Scanner in = new Scanner(file2);
        String x;
        //hasNextLine serve per vedere se sono altre stringe da leggere
        while(in.hasNextLine()){
            x= in.nextLine();
            System.out.println(x);
            file3.write(x.toUpperCase() + "\n");
        }
        
        // Chiusura file
        file2.close();
        file3.close();
    }
}
