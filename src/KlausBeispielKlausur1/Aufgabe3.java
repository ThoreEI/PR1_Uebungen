package KlausBeispielKlausur1;

import java.util.Arrays;

public class Aufgabe3 {

    public static void main(String[] args) {
        // revert algorithm
        int[] array = {1, 2, 3, 4, 5, 6, 7 ,8 , 9, 10};
        int[] revert = new int[array.length];

        for (int i = 0, j = array.length-1; i < array.length; i++, j--) {
            revert[j] = array[i];
        }

        System.out.println(Arrays.toString(revert));
    }
}
