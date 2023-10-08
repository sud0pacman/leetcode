package leetcode_problems;

import java.util.Objects;

public class _2744_MaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};

        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        StringBuilder sb;

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                sb = new StringBuilder(words[j]);
                if (Objects.equals(words[i], sb.toString())) ++count;
            }
        }

        return count;
    }
}