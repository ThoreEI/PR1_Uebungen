import java.util.Scanner;

public class SchleifenÄndern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long i = sc.nextLong(); // Wert wird über die Tastatur eingelesen
        do {
            System.out.println(i + Math.pow(3, 2*i));
            i *= 2;
        } while (i < 64);

// gleiche Funktion
        for (i = sc.nextLong(); i < 64; i *= 2)
            System.out.println(i + Math.pow(3, 2 * i));
    }
}

