/**************************************************************************
 * Cognome:
 * Nome:
 * Titolo della traccia:
 * ***********************************************************************/
public class Main
{
public static void main(String[] args) {
        Cerchio pippo1=new Cerchio(1,"Giallo");
        Cerchio pippo2=new Cerchio();
        
        pippo2.setRaggio(2);
        pippo2.setColore("Rosso");
        
        System.out.println(pippo1.Area());
        System.out.println(pippo2.dettagli());

}
}