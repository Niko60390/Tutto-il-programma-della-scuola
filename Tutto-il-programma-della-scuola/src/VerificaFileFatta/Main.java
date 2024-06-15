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
	        String oggettiSyst[i];
	        System.out.println("Quanti articoli hai?");
	        NUM = inSyst.nextInt();
	        System.out.println("Qual è il 1° articolo?");
	        for(i=1; i<=NUM; i++){
	            oggettiSyst[i]=inSyst.nextLine();
	            System.out.println("Qual è il " + i + "° articolo?");
	        }
	        file1.close();
	        System.out.println("Inserire un moltipricatore");
	        int MOLTIPLICATORE = inSyst.nextInt(), cont=0;
	        
	        FileWriter file2 = new FileWriter("conta.txt");
	        FileReader file3 = new FileReader("articoli.txt");
	        Scanner inFile3 = new Scanner(file3);
	        while(inSyst.hasNextLine()){
	            for(i=1; i<=MOLTIPLICATORE; i++){
	                cont++;
	                file2.write(inFile3.nextLine() + cont);
	                }
	            cont=0;
	        }
	        file2.close();
	        file3.close();
	    }catch(IOException err){
	        System.out.println("Error");
	    }
	    
	    
	}
}
