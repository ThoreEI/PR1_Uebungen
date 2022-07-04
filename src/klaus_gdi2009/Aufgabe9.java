package klaus_gdi2009;

public class Aufgabe9 {
    public static void main(String[] args) {
        int sum = summeIterativ(1, 10);
        System.out.println(sum);
        sum = summeRekursiv(1, 10); // 2+3+4+5+6+7+8+9
        System.out.println(sum);
    }
    static int summeIterativ(int x, int y) {
        int sum = 0;
        for (int num = x+1; num < y; num++)
            sum += num;
        return sum;
    }
    static int summeRekursiv(int x, int y) {
        if (x+1 == y)
            return 0;
        return summeRekursiv(x+1, y) + x + 1;
    }

}
