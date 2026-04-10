package Java.es7;
import java.math.BigDecimal;  //tipo perfetto per rappresentare il credito
import java.math.RoundingMode;//per arrotondare
import java.time.Duration;    //per convertire i secondi in minuti

public class Cellulare { 

    private BigDecimal credito; 
    private int numeroChiamate; 
    private static BigDecimal costoMinuto= new BigDecimal(0.20);

        //COSTRUTTORE
    public Cellulare( BigDecimal creditoIniziale , int nChiamateIniziali) { 
        credito = creditoIniziale; 
        numeroChiamate = nChiamateIniziali; 
    } 
        //RICARICA CREDITO
    public void ricarica(BigDecimal unaRicarica){ 
        credito = credito.add(unaRicarica); 
    } 
        //CONSUMA MINUTI
         
    public void chiamata(Duration secondiDurata) { 
        BigDecimal minuti = BigDecimal.valueOf(secondiDurata.getSeconds()) //questo prende i secondi della chiamata come BigDecimal
            .divide(BigDecimal.valueOf(60)                            //questo divide i secondi per 60.00(BigDecimal)
            .setScale(2, RoundingMode.HALF_UP));                 //da la presione dopo la virgola e arrotonda per eccesso
                                                                                    
        
        System.out.println("Costo chiamata: " +  costoMinuto.multiply(minuti).setScale(2, RoundingMode.HALF_UP));
        System.out.println("Credito rimasto: " + credito.subtract(costoMinuto.multiply(minuti)).setScale(2, RoundingMode.HALF_UP));       
        numeroChiamate = numeroChiamate + 1; 
       
    } 
        //CREDITO RIMASTO
    public BigDecimal numero404() { 
        return credito; 
    } 
        //NUMERO DELLE CHIAMATE EFFETTUATE
    public int getNumeroChiamate() { 
        return numeroChiamate; 
    } 
        //AZZERA IL NUMERO DELLE CHIAMATE 
    public void azzeraChiamate() 
    { 
    numeroChiamate = 0; 
    } 
} 
