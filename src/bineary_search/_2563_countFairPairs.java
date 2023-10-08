package leetcode_problems.bineary_search;

import java.util.Arrays;

public class _2563_countFairPairs {
    public static void main(String[] args) {
        int[] nums = {-5,-7,-5,-7,-5};
        int lower = -12;
        int upper = -12;

        System.out.println(countFairPairs(nums, lower, upper));
    }

    public static long countFairPairs(int[] nums, int lower, int upper) {
        long count = 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length-1; i++) {
            int sum = nums[i] + nums[i+1];
            for (int j = i+1; j < nums.length; j++) {
                System.out.print(sum + " ");
                if (sum >= lower && sum <= upper) ++count;
                sum = nums[i] + nums[j];
            }
            System.out.println();
        }

        return count;
    }
}
