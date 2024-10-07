package LiveInClass;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class GueesANumberReverse {
    public static void main(String[] args) {
        String controlOverLower;
        int robotTal;

        Scanner sc =new Scanner(System.in);
        Random r =new Random();

        robotTal= r.nextInt(100);
        controlOverLower="";




        int lastNumber=0;

        while (true) {

            if(controlOverLower.equals("o")){
                lastNumber=robotTal;
                robotTal+=(lastNumber)/2+1;
                System.out.println(robotTal);




            }
            if(controlOverLower.equals("l")){
                lastNumber=robotTal;
                robotTal-=(lastNumber)/2-1;
                System.out.println(robotTal);



            }
            if (Objects.equals(controlOverLower,"c")){
                System.out.println("korekt");
            }
            controlOverLower = sc.next();












        }



    }
}
