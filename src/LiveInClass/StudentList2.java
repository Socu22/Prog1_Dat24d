package LiveInClass;

import java.io.*;
import java.util.ArrayList;

public class StudentList2 {
    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("src//LiveInClass/StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);


        ArrayList<Student> list = new ArrayList<>();


        String linje = ind.readLine();
        while(linje != null){
            //System.out.println("Læst: "+linje);
            String[] bidder = linje.split(","); // spilitter ved hvert komma

            Student s = new Student();
            s.navn=bidder[1];
            s.efterNavn=bidder[2];
            s.sNo=bidder[0].replace("@stud.kea.dk","");

            list.add(s);


            //ny linje
            linje = ind.readLine();
        }
        list.sort(null);

        for(Student e: list){
            System.out.println(e);
            //System.out.println(e.sNo+": "+e.navn+" "+e.efterNavn);

        }

        save(list);
     }

    static void save(ArrayList<Student> l) throws IOException{
        FileWriter fil =new FileWriter("src//LiveInClass/StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (Student e: l) {
            ud.println(e+":-)");

        }
        ud.close();



    }


}
class Student implements Comparable<Student> {
    String navn;
    String efterNavn;
    String sNo;



    public String toString() {
        return sNo+": "+navn+" "+efterNavn;
    }

    @Override
    public int compareTo(Student o) {
        return sNo.compareTo(o.sNo);
    }
}
