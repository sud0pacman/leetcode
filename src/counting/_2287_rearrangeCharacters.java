package counting;

import java.util.Arrays;

public class _2287_rearrangeCharacters {
    public static void main(String[] args) {
        String s = "ilovecodingonleetcode", target = "code";

        System.out.println(rearrangeCharacters(s, target));
    }

    public static int rearrangeCharacters(String s, String target) {
        int[] dp = new int[123];

        for (int i = 0; i < s.length(); ++i) {
            ++dp[s.charAt(i)];
        }

        int[] standard = new int[123];

        for (int i = 0; i < target.length(); ++i) {
            ++standard[target.charAt(i)];
        }

        int ans = s.length();

        for (char c : target.toCharArray()) {
            ans = Math.min(ans, standard[c] / dp[c]);
        }

        return ans;
    }
}