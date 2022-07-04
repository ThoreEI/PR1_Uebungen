package klaus_gdi2009;

public class Aufgabe4 {

    public static void main(String[] args) {
        /*
        Welchen Wert liefert der Aufruf der Methode f(2,1)?
        Protokollieren Sie bitte dazu ebenfalls in der richtigen Reihenfolge die Aufrufe der Methoden
        f() und g() und geben Sie die jeweiligen Aktualparameter des Aufrufs an.
        */
       int result = f (2,1);
        System.out.println(result);
    }

    /*
    f : 1. (2 1) 2. (0 1)
             1        return b               --> b+1 -> 2
    g : 1. (2 1) 2. (1 0) 3. (0 -1) 4. (01)
                             false      true

     */

    static int f(int a, int b) {
        if (g(a,b))
            return b;
        else
            return f(b - 1, a - 1) + 1;
    }
    static boolean g(int a, int b) {
        if (a <= 0)
            return (b > 0);
        else
            return g(a - 1, b - 1);
    }
}
