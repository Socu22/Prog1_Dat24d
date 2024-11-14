package LiveInClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Rainfall {
//chosen rows to Countries
    static final int MAPALANA=0;
    static final int RATNAPURA=1;
    static final int SITA_ELIYA=2;
    static final int BADULLA=3;
    static final int MATALE=4;
    static final int ANURADHAPURA=5;
    static final int AMPARA=6;
    static final int HAMBEGAMUWA=7;
    static final int AMBALANTOTA=8;
    static final int KIRAMA=9;
    static final int A_PALESSA=10;

    static String[] regioner = {"MAPALANA", "RATNAPURA", "SITA_ELIYA",
            "BADULLA", "MATALE", "ANURADHAPURA",
            "AMPARA", "HAMBEGAMUWA", "AMBALANTOTA",
            "KIRAMA", "A_PALESSA"};



    enum Months {
        JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
    }    public static void main(String[] args) throws IOException {
       //for Storing Data
        int[][] data = new int[11][12];

        //Access file
        FileReader file;
        file = new FileReader("src/LiveInClass/RainfallData.txt");


        //read in file
        BufferedReader input;
        String line;
        input = new BufferedReader(file);;
        line= input.readLine(); //read one line

        int row=0;
        while (line!=null){
            String[] bidder = line.split(" ");
            for(int col =0; col<12; col++){  //go through all rows
                data[row][col]=Integer.parseInt(bidder[col]); //inserts in col
            }
            line= input.readLine();
            row++;
        }
        file.close();
//reads all rows and col
        for (int r = 0; r < data.length ; r++) {
            for (int c =0; c<data[r].length; c++){
                System.out.print(data[r][c]+"\t");
            }
            System.out.println();

        }
//Test For Replacements Atributes for cities in ??
        System.out.println("Test");
        System.out.println(regioner[6]+","+ Months.MAY + "="+
//3 Methods for choosing a specific City and Month
                data[6][4]+ //With index
                " equals "
                + data[AMPARA][4]+ //with Atribute value and index
                " Equals "+
                data[AMPARA][Months.MAY.ordinal()]); //with Atribute value and ordinal value of Enmum Months.MAY.                                                                                           Gay!





    }


}
