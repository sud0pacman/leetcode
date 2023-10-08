package leetcode_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromPairs_336 {
    public static void main(String[] args) {
        String[] words = {"abcd","dcba","lls","s","sssll"};
        System.out.println(palindromePairs(words));
    }

    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> indices = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j != i && isPalindrome(words[i], words[j])) {
                    System.out.println(i + " " + j);
                }
            }
        }

        return indices;
    }

    public static boolean isPalindrome(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1+s2);

        return sb.reverse().toString().equals(s1 + s2);
    }
}
