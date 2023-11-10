package array;

public class _318_maxProduct {
    public static void main(String[] args) {

    }

    public static int maxProduct(String[] words) {
        int len = words.length;
        int max = 0;
        for (int i = 0; i < len; ++i) {
            char[] alp = words[i].toCharArray();
            int[] dp = new int[123];

            for (char c : alp) {
                ++dp[c];
            }

            for (int j = i+1; j < len; ++j) {
                boolean isHave = false;
                int[] temp = new int[123];
                for (char c : words[j].toCharArray()) {
                    ++temp[c];
                }

                for (int k = 97; k < 123; k++) {
                    if (dp[k] != temp[k]) {
                        k = 123;
                        isHave = true;
                    }
                }

                if (!isHave) {
                    max = Math.max(max, dp.length * words[j].length());
                }
            }
        }

        return max;
    }
}