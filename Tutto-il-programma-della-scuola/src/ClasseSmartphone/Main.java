/* Creare la classe Smartphone con gli attributi pubblici, inserendo 3 costruttori.
Creare poi la classe tester con 3 oggetti creati usando tutti i costruttori*/
package ClasseSmartphone;
public class Main {
    public static void main(String[] args) {
        Smartphone IOS = new Smartphone("Iphone 15 Pro Max","A17 Pro a 6 core da 3,7 GHz",8,1,3650,"48MP","iOS 17.0.2",1380);
        Smartphone Samsung = new Smartphone("Samsung Galaxy S23 Ultra",12,1,5000,"200MP","Sistema operativo Google",1889);

        System.out.println(IOS.dettagli());
        System.out.println(Samsung.dettagli());
    }
}