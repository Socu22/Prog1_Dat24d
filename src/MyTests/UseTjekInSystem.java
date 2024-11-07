package MyTests;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UseTjekInSystem {
    public static void main(String[] args) {
        /*TjekInSystemMainFrame t1 = new TjekInSystemMainFrame();
        t1.start();

         */

    }
}
class CheckInSystemMainFrame extends DatabaseCheckInSystem{
    protected static JFrame frame = new JFrame("Check In System");
    protected static TextArea textArea;
    protected static TextArea logTextArea;
    protected static StringBuilder stringBuilder = new StringBuilder();


    public static void main(String[] args) {
        CheckInSystemMainFrame jf = new CheckInSystemMainFrame();
        jf.setFrame();
    }


    public void setFrame(){
        frame.setTitle("frame");
        frame.setSize(400,400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
        frame.setLocationRelativeTo(null);

        TextField statusTextField = new TextField("Skriv i feltet (nedeunder)");
        Button createAccountButton = new Button("Create Account");
        Button printAccountButton = new Button("Print Account");
        Button createCheckInMessageButton = new Button("Create Message");
        Button printCheckInMessageButton = new Button("Print Message");
        textArea = new TextArea(4,24);
        logTextArea = new TextArea(4,24);

        frame.add(statusTextField);
        frame.add(textArea);
        frame.add(logTextArea);
        frame.add(createAccountButton);
        frame.add(printAccountButton);
        frame.add(createCheckInMessageButton);
        frame.add(printCheckInMessageButton);


        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusTextField.setText("Skriv Navn:");
                choicesCheckInSystem(1);


            }
        });
        printAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder log = new StringBuilder();
                choicesCheckInSystem(2);

            }
        });
        createCheckInMessageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusTextField.setText("id: ");
                choicesCheckInSystem(3);
            }
        });



        while (true){
            /*
            System.out.println("Vælg cases, 1. Create an Account, 2. Print All Accounts");
            int inputTast = scInputIntReciver();
            sc.nextLine();
            choicesCheckInSystem(inputTast);

             */



        }






    }

    public void choicesCheckInSystem(int inputTast){


        switch (inputTast) {
            case 1:

                //String inputNavn= sc.nextLine();
                accountCreatorFinal(1, textArea.getText());
                textArea.setText(null);



                break;
            case 2:
                printAccounts();
                stringBuilder.append(printAccounts());
                logTextArea.setText(stringBuilder.toString());
                break;
            case 3:
                /*System.out.println("Account id: ");
                int accountId =scInputIntReciver();

                 */
               // int accountId =
                messageCreator(Integer.parseInt(textArea.getText()));
                break;
            case 4:
                printCheckInMessages();
                break;

        }


    }



}
class Account{
    public static void main(String[] args) {

    }
    public String navn;
    public int id=-1;

    Account(String navn, int id){
        this.navn= navn;
        this.id=id++;

    }

    protected int getId() {
        return this.id;
    }

    public String getNavn() {
        return this.navn;
    }

    @Override
    public String toString() {
        return String.format("Navn: %s (id: %d)",navn,id);
    }
}

class CheckInSystem {
    public static ArrayList<Account> accountArrayList = new ArrayList<>();
    protected static Scanner sc = new Scanner(System.in);
    protected static int idIncreaser;
    protected int inputInt;
    public static void main(String[] args) {
        //accountCreatorForDebugging();
        //accountCreator();


        printAccounts();



    }

        //what i made below is the most trash i have ever made and i want to die!!
    /*public void accountCreator(){//this one need to get fixed
        idIncreaser=0;
        String navn = sc.nextLine();
        accountArrayList.add(new Account(navn, idIncreaser++));



    }

     */

    public static void accountCreatorFinal(int Amount, String text ){ ///If you find me in real life dont ask how the code works
        while (true) {


            if (accountArrayList.isEmpty()) {

                    //String test = sc.nextLine();

                    accountArrayList.add(new Account(text,idIncreaser++));
                    break;

            } else {
                //String navn = sc.nextLine();
                accountArrayList.add(new Account(text, idIncreaser++));
                break;
            }
        }



    }
    public static String printAccounts(){
        //System.out.println("CheckIns-Users-Start: \n --------------------------------------------------------");
        StringBuilder log = new StringBuilder();
        for(Account a : accountArrayList){
            System.out.println(a);
            log.append(a.toString()).append("\n");

        }
        //System.out.println("\n --------------------------------------------------------");
        return log.toString();


    }
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

}


class DatabaseCheckInSystem extends CheckInSystem {


    public static ArrayList<CheckInMessage> messageArrayList = new ArrayList<>(5);
    public static ArrayList<CheckInMessage> idMessageArrayList = new ArrayList<>(5);

    public static void main(String[] args) {
        while (true) {
            //accountCreator();
            System.out.println("Skriv accId: ");
            int inputAccId = sc.nextInt();

            messageCreator(inputAccId);
            printCheckInMessages();

        }

        /*
        int inputIdReceiver = sc.nextInt();
        sc.nextLine();
        int x = -1;

        for (Account a : accountArrayList) {
            if (inputIdReceiver == a.getId()) {
                sc.nextLine();
                messageArrayList.add(new CheckInMessage("det virker", a.getId(), a.getNavn()));
                x++;
                idMessageArrayList.add(new CheckInMessage(x));

            }



            printCheckInMessages();


        }
        */
    }

    public static void messageCreator(int accId) {

        try {

            sc.nextLine(); // Fanger linjeskiftet efter input


            int x = -1;
            x++;

            System.out.println("Skriv Besked til Check in message: ");
            String besked = sc.nextLine();

            messageArrayList.add(new CheckInMessage(besked, accountArrayList.get(accId).getId(), accountArrayList.get(accId).getNavn()));

            idMessageArrayList.add(new CheckInMessage(x));


        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");
            sc.nextLine(); // Fanger fejlagtig indtastning og fjerner den fra input stream
        }
    }

    public static void printCheckInMessages() {
        for (CheckInMessage a : messageArrayList) {
            System.out.println(a);
        }


    }

}











class CheckInMessage extends DatabaseCheckInSystem{
    public static void main(String[] args) {



    }
    public LocalDate currentDate;
    public Scanner sc = new Scanner(System.in);
    String message;
    // picture;
    int idAcc;
    int idMessage;
    String senderName;

    CheckInMessage(String message,int idAcc,String senderName){
        this.currentDate= LocalDate.now();
        this.message=message;
        this.idAcc=idAcc;
        //this.picture=picture;
        this.senderName=senderName;


    }
    CheckInMessage(int inputIdMessage){
        this.idMessage=inputIdMessage;
    }


    @Override
    public String toString() {
        return String.format("%s(%d): \n \t [%s] \n [",senderName, idAcc, message)+"("+currentDate+")]";
    }
}


