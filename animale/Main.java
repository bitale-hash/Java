package Java.animale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }

    private void menu() {
        System.out.println("Premi 1 per creare un'istanza animale");
        System.out.println("Premi 2 per stampare");
        System.out.println("Premi 3 per stampare il verso");
        System.out.println("Premi 4 per modificare il verso");
        System.out.println("Premi 0 per uscire");

         Integer.parseInt(scanner.nextLine());
    }

    private void run() {
        boolean running = true;

        while (running) {
            menu();
            private Scanner scanner = new Scanner(System.in);
            int scelta = scanner.nextInt();
           

            switch (scelta) {
                case 1 -> createAnimal();
                case 2 -> stampa();
                case 3 -> stampaVerso();
                case 4 -> modificaVerso();
                case 0 -> {
                    System.out.println("Arrivederci!");
                    scanner.close();
                    running = false;
                }
                default -> System.out.println("Opzione non valida");
            }

            System.out.println();
        }
    }

    private void createAnimal() {
        try {
            System.out.println("Come si chiama l'animale?");
            String nome = scanner.nextLine();

            System.out.println("Quanti anni ha?");
            int eta = Integer.parseInt(scanner.nextLine());

            System.out.println("Che verso fa?");
            String verso = scanner.nextLine();

            System.out.println("E' un mammifero? Y/N");
            String mammifero = scanner.nextLine();

            if (mammifero.equalsIgnoreCase("Y")) {
                System.out.println("Com'è il suo pelo?");
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
            String nuovoVerso = scanner.nextLine();
            animale.setVerso(nuovoVerso);
        } else {
            System.out.println("Nessun animale creato");
        }
    }
}