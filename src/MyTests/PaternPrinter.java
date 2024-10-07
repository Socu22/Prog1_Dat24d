package MyTests;

public class PaternPrinter {
    public static void main(String[] args) {
        FormattedPatern f =new FormattedPatern();
        for (int i = 0; i < 20 ; i++) {
            f.printPattern(1);


        }




    }
}
class FormattedPatern{
    private int rows=1;
    private int number=1;
    String s = "%-2d";

         public int printPattern(int rows){
             for (int i = 0; i < rows; i++) {
                 System.out.printf("%-2d, %-2s",number,s);

             }
        rows++;
        return rows;

    }

    public int getRows() {
        return rows;
    }
}