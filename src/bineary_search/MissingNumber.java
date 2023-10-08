package leetcode_problems.bineary_search;

public class MissingNumber {
    public static void main(String[] args) {
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i = 1; i <= nums.length; i++) sum += i;

        for(int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }

        return sum;
    }
}
