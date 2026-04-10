package Java.es7;
public class Cellulare { 

    private double credito; 
    private int numeroChiamate; 

        //COSTRUTTORE
    public Cellulare(double creditoIniziale, int nChiamateIniziali) { 
        credito = creditoIniziale; 
        numeroChiamate = nChiamateIniziali; 
    } 
        //RICARICA CREDITO
    public void ricarica(double unaRicarica){ 
        credito = credito + unaRicarica; 
    } 
        //CONSUMA MINUTI
    public void chiamata(double minutiDurata) { 
        credito = credito - (0.20*minutiDurata); 
        numeroChiamate = numeroChiamate + 1; 
    } 
        //CREDITO RIMASTO
    public double numero404() { 
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
