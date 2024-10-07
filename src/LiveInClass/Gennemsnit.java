package LiveInClass;

public class Gennemsnit {
    public static void main(String[] args) {
        double f = gennemsnit(1,2,3,5);
        System.out.println(f);


    }
    public static double gennemsnit(int x, int y, int z, int a){
        double beregningGennemsnit =(double) (x+y+z+a)/4;
        return beregningGennemsnit;


    }
}
