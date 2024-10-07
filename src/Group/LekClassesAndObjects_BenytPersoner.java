package Group;

import MyTests.PublicVsStatic_Main;

import java.util.ArrayList;

public class LekClassesAndObjects_BenytPersoner {
    public static void main(String[] args) {
        Person p1 =new Person("Jens","jensen,",92);
        System.out.println(p1);
        p1.hils(new Person("Abby","bo",2));

    }
}
class Person{
    public String foravn;
    public String efternavn;
    public int alder;
    //public ArrayList<Konto> konti;

    public Person(String foravnP, String efternavnP,int alderP ){
        foravn=foravnP;
        efternavn=efternavnP;
        alder=alderP;
    }

    @Override
    public String toString() {
        return foravn+" "+efternavn+" ("+alder+" år)";
    }
    public void præsentation(){
        if(alder<=2) System.out.println("Agyy!!");
        else if (alder<70) {
            System.out.printf("Jeg er %s på %d år.\n",foravn,alder);

        }else System.out.printf("jeg er hr. %s på %d år.\n",efternavn,alder);
    }
    public void hils(Person andenPerson){
        if (alder<=2) System.out.println("ma ma ... ");
        else if (andenPerson.alder<10) {
            System.out.printf("Hej lille %s.\n",andenPerson.foravn);


        } else if (alder<70) {
            System.out.printf("hej %s.\n",andenPerson.foravn);

        }else System.out.printf("Goddag, hr %s.\n",andenPerson.efternavn);

        præsentation();
    }
}

