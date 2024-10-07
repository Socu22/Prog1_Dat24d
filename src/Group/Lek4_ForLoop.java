package Group;

import java.util.Random;
import java.util.Scanner;

public class Lek4_ForLoop {
    public static void main(String[] args) {



        //tæl baglæds
        int start =10;
        for (int i = start; i >= 0 ; i--) {
            System.out.println("Tæl baglænds fra: "+start+" tal: "+i);



        }
        //plus talt plus tal plus tal
        int tal = 0;
        int sum =0;
        for (int i = 0; i < 20  ; i++) {
            tal=i+1;
            System.out.println("+"+tal);
            sum+=tal;
            System.out.println("sum: "+sum);

        }

        //1 2 osv tabel
        System.out.println("tabelSHIT");
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");

            }
            System.out.println();
        }

        //ligning som udskriver y, vha indsættesle af x
        int x =0;
        int y= 0;

        for (int i = 0; i < 100 ; i++) {
            x=i;
            if(i >= 0 && i <= 10 || i % 10 == 0 && i <= 100){
                y =3*x*x+6*x+9;
                System.out.println(y);
                if(i==9){
                    System.out.println("10 tabel");
                }

            }

        }

        //dialog gætte tal spil
        boolean b =true;
        Random r = new Random();
        int robotTal = r.nextInt(10);
        //'System.out.println("robotTal: "+robotTal);
        Scanner myGuees = new Scanner(System.in);
        System.out.println("Guess number between 0-10");
        while(b){

            int robotMemory= myGuees.nextInt();
            if(robotTal < robotMemory){
                System.out.println("Robot: Guess Lower");
            }
            if(robotTal > robotMemory) {
                System.out.println("Robot: Guess Higher");
            }
            if(robotTal==robotMemory){
                System.out.println("You won the number is: "+robotTal);
                break;
            }


        }



    }

}







