package leetcode_problems.array;

import java.util.Arrays;

public class _215_findKthLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        System.out.println(findKthLargest(nums, k));
    }
    public static int findKthLargest(int[] nums, int k) {
        int max = 0, min = Integer.MAX_VALUE;

        for(int num : nums) {
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }

        int[] count = new int[max + 1 - min];

        for(int num : nums) {
            count[num - min]++;
        }

        System.out.println(Arrays.toString(count));
        for(int i = count.length - 1; i >= 0; i--) {
            k -= count[i];
            if(k <= 0)
                return i + min;
        }

        return -1;
    }
}
