package Java.es7;

public class Main {
    public static void main(String[] args) { 
  
    Cellulare nokia = new Cellulare(20.0,0); 
 
    nokia.ricarica(50.0); 
    nokia.chiamata(111.0); 

        //CONTROLLO CREDITO 
    System.out.println(nokia.numero404()); 
        //CONTROLLO QUANTE CHIAMATE HO FATTO
    System.out.println(nokia.getNumeroChiamate()); 
        //CONTROLLO RESET CHIAMATE
    nokia.azzeraChiamate(); 
    System.out.println(nokia.getNumeroChiamate()); 
 
}

}
