package leetcode_problems.array;

import java.util.Arrays;

public class _2670_distinctDifferenceArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int[] p= new int[51];
        int[] s = new int[51];
        int cP = 1;
        int cS = 0;
        p[nums[0]]++;
        for (int i = 1; i < nums.length; i++) {
            s[nums[i]]++;
            if (s[nums[i]] == 1) {
                cS++;
            }
        }

        nums[0] = cP - cS;
        for (int i = 1; i < nums.length; i++) {
            p[nums[i]]++;
            if (p[nums[i]] == 1) {
                cP++;
            }
            if (s[nums[i]] == 1) {
                cS--;
            } else {
                s[nums[i]]--;
            }
            nums[i] = cP - cS;
        }

        return nums;
    }
}