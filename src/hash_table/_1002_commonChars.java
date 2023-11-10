package hash_table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class _1002_commonChars {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        int[] last = count(words[0]);

        for (int i = 1; i < words.length; i++) {
            last = intersection(last, count(words[i]));
        }

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < 26; ++i) {
            if (last[i] == 0) continue;

            while (last[i] > 0) {
                arr.add(String.valueOf((char)(i+'a')));
                --last[i];
            }
        }

        return arr;
    }

    static int[] intersection(int[] a, int[] b) {
        int[] t = new int[26];
        for (int i = 0; i < 26; i++) {
            t[i] = Math.min(a[i], b[i]);
        }

        return t;
    }

    static int[] count(String str) {
        int[] t = new int[26];
        for (char c : str.toCharArray()) t[c - 'a']++;
        return t;
    }
}