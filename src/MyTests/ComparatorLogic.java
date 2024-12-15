package MyTests;

import java.util.*;

public class ComparatorLogic {
    public static void main(String[] args) {
        List<Fish> fishList = Arrays.asList(new Fish(2, 3, "Starlike"),
                new Fish(2, 5, "Blue"),
                new Fish(7, 7, "Red"));
        System.out.println(fishList);
        fishList.sort(Comparator.comparingInt(Fish::getFins).thenComparing(Fish::getColor));
        System.out.println(fishList);


        List<String> stringList = Arrays.asList("Jensen", "Bo", "Peterson", "Hansen", "Jackson", "Henrik");
        //stringList.sort(Comparator.comparing(s ->s.indexOf("s") ));
        //stringList.sort(Comparator.comparingInt(String::length));
        // Collections.sort(stringList,Comparator.comparing(String::length));

        System.out.println(stringList);


        //Takes a List of Arrays as a list, and sorts them arcording to intvalue
        List<Integer> integerList = Arrays.asList(2, 5457, 43, 57, 4, 77, 8, 18, 34, 65, 12, 33, 11, 345, 3333); //this is made of the Integer types not int as it is not a referance type
        //integerList.add(3); //Tries to overwrite an abstract method
        System.out.println(integerList.size());
        integerList.sort(Comparator.comparing(Integer::intValue)); //sort arcording to Integer Objects values
        System.out.println(integerList);
        //Adds List of Arrays as a list to an Arraylist
        ArrayList<Integer> integerArrayList = new ArrayList<>(integerList);
        integerArrayList.add(3); //uses .add which can be used in a ArrayList as Colections.add is overwrite'd correctly
        integerArrayList.sort(Comparator.comparing(Integer::intValue)); //again
        System.out.println(integerArrayList);

        integerList = integerArrayList; //checks if it can be sent back
        System.out.println(integerList); //Check

        //Tries with Sykronised
        List<String> stringLisT = new ArrayList<>();
        stringLisT.add("AC");//Bigger hashcode value than singe Char
        stringLisT.add("D");
        stringLisT.add("B");
        stringLisT.add("C");
        System.out.println("list: " + stringLisT);

        List<String> synList = Collections.synchronizedList(stringLisT);
        synList.add("E"); //Much better
        synList.sort(Comparator.comparingInt(String::hashCode));
        System.out.println("SynList: " + synList);




    }

}


class Fish {
    int gills;
    int fins;
    String color;

    Fish(int gills, int fins, String color){
        this.gills=gills;
        this.fins=fins;
        this.color=color;
    }

    public int getGills() {
        return gills;
    }

    public int getFins() {
        return fins;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                ", color='" + color + '\'' +
                '}';
    }
}
