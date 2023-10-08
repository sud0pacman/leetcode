package leetcode_problems.array;

import java.util.Arrays;

public class _1365_smallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] buck = new int[101];

        for (int i = 0; i < nums.length; i++) {
            buck[nums[i]] += 1;
        }

        for (int j = 1; j < 101; j++) {
            buck[j] += buck[j - 1];
        }

        for (int k = 0; k < nums.length; k++) {
            int pos = nums[k];
            nums[k] = buck[pos - 1];
        }

        return nums;
    }
}
