package leetcode_problems.hash_table;

import java.util.*;

public class _2422_equalFrequency {
    public static void main(String[] args) {
        String s1 = "abcc";
        String s2 = "cccaa";
        System.out.println(equalFrequency(s2));
    }

    public static boolean equalFrequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for (char ch : word.toCharArray()) {
            map.merge(ch, 1, Integer::sum);
            set.add(ch);
        }

        for (char ch : set) {
            Map<Character, Integer> copyMap = new HashMap<>(map);
            copyMap.merge(ch, -1, Integer::sum);

            if (copyMap.get(ch) == 0) {
                copyMap.remove(ch);
            }

            Set<Integer> freq = new HashSet<>(copyMap.values());
            if (freq.size() == 1) {
                return true;
            }
        }
        return false;
    }
}
