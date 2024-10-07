public class Item {

    private String name;
    private int numbersOfItem;

    Item(String name,int numbersOfItem){
        this.name=name;
        this.numbersOfItem=numbersOfItem;

    }

    public String getName() {
        return name;
    }

    public int getNumbersOfItem() {
        return numbersOfItem;
    }

    @Override
    public String toString() {
        return ("items: "+getName()+", Number of Items: "+ getNumbersOfItem());
    }
}
