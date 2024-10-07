package LiveInClass;

public class SumNTal {
    public static void main(String[] args) {
        int iAlt;

        iAlt= sum(1,2,3);

        int a =5;
        int b =2;
        int c =1;
        iAlt = sum(a,b,c);
        System.out.println(iAlt);


    }
    static int sum(int x, int y , int z){
        int result = x+y+z;
        return result;
    }



}

