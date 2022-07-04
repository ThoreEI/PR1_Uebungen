package Klaus_Wintersemester2004_2005;

import java.util.Arrays;

public class Aufgabe7 {

    public static void main(String[] args) {
        int[] nums = { 5, 1, 8, 6 , 3 ,9 , 4};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    private static void bubbleSort(int[] nums) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] > nums[i]) {
                    swap(nums, i - 1, i);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

