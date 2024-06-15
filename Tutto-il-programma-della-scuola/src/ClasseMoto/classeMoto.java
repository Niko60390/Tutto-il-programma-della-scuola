public class classeMoto {
    public String motoreMarca;
    public String motoreNome;
    public String motoreAnno;
    public int motorePrezzo;
    public int KW;
    
    public classeMoto(){
        
    }

    public double calcoloPotenzaKW() {
        double risultato;
        risultato = KW * 1.36;
        return risultato;
    }

    public String dettagli() {
        String info="";
        info = "La moto che hai scelto e' un " + motoreMarca  + " e il suo nome sul mercato e' " + motoreNome +
                "\n e l'anno del motore e' del " + motoreAnno + ", la sua potenza su kilowatt e' di " + calcoloPotenzaKW() +
                ".\n Il costo dalla moto e' di " + motorePrezzo;
        return info;
    }
}