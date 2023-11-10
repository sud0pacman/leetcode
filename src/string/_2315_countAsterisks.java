package string;

import java.util.Arrays;

public class _2315_countAsterisks {
    public static void main(String[] args) {
        String s = "|**|*|*|**||***||";
        System.out.println(Arrays.toString(s.split("\\|")));

        System.out.println(countAsterisks(s));
    }

    public static int countAsterisks(String s) {
        char[] ar = s.toCharArray();
        int count = 0;
        int open = 0;

        for (char c : ar) {
            if (c == '|') ++open;

            if (open % 2 == 0 && c == '*') ++count;
        }

        return count;
    }
    // | |    | |    | |
}
