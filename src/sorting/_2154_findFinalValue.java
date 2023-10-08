package leetcode_problems.sorting;

import java.util.Arrays;

public class _2154_findFinalValue {
    public static void main(String[] args) {
        int[] test1 = {161, 28, 640, 264, 81, 561, 320, 2, 61, 244, 183, 108, 773, 61, 976, 122, 988, 2, 370, 392, 488, 375, 349, 432, 713, 563};
        int target = 61;

        System.out.println(findFinalValue(test1, target));
    }

    public static int findFinalValue(int[] nums, int original) {
        while (true) {
            if (find(nums, original))
                original = original * 2;
            else
                return original;
        }
    }

    static boolean find(int[] arr, int original) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == original) {
                return true;
            }
        }

        return false;
    }
}