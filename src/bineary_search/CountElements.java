package leetcode_problems.bineary_search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CountElements {
    public static void main(String[] args) {
        int[] nums = {11, 7, 2, 15};
        System.out.println(countElement(nums));
    }

    public static int countElement(int[] nums) {
        int[] minMax = minMax(nums);
        int min = minMax[0];
        int max = minMax[1];
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != min && nums[i] != max) ++c;
        }

        return c;
    }

    public static int[] minMax(int[] nums) {
        int min = nums[0], max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        return new int[]{min, max};
    }
}