package leetcode_problems.stack;

import java.util.Stack;

public class _2390_removeStars {
    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        char[] chs = s.toCharArray();

        for (char c : chs) {
            if (c == '*') st.pop();
            else st.push(c);
        }

        if (st.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : st) {
            sb.append(c);
        }

        return sb.toString();
    }
}
