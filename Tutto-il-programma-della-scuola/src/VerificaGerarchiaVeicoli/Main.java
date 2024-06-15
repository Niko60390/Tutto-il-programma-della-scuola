public class Main {
    public static void main(String[] args) {
        Automobile fiat = new Automobile("Fiat",2006,4,"1200");
        System.out.println(fiat.dettagli());
        Nave costa = new Nave("Costa Concordia", 2013, 22, "140.000");
        System.out.println(costa.dettagli());
    }
}