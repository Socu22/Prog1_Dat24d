package LiveInClass;

public class ArrayDemo { ///live demostrration of how arrays work and what it is used for!!!
    public static void main(String[] args) {
        int[] num = new int[6];

        num[0]=4;
        num[1]=8;
        num[2]=45;
        num[3]=2;
        num[4]=-3;
        num[5]=-30;


        double g = avg(num);
        System.out.println(g);
    }
    public static double avg (int[] arr){
        double sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];

        }
    return sum/arr.length;
    }
}
