package LiveInClass;

public class MaxNTal {
    public static void main(String[] args) {
        int m;
        m=max(max(3,7),11);
        System.out.println("max: "+m);

    }
    static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }

    }
}
