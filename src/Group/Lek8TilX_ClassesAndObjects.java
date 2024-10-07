package Group;

import java.lang.reflect.Constructor;

public class Lek8TilX_ClassesAndObjects {
    public static void main(String[] args) {
        //boks2_Start
        /*
        boks2 enBoks =new boks2();
        enBoks.sætmål(2,2,2);
        System.out.println("enBoks volumen: "+enBoks.volumen());
        boks2 enAndenBoks =new boks2();
        enAndenBoks.sætmål(4,4,4);
        System.out.println("enAndenBoks vol: "+enAndenBoks.volumen());

        System.out.println("enboks vægt: "+enBoks.setMassefylde(10));

         */



        //boks2Slut
        ///boks3Start'
        boks3 enboks =new boks3();
        System.out.println(enboks.getVoluumen());

        boks3 enboksVærdi =new boks3(1,13,3);
        System.out.println("enboks vol: "+enboksVærdi.getVoluumen());

        enboksVærdi.setMasse(10);
        System.out.printf("masse %f/ vol %f = massefylde %f",enboksVærdi.getMasse(), enboksVærdi.getVoluumen(),enboksVærdi.getMassefylde());





        //(boks3SLut)
    }
}
class boks2{
    private double længde, bredde, højde;
    private  double massefylde;
    public void sætmål(double lgd, double b, double h){
        if(lgd>0 && b>0 && h>0){
            længde=lgd;
            bredde=b;
            højde=h;
        }else{
            System.out.println("Ugyldigt mål. Bruger standart mål");
            længde=10;
            bredde=10;
            højde=10;
        }


    }
    public double volumen(){
        double vol;
        vol= længde*bredde*højde;
        return vol;
    }




    public double getLængde() {
        return længde;
    }

    public double getBredde() {
        return bredde;
    }

    public double getHøjde() {
        return højde;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class boks3{
    private double længde, bredde, højde, masse, massefylde;
    public boks3(){
        System.out.println("Sboks oprettes");
        længde =10;
        bredde =10;
        højde =10;

    }
    public boks3(double lgd, double b, double h){
        if (lgd >0 && b >0 && h >0) {
            System.out.printf("boks oprettet mål: %f * %f * %f",lgd,b,h);
            System.out.println();
            længde=lgd;
            bredde=b;
            højde=h;
        }else{
            System.out.println("ugyldigt bruger standart ");
            længde =10;
            bredde =10;
            højde =10;


        }
    }
    public double getVoluumen(){
        double vol = længde*bredde*højde;
        return vol;
    }


    public void setMasse(double masse) {
        this.masse = masse;
    }

    public double getMasse() {
        return masse;
    }

    public double getMassefylde() {
        massefylde = masse/getVoluumen();
        return massefylde;
    }
}