package LiveInClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Rainfall {
    public static void main(String[] args) throws IOException {
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
            for(int col =0; col<12; col++){
                data[row][col]=Integer.parseInt(bidder[col]);
            }
            line= input.readLine();
            row++;
        }
        file.close();

        for (int r = 0; r < data.length ; r++) {
            for (int c =0; c<data[r].length; c++){
                System.out.print(data[r][c]+"\t");
            }
            System.out.println();

        }





    }


}
