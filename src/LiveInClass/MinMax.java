package LiveInClass;

public class MinMax {
    public static void main(String[] args) {
        int a =100;
        int b = 100    ;
        int c = 2;
        if ((a>b) && (a>c))
            System.out.println("a er størst");
        else{
            if ((b>c) && (b>a)){
                System.out.println("b er størst");}
            if ((c>a) && (c>b)){
                System.out.println("c er størst");
            }
            if(b==c||b==a||c==a||c==b){
                System.out.println("to eller flere er lige store");
            }
        }

    }
}
