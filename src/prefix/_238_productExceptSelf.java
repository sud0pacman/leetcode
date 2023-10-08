package leetcode_problems.prefix;

import java.util.Arrays;

public class _238_productExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int prod = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = prod;
            prod *= nums[i];
        }

        prod = 1;

        for (int i = nums.length-1; i >= 0; i--) {
            res[i] = res[i] * prod;
            prod *= nums[i];
        }

        return res;
    }
}
