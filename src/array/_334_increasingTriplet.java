package leetcode_problems.array;

public class _334_increasingTriplet {
    public static void main(String[] args) {
    }

    public static boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max1) max1 = nums[i];
            else if (nums[i] < max2) max2 = nums[i];
            else return true;
        }

        return false;
    }
}
