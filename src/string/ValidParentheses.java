package leetcode_problems.string;

public class ValidParentheses {

    public static void main(String[] args) {
//        System.out.println(isValid("()"));
//        System.out.println(isValid("(){}[]"));
//        System.out.println(isValid("}{)("));
//        System.out.println(isValid("(]"));
//        System.out.println(isValid(""));
//        System.out.println(isValid("({})[][][[[]]](((())))"));
        System.out.println(isValid("()({[]})[]"));
    }

    public static boolean isValid(String s) {
        if (s.isEmpty() || s.length() % 2 != 0) {
            return false;
        }
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.append(ch);
            }
            else {
                if (stack.length() > 0 && isCloseable(stack.charAt(stack.length() - 1), ch)) {
                    stack = new StringBuilder(stack.substring(0, stack.length() - 1));
                } else {
                    return false;
                }
            }
        }


        return stack.length() == 0;
    }

    static boolean isCloseable(char left, char right) {
        return left == '(' && right == ')' || left == '{' && right == '}' || left == '[' && right == ']';
    }
}
