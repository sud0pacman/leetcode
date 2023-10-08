package leetcode_problems;

import java.util.Arrays;

public class _500_KeyboardRow {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};

        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        StringBuilder sb = new StringBuilder();
        String[] kyb = {"qwertyuiop", "asdfghjkl"};
        String s;
        int c1, c2, c3, i;

        for (String word : words) {
            c1 = 0;
            c2 = 0;
            c3 = 0;
            i = 0;
            s = word.toLowerCase();

            while (i < s.length()) {
                if (kyb[0].contains(s.charAt(i) + "")) ++c1;
                else if (kyb[1].contains(s.charAt(i) + "")) ++c2;
                else ++c3;
                ++i;
            }

            if (c1 == s.length() || c2 == s.length() || c3 == s.length()) sb.append(word).append(" ");
        }

        if (sb.length() == 0) return new String[0];

        return sb.toString().split(" ");
    }

    public static boolean checkWord(String s) {
        String l1 = "qwertyuiop";
        String l2 = "asdfghjkl";
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (l1.contains(String.valueOf(s.charAt(i)))) ++c1;
            else if (l2.contains(String.valueOf(s.charAt(i)))) ++c2;
            else ++c3;
        }

        return c1 == s.length() || c2 == s.length() || c3 == s.length();
    }
}
