public class Dreieck {

    public static void main(String[] args) {
        dreieck(5);
    }

    public static void dreieck(int groesse) {
        for (int i = 1; i <= groesse; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print( i + " ");
            }
            System.out.println();
        }

    }
}
