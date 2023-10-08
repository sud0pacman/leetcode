package leetcode_problems.greedy;

import java.util.Arrays;

public class _1827_minOperations {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {
        int ans = 0, prev = 0;
        for (int i : nums) {
            if (i <= prev) ans += ++prev - i;
            else prev = i;
        }
        return ans;
    }
}
