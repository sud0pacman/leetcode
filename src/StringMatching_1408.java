package leetcode_problems;

import java.util.*;

public class StringMatching_1408 {
    public static void main(String[] args) {
        String[] words = {"leetcoder", "leetcode", "od", "hamlet", "am"};
        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        String word;
        int i = 0, j, l = words.length;

        while (i < l) {
            word = words[i];
            for (j = 0; j < l; j++) {
                if (i != j && words[j].contains(word)) {
                    set.add(word);
                }
            }

            ++i;
        }
        return new ArrayList<>(set);
    }
}
