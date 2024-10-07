package LiveInClass;

import java.util.Scanner;

public class BrevVægt {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int vægt =sc.nextInt();
        int pris=0;
        if(vægt<=100){
            pris=10;
        }
        System.out.println(pris);


        }

    }

