package sliding_window;

import java.util.Arrays;

public class _239_maxSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == k) return nums;
        int[] res = new int[nums.length-k + 1];
        int index = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < k; ++i) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        res[index] = sum;
        System.out.print(res[index] + " ");

        for(int i = index; i < nums.length-k; ++i) {
            System.out.print(Math.max(nums[i], nums[i+k]) + " ");
        }

        return res;
    }
}
