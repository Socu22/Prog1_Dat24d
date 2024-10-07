package MyTests;

import java.io.Serializable;

public class GTP_Main {
    public static void main(String[] args) {
        shout("Tsttr","b");

        GTPrinter p = new GTPrinter(22,33);
        p.print();


    }
    private static <T,G> void shout(T thingToShout, G otherThingToShout){
        System.out.println(thingToShout+"!!");
        System.out.println(otherThingToShout+"!!");

    }
}
class GTPrinter<T,G extends Serializable>{

    T thingToPrint;
    G otherThingToPrint;

    GTPrinter(T thingToPrint, G otherThingToPrint ){
        this.thingToPrint=thingToPrint;
        this.otherThingToPrint=otherThingToPrint;

    }
    public void print(){
        System.out.println(thingToPrint);
        System.out.println(otherThingToPrint);
    }

}
