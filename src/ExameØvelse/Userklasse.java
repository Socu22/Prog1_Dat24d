package ExameØvelse;

import java.util.ArrayList;

public class Userklasse {
    public static void main(String[] args) {


        Userklasse u1 = new Userklasse("Lucas");
        Userklasse u2 = new Userklasse("Jens");
        Userklasse u3 = new Userklasse("Bo");
        Userklasse u4 = new Userklasse("G");
        Userklasse u5 = new Userklasse("Po");


        ArrayList<Userklasse> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        for (int i = 0; i < 4 ; i++) {
            users.add(new Userklasse("L"+i));


        }

        printUd(users);
        System.out.println();

        users.removeFirst();
        users.addFirst(new Userklasse("Henrik"));
        printUd(users);
        System.out.println();

        System.out.println(users.reversed());
        System.out.println();

        users.remove(2);
        printUd(users);

        System.out.println();

        users.removeFirst();
        users.addFirst(new Userklasse("Poul"));
        printUd(users);




    }
    String navn;

    Userklasse(String navn){
        this.navn=navn;
    }

    public static void printUd(ArrayList<Userklasse> a){
        for(Userklasse u :a){
            System.out.println(u);
        }

    }

    @Override
    public String toString() {
        return navn;
    }
}
