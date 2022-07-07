package klaus_se21_sommer;

public class Aufgabe3 {

    public static void main(String[] args) {
        int x = 1;
        while (true) {
            System.out.print(x + ", ");
            x = (x+2) % 10;
        }
    }
}
