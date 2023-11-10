package counting;

import java.util.Arrays;

public class _2161_pivotArray {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;

        System.out.println(Arrays.toString(pivotArray(nums, pivot)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] dp = new int[200_001];

        for (int num : nums) {
            ++dp[num+100_000];
        }

        int index = 0;

        for (int i = 0; i < 200_001 && index < nums.length; i++) {
            while (dp[i] > 0) {
                nums[index] = i-100_000;
                --dp[i];
                ++index;
            }
        }

        return nums;
    }
}