package greedy;

import java.util.ArrayList;
import java.util.List;

public class _1403_minSubsequence {
    public static void main(String[] args) {

    }

    public static List<Integer> minSubsequence(int[] nums) {
        byte[] dp = new byte[101];
        int sum = 0;
        for (int e : nums) {
            dp[e]++;
            sum += e;
        }
        
        List<Integer> res = new ArrayList<>();
        int curr = 0;

        for (int i = 100; i > 0 && curr <= sum; i--) {
            while (dp[i] > 0 && curr <= sum) {
                curr += i;
                sum -= i;
                res.add(i);

                -- dp[i];
            }
        }

        return res;
    }
}