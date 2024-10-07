package LiveInClass;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static LiveInClass.Deltager.save;

public class Marathon2 {
    public static ArrayList<String> listeNavn = new ArrayList<>();
    public static ArrayList<String> liste = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("src//LiveInClass/Copenhagen Marathon.txt");
        BufferedReader ind = new BufferedReader(fil);
        Deltager deltager = new Deltager();

        String linje = ind.readLine();

        while(linje!=null){
            String[] split= linje.split(",");
            deltager.navn = split[0];
            deltager.nummer = split[1];
            deltager.løbeGruppe = split[2];

            listeNavn.add(deltager.navn);
            liste.add(deltager.toString());

            System.out.println(listeNavn.toString());

            //new line
            linje = ind.readLine();
        }
        save(listeNavn,liste);
    }
}
class Deltager{
    String navn;
    String nummer;
    String løbeGruppe;

    static void save(ArrayList<String> l,ArrayList<String> o) throws IOException{
        for (int i = 0; i < l.size() ; i++) {
            FileWriter fil =new FileWriter("src//LiveInClass/Deltager"+ l.get(i) +".txt");
            PrintWriter ud = new PrintWriter(fil);
            ud.println(o.get(i));
            ud.close();

        }

    }

    public String toString() {
        return "Dit navn: "+navn+"\n"+"Dit Nummer: "+nummer+"\n"+"Dit Løbehold: "+løbeGruppe;
    }

}
