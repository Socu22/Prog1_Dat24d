package LiveInClass;

public class Multiplicationstabel {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

           /* for (int j = 1; j <= 5 ; j++) {
                System.out.print(i*j+"\t");

            }
            System.out.println();



        }
          */
            printTabel(i);

        }

    }
    static void printTabel(int n){
        for (int j=1; j<=10; j++){
            System.out.print(n*j+"\t");

        }
        System.out.println();
    }
}
