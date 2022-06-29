package Klaus_Beispielklausur_2;

public class Aufgabe1 {
    public static void main (String[] args) {
        // a)
        brettLaengen(3);
        // b)
        treeAngle(5);
    }

    static void brettLaengen(int laenge) {
        brettLaengen(laenge, "");
    }


    private static void brettLaengen(int laenge, String kombinationen) {
        if (laenge >= 2)
            brettLaengen(laenge-2, kombinationen + "2 ");
        if (laenge >= 1)
            brettLaengen(laenge-1, kombinationen + "1 ");
        if (laenge == 0)
            System.out.println(kombinationen + " ");
    }

    private static void treeAngle(int laenge) {
        for (int i = 1; i <= laenge; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i + " ");
            System.out.println();
        }

    }
}
