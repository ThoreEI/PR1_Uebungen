package Klaus_Beispielklausur_2;

import java.util.ArrayList;

public class Aufgabe4 {
    public static void main(String[] args) {
        ArrayList<Integer> zerosAndOnes = new ArrayList<>();
        zerosAndOnes.add(0);
        zerosAndOnes.add(0);
        zerosAndOnes.add(0);
        zerosAndOnes.add(1);
        zerosAndOnes.add(0);
        zerosAndOnes.add(0);
        zerosAndOnes.add(1);
        zerosAndOnes.add(1);
        zerosAndOnes.add(1);
        zerosAndOnes.add(0);
        zerosAndOnes.add(1);
        zerosAndOnes.add(1);
        zerosAndOnes.add(0);
        System.out.println(countZeroSequences(zerosAndOnes));

    }
    public static int countZeroSequences(ArrayList<Integer> zeroAndOnes) {
        int count = 0;
        boolean beginOfZeroSequence = false;
        for (int i = 0; i < zeroAndOnes.size(); i++) {
            if (zeroAndOnes.get(i) == 0) {
                if (!beginOfZeroSequence) {
                    count++;
                    beginOfZeroSequence = true;
                }
            } else if (zeroAndOnes.get(i) == 1)
                beginOfZeroSequence = false;
            else
                return -1;
        }
        return count;
    }
}
