package LiveInClass;

import java.util.Scanner;

public class ArrayDemo { ///live demostrration of how arrays work and what it is used for!!!
    public static void main(String[] args) {
        int[] num = new int[6];
       // Scanner sc = new Scanner(System.in);
        num[0]=4;
        num[1]=8;
        num[2]=45;
        num[3]=2;
        num[4]=-3;
        num[5]=-30;

        int[] num2={3,3,4,5,6,8,9,0};


        double g = avg(num);
        double g2 = avg(num2);
        System.out.println("f: 1: "+g+"\nf 2: "+g2);
    }
    public static double avg (int[] arr){
        double sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }
    return sum/arr.length;
    }
}
