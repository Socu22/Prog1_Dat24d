package MyTests;

import java.util.ArrayList;
import java.util.Scanner;

public class EnumTes {
    public static void main(String[] args) {
       Menu m = new Menu();




       m.menuStarter(1);






    }
}

class User{
    String _name;
    int _credit;
    String _title;
    int _id;
    int userCounter;
    static Scanner sc = new Scanner(System.in);

    User(String name, int credit){
        userCounter++;
        this._id=userCounter;
        this._name=name;
        this._credit=credit;
    }


    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public int get_credit() {
        return _credit;
    }

    public void set_credit(int credit) {
        this._credit = credit;
        titleHandler();
    }

    public String get_creditTitle() {
        return _title;
    }

    public void set_Title(Title creditTitle) {
        this._title = creditTitle.name();


    }
    private void titleHandler(){
        if(get_credit()<50){set_Title(User.Title.Poor);}
        else if (get_credit()>50 && get_credit() < 500) {set_Title(User.Title.Middle);}
        else if (get_credit()>500 && get_credit() < 5000) {set_Title(User.Title.Rich);}
        else if (get_credit()>5000 && get_credit() < 50000) {set_Title(User.Title.CountryRich);}
        else if (get_credit()>50000 && get_credit() < 500000) {set_Title(User.Title.WorldRich);}


    }
    public void login(){
        System.out.println("Name: ");
        set_name(sc.nextLine());
        set_credit(sc.nextInt());


    }
    public enum Title{
        Poor, Middle, Rich, CountryRich, WorldRich
    }

    public int getUserCounter() {
        return userCounter;
    }

    @Override
    public String toString() {
        return String.format("Id: %d \n Name: %s \n Credit: %d \n Title: %s", userCounter,_name, _credit,_title);
    }
}
class Menu{
    static User u;
    static ArrayList<User> userArrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public void menuStarter(int input){

        switch (input){
            case 1: //Create
                System.out.println("Name: ");



                userArrayList.add(new User(sc.nextLine(),sc.nextInt()));
                break;


            case 2: //Deposit Credit
            case 3: //Withdraw Credit
            case 4: //Show users
                for(User u : userArrayList){
                    System.out.println(u);
                }
                break;
        }
    }}


