package Klaus_Wintersemester2004_2005;


import java.util.Scanner;

public class Aufgabe5 {
    public static void main(String[] args ) {
        //2, 4, 6, 7, 9, 2, 4, 6, 7, 9, 2, 4, 6, 7, 9, 2, 4,
        int x = 2;

//        while (true) {
//            System.out.print(x);
//            if (x == 2 || x == 4 || x == 7)
//                x += 2;
//            else if (x == 6)
//                x+=1;
//            else
//                x = 2;
//        }

        // c )
        Scanner sc = new Scanner(System.in);
        long i = sc.nextLong(); // Wert wird über die Tastatur eingelesen
        do {
            System.out.println(i + Math.pow(3, 2*i));
            i *= 2;
        } while (i < 64);

        for (i = sc.nextLong(); i < 64; i*=2)
            System.out.println(i+ Math.pow(3, 2*i));
    }

    // d )
    public class LinearList {
        ListElement first;

        public void removeLast() {
            while (first.next != null)
                first = first.next;
            first = null;
        }

    }
    public  class ListElement {
        int content;
        ListElement next;
    }

}
