package counting;

import java.util.Arrays;

public class _1370_sortString {
    public static void main(String[] args) {
        String s = "rat";
        System.out.println(sortString(s));
    }

    public static String sortString(String s) {
        int[] dp = new int[26];

        for (char c : s.toCharArray()) {
            ++dp[c-'a'];
        }

        char[] alpha = new char[26];
        char ch = 'a';
        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = ch++;
        }

        StringBuilder sb = new StringBuilder();
        int len = s.length();

        while (sb.length() < len) {
            for (int i = 0; i < 26; i++) {
                if (dp[i] > 0) {
                    sb.append(alpha[i]);
                    --dp[i];
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (dp[i] > 0) {
                    sb.append(alpha[i]);
                    --dp[i];
                }
            }
        }


        return sb.toString();
    }
}
