package LiveInClass;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Landsholdet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        FodboldSpiller[] hold= new FodboldSpiller[10];
        hold[0] = new FodboldSpiller("Lucas Peterson", 43);
        hold[1] = new FodboldSpiller("Kasper Jensen", 22);
        hold[2] = new FodboldSpiller("Jesper Kasperson", 65);
        hold[3] = new FodboldSpiller("Jens Jason", 44);
        hold[4] = new FodboldSpiller("Mikkel Andersen", 10);
        hold[5] = new FodboldSpiller("Nikolaj Hansen", 32);
        hold[6] = new FodboldSpiller("Frederik Larsen", 19);
        hold[7] = new FodboldSpiller("Oliver Nielsen", 54);
        hold[8] = new FodboldSpiller("Mathias Petersen", 77);
        hold[9] = new FodboldSpiller("Rasmus Thomsen", 11);


        /*for (int i = 0; i < hold.length ; i++) {
            System.out.println(hold[i]);
        }

         */
        indskift(hold, new FodboldSpiller("Henrik Kasper", 18),0);
        printHoldKort(hold);


    }
    static void printHoldKort(FodboldSpiller[] team){
        for (FodboldSpiller f: team){
            System.out.println(f);

        }


    }
    static void  indskift(FodboldSpiller[] team, FodboldSpiller f, int arrayPos){
        team[arrayPos]=f;
    }
}
class FodboldSpiller{
    String navn;
    int rygNummer;

    FodboldSpiller(String navn, int rygNummer){
        this.navn=navn;
        this.rygNummer=rygNummer;


    }

    @Override
    public String toString() {
        return String.format("Fodboldtspiller %s: %d",navn,rygNummer);
    }
}
