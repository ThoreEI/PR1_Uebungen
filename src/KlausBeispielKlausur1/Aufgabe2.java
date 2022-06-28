package KlausBeispielKlausur1;

public class Aufgabe2 {

    public static void main (String[] args) {

        int x = 21;
        x = 11 / 5; // x = 2;
        System.out.println(x);

        x = 21;
        x = 11 % -5; // x = 1
        System.out.println(x);

        x = 21;
        x += 11 - 5; // x = 27
        System.out.println(x);

        x = 21;
        x *= 11 / 5; // x = 42, da 11/5 = 2 und 21 * 2 = 42;
        System.out.println(x);

        x = 21;
        x /= 11 % 5; // x = 21, da 11%5 = 1 und 21/1 = 21
        System.out.println(x);

    }
}
