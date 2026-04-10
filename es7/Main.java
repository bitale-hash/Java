package Java.es7;
import java.math.BigDecimal;
import java.time.Duration;
public class Main {
    public static void main(String[] args) { 
  
    Cellulare nokia = new Cellulare(new BigDecimal(20.00),0); 
 
    nokia.ricarica(new BigDecimal(50.00)); 
    nokia.chiamata(Duration.ofSeconds(110)); 

        //CONTROLLO CREDITO 
    System.out.println(nokia.numero404()); 
        //CONTROLLO QUANTE CHIAMATE HO FATTO
    System.out.println(nokia.getNumeroChiamate()); 
        //CONTROLLO RESET CHIAMATE
    nokia.azzeraChiamate(); 
    System.out.println(nokia.getNumeroChiamate()); 
 
}

}
