package leetcode_problems;

import java.util.Arrays;

public class _1920_Build_Array {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + nums.length * (nums[nums[i]] % nums.length);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / nums.length;
        }

        return nums;
    }
}