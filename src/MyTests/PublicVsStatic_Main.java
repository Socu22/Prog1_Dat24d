package MyTests;

import com.sun.tools.javac.Main;

public class PublicVsStatic_Main extends PublicVsStatic_StaticExtend {
    public static void main(String[] args) {
        for (int i = 20; i > -1 ; i--) {
            int x = PublicVsStatic_StaticExtend.sendValueX(i);
            if(x>0){
                System.out.println("this works "+x);
                //System.out.println(i==6);
            }else{
                if(x==0) {
                    System.out.println("This realy works " + x);
                }

            }
            //public
            PublicVsStatic_Main sum = new PublicVsStatic_Main();
            int add = sum.sendValueYZ(1,3);
            System.out.println("public "+add);
        }





    }
}
