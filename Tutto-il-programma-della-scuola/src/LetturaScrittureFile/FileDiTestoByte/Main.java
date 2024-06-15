// Cognome:
// Nome:
package LetturaScrittureFile.FileDiTestoByte;
import java.io.*;
public class Main{
    public static void main (String [] args){
        try{
            FileOutputStream file1 = new FileOutputStream("pippo.txt", true);
            file1.write(70);
            file1.write(111);
            file1.write(114);
            file1.write(122);
            file1.write(97);
            file1.write(32);
            file1.write(76);
            file1.write(101);
            file1.write(99);
            file1.write(99);
            file1.write(101);
            file1.write(32);
            file1.close();
            FileInputStream file2 = new FileInputStream("pippo.txt");
            int x = file2.read();
            while(x!=-1){
                System.out.println(x + "\t" + (char)x);
                x = file2.read();
            }
        }catch(IOException err){
            System.out.println("Errore");
        }
    }
}