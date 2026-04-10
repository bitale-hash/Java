package Java.es9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int g,o,m,s,tot;
    Scanner input=new Scanner(System.in);
        System.out.println("Dimmi quanti giorni sono passati:  ");
            g = input.nextInt();
        System.out.println("Dimmi quante ore sono passate:  ");
            o = input.nextInt();
        System.out.println("Dimmi quanti minuti sono passati:  ");
            m = input.nextInt();
        System.out.println("Dimmi quanti secondi sono passati:  ");
            s = input.nextInt();
        TimeConverter a=new TimeConverter();
         System.out.println(a.calcola(g,o,m,s));
    }
}