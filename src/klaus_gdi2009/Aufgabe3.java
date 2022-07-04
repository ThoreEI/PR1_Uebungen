package klaus_gdi2009;

import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) {

        // a)
        System.out.println(quadriere(9));

        //b )
        int m = 1;
        int n = 1;
        for (int x = 0; x <= m; x++)
            for (int y = 0; y <= n; y++)
                System.out.println("Blabla ...");

        int x = 0;
        do {
            int y = 0;
            do {
                System.out.println("Blabla ...");
                y++;
            } while( y <= n);
            x++;
        } while(x <= m);

    }

    static int quadriere(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++)
            result += (2*i-1);
        return result;
    }
}
