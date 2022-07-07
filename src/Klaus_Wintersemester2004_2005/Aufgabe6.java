package Klaus_Wintersemester2004_2005;

import java.util.Arrays;

public class Aufgabe6 {
    public static void main(String[] args) {

        String str = "ABCZ";
        char[] alp = new char[str.length()];

        for (int i = 0; i < str.length() ; i++ ) {
            alp[i] = str.charAt(i);
            if(alp[i] >= 'A' && alp[i]  <= 'Y' || alp[i] >= 'a' && alp[i]  <= 'y')
                alp[i]++;
            else if(alp[i] ==  'z')
                alp[i] = 'a';
            else if(alp[i] ==  'Z')
                alp[i] = 'A';
            else
                alp[i] = alp[i];
        }

        System.out.println(Arrays.toString(alp));

    }
}
