package Group;

public class Lek2 {
    public static void main(String[] arg){

        int længde=2, bredde=3;
        int x;
        double euro=0;
        double dollar=66.66;
        double sum;
        double f;



        int areal = længde*bredde;
        System.out.println("løngde: "+længde);
        System.out.println("bredde: "+bredde);
        System.out.println("this is my areal "+areal);

        x=7;
        System.out.println("x: "+x);
        int y =3*x*x+6*x+9;
        System.out.println("this is my ligning y: "+y);

        double dollarToEuro = dollar*0.90;
        euro += dollarToEuro;
        System.out.println("this is my euro from dollar "+euro);

        double randomTal= Math.random()*10;
        System.out.println("randomtal1 "+randomTal);

        double randomTal2= Math.random()*10;
        System.out.println("randomtal2 "+randomTal2);

        double randomTal3= Math.random()*10;
        System.out.println("randomtal3 "+randomTal3);

        sum =randomTal+randomTal2+randomTal3;
        System.out.println("sum "+sum);
        f = sum/3;
        System.out.println("f af 3 randomtal :  "+f);















    }



}
