 

import java.util.Random; 
//import java.lang.Math;                  gia integrato, non serve

public class Dado 
{ 
    private int numeroFacce; 
    private Random gen=new Random();
    private int result;

    //COSTRUTTORE1
    public Dado(){
        this.numeroFacce = 6; 
        //result = gen.nextInt(numeroFacce) + 1;  non mi piace la logica quindi lo eliminerei
    }
    //COSTRUTTORE2
    public Dado(int n){ 
        this.numeroFacce=n;
        //result = gen.nextInt(n) + 1;              non mi piace la logica quindi lo eliminerei
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
        return gen.nextInt(numeroFacce) + 1; 
    } 
    //UTILIZZA LA CLASSE MATH x generare un numero random
    public int lanciaMath(){   
        return ((int) (Math.random()* numeroFacce)) + 1;  
    }
}
