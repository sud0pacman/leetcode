package leetcode_problems.stack;

import java.util.Arrays;
import java.util.Stack;

public class _456_find132pattern {
    public static void main(String[] args) {
        int[] ns = {3,1,4,2};
        System.out.println(find132pattern(ns));
    }

    public static boolean find132pattern(int[] nums) {
        if (nums.length < 3) return false;
        int min = Integer.MIN_VALUE;
        int peak = nums.length;
        for (int i = nums.length - 1; i > -1; i--) {
            if (nums[i] < min) return true;
            while (peak < nums.length && nums[i] > nums[peak]) {
                min = nums[peak++];
            }
            peak--;
            nums[peak] = nums[i];
        }
        return false;
    }
}
