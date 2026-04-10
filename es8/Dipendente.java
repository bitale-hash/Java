package Java.es8;

import java.math.BigDecimal;

public class Dipendente {
    private String name; 
    private BigDecimal stipendio;

    public Dipendente(){
        name="";
        stipendio=BigDecimal.ZERO;
    }
    public Dipendente(String name, BigDecimal stipendio){
        this.name=name;
        this.stipendio=stipendio;
    }
        //GET
    public String getName(){
        return name;
    }
    public BigDecimal getStipendio(){
        return stipendio;
    }
        //SET
    public void setName(String name){
        this.name=name;
    }
    public void setStipendio(BigDecimal stipendio){
        this.stipendio=stipendio;
    }
        //OTHER
   public void aumento(double percentuale) {
        stipendio = (stipendio.add(stipendio.multiply(BigDecimal.valueOf(percentuale)))).divide(BigDecimal.valueOf(100));
        //stipendio =( stipendio + (stipendio    *      (BigDecimal)percentual         )    /    (BigDecimal)100            
    }



}
