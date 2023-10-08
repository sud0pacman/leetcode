package leetcode_problems;

import java.util.Arrays;

public class TargetArray_1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < index.length; i++) {
            if (index[i] < i) {
                for (int j = index.length-1; j > index[i]; j--) {
                    arr[j] = arr[j-1];
                }
            }
            arr[index[i]] = nums[i];
        }

        return arr;
    }
}

















