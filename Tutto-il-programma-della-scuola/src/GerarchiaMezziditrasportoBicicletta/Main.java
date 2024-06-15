public class Main {
    public static void main(String[] args) {
        MezzoDiTrasporto y = new MezzoDiTrasporto("TOYOTA", 20350, "Quatro \n(Con il conducente)");
        System.out.println(y.dettagli());
        
        Bicicletta x = new Bicicletta("Mountain bike",250,"Zero", "Rosso scarlatto", "25Km/h");
        System.out.println(x.dettagli());

    }
}