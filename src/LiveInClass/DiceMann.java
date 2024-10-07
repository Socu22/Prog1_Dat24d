package LiveInClass;

import javax.swing.*;
import java.util.Random;

public class DiceMann {
    public static void main(String[] arg){

        Random gen =new Random();




        String[] activities= {"breakfest","study","swim","fishing","call mom","bed"};
 /*
        for (int i = 0; i < 10; i++) {
            int tal = gen.nextInt(activities.length);
            System.out.println(activities[tal]);
            System.out.println(tal+1);


        }

  */


        /*
        int tal = gen.nextInt(activities.length);
        System.out.println(activities[tal]);
        System.out.println(tal);

         */

        int tal = gen.nextInt(3);
        System.out.println(tal);
        switch (tal){
            case 0:
                JOptionPane.showMessageDialog(null, "breakfest " );                break;

            case 1:
                JOptionPane.showMessageDialog(null, "study " );
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "swim " );
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Fishing " );
            case 4:
                JOptionPane.showMessageDialog(null, "call mom " );
            case 5:
                JOptionPane.showMessageDialog(null, "bed" );



        }









        /*
        int random;

        random= (int)(Math.random()*6);

        switch (random){
            case 1:
                System.out.println("1");

            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
            case 4:
                System.out.println("4");
            case 5:
                System.out.println("5");
            case 6:
                System.out.println("6");

         */

        }

    }


