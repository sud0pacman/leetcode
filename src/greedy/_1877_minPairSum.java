package greedy;

import java.util.HashSet;

public class _1877_minPairSum {
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(partitionString(s));
    }

    public static int partitionString(String s) {
        char[] ss = s.toCharArray();
        boolean[] hs = new boolean[123];

        int count = 0;

        for (char c : ss) {
            if (hs[c]) {
                hs = new boolean[123];
                ++count;
            }
            hs[c] = true;
        }

        return count+1;
    }
}