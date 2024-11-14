package ExameØvelse;

import java.util.ArrayList;
import java.util.Comparator;

public class Hogwarts_Comparator_Dot_comparing {
    public static void main(String[] args) {

        HogwartsStudent s1 = new HogwartsStudent("LUc", "Knudsen");
        HogwartsStudent s3 = new HogwartsStudent("Ddd", "Bnudsen");
        HogwartsStudent s2 = new HogwartsStudent("LssdfUc", "Anudsen");
        ArrayList<HogwartsStudent> hogwartsStudents= new ArrayList<>();

        hogwartsStudents.add(s1);
        hogwartsStudents.add(s2);
        hogwartsStudents.add(s3);
        System.out.println(hogwartsStudents);

        hogwartsStudents.sort(Comparator.comparing(HogwartsStudent::getFornavn));





        try {
            s1.setHouseNavn("Gry");
            s2.setHouseNavn("Gry");
            System.out.println(hogwartsStudents);
        } catch (HouseException e) {
            e.getStackTrace();
            throw new RuntimeException(e);
        }






    }
}
class HogwartsStudent{
    String fornavn;
    String efternavn;
    String houseNavn;

    HogwartsStudent(String f, String e){
        this.fornavn=f;
        this.efternavn=e;
        this.houseNavn=null;

    }

    public String getFornavn() {
        return fornavn;
    }


    public void setHouseNavn(String houseNavnInput) throws HouseException {
        String[] array ={"Gry","Huf","Rav","Slyth" };

        for (int i = 0; i < array.length ; i++) {


            if (array[i].equals(houseNavnInput)){
                houseNavn=houseNavnInput;
                System.out.println(houseNavn);

            }


        }
        if(houseNavn==null) throw new HouseException();



    }

    @Override
    public String toString() {
        return fornavn+ " "+efternavn+" "+houseNavn;
    }
}
class HouseException extends Exception{

    @Override
    public String toString() {
        return "Hus findes ikke";
    }
}
