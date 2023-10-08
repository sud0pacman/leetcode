package leetcode_problems;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int n = 3;
        int[] nums1 = {1,2,6,0,0,0};

        int m = 3;
        int[] nums2 = {2,5,6};

        merge(nums1,m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int c = i+j + 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[c--] = nums1[i--];
            }
            else {
                nums1[c--] = nums2[j--];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}
