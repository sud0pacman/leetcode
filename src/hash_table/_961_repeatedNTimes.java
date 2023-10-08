package leetcode_problems.hash_table;

import java.util.HashMap;

public class _961_repeatedNTimes {
    public static void main(String[] args) {

    }

    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i))
                return i;
            map.put(i, 1);
        }
        return -1;
    }
}
