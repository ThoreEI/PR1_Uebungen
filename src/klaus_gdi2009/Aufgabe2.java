package klaus_gdi2009;

public class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println(berechne1(10));;
        /* a)
        Quadratfunktion wird errechnet
         */

        System.out.println(berechne2(3, 7));;
        /* b)
            // return value : 10
         */

        berechne3(1, 10);
        /*
        innere Schleife wird y-mal durchlaufen
         */
    }

    static int berechne1(int n){
        int res = 0;
        for (int y = 0; y < n; y++)
            res = res + n;
        return res;
    }

    static int berechne2(int x, int y) {
        int i, res;
        if (x < y) {
            i = x;
            res = y - x;
        } else {
            i = y;
            res = x - y;
        }
        res = res + 2 * i;
        return res;
    }

    static int berechne3(int x, int y) {
        int res = 0;

        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++) {
                res = res + 1;
            }
        }
        return res;
    }
}
