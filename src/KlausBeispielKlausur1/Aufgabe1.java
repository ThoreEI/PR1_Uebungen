package KlausBeispielKlausur1;

public class Aufgabe1 {
    public static void main(String[] args) {

        // a)
        int w = f(2, 3); // 3
        System.out.println(w);
    }

    static int f(int z, int x) {
        System.out.println(z + " " + x);
        if (z == x)
            return 1;
        if (z == 0)
            return 1;
        return f(z, x-1) + f(z-1, x-1);
    }
}
