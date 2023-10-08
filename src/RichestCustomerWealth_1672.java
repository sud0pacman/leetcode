package leetcode_problems;

public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
    }

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }

            if (sum > max) max = sum;
        }

        return max;
    }
}
