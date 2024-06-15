package LeStringe;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x, y, z;

        System.out.print("Inserisci una stringa ");
        x = in.nextLine();

        System.out.println("\nIl numero di caratteri messi sono \n" + x.length());
        x = x.replace(" ", "");

        System.out.println("\n" + x);
        System.out.println("\nIl numero di caratteri messi sono senza spazi\n" +x.length());

        y="La 4E è la peggiore";
        System.out.println(y);
        System.out.println(y.replace("peggiore", "migliore"));//si sta sostituendo il migliore
        System.out.println(y.replace(" ", "").length());//il numero totale senza condiderare spazzi
        System.out.println(y.indexOf("4E")+1);//La posizione dove si trova 4E

        z = y.substring(11,19);
        System.out.println("\n" + z);

        int a;
        String b;
        System.out.println("inserisci un numero: ");
        a = in.nextInt();
        //Serve per rendere stringa un numero Intero
        b = Integer.toString(a);
        System.out.println(b.length());

        String c;
        int d;
        System.out.println("inserisci un numero: ");
        //c = in.nextInt(); //input da testiera
        //d = atoi(c.c_str());//converte da Stringa a Intero
        //System.out.println(d);
    }
}
