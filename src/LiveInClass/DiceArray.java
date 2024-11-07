package LiveInClass;

import java.util.Arrays;

public class DiceArray {
    public static void main(String[] args) {
        Integer[] dicesOutcomeValue = new Integer[100];
        Dice d = new Dice();

        for (int i = 0; i < dicesOutcomeValue.length ; i++) {
            dicesOutcomeValue[i]=d.roll();

        }
        int control =0;
        int sum =0;
        int sixerCounter=0;
        for (Integer i: dicesOutcomeValue ){
            System.out.println(i);
            control++;
            sum+=dicesOutcomeValue[i];

            if(i==6) sixerCounter++;


        }
        gennemsnit(sum,dicesOutcomeValue.length);
        System.out.println("Your fucking sixes is counted, and the number equals to: "+sixerCounter);

        //System.out.println(control);

        int SUm=0;
        System.out.println("-----------------------------------------------");
        Dice[] dicesArray = new Dice[100];

        for (int i = 0; i < dicesArray.length; i++) {
             dicesArray[i]= new Dice();

        }
        int x=1;
        int roll=0;
        sixerCounter=0;
        for (Dice D: dicesArray ){
            roll= D.roll();
            System.out.printf("dice nr. %d: %d\n", x++, roll);

            SUm+=roll;
            if(roll==6)sixerCounter++;



        }
        gennemsnit(SUm,dicesArray.length);
        System.out.println("Nummer af 6'ere: "+sixerCounter);


    }
    public static double gennemsnit(int sum, int numberOfElement){
        double gennemsnit = (double) sum /numberOfElement;
        System.out.printf("Det her er gennemsnittet af summen %d og nummeret af elementer %d =%f\n",sum,numberOfElement,gennemsnit);
        return gennemsnit;
    }

}
