package MyTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] strings = new String[]{"Smart","Guy"};
        List list1 = Arrays.asList(strings);
        System.out.println(Container.getC().getList("Smart","Guy"));
    }

}
class Container{
    private static final Container c = new Container();
    public static String[] strings= new String[2];


    String s1 ="";
    String s2 ="";
    public Container() {
    }

    public static Container getC() {
        return c;
    }

    public List getList(String s1, String s2){
        this.s1=s1;
        this.s2=s2;
        strings[0]= s1;
        strings[1]= s2;
        List list1 = Arrays.asList(strings);
        return list1;
    }
}

