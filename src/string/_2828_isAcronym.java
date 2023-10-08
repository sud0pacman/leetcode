package leetcode_problems.string;

import java.util.List;

public class _2828_isAcronym {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder g = new StringBuilder();
        boolean k = false;
        for (String word : words) {
            char ch = word.charAt(0);
            g.append(ch);
        }

        return g.toString().equals(s);
    }
}
