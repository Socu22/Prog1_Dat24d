package MyTests;

import javax.swing.*;

public class Array_Main {
    public static void main(String[] arg) {
        int gay = 22;
        /*Array_Student[] arr;


        arr = new Array_Student[4];

        arr[0] = new Array_Student("James",0);
        arr[1] = new Array_Student("Bob",1);
        arr[2] = new Array_Student("Kane",2);
        arr[3] = new Array_Student("Jens",3);

        for(int i =0; i<arr.length; i++){
            System.out.println("element: "+i+" "+arr[i].name+" "+arr[i].rollNumber);
        }

         */

        //mulitdim

        /*int[][] arr =
                {{3,2,4,5}, {3,47,3,2}, {4,2,19,8}};

        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]+" ");
                if(j==1){
                    System.out.print(".");
                }



        }

         */
        //Returning Arrays from Methods
        /*
        int arr[] = m1();

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static int[] m1()
    {
        // returning  array
        return new int[] { 1, 2, 3 };
    }



        };
    */
        if (gay==22) {
            String responseTODialog= JOptionPane.showInputDialog("Type Your gay name, please... : ");
            JOptionPane.showMessageDialog(null, "i guess you must be gay "+responseTODialog);
            String responseToResponse = JOptionPane.showInputDialog("anything to say?");
            JOptionPane.showMessageDialog(null,responseToResponse+"  it says:  I dont belive whatever you just said!! ");
        }


    }
}


