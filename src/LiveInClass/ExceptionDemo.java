package LiveInClass;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("ExceptionDemo");
        KlippeKort k1 = new KlippeKort("G12a3y");
        for (int i = 0; i <=10 ; i++) {
            try {
                k1.klip();
                System.out.println(k1);
            }catch (KlippeKortException ex ){
                System.out.println(ex);
                ex.printStackTrace();
                break;
            }

        }


        System.out.println("Program Finished!");
    }
}

class KlippeKort{
    int antal_Klip;
    String id;
    KlippeKort(String id){
        this.id=id;
        this.antal_Klip=10;
    }

    void klip() throws KlippeKortException{
        if(antal_Klip==0) throw new KlippeKortException(id);
        antal_Klip--;
    }
    @Override
    public String toString() {
        return "KlippeKort:" +
                " {Id=" + id +
                ", antal_Klip='" + antal_Klip +" Klip tilbage "+ '\'' +
                '}';
    }
}
class KlippeKortException extends Exception{
    String id;
    KlippeKortException(String id){
        this.id=id;
    }
    @Override
    public String toString() {
        return "KlippeKortException: Klippekort "+id+" er tom";
    }
}