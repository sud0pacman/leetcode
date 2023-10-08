package leetcode_problems;

import java.util.Arrays;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        boolean isHave;
        int i, j, len = nums.length;
        for (i = 0; i < len; i++) {
            isHave = false;
            for (j = 0; j < len; j++) {
                if (nums[i] == nums[j] && i != j) {
                    isHave = true;
                    break;
                }
            }

            if (!isHave) return nums[i];
        }

        return 0;
    }
}