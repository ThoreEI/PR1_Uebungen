package KlausBeispielKlausur1;

public class Aufgabe2 {

    public static void main (String[] args) {

        // a)
        int x = 21;
        x = 11 / 5; // x = 2;

        x = 21;
        x = 11 % -5; // x = 1

        x = 21;
        x += 11 - 5; // x = 27

        x = 21;
        x *= 11 / 5; // x = 42, da 11/5 = 2 und 21 * 2 = 42;

        x = 21;
        x /= 11 % 5; // x = 21, da 11%5 = 1 und 21/1 = 21

        // b)
        int i;
        double d = 10;
        for (i = 1; i < 100; i++)
            if (i % 2 == 0)
                d = d - 1.0 / i;
            else
                d = d + 1.0 / i;
      /*
               1. d = 10 + 0 --> 10
               2. d = 10 - 0.5 --> 9.5
               3. d = 9.5 + 1/3 = 9.633
               4. 9.633 - 0.25 = 9.427
               5. 9.427 + 0.2 = 9.627
               6. 9.627 - 0.16 = 9.567
               7. 9.567 + 1/7
               8. x - 1/8
               9. x + 1/9
               10. x - 1/10
             */
        System.out.println(d); // What's the reason for this calculation?

        // c) do-while loop
        do {
            if (i % 2 == 0)
                d = d - 1.0 / i;
            else
                d = d + 1.0 / i;
            i++;
        } while (i < 10);

        // d)
        rek(4); // Question: Which output generates the program down below
    }
    public static void rek(int z) {
        z--;
        System.out.println(z);
        if (z!=0)
            rek(z);
        System.out.println(z);
    }
    /*
    Output
    3
    2
    1
    0
    0
    1
    2
    3
     */
}





