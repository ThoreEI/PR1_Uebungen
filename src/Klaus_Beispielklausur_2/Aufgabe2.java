package Klaus_Beispielklausur_2;

public class Aufgabe2 {

    public static void main (String[] args) {
        // a)
        int a = 2;
        int b = 20;
        while (a < b) {      // a = 3, 7, 43
            a = (a-1) * a+1; // b = 19, 18, 17
            b = b-1;
        }
        //i =     0, 1, 2
        a = 2; // 2, 4, 12
        b = 1; // 1, 1, 3, 27 // operation 4 times
        for (int i = 0; i < 3; b *= a-b, i++)
            a += a * i;
        System.out.println(a + " "+ b);

        a = 2; // 3, 4, 5
        b = 10;// 7, 8, 5
        do {
            a = a + 1;
            b = (a % 2 == 0 ? b + 1 : b - 3);
        } while (a < b);
        System.out.println(a + " "+ b);
    }

}
