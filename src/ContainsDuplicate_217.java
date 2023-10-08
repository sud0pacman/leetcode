package leetcode_problems;

import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<Integer>();

        for (int num : nums) {
            if (hset.contains(num)) {
                return true;
            }
            hset.add(num);
        }

        return false;
    }
}
