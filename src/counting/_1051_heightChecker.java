package counting;

public class _1051_heightChecker {
    public static void main(String[] args) {
        int[] heights = {5, 1, 2, 3, 4};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int[] dp = new int[101];

        for (int i : heights) {
            ++dp[i];
        }

        int count = 0, index = 0;
        for (int i = 0; i < 101; i++) {
            while (dp[i] > 0) {
                if (heights[index] != i) ++count;
                ++index;
                --dp[i];
            }
        }

        return count;
    }
}
