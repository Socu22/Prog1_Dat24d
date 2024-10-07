public class JavaObjectOrientedExample {
    public static void main(String[] arg){
        Inventory inventory = new Inventory();
        Item item = new Item("Item",2);

        Potion potion = new Potion("Potion",22,"Health","+100 hp");

        inventory.addItem(item);
        inventory.addItem(potion);

        inventory.addItem("TeddyBear",2," toy","Kills you in sleep");
        inventory.displayInventory();



    }
}
