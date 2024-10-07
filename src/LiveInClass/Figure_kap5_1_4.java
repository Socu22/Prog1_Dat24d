package LiveInClass;

import java.util.ArrayList;

public class Figure_kap5_1_4 {
    public static void main(String[] args) {
        ArrayList<Figur> list = new ArrayList<>();
        list.add(new Rektangel(2,2));
        list.add(new Punkt());
        list.add(new Linje(2));
        list.add(new Cirkel(2));

        for (Figur f:list
             ) {
            System.out.println(f);
            System.out.println("\t areal="+f.beregnAreal());
            System.out.println("\t Omkreds="+f.beregnOmkreds());

        }
    }
}
abstract class Figur{
    abstract double beregnAreal();
    abstract double beregnOmkreds();

}
class Punkt extends Figur{


    @Override
    double beregnAreal() {
        return 0;
    }

    @Override
    double beregnOmkreds() {
        return 0;
    }
}
class Linje extends Figur{
    double l; //Længde af et linjestykke

    public Linje(int l) {
        this.l=l;
    }

    @Override
    double beregnAreal() {
        return 0;
    }

    @Override
    double beregnOmkreds() {
        return 2*l;
    }
}
class Cirkel extends Figur{
    double r; //radius af en cirkel

    Cirkel(double r){
        this.r=r;
    }

    @Override
    double beregnAreal() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    double beregnOmkreds() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Cirkel{" +
                "r=" + r +
                '}';
    }
}
class Rektangel extends Figur{
    double h; //højde
    double b; //bredde

    Rektangel(double h, double b){
        this.h=h;
        this.b=b;
    }

    @Override
    double beregnAreal() {
        return h*b;
    }

    @Override
    double beregnOmkreds() {
        return 2*(h+b);
    }

    @Override
    public String toString() {
        return String.format("Rektangel{h:%f,b:%f}",h,b);
    }
}

