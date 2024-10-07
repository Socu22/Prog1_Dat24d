package LiveInClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Regnemaskine {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double a = 0, b = 0, res = 0;
        char op;

        while (true) {
            System.out.println("Velkommen til Regnemaskinen\n");
            System.out.println(" + for addition");
            System.out.println(" - for subtraktion");
            System.out.println(" * for multiplikation");
            System.out.println(" / for division");
            System.out.println(" q for quit");

            System.out.println("Indtast operator: ");
            op = keyboard.next().charAt(0);

            // Hvis brugeren taster 'q', afslut løkken
            if (op == 'q') break;

            a = readDouble("a: ");
            b = readDouble("b: ");

            // Tjek for ulovlig operator
            if (op != '+' && op != '-' && op != '*' && op != '/') {
                System.out.println("Ulovlig operator!");
                continue; // Spring resten over og start forfra i løkken
            }

            switch (op) {
                case '+': res = a + b; break;
                case '-': res = a - b; break;
                case '*': res = a * b; break;
                case '/':
                    if (b != 0) {
                        res = a / b;
                    } else {
                        System.out.println("Fejl: Division med 0 er ikke tilladt!");
                        continue;
                    }
                    break;
            }

            System.out.println("Resultat: " + a + " " + op + " " + b + " = " + res);
        }

        System.out.println("Program afsluttet");
    }

    static double readDouble(String prompt) {
        double n = 0;
        boolean ok = false;

        while (!ok) {
            try {
                System.out.println(prompt);
                n = keyboard.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Ulovlig input! Prøv igen.");
                keyboard.nextLine(); // Rydder bufferen
            }
        }

        return n;
    }
}
