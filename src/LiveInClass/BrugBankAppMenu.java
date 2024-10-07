package LiveInClass;

import java.util.ArrayList;
import java.util.Scanner;

public class BrugBankAppMenu{
    public static void main(String[] args) {
        BankAppMenu m1 = new BankAppMenu();
        m1.hovedeMenu();
        //m1.choicesAccount(m1.A,m1.B);








    }
}
class BankAppMenu {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Account> accountArrayList = new ArrayList<>();



    public void hovedeMenu() {

        while (true) {


        System.out.println("Von And Banken - Hoved Menu ");
        System.out.println("Tast 1: Opret Konto");
        System.out.println("Tast 2: KontoUdskrift ");
        System.out.println("Tast 3: Indsæt penge");
        System.out.println("Tast 4: Hæv penge");
        System.out.println("Tast 5: Årlig rentetilskrivning");
        System.out.println("Tast 0: Afslut program");
        System.out.println("Indtast et tal [0,5]: ");
        int input = sc.nextInt();
        if (input == 0) {break;}
        choicesAccount(input);



    }
    }

    public void choicesAccount(int input) {
        switch (input) {
            case 1:
                System.out.println("Indtast Navn: " );
                String navn = sc. next();
                System.out.println("Indtast rente: ");
                int rente = sc.nextInt();

                Account account = new Account(navn,rente);

                accountArrayList.add(account);
                for (Account a : accountArrayList) {
                    System.out.println(a);
                }
                break;
            case 2:
                System.out.println("All Transactions)"); // need a rework on the print of transactions
                for (Account a:accountArrayList
                     ) {

                        a.printTransactions();

                }
                break;
            case 3:
                System.out.println("Choose konto nr: ");
                int kNO= sc.nextInt();

                for (Account a: accountArrayList
                     ) {
                    if(kNO== a.getAccountNo()){
                        System.out.printf("in konto nr:%d, \n How much should be deposited: ",kNO);
                        Double x = sc.nextDouble();
                        a.deposit(x);}

                }
                break;
            case 4:
                System.out.println("Choose konto nr: ");
                int kNO2= sc.nextInt();

                for (Account a: accountArrayList
                ) {
                    if(kNO2== a.getAccountNo()){
                        System.out.printf("in konto nr:%d, \n How much should be withdrawed: ",kNO2);
                        Double x = sc.nextDouble();
                        a.withdraw(x);}

                }
                break;
            case 5:
                System.out.println("How many years have gone by?: ");
                int yearsGoneBy= sc.nextInt();
                for (Account a: accountArrayList
                     ) {
                    a.amountNAnnualInterest(yearsGoneBy);

                }



        }
    }
}




