package MyTests;

import java.util.ArrayList;
import java.util.Objects;


public class useArrayThroughJsonAndPrint {
    public static void main(String[] args) {

    }
}





















class ArrayListClass {
    private ArrayList<Objects> objectsArrayList =new ArrayList<>();

    ArrayListClass(ArrayList<Objects> InputAObjectsArrayList){
        this.objectsArrayList = getObjectsArrayList();
    }
    public ArrayList<Objects> getObjectsArrayList() {
        return objectsArrayList;
    }
}
//-------------------------------------------------------------------------//
class ArrayListToJsonFile{
    private ArrayList<Objects> arrayListObjectsReciver;
    private ArrayList<Objects> convertObjectsToJson=new ArrayList<>();



    ArrayListToJsonFile(ArrayList<Objects>inputArrayListToConvertToJson){
        this.convertObjectsToJson = inputArrayListToConvertToJson;

    }


}
