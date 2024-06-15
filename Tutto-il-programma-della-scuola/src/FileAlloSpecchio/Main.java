// Cognome:
// Nome:
import java.io.*;
import java.util.*;

public class Main{
    public static void main (String [] args){
        try{
            FileWriter file1 = new FileWriter("compagni.txt", true);
            Scanner in = new Scanner(System.in);
            String x;
            int y, i;
            for (i = 1; i < 6; i++){
                System.out.println(i+ "° Nome & Cognome");
                x = in.nextLine();
                file1.write(x + "\n");
            }
            file1.close();
            
            FileReader file2 = new FileReader("compagni.txt");
            FileWriter file3 = new FileWriter("specchio.txt");
            Scanner input2 = new Scanner (file2);
            while(input2.hasNextLine()){
                x = input2.nextLine();
                System.out.println(x);
                for (i=x.length()-1; i>=0; i--){
                    file3.write(x.charAt(i));
                } 
                file3.write("\n");
            }
            file2.close();
            file3.close();
        }catch(IOException err){
            System.out.println("Errore");
        }
    }
}