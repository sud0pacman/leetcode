package leetcode_problems.bineary_search;

public class _2450_getCommon {
    public static void main(String[] args) {

    }

    public int getCommon(int[] nums1, int[] nums2) {
        if (nums1[nums2.length-1] < nums1[0])
            return -1;

        int l = 0, r = 0;

        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] == nums2[r])
                return nums1[l];
            else if (nums1[l] > nums2[r])
                r+=1;
            else
                l+=1;
        }

        return -1;
    }
}
