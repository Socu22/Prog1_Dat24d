package Group;

import java.util.ArrayList;

public class LekClassesAndObjects_BenytTerning {
    public static void main(String[] args) {
        Terning terningen;
        Terning andenTerningen;
        terningen = new Terning(); //opret
        andenTerningen = new Terning();
        boolean sekser = false;
        int antalKast = 0;





        /*while (sekser==false){
            terningen.kast();
            antalKast+=1;
            System.out.printf("kast: %d gav %d\n",antalKast,terningen.getVærdi());
            if (terningen.getVærdi()==6) sekser=true;
        }
        System.out.printf("vi slog en 6'er efter %d slag\n",antalKast);

         */


        //kastflere
         /*terningen.kastFlere(12);
        for (Integer værdi: terningen.listTerningVærdi //den har allerede taget fat i hvad der står i listen
             ) {

            if(værdi==6) System.out.println(værdi);

        }
        terningen.kastFlere(12);
        ArrayList<Integer> listSekser =new ArrayList<>(12);


         */


    }


    }

class Terning{
    private int værdi;
    private String navn;
    ArrayList<Integer> listTerningVærdi;

    public Terning(){
        værdi=(int) (Math.random()*6+1);
    }
    public void kast(){
        double tilfældigTal=Math.random();
        værdi= (int) (tilfældigTal*6+1);
    }
    public void kastFlere(int antalTerningKastes){
        listTerningVærdi=new ArrayList<>(antalTerningKastes);
        
        for (int i = 0; i < antalTerningKastes ; i++) {
            double tilfældigTal=Math.random();
            værdi= (int)(tilfældigTal*6+1);

            listTerningVærdi.add(værdi);





        }

    }

    public int getVærdi() {
        return værdi;
    }

    public void setVærdi(int nyVærdi) {
        værdi=nyVærdi;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        String svar = ""+værdi;
        return svar;
    }
}
