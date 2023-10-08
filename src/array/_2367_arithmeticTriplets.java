package leetcode_problems.array;

import java.util.HashSet;
import java.util.Set;

public class _2367_arithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;

        System.out.println(arithmeticTriplets(nums, diff));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        boolean[] hashMap = new boolean[201];
        int n = nums.length;
        int ans = 0;
        int prev1, prev2;

        for (int e : nums)
            hashMap[e] = true;

        for (int i = 2; i < n; i++) {
            prev1 = nums[i] - diff;
            prev2 = nums[i] - diff - diff;
            if (prev1 >= 0 && hashMap[prev1] && prev2 >= 0 && hashMap[nums[i] - diff - diff])
                ans++;
        }

        return ans;
    }
}
