package leetcode_problems.bineary_search;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[]digits = new int[1001];

        for(int i = 0; i < nums1.length; i++) {
            digits[nums1[i]]++;
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int j = 0; j < nums2.length; j++) {
            if(digits[nums2[j]] != 0) hs.add(nums2[j]);
        }

        int index = 0;
        int[] ans = new int[hs.size()];

        for (int num : hs) {
            ans[index++] = num;
        }

        return ans;
    }
}
