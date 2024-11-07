package LiveInClass;

import java.util.Arrays;
import java.util.Scanner;

public class PolygonPointArray {
    public static void main(String[] args) {
        Polygon p = new Polygon(5);

        System.out.println(p.perimeter());
        System.out.println(p.area(p.polygonPoints));


        for (Point a : p.polygonPoints ){
            //System.out.println(a);

        }



    }


}
class Polygon{
    static Scanner sc = new Scanner(System.in);
    Point[] polygonPoints;



    public Polygon(int input){
        polygonPoints=new Point[input];
        if(input>2){
            for (int i = 0; i <input ; i++) {

                System.out.println("Punkt: "+i);
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                polygonPoints[i]=new Point(x,y);
                System.out.println(polygonPoints[i].x+" "+polygonPoints[i].y);

            }

        }

    }
    public double perimeter() {

        double d=0;
        double d2=0;
        double sum=0;
        for (int i = 0; i < polygonPoints.length-1; i++) {
            sum += polygonPoints[i].distancePointToPoint2D( polygonPoints[i+1 % polygonPoints.length]);


            /*double xi = polygonPoints[i].x;
            double yi = polygonPoints[i].y;

            double xi2 = polygonPoints[(i + 1) % polygonPoints.length].x;
            double yi2 = polygonPoints[(i + 1) % polygonPoints.length].y;


            d = Math.pow((xi2 - xi),2);
            d2 = Math.pow((yi2 - yi),2);

            sum +=Math.sqrt((d+d2));

            double math +=array[i].

             */

        }
        return sum;






    }
    public double area(Point[] p) {
        double sumArea=0;
        for (int i = 0; i <polygonPoints.length-1 ; i++) {
            sumArea=p[i].areaCalc_3_OrMorePoints(p);


        }


        return sumArea;

    }



    @Override
    public String toString() {
        return "Polygon{" +
                "polygonPoints=" + Arrays.toString(polygonPoints) +
                '}'+"     ";
    }
}
