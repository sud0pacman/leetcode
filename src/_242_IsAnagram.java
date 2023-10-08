package leetcode_problems;

import java.util.Arrays;

public class _242_IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] chars = new int[123];
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        for (char c : sc) {
            chars[c]++;
        }

        for (char c : tc) {
            chars[c]--;
        }


        for (int i = 65; i < chars.length; i++) {
            if (chars[i] != 0) return false;
        }

        return true;
    }
}