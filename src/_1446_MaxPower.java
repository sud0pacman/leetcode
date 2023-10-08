package leetcode_problems;

public class _1446_MaxPower {
    public static void main(String[] args) {
    }

    public static int maxPower(String s) {
        int max = 1, count = 1;
        char[] ls = s.toCharArray(); // letters

        for (int i = 1; i < ls.length; i++) {
            if (ls[i] == ls[i-1]) ++count;
            else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        return Math.max(max, count);
    }
}
