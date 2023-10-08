package leetcode_problems.string;

import java.util.List;

public class _1773_countMatches {
    public static void main(String[] args) {
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int column = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2);

        for (List<String> row : items) {
            if (row.get(column).equals(ruleValue)) {
                ++count;
            }
        }

        return count;
    }
}
