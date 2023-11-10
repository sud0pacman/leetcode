package counting;

import java.util.Arrays;

public class _1122_relativeSortArray {
    public static void main(String[] args) {
        int[] nums1 = {5, 4, 3, 2, 1, 10, 9, 8, 7, 6};
        int[] nums2 = {10, 9, 8, 7, 6};

        System.out.println(Arrays.toString(relativeSortArray(nums1, nums2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // rahmat tohir aka
        int[] freq = new int[1001];

        for (int i : arr1) ++freq[i];

        int[] ans = new int[arr1.length];
        int index = -1;

        for (int i : arr2) {
            while (freq[i] > 0) {
                ans[++index] = i;
                --freq[i];
            }
        }

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                ans[++index] = i;
                --freq[i];
            }
        }


        return ans;
    }
}
