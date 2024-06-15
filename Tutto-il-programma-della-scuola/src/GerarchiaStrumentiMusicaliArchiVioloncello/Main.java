public class Main{
    public static void main (String[] args){
        StrumentiMusicali x = new StrumentiMusicali("Sax","Yamaha","Ottone");
        System.out.println(x.dettagli());


        Archi y = new Archi("Violini", "Yamaha", "legno", 4);
        System.out.println(y.dettagli());

        Violincello z = new Violincello("Violoncello ","Harley Benton","Legno e metallo",4,"1.30 Cm");
        System.out.println(z.dettagli());
    }
}