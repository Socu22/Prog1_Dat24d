package MyTests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ItemManager {
    // Thread-safe list
    private static List<Item> items = Collections.synchronizedList(new ArrayList<>());

    // Method to add an item to the list
    public static void addItem(Item item) {
        items.add(item);
    }

    // Method to get the list (a synchronized block is needed for iteration)
    public static List<Item> getItemsList() {
        return items;
    }

    // Method to update an item in the list
    public static void updateItem(int index, Item newItem) {
        if (index >= 0 && index < items.size()) {
            items.set(index, newItem);
        }
    }

    // Method to remove an item from the list
    public static void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        }
    }
}
abstract class Item{
    String name;
    int amount;
    String description;
    Item(String name, int amount, String description){
        this.name=name;
        this.amount=amount;
        this.description=description;

    }



}
class MeleeWeapon extends Item{

    String elemental;

    MeleeWeapon(String name, int amount, String description) {
        super(name, amount, description);
        this.elemental= String.valueOf(chosenElement());
    }
    public enum ElementalAttribute{
        Fire,Water,Earth, Wind, Thunder, Death, Life, Light, Dark, Illusion
    }
    public Enum chosenElement( ){
        System.out.println("Choose Magical element for your artifact "+name);
        System.out.println("Fire,Water,Earth, Wind, Thunder, Death, Life, Light, Dark, Illusion");
        Scanner sc = new Scanner(System.in);
        Enum result = null;
        switch (sc.next()) {
            case "Fire":
                result = ElementalAttribute.Fire;
                break;
            case "Water":
                result = ElementalAttribute.Water;
                break;
            case "Earth":
                result = ElementalAttribute.Earth;
                break;
            case "Wind":
                result = ElementalAttribute.Wind;
                break;
            case "Thunder":
                result = ElementalAttribute.Thunder;
                break;
            case "Death":
                result = ElementalAttribute.Death;
                break;
            case "Life":
                result = ElementalAttribute.Life;
                break;
            case "Light":
                result = ElementalAttribute.Light;
                break;
            case "Dark":
                result = ElementalAttribute.Dark;
                break;
            case "Illusion":
                result = ElementalAttribute.Illusion;
                break;
            
        }

        return result;
    }

    @Override
    public String toString() {
        return "MeleeWeapon{" +
                "name='" + name + '\'' +
                ", elemental='" + elemental + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
class House extends Item{
    ArrayList<String> resources = new ArrayList<>(5);
    String rock;
    String wood;
    String  steelNails;

    House(String name, int amount, String description) {
        super(name, amount, description);
        this.rock= "Rock 0";
        this.wood= "Wood 0";
        this.steelNails= "SteelNails 0";
        this.resources=null;
    }

    public void setResources(ArrayList<String> resources) {
        String rock = setRock("Rock: ", 1);
        resources.set(0,rock);
        String wood = setWood("Wood: ", 1);
        resources.set(1,wood);
        String steelNail = setSteelNails("SteelNail: ", 1);
        resources.set(2,steelNail);
    }

    public String setRock(String rock, int amount) {
        this.rock = rock+amount;
        return rock;
    }

    public String setWood(String wood, int amount) {
        this.wood = wood+amount;
        return wood;
    }

    public String setSteelNails(String steelNails,int amount) {
        this.steelNails = steelNails+amount;
        return steelNails;
    }

    public void createHouse() {

       if (this.wood.equals("Wood: 1")) {


       }
    }

    public static void main(String[] args) {

    }
}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int amount;
        String description;
        boolean b=true;
        System.out.println("exit 0, create melee weapon 1, Build House 2.");
        while(b){

            switch (sc.nextInt()){
                case 0:
                    b=false;
                    break;

                case 1: //create a Melee Weapon!
                     System.out.println("create a Melee Weapon!");
                     System.out.println("Name: ");
                     sc.nextLine();
                     name = sc.nextLine();
                     System.out.println("How Many: ");
                     amount = sc.nextInt();
                     sc.nextLine();
                     System.out.println("Whats the legend about the melee artifact "+name+"?" );
                     description= sc.nextLine();
                     // Add Melee weapon Item to ArrayList
                    Item melee= new MeleeWeapon(name,amount,description);
                     ItemManager.addItem(melee);

                    // Synchronized block for iteration
                    synchronized (ItemManager.getItemsList()) {
                        for (Item item : ItemManager.getItemsList()) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 2:  //house
                    System.out.println("create a house");
                    System.out.println("Name: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("How Many: ");
                    amount = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Whats the style of the house "+name+"?" );
                    description= sc.nextLine();


                    Item house= new House(name,amount,description);
                    ItemManager.addItem(house);


                    // Synchronized block for iteration
                    synchronized (ItemManager.getItemsList()) {
                        for (Item item : ItemManager.getItemsList()) {
                            System.out.println(item);
                        }
                    }

             }
        }



        // Update an item
        ItemManager.updateItem(1, new MeleeWeapon("Knife",2,"Good"));

        // Remove an item
        ItemManager.removeItem(0);

        // Print list after modifications
        synchronized (ItemManager.getItemsList()) {
            System.out.println("Updated List: " + ItemManager.getItemsList());
        }
    }
}
