package leetcode_problems.manipulation;

public class _338_countBits {
    public static void main(String[] args) {
    }

    public static int[] countBits(int n) {
        if (n == 0) {
            return new int[1];
        }
        if (n == 1) {
            return new int[]{0, 1};
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                dp[i] = dp[i / 2];
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }
        return dp;
    }
}
