package ClasseSmartphone;

public class Smartphone {
    public String telefono;     //informazione (complete/parziali)
    public int prezzo;                  //pZ
    public String sistemiOperativo;     //OS
    public String modello;              //m
    public String processore;           //CPU
    public int ram;                     //r
    public int storage;                 //S
    public int batteria;                //Br
    public String fotoCamera;           //fC

    //------------------------------------------------------------------------------------------------------------------

    //Costruttore vuoto oppure default
    public Smartphone(){
    }
    //------------------------------------------------------------------------------------------------------------------
    /* "Iphone 15 Pro Max","A17 Pro a 6 core da 3,7 GHz",8,1,3650,48,"iOS 17.0.2",1380
     A17 Pro a 6 core da 3,7 GHz
     8
     1
     3650
     "48 MPx"
     iOS 17.0.2
     1380   */
    //Costruttore completo
    public Smartphone (String m, String CPU, int r, int s, int Br, String fC, String OS, int pZ){
        String info = "";
        modello = m;
        processore = CPU;
        ram = r;
        storage = s;
        batteria = Br;
        fotoCamera = fC;
        sistemiOperativo = OS;
        prezzo = pZ;
        telefono = "completo";
    }
    //------------------------------------------------------------------------------------------------------------------
    /*
        "Samsung Galaxy S23 Ultra",12,1,5000,"200 MP","Sistema operativo google",1889
    12
    1
    5000
    "200 MP"
    "Sistema operativo google"
    1889
    */
    //Costruttore parziale
    public Smartphone (String m, int r, int s, int Br, String fC, String OS, int pZ){ //no pcu
        String info="";
        modello = m;
        ram = r;
        storage = s;
        batteria = Br;
        fotoCamera = fC;
        sistemiOperativo = OS;
        prezzo = pZ;
        telefono = "parziale";
    }


    //Dettagli------------------------------------------------------------------------------------------------------------------
    public String dettagli(){
        String info;
        switch (telefono){
            case "completo":
                //Completo
                info =  "Le infomazioni che hai dato sono complete \n" +
                        "Modello :" + modello +"\n" +
                        "Processoere: " + processore + "\n" +
                        "Ram: " + ram + "Gb" + "\n" +
                        "Storage: " + storage + "Tb" + "\n" +
                        "Batteria: " + batteria + "mAh" + "\n" +
                        "Foto Camera: " + fotoCamera + "\n" +
                        "Sistema Operativo: " + sistemiOperativo + "\n" +
                        "Prezzo: €" + prezzo + "\n";
                break;
            case "parziale":
                //parziale
                info =  "Le infomazioni che hai dato sono incomplete \n" +
                        "Modello :" + modello +"\n" +
                        "Ram: " + ram + "Gb" + "\n" +
                        "Storage: " + storage + "Tb" + "\n" +
                        "Batteria: " + batteria + "mAh" + "\n" +
                        "Foto Camera: " + fotoCamera + "\n" +
                        "Sistema Operativo: " + sistemiOperativo + "\n" +
                        "Prezzo: €" + prezzo + "\n";
                break;
            default:
                info="ERROR";
                break;
        }
        return info;
    }
}
