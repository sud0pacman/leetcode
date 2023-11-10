package stack;

import java.util.Stack;

public class _844_backspaceCompare {
    public static void main(String[] args) {

    }

    public static boolean backspaceCompare(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < ss.length; i++) {
            if (ss[i] == '#') {
                if (sb1.length() == 0) sb1.deleteCharAt(i);
            } else {
                sb1.append(ss[i]);
            }
        }

        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < ss.length; i++) {
            if (tt[i] == '#') {
                if (sb2.length() == 0) sb2.deleteCharAt(i);
            } else {
                sb2.append(ss[i]);
            }
        }

        if (sb1.length() != sb2.length()) return false;

        int len = sb1.length();

        for (int i = 0; i < len; ++i) {
            if (sb1.charAt(i) != sb2.charAt(i)) return false;
        }

        return true;
    }
}
