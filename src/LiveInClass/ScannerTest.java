package LiveInClass;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        System.out.println("Scannertest");
        Scanner sc = new Scanner(System.in);
       // String s = sc.next();//efter mellemrum bliver i sc buffer
       /* String s = sc.nextLine(); //og efter det i mellem kommer emd
        int i = sc.nextInt();



        System.out.println( s.toUpperCase()+"!!!!!!!!!!!!!!!");
        System.out.println(i);
*/
        while (true){
            String s = sc.nextLine(); //buffer
            int i = sc.nextInt();//buffer
            sc.nextLine(); //clear buffer


            System.out.println( s);
            System.out.println(i);


            if(i==0){ break;}
        }
    }
}
