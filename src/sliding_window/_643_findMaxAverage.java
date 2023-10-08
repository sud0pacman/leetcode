package leetcode_problems.sliding_window;

public class _643_findMaxAverage {
    public static void main(String[] args) {
        int[] nums = {4, 0, 4, 3, 3};
        int k = 5;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int total = 0, ans;
        for (int j = 0; j < k; j++) {
            total = total + nums[j];
        }
        ans = total;
        if (nums.length > 1) {
            int n = k;

            while (n < nums.length) {
                total = total - nums[n-k] + nums[n];

                if (total > ans) ans = total;

                ++n;
            }
        }

        return (double) ans/k;
    }
}
