
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int b,a,x,y;
        Scanner input=new Scanner(System.in);
        System.out.println("scrivi la dimensione della base:  ");
            b = input.nextInt();
        System.out.println("scrivi la dimensione dell altezza:  ");
            a = input.nextInt();
        System.out.println("scrivi la posizione del punto in basso a sinistra del rettangolo nel piano delle ascisse (x):  ");
            x = input.nextInt();
        System.out.println("scrivi la posizione del punto in basso a sinistra del rettangolo nel piano delle ordinate (y):  ");
            y = input.nextInt();
            
        Rettangolo r=new Rettangolo(b,a,x,y);

        r.stampa();
        //r.setBase(5);
        r.getArea();
        //r.traslazione(2, 2);
        r.disegna();
        
        System.out.println("La dimensione della base è: "+r.getBase());
        

    }
}
