public class Potion extends Item {
    private String effect;
    private String type;

    Potion(String name, int numbersOfItem,String type,String effect) {
        super(name, numbersOfItem);
        this.effect=effect;
        this.type=type;
    }

    public String getEffect() {
        return effect;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return ("items: "+getName()+", Number of Items: "+ getNumbersOfItem()+"type: "+getType()+", effect: "+getEffect());
    }
}
