package leetcode_problems.string;

import java.util.Arrays;

public class _1078_findOccurrences {
    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";

        System.out.println(Arrays.toString(findOcurrences(text, first, second)));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < words.length; i++) {
            if (words[i-1].equals(first) && words[i].equals(second)) {
                if (i < words.length-1) sb.append(words[i + 1]).append(" ");
            }
        }

        return sb.length() != 0 ? sb.toString().split(" ") : new String[]{};
    }
}
