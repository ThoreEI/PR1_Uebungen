package klaus_gdi2009;

public class Aufgabe8 {
    public static void main(String[] args) {
        int minimum = minimumSame(new int[] {1, 1,1});
        System.out.println(minimum);
    }

    static int minimumSame(int[] list) {
        int[] counter = new int[list.length];
        for (int currentValue : list)
            for (int j = 0; j < list.length; j++)
                if (list[j] == currentValue)
                    counter[j]++;

        int currentMin = counter[0];
        for (int i = 1; i < counter.length; i++)
            if (counter[i] < currentMin)
                currentMin = counter[i];

        return currentMin;
    }
}
