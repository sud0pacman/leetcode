package leetcode_problems.two_pointers;

import java.util.HashMap;
import java.util.Map;

public class _1679_maxOperations {
    public static void main(String[] args) {
        int[] nums = {2,2,2,3,1,1,4,1};
        int k = 4;

        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        divide(nums, 0, nums.length - 1);
        if (k < nums[0]) return 0;
        int n = nums.length;

        int i = 0, j = n-1;

        while (nums[j] > k) {
            j--;
        }

        int count = 0;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                count++;
                i++;
                j--;
            } else if (nums[i] + nums[j] > k) {
                j--;
            } else {
                i++;
            }
        }
        return count;
    }
    public static void divide(int[] arr, int left, int right) {
        if (left == right) return;

        int middle = (left + right) / 2;

        divide(arr, left, middle);
        divide(arr, middle + 1, right);

        merge(arr, left, middle, right);
    }

    static strictfp void merge(int[] arr, int left, int middle, int right) {
        int[] temp = new int[right - left + 1];

        int aPos = left;
        int bPos = middle + 1;
        int pos = 0;

        while (aPos <= middle && bPos <= right) {
            if (arr[aPos] < arr[bPos]) {
                temp[pos++] = arr[aPos++];
            } else {
                temp[pos++] = arr[bPos++];
            }
        }

        while (aPos <= middle) {
            temp[pos++] = arr[aPos++];
        }

        while (bPos <= right) {
            temp[pos++] = arr[bPos++];
        }

        for (int i = left; i <=right; ++ i) {
            arr[i] = temp[i-left];
        }
    }
}
