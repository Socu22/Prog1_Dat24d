package LiveInClass;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {
        Account a1 = new Account("Michael Jackson", 2.5);
        a1.deposit(200);
        a1.withdraw(50); // Eksempel på hævning
        a1.annualInterest();


        //a1.amountNAnnualInterest(10); // Beregn og vis saldo efter hvert år i 10 år

        Account a2 = new Account("Alexander Bonavent the third",  2.5);
        a2.deposit(500);
        a2.withdraw(100); // Eksempel på hævning

        // Vis saldo
        /*System.out.println(a1.toString());
        System.out.println(a2.toString());
         */
       a1.printTransactions();
        System.out.println();

        a2.printTransactions();
        System.out.println();




    }
}

class Account {
    private int accountNo;
    protected String owner;
    protected double balance;
    protected double interestRate;
    private ArrayList<Transactions> transactions = new ArrayList<>();
    static private int noOfAccount=1;



    Account(String ow, double rate) {
        accountNo = noOfAccount++;;
        owner = ow;
        interestRate = rate;
        balance = 0;

    }

   /* Account(String ow, int acc, double rate) {
        accountNo = acc;
        owner = ow;
        intRate = rate;
        balance = 0;

    }

    */

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transactions("Indsat(+)",amount,balance));
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transactions("Indsat(-)",amount,balance));

    }

    public int annualInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        transactions.add(new Transactions("Rente", interestRate,balance));
        return 0;
    }

    public void amountNAnnualInterest(int years) {
        for (int i = 1; i <= years; i++) {
            annualInterest();


        }
        System.out.println(toString());
    }


    public void printTransactions(){
        System.out.println(this);
        System.out.println("Tekst\t\tDato\t\t\tbeløb\t\t\tsaldo");
        for (Transactions t: transactions) {
            System.out.println(t);

        }

    }


    public double getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    @Override
    public String toString() {
        return String.format("kontonr %d: %s Balance: %fkr", accountNo, owner, balance);
    }
}
class Transactions {
    String text="";
    LocalDate localDate;
    double amount;
    double newBalance;

        public Transactions(String text, double amount, double newBalance) {
        this.text=text;
        localDate=LocalDate.now();
        this.amount=amount;
        this.newBalance=newBalance;

    }



    @Override
    public String toString() {
            //return text+"\t"+localDate+"\t"+amount+"\t"+newBalance;
            return String.format("%-5s: %-5s  %-15f %-5f",this.text,localDate,this.amount,this.newBalance);
    }


}
