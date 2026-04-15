 package Java.animaleee;

public class Mammifero extends Animale{     //CLASSE FIGLIA
    String pelo;
    //Costruttore
    public Mammifero(String nome, int eta, String verso, String pelo){
        super(nome, eta, verso);
        this.pelo = pelo;
    } 

    /*tutti i metodi, compresi i get e set della classe Animale 
    sono utilizzabili anche dalla classe Mammifero */

    //metodi get
    public String getPelo(){
        return pelo;
    }
    //metodi set
    public void setVerso(String verso){
        this.verso = verso;  
    }
    /*toString   
                 per utilizzarlo devo avere un oggetto Mammifero 
    */
    public String toString(){
            return "Animale: " + nome + ", Età: " + eta + ", Verso: " + verso + ", Pelo: " + pelo  ;
    }
    
}
