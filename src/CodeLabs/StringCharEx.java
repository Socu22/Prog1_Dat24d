package CodeLabs;

public class StringCharEx {
    public static void main(String[] arg) {
        String a = "This is Orange, no Apple Juice";
        boolean controlFirst = false;
        boolean controlLast = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'i') {
                controlFirst = true;

            }


        }
        for (int j = a.length(); j > 0; j--) {
            if (a.charAt(j) == 'i') {
                controlLast = true;
            }

        }
    }
}
