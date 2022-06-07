public class BrettLaengen {

    public static void main (String[] args) {
        brettLaengen(3);
    }

    private static void brettLaengen(int laenge) {
        brettLaengen(laenge, "");
    }

    private static void brettLaengen(int laenge, String kombinationen) {
        if (laenge >= 2)
            brettLaengen(laenge - 2, kombinationen + " 2 ");
        if (laenge >= 1)
            brettLaengen(laenge - 1, kombinationen + " 1 ");
        if (laenge == 0)
            System.out.println(kombinationen);
    }
}
