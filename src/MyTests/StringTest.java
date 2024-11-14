package MyTests;

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

    }
}
