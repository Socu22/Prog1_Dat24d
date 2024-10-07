package LiveInClass;

import java.util.Random;

public class Dice{
    static Random gen = new Random(); //I want to kill myself because i had to move this from roll() and i had to do this beacuse it is so important right now, and the computers memmory absolutly can't take the extra Random objeckt up its ass. and now its static and i am realising that this is actually awesome :-(.

    int roll(){
        int result=  gen.nextInt(6)+1;
        return result;

    }

    public static void main(String[] args) {
        Dice d =new Dice();
        for (int i = 1; i <10 ; i++) {
            System.out.println(d.roll());

        }

    }

}
