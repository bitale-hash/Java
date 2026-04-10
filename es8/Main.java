package Java.es8;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){ 

        Dipendente d1 = new Dipendente(); 
            d1.setName("Alessandro"); 
            d1.setStipendio(BigDecimal.valueOf(11111.00)); 
            
            System.out.println(d1.getName() + " , " + d1.getStipendio().setScale(2, RoundingMode.HALF_UP));
        Dipendente d2 = new Dipendente("Ceasar", BigDecimal.valueOf(2222.22));
            d2.aumento(11.0); 
            System.out.println(d2.getName() + " , " + d2.getStipendio().setScale(2, RoundingMode.HALF_UP)); 
 
 
}

}
