package Java.es10;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     
        Scanner input=new Scanner(System.in);
        System.out.println("Dimmi quanti secondi sono passati:  ");
        int s = input.nextInt();
        input.close(); 

        SecondConverter a= new SecondConverter();
        System.out.println(a.calcola(s));
        
    }
}