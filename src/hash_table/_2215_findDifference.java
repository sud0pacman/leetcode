package leetcode_problems.hash_table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _2215_findDifference {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int j : nums1) {
            s1.add(j);
        }

        for (int j : nums2) {
            s2.add(j);
        }

        List<Integer> list1 = new ArrayList<>();

        for (int i : s1) {
            if (!s2.contains(i)) {
                list1.add(i);
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i : s2) {
            if (!s1.contains(i)) {
                list2.add(i);
            }
        }

        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}
