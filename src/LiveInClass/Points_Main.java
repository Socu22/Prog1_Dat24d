package LiveInClass;

public class Points_Main{


    public static void main(String[] args) {
        Point a = new Point(2, 5);
        Point b = new Point(25, -6);
        Point c = new Point(30, -66);
        System.out.println(a.distancePointToPoint2D(b));
        System.out.println(a.distanceTripleToPoint2D(a,b,c));

        Point A = new Point(22, 52,4);
        Point B = new Point(5.5, 56,6);
        Point C = new Point(20, 36,9);

        System.out.println(A.distancePointToPoint3D(B));
        System.out.println(A.distanceTripleToPoint3D(A,B,C));


    }}



