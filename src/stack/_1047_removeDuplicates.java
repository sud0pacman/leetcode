package leetcode_problems.stack;

import java.util.Stack;

public class _1047_removeDuplicates {
    public static void main(String[] args) {
        String s = "azxxzy";

        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stk.size() != 0 && stk.peek() == s.charAt(i)) {
                stk.pop();
            } else {
                stk.push(s.charAt(i));
            }
        }
        StringBuilder SB = new StringBuilder();
        for (char c : stk) {
            SB.append(c);
        }

        return SB.toString();
    }
}
