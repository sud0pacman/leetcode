package leetcode_problems.sliding_window;

public class _209_minSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        System.out.println(minSubArrayLen(target, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        // finder pointers
        int l = 0, r = 0;
        // min & sum
        int min = Integer.MAX_VALUE, sum = 0;
        int n = nums.length;

        while (r < n) {
            sum += nums[r];

            while (target <= sum) {
                min = Math.min(min, r-l + 1);
                sum -= nums[l];
                ++l;
            }
            ++r;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}