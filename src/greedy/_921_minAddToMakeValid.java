package greedy;

import java.util.Stack;

public class _921_minAddToMakeValid {
    public static void main(String[] args) {
        String s = "()))((";
        System.out.println(isValid(s.toCharArray()));
    }

//    public static int minAddToMakeValid(String s) {
//    }

    public static int isValid(char[] ar) {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == '(') {
                count++;
            }

            if (ar[i] == ')') {
                count--;
            }

            if (count < 0) {
                ++sum;
                count = 0;
            }
        }

        if (count > 0) sum += count;

        return sum;
    }
}
