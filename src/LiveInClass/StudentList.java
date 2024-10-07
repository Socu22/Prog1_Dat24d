package LiveInClass;

import java.io.*;
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("src//LiveInClass/StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);

        ArrayList<String> listMail = new ArrayList<>();
        ArrayList<String> listNavn = new ArrayList<>();
        ArrayList<String> listEfterNavn = new ArrayList<>();

        String linje = ind.readLine();
        while(linje != null){
            //System.out.println("Læst: "+linje);
            String[] bidder = linje.split(","); // spilitter ved hvert komma

            String mail =bidder[0];
            String navn =bidder[1];
            String efterNavn =bidder[2];

            listMail.add(mail);
            listNavn.add(navn);
            listEfterNavn.add(efterNavn);

            //ny linje
            linje = ind.readLine();
        }
        listNavn.sort(null);

        for(String s: listNavn){
            System.out.println(s);
        }

        save(listNavn);
     }
    static void save(ArrayList<String> l) throws IOException{
        FileWriter fil =new FileWriter("src//LiveInClass/StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (String s: l) {
            ud.println(s);

        }
        ud.close();



    }
}
