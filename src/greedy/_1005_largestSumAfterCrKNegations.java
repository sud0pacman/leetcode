package greedy;

import java.util.Arrays;

public class _1005_largestSumAfterCrKNegations {
    public static void main(String[] args) {
        int[] nums = {-5, -4, -1, -10};
        System.out.println(largestSumAfteCrKNegations(nums, 7));
    }

    public static int largestSumAfteCrKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;

        for(; i < nums.length && nums[i] < 0 && 0 < k; ++i, --k) {
            nums[i] = -nums[i];
        }

        if(i == nums.length) {
            k %= 2;
            if(k > 0) {
                nums[i-1] = -nums[i-1];
            }
        }

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}