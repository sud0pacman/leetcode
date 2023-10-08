package leetcode_problems.bineary_search;

import java.util.Arrays;

public class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] totArr = new int[n];

        int i=0, j=0, k=0;

        while (i<=n1 && j<=n2) {
            if (i == n1) {
                while(j<n2) totArr[k++] = nums2[j++];
                break;
            } else if (j == n2) {
                while (i<n1) totArr[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                totArr[k++] = nums1[i++];
            } else {
                totArr[k++] = nums2[j++];
            }
        }

        System.out.println(Arrays.toString(totArr));

        if(totArr.length % 2 != 0) return totArr[totArr.length/2];
        else {
            int l = totArr.length/2-1;
            int r = totArr.length/2;

            return (double) (totArr[l] + totArr[r]) / 2;
        }
    }
}
