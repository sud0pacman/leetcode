package array;

import java.util.ArrayList;
import java.util.List;

public class _1324_printVertically {
    public static void main(String[] args) {
        String s = "TO BE OR NOT TO BE";

        System.out.println(printVertically(s));
    }

    public static List<String> printVertically(String s) {
        List<String> list = new ArrayList<>();
        String[] words = s.split(" ");
        int len = maxLen(words);

        for (int i = 0; i <= len; i++) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                if (i >= word.length()) sb.append(" ");
                else sb.append(word.charAt(i));
            }
            list.add(rightTrim(sb));
        }

        return list;
    }

    public static int maxLen(String[] words) {
        int maximum = 0;
        for (String s : words) maximum = Math.max(maximum, s.length());
        return maximum;
    }

    public static String rightTrim(StringBuilder word) {
        int i = word.length() - 1;

        while (i >= 0 && word.charAt(i) == ' ') i--;

        return word.substring(0, i + 1);
    }
}
