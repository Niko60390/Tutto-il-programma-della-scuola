public class Main {
    public static void main(String[] args) {
        classeMoto Moto = new classeMoto();
        Moto.motoreNome = "PCX 125cc";
        Moto.motoreMarca = "Honda";
        Moto.motoreAnno = "2021-22";
        Moto.motorePrezzo = 3350;
        Moto.KW = 1;
        classeMoto RKF = new classeMoto ();

        System.out.println(Moto.dettagli() + "\n" + "\n");

        }
    }
