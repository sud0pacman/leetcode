package leetcode_problems.prefix;

public class _724_pivotIndex {
    public static void main(String[] args) {
    }

    public static int pivotIndex(int nums[]) {
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

















