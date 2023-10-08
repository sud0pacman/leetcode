package leetcode_problems.hash_table;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1647_minDeletions {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aaabbbcc";

//        System.out.println(minDeletions(s1));
        System.out.println(minDeletions(s2));
    }

    public static int minDeletions(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c-'a']++;
        }
        int del = 0;
        Set<Integer> used = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            int ch = freq[i];

            while (ch > 0) {
                if (!used.contains(ch)) {
                    used.add(ch);
                    break;
                }
                --ch;
                ++del;
            }
        }

        return del;
    }
}
