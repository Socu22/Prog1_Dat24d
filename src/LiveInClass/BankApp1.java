package LiveInClass;

public class BankApp1 {
    public static void main(String[] arg){
        String navn= "Ole Hansen";
        double saldo = 5.9987;
        int kNr= 1;


        saldo =saldo+100;
        System.out.println("Konto "+kNr+": "+saldo+"kr "+navn);

        saldo = saldo*1.05;
        System.out.println("Konto "+kNr+": "+saldo+"kr "+navn);


    }
}
