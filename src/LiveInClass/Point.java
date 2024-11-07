package LiveInClass;

public class Point{

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


    public double distancePointToPoint2D(Point b) {

        double ress = Math.pow(x-b.x,2)+Math.pow(y-b.y,2);
        return Math.sqrt(ress);
    }
    double distanceTripleToPoint2D(Point a,Point b,Point c) {
        double AB= a.distancePointToPoint2D(b);
        double BC= b.distancePointToPoint2D(c);
        double CA= c.distancePointToPoint2D(a);
        return AB+BC+CA;


    }
    public double areaCalc_3_OrMorePoints(Point[] points){
        double sumXY=0;
        double sumYX=0;
        double sum=0;
        double allSum=0;

        for (int i = 0; i < points.length ; i++) {

            double xi =points[i].x;
            double yii =points[i + 1 % points.length].y;

            double yi =points[i].y;
            double xii =points[i + 1% points.length].x;

             sumXY = (xi)* yii;
             sumYX = (yi)* xii;




             sum=Math.abs(sumXY-sumYX);

        }
        allSum=sum/2;


        return allSum;
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
