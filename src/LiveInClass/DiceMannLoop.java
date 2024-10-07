package LiveInClass;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class DiceMannLoop {
    public static void main(String[] arg) {

        Random gen = new Random();
        String ac = "";
        int tal = 0;
        boolean keepgoing = true;
        Scanner keyboard = new Scanner(System.in);

        while (keepgoing){

            tal=gen.nextInt(6)+1;
            System.out.println(tal);

            if(tal==1){
                ac="one";
            }
            if(tal==2){
                ac="two";
            }
            if(tal==3){
                ac="three";
            }
            if(tal==4){
                ac="four";
            }
            if(tal==5){
                ac="five";
            }
            if(tal==6){
                ac="six";
            }
            System.out.println(ac);

            System.out.println("vil du stoppe y/n");

            String ans = keyboard.next();
            if(ans.equals("y")) keepgoing=false;
            if(ans.equals("n")) keepgoing=true;



        }
        System.out.println("bye bye");

    }
}
















