package array;

import java.util.Arrays;

public class _283_moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        // 1 0 0 3 12
        // 1 0 3 12 0
        // 1 3 12 0 0

    }

    public static void moveZeroes(int[] nums) {
        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] != 0) {
                int tmp = nums[right];
                nums[right] = nums[left];
                nums[left] = tmp;
                left++;
            }
        }
    }
}