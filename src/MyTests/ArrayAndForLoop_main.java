package MyTests;

import java.util.Scanner;

public class ArrayAndForLoop_main {
    public static void main(String[] args) {
        int[] listInt = new int[5];
        listInt= new int[]{7, 6, 4, 3, 2};
        String[] listname = new String[5];

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0+x; i < listname.length; i++) {
            listname[i]="Bob"+(i+1);

        }

        for (int i = 0; i < listInt.length; i++) {
            System.out.println((i+1)+": "+(listInt[i]*2)+" ko nr"+(listname[i]));

        }
    }
}
