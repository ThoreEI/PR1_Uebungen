public class Zahlenfolge {

    public static void main(String[] args) {
        int i = 1;
        int  count = 0;

        while (true) {
            System.out.print( i  % 10 + " ");
            i+=2;
        }
    }
   // 1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1, 3, 5, 7, 9, ...
}
