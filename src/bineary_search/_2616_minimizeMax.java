package leetcode_problems.bineary_search;

public class _2616_minimizeMax {
    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 7, 1, 3};
        int p = 2;
        System.out.println(findMinimum(nums, p));
    }

    static int findMinimum(int[] arr, int p) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int sub;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sub = Math.abs(arr[left] - arr[i]);

            if (max <= sub && sub < p && i != left) max = sub;
        }

        return max;
    }
}
