package leetcode_problems.string;

import java.util.*;

public class _1796_secondHighest {
    public static void main(String[] args) {
        String s = "vwkxfq9791769";

        System.out.println(secondHighest(s));
    }

    public static int secondHighest(String s) {
        boolean[] freq = new boolean[10];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' < 10) {
                freq[s.charAt(i) - '0'] = true;
            }
        }

        System.out.println(Arrays.toString(freq));

        int max = -1;

        for (int i = 9; i >= 0; i--) {
            if (freq[i] && max == -1) {
                max = i;
            } else if (freq[i]) {
                return i;
            }
        }

        return -1;
    }
}