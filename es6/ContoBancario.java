package Java.es6;
import java.math.BigDecimal;


public class ContoBancario{
   private BigDecimal conto = BigDecimal.ZERO;
   private String name;

    public ContoBancario(String name){
        this.name=name;
        conto=BigDecimal.ZERO;
        System.out.println("you are broke, here is one dollar! XD");
        conto = BigDecimal.ONE;
    }
    public ContoBancario(String name, BigDecimal cash){
        this.name=name;
        conto=cash;
    }

    public void Add(BigDecimal n){
      conto=conto.add(n);
      System.out.println("aggiunti "+n+" € al conto "+ name);
      System.out.println("totale saldo : "+conto+" € ");
    }
    public void Withdrawn(BigDecimal n){
      System.out.println("Detrazione dal conto "+name+" di :  "+ n+" € ");
      conto=conto.subtract(n);
      System.out.println("Saldo attuale del conto "+name+" è di :  "+ conto+" € ");
    }
    public BigDecimal StampaScontrino(){
      System.out.println("Stampo scontrino");
      return (BigDecimal) conto; //conto e BigDecimal
    }
    public void Saldo(){
      System.out.println("il conto attuale di ' "+name+ " '   è di : "+conto+" €");
    }

}