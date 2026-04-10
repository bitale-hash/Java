package Java.es6;
import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {
        ContoBancario cb1 = new ContoBancario("harrysChecking");
         cb1.Saldo();
        ContoBancario cb2 = new ContoBancario("momsSaving", new BigDecimal(100700.00));
         cb2.Saldo();
        
        cb2.Withdrawn(new BigDecimal(500.00));
        
        cb1.Add(new BigDecimal(999.00));

        BigDecimal scontrino =  cb2.StampaScontrino();
        System.out.println("Scontrino: il tuo saldo è di : "+scontrino+" €");
        
       
    }
}