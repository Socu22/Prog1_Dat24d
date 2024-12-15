import CodeLabs.StringCharEx;

import java.util.*;

public class Tester {
    public static void main(String[] args) {



            /*
            public void TopFiveBestTimesPerDisciplin(){
        List<TrainTime> topFive = new ArrayList<>();

        for (int i = 0; i < MemberHandler.getMemberList().size(); i++) {
            currentMember = MemberHandler.getMemberList().get(i);
            for (int j = 0; j < currentMember.getTrainTimeList().size(); j++) {
                topFive.add(currentMember.getTrainTimeList().get(j));

            }
        }
        //should sort from best time to worst and discipline
        Collections.sort(topFive, Comparator.comparingDouble(TrainTime::getDuration).thenComparing(TrainTime::getDiscipline).thenComparing(TrainTime::getDistance));

        List<TrainTime> top5MAVE= new ArrayList<>();
        TrainTime currentMave;
        List<TrainTime> top5RYG= new ArrayList<>();
        TrainTime currentRYG;

        topFive.sort();

        for (TrainTime t : topFive){
            t.getDiscipline()



        }








    }
    // Beregner top 5 resultater for samtlige discipliner
    public void SortedByBestTimesPerDisciplin() {

        List<TrainTime> topFive = new ArrayList<>();

        for (int i = 0; i < MemberHandler.getMemberList().size(); i++) {
            currentMember = MemberHandler.getMemberList().get(i);
            for (int j = 0; j < currentMember.getTrainTimeList().size(); j++) {
                topFive.add(currentMember.getTrainTimeList().get(j));

            }
        }
        //should sort from best time to worst, and sorted in distance
        Collections.sort(topFive, Comparator.comparingDouble(TrainTime::getDuration).thenComparing(TrainTime::getDiscipline).thenComparing(TrainTime::getDistance));

        //this will work it will make a "\t" more for every disciplin after RYG, so you can make out the difference between different disciplines, best fix until now
        for (TrainTime t : topFive) {
            if (t.getDiscipline().equals("RYG")) {
                System.out.println(t);



            }
            if (t.getDiscipline().equals("MAVE")) {
                System.out.println("\t" + t);
            }

        }
    }






             */






}




}
/*
public class MedlemsTitle {

    static MedlemsTypes medlemsTypes;
    static TypeAges medlemsTypeAges;
    static  Discipline discipline;

    private MedlemsTitle(){}


}

enum MedlemsTypes {
    _EXERCISER, _COMPETITION_SWIMMER

}
enum TypeAges{
    _JUNIOR,_SENIOR
}
enum Discipline{
    RYG, MAVE, N,P,A,Q
}

 */
/*
 public static List<String> printKnown_DisciplineOrDistance (){
        //den her er for at være sikker på at en type discipline er blevet brugt før og ud fra det kan man tilføje sig selv til discipliner som andre har tilmelt sig til før.
        //den er lavet til traintimes, dvs den virker ikke endnu til Competitions !!
        groupByDisciplines();
        selectDiscipline();
        List<String> strings = Arrays.asList(inputDiscipline,inputDistance);


        return strings;
    }
 */