package greedy;

public class _2144_minimumCost {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(minimumCost(arr));
    }

    public static int minimumCost(int[] cost) {
        int[] dp = new int[101];

        for (int i : cost) {
            ++dp[i];
        }

        int[] sortedArr = new int[cost.length];
        int j = 0;

        for (int i = 0; i < dp.length; i++) {
            while (dp[i] > 0) {
                sortedArr[j++] = i;
                --dp[i];
            }
        }

        int sum = 0;
        for (int i = sortedArr.length - 1; i >= 0; i--) {
            if (i % 3 != 0) {
                sum += sortedArr[i];
            }
        }

        return sum;
    }
}