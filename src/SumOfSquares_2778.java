package leetcode_problems;

public class SumOfSquares_2778 {
    public static void main(String[] args) {
    }

    public static int sumOfSquares(int[] nums) {
        int sum = 0, n = nums.length, i = 0;
        if (n == 1) return nums[0]*nums[0];

        while (i < n) {
            if (n % (i+1) == 0) sum += Math.pow(nums[i], 2);
            ++i;
        }

        return sum;
    }
}
