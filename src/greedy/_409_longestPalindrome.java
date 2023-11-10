package greedy;

import java.util.Arrays;

public class _409_longestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int[] dp = new int[123];

        for (char c : s.toCharArray()) {
            dp[c]++;
        }

        int odd = 0;
        for (int i = 65; i < 123; i++) {
            odd += dp[i]%2;
        }

        return odd > 1 ? s.length()-odd+1 : s.length();
    }
}
