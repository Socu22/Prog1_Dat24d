package LiveInClass;

import java.util.Objects;
import java.util.Scanner;

public class ValutaLommeregner {
    public static void main(String[] args) {

        double bankDDK=100; // "/X.XXX"
        double bankSEK=0; //*1.53
        double bankNOK=0; //*1.60
        double bankEUR=0; //*0.13
        double bankISK=0; //*20.41

        Scanner sc =new Scanner(System.in);
        String bankA=" ";
        String bankB=" ";

        Scanner beløb =new Scanner(System.in);

        while(true){
            System.out.println("bankDDK: "+bankDDK+"kr");
            System.out.println("bankSEK: "+bankSEK+"?");
            System.out.println("bankNOK: "+bankNOK+"?");
            System.out.println("bankEUR: "+bankEUR+"?");
            System.out.println("bankISK: "+bankISK+"?");



            System.out.println("Bank a: ");
            bankA = sc.next();

            System.out.println("Bank b:");
            bankB = sc.next();

            if(Objects.equals(String.format("bankDDK"),bankA)){
                switch (bankB){
                    case "bankSEK":
                        double bankDDKToBankSEK;
                        bankDDKToBankSEK=beløb.nextDouble();
                        bankDDK-=bankDDKToBankSEK;
                        bankSEK+=bankDDKToBankSEK*1.53;
                        break;

                    case "bankNOK":
                        double bankDDKToBankNOK;
                        bankDDKToBankNOK=beløb.nextDouble();
                        bankDDK-=bankDDKToBankNOK;
                        bankNOK+=bankDDKToBankNOK*1.60;
                        break;

                    case "bankEUR":
                        double bankDDKTobankEUR;
                        bankDDKTobankEUR=beløb.nextDouble();
                        bankDDK-=bankDDKTobankEUR;
                        bankEUR+=bankDDKTobankEUR*0.13;
                        break;
                    case "bankISK":
                        double bankDDKTobankISK;
                        bankDDKTobankISK=beløb.nextDouble();
                        bankDDK-=bankDDKTobankISK;
                        bankISK+=bankDDKTobankISK*20.41;
                        break;
                }

            }






        }

    }
}
