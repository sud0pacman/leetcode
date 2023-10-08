package leetcode_problems;

public class _485_FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, maxSum = 0;
        for(int n : nums) {
            sum += n;
            sum *= n;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
