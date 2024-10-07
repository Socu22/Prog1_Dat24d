package LiveInClass;

public class BenytPolynomiumer {
    public static void main(String[] args) {
        Polynomium p1 = new FørsteGradsPolynomium(5,3);
        Polynomium p2 = new AndenGradsPolynomium(5,3,2);


        System.out.print("Første Grads Formel:"+p1);
        System.out.println("res: "+p1.F(5));


        p2.F(1);
        System.out.print("Anden Grads Formel:"+p2);


    }
}
abstract class Polynomium{


    abstract double F(double x);
    public abstract String toString(); //Det her er for at defieneret at alle klasse skal have en ændret toString metode

}


class FørsteGradsPolynomium extends Polynomium{
    private double a,b;



    FørsteGradsPolynomium(double a, double b){
        this.a=a;
        this.b=b;

    }

    /*@Override
    double F(double x) {
        this.x=x;
        return x;
    }

     */
    @Override
    double F(double x) {
        double res=a*x+b;
        return res;
    }

    /*@Override
    public String toString() {
        return String.format("f(%f) = %f*%f + %f = %f\n ",x,a,x,b,a*x+b); //f(x)= a*x +b
    }

     */
    @Override
    public String toString() {
        return String.format("f(x) = %f*x + %f\n ",a,b); //f(x)= a*x +b
    }


}
class AndenGradsPolynomium extends Polynomium{
    private final double a;
    private final double b;
    private final double c;
    private double x;

    AndenGradsPolynomium(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }


    @Override
    double F(double x) {
        this.x=x;
        return x;
    }

    @Override
    public String toString() {
        return String.format("f(%f) = %f*%f^2 + %f*%f + %f = %f \n",
                                x,    a, x,     b, x,   c,((a*Math.pow(x,2))+(b*x)+c));//f(x)= a*x^2 +b*x + c
    }
}
