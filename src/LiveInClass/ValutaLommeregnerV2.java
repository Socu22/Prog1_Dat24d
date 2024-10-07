package LiveInClass;

import java.util.Scanner;

public class ValutaLommeregnerV2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double amount = 0;
        int bank1 = 0;
        int bank2 = 0;

        double[] bankValues = new double[5];
        String[] bankNames = {"DDK", "SEK", "NOK", "EUR", "ISK"};
        double[] valutas = {1, 1.53, 1.6, 0.13, 20.41};
        bankValues[0] = 100;

        while (true){
            System.out.println("Hvilken bank vil du overføre fra");
            bank1 = ChooseBank(bankNames);
            System.out.println("Hvilken bank vil du overføre til");
            bank2 = ChooseBank(bankNames);
            System.out.println("Hvor meget vil du overføre");
            amount = sc.nextDouble();
            bankValues[bank1] -= amount;
            amount = amount / valutas[bank1] * valutas[bank2];
            bankValues[bank2] += amount;

            for (int i = 0; i < bankValues.length; i++){
                System.out.println(bankNames[i] + ": " + bankValues[i]);
            }
        }
    }
    static int ChooseBank(String[] bankNames){
        while (true){

            String input = sc.next();
            for (int i = 0; i < bankNames.length; i++)
                if (input.equals(bankNames[i])) return i;
            System.out.println("try again");
        }
    }
}