package leetcode_problems.hash_table;

import java.util.*;

public class _2248_intersection {
    public static void main(String[] args) {
        int[][] nums = {
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6},
        };

        System.out.println(intersection(nums));
    }

    public static List<Integer> intersection(int[][] nums) {
//        HashMap<Integer, Integer> hs = new HashMap<>();
//
//        for (int[] num : nums) {
//            for (int i : num) {
//                hs.put(i, hs.getOrDefault(i, 0) + 1);
//            }
//        }
//
//        List<Integer> ls = new ArrayList<>();
//        hs.forEach((key, value) -> {
//            if (value == nums.length) ls.add(key);
//        });
//        Collections.sort(ls);
//        return ls;
        int m = nums.length;
        List<Integer> res = new ArrayList<>();
        int[] count = new int[1001];
        for (int[] num : nums) {
            for (int i : num) {
                count[i]++;
            }
        }

        for (int x = 0; x < count.length; x++) {
            if (count[x] == m)
                res.add(x);
        }
        return res;
    }
}
