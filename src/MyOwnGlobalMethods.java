import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public interface MyOwnGlobalMethods {

    void performTask(); // Method to be implemented by other classes

    // Default method with implementation
    default void log(String message) {
        System.out.println("Log: " + message);
    }

    // Static method
    static void printVersion() {
        System.out.println("Version 1.0");
    }
    //Gets the printer Instance
    static Printer getPrinter() {
        return Printer.getPrinter() ;
    }

    //Try to make it work with help next time
     static SortArrayList getObjectsSort() {
        return SortArrayList.getGetSortArrayListInstance();
    }

    static Input getInputInstance() {
        return Input.getInputInstance();
    }







}
//inner class For a printer
class Printer<T,G extends Serializable>{
    private static Printer printer = new Printer<>(null,null);;

    T thingToPrint;
    G otherThingToPrint;

    Printer(T thingToPrint, G otherThingToPrint ){
        this.thingToPrint=thingToPrint;
        this.otherThingToPrint=otherThingToPrint;

    }
    static Printer getPrinter() {
        return printer;
    }


    public void shout(T thingToPrint, G otherThingToPrint) {
        this.thingToPrint = thingToPrint;
        this.otherThingToPrint = otherThingToPrint;
        System.out.println(thingToPrint);
        System.out.println(otherThingToPrint);
    }

}
class SortArrayList {

    private static SortArrayList getSortArrayListInstance = new SortArrayList();

    Objects objects;
    String method;

    SortArrayList(){

    }
    SortArrayList(Object object, Method method){

    }

    public void setObjects(Objects objects, Method method2) throws NoSuchMethodException {
        this.objects = objects;
        this.method="."+objects.getClass().getMethod(String.valueOf(method2));
    }

    public static SortArrayList getGetSortArrayListInstance() {
        return getSortArrayListInstance;
    }
    /*public static ArrayList<Objects> test(ArrayList<Objects> objectsArrayList){
        objectsArrayList.sort(Comparator.comparing(objects::method));


    }

     */

}
class Input{
    static Scanner sc;
    private static final Input input= new Input();

    public static Input getInputInstance() {
        return  input;
    }
    Input(){
        sc = new Scanner(System.in);
    }



    // Method to receive an integer
    public int getInt() {
        System.out.print("Enter an integer: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Please enter an integer: ");
            sc.next(); // Discard invalid input
        }
        return sc.nextInt();
    }

    // Method to receive a double
    public double getDouble() {
        System.out.print("Enter a double: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a double: ");
            sc.next(); // Discard invalid input
        }
        return sc.nextDouble();
    }

    // Method to receive a string
    public String getString() {
        System.out.print("Enter a string: ");
        return sc.next();
    }

    // Method to receive a line of text
    public String getLine() {
        System.out.print("Enter a line of text: ");
        sc.nextLine(); // Clear buffer
        return sc.nextLine();
    }

    // Method to receive a boolean
    public boolean getBoolean() {
        System.out.print("Enter 'true' or 'false': ");
        while (!sc.hasNextBoolean()) {
            System.out.print("Invalid input. Please enter 'true' or 'false': ");
            sc.next(); // Discard invalid input
        }
        return sc.nextBoolean();
    }

    // Method to receive a character
    public char getChar() {
        System.out.print("Enter a character: ");
        String input = sc.next();
        while (input.length() != 1) {
            System.out.print("Invalid input. Please enter a single character: ");
            input = sc.next();
        }
        return input.charAt(0);
    }

    // Method to receive an integer within a range
    public int getIntInRange(int min, int max) {
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
    public double getDoubleInRange(double min, double max) {
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
    // Method to receive a list of integers
    public ArrayList<Integer> getIntList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            list.add(getInt());
        }
        return list;
    }

    // Method to receive a list of strings
    public ArrayList<String> getStringList(int size) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter " + size + " strings:");
        for (int i = 0; i < size; i++) {
            list.add(getString());
        }
        return list;
    }

    // Method to receive a list of floating-point numbers
    public ArrayList<Double> getDoubleList(int size) {
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Enter " + size + " doubles:");
        for (int i = 0; i < size; i++) {
            list.add(getDouble());
        }
        return list;
    }
    // Method to receive an array of integers
    public int[] getIntArray(int size) {
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = getInt();
        }
        return array;
    }

    // Method to receive an array of strings
    public String[] getStringArray(int size) {
        String[] array = new String[size];
        System.out.println("Enter " + size + " strings:");
        for (int i = 0; i < size; i++) {
            array[i] = getString();
        }
        return array;
    }

    // Method to receive a list of floating-point numbers
    public double[] getDoubleArray(int size) {
        double[] array = new double[size];
        System.out.println("Enter " + size + " doubles:");
        for (int i = 0; i < size; i++) {
            array[i] = getDouble();
        }
        return array;
    }

    // Method to receive a yes/no confirmation
    public boolean getConfirmation() {
        System.out.print("Enter 'y' for yes or 'n' for no: ");
        String input = sc.next().toLowerCase();
        while (!input.equals("y") && !input.equals("n")) {
            System.out.print("Invalid input. Enter 'y' or 'n': ");
            input = sc.next().toLowerCase();
        }
        return input.equals("y");
    }
}