package GerarchiaProdottoPanettone;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Panettone Motta = new Panettone();
        String s1, x;
        int y;
        System.out.println("Qual'è il tuo Panettone preferito?\n");
        s1 = "il mio Panettone preferito e della marca MOTTA al cioccolato e frutti di bosco";

        //Questo if cerca la marca del panattone
        if (s1.indexOf("MOTTA") >= 0||s1.indexOf("motta") >= 0||s1.indexOf("Motta") >= 0) {
            Motta.setMarca("Motta");//marca motta

        } else if (s1.indexOf("BAULI")>=0||s1.indexOf("Bauli") >= 0||s1.indexOf("bauli") >= 0) {
            Motta.setMarca("Bauli");//marca bauli

        } else if (s1.indexOf("carrefour") >= 0||s1.indexOf("Carrefour") >= 0||s1.indexOf("CARREFOUR") >= 0) {
            Motta.setMarca("Carrefour");//marca carrefour

        } else if (s1.indexOf("balocco") >= 0||s1.indexOf("Balocco") >= 0||s1.indexOf("BALOCCO") >= 0) {
            Motta.setMarca("Balocco");//marca balocco

        } else {//non è stato trovato la marca
            System.out.println("Non è stato riconosciuto la marca del panettona puoi inserilla?");
            x = in.nextLine();
            Motta.setMarca(x);
        }
        System.out.println("Qual è il suo prezzo?");
        y = in.nextInt();
        Motta.setPrezzo(y);
        System.out.println("Qual è la sua data di scadenza");
        x = in.nextLine();
        Motta.setScadenza(x);


    }
}