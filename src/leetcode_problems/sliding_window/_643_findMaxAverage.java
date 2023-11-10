package leetcode_problems.sliding_window;

public class _643_findMaxAverage {
    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        for (int i = k; i < nums.length; ++i) {
            sum += nums[i];
            sum -= nums[i - k];
            max = Math.max(sum, max);
        }

        return max;
    }
}
