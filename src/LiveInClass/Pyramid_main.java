package LiveInClass;

public class Pyramid_main {
    public static void main(String[] args) {
        Pyramid p = new Pyramid(2,6);
        p.calcPyramid();
        System.out.println(p.toString());

        Pyramid q = new Pyramid(3,6);
        p.calcPyramid();
        System.out.println(q.toString());


    }
}
class Pyramid{
    private double side;
    private double height;
    private double volume;

    Pyramid(double s, double h){
        side=s;
        height=h;
    }
    public void calcPyramid(){
        volume=(side*side*height)/4;

    }

    public String toString(){
        return String.format("Your pyramid has a Volume that is: %f ",volume);

    }


}
