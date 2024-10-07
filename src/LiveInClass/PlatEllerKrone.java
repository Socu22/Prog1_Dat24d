package LiveInClass;

import java.util.Objects;
import java.util.Scanner;

public class PlatEllerKrone {
    public static void main(String[] arg) {

        int random = 0;
        int heads = 1;
        int tails = 0;

        System.out.println("Heads(1) or tails(0)?(lowercase)");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();


        random = (int) (Math.random() * 2);
        System.out.println(random);

        if (Objects.equals(input, "heads") && random == tails || Objects.equals(input, "tails") && random == heads) {
            System.out.println("you lost");
        }

        //heads

        if (Objects.equals(input, "heads") && random == heads || Objects.equals(input, "tails") && random == tails) {
            System.out.println("You won!!");


        }
        scanner.close();

    }
}