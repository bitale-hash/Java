import java.util.Random; 
import java.lang.Math; 

public class Dado 
{ 
    private int numeroFacce; 
    private Random gen;

    //COSTRUTTORE1
    public Dado(){
        numeroFacce = 6; 
        gen = new Random();
    }
    //COSTRUTTORE2
    public Dado(int n){ 
        numeroFacce=n;
        gen= new Random();
    }

    public int getFacce() { 
        return numeroFacce;
    } 

    public void setFacce(int nuovoVal) { 
        numeroFacce = nuovoVal; 
        System.out.println("il numero di faccie del primo dado è stato modificato a " + numeroFacce); 
    } 

    //UTILIZZA LA CLASSE RANDOM x generare un numero random
    public int lanciaRandom() {      
        int result = gen.nextInt(numeroFacce) + 1 ; 
        return result; 
    } 
    //UTILIZZA LA CLASSE MATH x generare un numero random
    public int lanciaMath(){   
        return ((int) (Math.random()* numeroFacce)) + 1;  
    }
}
