package Klaus_Wintersemester2004_2005;

public class Aufgabe4  {

    public static void main(String[] args) {
        int N = 22;
        int x = 1;
        while (x < N) {
            if ( x % 2 == 0 )
                x += 3;
            else
                x++;
            System.out.println( x ); // 2, 5, 6, 9, 10, 13, 14 17, 18, 21, 22
        }
       N = -18;
       x = 1;
        while ( x > N ) {
            if ( x % 2 == 0 )
                x -= 2;
            else
                x--;
            System.out.println( x );
        }
    }
}



