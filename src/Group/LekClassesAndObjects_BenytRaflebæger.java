package Group;

import java.util.ArrayList;

public class LekClassesAndObjects_BenytRaflebæger {
    public static void main(String[] args) {
        RafleBaeger bæger;
        boolean toSeksere;
        int antalForsøg;
 /*
        bæger =new RafleBaeger(12);
        toSeksere=false;
        antalForsøg=0;

        while (toSeksere==false){
            bæger.ryst();
            System.out.println("bæger: "+bæger+" sum: "+bæger.sum());
            System.out.println("antal 6'ere: "+bæger.antalDerViser(6));
        if(bæger.antalDerViser(6)==2)toSeksere=true;

        antalForsøg++;
        }

        System.out.printf("To sekser efter %d forsøg\n", antalForsøg);

         */

        //yatzi


        Yatzi y = new Yatzi(8);
        System.out.println( y);
        System.out.println( y.treEns());



    }



}
class RafleBaeger extends LekClassesAndObjects_BenytTerning {

    public ArrayList<Terning> terninger;


    RafleBaeger(int antalTerninger) {
        terninger = new ArrayList<Terning>();
        for (int i = 0; i < antalTerninger; i++) {
            Terning t;
            t = new Terning();
            terninger.add(t);
        }

    }

    public void tilføjTerning(Terning t) {
        terninger.add(t);
    }

    public void ryst() {
        for (Terning t : terninger
        ) {
            t.kast();

        }
    }

    public int sum() {
        int resultat;
        resultat = 0;
        for (Terning t : terninger
        ) {
            int terningsVærdi = t.getVærdi();
            resultat += terningsVærdi;

        }
        return resultat;
    }

    public int antalDerViser(int værdi) {
        int reslutat = 0;
        for (Terning t : terninger
        ) {
            int terningsVærdi = t.getVærdi();
            if (terningsVærdi == værdi) {
                reslutat +=1;
            }


        }

        return reslutat;
    }


    @Override
    public String toString() {
        return terninger.toString();
    }


}
class Yatzi extends RafleBaeger {

    Yatzi(int antalTerninger) {
        super(antalTerninger);

    }

    public boolean toEns() {
        for (int værdi = 1; værdi <= 6; værdi++) {
            if (antalDerViser(værdi) >= 2) {
                return true;
            }
        }
        return false;
    }
    public boolean treEns() {
        for (int værdi = 1; værdi <= 6; værdi++) {
            if (antalDerViser(værdi) >= 3) {
                return true;
            }
        }
        return false;  // Hvis der ikke er to ens terninger
    }

}


