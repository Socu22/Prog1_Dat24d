package LiveInClass;

import java.awt.*;

public class MinEgenKlasse_Butik {
    public static void main(String[] args) {
        Cykle BMX = new Cykle("A24",1,"Normal",15);
        System.out.println(BMX.toString());


    }
}
class Item{
    String name;
    String type;
    int amount;
    Item(String name, int amount,String type){
        this.name=name;
        this.amount=amount;
        this.type=type;

    }
}
class Cykle extends Item{
    int gear;
    Cykle(String name, int amount, String type, int gear) {
        super(name, amount, type);
        this.gear=gear;



    }
    public String toString(){
        return String.format("Dette er en %s\n Jeg har %d, og det er en %s Cykel med %d gear ",name,amount,type,gear);
    }
}
