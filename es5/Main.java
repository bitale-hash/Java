import java.util.Scanner;
public class Main {

    public static void main(String[] args) { 

        Dado d1 = new Dado(); //COSTRUTTORE1
        Dado d2 = new Dado(20); //COSTRUTTORE2 

        //UTILIZZA LA CLASSE RANDOM
        int ris1 = d1.lanciaRandom(); 
        System.out.println("Lancio del dado usando lanciaRandom(): "+ ris1); 

        //UTILIZZA LA CLASSE MATH 
        int ris2 = d2.lanciaMath(); 
        System.out.println("Lancio del dado usando lanciaMath(): "+ ris2);

        //TESTO setFacce()
        Scanner input=new Scanner(System.in);
        System.out.println("inserisci il numero di faccie del dado");
        int nf = input.nextInt();
        d1.setFacce(nf); 
}
}
