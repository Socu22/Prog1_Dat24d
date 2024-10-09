package LiveInClass;

import java.time.LocalDate;
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
        if (input == 0) {System.out.println("Closed");break;} //before anything else has to be posible then it has to check if the input is 0
        choicesAccount(input);



    }
    }

    public void choicesAccount(int input) {                      //Makes the Input posible from the while loop
        switch (input) {
            case 1: //create an  account
                System.out.println("Indtast Navn: " );
                String navn = sc. next();
                System.out.println("Indtast rente: ");
                int rente = sc.nextInt();

                System.out.println("Type af konto: 1. Normal, 2. Indlån, 3. Højrente, 4. Kredit, 5. MilionærKonto, 6. BørneOpsparing ");
                int inputType= sc.nextInt();

                typeAccountCreator(inputType,navn, rente); //sends the choice of inputtype through an instance of method paramether

                break; //break breaks the proces though the switch
            case 2: //Show transactions for every account
                System.out.println("All Transactions)"); // need a rework on the print of transactions
                for (Account a:accountArrayList
                     ) {

                        a.printTransactions();

                }
                break;
            case 3: //deposit to specific account
                System.out.println("Choose konto nr: ");
                int kNO= sc.nextInt();

                for (Account a: accountArrayList
                     ) {
                    if(kNO== a.getAccountNo()){
                        System.out.printf("in konto nr:%d, \n How much should be deposited: ",kNO);
                        double x = sc.nextDouble();
                        a.deposit(x);}

                }
                break;
            case 4: //Withdraw from specific account
                System.out.println("Choose konto nr: ");
                int kNO2= sc.nextInt();

                for (Account a: accountArrayList
                ) {
                    if(kNO2== a.getAccountNo()){
                        System.out.printf("in konto nr:%d, \n How much should be withdrawed: ",kNO2);
                        double x = sc.nextDouble();
                        a.withdraw(x);}

                }
                break;
            case 5: //Chooses the amount of years gone by
                System.out.println("How many years have gone by?: ");
                int yearsGoneBy= sc.nextInt();
                for (Account a: accountArrayList
                     ) {
                    a.amountNAnnualInterest(yearsGoneBy);

                }
            







        }
    }
    public void typeAccountCreator(int inputType, String navn, int rente){ //This was made because of code complexity
        switch (inputType){ //Type af konto:, , , , ,
            case 1:  //1. Normal
                Account account = new Account(navn,rente);
                accountArrayList.add(account);
                for (Account a : accountArrayList) {
                    System.out.println(a);
                }
                break;
            case 2://2. Indlån
                Indlaan indlaanAccount = new Indlaan(navn,rente);
                accountArrayList.add(indlaanAccount);
                for (Account a: accountArrayList
                ) {
                    System.out.println(a);

                }
                break;
            case 3://3. Højrente
                System.out.println("Vælg startbalance");
                double sb = sc.nextDouble();
                System.out.println("Løslades den? (år 'Enter' måned 'Enter' dag)");
                int år = sc.nextInt();
                int måned = sc.nextInt();
                int dag = sc.nextInt();

                Højrente højrenteAccount = new Højrente(navn,rente,sb, LocalDate.of(år,måned,dag));
                accountArrayList.add(højrenteAccount);
                for (Account a: accountArrayList
                ) {
                    System.out.println(a);

                }
                break;
            case 4://4. Kredit
                System.out.println("Vælg startbalance/MaxWithdraw");
                double sb2 = sc.nextDouble();
                System.out.println("Max");


                Kredit kreditAccount = new Kredit(navn,rente,sb2, sb2);
                accountArrayList.add(kreditAccount);
                for (Account a: accountArrayList
                ) {
                    System.out.println(a);

                }
                break;
            case 5://5. MilionærKonto
                System.out.println("Indsæt en pulje:  ");
                double pulje = sc.nextDouble();
                System.out.println("Indsæt nummeret af personer der deltager: ");
                int udaf = sc.nextInt();
                char procent = '%';
                System.out.printf("ud af %d personer er der en chance for at få puljen %f, Chancen for at vinde er %f %c \n ",udaf,pulje,1f/udaf*100f,procent);
                MilionærKonto milionærAccount = new MilionærKonto(navn,rente,pulje,udaf);
                accountArrayList.add(milionærAccount);
                for (Account a: accountArrayList
                ) {
                    System.out.println(a);

                }
                break;
            case 6://6. BørneOpsparing
                System.out.println("Vælg startbalance");
                double sb3 = sc.nextDouble();
                System.out.println("Indtast Barns alder: ");
                int alder = sc.nextInt();
                System.out.println("Indtast Frigør konto alder: ");
                int alderFrigør = sc.nextInt();
                BørneOpsparing børneOpsparingAccount = new BørneOpsparing(navn,rente,sb3,alder,alderFrigør);
                accountArrayList.add(børneOpsparingAccount);
                for (Account a: accountArrayList
                ) {
                    System.out.println(a);

                }
                break;




        }
    }
}




