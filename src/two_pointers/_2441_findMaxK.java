package two_pointers;

import java.util.HashMap;
import java.util.Map;

public class _2441_findMaxK {
    public static void main(String[] args) {
        int[] nums = {-1,2,-3,3};
        System.out.println(findMaxK(nums));
    }

    public static int findMaxK(int[] nums) {
        int[] dp = new int[2001];

        for (int a : nums) {
            ++dp[a+1000];
        }


        for (int i = 2000; i > 1000; --i) {
            if (dp[i] > 0 && dp[2000-i] > 0) return i-1000;
        }

        return -1;
    }
}
