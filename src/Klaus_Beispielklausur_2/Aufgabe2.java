package Klaus_Beispielklausur_2;

public class Aufgabe2 {

    public static void main (String[] args) {
//        1
//        2 2
//        3 3 3
//        1
//        2 2
//        3 3 3
//        4 4 4 4
        treeAngle(5);
    }

    private static void treeAngle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }


}
