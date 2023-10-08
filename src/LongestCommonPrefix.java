package leetcode_problems;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i = 0;
        String first = strs[0];
        String last = strs[strs.length-1];

        while (i < first.length() && i < last.length()) {
            if (first.charAt(i) == last.charAt(i)) ++i;
            else  break;;
        }

        return first.substring(0, i);
    }
}
