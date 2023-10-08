package leetcode_problems;

import java.util.Scanner;

public class CountLetter_1684 {
    public static void main(String[] args) {
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        String allowed = "ab";

        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int c;

        for (String s : words) {
            c = 0;
            for (int i : s.toCharArray()) {
                if (allowed.indexOf(i) != -1) {
                    ++c;
                }
            }

            if (c == s.length()) ++count;
        }

        return count;
    }
}
