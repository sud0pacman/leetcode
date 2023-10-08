package leetcode_problems.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _151_reverseWords {
    public static void main(String[] args) {
        String test1 = "the sky is blue";
        String test3 = "a good   example";

        System.out.println(reverseWords(test1));
        System.out.println(reverseWords(test3));
    }

    public static String reverseWords(String s) {
        char[] a = s.toCharArray();
        char[] res = new char[a.length];
        int i = a.length - 1, j, k, r = 0;

        while (i >= 0 && a[i] == ' ') i--;

        while (i >= 0) {
            j = i; // end word

            while (i >= 0 && a[i] != ' ') i--; // find end
            if (r > 0) res[r++] = ' ';  // add ' ' to res[]

            for (k = i + 1; k <= j; k++) res[r++] = a[k];  // reverse word and copy

            while (i >= 0 && a[i] == ' ') i--; // clear excess space
        }
        return new String(res, 0, r);
    }

    public static String[] split(String input, char delimiter) {
        List<String> substrings = new ArrayList<>();
        int startIndex = 0;
        int delimiterIndex = input.indexOf(delimiter, startIndex);

        while (delimiterIndex != -1) {
            substrings.add(input.substring(startIndex, delimiterIndex));
            startIndex = delimiterIndex + 1;

            delimiterIndex = input.indexOf(delimiter, startIndex);

        }

        substrings.add(input.substring(startIndex));

        return substrings.toArray(new String[0]);
    }
}
