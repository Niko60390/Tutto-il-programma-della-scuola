// Cognome: Tauro
// Nome:    Nicolo
import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    try{
	        //FileReader
	        FileWriter file1 = new FileWriter("cognomi.txt");
	        FileWriter file2 = new FileWriter("nomi.txt");
	        Scanner inSyst = new Scanner(System.in);
	        int NUM, i;
	        String nome,cognome;
	        System.out.println("Quanti persone vuoi registrare?");
	        NUM = inSyst.nextInt();
	        inSyst.nextLine();
	        
	        for (i=1; i<=NUM; i++){
	            //Nome 
	            System.out.println("Inserire il " + i + "° Nome");
	            nome = inSyst.nextLine();
	            file2.write(nome + "\n");
	            //Cognome
	            System.out.println("Inserire il " + i + "° Cognome");
	            cognome = inSyst.nextLine();
	            file1.write(cognome + "\n"); 
	        }
	        file1.close();
	        file2.close();
	        
	        FileReader file3 = new FileReader("nomi.txt");        //Nomi 
	        FileReader file4 = new FileReader("cognomi.txt");        //Cognomi
	        Scanner inNomi = new Scanner(file3);
	        Scanner inCognomi = new Scanner(file4);
	        FileWriter file5 = new FileWriter("miaClasse.txt");
	        while(inNomi.hasNextLine()){
	            file5.write(inCognomi.nextLine() + " " + inNomi.nextLine() + "\n");
	        }
	        file3.close();
	        file5.close();
	        file5.close();
	    }catch(IOException err){
	        System.out.println("Error");
	    }
	}
}

