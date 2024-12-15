package MyTests;

import java.util.*;

public class SetsAndMaps {
    public static void main(String[] args) {
        // Creating an ArrayList for Strings
        List<String> fruits = new ArrayList<>();

        fruits.add("Cherry");
        fruits.add("Dragonfruit");
        fruits.add("Elderberry");
        fruits.add("Elderberry");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        // Creating an ArrayList for Integers
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();

        // Adding random integers to the Integer ArrayList
        for (int i = 0; i < 5; i++) {
            integerList.add(random.nextInt(100)); // Random integers between 0 and 99
        }

        // Printing the ArrayLists
        System.out.println("Fruits List: " + fruits);
        System.out.println("Integer List: " + integerList);


        //Set HashSet, makes sure than no dublicates is there, and thewre is no order, or index
        Set<String> fruitsSet = new HashSet<>(fruits);
        Set<Integer> IntegerSet = new HashSet<>(integerList);

        // Printing the Hashsets
        System.out.println("Fruits HashSet: " + fruitsSet);
        System.out.println("Integer HashSet: " + IntegerSet);

        // TreeSet, makes sure than no dublicates is there, sorts by natural order
        fruitsSet = new TreeSet<>(fruits);
        IntegerSet = new TreeSet<>(integerList);

        // Printing the TreeSets
        System.out.println("Fruits TreeSet: " + fruitsSet);
        System.out.println("Integer TreeSet: " + IntegerSet);

        // TreeSet, makes sure than no dublicates is there, the order is the sma as the order it was send to the set
        fruitsSet = new LinkedHashSet<>(fruits);
        IntegerSet = new LinkedHashSet<>(integerList);

        // Printing the TreeSets
        System.out.println("Fruits LinkedHashSet: " + fruitsSet);
        System.out.println("Integer LinkedHashSet: " + IntegerSet);



        //Maps

        //



    }
}
