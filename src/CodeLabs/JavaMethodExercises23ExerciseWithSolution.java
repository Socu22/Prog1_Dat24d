package CodeLabs;

import java.util.ArrayList;

public class JavaMethodExercises23ExerciseWithSolution {
    public static void main(String[] args) {
        //ONE
        MethodOne one =new MethodOne(1,52,3);
        one.biggestOutOf3();
        //two
        MethodTwo two =new MethodTwo("jens",6);
        MethodTwo two_2 =new MethodTwo("bo",2);
        MethodTwo two_3 =new MethodTwo("ho",42);
        two.avAge();


    }
}
class MethodOne{
    double a, b,c;

    MethodOne(double a, double b , double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public void biggestOutOf3(){
        if(a>b && a>c){
            System.out.println("a er størst: "+a);
        } else if (b>a&&b>c) {
            System.out.println("b er størst: "+b);

        }else {
            System.out.println("c er størst: "+c);
        }

    }
}
class MethodTwo{
    int age;
    String navn;
    ArrayList<Integer> listAge=new ArrayList<>();
    int everyAge;

    MethodTwo(String n,int a){
        this.navn=n;
        this.age=a;

    }

    public void avAge(){
        for (int i = 0; i < 6 ; i++) {
            listAge.add(age);

        }
        for (Integer integer : listAge) {
            everyAge += integer;



        }
        double res = (double) (everyAge) /listAge.size();
        System.out.println(res);
    }

}
