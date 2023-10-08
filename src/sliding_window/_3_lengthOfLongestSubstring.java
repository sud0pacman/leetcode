package leetcode_problems.sliding_window;

import java.util.HashSet;
import java.util.Set;

public class _3_lengthOfLongestSubstring {
    public static void main(String[] args) {
        String t1 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(t1));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int max = 0;
        Set<Character> hs = new HashSet<>();

        while (right < s.length()) {
            if (!hs.contains(s.charAt(right))) {
                hs.add(s.charAt(right));
                ++right;
                max = Math.max(hs.size(), max);
            }
            else {
                hs.remove(s.charAt(left));
                ++left;
            }
        }

        return max;
    }
}
