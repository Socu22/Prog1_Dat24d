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

class Point{
    double x=0;
    double y=0;
    double z=0;

    Point(double xStart,double yStart){
        this.x=xStart;
        this.y=yStart;

    }



    Point(double xStart,double yStart,double zStart){
        this.x=xStart;
        this.y=yStart;
        this.z=zStart;
    }


    double distancePointToPoint2D(Point b) {

        double ress = Math.pow(x-b.x,2)+Math.pow(y-b.y,2);
        return Math.sqrt(ress);
    }
    double distanceTripleToPoint2D(Point a,Point b,Point c) {
        double AB= a.distancePointToPoint2D(b);
        double BC= b.distancePointToPoint2D(c);
        double CA= c.distancePointToPoint2D(a);
        return AB+BC+CA;


    }
    double distancePointToPoint3D(Point B) {

        double resss =  Math.pow(x - B.x, 2) + Math.pow(y - B.y, 2) + Math.pow(z - B.z, 2);
        return Math.sqrt(resss);
    }
    double distanceTripleToPoint3D(Point A,Point B,Point C) {
        double AB= A.distancePointToPoint3D(B);
        double BC= B.distancePointToPoint3D(C);
        double CA= C.distancePointToPoint3D(A);
        return AB+BC+CA; //somehow this does not work like in 2d


    }



    }



