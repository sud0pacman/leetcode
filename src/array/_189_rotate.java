package array;

import java.util.Arrays;

public class _189_rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        if (k == 0 || nums.length == k) return;
        k = k % nums.length;
        reverser(nums, 0, nums.length-1);
        reverser(nums, k, nums.length-1);
        reverser(nums, 0, k-1);
    }
    
    public static void  reverser(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            ++l;
            --r;
        }
    }
}
