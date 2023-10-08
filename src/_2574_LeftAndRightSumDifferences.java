package leetcode_problems;

import java.util.Arrays;

public class _2574_LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }

    public static int[] leftRightDifference(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        int sum = 0;

        for (int i = 0; i < ans.length; i++) {
            ans[i] = sum;
            sum += nums[i];
        }

        sum = 0;

        for (int i = l - 1; i >= 0; i--) {
            System.out.println(ans[i] + " " + sum);
            ans[i] = Math.abs(ans[i] - sum);
            sum += nums[i];
        }

        return ans;
    }
}





































