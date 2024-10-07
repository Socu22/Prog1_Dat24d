package LiveInClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class BankApp3 {

    public static void main(String[] args) {

        //Bank DirektørArray
        ArrayList<Account> list = new ArrayList<>();



        //indlån objecter
        System.out.println("----------------Indlån---------------");
        Indlaan a1 = new Indlaan("Jeff Hill Jackson",3);
        a1.deposit(100);
        a1.withdraw(50);
        a1.deposit(100);
        a1.printTransactions();
        System.out.println("----------------Højrente---------------");

        //højrente
        Højrente a2 = new Højrente("Per",10,100000,LocalDate.of(2024,12,24));
        a2.deposit(20);
        a2.withdraw(100);

        a2.printTransactions();

        //Kredit
        System.out.println("----------------Kredit---------------");
        Kredit a3 = new Kredit("Jens Petersen", 2.4,1000,1000);
        a3.withdraw(1000);
        a3.printTransactions();

        //MilionærKonto
        System.out.println("----------------MilionærKonto---------------");
        MilionærKonto a4 = new MilionærKonto("Chandler Gambler",0,1000,2);
        a4.annualInterest();
        a4.printTransactions();

        //BørneOpsparing
        System.out.println("----------------BørneOpsparing---------------");
        BørneOpsparing a5 = new BørneOpsparing("Lucas", 3,1000,16, 18);

        a5.withdraw(100);
        a5.printTransactions();
        a5.annualInterest();
        a5.annualInterest();
        a5.annualInterest();
        a5.printTransactions();


        //add to Account child clases sorted in arraylist list. Renter, Og printTransactioner
        /*
        list.add(a1);
        list.add(a2);

        for(Account a: list){
            a.annualInterest();
            a.deposit(100);
            a.printTransactions();
        }

         */
    }
}
class Indlaan extends Account {

    Indlaan(String ow, double rate) {
        super(ow, rate); //tager fra Acc
    }
    public void withdraw(double amount) {
        if(amount>balance){
            System.out.println("Status: Der er ikke nok penge på konto");

        }else {
            super.withdraw(amount); //Tager en metode fra Acc til her
        }
    }
}
class Højrente extends Account{

    LocalDate releaseDate;

    Højrente(String ow, double rate, double startbalance, LocalDate date) {
        super(ow, rate);
        super.deposit(startbalance);
        releaseDate=date;
    }

    @Override
    public void deposit(double amount) {

        System.out.println("Status: Der kan ikke sættes penge("+amount+") ind på denne konto...");

    }

    @Override
    public void withdraw(double amount) {
        LocalDate today = LocalDate.now();
        if(today.isBefore(releaseDate)){
            System.out.println("Status: Pengene er bundet indtil "+releaseDate);
        }else {
            super.withdraw(amount);
        }

    }
}
class Kredit extends Account{
    double maxWithdraw;

    Kredit(String ow, double rate,double startBalance ,double max) {
        super(ow, rate);
        maxWithdraw=max;
        super.deposit(startBalance);

    }

    @Override
    public void withdraw(double amount) {
        if(amount<maxWithdraw){
            super.withdraw(amount);
        }else {
            System.out.printf("Status: Du har nået over %f, withdraw mindre\n ",maxWithdraw);

        }
    }
}
class MilionærKonto extends Account{
    Random gen =new Random();
    int winnerNr;
    Random lottoNr;
    double gevinst;
    int amountPeople;
    double ditNummer;

    MilionærKonto(String ow, double rate, double puljen, int udaf) {
        super(ow, rate);
        gevinst=puljen;
        amountPeople=udaf;
        double ditNummer =gen.nextInt(amountPeople);
    }


    @Override
    public int annualInterest() {
        winnerNr= gen.nextInt(amountPeople);

        if(ditNummer==winnerNr){
            super.deposit(gevinst);
            System.out.println("Status: du vandt!!!! ");

        }else {
            System.out.println("Status: du vandt ikke ;-(");
        }


        return 0;
    }
}
class BørneOpsparing extends Account{
    int childAge;
    int releaseAge;


    BørneOpsparing(String ow, double rate, double startBalance, int age, int releaseKonti_Age) {
        super(ow, rate);
        super.deposit(startBalance);
        releaseAge=releaseKonti_Age;
        childAge=age;

    }

    @Override
    public void withdraw(double amount) {
        if(childAge==releaseAge){
            super.withdraw(amount);
        }else {
            System.out.printf("Status: Er ikke gammel nok, vent %d år endnu :-)\n ",releaseAge-childAge);

        }
    }

    @Override
    public int annualInterest() {
        if(childAge<releaseAge){
            System.out.println("status: Forældre sender penge ind");
            super.deposit(500);
            return childAge++;

        }else {
            System.out.println("Status: Konto er fri, forældre sender ikke flere penge");
        }
        return 0;
    }


}