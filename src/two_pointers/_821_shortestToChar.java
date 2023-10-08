package leetcode_problems.two_pointers;

import java.util.Arrays;

public class _821_shortestToChar {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';

        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }

    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];

        int next = moveForward(s, c, 0);
        int previous = next;


        for (int i = 0; i < s.length(); i++) {
            if (i > next) {
                previous = next;
                next = moveForward(s,c,next+1);
            }

            res[i] = Math.abs(Math.min(next-i, i-previous));
        }

        return res;
    }

    static int moveForward(String s, char c, int pos) {
        while (pos < s.length()) {
            if (s.charAt(pos) == c) {
                break;
            }
            ++pos;
        }

        if (pos == s.length()) {
            return Integer.MAX_VALUE;
        }

        return pos;
    }
}
