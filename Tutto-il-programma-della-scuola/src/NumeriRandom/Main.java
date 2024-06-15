import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        try{
            int x, i;
            FileWriter file1 = new FileWriter("numRandom.txt");
            System.out.println("I numeri che stanno nel file sono:");
            for (i=0; i<=99; i++) {
                x = ((int)(Math.random() * 100 + 1));
                file1.write(x + "\n");
                System.out.print(x + " ");
            }
            file1.close();
            FileReader file2 = new FileReader("numRandom.txt");
            Scanner inFile2 = new Scanner(file2);
            
            Scanner inSyst = new Scanner(System.in);
            System.out.println("\nAdesso cerca un numero di questi: ");
            int cont = 1;
            int y, trovato = 0;
            y = inSyst.nextInt();
            while(inFile2.hasNextInt()){
                x = inFile2.nextInt();
                if (x == y){
                    trovato++;
                    System.out.println("Il tuo numero è stato trovato BEN "+ trovato +"°!! \nAl " + cont + "° posto ed è il numero " + x);
                }
                cont = cont + 1;
            }
            file2.close();
        }catch (IOException err){
            System.out.println("Error");
        }
    }
}