/**************************************************************************
 * Cognome: Tauro
 * Nome:    Nicolo
 * Titolo della traccia: 1 x N
 * ***********************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	        FileWriter file1 = new FileWriter("articoli.txt");
	        Scanner inSyst = new Scanner(System.in);
	        
	        int NUM, i=0;
	        String oggettiSyst;
	        
	        System.out.println("Quanti articoli hai?");
	        NUM = inSyst.nextInt();
	        inSyst.nextLine();
	        
	        for(i=1; i<=NUM; i++){
	            System.out.println("Qual è il " + i + "° articolo?");
	            oggettiSyst=inSyst.nextLine();
	            file1.write(oggettiSyst + "\n");
	        }
	        file1.close();
	        
	        String x;
	        System.out.println("Inserire un moltipricatore");
	        int MOLTIPLICATORE = inSyst.nextInt();
	        
	        FileReader file3 = new FileReader("articoli.txt"); 
	        FileWriter file2 = new FileWriter("conta.txt");
	        Scanner inFile3 = new Scanner(file3);
	        
	        while(inFile3.hasNextLine()){
	            x = inFile3.nextLine();
	            for(i=1; i<=MOLTIPLICATORE; i++){
	               file2.write(x + " " + i + "\n");
	            }
	        }
	        file2.close();
	        file3.close();
	    }catch(IOException err){
	        System.out.println("Error");
	    }
	}
}
