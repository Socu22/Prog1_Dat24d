package LiveInClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BrugBankAppMenu{
    public static void main(String[] args) {
        BankAppMenu m1 = new BankAppMenu();
        m1.hovedeMenu();



    }
}
class BankAppMenu {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Account> accountArrayList = new ArrayList<>();
    public  int inputInt;
    public  double inputDouble;


    public int scInputIntReciver() throws InputMismatchException {
        try {
            inputInt = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Fejl: Indtast venligst et gyldigt tal.");
            sc.nextLine();  // Ryd scannerens buffer
            throw e;  // Kaster undtagelsen videre
        }
        return inputInt;
    }
    public double scInputDoubleReciver() throws InputMismatchException {
        try {
            inputDouble = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Fejl: Indtast venligst et gyldigt tal.");
            sc.nextLine();  // Ryd scannerens buffer
            throw e;  // Kaster undtagelsen videre
        }
        return inputDouble;
    }




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
       int in = scInputIntReciver();
       if (in == 0) {System.out.println("Closed");break;} //before anything else has to be posible then it has to check if the input is 0choicesAccount(in);
        choicesAccount(in);

       sc.nextLine();





    }
    }

    /*public void choicesAccount(int input) {                      //Makes the Input posible from the while loop

        switch (input) {
            case 1: //create an  account
                System.out.println("Indtast Navn: " );
                String navn = sc. next();
                System.out.println("Indtast rente: ");

                try {
                    int rente = sc.nextInt();

                    System.out.println("Type af konto: 1. Normal, 2. Indlån, 3. Højrente, 4. Kredit, 5. MilionærKonto, 6. BørneOpsparing ");
                    int inputType= sc.nextInt();

                    typeAccountCreator(inputType,navn, rente); //sends the choice of inputtype through an instance of method paramether

                }catch (InputMismatchException e){
                    System.out.println("Fejl: Ugyldigt input for rente eller kontotype.");

                }

                break; //break breaks the proces though the switch
            case 2: //Show transactions for specifik account
                System.out.println("Choose konto nr: ");
                try {
                    int kontoNr = scInputIntReciver();
                    for (Account a : accountArrayList) {
                        if (kontoNr == a.getAccountNo()) {
                            a.printTransactions();
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Fejl: Ugyldigt kontonummer.");
                }
                break;

            case 3: //deposit to specific account
                System.out.println("Choose konto nr: ");

                try {
                    int kontoNr = scInputIntReciver();
                    for (Account a : accountArrayList) {
                        if (kontoNr == a.getAccountNo()) {
                            System.out.printf("Indsæt beløb til konto nr: %d\n", kontoNr);
                            double x = sc.nextDouble();
                            a.deposit(x);
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Fejl: Ugyldigt input, prøv igen.");
                    sc.nextLine();  // Ryd scannerens buffer
                }
                break;
            case 4: //Withdraw from specific account
                System.out.println("Choose konto nr: ");
                try {
                    int kontoNr = scInputIntReciver();
                    for (Account a : accountArrayList) {
                        if (kontoNr == a.getAccountNo()) {
                            System.out.printf("Hæv beløb fra konto nr: %d\n", kontoNr);
                            double x = sc.nextDouble();
                            a.withdraw(x);
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Fejl: Ugyldigt input, prøv igen.");
                    sc.nextLine();  // Ryd scannerens buffer
                }
                break;
            case 5: //Chooses the amount of years gone by
                System.out.println("How many years have gone by?: ");
                try {
                    int yearsGoneBy = scInputIntReciver();
                    for (Account a : accountArrayList) {
                        a.amountNAnnualInterest(yearsGoneBy);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Fejl: Ugyldigt input for år.");
                }
                break;

            default:
                System.out.println("Ugyldigt valg.");
                break;
            







        }
    }

     */
    public void choicesAccount(int input) {
        switch (input) {
            case 1: // Opret konto
                createAccount();
                break;
            case 2: // KontoUdskrift
                showTransactions();
                break;
            case 3: // Indsæt penge
                depositToAccount();
                break;
            case 4: // Hæv penge
                withdrawFromAccount();
                break;
            case 5: // Årlig rentetilskrivning
                applyAnnualInterest();
                break;
            default:
                System.out.println("Ugyldigt valg.");
                break;
        }
    }

    public void createAccount() {
        System.out.println("Indtast Navn: ");
        String navn = sc.next();
        System.out.println("Indtast rente: ");

        try {
            int rente = scInputIntReciver();
            System.out.println("Type af konto: 1. Normal, 2. Indlån, 3. Højrente, 4. Kredit, 5. MilionærKonto, 6. BørneOpsparing ");
            int inputType = scInputIntReciver();
            typeAccountCreator(inputType, navn, rente);
        } catch (InputMismatchException e) {
            System.out.println("Fejl: Ugyldigt input for rente eller kontotype.");
        }
    }

    public void showTransactions() {
        System.out.println("Vælg konto nr: ");
        try {
            int kontoNr = scInputIntReciver();
            for (Account a : accountArrayList) {
                if (kontoNr == a.getAccountNo()) {
                    a.printTransactions();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Fejl: Ugyldigt kontonummer.");
        }
    }

    public void depositToAccount() {
        System.out.println("Vælg konto nr: ");
        try {
            int kontoNr = scInputIntReciver();
            for (Account a : accountArrayList) {
                if (kontoNr == a.getAccountNo()) {
                    System.out.printf("Indsæt beløb til konto nr: %d\n", kontoNr);
                    double x = scInputDoubleReciver();
                    a.deposit(x);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Fejl: Ugyldigt input, prøv igen.");
        }
    }

    public void withdrawFromAccount() {
        System.out.println("Vælg konto nr: ");
        try {
            int kontoNr = scInputIntReciver();
            for (Account a : accountArrayList) {
                if (kontoNr == a.getAccountNo()) {
                    System.out.printf("Hæv beløb fra konto nr: %d\n", kontoNr);
                    double x = scInputDoubleReciver();
                    a.withdraw(x);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Fejl: Ugyldigt input, prøv igen.");
        }
    }

    public void applyAnnualInterest() {
        System.out.println("Hvor mange år er gået?");
        try {
            int yearsGoneBy = scInputIntReciver();
            for (Account a : accountArrayList) {
                a.amountNAnnualInterest(yearsGoneBy);
            }
        } catch (InputMismatchException e) {
            System.out.println("Fejl: Ugyldigt input for år.");
        }
    }
    public void typeAccountCreator(int inputType, String navn, int rente){ //This was made because of code complexity
        switch (inputType) {
            case 1: // Normal
                Account account = new Account(navn, rente);
                accountArrayList.add(account);
                break;
            case 2: // Indlån
                Indlaan indlaanAccount = new Indlaan(navn, rente);
                accountArrayList.add(indlaanAccount);
                break;
            case 3: // Højrente
                try {
                    System.out.println("Vælg startbalance:");
                    double startBalance = scInputDoubleReciver();
                    System.out.println("Løslades den? (år 'Enter' måned 'Enter' dag)");
                    int år = scInputIntReciver();
                    int måned = scInputIntReciver();
                    int dag = scInputIntReciver();
                    Højrente højrenteAccount = new Højrente(navn, rente, startBalance, LocalDate.of(år, måned, dag));
                    accountArrayList.add(højrenteAccount);
                } catch (InputMismatchException e) {
                    System.out.println("Fejl: Ugyldigt input ved oprettelse af Højrente-konto.");
                }
                break;
            case 4: // Kredit
                try {
                    System.out.println("Vælg startbalance:");
                    double startBalance = scInputDoubleReciver();
                    Kredit kreditAccount = new Kredit(navn, rente, startBalance, startBalance);
                    accountArrayList.add(kreditAccount);
                } catch (InputMismatchException e) {
                    System.out.println("Fejl: Ugyldigt input ved oprettelse af Kredit-konto.");
                }
                break;
            case 5: // MilionærKonto
                try {
                    System.out.println("Indsæt en pulje: ");
                    double pulje = scInputDoubleReciver();
                    System.out.println("Indsæt antal deltagere: ");
                    int udaf = scInputIntReciver();
                    char procent = '%';
                    System.out.printf("Chancen for at vinde puljen ud af %d personer er %.2f%c\n", udaf, 100.0 / udaf, procent);
                    MilionærKonto milionærAccount = new MilionærKonto(navn, rente, pulje, udaf);
                    accountArrayList.add(milionærAccount);
                } catch (InputMismatchException e) {
                    System.out.println("Fejl: Ugyldigt input ved oprettelse af MilionærKonto.");
                }
                break;
            case 6: // BørneOpsparing
                try {
                    System.out.println("Vælg startbalance:");
                    double startBalance = scInputDoubleReciver();
                    System.out.println("Indtast barnets alder:");
                    int alder = scInputIntReciver();
                    System.out.println("Indtast alder ved frigørelse:");
                    int alderFrigør = scInputIntReciver();
                    BørneOpsparing børneOpsparingAccount = new BørneOpsparing(navn, rente, startBalance, alder, alderFrigør);
                    accountArrayList.add(børneOpsparingAccount);
                } catch (InputMismatchException e) {
                    System.out.println("Fejl: Ugyldigt input ved oprettelse af BørneOpsparing.");
                }
                break;
            default:
                System.out.println("Ugyldig kontotype.");




        }
    }
}




