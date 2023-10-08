package leetcode_problems.sorting;

public class _747_dominantIndex {
    public static void main(String[] args) {
        int[] test1 = {3,6,1,0};
        System.out.println(dominantIndex(test1));
    }

    public static int dominantIndex(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;
        int index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                index = i;
            }
            else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        return max1 / 2 >= max2 ? index : -1;
    }
}
