package leetcode_problems.prefix;

public class _2270_waysToSplitArray {
    public static void main(String[] args) {
        int[] nums = {10, 4, -8, 7};
        System.out.println(waysToSplitArray(nums));
    }

    public static int waysToSplitArray(int[] nums) {
        int count = 0, len = nums.length;

        int suffixSum = 0;
        for (int i = 0; i < len-1; i++) {
            suffixSum += nums[i];
        }

        int prefixSum = 0;

        len = len-1;
        for (int i = 0; i < len; i++) {
            prefixSum += nums[i];
            suffixSum -= nums[i];

            if (prefixSum >= suffixSum) {
                ++count;
            }
        }

        return count;
    }
}
