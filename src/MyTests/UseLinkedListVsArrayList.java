package MyTests;

import javax.management.timer.Timer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class UseLinkedListVsArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> listIntegerLinkedList= new LinkedList<>();
        ArrayList<Integer> listIntegerArrayList= new ArrayList<>();


        for (int i = 0; i < 10000001; i++) {
            listIntegerLinkedList.add(i);
            listIntegerArrayList.add(i);

        }
        System.out.println("1 eller 2");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x==1){
            for (Integer i : listIntegerLinkedList) {
                System.out.println(i);

            }

        } else if (x==2) {
            for (Integer i : listIntegerArrayList) {
                System.out.println(i);

            }

        }


    }
}
