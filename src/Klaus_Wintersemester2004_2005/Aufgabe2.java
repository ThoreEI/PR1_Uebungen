package Klaus_Wintersemester2004_2005;

public class Aufgabe2 {
        public static void main (String[] args) {
                f(4, 6, 0);
        }

        static int f(int x, int y, int count) {
                System.out.println();
                System.out.println( count + " --> " +  x + " " + y);
                if (x < 1)
                        return 1;

                else if (y <= 2)
                        return 2;

                int partOne = 3* f(x+1, y-1, ++count);
                int partTwo = f(x-2, y/2, ++count);
                int result = partOne - partTwo;
                System.out.print( count + " --> " + partOne);
                System.out.print(" - " + partTwo);
                System.out.println(" = " + result);
                return result;
        }
}
