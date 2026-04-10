package Java.es6;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContoBancario cb1 = new ContoBancario("harrysChecking");
         cb1.Saldo();
        ContoBancario cb2 = new ContoBancario("harrysChecking2", new BigDecimal(100700.00));
        BigDecimal money = new BigDecimal("999.99");
        cb1.Add(money);

        BigDecimal scontrino =  cb2.StampaScontrino();
       System.out.println("Scontrino: il tuo saldo è di : "+scontrino+" €");
        
       
    }
}