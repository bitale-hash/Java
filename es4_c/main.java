package Java.es4_c;
import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        int b,a,x,y;
        Scanner input=new Scanner(System.in);
        System.out.println("scrivi la dimensione della base:  ");
            b = input.nextInt();
        System.out.println("scrivi la dimensione dell altezza:  ");
            a = input.nextInt();
        System.out.println("scrivi la posizione dell ascissa:  ");
            x = input.nextInt();
        System.out.println("scrivi la posizione dell ordinata:  ");
            y = input.nextInt();
            
        es4 e=new es4(b,a,x,y);
    }
}
