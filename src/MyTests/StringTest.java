package MyTests;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.StringTemplate.STR;

public class StringTest {
    public static void main(String[] args) {
        String s = "SSSSS ssss SS SS SS SS SS";
        s = s.replace("ssss", "");
        s = s.replace("SS", "");
        System.out.println(s);

        String string = "anna";
        String sj = "";
        char ch;
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            sj = ch + sj;
        }

        System.out.println(sj);

        if(string.equals(sj)){
            System.out.println(string+"="+sj);
        }

        byte[] strToByte= string.getBytes();
        System.out.println(strToByte.length);

        byte[] result = new byte[strToByte.length];
        for (int i = 0; i < strToByte.length; i++) {
            result[i]=strToByte[strToByte.length-i-1];

            
        }
        System.out.println(new String(result));


        //tries to reverse
        String[] names={"Jonas","Tina","Tom","Steve","Amanda","Hanna","Rebecca","Carl"};
        int[] numbers={1,24,68,9,0,7654,34,3};
        Collections.reverse(Arrays.asList(names).reversed());
        Collections.reverse(Arrays.asList(numbers).reversed());
        Collections.sort(Arrays.asList(names),Comparator.comparing(String::length));
        for (int i = 0; i < names.length; i++) {
            names[i]= new StringBuilder(names[i]).reverse().toString();//Reversed everything
            System.out.println(Arrays.toString(names));

        }

        int theFirstFkingNumber=1;
        int theSecondFkingNumber=2;
        String stringTemplate = STR."My test shit \{theFirstFkingNumber} and \{theSecondFkingNumber}";


    }
}
