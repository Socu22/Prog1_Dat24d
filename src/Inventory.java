import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;
    public Inventory(){

        items = new ArrayList<>();

    }
    public void addItem(Item item){
        items.add(item);
    }
    public void addItem(String name, int numberOfItems, String type, String effect ){
        items.add(new Potion(name,numberOfItems,type,effect));
    }
    public void displayInventory() {
        for (Item item: items) {
            System.out.println(item.toString());

        }
    }
}
