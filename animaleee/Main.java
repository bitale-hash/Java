package Java.animaleee;

import java.util.Scanner;
/* quest app crea una sola istanza di animale e applica dei metodi
   se provate a crearne 2 "animali", il primo si cancella  */
public class Main {
    private Scanner scanner = new Scanner(System.in);
    private Animale animale;
    public static void main(String[] args) {
        Main app = new Main();      //crea un oggetto main chiamato app
        app.run();                   //avviamo run() che fa tutto
    }
    private void run() {
        boolean running = true;
        while (running) {
            int scelta = menu();        //crea menu e legge l'input che li diamo

            switch (scelta) {           //in base all input seleziona
                    //notate come qui ci sono tutti i metodi che ho scritto sotto?
                    //questa è la logica ( metodo run--->chiama--->metodi del main--->chiamano--->metodi di Animale o di Mammifero)
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
    private int menu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Crea animale");
        System.out.println("2. Stampa animale");
        System.out.println("3. Stampa verso");
        System.out.println("4. Modifica verso");
        System.out.println("0. Esci");
        return Integer.parseInt(scanner.nextLine()); /*è più o meno uguale  a:
                                                     int scelta=scanner.nextLine(); 
                                                     return scelta; */
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
            String risposta = scanner.nextLine().trim().toUpperCase(); //.toUppuerCase() trasforma l'input in maiuscolo      
            if (risposta.equals("Y")) {       //controlla che "risposta" sia Y o N
                    //se è Y
                    System.out.println("Tipo di pelo:");
                    String pelo = scanner.nextLine();
                    animale = new Mammifero(nome, eta, verso, pelo);
            } else if (risposta.equals("N")) {
                    //se è N
                    animale = new Animale(nome, eta, verso);
            } else {
                    //se non è ne N ne Y
                    System.out.println("Input non valido! Inserisci Y o N.");
            }
            System.out.println("Animale creato!");
        } catch (Exception e) {
            System.out.println("Errore nella creazione animale");
        }
    }
    
    private void stampa() {
        if (animale != null) {          //animale e il NOME dell ISTANZA della classe Animale/Mammifero
            System.out.println(animale.toString());
            System.out.println(animale);    //ATTENZIONE
            /*  animale = animale.toString() 
             ATTENZIONE il metodo toString devi crearlo almeno nella classe padre Animale*/
        } else {
            System.out.println("Nessun animale creato");
        }
    }
    //Usa metodo getVerso di Animale o Mammifero
    private void stampaVerso() {
        if (animale != null) {
            System.out.println("Verso: " + animale.getVerso());  
            //Guardate la logica! stampaVerso() che è un metodo del main, chiamato da run(),
            // chiama il metodo getVerso() delle classi Animale/Mammifero
        } else {                                                 
            System.out.println("Nessun animale creato");
        }
    }
    //Usa metodo setVerso di Animale o Mammifero
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