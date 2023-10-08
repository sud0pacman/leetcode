package leetcode_problems.bineary_search;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        int target = 2;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        Arrays.fill(arr, -1);

        if (nums.length == 1 && nums[0] == target) {
            Arrays.fill(arr, 0);
            return arr;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                arr[1] = i;
                break;
            }
        }

        return arr;
    }
}
