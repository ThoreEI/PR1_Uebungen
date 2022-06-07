import java.util.Arrays;

public class Revert {
    public static void main (String[] args) {

        int[] nums = {31, 5, 31, 432, 31, 30, 31, 31, 42, 31, 30, 3131311};
        int[] revert = new int[nums.length];

        for (int i = 0, j = nums.length-1; i < nums.length; i++, j--)
            revert[i] = nums[j];

        System.out.println(Arrays.toString(revert));
    }

}
