package CodeLabs;

public class DataTypes {
    public static void main(String[] arg) {
        int ASCII=0;
        char bogstav;
        String printBogstav;

        //alfabet
        for (int i = 0; i < 26 ; i++) {
            ASCII=65+i;
            bogstav= (char) ASCII;
            printBogstav= Character.toString(bogstav);


            System.out.println(printBogstav);




            
        }
        //System.out.println((int)'h');
    }

    }
