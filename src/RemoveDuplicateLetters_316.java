package leetcode_problems;

import java.util.HashSet;

public class RemoveDuplicateLetters_316 {
    public static void main(String[] args) {
        String s = "bcabc";

        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) set.add(c);

        s = "";
        StringBuilder sb = new StringBuilder(s);

        for (Character c : set) sb.append(c);

        return sb.toString();
    }
}
