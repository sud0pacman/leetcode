package leetcode_problems;

import java.util.Arrays;
import java.util.HashSet;

public class SortSentence_1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] resWords = new String[words.length];
        int i;
        for (String word : words) {
            i = word.charAt(word.length()-1) - '0';
            resWords[i-1] = word.substring(0, word.length()-1);
        }

        return String.join(" ", resWords);
    }
}
