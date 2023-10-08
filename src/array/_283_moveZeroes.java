package leetcode_problems.array;

import java.util.Arrays;

public class _283_moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
            }
        }

        while (k < nums.length) nums[k++] = 0;

        System.out.println(Arrays.toString(nums));
    }
}
