/*package MyTests;

import java.util.ArrayList;

public class DeMotivatingStudentDatabase {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        ;
        for (int i =0; i<10; i++){
            students.add(new Student("L"+i, 15+i,(-3+i)*1.43));



        }
        System.out.println(students);

    }
}
class Student {
    String name;
    int age;
    double gpa;
    String title;


    Student(String name, int age, double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;






    }
    public void set_Title(titleEnum titleStudent) {

        this.title = titleHandler();



    }
    public enum titleEnum{
        DumDum, DumDumButABitBetter, GoodJobFucktart, YouMustBeAWorldClassPrick
    }
    public void titleHandler(){

        if(this.gpa<2){ set_Title(titleEnum.DumDum);} else if (gpa>2 &&gpa<4) {set_Title(titleEnum.DumDumButABitBetter);

        } else if (gpa>4 &&gpa<7) {set_Title(titleEnum.GoodJobFucktart);

        } else if (gpa<7 &&gpa<12) { set_Title(titleEnum.YouMustBeAWorldClassPrick);

        }
        return title ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                ", Title=\"+}" +title;
    }
}
*/