package counting;

import java.util.Arrays;

public class _1464_maxProduct {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int[] dp = new int[1001];

        for(int a : nums) {
            ++dp[a];
        }

        int i = 0;
        int[] maxs = new int[2];

        for(int j = 1000; j > -1; --j) {
            while(dp[j] > 0 && i < 2) {
                maxs[i++] = j;
                --dp[j];
            }
        }

        //System.out.println(Arrays.toString(maxs));

        --maxs[0];
        --maxs[1];

        return maxs[0] * maxs[1];
    }
}
