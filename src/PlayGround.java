public class PlayGround {

    public static void main (String[] args) {

        int a = 2;
        int b = 20;

        while (a < b) {
            a = (a-1) * a + 1;
            b -= 1;

            System.out.println("A: " + a + "\nB: " + b);
        }


    }
}
