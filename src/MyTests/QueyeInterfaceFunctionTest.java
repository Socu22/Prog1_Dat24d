package MyTests;

import java.util.LinkedList;
import java.util.Queue;

public class QueyeInterfaceFunctionTest {
    public QueyeInterfaceFunctionTest() {
    }

    public static void main(String[] args) {
        Queue<String> queueList= new LinkedList<>();


        queueList.add("Første");
        queueList.add("Anden");
        queueList.add("Trejde");
        queueList.add("fjerde");

        //shows list
        System.out.println(queueList);
        //a fucktart paid money to be the first req as the last one in the list
        System.out.println(queueList.offer("Fucktart"));
        //it shows the list changed
        System.out.println(queueList);
        System.out.println("22");



    }
}
