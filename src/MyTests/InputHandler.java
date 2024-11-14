package MyTests;

import java.util.Scanner;

public class InputHandler {
     static Scanner sc = new Scanner(System.in);

    // Method to receive an integer
     static int getInt() {
        System.out.print("Enter an integer: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            sc.next(); // Discard invalid input
        }
        return sc.nextInt();
    }

    // Method to receive a double
     static double getDouble() {
        System.out.print("Enter a double: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a double: ");
            sc.next(); // Discard invalid input
        }
        return sc.nextDouble();
    }

    // Method to receive a string
     static String getString() {
        System.out.print("Enter a string: ");
        return sc.next();
    }

    // Method to receive a line of text
     static String getLine() {
        System.out.print("Enter a line of text: ");
        sc.nextLine(); // Clear buffer
        return sc.nextLine();
    }

    // Method to receive a boolean
     static boolean getBoolean() {
        System.out.print("Enter 'true' or 'false': ");
        while (!sc.hasNextBoolean()) {
            System.out.print("Invalid input. Please enter 'true' or 'false': ");
            sc.next(); // Discard invalid input
        }
        return sc.nextBoolean();
    }

    // Method to receive a character
     static char getChar() {
        System.out.print("Enter a character: ");
        String input = sc.next();
        while (input.length() != 1) {
            System.out.print("Invalid input. Please enter a single character: ");
            input = sc.next();
        }
        return input.charAt(0);
    }

    // Method to receive an integer within a range
     static int getIntInRange(int min, int max) {
        System.out.print("Enter an integer between " + min + " and " + max + ": ");
        int num;
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                sc.next();
            }
            num = sc.nextInt();
            if (num >= min && num <= max) break;
            System.out.print("Out of range. Enter an integer between " + min + " and " + max + ": ");
        }
        return num;
    }

    // Method to receive a floating-point number with custom validation
     static double getDoubleInRange(double min, double max) {
        System.out.print("Enter a double between " + min + " and " + max + ": ");
        double num;
        while (true) {
            while (!sc.hasNextDouble()) {
                System.out.print("Invalid input. Please enter a double: ");
                sc.next();
            }
            num = sc.nextDouble();
            if (num >= min && num <= max) break;
            System.out.print("Out of range. Enter a double between " + min + " and " + max + ": ");
        }
        return num;
    }

    // Method to receive an array of integers
     static int[] getIntArray(int size) {
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = getInt();
        }
        return array;
    }

    // Method to receive an array of strings
     static String[] getStringArray(int size) {
        String[] array = new String[size];
        System.out.println("Enter " + size + " strings:");
        for (int i = 0; i < size; i++) {
            array[i] = getString();
        }
        return array;
    }

    // Method to receive a list of floating-point numbers
     static double[] getDoubleArray(int size) {
        double[] array = new double[size];
        System.out.println("Enter " + size + " doubles:");
        for (int i = 0; i < size; i++) {
            array[i] = getDouble();
        }
        return array;
    }

    // Method to receive a yes/no confirmation
     static boolean getConfirmation() {
        System.out.print("Enter 'y' for yes or 'n' for no: ");
        String input = sc.next().toLowerCase();
        while (!input.equals("y") && !input.equals("n")) {
            System.out.print("Invalid input. Enter 'y' or 'n': ");
            input = sc.next().toLowerCase();
        }
        return input.equals("y");
    }
}
