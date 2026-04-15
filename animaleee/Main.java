package Java.animaleee;
import java.util.Scanner;

/* quest app crea un solo animale 
   se provate a crearne 2, il primo si cancella  */

public class Main {

    private Scanner scanner = new Scanner(System.in);
    private Animale animale;

    public static void main(String[] args) {
        Main app = new Main();      //crea un oggetto main 
        app.run();                   //avvia run() che fa tutto
    }

    private void run() {
        boolean running = true;

        while (running) {
            int scelta = menu();

            switch (scelta) {                       //notate come qui ci sono tutti i metodi che ho scritto sotto
                case 1 -> createAnimal();           
                case 2 -> stampa();
                case 3 -> stampaVerso();
                case 4 -> modificaVerso();
                case 0 -> {
                    System.out.println("Arrivederci!");
                    scanner.close();
                    running = false;
                }
                default -> System.out.println("Scelta non valida");
            }

            System.out.println();
        }
    }
        //notate la logica ( metodo run--->chiama--->metodi del main--->chiamano--->metodi di Animale o di Mammifero)
    private int menu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Crea animale");
        System.out.println("2. Stampa animale");
        System.out.println("3. Stampa verso");
        System.out.println("4. Modifica verso");
        System.out.println("0. Esci");

        return Integer.parseInt(scanner.nextLine());
    }

    private void createAnimal() {
        try {
            System.out.println("Nome:");
            String nome = scanner.nextLine();

            System.out.println("Età:");
            int eta = Integer.parseInt(scanner.nextLine());

            System.out.println("Verso:");
            String verso = scanner.nextLine();

            System.out.println("È un mammifero? (Y/N)");
            String risposta = scanner.nextLine();

            if (risposta.equalsIgnoreCase("Y")) {
                System.out.println("Tipo di pelo:");
                String pelo = scanner.nextLine();
                animale = new Mammifero(nome, eta, verso, pelo);
            } else {
                animale = new Animale(nome, eta, verso);
            }

            System.out.println("Animale creato!");

        } catch (Exception e) {
            System.out.println("Errore nella creazione animale");
        }
    }

    private void stampa() {
        if (animale != null) {
            System.out.println(animale);
        } else {
            System.out.println("Nessun animale creato");
        }
    }

    private void stampaVerso() {
        if (animale != null) {
            System.out.println("Verso: " + animale.getVerso());
        } else {
            System.out.println("Nessun animale creato");
        }
    }

    private void modificaVerso() {
        if (animale != null) {
            System.out.println("Nuovo verso:");
            String nuovo = scanner.nextLine();
            animale.setVerso(nuovo);
        } else {
            System.out.println("Nessun animale creato");
        }
    }
}